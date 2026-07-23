package org.example.aidemy.core.database.domain

/**
 * Framework-agnostic domain representation of a learner profile.
 * Kept separate from the SQLDelight-generated `Profile` row type so feature
 * modules never depend on generated database code directly.
 */
data class LearnerProfile(
    val id: String,
    val name: String,
    val ageGroup: String,
    val learningGoal: String,
    val experienceLevel: String,
    val createdAtEpochMillis: Long,
)

data class CourseProgress(
    val id: String,
    val profileId: String,
    val courseId: String,
    val completedLessons: Int,
    val totalLessons: Int,
    val lastUpdatedEpochMillis: Long,
)
