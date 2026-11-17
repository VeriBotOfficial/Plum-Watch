package me.doruk.plumwatch.ui.liquid

import androidx.compose.animation.animateFloatAsState
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.scale
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.lerp
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.fastCoerceIn
import androidx.compose.ui.util.lerp
import com.wexpa.liquidglass.Glass
import com.wexpa.liquidglass.glassEffect
import androidx.compose.foundation.shape.CapsuleShape
import kotlinx.coroutines.flow.collectLatest

@Composable
fun LiquidToggle(
    selected: () -> Boolean,
    onSelect: (Boolean) -> Unit,
    backdrop: Any? = null, // kept for API compatibility; not used by the new library
    modifier: Modifier = Modifier
) {
    val isLightTheme = !isSystemInDarkTheme()
    val accentColor =
        if (isLightTheme) Color(0xFF34C759)
        else Color(0xFF30D158)
    val trackColor =
        if (isLightTheme) Color(0xFF787878).copy(0.2f)
        else Color(0xFF787880).copy(0.36f)

    val density = LocalDensity.current
    val isLtr = LocalLayoutDirection.current == LayoutDirection.Ltr
    val dragWidth = with(density) { 20f.dp.toPx() }

    var fraction by remember { mutableStateOf(if (selected()) 1f else 0f) }
    val animatedFraction by animateFloatAsState(
        targetValue = fraction,
        label = "toggle-fraction"
    )

    LaunchedEffect(selected) {
        snapshotFlow { selected() }
            .collectLatest { isSelected ->
                val target = if (isSelected) 1f else 0f
                if (target != fraction) {
                    fraction = target
                }
            }
    }

    Box(
        modifier,
        contentAlignment = Alignment.CenterStart
    ) {
        // Track with glass effect
        Box(
            Modifier
                .clip(CapsuleShape)
                .glassEffect(Glass.Regular.interactive(), CapsuleShape)
                .drawBehind {
                    val f = animatedFraction
                    drawRect(lerp(trackColor, accentColor, f))
                }
                .size(64f.dp, 28f.dp)
        )

        // Thumb
        Box(
            Modifier
                .graphicsLayer {
                    val f = animatedFraction
                    val padding = 2f.dp.toPx()
                    translationX =
                        if (isLtr) lerp(padding, padding + dragWidth, f)
                        else lerp(-padding, -(padding + dragWidth), f)
                }
                .semantics {
                    role = Role.Switch
                }
                .glassEffect(Glass.Regular.interactive(), CapsuleShape)
                .size(40f.dp, 24f.dp)
                .clickable(
                    interactionSource = null,
                    indication = null,
                    role = Role.Switch,
                    onClick = {
                        val newValue = !selected()
                        onSelect(newValue)
                        fraction = if (newValue) 1f else 0f
                    }
                )
        )
    }
}
