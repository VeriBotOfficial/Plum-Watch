package me.doruk.plumwatch.ui.liquid

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.wexpa.liquidglass.Glass
import com.wexpa.liquidglass.glassEffect
import androidx.compose.foundation.shape.CapsuleShape

/**
 * Real liquid glass bottom navigation bar using Row + Modifier.weight.
 * The selector moves when tabs are tapped.
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
    var selected by remember { mutableIntStateOf(selectedTabIndex()) }

    // Keep selected in sync when the parent changes the page externally
    androidx.compose.runtime.LaunchedEffect(selectedTabIndex) {
        selected = selectedTabIndex()
    }

    androidx.compose.foundation.layout.Row(
        modifier = modifier
            .fillMaxWidth()
            .glassEffect(Glass.Regular.interactive(), CapsuleShape),
        horizontalArrangement = androidx.compose.foundation.layout.Arrangement.spacedBy(4.dp),
        verticalArrangement = androidx.compose.foundation.layout.Arrangement.CenterVertically
    ) {
        repeat(tabsCount) { index ->
            val isSelected = selected == index
            androidx.compose.foundation.layout.Column(
                modifier = Modifier
                    .weight(1f)
                    .glassEffect(Glass.Regular.interactive(), CapsuleShape)
                    .clickable(
                        interactionSource = null,
                        indication = null,
                        role = androidx.compose.ui.semantics.Role.Tab,
                        onClick = {
                            selected = index
                            onTabSelected(index)
                        }
                    )
                    .fillMaxHeight(),
                verticalArrangement = androidx.compose.foundation.layout.Arrangement.spacedBy(2.dp, androidx.compose.ui.Alignment.CenterVertically),
                horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally
            ) {
                tabContent(index, isSelected)
            }
        }
    }
}
