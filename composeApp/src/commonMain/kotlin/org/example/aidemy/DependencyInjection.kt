package org.example.aidemy

import org.example.aidemy.core.database.databaseModule
import org.example.aidemy.feature.onboarding.onboardingModule
import org.koin.core.context.startKoin
import org.koin.core.module.Module
import org.koin.dsl.KoinAppDeclaration

/**
 * Starts Koin with all shared modules plus a platform module (which must supply
 * `DatabaseDriverFactory`). Call this once from each platform's app entry point:
 *  - Android: in a custom Application class
 *  - iOS: from MainViewController.kt before ComposeUIViewController is created
 */
fun initKoin(platformModule: Module, appDeclaration: KoinAppDeclaration = {}) {
    startKoin {
        appDeclaration()
        modules(platformModule, databaseModule, onboardingModule)
    }
}
