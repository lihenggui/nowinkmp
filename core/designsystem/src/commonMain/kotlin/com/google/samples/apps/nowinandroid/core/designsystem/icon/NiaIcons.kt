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

import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import nowinandroid.core.designsystem.generated.resources.Res
import nowinandroid.core.designsystem.generated.resources.core_designsystem_ic_add
import nowinandroid.core.designsystem.generated.resources.core_designsystem_ic_arrow_back
import nowinandroid.core.designsystem.generated.resources.core_designsystem_ic_bookmark
import nowinandroid.core.designsystem.generated.resources.core_designsystem_ic_bookmark_border
import nowinandroid.core.designsystem.generated.resources.core_designsystem_ic_bookmarks
import nowinandroid.core.designsystem.generated.resources.core_designsystem_ic_bookmarks_border
import nowinandroid.core.designsystem.generated.resources.core_designsystem_ic_check
import nowinandroid.core.designsystem.generated.resources.core_designsystem_ic_close
import nowinandroid.core.designsystem.generated.resources.core_designsystem_ic_grid_3x3
import nowinandroid.core.designsystem.generated.resources.core_designsystem_ic_more_vert
import nowinandroid.core.designsystem.generated.resources.core_designsystem_ic_person
import nowinandroid.core.designsystem.generated.resources.core_designsystem_ic_search
import nowinandroid.core.designsystem.generated.resources.core_designsystem_ic_settings
import nowinandroid.core.designsystem.generated.resources.core_designsystem_ic_short_text
import nowinandroid.core.designsystem.generated.resources.core_designsystem_ic_upcoming
import nowinandroid.core.designsystem.generated.resources.core_designsystem_ic_upcoming_border
import nowinandroid.core.designsystem.generated.resources.core_designsystem_ic_view_day
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.vectorResource

/**
 * Now in Android icons used by shared Compose Multiplatform UI.
 */
object NiaIcons {
    val Add = Res.drawable.core_designsystem_ic_add
    val ArrowBack = Res.drawable.core_designsystem_ic_arrow_back
    val Bookmark = Res.drawable.core_designsystem_ic_bookmark
    val BookmarkBorder = Res.drawable.core_designsystem_ic_bookmark_border
    val Bookmarks = Res.drawable.core_designsystem_ic_bookmarks
    val BookmarksBorder = Res.drawable.core_designsystem_ic_bookmarks_border
    val Check = Res.drawable.core_designsystem_ic_check
    val Close = Res.drawable.core_designsystem_ic_close
    val Grid3x3 = Res.drawable.core_designsystem_ic_grid_3x3
    val MoreVert = Res.drawable.core_designsystem_ic_more_vert
    val Person = Res.drawable.core_designsystem_ic_person
    val Search = Res.drawable.core_designsystem_ic_search
    val Settings = Res.drawable.core_designsystem_ic_settings
    val ShortText = Res.drawable.core_designsystem_ic_short_text
    val Upcoming = Res.drawable.core_designsystem_ic_upcoming
    val UpcomingBorder = Res.drawable.core_designsystem_ic_upcoming_border
    val ViewDay = Res.drawable.core_designsystem_ic_view_day
}

@Composable
fun NiaIcon(
    icon: DrawableResource,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    tint: Color = LocalContentColor.current,
) {
    Icon(
        imageVector = vectorResource(icon),
        contentDescription = contentDescription,
        modifier = modifier,
        tint = tint,
    )
}
