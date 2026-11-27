package me.doruk.plumwatch.ui

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FirmwareSimulatorScreen(onBack: () -> Unit) {
    BackHandler(onBack = onBack)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 24.dp, vertical = 32.dp),
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        Text(
            text = "Firmware Simulator",
            color = MaterialTheme.colorScheme.onBackground,
            fontSize = 28.sp,
            fontWeight = FontWeight.SemiBold,
            letterSpacing = (-0.7).sp
        )
        Text(
            text = "The real Android simulator is not available yet.",
            color = MaterialTheme.colorScheme.onBackground,
            fontSize = 17.sp,
            fontWeight = FontWeight.Medium
        )
        Text(
            text = "The current SiFli firmware project builds its genuine pc_hcpu simulator for Windows. Its simulator backend uses Windows-specific platform code; the SDK project does not currently provide an Android host target.",
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            style = MaterialTheme.typography.bodyMedium
        )
        Text(
            text = "This screen will remain unavailable rather than showing a Kotlin imitation. A real Android version requires porting the firmware runtime, RT-Thread platform layer, and LVGL display/input backend, then compiling that native firmware runtime for Android.",
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            style = MaterialTheme.typography.bodyMedium
        )
    }
}
