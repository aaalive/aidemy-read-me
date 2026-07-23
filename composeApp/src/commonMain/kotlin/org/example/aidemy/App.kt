package org.example.aidemy

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import org.example.aidemy.core.designsystem.AidemyTheme
import org.example.aidemy.feature.onboarding.OnboardingScreen

/**
 * Single Composable root shared by both the Android Activity and the iOS UIViewController.
 * Owns top-level navigation state; kept intentionally simple here (onboarding -> home stub)
 * so a real navigation library can be dropped in later without touching feature modules.
 */
private sealed interface AppDestination {
    data object Onboarding : AppDestination
    data object Home : AppDestination
}

@Composable
fun App() {
    AidemyTheme {
        Surface(modifier = Modifier.fillMaxSize()) {
            var destination by remember { mutableStateOf<AppDestination>(AppDestination.Onboarding) }

            when (destination) {
                is AppDestination.Onboarding -> OnboardingScreen(
                    onOnboardingComplete = { destination = AppDestination.Home },
                )
                is AppDestination.Home -> HomePlaceholder()
            }
        }
    }
}

@Composable
private fun HomePlaceholder() {
    Box(modifier = Modifier.fillMaxSize()) {
        androidx.compose.material3.Text(
            text = "Profile saved. Home screen goes here.",
            modifier = Modifier
        )
    }
}
