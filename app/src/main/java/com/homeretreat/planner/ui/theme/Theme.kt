package com.homeretreat.planner.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

private val LightColorScheme = lightColorScheme(
    primary = SageGreen,
    onPrimary = Cream,
    primaryContainer = SageGreenLight,
    onPrimaryContainer = Charcoal,
    secondary = WarmOchre,
    onSecondary = Charcoal,
    secondaryContainer = WarmOchreLight,
    onSecondaryContainer = Charcoal,
    tertiary = DeepMaroon,
    onTertiary = Cream,
    tertiaryContainer = DeepMaroonLight,
    onTertiaryContainer = Cream,
    error = SoftBrown,
    onError = Cream,
    background = Cream,
    onBackground = Charcoal,
    surface = Cream,
    onSurface = Charcoal,
    surfaceVariant = LightWarmGray,
    onSurfaceVariant = WarmGray,
    outline = WarmGray,
    inverseOnSurface = Cream,
    inverseSurface = Charcoal,
    inversePrimary = SageGreenLight
)

private val DarkColorScheme = darkColorScheme(
    primary = SageGreenLight,
    onPrimary = Charcoal,
    primaryContainer = SageGreenDark,
    onPrimaryContainer = Cream,
    secondary = WarmOchreLight,
    onSecondary = Charcoal,
    secondaryContainer = WarmOchre,
    onSecondaryContainer = Cream,
    tertiary = DeepMaroonLight,
    onTertiary = Cream,
    tertiaryContainer = DeepMaroon,
    onTertiaryContainer = Cream,
    error = SoftBrown,
    onError = Cream,
    background = Charcoal,
    onBackground = Cream,
    surface = Color(0xFF3B3B2B),
    onSurface = Cream,
    surfaceVariant = Color(0xFF4A4A3A),
    onSurfaceVariant = WarmGray,
    outline = WarmGray,
    inverseOnSurface = Charcoal,
    inverseSurface = Cream,
    inversePrimary = SageGreenDark
)

@Composable
fun HomeRetreatTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.background.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = !darkTheme
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}