/*
 * Copyright 2023 The Android Open Source Project
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

package com.google.samples.apps.nowinandroid.core.rules

import android.Manifest.permission.POST_NOTIFICATIONS
import android.content.pm.PackageManager.PERMISSION_GRANTED
import android.os.ParcelFileDescriptor
import android.os.Build.VERSION.SDK_INT
import android.os.Build.VERSION_CODES.TIRAMISU
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.runner.Description
import org.junit.runners.model.Statement
import org.junit.rules.TestRule

/**
 * [TestRule] granting [POST_NOTIFICATIONS] permission if running on [SDK_INT] greater than [TIRAMISU].
 */
class GrantPostNotificationsPermissionRule : TestRule {
    override fun apply(base: Statement, description: Description): Statement = object : Statement() {
        override fun evaluate() {
            maybeGrantPostNotifications()
            base.evaluate()
        }
    }

    private fun maybeGrantPostNotifications() {
        if (SDK_INT < TIRAMISU) return

        val instrumentation = runCatching {
            InstrumentationRegistry.getInstrumentation()
        }.getOrNull() ?: return

        val context = instrumentation.targetContext
        if (context.checkSelfPermission(POST_NOTIFICATIONS) == PERMISSION_GRANTED) return

        runCatching {
            instrumentation.uiAutomation.executeShellCommand(
                "pm grant ${context.packageName} $POST_NOTIFICATIONS",
            ).use { shellResult ->
                // Read command output to wait for completion before test startup.
                ParcelFileDescriptor.AutoCloseInputStream(shellResult)
                    .bufferedReader()
                    .use { it.readText() }
            }
        }
    }
}
