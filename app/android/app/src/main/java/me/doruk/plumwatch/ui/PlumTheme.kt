package me.doruk.plumwatch.ui

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color

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
    val target = if (darkTheme) PlumDarkColors else PlumLightColors
    val motion = tween<Color>(
        durationMillis = 680,
        easing = FastOutSlowInEasing
    )

    val primary by animateColorAsState(target.primary, motion, label = "theme-primary")
    val onPrimary by animateColorAsState(target.onPrimary, motion, label = "theme-on-primary")
    val secondary by animateColorAsState(target.secondary, motion, label = "theme-secondary")
    val background by animateColorAsState(target.background, motion, label = "theme-background")
    val onBackground by animateColorAsState(target.onBackground, motion, label = "theme-on-background")
    val surface by animateColorAsState(target.surface, motion, label = "theme-surface")
    val onSurface by animateColorAsState(target.onSurface, motion, label = "theme-on-surface")
    val surfaceVariant by animateColorAsState(target.surfaceVariant, motion, label = "theme-surface-variant")
    val onSurfaceVariant by animateColorAsState(target.onSurfaceVariant, motion, label = "theme-on-surface-variant")
    val outline by animateColorAsState(target.outline, motion, label = "theme-outline")

    MaterialTheme(
        colorScheme = target.copy(
            primary = primary,
            onPrimary = onPrimary,
            secondary = secondary,
            background = background,
            onBackground = onBackground,
            surface = surface,
            onSurface = onSurface,
            surfaceVariant = surfaceVariant,
            onSurfaceVariant = onSurfaceVariant,
            outline = outline
        ),
        content = content
    )
}
