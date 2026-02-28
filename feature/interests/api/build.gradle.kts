plugins {
    alias(libs.plugins.nowinandroid.kmp.library)
    alias(libs.plugins.kotlin.serialization)
}

android {
    namespace = "com.google.samples.apps.nowinandroid.feature.interests.api"
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(libs.kotlinx.serialization.core)
            implementation(libs.jetbrains.compose.navigation)
        }
    }
}
