package me.doruk.plumwatch.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button as MaterialButton
import androidx.compose.material3.ButtonDefaults as MaterialButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface as MaterialSurface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.luminance
import androidx.compose.ui.unit.dp
import com.wexpa.liquidglass.LiquidGlassTheme
import com.wexpa.liquidglass.material3.Button as GlassButton
import com.wexpa.liquidglass.material3.GlassMaterialDefaults
import com.wexpa.liquidglass.material3.Surface as GlassSurface

/**
 * The root glass theme is present in both interface modes because the appearance switch
 * remains a library glass control even while the rest of the interface is Classic.
 */
val LocalLiquidGlassEnabled = staticCompositionLocalOf { false }

@Composable
fun LiquidGlassHost(
    enabled: Boolean,
    content: @Composable BoxScope.() -> Unit,
    overlay: @Composable BoxScope.() -> Unit
) {
    val scheme = MaterialTheme.colorScheme
    val background = scheme.background

    LiquidGlassTheme(
        dark = background.luminance() < 0.5f,
        background = background
    ) {
        CompositionLocalProvider(LocalLiquidGlassEnabled provides enabled) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(background)
            ) {
                content()
                overlay()
            }
        }
    }
}

/** Library frosted panel in Glass mode; ordinary Material surface in Classic mode. */
@Composable
fun AppSurface(
    modifier: Modifier = Modifier,
    shape: Shape = RoundedCornerShape(24.dp),
    content: @Composable BoxScope.() -> Unit
) {
    if (LocalLiquidGlassEnabled.current) {
        GlassSurface(
            modifier = modifier,
            shape = shape,
            contentColor = MaterialTheme.colorScheme.onSurface
        ) {
            Box(content = content)
        }
    } else {
        MaterialSurface(
            modifier = modifier,
            shape = shape,
            color = MaterialTheme.colorScheme.surface,
            contentColor = MaterialTheme.colorScheme.onSurface
        ) {
            Box(content = content)
        }
    }
}

/** Interactive library surface for selectable tiles and appearance choices. */
@Composable
fun AppClickableSurface(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = RoundedCornerShape(24.dp),
    enabled: Boolean = true,
    content: @Composable BoxScope.() -> Unit
) {
    if (LocalLiquidGlassEnabled.current) {
        GlassSurface(
            onClick = onClick,
            modifier = modifier,
            enabled = enabled,
            shape = shape,
            contentColor = MaterialTheme.colorScheme.onSurface
        ) {
            Box(content = content)
        }
    } else {
        MaterialSurface(
            onClick = onClick,
            modifier = modifier,
            enabled = enabled,
            shape = shape,
            color = MaterialTheme.colorScheme.surface,
            contentColor = MaterialTheme.colorScheme.onSurface
        ) {
            Box(content = content)
        }
    }
}

/** Prominent library button in Glass mode, Material 3 button in Classic mode. */
@Composable
fun PlumActionButton(
    label: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    icon: androidx.compose.ui.graphics.vector.ImageVector? = null,
    enabled: Boolean = true
) {
    if (LocalLiquidGlassEnabled.current) {
        GlassButton(
            onClick = onClick,
            modifier = modifier,
            enabled = enabled,
            shape = RoundedCornerShape(16.dp),
            glass = GlassMaterialDefaults.prominent(),
            contentColor = MaterialTheme.colorScheme.onPrimary
        ) {
            if (icon != null) {
                androidx.compose.material3.Icon(icon, contentDescription = null)
            }
            androidx.compose.material3.Text(
                text = label,
                fontWeight = androidx.compose.ui.text.font.FontWeight.SemiBold
            )
        }
    } else {
        MaterialButton(
            onClick = onClick,
            enabled = enabled,
            modifier = modifier,
            shape = RoundedCornerShape(16.dp),
            colors = MaterialButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.primary,
                contentColor = MaterialTheme.colorScheme.onPrimary
            )
        ) {
            if (icon != null) {
                androidx.compose.material3.Icon(icon, contentDescription = null)
            }
            androidx.compose.material3.Text(
                text = label,
                fontWeight = androidx.compose.ui.text.font.FontWeight.SemiBold
            )
        }
    }
}
