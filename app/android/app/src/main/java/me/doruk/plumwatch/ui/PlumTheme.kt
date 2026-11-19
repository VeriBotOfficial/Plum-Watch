package me.doruk.plumwatch.ui

import androidx.compose.animation.core.animateColorAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.lerp

data class PlumPalette(
    val id: String,
    val name: String,
    val lightPrimary: Color,
    val lightOnPrimary: Color,
    val lightSecondary: Color,
    val darkPrimary: Color,
    val darkOnPrimary: Color,
    val darkSecondary: Color,
    val previewColor: Color
)

val PlumPalettes = listOf(
    PlumPalette(
        id = "plum",
        name = "Plum",
        lightPrimary = Color(0xFF986021),
        lightOnPrimary = Color(0xFFFFFFFF),
        lightSecondary = Color(0xFF55677A),
        darkPrimary = Color(0xFFE9AC58),
        darkOnPrimary = Color(0xFF20170C),
        darkSecondary = Color(0xFFB9C5D8),
        previewColor = Color(0xFFE9AC58)
    ),
    PlumPalette(
        id = "ocean",
        name = "Ocean",
        lightPrimary = Color(0xFF356D8D),
        lightOnPrimary = Color(0xFFFFFFFF),
        lightSecondary = Color(0xFF557E91),
        darkPrimary = Color(0xFF8FC5DF),
        darkOnPrimary = Color(0xFF10232C),
        darkSecondary = Color(0xFFB2D0DC),
        previewColor = Color(0xFF5C9FBE)
    ),
    PlumPalette(
        id = "forest",
        name = "Forest",
        lightPrimary = Color(0xFF527A61),
        lightOnPrimary = Color(0xFFFFFFFF),
        lightSecondary = Color(0xFF667D6D),
        darkPrimary = Color(0xFF9BC4A4),
        darkOnPrimary = Color(0xFF14251A),
        darkSecondary = Color(0xFFBCD3C1),
        previewColor = Color(0xFF76A987)
    ),
    PlumPalette(
        id = "rose",
        name = "Rose",
        lightPrimary = Color(0xFF965F72),
        lightOnPrimary = Color(0xFFFFFFFF),
        lightSecondary = Color(0xFF806A77),
        darkPrimary = Color(0xFFD8A1B2),
        darkOnPrimary = Color(0xFF301923),
        darkSecondary = Color(0xFFE0C0CA),
        previewColor = Color(0xFFC18498)
    )
)

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
    paletteId: String = "plum",
    content: @Composable () -> Unit
) {
    val palette = PlumPalettes.firstOrNull { it.id == paletteId } ?: PlumPalettes.first()

    val darkProgress by animateFloatAsState(
        targetValue = if (darkTheme) 1f else 0f,
        animationSpec = tween(durationMillis = 240),
        label = "theme-transition"
    )
    val primary by animateColorAsState(
        targetValue = if (darkTheme) palette.darkPrimary else palette.lightPrimary,
        animationSpec = tween(durationMillis = 300),
        label = "palette-primary"
    )
    val onPrimary by animateColorAsState(
        targetValue = if (darkTheme) palette.darkOnPrimary else palette.lightOnPrimary,
        animationSpec = tween(durationMillis = 300),
        label = "palette-on-primary"
    )
    val secondary by animateColorAsState(
        targetValue = if (darkTheme) palette.darkSecondary else palette.lightSecondary,
        animationSpec = tween(durationMillis = 300),
        label = "palette-secondary"
    )

    val colorScheme = PlumLightColors.copy(
        primary = primary,
        onPrimary = onPrimary,
        secondary = secondary,
        background = lerp(PlumLightColors.background, PlumDarkColors.background, darkProgress),
        onBackground = lerp(PlumLightColors.onBackground, PlumDarkColors.onBackground, darkProgress),
        surface = lerp(PlumLightColors.surface, PlumDarkColors.surface, darkProgress),
        onSurface = lerp(PlumLightColors.onSurface, PlumDarkColors.onSurface, darkProgress),
        surfaceVariant = lerp(PlumLightColors.surfaceVariant, PlumDarkColors.surfaceVariant, darkProgress),
        onSurfaceVariant = lerp(PlumLightColors.onSurfaceVariant, PlumDarkColors.onSurfaceVariant, darkProgress),
        outline = lerp(PlumLightColors.outline, PlumDarkColors.outline, darkProgress)
    )

    MaterialTheme(
        colorScheme = colorScheme,
        content = content
    )
}
