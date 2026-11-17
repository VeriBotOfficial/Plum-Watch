package me.doruk.plumwatch.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp
import com.kyant.backdrop.Backdrop
import com.kyant.backdrop.backdrops.layerBackdrop
import com.kyant.backdrop.backdrops.rememberLayerBackdrop
import me.doruk.plumwatch.ui.liquid.LiquidButton
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.Icon
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

val LocalLiquidBackdrop = staticCompositionLocalOf<Backdrop?> { null }

/**
 * The app background is a single theme color. The recorded layer exists only
 * to let Kyant's original Liquid Glass controls refract the content behind them.
 *
 * rememberLayerBackdrop() is always called (not wrapped in remember {}) so
 * individual glass controls (LiquidToggle, LiquidButton, LiquidBottomTabs)
 * always have a backdrop object to use via drawBackdrop().
 *
 * .layerBackdrop() is only applied to the host surface when glass is enabled,
 * which avoids the native SIGSEGV crash in RenderThread on some devices
 * while still letting glass controls render blur/vibrancy/lens effects.
 */
@Composable
fun LiquidGlassHost(
    enabled: Boolean,
    content: @Composable BoxScope.() -> Unit,
    overlay: @Composable BoxScope.() -> Unit
) {
    // Always call rememberLayerBackdrop() directly in composable context so
    // glass controls can use it via LocalLiquidBackdrop.
    val backdrop = rememberLayerBackdrop()
    Box(
        Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .then(if (enabled) Modifier.layerBackdrop(backdrop) else Modifier)
    ) {
        CompositionLocalProvider(LocalLiquidBackdrop provides backdrop) {
            content()
        }
        overlay()
    }
}

/** Lightweight, opaque surface for screen content; glass is reserved for the controls. */
@Composable
fun AppSurface(
    modifier: Modifier = Modifier,
    shape: Shape = RoundedCornerShape(24.dp),
    content: @Composable BoxScope.() -> Unit
) {
    Box(
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
    icon: ImageVector? = null,
    enabled: Boolean = true
) {
    val backdrop = LocalLiquidBackdrop.current
    if (backdrop != null) {
        LiquidButton(
            onClick = { if (enabled) onClick() },
            backdrop = backdrop,
            modifier = modifier,
            isInteractive = true,
            surfaceColor = if (enabled) MaterialTheme.colorScheme.primary
            else MaterialTheme.colorScheme.surfaceVariant
        ) {
            if (icon != null) {
                Icon(
                    imageVector = icon,
                    contentDescription = null,
                    tint = if (enabled) MaterialTheme.colorScheme.onPrimary
                    else MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
            Text(
                text = label,
                color = if (enabled) MaterialTheme.colorScheme.onPrimary
                else MaterialTheme.colorScheme.onSurfaceVariant,
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold
            )
        }
    } else {
        Button(
            onClick = onClick,
            enabled = enabled,
            modifier = modifier,
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.primary,
                contentColor = MaterialTheme.colorScheme.onPrimary
            )
        ) {
            if (icon != null) {
                Icon(icon, contentDescription = null)
            }
            Text(label, modifier = Modifier, fontWeight = FontWeight.SemiBold)
        }
    }
}
