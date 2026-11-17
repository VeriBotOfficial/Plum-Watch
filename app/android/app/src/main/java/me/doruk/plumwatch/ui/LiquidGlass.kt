package me.doruk.plumwatch.ui

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.luminance
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.kyant.backdrop.Backdrop
import com.kyant.backdrop.backdrops.layerBackdrop
import com.kyant.backdrop.backdrops.rememberLayerBackdrop
import com.kyant.backdrop.drawBackdrop
import com.kyant.backdrop.effects.blur
import com.kyant.backdrop.effects.lens
import com.kyant.backdrop.effects.vibrancy
import com.kyant.backdrop.highlight.Highlight
import com.kyant.backdrop.shadow.InnerShadow
import com.kyant.backdrop.shadow.Shadow
import androidx.compose.ui.unit.DpOffset

val LocalLiquidBackdrop = staticCompositionLocalOf<Backdrop?> { null }

/**
 * A shared backdrop layer. Glass surfaces sample this background and apply
 * the library's actual blur, vibrancy and refraction effects to it.
 */
@Composable
fun LiquidGlassHost(
    darkTheme: Boolean,
    content: @Composable BoxScope.() -> Unit
) {
    val backdrop = rememberLayerBackdrop()

    Box(modifier = Modifier.fillMaxSize()) {
        Canvas(
            modifier = Modifier
                .fillMaxSize()
                .layerBackdrop(backdrop)
        ) {
            val background = if (darkTheme) Color(0xFF090B10) else Color(0xFFF0F2F6)
            drawRect(background)

            val radius = size.minDimension * 0.62f
            val firstCenter = Offset(size.width * 0.82f, size.height * 0.12f)
            val secondCenter = Offset(size.width * 0.08f, size.height * 0.68f)

            val firstGlow = if (darkTheme) Color(0xFF1C5678) else Color(0xFFB5CBE8)
            val secondGlow = if (darkTheme) Color(0xFF385078) else Color(0xFFD7C9EA)

            drawCircle(
                brush = Brush.radialGradient(
                    colors = listOf(firstGlow.copy(alpha = if (darkTheme) 0.32f else 0.48f), Color.Transparent),
                    center = firstCenter,
                    radius = radius
                ),
                center = firstCenter,
                radius = radius
            )
            drawCircle(
                brush = Brush.radialGradient(
                    colors = listOf(secondGlow.copy(alpha = if (darkTheme) 0.20f else 0.34f), Color.Transparent),
                    center = secondCenter,
                    radius = radius * 0.84f
                ),
                center = secondCenter,
                radius = radius * 0.84f
            )
        }

        CompositionLocalProvider(LocalLiquidBackdrop provides backdrop) {
            content()
        }
    }
}

/**
 * Reusable liquid-glass material for cards, navigation, and compact controls.
 * The effect is rendered by AndroidLiquidGlass' backdrop pipeline, not a
 * translucent flat fill or a simulated blur.
 */
@Composable
fun LiquidGlassSurface(
    modifier: Modifier = Modifier,
    shape: Shape = RoundedCornerShape(26.dp),
    fillAlpha: Float? = null,
    content: @Composable BoxScope.() -> Unit
) {
    val backdrop = LocalLiquidBackdrop.current
    val darkTheme = androidx.compose.material3.MaterialTheme.colorScheme.background.luminance() < 0.5f

    val glassFill = Color.White.copy(
        alpha = fillAlpha ?: if (darkTheme) 0.075f else 0.34f
    )
    val edge = Color.White.copy(alpha = if (darkTheme) 0.20f else 0.68f)
    val shadowColor = Color.Black.copy(alpha = if (darkTheme) 0.34f else 0.10f)

    val material = if (backdrop != null) {
        Modifier.drawBackdrop(
            backdrop = backdrop,
            shape = { shape },
            effects = {
                vibrancy()
                blur(13.dp.toPx())
                lens(
                    refractionHeight = 13.dp.toPx(),
                    refractionAmount = 24.dp.toPx(),
                    depthEffect = true
                )
            },
            highlight = {
                Highlight.Default.copy(alpha = 0.88f)
            },
            shadow = {
                Shadow(
                    radius = 25.dp,
                    offset = DpOffset(0.dp, 8.dp),
                    color = shadowColor,
                    alpha = 0.9f
                )
            },
            innerShadow = {
                InnerShadow(
                    radius = 11.dp,
                    offset = DpOffset(0.dp, 1.dp),
                    color = Color.White.copy(alpha = if (darkTheme) 0.20f else 0.56f),
                    alpha = 0.45f
                )
            },
            onDrawSurface = {
                drawRect(glassFill)
            }
        )
    } else {
        Modifier
            .clip(shape)
            .background(glassFill, shape)
    }

    Box(
        modifier = modifier
            .then(material)
            .border(1.dp, edge, shape),
        content = content
    )
}
