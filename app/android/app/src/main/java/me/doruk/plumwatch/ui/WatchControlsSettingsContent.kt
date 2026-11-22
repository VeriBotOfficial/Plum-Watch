package me.doruk.plumwatch.ui

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import me.doruk.plumwatch.watch.BleWatchManager

@Composable
fun WatchControlsSettingsContent() {
    val context = LocalContext.current
    val manager = remember(context) { BleWatchManager.getInstance(context) }
    val state by manager.state.collectAsStateWithLifecycle()
    val settings = remember(context) {
        context.getSharedPreferences("plum_watch_device_settings", android.content.Context.MODE_PRIVATE)
    }
    val canSend = state.isConnected && state.supportsProprietaryCommands

    fun report(label: String, queued: Boolean) {
        if (!queued) {
            Toast.makeText(
                context,
                "Could not update $label. Check the watch connection and try again.",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
        Text(
            text = when {
                !state.isConnected -> "Connect your watch to change its settings."
                !state.supportsProprietaryCommands -> "Watch settings are unavailable right now."
                else -> "Ready"
            },
            color = if (canSend) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurfaceVariant,
            fontSize = 12.sp,
            fontWeight = FontWeight.Medium
        )

        LanguageSetting(
            enabled = canSend,
            initialCode = settings.getInt("watch-language", 1),
            onSend = { code -> report("Language", manager.setWatchLanguage(code)) }
        )

        SettingPanel("Time format", "Choose how the watch displays time.") {
            var use24Hour by remember { mutableStateOf(settings.getBoolean("time-format-24h", true)) }
            SettingSwitch(
                title = "24-hour clock",
                subtitle = if (use24Hour) "Currently selected: 24-hour" else "Currently selected: 12-hour",
                checked = use24Hour,
                enabled = canSend,
                onCheckedChange = {
                    val sent = manager.setTimeFormat(it)
                    if (sent) use24Hour = it
                    report("Time format", sent)
                }
            )
        }

        SleepModeSetting(
            enabled = canSend,
            initialEnabled = settings.getBoolean("sleep-active", false),
            initialMode = settings.getInt("sleep-mode", 2),
            initialTracking = settings.getBoolean("sleep-tracking", true),
            initialChargeReminder = settings.getBoolean("sleep-charge-reminder", false)
        ) { active, mode, tracking, chargeReminder ->
            report(
                "Sleep mode",
                manager.setSleepMode(active, mode, tracking, chargeReminder)
            )
        }

        SettingPanel("Display and health") {
            var raiseToWake by remember { mutableStateOf(settings.getBoolean("raise-to-wake", true)) }
            var bodyTemperature by remember { mutableStateOf(settings.getBoolean("body-temperature", false)) }

            SettingSwitch(
                "Raise wrist to wake",
                "Wake the display when you lift your wrist.",
                raiseToWake,
                canSend
            ) {
                val sent = manager.setRaiseToWake(it)
                if (sent) raiseToWake = it
                report("Raise wrist", sent)
            }
            SettingSwitch(
                "Body-temperature measurement",
                "Enable or disable the watch's body-temperature measurement mode.",
                bodyTemperature,
                canSend
            ) {
                val sent = manager.setBodyTemperatureMeasurement(it)
                if (sent) bodyTemperature = it
                report("Body temperature", sent)
            }
        }

    }
}

@Composable
fun NotificationDisplaySettingsContent() {
    val context = LocalContext.current
    val manager = remember(context) { BleWatchManager.getInstance(context) }
    val state by manager.state.collectAsStateWithLifecycle()
    val settings = remember(context) {
        context.getSharedPreferences("plum_watch_device_settings", android.content.Context.MODE_PRIVATE)
    }
    val enabled = state.isConnected && state.supportsProprietaryCommands

    NotificationSetting(
        enabled = enabled,
        initialIcon = settings.getInt("notification-icon", 3),
        initialShow = settings.getBoolean("notification-show", true),
        initialHideDetails = settings.getBoolean("notification-hide-details", false)
    ) { icon, show, hide ->
        val sent = manager.setNotificationDisplay(icon, show, hide)
        if (!sent) {
            Toast.makeText(
                context,
                "Could not update notification display settings.",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}

@Composable
private fun LanguageSetting(
    enabled: Boolean,
    initialCode: Int,
    onSend: (Int) -> Unit
) {
    val languages = listOf(
        1 to "English",
        0 to "Simplified Chinese",
        5 to "Russian",
        6 to "Japanese",
        8 to "German",
        9 to "Korean",
        10 to "Thai",
        11 to "Arabic",
        13 to "French",
        24 to "Vietnamese"
    )
    var selectedCode by remember { mutableStateOf(initialCode) }
    var expanded by remember { mutableStateOf(false) }
    SettingPanel("Watch language", "Choose the language used by your watch.") {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                languages.first { it.first == selectedCode }.second,
                modifier = Modifier.weight(1f),
                color = MaterialTheme.colorScheme.onSurface,
                fontSize = 14.sp
            )
            Spacer(Modifier.width(8.dp))
            TextButton(enabled = enabled, onClick = { expanded = true }) {
                Text("Choose")
            }
            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false },
                containerColor = MaterialTheme.colorScheme.surface,
                tonalElevation = 6.dp
            ) {
                languages.forEach { (code, label) ->
                    DropdownMenuItem(
                        enabled = enabled,
                        text = { Text(label, color = MaterialTheme.colorScheme.onSurface) },
                        onClick = {
                            selectedCode = code
                            expanded = false
                            onSend(code)
                        }
                    )
                }
            }
        }
    }
}

@Composable
private fun SleepModeSetting(
    enabled: Boolean,
    initialEnabled: Boolean,
    initialMode: Int,
    initialTracking: Boolean,
    initialChargeReminder: Boolean,
    onSend: (Boolean, Int, Boolean, Boolean) -> Unit
) {
    var active by remember { mutableStateOf(initialEnabled) }
    var mode by remember { mutableStateOf(initialMode.coerceIn(0, 2)) }
    var tracking by remember { mutableStateOf(initialTracking) }
    var chargeReminder by remember { mutableStateOf(initialChargeReminder) }
    var expanded by remember { mutableStateOf(false) }

    SettingPanel("Sleep mode", "Choose how sleep mode behaves.") {
        SettingSwitch("Enable sleep mode", null, active, enabled) {
            active = it
            onSend(it, mode, tracking, chargeReminder)
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                when (mode) { 0 -> "Off"; 1 -> "Manual"; else -> "Automatic" },
                modifier = Modifier.weight(1f),
                color = MaterialTheme.colorScheme.onSurface,
                fontSize = 13.sp
            )
            TextButton(enabled = enabled, onClick = { expanded = true }) { Text("Mode") }
            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false },
                containerColor = MaterialTheme.colorScheme.surface,
                tonalElevation = 6.dp
            ) {
                listOf(0 to "Off", 1 to "Manual", 2 to "Automatic").forEach { (value, label) ->
                    DropdownMenuItem(
                        text = { Text(label, color = MaterialTheme.colorScheme.onSurface) },
                        onClick = {
                            mode = value
                            expanded = false
                            onSend(active, value, tracking, chargeReminder)
                        }
                    )
                }
            }
        }
        SettingSwitch("Sleep tracking", null, tracking, enabled) {
            tracking = it
            onSend(active, mode, it, chargeReminder)
        }
        SettingSwitch("Charging reminder", null, chargeReminder, enabled) {
            chargeReminder = it
            onSend(active, mode, tracking, it)
        }
    }
}

@Composable
private fun NotificationSetting(
    enabled: Boolean,
    initialIcon: Int,
    initialShow: Boolean,
    initialHideDetails: Boolean,
    onSend: (Int, Boolean, Boolean) -> Unit
) {
    var icon by remember { mutableStateOf(initialIcon.coerceIn(0, 3)) }
    var show by remember { mutableStateOf(initialShow) }
    var hideDetails by remember { mutableStateOf(initialHideDetails) }
    var expanded by remember { mutableStateOf(false) }
    SettingPanel("Notification display", "Choose how notifications appear on your watch.") {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                when (icon) { 0 -> "No icon"; 1 -> "Call"; 2 -> "Message"; else -> "App" },
                modifier = Modifier.weight(1f),
                color = MaterialTheme.colorScheme.onSurface,
                fontSize = 13.sp
            )
            TextButton(enabled = enabled, onClick = { expanded = true }) { Text("Icon") }
            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false },
                containerColor = MaterialTheme.colorScheme.surface,
                tonalElevation = 6.dp
            ) {
                listOf(0 to "No icon", 1 to "Call", 2 to "Message", 3 to "App").forEach { (value, label) ->
                    DropdownMenuItem(
                        text = { Text(label, color = MaterialTheme.colorScheme.onSurface) },
                        onClick = { icon = value; expanded = false; onSend(icon, show, hideDetails) }
                    )
                }
            }
        }
        SettingSwitch("Show notification prompts", null, show, enabled) {
            show = it
            onSend(icon, it, hideDetails)
        }
        SettingSwitch("Hide notification details", null, hideDetails, enabled) {
            hideDetails = it
            onSend(icon, show, it)
        }
    }
}

@Composable
private fun SettingPanel(
    title: String,
    description: String? = null,
    content: @Composable () -> Unit
) {
    AppSurface(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(22.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth().padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Text(title, color = MaterialTheme.colorScheme.onSurface, fontSize = 15.sp, fontWeight = FontWeight.SemiBold)
            if (description != null) {
                Text(description, color = MaterialTheme.colorScheme.onSurfaceVariant, fontSize = 11.sp, lineHeight = 16.sp)
            }
            content()
        }
    }
}

@Composable
private fun SettingSwitch(
    title: String,
    subtitle: String?,
    checked: Boolean,
    enabled: Boolean,
    onCheckedChange: (Boolean) -> Unit
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(modifier = Modifier.weight(1f), verticalArrangement = Arrangement.spacedBy(2.dp)) {
            Text(title, color = MaterialTheme.colorScheme.onSurface, fontSize = 13.sp, fontWeight = FontWeight.Medium)
            if (subtitle != null) {
                Text(subtitle, color = MaterialTheme.colorScheme.onSurfaceVariant, fontSize = 10.sp, lineHeight = 14.sp)
            }
        }
        Switch(checked = checked, onCheckedChange = onCheckedChange, enabled = enabled)
    }
}
