package org.example.aidemy.feature.onboarding

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kotlinx.datetime.Clock
import org.example.aidemy.core.database.ProfileRepository
import org.example.aidemy.core.database.domain.LearnerProfile

/**
 * Owns onboarding form state and persists the finished profile through
 * [ProfileRepository], which is injected so this module never touches SQLDelight directly.
 */
class OnboardingViewModel(
    private val profileRepository: ProfileRepository,
) : ViewModel() {

    private val _uiState = MutableStateFlow(OnboardingUiState())
    val uiState: StateFlow<OnboardingUiState> = _uiState.asStateFlow()

    fun onNameChanged(value: String) {
        _uiState.update { it.copy(name = value, nameError = null) }
    }

    fun onAgeGroupSelected(value: String) {
        _uiState.update { it.copy(ageGroup = value) }
    }

    fun onLearningGoalSelected(value: String) {
        _uiState.update { it.copy(learningGoal = value) }
    }

    fun onExperienceLevelSelected(value: String) {
        _uiState.update { it.copy(experienceLevel = value) }
    }

    fun submit() {
        val state = _uiState.value
        if (state.name.isBlank()) {
            _uiState.update { it.copy(nameError = "Please enter your name") }
            return
        }

        _uiState.update { it.copy(isSaving = true) }

        viewModelScope.launch {
            profileRepository.saveProfile(
                LearnerProfile(
                    id = generateId(),
                    name = state.name.trim(),
                    ageGroup = state.ageGroup.ifBlank { AgeGroups.first() },
                    learningGoal = state.learningGoal.ifBlank { LearningGoals.first() },
                    experienceLevel = state.experienceLevel.ifBlank { ExperienceLevels.first() },
                    createdAtEpochMillis = Clock.System.now().toEpochMilliseconds(),
                )
            )
            _uiState.update { it.copy(isSaving = false, isComplete = true) }
        }
    }

    private fun generateId(): String =
        "profile_${Clock.System.now().toEpochMilliseconds()}_${(0..9999).random()}"
}
