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

import com.google.samples.apps.nowinandroid.configureKotlinMultiplatform
import com.google.samples.apps.nowinandroid.configureSpotlessForAndroid
import com.google.samples.apps.nowinandroid.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class KmpLibraryConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            plugins.apply("com.android.kotlin.multiplatform.library")
            plugins.apply("org.jetbrains.kotlin.multiplatform")
            configureKotlinMultiplatform()
            configureSpotlessForAndroid()
            dependencies {
                "commonTestImplementation"(libs.findLibrary("kotlin.test").get())
                "commonTestImplementation"(libs.findLibrary("turbine").get())
                "commonTestImplementation"(libs.findLibrary("kotlinx.coroutines.test").get())
                "coreLibraryDesugaring"(libs.findLibrary("android.desugarJdkLibs").get())
            }
        }
    }
}
