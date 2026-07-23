package org.example.aidemy.feature.onboarding

import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

/**
 * Koin module for the onboarding feature. The host app includes this alongside
 * the :core:database module's DI module when starting Koin.
 */
val onboardingModule = module {
    viewModel { OnboardingViewModel(profileRepository = get()) }
}
