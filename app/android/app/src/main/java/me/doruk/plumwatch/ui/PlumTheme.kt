package me.doruk.plumwatch.ui

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
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
    MaterialTheme(
        colorScheme = if (darkTheme) PlumDarkColors else PlumLightColors,
        content = content
    )
}
