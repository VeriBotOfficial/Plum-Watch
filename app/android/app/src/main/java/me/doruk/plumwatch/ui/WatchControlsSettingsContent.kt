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
            onSend = { code -> report("Language", manager.setWatchLanguage(code)) }
        )

        SettingPanel("Time format", "Choose how the watch displays time.") {
            var use24Hour by remember { mutableStateOf(true) }
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

        SettingPanel("Display and health") {
            var raiseToWake by remember { mutableStateOf(true) }
            var autoHealth by remember { mutableStateOf(false) }
            var bodyTemperature by remember { mutableStateOf(false) }

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
                "Automatic health measurements",
                "Enable the watch's automatic heart-rate / SpO₂ measurement mode.",
                autoHealth,
                canSend
            ) {
                val sent = manager.setAutomaticHealthMeasurements(it)
                if (sent) autoHealth = it
                report("Automatic health measurements", sent)
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
    val enabled = state.isConnected && state.supportsProprietaryCommands

    NotificationSetting(enabled = enabled) { icon, show, hide ->
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
    var selectedCode by remember { mutableStateOf(1) }
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
                expanded = expanded,\n                onDismissRequest = { expanded = false },\n                containerColor = MaterialTheme.colorScheme.surface,\n                tonalElevation = 6.dp\n            ) {
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
    onSend: (Boolean, Int, Boolean, Boolean) -> Unit
) {
    var active by remember { mutableStateOf(false) }
    var mode by remember { mutableStateOf(2) }
    var tracking by remember { mutableStateOf(true) }
    var chargeReminder by remember { mutableStateOf(false) }
    var expanded by remember { mutableStateOf(false) }

    SettingPanel("Sleep mode", "Choose how sleep mode behaves.") {
        SettingSwitch("Enable sleep mode", null, active, enabled) { active = it }
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
                    DropdownMenuItem(text = { Text(label, color = MaterialTheme.colorScheme.onSurface) }, onClick = { mode = value; expanded = false })
                }
            }
        }
        SettingSwitch("Sleep tracking", null, tracking, enabled) { tracking = it }
        SettingSwitch("Charging reminder", null, chargeReminder, enabled) { chargeReminder = it }
        Button(
            onClick = { onSend(active, mode, tracking, chargeReminder) },
            enabled = enabled,
            modifier = Modifier.fillMaxWidth()
        ) { Text("Send sleep settings") }
    }
}

@Composable
private fun ReminderSetting(
    title: String,
    description: String,
    enabled: Boolean,
    onSend: (Boolean, Int, Int, Int, Int, Int) -> Boolean,
    onResult: (Boolean) -> Unit
) {
    val context = LocalContext.current
    var active by remember { mutableStateOf(false) }
    var startTime by remember { mutableStateOf("09:00") }
    var endTime by remember { mutableStateOf("21:00") }
    var interval by remember { mutableStateOf("60") }

    SettingPanel(title, description) {
        SettingSwitch("Enable reminder", null, active, enabled) { active = it }
        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            OutlinedTextField(
                value = startTime,
                onValueChange = { startTime = it },
                label = { Text("Start (HH:mm)") },
                modifier = Modifier.weight(1f),
                singleLine = true,
                enabled = enabled
            )
            OutlinedTextField(
                value = endTime,
                onValueChange = { endTime = it },
                label = { Text("End (HH:mm)") },
                modifier = Modifier.weight(1f),
                singleLine = true,
                enabled = enabled
            )
        }
        OutlinedTextField(
            value = interval,
            onValueChange = { interval = it.filter(Char::isDigit).take(3) },
            label = { Text("Interval (minutes)") },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true,
            enabled = enabled,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        Button(
            onClick = {
                val start = parseClock(startTime)
                val end = parseClock(endTime)
                val minutes = interval.toIntOrNull()
                if (start == null || end == null || minutes == null || minutes !in 1..255) {
                    Toast.makeText(
                        context,
                        "Enter valid HH:mm times and an interval from 1 to 255.",
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                    onResult(onSend(active, start.first, start.second, end.first, end.second, minutes))
                }
            },
            modifier = Modifier.fillMaxWidth(),
            enabled = enabled
        ) { Text("Send reminder") }
    }
}

private fun parseClock(value: String): Pair<Int, Int>? {
    val parts = value.split(':')
    if (parts.size != 2) return null
    val hour = parts[0].toIntOrNull() ?: return null
    val minute = parts[1].toIntOrNull() ?: return null
    return if (hour in 0..23 && minute in 0..59) hour to minute else null
}

@Composable
private fun NotificationSetting(
    enabled: Boolean,
    onSend: (Int, Boolean, Boolean) -> Unit
) {
    var icon by remember { mutableStateOf(3) }
    var show by remember { mutableStateOf(true) }
    var hideDetails by remember { mutableStateOf(false) }
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
                    DropdownMenuItem(text = { Text(label, color = MaterialTheme.colorScheme.onSurface) }, onClick = { icon = value; expanded = false })
                }
            }
        }
        SettingSwitch("Show notification prompts", null, show, enabled) { show = it }
        SettingSwitch("Hide notification details", null, hideDetails, enabled) { hideDetails = it }
        Button(onClick = { onSend(icon, show, hideDetails) }, enabled = enabled, modifier = Modifier.fillMaxWidth()) {
            Text("Send notification settings")
        }
    }
}

@Composable
private fun TrainingSetting(
    enabled: Boolean,
    onSend: (Boolean, Boolean, Boolean, Boolean) -> Unit
) {
    var autoPause by remember { mutableStateOf(false) }
    var startPrompt by remember { mutableStateOf(true) }
    var stopPrompt by remember { mutableStateOf(true) }
    var keyPause by remember { mutableStateOf(false) }
    SettingPanel("Physical training", "Set automatic pause and workout prompts.") {
        SettingSwitch("Auto-pause", null, autoPause, enabled) { autoPause = it }
        SettingSwitch("Start prompt", null, startPrompt, enabled) { startPrompt = it }
        SettingSwitch("Stop prompt", null, stopPrompt, enabled) { stopPrompt = it }
        SettingSwitch("Button pause", null, keyPause, enabled) { keyPause = it }
        Button(
            onClick = { onSend(autoPause, startPrompt, stopPrompt, keyPause) },
            enabled = enabled,
            modifier = Modifier.fillMaxWidth()
        ) { Text("Send training settings") }
    }
}

@Composable
private fun HeartRateZonesSetting(
    enabled: Boolean,
    onSend: (List<Int>) -> Unit
) {
    val context = LocalContext.current
    var values by remember { mutableStateOf("") }
    SettingPanel(
        "Heart-rate warning",
        "Set the eight thresholds used for heart-rate alerts."
    ) {
        OutlinedTextField(
            value = values,
            onValueChange = { values = it },
            modifier = Modifier.fillMaxWidth(),
            label = { Text("Eight values, comma-separated") },
            placeholder = { Text("e.g. 100,120,130,140,150,160,170,180") },
            enabled = enabled,
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        Button(
            onClick = {
                val parsed = values.split(',').mapNotNull { it.trim().toIntOrNull() }
                if (parsed.size != 8 || parsed.any { it !in 0..255 }) {
                    Toast.makeText(
                        context,
                        "Enter exactly eight whole-number values from 0 to 255.",
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                    onSend(parsed)
                }
            },
            enabled = enabled,
            modifier = Modifier.fillMaxWidth()
        ) { Text("Send heart-rate zones") }
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
