package io.github.seyoungcho2.dynamictheme.material3.model.predefine.whiteblue

import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import io.github.seyoungcho2.dynamictheme.material3.model.ColorPalette
import io.github.seyoungcho2.dynamictheme.material3.model.predefine.navy.NavyTheme

object WhiteBlueTheme {
    private val md_theme_light_primary = Color(0xFF0060A8)
    private val md_theme_light_onPrimary = Color(0xFFFFFFFF)
    private val md_theme_light_primaryContainer = Color(0xFFD2E4FF)
    private val md_theme_light_onPrimaryContainer = Color(0xFF001C37)
    private val md_theme_light_secondary = Color(0xFF535F70)
    private val md_theme_light_onSecondary = Color(0xFFFFFFFF)
    private val md_theme_light_secondaryContainer = Color(0xFFD7E3F8)
    private val md_theme_light_onSecondaryContainer = Color(0xFF101C2B)
    private val md_theme_light_tertiary = Color(0xFF1D5BBA)
    private val md_theme_light_onTertiary = Color(0xFFFFFFFF)
    private val md_theme_light_tertiaryContainer = Color(0xFFD8E2FF)
    private val md_theme_light_onTertiaryContainer = Color(0xFF001A43)
    private val md_theme_light_error = Color(0xFFBA1A1A)
    private val md_theme_light_errorContainer = Color(0xFFFFDAD6)
    private val md_theme_light_onError = Color(0xFFFFFFFF)
    private val md_theme_light_onErrorContainer = Color(0xFF410002)
    private val md_theme_light_background = Color(0xFFFEFBFF)
    private val md_theme_light_onBackground = Color(0xFF001849)
    private val md_theme_light_surface = Color(0xFFFEFBFF)
    private val md_theme_light_onSurface = Color(0xFF001849)
    private val md_theme_light_surfaceVariant = Color(0xFFDFE2EB)
    private val md_theme_light_onSurfaceVariant = Color(0xFF43474E)
    private val md_theme_light_outline = Color(0xFF73777F)
    private val md_theme_light_inverseOnSurface = Color(0xFFEEF0FF)
    private val md_theme_light_inverseSurface = Color(0xFF002B75)
    private val md_theme_light_inversePrimary = Color(0xFFA1C9FF)
    private val md_theme_light_shadow = Color(0xFF000000)
    private val md_theme_light_surfaceTint = Color(0xFF0060A8)
    private val md_theme_light_outlineVariant = Color(0xFFC3C6CF)
    private val md_theme_light_scrim = Color(0xFF000000)

    private val WhiteBlueColorScheme = lightColorScheme(
        primary = md_theme_light_primary,
        onPrimary = md_theme_light_onPrimary,
        primaryContainer = md_theme_light_primaryContainer,
        onPrimaryContainer = md_theme_light_onPrimaryContainer,
        secondary = md_theme_light_secondary,
        onSecondary = md_theme_light_onSecondary,
        secondaryContainer = md_theme_light_secondaryContainer,
        onSecondaryContainer = md_theme_light_onSecondaryContainer,
        tertiary = md_theme_light_tertiary,
        onTertiary = md_theme_light_onTertiary,
        tertiaryContainer = md_theme_light_tertiaryContainer,
        onTertiaryContainer = md_theme_light_onTertiaryContainer,
        error = md_theme_light_error,
        errorContainer = md_theme_light_errorContainer,
        onError = md_theme_light_onError,
        onErrorContainer = md_theme_light_onErrorContainer,
        background = md_theme_light_background,
        onBackground = md_theme_light_onBackground,
        surface = md_theme_light_surface,
        onSurface = md_theme_light_onSurface,
        surfaceVariant = md_theme_light_surfaceVariant,
        onSurfaceVariant = md_theme_light_onSurfaceVariant,
        outline = md_theme_light_outline,
        inverseOnSurface = md_theme_light_inverseOnSurface,
        inverseSurface = md_theme_light_inverseSurface,
        inversePrimary = md_theme_light_inversePrimary,
        surfaceTint = md_theme_light_surfaceTint,
        outlineVariant = md_theme_light_outlineVariant,
        scrim = md_theme_light_scrim,
    )

    val ColorPalette: ColorPalette = ColorPalette(
        lightModeColors = WhiteBlueColorScheme,
        darkModeColors = WhiteBlueColorScheme
    )
}