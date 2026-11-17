package me.doruk.plumwatch.ui.liquid

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.CapsuleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.wexpa.liquidglass.Glass
import com.wexpa.liquidglass.glassEffect
import androidx.compose.ui.semantics.Role

@Composable
fun LiquidBottomTabs(
    selectedTabIndex: () -> Int,
    onTabSelected: (index: Int) -> Unit,
    backdrop: Any? = null,
    tabsCount: Int,
    modifier: Modifier = Modifier,
    tabContent: @Composable (Int, Boolean) -> Unit
) {
    var selected by remember { mutableIntStateOf(selectedTabIndex()) }

    androidx.compose.runtime.LaunchedEffect(selectedTabIndex) {
        selected = selectedTabIndex()
    }

    Row(
        modifier = modifier
            .fillMaxWidth()
            .glassEffect(Glass.Regular.interactive(), CapsuleShape),
        horizontalArrangement = Arrangement.spacedBy(4.dp),
        verticalArrangement = Alignment.CenterVertically
    ) {
        repeat(tabsCount) { index ->
            val isSelected = selected == index
            Column(
                modifier = Modifier
                    .weight(1f)
                    .glassEffect(Glass.Regular.interactive(), CapsuleShape)
                    .clickable(
                        interactionSource = null,
                        indication = null,
                        role = Role.Tab,
                        onClick = {
                            selected = index
                            onTabSelected(index)
                        }
                    )
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.spacedBy(2.dp, Alignment.CenterVertically),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                tabContent(index, isSelected)
            }
        }
    }
}
