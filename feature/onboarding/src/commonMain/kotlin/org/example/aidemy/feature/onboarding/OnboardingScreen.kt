package org.example.aidemy.feature.onboarding

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.FilterChip
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.example.aidemy.core.designsystem.components.AidemyCard
import org.example.aidemy.core.designsystem.components.AidemyPrimaryButton
import org.example.aidemy.core.designsystem.components.AidemyTextField
import org.koin.compose.viewmodel.koinViewModel

/**
 * Entry point Composable for the onboarding feature. Collects state from
 * [OnboardingViewModel] and renders the profile-creation form.
 *
 * @param onOnboardingComplete invoked once the profile has been persisted, so the host
 * app (composeApp) can navigate to the next destination without this module knowing about it.
 */
@Composable
fun OnboardingScreen(
    onOnboardingComplete: () -> Unit,
    viewModel: OnboardingViewModel = koinViewModel(),
) {
    val state by viewModel.uiState.collectAsState()

    if (state.isComplete) {
        onOnboardingComplete()
        return
    }

    Scaffold { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(24.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp),
        ) {
            Text("Let's set up your profile", style = androidx.compose.material3.MaterialTheme.typography.headlineMedium)
            Text(
                "This helps Aidemy tailor lessons and pacing to you.",
                style = androidx.compose.material3.MaterialTheme.typography.bodyMedium,
            )

            AidemyCard {
                Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
                    AidemyTextField(
                        value = state.name,
                        onValueChange = viewModel::onNameChanged,
                        label = "Your name",
                        isError = state.nameError != null,
                        supportingText = state.nameError,
                    )

                    LabeledChipRow(
                        label = "Age group",
                        options = AgeGroups,
                        selected = state.ageGroup,
                        onSelected = viewModel::onAgeGroupSelected,
                    )

                    LabeledChipRow(
                        label = "Learning goal",
                        options = LearningGoals,
                        selected = state.learningGoal,
                        onSelected = viewModel::onLearningGoalSelected,
                    )

                    LabeledChipRow(
                        label = "Experience level",
                        options = ExperienceLevels,
                        selected = state.experienceLevel,
                        onSelected = viewModel::onExperienceLevelSelected,
                    )
                }
            }

            Spacer(modifier = Modifier.height(4.dp))

            if (state.isSaving) {
                CircularProgressIndicator()
            } else {
                AidemyPrimaryButton(
                    text = "Start learning",
                    onClick = viewModel::submit,
                )
            }
        }
    }
}

@Composable
private fun LabeledChipRow(
    label: String,
    options: List<String>,
    selected: String,
    onSelected: (String) -> Unit,
) {
    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        Text(label, style = androidx.compose.material3.MaterialTheme.typography.labelLarge)
        LazyRow(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            items(options) { option ->
                FilterChip(
                    selected = option == selected,
                    onClick = { onSelected(option) },
                    label = { Text(option) },
                )
            }
        }
    }
}
