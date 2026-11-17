package me.doruk.plumwatch.ui.liquid

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.wexpa.liquidglass.Glass
import com.wexpa.liquidglass.glassEffect
import com.wexpa.liquidglass.material3.GlassTabBar

/**
 * Real liquid glass bottom navigation bar using GlassTabBar from shayxo/liquidglass.
 * The selector moves when tabs are tapped or dragged.
 *
 * @param tabContent index-based content for each tab: (index, isSelected) -> Unit
 */
@Composable
fun LiquidBottomTabs(
    selectedTabIndex: () -> Int,
    onTabSelected: (index: Int) -> Unit,
    backdrop: Any? = null, // kept for API compatibility; not used by the new library
    tabsCount: Int,
    modifier: Modifier = Modifier,
    tabContent: @Composable (Int, Boolean) -> Unit
) {
    var selected by remember { mutableStateOf(selectedTabIndex()) }

    // Keep selected in sync when the parent changes the page externally
    androidx.compose.runtime.LaunchedEffect(selectedTabIndex) {
        selected = selectedTabIndex()
    }

    GlassTabBar(
        itemCount = tabsCount,
        selectedIndex = selected,
        onSelected = { index ->
            selected = index
            onTabSelected(index)
        },
        modifier = modifier
            .fillMaxWidth()
            .glassEffect(Glass.Regular.interactive(), androidx.compose.foundation.shape.CapsuleShape)
    ) { index, isSelected ->
        tabContent(index, isSelected)
    }
}
