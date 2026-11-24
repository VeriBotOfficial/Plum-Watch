package me.doruk.plumwatch.ui

import androidx.compose.animation.AnimatedContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material3.Button as MaterialButton
import androidx.compose.material3.ButtonDefaults as MaterialButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.Surface as MaterialSurface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kyant.backdrop.Backdrop
import com.kyant.backdrop.backdrops.layerBackdrop
import com.kyant.backdrop.backdrops.rememberLayerBackdrop
import com.kyant.backdrop.drawBackdrop
import com.kyant.backdrop.effects.blur
import com.kyant.backdrop.effects.lens
import com.kyant.backdrop.effects.vibrancy
import com.kyant.backdrop.highlight.Highlight

/**
 * Liquid Glass is applied selectively to interactive surfaces and primary actions.
 */
val LocalLiquidBackdrop = staticCompositionLocalOf<Backdrop?> { null }
val LocalLiquidSurfaceBackdrop = staticCompositionLocalOf<Backdrop?> { null }

@Composable
fun LiquidGlassHost(
    enabled: Boolean,
    content: @Composable BoxScope.() -> Unit,
    overlay: @Composable BoxScope.() -> Unit
) {
    val backdrop = rememberLayerBackdrop()
    val background = MaterialTheme.colorScheme.background
    val surfaceBackdrop = rememberLayerBackdrop()
    val surfaceBaseBackdrop = rememberLayerBackdrop {
        drawRect(background)
    }

    Box(modifier = Modifier.fillMaxSize()) {
        CompositionLocalProvider(
            LocalLiquidSurfaceBackdrop provides if (enabled) surfaceBackdrop else null
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .then(if (enabled) Modifier.layerBackdrop(backdrop) else Modifier)
                    .background(background)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .then(
                            if (enabled) {
                                Modifier.drawBackdrop(
                                    backdrop = surfaceBaseBackdrop,
                                    shape = { RectangleShape },
                                    exportedBackdrop = surfaceBackdrop
                                )
                            } else {
                                Modifier
                            }
                        ),
                    content = content
                )
            }
        }

        CompositionLocalProvider(
            LocalLiquidBackdrop provides if (enabled) backdrop else null
        ) {
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
    val backdrop = LocalLiquidSurfaceBackdrop.current
    val scheme = MaterialTheme.colorScheme
    val glassModifier = if (backdrop != null) {
        Modifier.drawBackdrop(
            backdrop = backdrop,
            shape = { shape },
            effects = {
                vibrancy()
                blur(7f.dp.toPx())
                lens(15f.dp.toPx(), 15f.dp.toPx())
            },
            highlight = { Highlight.Default.copy(alpha = 0.24f) },
            onDrawSurface = {
                drawRect(scheme.surface.copy(alpha = 0.46f))
                drawRect(scheme.primary.copy(alpha = 0.025f))
            }
        )
    } else Modifier

    MaterialSurface(
        onClick = onClick,
        modifier = modifier.then(glassModifier),
        enabled = enabled,
        shape = shape,
        color = if (backdrop != null) Color.Transparent else scheme.surface,
        contentColor = scheme.onSurface
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
    enabled: Boolean = true,
    loading: Boolean = false
) {
    val backdrop = LocalLiquidSurfaceBackdrop.current
    val scheme = MaterialTheme.colorScheme
    val shape = RoundedCornerShape(16.dp)
    val actionContentColor = if (backdrop != null) scheme.primary else scheme.onPrimary
    val glassModifier = if (backdrop != null) {
        Modifier.drawBackdrop(
            backdrop = backdrop,
            shape = { shape },
            effects = {
                vibrancy()
                blur(7f.dp.toPx())
                lens(13f.dp.toPx(), 13f.dp.toPx())
            },
            highlight = { Highlight.Default.copy(alpha = 0.3f) },
            onDrawSurface = {
                drawRect(scheme.primary.copy(alpha = 0.17f))
                drawRect(scheme.surface.copy(alpha = 0.13f))
            }
        )
    } else Modifier

    MaterialButton(
        onClick = onClick,
        enabled = enabled,
        modifier = modifier.then(glassModifier),
        shape = shape,
        colors = MaterialButtonDefaults.buttonColors(
            containerColor = if (backdrop != null) Color.Transparent else scheme.primary,
            contentColor = actionContentColor,
            disabledContainerColor = if (backdrop != null) Color.Transparent else scheme.surfaceVariant,
            disabledContentColor = scheme.onSurfaceVariant.copy(alpha = 0.55f)
        )
    ) {
        if (loading) {
            CircularProgressIndicator(
                modifier = Modifier.size(17.dp),
                color = actionContentColor,
                strokeWidth = 2.dp
            )
        } else if (icon != null) {
            androidx.compose.material3.Icon(icon, contentDescription = null)
        }
        if (loading || icon != null) Spacer(Modifier.width(8.dp))
        AnimatedContent(
            targetState = label,
            label = "plum-action-button-label"
        ) { animatedLabel ->
            Text(
                text = animatedLabel,
                fontWeight = FontWeight.SemiBold
            )
        }
    }
}


@Composable
fun PlumBackButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    label: String? = null
) {
    AppClickableSurface(
        onClick = onClick,
        modifier = modifier,
        shape = if (label == null) CircleShape else RoundedCornerShape(50.dp)
    ) {
        Row(
            modifier = if (label == null) {
                Modifier.fillMaxSize()
            } else {
                Modifier.padding(horizontal = 13.dp, vertical = 8.dp)
            },
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = if (label == null) Arrangement.Center else Arrangement.Start
        ) {
            Icon(
                imageVector = Icons.Outlined.ArrowBack,
                contentDescription = if (label == null) "Back" else null,
                tint = MaterialTheme.colorScheme.onSurface,
                modifier = Modifier.size(18.dp)
            )
            if (label != null) {
                Spacer(Modifier.width(7.dp))
                Text(
                    text = label,
                    color = MaterialTheme.colorScheme.onSurface,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Medium
                )
            }
        }
    }
}

@Composable
fun PlumProgressLabel(
    label: String,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        CircularProgressIndicator(
            modifier = Modifier.size(18.dp),
            color = MaterialTheme.colorScheme.primary,
            strokeWidth = 2.dp
        )
        Spacer(Modifier.width(10.dp))
        AnimatedContent(
            targetState = label,
            label = "plum-progress-label"
        ) { animatedLabel ->
            Text(
                text = animatedLabel,
                color = MaterialTheme.colorScheme.onSurface,
                fontSize = 13.sp,
                fontWeight = FontWeight.Medium
            )
        }
    }
}
