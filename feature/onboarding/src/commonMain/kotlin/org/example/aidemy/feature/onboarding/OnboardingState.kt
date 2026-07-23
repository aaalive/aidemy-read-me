package org.example.aidemy.feature.onboarding

/**
 * Immutable UI state for the onboarding flow. The ViewModel is the single owner/mutator;
 * the Composable screen only ever reads from it and dispatches events back up.
 */
data class OnboardingUiState(
    val name: String = "",
    val ageGroup: String = "",
    val learningGoal: String = "",
    val experienceLevel: String = "",
    val nameError: String? = null,
    val isSaving: Boolean = false,
    val isComplete: Boolean = false,
)

val AgeGroups = listOf("Under 13", "13–17", "18–24", "25–34", "35+")
val ExperienceLevels = listOf("Beginner", "Intermediate", "Advanced")
val LearningGoals = listOf("Career switch", "Upskill for work", "Hobby / curiosity", "Academic study")
