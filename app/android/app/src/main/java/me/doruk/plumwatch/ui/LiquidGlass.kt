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
import androidx.compose.ui.unit.dp
import com.kyant.backdrop.Backdrop
import com.kyant.backdrop.backdrops.layerBackdrop
import com.kyant.backdrop.backdrops.rememberLayerBackdrop

/**
 * The only Liquid Glass backdrop in Plum Watch is used by the floating navigation bar.
 * Cards, tiles, dialogs and regular buttons deliberately remain ordinary Material 3 UI.
 */
val LocalLiquidBackdrop = staticCompositionLocalOf<Backdrop?> { null }

@Composable
fun LiquidGlassHost(
    enabled: Boolean,
    content: @Composable BoxScope.() -> Unit,
    overlay: @Composable BoxScope.() -> Unit
) {
    val backdrop = rememberLayerBackdrop()
    val background = MaterialTheme.colorScheme.background

    CompositionLocalProvider(
        LocalLiquidBackdrop provides if (enabled) backdrop else null
    ) {
        Box(modifier = Modifier.fillMaxSize()) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(background)
                    .then(if (enabled) Modifier.layerBackdrop(backdrop) else Modifier),
                content = content
            )
            overlay()
        }
    }
}

@Composable
fun AppSurface(
    modifier: Modifier = Modifier,
    shape: Shape = RoundedCornerShape(24.dp),
    content: @Composable BoxScope.() -> Unit
) {
    MaterialSurface(
        modifier = modifier,
        shape = shape,
        color = MaterialTheme.colorScheme.surface,
        contentColor = MaterialTheme.colorScheme.onSurface
    ) {
        Box(content = content)
    }
}

@Composable
fun AppClickableSurface(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = RoundedCornerShape(24.dp),
    enabled: Boolean = true,
    content: @Composable BoxScope.() -> Unit
) {
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

@Composable
fun PlumActionButton(
    label: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    icon: androidx.compose.ui.graphics.vector.ImageVector? = null,
    enabled: Boolean = true
) {
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
