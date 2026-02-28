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

package com.google.samples.apps.nowinandroid.core.notifications

import com.google.samples.apps.nowinandroid.core.model.data.NewsResource
import platform.UserNotifications.UNAuthorizationStatusAuthorized
import platform.UserNotifications.UNMutableNotificationContent
import platform.UserNotifications.UNNotificationRequest
import platform.UserNotifications.UNUserNotificationCenter

private const val MAX_NUM_NOTIFICATIONS = 5

/**
 * Implementation of [Notifier] that displays notifications using Apple's UserNotifications framework.
 * Works on both iOS and macOS.
 */
internal class NativeNotifier : Notifier {

    override fun postNewsNotifications(newsResources: List<NewsResource>) {
        val center = UNUserNotificationCenter.currentNotificationCenter()
        center.getNotificationSettingsWithCompletionHandler { settings ->
            if (settings?.authorizationStatus != UNAuthorizationStatusAuthorized) return@getNotificationSettingsWithCompletionHandler
            newsResources.take(MAX_NUM_NOTIFICATIONS).forEach { newsResource ->
                val content = UNMutableNotificationContent().apply {
                    setTitle(newsResource.title)
                    setBody(newsResource.content)
                }
                val request = UNNotificationRequest.requestWithIdentifier(
                    identifier = newsResource.id,
                    content = content,
                    trigger = null,
                )
                center.addNotificationRequest(request, withCompletionHandler = null)
            }
        }
    }
}
