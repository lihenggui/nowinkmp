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

plugins {
    alias(libs.plugins.nowinandroid.cmp.feature)
}

kotlin {
    android {
        namespace = "com.google.samples.apps.nowinandroid.shared"
    }
    sourceSets {
        commonMain.dependencies {
            api(projects.feature.interests.impl)
            api(projects.feature.interests.api)
            api(projects.feature.foryou.impl)
            api(projects.feature.foryou.api)
            api(projects.feature.bookmarks.impl)
            api(projects.feature.bookmarks.api)
            api(projects.feature.topic.impl)
            api(projects.feature.topic.api)
            api(projects.feature.search.impl)
            api(projects.feature.search.api)
            api(projects.feature.settings.impl)
            api(projects.core.common)
            api(projects.core.ui)
            api(projects.core.designsystem)
            api(projects.core.data)
            api(projects.core.domain)
            api(projects.core.model)
            api(projects.core.analytics)
            api(projects.core.notifications)
            api(projects.sync.work)
            api(libs.jetbrains.compose.components.resources)
        }
        commonTest.dependencies {
            implementation(projects.core.testing)
        }
    }
}

compose.resources {
    publicResClass = true
    generateResClass = always
}
