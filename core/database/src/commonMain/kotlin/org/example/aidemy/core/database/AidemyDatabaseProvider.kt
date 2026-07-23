package org.example.aidemy.core.database

/**
 * Lazily builds the single shared AidemyDatabase instance for the app process.
 */
class AidemyDatabaseProvider(driverFactory: DatabaseDriverFactory) {
    val database: AidemyDatabase by lazy {
        AidemyDatabase(driverFactory.createDriver())
    }
}
