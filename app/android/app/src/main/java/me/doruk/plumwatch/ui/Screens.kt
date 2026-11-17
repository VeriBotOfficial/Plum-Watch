package me.doruk.plumwatch.ui

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Alarm
import androidx.compose.material.icons.outlined.Bluetooth
import androidx.compose.material.icons.outlined.CameraAlt
import androidx.compose.material.icons.outlined.Cloud
import androidx.compose.material.icons.outlined.Code
import androidx.compose.material.icons.outlined.DarkMode
import androidx.compose.material.icons.outlined.DeleteOutline
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.LightMode
import androidx.compose.material.icons.outlined.LocationSearching
import androidx.compose.material.icons.outlined.MusicNote
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.SettingsBrightness
import androidx.compose.material.icons.outlined.Watch
import androidx.compose.material.icons.outlined.Refresh
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.Switch
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.doruk.plumwatch.watch.BleUiState
import me.doruk.plumwatch.watch.WatchDevice
import me.doruk.plumwatch.ui.liquid.LiquidToggle

@Composable
fun PageTitle(title: String) {
    Text(
        text = title,
        color = MaterialTheme.colorScheme.onBackground,
        fontSize = 34.sp,
        lineHeight = 40.sp,
        fontWeight = FontWeight.SemiBold,
        letterSpacing = (-1.15).sp
    )
}

@Composable
fun MyWatchScreen(
    state: BleUiState,
    onStartScan: () -> Unit,
    onStopScan: () -> Unit,
    onConnect: (WatchDevice) -> Unit,
    onDisconnect: () -> Unit,
    onOpenWatchfaces: () -> Unit
) {
    val context = LocalContext.current
    var showRemoveDialog by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 22.dp)
            .padding(top = 27.dp, bottom = 126.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        PageTitle("My Watch")

        when {
            state.isConnected && state.connectedDevice != null -> {
                ConnectedWatchCard(
                    device = state.connectedDevice,
                    onRemove = { showRemoveDialog = true }
                )
            }

            state.isConnecting -> {
                ConnectingWatchCard(
                    deviceName = state.pendingDevice?.name ?: "Your watch"
                )
            }

            else -> {
                DisconnectedWatchCard(
                    scanning = state.isScanning,
                    onClick = if (state.isScanning) onStopScan else onStartScan
                )
            }
        }

        if (state.errorMessage != null) {
            AppSurface(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(18.dp),
            ) {
                Text(
                    text = state.errorMessage,
                    modifier = Modifier.padding(15.dp),
                    color = MaterialTheme.colorScheme.error,
                    fontSize = 12.sp,
                    lineHeight = 18.sp
                )
            }
        }

        if (state.discoveredDevices.isNotEmpty()) {
            NearbyDevicesSection(
                devices = state.discoveredDevices,
                pendingDevice = state.pendingDevice,
                onConnect = onConnect
            )
        }

        Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
            SectionHeading("Quick controls")

            val features = listOf(
                FeatureItem("Notifications", Icons.Outlined.Notifications),
                FeatureItem("Alarms", Icons.Outlined.Alarm),
                FeatureItem("Find watch", Icons.Outlined.LocationSearching),
                FeatureItem("Health", Icons.Outlined.FavoriteBorder),
                FeatureItem("Weather", Icons.Outlined.Cloud),
                FeatureItem("Camera", Icons.Outlined.CameraAlt),
                FeatureItem("Music", Icons.Outlined.MusicNote),
                FeatureItem("Watchfaces", Icons.Outlined.Watch)
            )

            features.chunked(2).forEach { pair ->
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    pair.forEach { feature ->
                        FeatureTile(
                            feature = feature,
                            modifier = Modifier.weight(1f),
                            onClick = {
                                if (feature.title == "Watchfaces") {
                                    onOpenWatchfaces()
                                } else {
                                    Toast.makeText(context, "Not available yet", Toast.LENGTH_SHORT).show()
                                }
                            }
                        )
                    }
                    if (pair.size == 1) Spacer(modifier = Modifier.weight(1f))
                }
            }
        }
    }

    if (showRemoveDialog) {
        AlertDialog(
            onDismissRequest = { showRemoveDialog = false },
            title = { Text("Remove this watch?") },
            confirmButton = {
                TextButton(
                    onClick = {
                        showRemoveDialog = false
                        onDisconnect()
                    }
                ) {
                    Text("Remove", color = MaterialTheme.colorScheme.error)
                }
            },
            dismissButton = {
                TextButton(onClick = { showRemoveDialog = false }) {
                    Text("Cancel")
                }
            }
        )
    }
}

@Composable
private fun DisconnectedWatchCard(
    scanning: Boolean,
    onClick: () -> Unit
) {
    AppSurface(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(30.dp),
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 22.dp, vertical = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(78.dp)
                    .background(
                        MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.68f),
                        CircleShape
                    ),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Outlined.Watch,
                    contentDescription = null,
                    modifier = Modifier.size(39.dp),
                    tint = MaterialTheme.colorScheme.primary
                )
            }

            Text(
                text = if (scanning) "Searching…" else "No watch connected",
                color = MaterialTheme.colorScheme.onSurface,
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold
            )

            PlumActionButton(
                label = if (scanning) "Stop scanning" else "Connect a watch",
                icon = if (scanning) null else Icons.Outlined.Bluetooth,
                onClick = onClick,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(52.dp)
            )
        }
    }
}

@Composable
private fun ConnectingWatchCard(deviceName: String) {
    AppSurface(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(27.dp),
    ) {
        Row(
            modifier = Modifier.padding(22.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            CircularProgressIndicator(
                modifier = Modifier.size(28.dp),
                color = MaterialTheme.colorScheme.primary,
                strokeWidth = 2.5.dp
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                Text(
                    "Connecting",
                    color = MaterialTheme.colorScheme.onSurface,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold
                )
                Text(
                    deviceName,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    fontSize = 12.sp
                )
            }
        }
    }
}

@Composable
private fun ConnectedWatchCard(
    device: WatchDevice,
    onRemove: () -> Unit
) {
    AppSurface(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(29.dp),
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(19.dp),
            verticalArrangement = Arrangement.spacedBy(18.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(
                    modifier = Modifier
                        .size(66.dp)
                        .background(
                            MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.72f),
                            RoundedCornerShape(21.dp)
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        Icons.Outlined.Watch,
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.primary,
                        modifier = Modifier.size(34.dp)
                    )
                }
                Spacer(modifier = Modifier.width(14.dp))
                Column(
                    modifier = Modifier.weight(1f),
                    verticalArrangement = Arrangement.spacedBy(6.dp)
                ) {
                    Text(
                        device.name,
                        color = MaterialTheme.colorScheme.onSurface,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.SemiBold,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Box(
                            Modifier
                                .size(7.dp)
                                .background(Color(0xFF69C58E), CircleShape)
                        )
                        Spacer(Modifier.width(7.dp))
                        Text(
                            "Connected",
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            fontSize = 12.sp
                        )
                    }
                }
            }

            TextButton(
                onClick = onRemove,
                modifier = Modifier.align(Alignment.End)
            ) {
                Icon(
                    Icons.Outlined.DeleteOutline,
                    contentDescription = null,
                    modifier = Modifier.size(17.dp)
                )
                Text("Remove device", modifier = Modifier.padding(start = 6.dp))
            }
        }
    }
}

@Composable
private fun NearbyDevicesSection(
    devices: List<WatchDevice>,
    pendingDevice: WatchDevice?,
    onConnect: (WatchDevice) -> Unit
) {
    Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
        SectionHeading("Nearby devices")

        devices.forEach { device ->
            AppSurface(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(21.dp),
            ) {
                Row(
                    modifier = Modifier.padding(horizontal = 15.dp, vertical = 12.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        Icons.Outlined.Bluetooth,
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.primary
                    )
                    Spacer(modifier = Modifier.width(12.dp))
                    Column(
                        modifier = Modifier.weight(1f),
                        verticalArrangement = Arrangement.spacedBy(3.dp)
                    ) {
                        Text(
                            device.name,
                            color = MaterialTheme.colorScheme.onSurface,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.SemiBold,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                        Text(
                            "${device.rssi} dBm",
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            fontSize = 10.sp
                        )
                    }
                    TextButton(
                        onClick = { onConnect(device) },
                        enabled = pendingDevice?.address != device.address
                    ) {
                        Text(
                            if (pendingDevice?.address == device.address) "Connecting" else "Connect",
                            fontSize = 12.sp
                        )
                    }
                }
            }
        }
    }
}

private data class FeatureItem(
    val title: String,
    val icon: ImageVector
)

@Composable
private fun FeatureTile(
    feature: FeatureItem,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    AppSurface(
        modifier = modifier
            .height(96.dp)
            .clickable(onClick = onClick),
        shape = RoundedCornerShape(22.dp),
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(15.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Icon(
                imageVector = feature.icon,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.primary,
                modifier = Modifier.size(22.dp)
            )
            Text(
                feature.title,
                color = MaterialTheme.colorScheme.onSurface,
                fontSize = 13.sp,
                fontWeight = FontWeight.Medium
            )
        }
    }
}

@Composable
private fun SectionHeading(title: String) {
    Text(
        title,
        color = MaterialTheme.colorScheme.onBackground,
        fontSize = 17.sp,
        fontWeight = FontWeight.SemiBold
    )
}

@Composable
fun SettingsScreen(
    themeMode: String,
    onThemeModeChange: (String) -> Unit,
    uiStyle: String,
    onUiStyleChange: (String) -> Unit,
    appVersion: String,
    checkingUpdates: Boolean,
    updateMessage: String?,
    onCheckUpdates: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 22.dp)
            .padding(top = 27.dp, bottom = 126.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        PageTitle("Settings")

        Column(verticalArrangement = Arrangement.spacedBy(11.dp)) {
            SectionHeading("Appearance")
            AppSurface(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(25.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(14.dp),
                    verticalArrangement = Arrangement.spacedBy(15.dp)
                ) {
                    Text(
                        "Theme",
                        color = MaterialTheme.colorScheme.onSurface,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        ThemeChoice(
                            label = "System",
                            icon = Icons.Outlined.SettingsBrightness,
                            selected = themeMode == "system",
                            modifier = Modifier.weight(1f),
                            onClick = { onThemeModeChange("system") }
                        )
                        ThemeChoice(
                            label = "Light",
                            icon = Icons.Outlined.LightMode,
                            selected = themeMode == "light",
                            modifier = Modifier.weight(1f),
                            onClick = { onThemeModeChange("light") }
                        )
                        ThemeChoice(
                            label = "Dark",
                            icon = Icons.Outlined.DarkMode,
                            selected = themeMode == "dark",
                            modifier = Modifier.weight(1f),
                            onClick = { onThemeModeChange("dark") }
                        )
                    }

                    Text(
                        "Interface",
                        color = MaterialTheme.colorScheme.onSurface,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                    InterfaceStyleChoice(
                        uiStyle = uiStyle,
                        onUiStyleChange = onUiStyleChange
                    )
                }
            }
        }

        Column(verticalArrangement = Arrangement.spacedBy(11.dp)) {
            SectionHeading("App")
            AppSurface(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(24.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(18.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            "Version",
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            fontSize = 13.sp
                        )
                        Spacer(Modifier.weight(1f))
                        Text(
                            appVersion,
                            color = MaterialTheme.colorScheme.onSurface,
                            fontSize = 13.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                    }

                    PlumActionButton(
                        label = if (checkingUpdates) "Checking…" else "Check for updates",
                        icon = Icons.Outlined.Refresh,
                        onClick = onCheckUpdates,
                        enabled = !checkingUpdates,
                        modifier = Modifier.fillMaxWidth()
                    )

                    if (updateMessage != null) {
                        Text(
                            text = updateMessage,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            fontSize = 12.sp,
                            lineHeight = 17.sp
                        )
                    }
                }
            }
        }

        Column(verticalArrangement = Arrangement.spacedBy(11.dp)) {
            SectionHeading("Developers")
            AppSurface(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(25.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(19.dp),
                    verticalArrangement = Arrangement.spacedBy(14.dp)
                ) {
                    DeveloperRow("Doruk Çavdar")
                    DeveloperRow("Troy Mitchell")
                }
            }
        }
    }
}

@Composable
private fun InterfaceStyleChoice(
    uiStyle: String,
    onUiStyleChange: (String) -> Unit
) {
    val backdrop = LocalLiquidBackdrop.current
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            "Classic",
            color = if (uiStyle == "classic") MaterialTheme.colorScheme.primary
            else MaterialTheme.colorScheme.onSurfaceVariant,
            fontSize = 13.sp,
            fontWeight = if (uiStyle == "classic") FontWeight.SemiBold else FontWeight.Medium
        )
        Spacer(Modifier.weight(1f))
        if (backdrop != null) {
            LiquidToggle(
                selected = { uiStyle == "glass" },
                onSelect = { enabled -> onUiStyleChange(if (enabled) "glass" else "classic") },
                backdrop = backdrop
            )
        } else {
            Switch(
                checked = uiStyle == "glass",
                onCheckedChange = { enabled ->
                    onUiStyleChange(if (enabled) "glass" else "classic")
                }
            )
        }
        Spacer(Modifier.weight(1f))
        Text(
            "Liquid Glass",
            color = if (uiStyle == "glass") MaterialTheme.colorScheme.primary
            else MaterialTheme.colorScheme.onSurfaceVariant,
            fontSize = 13.sp,
            fontWeight = if (uiStyle == "glass") FontWeight.SemiBold else FontWeight.Medium
        )
    }
}

@Composable
private fun ThemeChoice(
    label: String,
    icon: ImageVector,
    selected: Boolean,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    AppSurface(
        modifier = modifier
            .height(76.dp)
            .clickable(onClick = onClick),
        shape = RoundedCornerShape(18.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Icon(
                icon,
                contentDescription = null,
                tint = if (selected) MaterialTheme.colorScheme.primary
                else MaterialTheme.colorScheme.onSurfaceVariant
            )
            Text(
                label,
                color = if (selected) MaterialTheme.colorScheme.primary
                else MaterialTheme.colorScheme.onSurfaceVariant,
                fontSize = 11.sp,
                fontWeight = if (selected) FontWeight.SemiBold else FontWeight.Medium
            )
        }
    }
}

@Composable
private fun DeveloperRow(name: String) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Box(
            modifier = Modifier
                .size(31.dp)
                .background(
                    MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.78f),
                    CircleShape
                ),
            contentAlignment = Alignment.Center
        ) {
            Text(
                name.take(1),
                color = MaterialTheme.colorScheme.onSurface,
                fontSize = 11.sp,
                fontWeight = FontWeight.SemiBold
            )
        }
        Spacer(Modifier.width(10.dp))
        Text(
            name,
            color = MaterialTheme.colorScheme.onSurface,
            fontSize = 13.sp,
            fontWeight = FontWeight.Medium
        )
    }
}
