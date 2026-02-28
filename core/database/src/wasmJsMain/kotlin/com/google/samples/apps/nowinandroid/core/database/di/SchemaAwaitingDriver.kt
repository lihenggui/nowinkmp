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

package com.google.samples.apps.nowinandroid.core.database.di

import app.cash.sqldelight.Transacter
import app.cash.sqldelight.db.QueryResult
import app.cash.sqldelight.db.SqlCursor
import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.db.SqlPreparedStatement
import kotlinx.coroutines.CompletableDeferred

/**
 * A [SqlDriver] decorator that ensures the database schema has been fully created
 * before any query, execute, or transaction operation is performed.
 *
 * On WASM, the web-worker driver is inherently asynchronous — schema creation cannot
 * block the thread. This wrapper gates every database operation behind a
 * [CompletableDeferred] that is completed once [SqlSchema.create] finishes.
 *
 * After the schema is ready, [CompletableDeferred.await] returns immediately (zero overhead).
 */
internal class SchemaAwaitingDriver(
    private val delegate: SqlDriver,
    private val schemaReady: CompletableDeferred<Unit>,
) : SqlDriver by delegate {

    override fun <R> executeQuery(
        identifier: Int?,
        sql: String,
        mapper: (SqlCursor) -> QueryResult<R>,
        parameters: Int,
        binders: (SqlPreparedStatement.() -> Unit)?,
    ): QueryResult<R> = QueryResult.AsyncValue {
        schemaReady.await()
        delegate.executeQuery(identifier, sql, mapper, parameters, binders).await()
    }

    override fun execute(
        identifier: Int?,
        sql: String,
        parameters: Int,
        binders: (SqlPreparedStatement.() -> Unit)?,
    ): QueryResult<Long> = QueryResult.AsyncValue {
        schemaReady.await()
        delegate.execute(identifier, sql, parameters, binders).await()
    }

    override fun newTransaction(): QueryResult<Transacter.Transaction> =
        QueryResult.AsyncValue {
            schemaReady.await()
            delegate.newTransaction().await()
        }
}
