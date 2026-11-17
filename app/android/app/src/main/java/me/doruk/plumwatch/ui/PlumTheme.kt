package me.doruk.plumwatch.ui

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.lerp

private val PlumDarkColors = darkColorScheme(
    primary = Color(0xFFE9AC58),
    onPrimary = Color(0xFF20170C),
    secondary = Color(0xFFB9C5D8),
    background = Color(0xFF090A0C),
    onBackground = Color(0xFFF2F2F3),
    surface = Color(0xFF15171B),
    onSurface = Color(0xFFF2F2F3),
    surfaceVariant = Color(0xFF202329),
    onSurfaceVariant = Color(0xFFA5A8B0),
    outline = Color(0xFF343840)
)

private val PlumLightColors = lightColorScheme(
    primary = Color(0xFF986021),
    onPrimary = Color(0xFFFFFFFF),
    secondary = Color(0xFF55677A),
    background = Color(0xFFF4F5F7),
    onBackground = Color(0xFF17191D),
    surface = Color(0xFFFFFFFF),
    onSurface = Color(0xFF17191D),
    surfaceVariant = Color(0xFFE9EBEF),
    onSurfaceVariant = Color(0xFF666B74),
    outline = Color(0xFFD9DCE2)
)

@Composable
fun PlumTheme(
    darkTheme: Boolean,
    content: @Composable () -> Unit
) {
    // A single animation clock drives the whole palette. This avoids ten independent
    // color animations invalidating the composition separately.
    val progress by androidx.compose.animation.core.animateFloatAsState(
        targetValue = if (darkTheme) 1f else 0f,
        animationSpec = tween(durationMillis = 220),
        label = "theme-transition"
    )
    val colorScheme = PlumLightColors.copy(
        primary = lerp(PlumLightColors.primary, PlumDarkColors.primary, progress),
        onPrimary = lerp(PlumLightColors.onPrimary, PlumDarkColors.onPrimary, progress),
        secondary = lerp(PlumLightColors.secondary, PlumDarkColors.secondary, progress),
        background = lerp(PlumLightColors.background, PlumDarkColors.background, progress),
        onBackground = lerp(PlumLightColors.onBackground, PlumDarkColors.onBackground, progress),
        surface = lerp(PlumLightColors.surface, PlumDarkColors.surface, progress),
        onSurface = lerp(PlumLightColors.onSurface, PlumDarkColors.onSurface, progress),
        surfaceVariant = lerp(PlumLightColors.surfaceVariant, PlumDarkColors.surfaceVariant, progress),
        onSurfaceVariant = lerp(PlumLightColors.onSurfaceVariant, PlumDarkColors.onSurfaceVariant, progress),
        outline = lerp(PlumLightColors.outline, PlumDarkColors.outline, progress)
    )

    MaterialTheme(
        colorScheme = colorScheme,
        content = content
    )
}
