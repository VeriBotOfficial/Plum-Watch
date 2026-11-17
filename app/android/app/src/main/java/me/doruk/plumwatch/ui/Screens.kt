package me.doruk.plumwatch.ui

import android.content.Context
import android.graphics.BitmapFactory
import android.widget.Toast
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.ui.draw.clip
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
import androidx.compose.material.icons.outlined.CheckCircle
import androidx.compose.material.icons.outlined.Download
import androidx.compose.material.icons.outlined.Layers
import androidx.compose.material.icons.outlined.Widgets
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
import androidx.compose.material3.AlertDialog as MaterialAlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.doruk.plumwatch.data.AppUpdateDownloadState
import me.doruk.plumwatch.data.AppUpdateInfo
import me.doruk.plumwatch.watch.BleUiState
import me.doruk.plumwatch.watch.WatchDevice
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.File
import java.net.HttpURLConnection
import java.net.URL

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
    onReconnect: () -> Unit,
    onRemoveWatch: () -> Unit,
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

        val connectionPresentation = when {
            state.isConnected -> "connected"
            state.isConnecting -> "connecting"
            state.savedDevice != null -> "reconnecting"
            else -> "disconnected"
        }

        AnimatedContent(
            targetState = connectionPresentation,
            label = "watch-connection-card"
        ) { presentation ->
            when (presentation) {
                "connected" -> state.connectedDevice?.let { device ->
                    ConnectedWatchCard(device = device)
                }
                "connecting" -> ConnectingWatchCard(
                    deviceName = state.pendingDevice?.name ?: state.savedDevice?.name ?: "Your watch"
                )
                "reconnecting" -> state.savedDevice?.let { device ->
                    ReconnectingWatchCard(
                        deviceName = device.name,
                        connectionMessage = state.connectionMessage,
                        onReconnect = onReconnect
                    )
                }
                else -> DisconnectedWatchCard(
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

        AnimatedVisibility(
            visible = state.savedDevice == null &&
                !state.isConnected &&
                !state.isConnecting &&
                state.discoveredDevices.isNotEmpty(),
            enter = fadeIn(tween(180)) + expandVertically(tween(220)),
            exit = fadeOut(tween(140)) + shrinkVertically(tween(180))
        ) {
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

        AnimatedVisibility(
            visible = state.savedDevice != null,
            enter = fadeIn(tween(180)),
            exit = fadeOut(tween(140))
        ) {
            TextButton(
                onClick = { showRemoveDialog = true },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp)
            ) {
                Icon(
                    Icons.Outlined.DeleteOutline,
                    contentDescription = null,
                    modifier = Modifier.size(18.dp)
                )
                Text("Remove device", modifier = Modifier.padding(start = 7.dp))
            }
        }
    }

    if (showRemoveDialog) {
        AppAlertDialog(
            onDismissRequest = { showRemoveDialog = false },
            title = {
                Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                    Text("Remove this watch?")
                    Text(
                        "This will unpair the watch from Plum Watch, remove its saved connection, and stop automatic reconnection. You can connect it again later.",
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        fontSize = 13.sp,
                        lineHeight = 18.sp
                    )
                }
            },
            confirmButton = {
                TextButton(
                    onClick = {
                        showRemoveDialog = false
                        onRemoveWatch()
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
                    .height(52.dp),
                loading = scanning
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
            PlumProgressLabel(
                label = "Connecting",
                modifier = Modifier.width(132.dp)
            )
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
private fun ReconnectingWatchCard(
    deviceName: String,
    connectionMessage: String,
    onReconnect: () -> Unit
) {
    AppSurface(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(27.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(22.dp),
            verticalArrangement = Arrangement.spacedBy(13.dp)
        ) {
            PlumProgressLabel(label = "Reconnecting")
            Text(
                deviceName,
                color = MaterialTheme.colorScheme.onSurface,
                fontSize = 17.sp,
                fontWeight = FontWeight.SemiBold
            )
            Text(
                connectionMessage,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                fontSize = 12.sp
            )
            TextButton(
                onClick = onReconnect,
                modifier = Modifier.align(Alignment.End)
            ) {
                Icon(Icons.Outlined.Refresh, contentDescription = null, modifier = Modifier.size(17.dp))
                Text("Try again", modifier = Modifier.padding(start = 6.dp))
            }
        }
    }
}

@Composable
private fun ConnectedWatchCard(device: WatchDevice) {
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
    AppClickableSurface(
        onClick = onClick,
        modifier = modifier.height(96.dp),
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
    availableUpdate: AppUpdateInfo?,
    downloadState: AppUpdateDownloadState,
    onCheckUpdates: () -> Unit,
    onInstallUpdate: (AppUpdateInfo) -> Unit
) {
    val installButtonColor by animateColorAsState(
        targetValue = if (availableUpdate != null) Color(0xFF248B55)
        else MaterialTheme.colorScheme.primary,
        animationSpec = tween(durationMillis = 320),
        label = "update-button-color"
    )
    val updateBusy = checkingUpdates || downloadState.isDownloading || downloadState.isOpeningInstaller
    val updateButtonLabel = when {
        checkingUpdates -> "Checking…"
        downloadState.isDownloading -> "Downloading…"
        downloadState.isOpeningInstaller -> "Opening installer…"
        availableUpdate != null -> "Install ${availableUpdate.versionName}"
        else -> "Check for updates"
    }
    val downloadProgress = downloadState.progress?.coerceIn(0f, 1f)

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
                }
            }
        }

        Column(verticalArrangement = Arrangement.spacedBy(11.dp)) {
            SectionHeading("Interface")
            InterfaceStyleChoice(
                uiStyle = uiStyle,
                onUiStyleChange = onUiStyleChange
            )
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

                    Button(
                        onClick = {
                            val update = availableUpdate
                            if (update != null) onInstallUpdate(update) else onCheckUpdates()
                        },
                        enabled = !updateBusy,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(52.dp),
                        shape = RoundedCornerShape(16.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = installButtonColor,
                            contentColor = Color.White,
                            disabledContainerColor = installButtonColor.copy(alpha = 0.68f),
                            disabledContentColor = Color.White
                        )
                    ) {
                        if (updateBusy) {
                            CircularProgressIndicator(
                                modifier = Modifier.size(18.dp),
                                color = Color.White,
                                strokeWidth = 2.dp
                            )
                        } else if (availableUpdate != null) {
                            Icon(Icons.Outlined.Download, contentDescription = null)
                        } else {
                            Icon(Icons.Outlined.Refresh, contentDescription = null)
                        }
                        Spacer(Modifier.width(9.dp))
                        AnimatedContent(
                            targetState = updateButtonLabel,
                            label = "update-button-label"
                        ) { label ->
                            Text(
                                text = label,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.SemiBold
                            )
                        }
                    }

                    if (downloadState.isDownloading || downloadState.isOpeningInstaller) {
                        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    if (downloadState.isOpeningInstaller) "Download complete"
                                    else "Downloading update",
                                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Medium
                                )
                                Spacer(Modifier.weight(1f))
                                if (downloadProgress != null) {
                                    Text(
                                        (downloadProgress * 100f).toInt().toString() + "%",
                                        color = MaterialTheme.colorScheme.onSurface,
                                        fontSize = 12.sp,
                                        fontWeight = FontWeight.SemiBold
                                    )
                                }
                            }

                            if (downloadProgress == null) {
                                LinearProgressIndicator(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(5.dp)
                                )
                            } else {
                                LinearProgressIndicator(
                                    progress = { downloadProgress },
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(5.dp),
                                    color = if (downloadState.isOpeningInstaller) Color(0xFF248B55)
                                    else MaterialTheme.colorScheme.primary,
                                    trackColor = MaterialTheme.colorScheme.surfaceVariant
                                )
                            }
                        }
                    }

                    val visibleMessage = downloadState.errorMessage
                        ?: updateMessage.takeUnless {
                            downloadState.isDownloading || downloadState.isOpeningInstaller
                        }
                    if (visibleMessage != null) {
                        Text(
                            text = visibleMessage,
                            color = if (downloadState.errorMessage != null) MaterialTheme.colorScheme.error
                            else MaterialTheme.colorScheme.onSurfaceVariant,
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
                    DeveloperRow("Doruk Çavdar", "VeriBotOfficial")
                    DeveloperRow("Troy Mitchell", "TroyMitchell911")
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
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        InterfaceChoiceCard(
            label = "Classic",
            description = "Original navigation",
            icon = Icons.Outlined.Widgets,
            selected = uiStyle == "classic",
            modifier = Modifier.weight(1f),
            onClick = { onUiStyleChange("classic") }
        )
        InterfaceChoiceCard(
            label = "Liquid Glass",
            description = "Floating glass bar",
            icon = Icons.Outlined.Layers,
            selected = uiStyle == "glass",
            modifier = Modifier.weight(1f),
            onClick = { onUiStyleChange("glass") }
        )
    }
}

@Composable
private fun InterfaceChoiceCard(
    label: String,
    description: String,
    icon: ImageVector,
    selected: Boolean,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    val containerColor by animateColorAsState(
        targetValue = if (selected) MaterialTheme.colorScheme.primary.copy(alpha = 0.09f)
        else MaterialTheme.colorScheme.surface,
        animationSpec = tween(durationMillis = 220),
        label = "interface-choice-background"
    )
    val borderColor by animateColorAsState(
        targetValue = if (selected) MaterialTheme.colorScheme.primary.copy(alpha = 0.72f)
        else MaterialTheme.colorScheme.outline.copy(alpha = 0.38f),
        animationSpec = tween(durationMillis = 220),
        label = "interface-choice-border"
    )

    Surface(
        onClick = onClick,
        modifier = modifier.height(112.dp),
        shape = RoundedCornerShape(19.dp),
        color = containerColor,
        border = BorderStroke(1.dp, borderColor)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(14.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = icon,
                    contentDescription = null,
                    tint = if (selected) MaterialTheme.colorScheme.primary
                    else MaterialTheme.colorScheme.onSurfaceVariant,
                    modifier = Modifier.size(22.dp)
                )
                Spacer(Modifier.weight(1f))
                if (selected) {
                    Icon(
                        imageVector = Icons.Outlined.CheckCircle,
                        contentDescription = "Selected",
                        tint = MaterialTheme.colorScheme.primary,
                        modifier = Modifier.size(19.dp)
                    )
                }
            }
            Column(verticalArrangement = Arrangement.spacedBy(3.dp)) {
                Text(
                    text = label,
                    color = MaterialTheme.colorScheme.onSurface,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.SemiBold
                )
                Text(
                    text = description,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    fontSize = 10.sp,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
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
    AppClickableSurface(
        onClick = onClick,
        modifier = modifier.height(76.dp),
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
private fun DeveloperRow(name: String, githubUsername: String) {
    val context = LocalContext.current
    var avatar by remember(githubUsername) { mutableStateOf<ImageBitmap?>(null) }

    LaunchedEffect(githubUsername) {
        avatar = loadGitHubAvatar(context, githubUsername)
    }

    Row(verticalAlignment = Alignment.CenterVertically) {
        Box(
            modifier = Modifier
                .size(31.dp)
                .clip(CircleShape)
                .background(MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.78f)),
            contentAlignment = Alignment.Center
        ) {
            val profileImage = avatar
            if (profileImage != null) {
                Image(
                    bitmap = profileImage,
                    contentDescription = "$name GitHub profile picture",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
            } else {
                Text(
                    name.take(1),
                    color = MaterialTheme.colorScheme.onSurface,
                    fontSize = 11.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }
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

private suspend fun loadGitHubAvatar(
    context: Context,
    username: String
): ImageBitmap? = withContext(Dispatchers.IO) {
    val cacheDirectory = File(context.filesDir, "github-avatar-cache")
    if (!cacheDirectory.exists() && !cacheDirectory.mkdirs()) {
        return@withContext null
    }

    val cacheFile = File(cacheDirectory, "$username.png")
    val cacheIsStale = !cacheFile.exists() ||
        System.currentTimeMillis() - cacheFile.lastModified() > GITHUB_AVATAR_CACHE_MAX_AGE_MS

    if (cacheIsStale) {
        var connection: HttpURLConnection? = null
        try {
            val request = (URL("https://github.com/$username.png?size=160")
                .openConnection() as HttpURLConnection)
            connection = request
            request.connectTimeout = 8_000
            request.readTimeout = 8_000
            request.instanceFollowRedirects = true
            request.setRequestProperty("User-Agent", "Plum-Watch-Android")
            request.setRequestProperty("Accept", "image/png,image/*;q=0.8")

            if (request.responseCode in 200..299) {
                val imageBytes = request.inputStream.use { it.readBytes() }
                if (imageBytes.isNotEmpty() && imageBytes.size <= MAX_GITHUB_AVATAR_BYTES) {
                    val temporaryFile = File(cacheDirectory, "$username.tmp")
                    temporaryFile.writeBytes(imageBytes)
                    if (!temporaryFile.renameTo(cacheFile)) {
                        temporaryFile.delete()
                        cacheFile.writeBytes(imageBytes)
                    }
                }
            }
        } catch (_: Exception) {
            // Keep showing the last cached profile picture when GitHub is unavailable.
        } finally {
            connection?.disconnect()
        }
    }

    BitmapFactory.decodeFile(cacheFile.absolutePath)?.asImageBitmap()
}

private const val GITHUB_AVATAR_CACHE_MAX_AGE_MS = 7L * 24 * 60 * 60 * 1_000
private const val MAX_GITHUB_AVATAR_BYTES = 2 * 1024 * 1024


@Composable
private fun AppAlertDialog(
    onDismissRequest: () -> Unit,
    title: @Composable () -> Unit,
    confirmButton: @Composable () -> Unit,
    dismissButton: (@Composable () -> Unit)? = null
) {
    MaterialAlertDialog(
        onDismissRequest = onDismissRequest,
        title = title,
        confirmButton = confirmButton,
        dismissButton = dismissButton,
        containerColor = MaterialTheme.colorScheme.surface,
        titleContentColor = MaterialTheme.colorScheme.onSurface,
        textContentColor = MaterialTheme.colorScheme.onSurfaceVariant
    )
}
