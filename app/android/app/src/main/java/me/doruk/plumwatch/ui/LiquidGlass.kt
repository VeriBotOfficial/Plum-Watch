package me.doruk.plumwatch.ui

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp
import com.wexpa.liquidglass.Glass
import com.wexpa.liquidglass.LiquidGlassTheme
import com.wexpa.liquidglass.glassEffect

/**
 * LiquidGlassHost wraps content in LiquidGlassTheme so every child can use
 * Modifier.glassEffect() for real refraction / blur / rim effects.
 *
 * When glass is disabled, children fall back to plain Material3 rendering.
 */
@Composable
fun LiquidGlassHost(
    enabled: Boolean,
    content: @Composable BoxScope.() -> Unit,
    overlay: @Composable BoxScope.() -> Unit
) {
    if (enabled) {
        LiquidGlassTheme {
            Box(Modifier.fillMaxSize()) {
                content()
                overlay()
            }
        }
    } else {
        Box(Modifier.fillMaxSize()) {
            content()
            overlay()
        }
    }
}

/** Lightweight, opaque surface for screen content; glass is reserved for the controls. */
@Composable
fun AppSurface(
    modifier: Modifier = Modifier,
    shape: Shape = RoundedCornerShape(24.dp),
    content: @Composable BoxScope.() -> Unit
) {
    androidx.compose.foundation.layout.Box(
        modifier = modifier
            .clip(shape)
            .background(MaterialTheme.colorScheme.surface, shape)
            .border(1.dp, MaterialTheme.colorScheme.outline.copy(alpha = 0.32f), shape),
        content = content
    )
}

@Composable
fun PlumActionButton(
    label: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    icon: androidx.compose.ui.graphics.vector.ImageVector? = null,
    enabled: Boolean = true
) {
    androidx.compose.material3.Button(
        onClick = { if (enabled) onClick() },
        enabled = enabled,
        modifier = modifier
            .glassEffect(Glass.Regular.interactive(), RoundedCornerShape(16.dp)),
        colors = androidx.compose.material3.ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.primary,
            contentColor = MaterialTheme.colorScheme.onPrimary
        )
    ) {
        if (icon != null) {
            androidx.compose.material3.Icon(icon, contentDescription = null)
        }
        androidx.compose.material3.Text(label, modifier = Modifier, fontWeight = androidx.compose.ui.text.font.FontWeight.SemiBold)
    }
}
