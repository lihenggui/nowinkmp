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
import java.awt.SystemTray
import java.awt.TrayIcon

private const val MAX_NUM_NOTIFICATIONS = 5

/**
 * Implementation of [Notifier] that displays notifications via the desktop system tray.
 */
internal class DesktopNotifier : Notifier {

    private val trayIcon: TrayIcon? by lazy {
        if (!SystemTray.isSupported()) return@lazy null
        val icon = TrayIcon(
            java.awt.Toolkit.getDefaultToolkit().createImage(ByteArray(0)),
            "Now in Android",
        )
        icon.isImageAutoSize = true
        SystemTray.getSystemTray().add(icon)
        icon
    }

    override fun postNewsNotifications(newsResources: List<NewsResource>) {
        val icon = trayIcon ?: return
        newsResources.take(MAX_NUM_NOTIFICATIONS).forEach { newsResource ->
            icon.displayMessage(
                newsResource.title,
                newsResource.content,
                TrayIcon.MessageType.INFO,
            )
        }
    }
}
