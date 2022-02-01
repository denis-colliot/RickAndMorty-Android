package dev.rickandmorty.design

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun RickAndMortyTheme(
    isDarkThemeEnabled: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colors = when (isDarkThemeEnabled) {
            true -> ThemeColors.DarkThemeColors
            else -> ThemeColors.LightThemeColors
        },
        typography = ThemeTypography,
        shapes = MaterialTheme.shapes,
        content = content
    )
}