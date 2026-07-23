package org.example.aidemy.core.database

import app.cash.sqldelight.db.SqlDriver

/**
 * Platform-specific SQLite driver creation. Implemented per-target so this module
 * has zero Android/iOS framework leakage in commonMain.
 */
expect class DatabaseDriverFactory {
    fun createDriver(): SqlDriver
}
