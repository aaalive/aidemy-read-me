package org.example.aidemy.core.designsystem

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColors = lightColorScheme(
    primary = AidemyColors.Primary,
    onPrimary = AidemyColors.OnPrimary,
    secondary = AidemyColors.Secondary,
    onSecondary = AidemyColors.OnSecondary,
    background = AidemyColors.Background,
    onBackground = AidemyColors.OnBackground,
    surface = AidemyColors.Surface,
    onSurface = AidemyColors.OnSurface,
    error = AidemyColors.Error,
    outline = AidemyColors.Outline,
)

private val DarkColors = darkColorScheme(
    primary = AidemyColors.Primary,
    onPrimary = AidemyColors.OnPrimary,
    secondary = AidemyColors.Secondary,
    onSecondary = AidemyColors.OnSecondary,
    error = AidemyColors.Error,
)

/**
 * Root theme wrapper. Every screen in every feature module should be nested inside this.
 */
@Composable
fun AidemyTheme(
    useDarkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    MaterialTheme(
        colorScheme = if (useDarkTheme) DarkColors else LightColors,
        typography = AidemyTypography,
        content = content,
    )
}
