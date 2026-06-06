/*
 * Copyright 2022 The Android Open Source Project
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
import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    alias(libs.plugins.nowinandroid.cmp.application)
    alias(libs.plugins.nowinandroid.di.koin)
    alias(libs.plugins.roborazzi)
    alias(libs.plugins.kotlin.serialization)
}

kotlin {
    android {
        namespace = "com.google.samples.apps.nowinandroid.app"
    }

    sourceSets {
        commonMain.dependencies {
            implementation(projects.shared)
            implementation(libs.jetbrains.compose.runtime)
            implementation(libs.jetbrains.compose.foundation)
            implementation(libs.jetbrains.compose.material)
            implementation(libs.jetbrains.compose.material3)
            implementation(libs.jetbrains.compose.material3.adaptiveNavigationSuite)
            implementation(libs.jetbrains.compose.ui)
            implementation(libs.jetbrains.compose.components.resources)
            implementation(libs.jetbrains.compose.uiToolingPreview)
            implementation(libs.coil.core)
            implementation(libs.coil.compose)
            implementation(libs.kotlinx.serialization.json)
            implementation(libs.jetbrains.compose.material3.adaptive.navigation)
        }

        androidMain.dependencies {
            implementation(libs.androidx.navigation.compose)
        }

        commonTest.dependencies {
            implementation(projects.core.dataTest)
            implementation(projects.core.testing)
//            implementation(projects.sync.syncTest)
            implementation(libs.kotlin.test)
        }

        jvmMain.dependencies {
            implementation(compose.desktop.currentOs)
            implementation(libs.kotlinx.coroutines.swing)
            implementation(libs.logback.classic)
        }

        jvmTest.dependencies {
            implementation(libs.roborazzi.compose.desktop)
            implementation(libs.jetbrains.compose.ui.test.junit4)
            implementation(projects.core.screenshotTesting)
        }
    }
}

compose.desktop {
    application {
        mainClass = "com.google.sample.apps.nowinandroid.MainKt"

        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "com.google.sample.apps.nowinandroid"
            packageVersion = "1.0.0"
        }
    }
}
