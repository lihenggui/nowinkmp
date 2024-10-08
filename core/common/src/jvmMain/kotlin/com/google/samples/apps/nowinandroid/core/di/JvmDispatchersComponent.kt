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

package com.google.samples.apps.nowinandroid.core.di

import com.google.samples.apps.nowinandroid.core.di.NiaDispatchers.DEFAULT
import com.google.samples.apps.nowinandroid.core.di.NiaDispatchers.IO
import com.google.samples.apps.nowinandroid.core.di.NiaDispatchers.MAIN
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import me.tatarka.inject.annotations.Component
import me.tatarka.inject.annotations.Provides

@Component
abstract class JvmDispatchersComponent : DispatchersComponent() {
    @Provides
    override fun providesIODispatcher():
        @Dispatcher(IO)
        CoroutineDispatcher = Dispatchers.IO

    @Provides
    override fun providesDefaultDispatcher():
        @Dispatcher(DEFAULT)
        CoroutineDispatcher = Dispatchers.Default

    @Provides
    override fun providesMainDispatcher():
        @Dispatcher(MAIN)
        CoroutineDispatcher = Dispatchers.Main
}
