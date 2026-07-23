package org.example.aidemy.core.database

import app.cash.sqldelight.coroutines.asFlow
import app.cash.sqldelight.coroutines.mapToList
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.withContext
import org.example.aidemy.core.database.domain.LearnerProfile

/**
 * Public contract for persisting and reading learner profiles.
 * Feature modules (e.g. :feature:onboarding) depend on this interface, never on
 * SQLDelight types directly, keeping the database module fully swappable.
 */
interface ProfileRepository {
    suspend fun saveProfile(profile: LearnerProfile)
    fun observeProfiles(): Flow<List<LearnerProfile>>
    suspend fun getProfile(id: String): LearnerProfile?
    suspend fun deleteProfile(id: String)
}

class SqlDelightProfileRepository(
    provider: AidemyDatabaseProvider,
    private val ioDispatcher: CoroutineDispatcher = Dispatchers.Default,
) : ProfileRepository {

    private val queries = provider.database.profileQueries

    override suspend fun saveProfile(profile: LearnerProfile) = withContext(ioDispatcher) {
        queries.insertProfile(
            id = profile.id,
            name = profile.name,
            ageGroup = profile.ageGroup,
            learningGoal = profile.learningGoal,
            experienceLevel = profile.experienceLevel,
            createdAtEpochMillis = profile.createdAtEpochMillis,
        )
    }

    override fun observeProfiles(): Flow<List<LearnerProfile>> =
        queries.selectAllProfiles()
            .asFlow()
            .mapToList(ioDispatcher)
            .map { rows ->
                rows.map {
                    LearnerProfile(
                        id = it.id,
                        name = it.name,
                        ageGroup = it.ageGroup,
                        learningGoal = it.learningGoal,
                        experienceLevel = it.experienceLevel,
                        createdAtEpochMillis = it.createdAtEpochMillis,
                    )
                }
            }

    override suspend fun getProfile(id: String): LearnerProfile? = withContext(ioDispatcher) {
        queries.selectProfileById(id).executeAsOneOrNull()?.let {
            LearnerProfile(
                id = it.id,
                name = it.name,
                ageGroup = it.ageGroup,
                learningGoal = it.learningGoal,
                experienceLevel = it.experienceLevel,
                createdAtEpochMillis = it.createdAtEpochMillis,
            )
        }
    }

    override suspend fun deleteProfile(id: String) = withContext(ioDispatcher) {
        queries.deleteProfile(id)
    }
}
