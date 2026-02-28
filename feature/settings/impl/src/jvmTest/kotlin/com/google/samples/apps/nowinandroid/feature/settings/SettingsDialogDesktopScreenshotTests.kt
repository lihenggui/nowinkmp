/*
 * Copyright 2026 The Android Open Source Project
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

package com.google.samples.apps.nowinandroid.feature.settings

import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.LocalInspectionMode
import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.isRoot
import androidx.compose.ui.test.runDesktopComposeUiTest
import com.google.samples.apps.nowinandroid.core.designsystem.theme.NiaTheme
import com.google.samples.apps.nowinandroid.core.model.data.DarkThemeConfig
import com.google.samples.apps.nowinandroid.core.model.data.ThemeBrand
import com.google.samples.apps.nowinandroid.core.testing.util.DefaultDesktopTestSizes
import com.google.samples.apps.nowinandroid.core.testing.util.DefaultRoborazziOptions
import io.github.takahirom.roborazzi.captureRoboImage
import org.junit.Test

/**
 * JVM Desktop screenshot tests for the [SettingsDialog].
 *
 * SettingsDialog uses AlertDialog which creates multiple root nodes in the compose tree.
 * Therefore we capture the dialog root node directly instead of using [captureMultiSize].
 */
class SettingsDialogDesktopScreenshotTests {

    @OptIn(ExperimentalTestApi::class)
    @Test
    fun settingsDialog() {
        DefaultDesktopTestSizes.entries.forEach { size ->
            runDesktopComposeUiTest(width = size.width, height = size.height) {
                mainClock.autoAdvance = false
                setContent {
                    CompositionLocalProvider(LocalInspectionMode provides true) {
                        NiaTheme {
                            SettingsDialog(
                                settingsUiState = SettingsUiState.Success(
                                    settings = UserEditableSettings(
                                        brand = ThemeBrand.DEFAULT,
                                        useDynamicColor = false,
                                        darkThemeConfig = DarkThemeConfig.FOLLOW_SYSTEM,
                                    ),
                                ),
                                supportDynamicColor = false,
                                onDismiss = {},
                                onChangeThemeBrand = {},
                                onChangeDynamicColorPreference = {},
                                onChangeDarkThemeConfig = {},
                            )
                        }
                    }
                }
                // AlertDialog creates 2 root nodes; capture the dialog root (index 1)
                onAllNodes(isRoot())[1].captureRoboImage(
                    filePath = "src/jvmTest/screenshots/SettingsDialog_${size.description}.png",
                    roborazziOptions = DefaultRoborazziOptions,
                )
            }
        }
    }
}
