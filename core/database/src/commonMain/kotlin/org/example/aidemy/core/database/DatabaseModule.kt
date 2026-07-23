package org.example.aidemy.core.database

import org.koin.dsl.module

/**
 * Koin module exposing the database provider and repository as singletons.
 * `DatabaseDriverFactory` itself is platform-specific and must be provided by each
 * platform's Koin entry point (see composeApp androidMain/iosMain initializers).
 */
val databaseModule = module {
    single { AidemyDatabaseProvider(driverFactory = get()) }
    single<ProfileRepository> { SqlDelightProfileRepository(provider = get()) }
}
