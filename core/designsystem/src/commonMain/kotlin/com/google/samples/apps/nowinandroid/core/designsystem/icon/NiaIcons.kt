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

package com.google.samples.apps.nowinandroid.core.designsystem.icon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

/**
 * Now in Android icons used by shared Compose Multiplatform UI.
 */
object NiaIcons {
    val Add = niaIcon("Add") {
        iconPath {
            moveTo(18.0f, 13.0f)
            horizontalLineToRelative(-5.0f)
            verticalLineToRelative(5.0f)
            curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
            reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
            verticalLineToRelative(-5.0f)
            horizontalLineTo(6.0f)
            curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
            reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
            horizontalLineToRelative(5.0f)
            verticalLineTo(6.0f)
            curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
            reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
            verticalLineToRelative(5.0f)
            horizontalLineToRelative(5.0f)
            curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
            reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
            close()
        }
    }

    val ArrowBack = niaIcon("ArrowBack", autoMirror = true) {
        iconPath {
            moveTo(19.0f, 11.0f)
            horizontalLineTo(7.83f)
            lineToRelative(4.88f, -4.88f)
            curveToRelative(0.39f, -0.39f, 0.39f, -1.03f, 0.0f, -1.42f)
            curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
            lineToRelative(-6.59f, 6.59f)
            curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
            lineToRelative(6.59f, 6.59f)
            curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
            curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
            lineTo(7.83f, 13.0f)
            horizontalLineTo(19.0f)
            curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
            reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
            close()
        }
    }

    val Bookmark = niaIcon("Bookmark") {
        iconPath {
            moveTo(17.0f, 3.0f)
            horizontalLineTo(7.0f)
            curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
            verticalLineToRelative(16.0f)
            lineToRelative(7.0f, -3.0f)
            lineToRelative(7.0f, 3.0f)
            verticalLineTo(5.0f)
            curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
            close()
        }
    }

    val BookmarkBorder = niaIcon("BookmarkBorder") {
        iconPath {
            moveTo(17.0f, 3.0f)
            lineTo(7.0f, 3.0f)
            curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
            verticalLineToRelative(16.0f)
            lineToRelative(7.0f, -3.0f)
            lineToRelative(7.0f, 3.0f)
            lineTo(19.0f, 5.0f)
            curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
            close()
            moveTo(17.0f, 18.0f)
            lineToRelative(-5.0f, -2.18f)
            lineTo(7.0f, 18.0f)
            lineTo(7.0f, 6.0f)
            curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
            horizontalLineToRelative(8.0f)
            curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
            verticalLineToRelative(12.0f)
            close()
        }
    }

    val Bookmarks = niaIcon("Bookmarks") {
        iconPath {
            moveTo(19.0f, 18.0f)
            lineToRelative(2.0f, 1.0f)
            verticalLineTo(3.0f)
            curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
            horizontalLineTo(8.99f)
            curveTo(7.89f, 1.0f, 7.0f, 1.9f, 7.0f, 3.0f)
            horizontalLineToRelative(10.0f)
            curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
            verticalLineToRelative(13.0f)
            close()
            moveTo(15.0f, 5.0f)
            horizontalLineTo(5.0f)
            curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
            verticalLineToRelative(16.0f)
            lineToRelative(7.0f, -3.0f)
            lineToRelative(7.0f, 3.0f)
            verticalLineTo(7.0f)
            curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
            close()
        }
    }

    val BookmarksBorder = niaIcon("BookmarksBorder") {
        iconPath {
            moveTo(15.0f, 7.0f)
            verticalLineToRelative(12.97f)
            lineToRelative(-4.21f, -1.81f)
            lineToRelative(-0.79f, -0.34f)
            lineToRelative(-0.79f, 0.34f)
            lineTo(5.0f, 19.97f)
            lineTo(5.0f, 7.0f)
            horizontalLineToRelative(10.0f)
            moveToRelative(4.0f, -6.0f)
            lineTo(8.99f, 1.0f)
            curveTo(7.89f, 1.0f, 7.0f, 1.9f, 7.0f, 3.0f)
            horizontalLineToRelative(10.0f)
            curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
            verticalLineToRelative(13.0f)
            lineToRelative(2.0f, 1.0f)
            lineTo(21.0f, 3.0f)
            curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
            close()
            moveTo(15.0f, 5.0f)
            lineTo(5.0f, 5.0f)
            curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
            verticalLineToRelative(16.0f)
            lineToRelative(7.0f, -3.0f)
            lineToRelative(7.0f, 3.0f)
            lineTo(17.0f, 7.0f)
            curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
            close()
        }
    }

    val Check = niaIcon("Check") {
        iconPath {
            moveTo(9.0f, 16.17f)
            lineTo(5.53f, 12.7f)
            curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
            curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
            lineToRelative(4.18f, 4.18f)
            curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
            lineTo(20.29f, 7.71f)
            curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
            curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
            lineTo(9.0f, 16.17f)
            close()
        }
    }

    val Close = niaIcon("Close") {
        iconPath {
            moveTo(18.3f, 5.71f)
            curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
            lineTo(12.0f, 10.59f)
            lineTo(7.11f, 5.7f)
            curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
            curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
            lineTo(10.59f, 12.0f)
            lineTo(5.7f, 16.89f)
            curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
            curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
            lineTo(12.0f, 13.41f)
            lineToRelative(4.89f, 4.89f)
            curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
            curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
            lineTo(13.41f, 12.0f)
            lineToRelative(4.89f, -4.89f)
            curveToRelative(0.38f, -0.38f, 0.38f, -1.02f, 0.0f, -1.4f)
            close()
        }
    }

    val Grid3x3 = niaIcon("Grid3x3") {
        iconPath {
            moveTo(20.0f, 9.0f)
            lineTo(20.0f, 9.0f)
            curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
            horizontalLineToRelative(-3.0f)
            verticalLineTo(5.0f)
            curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
            curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
            verticalLineToRelative(3.0f)
            horizontalLineToRelative(-4.0f)
            verticalLineTo(5.0f)
            curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
            curveTo(8.45f, 4.0f, 8.0f, 4.45f, 8.0f, 5.0f)
            verticalLineToRelative(3.0f)
            horizontalLineTo(5.0f)
            curveTo(4.45f, 8.0f, 4.0f, 8.45f, 4.0f, 9.0f)
            curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
            horizontalLineToRelative(3.0f)
            verticalLineToRelative(4.0f)
            horizontalLineTo(5.0f)
            curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
            curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
            horizontalLineToRelative(3.0f)
            verticalLineToRelative(3.0f)
            curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
            curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
            verticalLineToRelative(-3.0f)
            horizontalLineToRelative(4.0f)
            verticalLineToRelative(3.0f)
            curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
            curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
            verticalLineToRelative(-3.0f)
            horizontalLineToRelative(3.0f)
            curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
            curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
            horizontalLineToRelative(-3.0f)
            verticalLineToRelative(-4.0f)
            horizontalLineToRelative(3.0f)
            curveTo(19.55f, 10.0f, 20.0f, 9.55f, 20.0f, 9.0f)
            close()
            moveTo(14.0f, 14.0f)
            horizontalLineToRelative(-4.0f)
            verticalLineToRelative(-4.0f)
            horizontalLineToRelative(4.0f)
            verticalLineTo(14.0f)
            close()
        }
    }

    val MoreVert = niaIcon("MoreVert") {
        iconPath {
            moveTo(12.0f, 8.0f)
            curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
            reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f)
            reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f)
            reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
            close()
            moveTo(12.0f, 10.0f)
            curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
            reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
            reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
            reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f)
            close()
            moveTo(12.0f, 16.0f)
            curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
            reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
            reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
            reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f)
            close()
        }
    }

    val Person = niaIcon("Person") {
        iconPath {
            moveTo(12.0f, 12.0f)
            curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f)
            reflectiveCurveToRelative(-1.79f, -4.0f, -4.0f, -4.0f)
            reflectiveCurveToRelative(-4.0f, 1.79f, -4.0f, 4.0f)
            reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f)
            close()
            moveTo(12.0f, 14.0f)
            curveToRelative(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f)
            verticalLineToRelative(1.0f)
            curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
            horizontalLineToRelative(14.0f)
            curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
            verticalLineToRelative(-1.0f)
            curveToRelative(0.0f, -2.66f, -5.33f, -4.0f, -8.0f, -4.0f)
            close()
        }
    }

    val Search = niaIcon("Search") {
        iconPath {
            moveTo(15.5f, 14.0f)
            horizontalLineToRelative(-0.79f)
            lineToRelative(-0.28f, -0.27f)
            curveToRelative(1.2f, -1.4f, 1.82f, -3.31f, 1.48f, -5.34f)
            curveToRelative(-0.47f, -2.78f, -2.79f, -5.0f, -5.59f, -5.34f)
            curveToRelative(-4.23f, -0.52f, -7.79f, 3.04f, -7.27f, 7.27f)
            curveToRelative(0.34f, 2.8f, 2.56f, 5.12f, 5.34f, 5.59f)
            curveToRelative(2.03f, 0.34f, 3.94f, -0.28f, 5.34f, -1.48f)
            lineToRelative(0.27f, 0.28f)
            verticalLineToRelative(0.79f)
            lineToRelative(4.25f, 4.25f)
            curveToRelative(0.41f, 0.41f, 1.08f, 0.41f, 1.49f, 0.0f)
            curveToRelative(0.41f, -0.41f, 0.41f, -1.08f, 0.0f, -1.49f)
            lineTo(15.5f, 14.0f)
            close()
            moveTo(9.5f, 14.0f)
            curveTo(7.01f, 14.0f, 5.0f, 11.99f, 5.0f, 9.5f)
            reflectiveCurveTo(7.01f, 5.0f, 9.5f, 5.0f)
            reflectiveCurveTo(14.0f, 7.01f, 14.0f, 9.5f)
            reflectiveCurveTo(11.99f, 14.0f, 9.5f, 14.0f)
            close()
        }
    }

    val Settings = niaIcon("Settings") {
        iconPath {
            moveTo(19.5f, 12.0f)
            curveToRelative(0.0f, -0.23f, -0.01f, -0.45f, -0.03f, -0.68f)
            lineToRelative(1.86f, -1.41f)
            curveToRelative(0.4f, -0.3f, 0.51f, -0.86f, 0.26f, -1.3f)
            lineToRelative(-1.87f, -3.23f)
            curveToRelative(-0.25f, -0.44f, -0.79f, -0.62f, -1.25f, -0.42f)
            lineToRelative(-2.15f, 0.91f)
            curveToRelative(-0.37f, -0.26f, -0.76f, -0.49f, -1.17f, -0.68f)
            lineToRelative(-0.29f, -2.31f)
            curveTo(14.8f, 2.38f, 14.37f, 2.0f, 13.87f, 2.0f)
            horizontalLineToRelative(-3.73f)
            curveTo(9.63f, 2.0f, 9.2f, 2.38f, 9.14f, 2.88f)
            lineTo(8.85f, 5.19f)
            curveToRelative(-0.41f, 0.19f, -0.8f, 0.42f, -1.17f, 0.68f)
            lineTo(5.53f, 4.96f)
            curveToRelative(-0.46f, -0.2f, -1.0f, -0.02f, -1.25f, 0.42f)
            lineTo(2.41f, 8.62f)
            curveToRelative(-0.25f, 0.44f, -0.14f, 0.99f, 0.26f, 1.3f)
            lineToRelative(1.86f, 1.41f)
            curveTo(4.51f, 11.55f, 4.5f, 11.77f, 4.5f, 12.0f)
            reflectiveCurveToRelative(0.01f, 0.45f, 0.03f, 0.68f)
            lineToRelative(-1.86f, 1.41f)
            curveToRelative(-0.4f, 0.3f, -0.51f, 0.86f, -0.26f, 1.3f)
            lineToRelative(1.87f, 3.23f)
            curveToRelative(0.25f, 0.44f, 0.79f, 0.62f, 1.25f, 0.42f)
            lineToRelative(2.15f, -0.91f)
            curveToRelative(0.37f, 0.26f, 0.76f, 0.49f, 1.17f, 0.68f)
            lineToRelative(0.29f, 2.31f)
            curveTo(9.2f, 21.62f, 9.63f, 22.0f, 10.13f, 22.0f)
            horizontalLineToRelative(3.73f)
            curveToRelative(0.5f, 0.0f, 0.93f, -0.38f, 0.99f, -0.88f)
            lineToRelative(0.29f, -2.31f)
            curveToRelative(0.41f, -0.19f, 0.8f, -0.42f, 1.17f, -0.68f)
            lineToRelative(2.15f, 0.91f)
            curveToRelative(0.46f, 0.2f, 1.0f, 0.02f, 1.25f, -0.42f)
            lineToRelative(1.87f, -3.23f)
            curveToRelative(0.25f, -0.44f, 0.14f, -0.99f, -0.26f, -1.3f)
            lineToRelative(-1.86f, -1.41f)
            curveTo(19.49f, 12.45f, 19.5f, 12.23f, 19.5f, 12.0f)
            close()
            moveTo(12.04f, 15.5f)
            curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
            reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
            reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
            reflectiveCurveTo(13.97f, 15.5f, 12.04f, 15.5f)
            close()
        }
    }

    val ShortText = niaIcon("ShortText", autoMirror = true) {
        iconPath {
            moveTo(5.0f, 9.0f)
            horizontalLineToRelative(14.0f)
            curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
            reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
            lineTo(5.0f, 11.0f)
            curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
            reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
            close()
            moveTo(5.0f, 13.0f)
            horizontalLineToRelative(8.0f)
            curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
            reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
            lineTo(5.0f, 15.0f)
            curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
            reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
            close()
        }
    }

    val Upcoming = niaIcon("Upcoming") {
        iconPath {
            moveTo(20.45f, 6.55f)
            curveToRelative(-0.38f, -0.38f, -1.01f, -0.38f, -1.39f, 0.0f)
            lineTo(16.89f, 8.7f)
            curveToRelative(-0.39f, 0.38f, -0.39f, 1.01f, 0.0f, 1.39f)
            lineToRelative(0.01f, 0.01f)
            curveToRelative(0.39f, 0.39f, 1.01f, 0.39f, 1.4f, 0.0f)
            curveToRelative(0.62f, -0.63f, 1.52f, -1.54f, 2.15f, -2.17f)
            curveTo(20.83f, 7.55f, 20.83f, 6.93f, 20.45f, 6.55f)
            close()
        }
        iconPath {
            moveTo(12.02f, 3.0f)
            horizontalLineToRelative(-0.03f)
            curveTo(11.44f, 3.0f, 11.0f, 3.44f, 11.0f, 3.98f)
            verticalLineToRelative(3.03f)
            curveTo(11.0f, 7.56f, 11.44f, 8.0f, 11.98f, 8.0f)
            horizontalLineToRelative(0.03f)
            curveTo(12.56f, 8.0f, 13.0f, 7.56f, 13.0f, 7.02f)
            verticalLineTo(3.98f)
            curveTo(13.0f, 3.44f, 12.56f, 3.0f, 12.02f, 3.0f)
            close()
        }
        iconPath {
            moveTo(7.1f, 10.11f)
            lineToRelative(0.01f, -0.01f)
            curveToRelative(0.38f, -0.38f, 0.38f, -1.01f, 0.0f, -1.39f)
            lineTo(4.96f, 6.54f)
            curveToRelative(-0.38f, -0.39f, -1.01f, -0.39f, -1.39f, 0.0f)
            lineTo(3.55f, 6.55f)
            curveToRelative(-0.39f, 0.39f, -0.39f, 1.01f, 0.0f, 1.39f)
            curveToRelative(0.63f, 0.62f, 1.53f, 1.54f, 2.15f, 2.17f)
            curveTo(6.09f, 10.49f, 6.72f, 10.49f, 7.1f, 10.11f)
            close()
        }
        iconPath {
            moveTo(12.0f, 15.0f)
            curveToRelative(-1.24f, 0.0f, -2.31f, -0.75f, -2.76f, -1.83f)
            curveTo(8.92f, 12.43f, 8.14f, 12.0f, 7.34f, 12.0f)
            lineTo(4.0f, 12.0f)
            curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
            lineToRelative(0.0f, 5.0f)
            curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
            horizontalLineToRelative(16.0f)
            curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
            verticalLineToRelative(-5.0f)
            curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
            lineToRelative(-3.34f, 0.0f)
            curveToRelative(-0.8f, 0.0f, -1.58f, 0.43f, -1.9f, 1.17f)
            curveTo(14.31f, 14.25f, 13.24f, 15.0f, 12.0f, 15.0f)
        }
    }

    val UpcomingBorder = niaIcon("UpcomingBorder") {
        iconPath {
            moveTo(17.6f, 10.81f)
            lineTo(16.19f, 9.4f)
            lineToRelative(3.56f, -3.55f)
            lineToRelative(1.41f, 1.41f)
            curveTo(21.05f, 7.29f, 17.6f, 10.81f, 17.6f, 10.81f)
            close()
            moveTo(13.0f, 3.0f)
            horizontalLineToRelative(-2.0f)
            verticalLineToRelative(5.0f)
            horizontalLineToRelative(2.0f)
            verticalLineTo(3.0f)
            close()
            moveTo(6.4f, 10.81f)
            lineTo(7.81f, 9.4f)
            lineTo(4.26f, 5.84f)
            lineTo(2.84f, 7.26f)
            curveTo(2.95f, 7.29f, 6.4f, 10.81f, 6.4f, 10.81f)
            close()
            moveTo(20.0f, 14.0f)
            horizontalLineToRelative(-3.42f)
            curveToRelative(-0.77f, 1.76f, -2.54f, 3.0f, -4.58f, 3.0f)
            reflectiveCurveToRelative(-3.81f, -1.24f, -4.58f, -3.0f)
            horizontalLineTo(4.0f)
            verticalLineToRelative(5.0f)
            horizontalLineToRelative(16.0f)
            verticalLineTo(14.0f)
            moveTo(20.0f, 12.0f)
            curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
            verticalLineToRelative(5.0f)
            curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
            horizontalLineTo(4.0f)
            curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
            verticalLineToRelative(-5.0f)
            curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
            horizontalLineToRelative(5.0f)
            curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f)
            reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f)
            horizontalLineTo(20.0f)
            close()
        }
    }

    val ViewDay = niaIcon("ViewDay") {
        iconPath {
            moveTo(3.0f, 21.0f)
            horizontalLineToRelative(17.0f)
            curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
            verticalLineToRelative(-1.0f)
            curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
            horizontalLineTo(3.0f)
            curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
            verticalLineToRelative(1.0f)
            curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
            close()
            moveTo(20.0f, 8.0f)
            horizontalLineTo(3.0f)
            curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
            verticalLineToRelative(6.0f)
            curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
            horizontalLineToRelative(17.0f)
            curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
            verticalLineTo(9.0f)
            curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
            close()
            moveTo(2.0f, 4.0f)
            verticalLineToRelative(1.0f)
            curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
            horizontalLineToRelative(17.0f)
            curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
            verticalLineTo(4.0f)
            curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
            horizontalLineTo(3.0f)
            curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
            close()
        }
    }
}

private fun niaIcon(
    name: String,
    autoMirror: Boolean = false,
    block: ImageVector.Builder.() -> Unit,
): ImageVector = ImageVector.Builder(
    name = "NiaIcons.$name",
    defaultWidth = 24.dp,
    defaultHeight = 24.dp,
    viewportWidth = 24.0f,
    viewportHeight = 24.0f,
    autoMirror = autoMirror,
).apply(block).build()

private fun ImageVector.Builder.iconPath(
    block: androidx.compose.ui.graphics.vector.PathBuilder.() -> Unit,
) {
    path(fill = SolidColor(Color.Black), pathBuilder = block)
}
