/*
 * Copyright 2024 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.samples.apps.nowinandroid.sync.workers

import co.touchlab.kermit.Logger
import com.google.samples.apps.nowinandroid.core.analytics.AnalyticsHelper
import com.google.samples.apps.nowinandroid.core.data.Synchronizer
import com.google.samples.apps.nowinandroid.core.data.repository.NewsRepository
import com.google.samples.apps.nowinandroid.core.data.repository.SearchContentsRepository
import com.google.samples.apps.nowinandroid.core.data.repository.TopicsRepository
import com.google.samples.apps.nowinandroid.core.data.util.SyncManager
import com.google.samples.apps.nowinandroid.core.datastore.ChangeListVersions
import com.google.samples.apps.nowinandroid.core.datastore.NiaPreferencesDataSource
import com.google.samples.apps.nowinandroid.sync.status.SyncSubscriber
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.withContext

/**
 * Coroutine-based [SyncManager] for non-Android platforms (JVM Desktop, iOS, macOS).
 *
 * Replicates [SyncWorker] logic using coroutines instead of WorkManager.
 * Uses [Mutex.tryLock] to prevent concurrent syncs, mirroring WorkManager's
 * [ExistingWorkPolicy.KEEP] behavior.
 */
internal class CoroutineSyncManager(
    private val niaPreferences: NiaPreferencesDataSource,
    private val topicRepository: TopicsRepository,
    private val newsRepository: NewsRepository,
    private val searchContentsRepository: SearchContentsRepository,
    private val ioDispatcher: CoroutineDispatcher,
    private val analyticsHelper: AnalyticsHelper,
    private val syncSubscriber: SyncSubscriber,
    private val scope: CoroutineScope,
) : SyncManager {

    private val mutex = Mutex()
    private val _isSyncing = MutableStateFlow(false)

    override val isSyncing: Flow<Boolean> = _isSyncing

    override fun requestSync() {
        // tryLock prevents concurrent syncs (mirrors WorkManager's KEEP policy)
        if (!mutex.tryLock()) {
            Logger.d { "Sync already in progress, skipping" }
            return
        }

        scope.launch {
            try {
                _isSyncing.value = true
                doSync()
            } finally {
                _isSyncing.value = false
                mutex.unlock()
            }
        }
    }

    private suspend fun doSync() = withContext(ioDispatcher) {
        analyticsHelper.logSyncStarted()

        syncSubscriber.subscribe()

        val synchronizer = object : Synchronizer {
            override suspend fun getChangeListVersions(): ChangeListVersions =
                niaPreferences.getChangeListVersions()

            override suspend fun updateChangeListVersions(
                update: ChangeListVersions.() -> ChangeListVersions,
            ) = niaPreferences.updateChangeListVersion(update)
        }

        // Sync repositories in parallel (same as SyncWorker)
        val syncedSuccessfully = awaitAll(
            async { topicRepository.syncWith(synchronizer) },
            async { newsRepository.syncWith(synchronizer) },
        ).all { it }

        analyticsHelper.logSyncFinished(syncedSuccessfully)

        if (syncedSuccessfully) {
            searchContentsRepository.populateFtsData()
        }

        Logger.d { "Sync finished, success=$syncedSuccessfully" }
    }
}
