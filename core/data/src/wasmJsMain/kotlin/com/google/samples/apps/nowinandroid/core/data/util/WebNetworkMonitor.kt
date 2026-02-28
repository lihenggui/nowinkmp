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

package com.google.samples.apps.nowinandroid.core.data.util

import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.flow.distinctUntilChanged

private fun isNavigatorOnline(): Boolean =
    js("navigator.onLine")

private fun addWindowEventListener(event: String, callback: () -> Unit): JsAny =
    js("window.addEventListener(event, callback)")

private fun removeWindowEventListener(event: String, callback: () -> Unit): JsAny =
    js("window.removeEventListener(event, callback)")

/**
 * Network monitor for WASM/Web that uses the browser\'s online/offline events
 * and navigator.onLine property to detect connectivity.
 */
internal class WebNetworkMonitor : NetworkMonitor {
    override val isOnline: Flow<Boolean> = callbackFlow {
        trySend(isNavigatorOnline())

        val onlineHandler: () -> Unit = { trySend(true) }
        val offlineHandler: () -> Unit = { trySend(false) }

        addWindowEventListener("online", onlineHandler)
        addWindowEventListener("offline", offlineHandler)

        awaitClose {
            removeWindowEventListener("online", onlineHandler)
            removeWindowEventListener("offline", offlineHandler)
        }
    }.distinctUntilChanged()
}
