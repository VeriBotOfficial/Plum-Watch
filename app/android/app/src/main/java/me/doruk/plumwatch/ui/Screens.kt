package me.doruk.plumwatch.ui

import android.content.Context
import android.graphics.BitmapFactory
import android.widget.Toast
import androidx.activity.compose.BackHandler
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.slideOutVertically
import androidx.compose.animation.togetherWith
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
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material.icons.outlined.Bluetooth
import androidx.compose.material.icons.outlined.ChevronRight
import androidx.compose.material.icons.outlined.CameraAlt
import androidx.compose.material.icons.outlined.CheckCircle
import androidx.compose.material.icons.outlined.Check
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
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Palette
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
import kotlin.math.roundToInt
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
fun PlumDownloadButton(
    label: String,
    downloading: Boolean,
    progress: Float?,
    downloaded: Boolean,
    enabled: Boolean = true,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    showActivityIndicator: Boolean = false,
    downloadingLabel: String = "Downloading…",
    successLabel: String = "Downloaded"
) {
    val shape = RoundedCornerShape(18.dp)
    val targetProgress = when {
        downloaded -> 1f
        downloading -> (progress ?: 0.035f).coerceIn(0f, 1f)
        else -> 0f
    }
    val animatedProgress by animateFloatAsState(
        targetValue = targetProgress,
        animationSpec = tween(260, easing = FastOutSlowInEasing),
        label = "plum-download-fill"
    )
    val backgroundColor by animateColorAsState(
        targetValue = when {
            downloaded -> Color(0xFF248B55)
            downloading -> MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.82f)
            else -> MaterialTheme.colorScheme.primary.copy(alpha = 0.13f)
        },
        animationSpec = tween(520, easing = FastOutSlowInEasing),
        label = "plum-download-background"
    )
    val foregroundColor = when {
        downloaded -> Color.White
        downloading || showActivityIndicator -> MaterialTheme.colorScheme.onSurface
        else -> MaterialTheme.colorScheme.primary
    }
    val displayedLabel = when {
        downloaded -> successLabel
        downloading -> downloadingLabel
        else -> label
    }
    val indicatorVisible = downloading || showActivityIndicator

    Box(
        modifier = modifier.height(62.dp).clip(shape).background(backgroundColor)
            .clickable(enabled = enabled && !downloading && !showActivityIndicator, onClick = onClick),
        contentAlignment = Alignment.Center
    ) {
        if (downloading) {
            Box(
                Modifier.fillMaxWidth(animatedProgress).fillMaxSize()
                    .background(MaterialTheme.colorScheme.primary.copy(alpha = 0.28f))
                    .align(Alignment.CenterStart)
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            AnimatedContent(
                targetState = when {
                    downloaded -> "done"
                    indicatorVisible -> "progress"
                    else -> "download"
                },
                transitionSpec = {
                    (fadeIn(tween(260)) + slideInVertically(
                        animationSpec = tween(360, easing = FastOutSlowInEasing),
                        initialOffsetY = { it / 3 }
                    )) togetherWith (fadeOut(tween(180)) + slideOutVertically(
                        animationSpec = tween(240, easing = FastOutSlowInEasing),
                        targetOffsetY = { -it / 4 }
                    ))
                },
                label = "plum-download-leading-indicator"
            ) { state ->
                Box(Modifier.size(19.dp), contentAlignment = Alignment.Center) {
                    when (state) {
                        "done" -> Icon(Icons.Outlined.Check, contentDescription = null, tint = foregroundColor, modifier = Modifier.size(19.dp))
                        "progress" -> CircularProgressIndicator(
                            modifier = Modifier.size(17.dp),
                            color = foregroundColor,
                            trackColor = foregroundColor.copy(alpha = 0.18f),
                            strokeWidth = 2.dp
                        )
                        else -> Icon(Icons.Outlined.Download, contentDescription = null, tint = foregroundColor, modifier = Modifier.size(19.dp))
                    }
                }
            }
            Spacer(Modifier.width(9.dp))
            AnimatedContent(
                targetState = displayedLabel,
                transitionSpec = {
                    (fadeIn(tween(300)) + slideInVertically(
                        animationSpec = tween(420, easing = FastOutSlowInEasing),
                        initialOffsetY = { it / 2 }
                    )) togetherWith (fadeOut(tween(190)) + slideOutVertically(
                        animationSpec = tween(300, easing = FastOutSlowInEasing),
                        targetOffsetY = { -it / 3 }
                    ))
                },
                label = "plum-download-label"
            ) { text ->
                Text(
                    text = text,
                    color = foregroundColor,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold,
                    maxLines = 1
                )
            }
            if (downloading && progress != null) {
                Spacer(Modifier.width(10.dp))
                Text(
                    text = "${(animatedProgress * 100f).roundToInt()}%",
                    color = foregroundColor.copy(alpha = 0.88f),
                    fontSize = 13.sp,
                    fontWeight = FontWeight.SemiBold,
                    maxLines = 1
                )
            }
        }
    }
}

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
    onOpenWatchfaces: () -> Unit,
    onFindWatch: () -> Unit,
    onRefreshHealth: () -> Unit
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
                    ConnectedWatchCard(
                        device = device,
                        batteryPercent = state.batteryPercent,
                        heartRateBpm = state.heartRateBpm,
                        supportsBattery = state.supportsBattery,
                        supportsHeartRate = state.supportsHeartRate,
                        supportsTimeSync = state.supportsTimeSync,
                        lastTimeSyncAt = state.lastTimeSyncAt
                    )
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
                                when (feature.title) {
                                    "Watchfaces" -> onOpenWatchfaces()
                                    "Find watch" -> {
                                        if (state.canFindWatch) onFindWatch()
                                        else Toast.makeText(
                                            context,
                                            "This watch does not expose the standard Find Watch service.",
                                            Toast.LENGTH_SHORT
                                        ).show()
                                    }
                                    "Health" -> {
                                        onRefreshHealth()
                                        val readings = listOfNotNull(
                                            state.heartRateBpm?.let { "$it bpm" },
                                            state.batteryPercent?.let { "Battery $it%" }
                                        )
                                        val message = when {
                                            readings.isNotEmpty() -> readings.joinToString(" · ")
                                            state.supportsHeartRate -> "Waiting for a heart-rate measurement from the watch."
                                            else -> "This watch does not expose the standard BLE heart-rate service."
                                        }
                                        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
                                    }
                                    else -> Toast.makeText(
                                        context,
                                        "Not available yet",
                                        Toast.LENGTH_SHORT
                                    ).show()
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
private fun ConnectedWatchCard(
    device: WatchDevice,
    batteryPercent: Int?,
    heartRateBpm: Int?,
    supportsBattery: Boolean,
    supportsHeartRate: Boolean,
    supportsTimeSync: Boolean,
    lastTimeSyncAt: Long?
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

                    if (supportsTimeSync) {
                        Text(
                            text = if (lastTimeSyncAt != null) "Time synchronized" else "Time sync available",
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            fontSize = 11.sp
                        )
                    }
                }
            }

            if (supportsBattery || supportsHeartRate) {
                Row(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
                    if (supportsHeartRate) {
                        WatchMetric(
                            label = "Heart rate",
                            value = heartRateBpm?.let { "$it bpm" } ?: "Waiting",
                            modifier = Modifier.weight(1f)
                        )
                    }
                    if (supportsBattery) {
                        WatchMetric(
                            label = "Battery",
                            value = batteryPercent?.let { "$it%" } ?: "Reading",
                            modifier = Modifier.weight(1f)
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun WatchMetric(
    label: String,
    value: String,
    modifier: Modifier = Modifier
) {
    AppSurface(
        modifier = modifier,
        shape = RoundedCornerShape(16.dp)
    ) {
        Column(
            modifier = Modifier.padding(horizontal = 13.dp, vertical = 11.dp),
            verticalArrangement = Arrangement.spacedBy(5.dp)
        ) {
            Text(label, color = MaterialTheme.colorScheme.onSurfaceVariant, fontSize = 10.sp)
            Text(
                value,
                color = MaterialTheme.colorScheme.onSurface,
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold
            )
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

private enum class SettingsCategory(
    val title: String,
    val icon: ImageVector
) {
    APPEARANCE("Appearance", Icons.Outlined.Palette),
    UPDATES("App updates", Icons.Outlined.Download),
    ABOUT("About", Icons.Outlined.Info)
}

@Composable
fun SettingsScreen(
    themeMode: String,
    onThemeModeChange: (String) -> Unit,
    uiStyle: String,
    onUiStyleChange: (String) -> Unit,
    colorPalette: String,
    onColorPaletteChange: (String) -> Unit,
    appVersion: String,
    checkingUpdates: Boolean,
    updateMessage: String?,
    availableUpdate: AppUpdateInfo?,
    downloadState: AppUpdateDownloadState,
    onCheckUpdates: () -> Unit,
    onInstallUpdate: (AppUpdateInfo) -> Unit
) {
    var selectedCategory by remember { mutableStateOf<SettingsCategory?>(null) }

    BackHandler(enabled = selectedCategory != null) {
        selectedCategory = null
    }

    AnimatedContent(
        targetState = selectedCategory,
        modifier = Modifier.fillMaxSize(),
        transitionSpec = {
            val direction = if (targetState == null) -1 else 1
            (fadeIn(tween(180)) + slideInHorizontally(
                animationSpec = tween(220, easing = FastOutSlowInEasing),
                initialOffsetX = { width -> direction * (width / 22) }
            )) togetherWith
                (fadeOut(tween(125)) + slideOutHorizontally(
                    animationSpec = tween(180, easing = FastOutSlowInEasing),
                    targetOffsetX = { width -> -direction * (width / 28) }
                ))
        },
        label = "settings-category-transition"
    ) { category ->
        if (category == null) {
            SettingsHomeScreen(
                themeMode = themeMode,
                uiStyle = uiStyle,
                colorPalette = colorPalette,
                appVersion = appVersion,
                onOpenCategory = { selectedCategory = it }
            )
        } else {
            SettingsCategoryPage(
                category = category,
                themeMode = themeMode,
                onThemeModeChange = onThemeModeChange,
                uiStyle = uiStyle,
                onUiStyleChange = onUiStyleChange,
                colorPalette = colorPalette,
                onColorPaletteChange = onColorPaletteChange,
                appVersion = appVersion,
                checkingUpdates = checkingUpdates,
                updateMessage = updateMessage,
                availableUpdate = availableUpdate,
                downloadState = downloadState,
                onCheckUpdates = onCheckUpdates,
                onInstallUpdate = onInstallUpdate,
                onBack = { selectedCategory = null }
            )
        }
    }
}

@Composable
private fun SettingsHomeScreen(
    themeMode: String,
    uiStyle: String,
    colorPalette: String,
    appVersion: String,
    onOpenCategory: (SettingsCategory) -> Unit
) {
    val themeLabel = when (themeMode) {
        "light" -> "Light"
        "dark" -> "Dark"
        else -> "System"
    }
    val styleLabel = if (uiStyle == "glass") "Liquid Glass" else "Classic"
    val paletteLabel = PlumPalettes.firstOrNull { it.id == colorPalette }?.name ?: "Plum"

    Column(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 22.dp)
            .padding(top = 27.dp, bottom = 126.dp),
        verticalArrangement = Arrangement.spacedBy(18.dp)
    ) {
        PageTitle("Settings")

        Column(verticalArrangement = Arrangement.spacedBy(9.dp)) {
            SettingsGroupLabel("PREFERENCES")
            AppSurface(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(23.dp)
            ) {
                Column {
                    SettingsCategoryRow(
                        category = SettingsCategory.APPEARANCE,
                        value = themeLabel + " · " + paletteLabel + " · " + styleLabel,
                        onClick = { onOpenCategory(SettingsCategory.APPEARANCE) }
                    )
                    SettingsRowDivider()
                    SettingsCategoryRow(
                        category = SettingsCategory.UPDATES,
                        value = appVersion,
                        onClick = { onOpenCategory(SettingsCategory.UPDATES) }
                    )
                }
            }
        }

        Column(verticalArrangement = Arrangement.spacedBy(9.dp)) {
            SettingsGroupLabel("INFORMATION")
            AppSurface(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(23.dp)
            ) {
                SettingsCategoryRow(
                    category = SettingsCategory.ABOUT,
                    value = null,
                    onClick = { onOpenCategory(SettingsCategory.ABOUT) }
                )
            }
        }
    }
}

@Composable
private fun SettingsGroupLabel(label: String) {
    Text(
        text = label,
        color = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.78f),
        fontSize = 10.sp,
        fontWeight = FontWeight.SemiBold,
        letterSpacing = 1.05.sp,
        modifier = Modifier.padding(start = 4.dp)
    )
}

@Composable
private fun SettingsRowDivider() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 68.dp, end = 14.dp)
            .height(1.dp)
            .background(MaterialTheme.colorScheme.outline.copy(alpha = 0.20f))
    )
}

@Composable
private fun SettingsCategoryRow(
    category: SettingsCategory,
    value: String?,
    onClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
            .padding(horizontal = 14.dp, vertical = 13.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Box(
            modifier = Modifier
                .size(40.dp)
                .background(
                    MaterialTheme.colorScheme.primary.copy(alpha = 0.105f),
                    RoundedCornerShape(13.dp)
                ),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = category.icon,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.primary,
                modifier = Modifier.size(20.dp)
            )
        }

        Text(
            text = category.title,
            modifier = Modifier.weight(1f),
            color = MaterialTheme.colorScheme.onSurface,
            fontSize = 14.sp,
            fontWeight = FontWeight.SemiBold
        )

        if (value != null) {
            Text(
                text = value,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                fontSize = 10.sp,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }
        Icon(
            imageVector = Icons.Outlined.ChevronRight,
            contentDescription = null,
            tint = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.62f),
            modifier = Modifier.size(18.dp)
        )
    }
}

@Composable
private fun SettingsDetailHeader(
    title: String,
    onBack: () -> Unit
) {
    Column(verticalArrangement = Arrangement.spacedBy(13.dp)) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            AppClickableSurface(
                onClick = onBack,
                modifier = Modifier.size(38.dp),
                shape = CircleShape
            ) {
                Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Icon(
                        imageVector = Icons.Outlined.ArrowBack,
                        contentDescription = "Back to settings",
                        tint = MaterialTheme.colorScheme.onSurface,
                        modifier = Modifier.size(19.dp)
                    )
                }
            }
            Spacer(Modifier.width(11.dp))
            Text(
                "SETTINGS",
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                fontSize = 10.sp,
                fontWeight = FontWeight.SemiBold,
                letterSpacing = 1.3.sp
            )
        }

        PageTitle(title)
    }
}

@Composable
private fun SettingsCategoryPage(
    category: SettingsCategory,
    themeMode: String,
    onThemeModeChange: (String) -> Unit,
    uiStyle: String,
    onUiStyleChange: (String) -> Unit,
    colorPalette: String,
    onColorPaletteChange: (String) -> Unit,
    appVersion: String,
    checkingUpdates: Boolean,
    updateMessage: String?,
    availableUpdate: AppUpdateInfo?,
    downloadState: AppUpdateDownloadState,
    onCheckUpdates: () -> Unit,
    onInstallUpdate: (AppUpdateInfo) -> Unit,
    onBack: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 22.dp)
            .padding(top = 17.dp, bottom = 126.dp),
        verticalArrangement = Arrangement.spacedBy(22.dp)
    ) {
        when (category) {
            SettingsCategory.APPEARANCE -> {
                SettingsDetailHeader(
                    title = "Appearance",
                    onBack = onBack
                )
                AppearanceSettingsContent(
                    themeMode = themeMode,
                    onThemeModeChange = onThemeModeChange,
                    uiStyle = uiStyle,
                    onUiStyleChange = onUiStyleChange,
                    colorPalette = colorPalette,
                    onColorPaletteChange = onColorPaletteChange
                )
            }
            SettingsCategory.UPDATES -> {
                SettingsDetailHeader(
                    title = "App updates",
                    onBack = onBack
                )
                UpdateSettingsContent(
                    appVersion = appVersion,
                    checkingUpdates = checkingUpdates,
                    updateMessage = updateMessage,
                    availableUpdate = availableUpdate,
                    downloadState = downloadState,
                    onCheckUpdates = onCheckUpdates,
                    onInstallUpdate = onInstallUpdate
                )
            }
            SettingsCategory.ABOUT -> {
                SettingsDetailHeader(
                    title = "About",
                    onBack = onBack
                )
                AboutSettingsContent(appVersion = appVersion)
            }
        }
    }
}

@Composable
private fun AppearanceSettingsContent(
    themeMode: String,
    onThemeModeChange: (String) -> Unit,
    uiStyle: String,
    onUiStyleChange: (String) -> Unit,
    colorPalette: String,
    onColorPaletteChange: (String) -> Unit
) {
    Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
        SectionHeading("Theme")
        AppSurface(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(22.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp),
                verticalArrangement = Arrangement.spacedBy(9.dp)
            ) {
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

    Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
        SectionHeading("Color palette")
        AppSurface(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(22.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxWidth().padding(11.dp),
                verticalArrangement = Arrangement.spacedBy(9.dp)
            ) {
                Row(horizontalArrangement = Arrangement.spacedBy(9.dp)) {
                    PaletteChoice(
                        palette = PlumPalettes[0],
                        selected = colorPalette == PlumPalettes[0].id,
                        modifier = Modifier.weight(1f),
                        onClick = { onColorPaletteChange(PlumPalettes[0].id) }
                    )
                    PaletteChoice(
                        palette = PlumPalettes[1],
                        selected = colorPalette == PlumPalettes[1].id,
                        modifier = Modifier.weight(1f),
                        onClick = { onColorPaletteChange(PlumPalettes[1].id) }
                    )
                }
                Row(horizontalArrangement = Arrangement.spacedBy(9.dp)) {
                    PaletteChoice(
                        palette = PlumPalettes[2],
                        selected = colorPalette == PlumPalettes[2].id,
                        modifier = Modifier.weight(1f),
                        onClick = { onColorPaletteChange(PlumPalettes[2].id) }
                    )
                    PaletteChoice(
                        palette = PlumPalettes[3],
                        selected = colorPalette == PlumPalettes[3].id,
                        modifier = Modifier.weight(1f),
                        onClick = { onColorPaletteChange(PlumPalettes[3].id) }
                    )
                }
            }
        }
    }

    Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
        SectionHeading("Navigation style")
        InterfaceStyleChoice(
            uiStyle = uiStyle,
            onUiStyleChange = onUiStyleChange
        )
    }
}


@Composable
private fun UpdateSettingsContent(
    appVersion: String,
    checkingUpdates: Boolean,
    updateMessage: String?,
    availableUpdate: AppUpdateInfo?,
    downloadState: AppUpdateDownloadState,
    onCheckUpdates: () -> Unit,
    onInstallUpdate: (AppUpdateInfo) -> Unit
) {
    val updateBusy = checkingUpdates || downloadState.isDownloading || downloadState.isOpeningInstaller
    val isDownloaded = downloadState.isDownloaded || downloadState.isOpeningInstaller
    val updateButtonLabel = when {
        checkingUpdates -> "Checking…"
        isDownloaded -> "Downloaded"
        availableUpdate != null -> "Install " + availableUpdate.versionName
        else -> "Check for updates"
    }

    Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
        SectionHeading("Installed version")
        AppSurface(modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(22.dp)) {
            Column(
                modifier = Modifier.fillMaxWidth().padding(15.dp),
                verticalArrangement = Arrangement.spacedBy(13.dp)
            ) {
                Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier.size(42.dp).background(
                            MaterialTheme.colorScheme.primary.copy(alpha = 0.10f),
                            RoundedCornerShape(14.dp)
                        ),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(Icons.Outlined.Info, contentDescription = null, tint = MaterialTheme.colorScheme.primary)
                    }
                    Spacer(Modifier.width(12.dp))
                    Column(verticalArrangement = Arrangement.spacedBy(3.dp)) {
                        Text("Plum Watch", color = MaterialTheme.colorScheme.onSurface, fontSize = 14.sp, fontWeight = FontWeight.SemiBold)
                        Text("Version " + appVersion, color = MaterialTheme.colorScheme.onSurfaceVariant, fontSize = 11.sp)
                    }
                }
                PlumDownloadButton(
                    label = updateButtonLabel,
                    downloading = downloadState.isDownloading,
                    progress = downloadState.progress,
                    downloaded = isDownloaded,
                    enabled = !updateBusy && !isDownloaded,
                    showActivityIndicator = checkingUpdates,
                    onClick = {
                        val update = availableUpdate
                        if (update != null) onInstallUpdate(update) else onCheckUpdates()
                    },
                    modifier = Modifier.fillMaxWidth()
                )
                val visibleMessage = downloadState.errorMessage ?: updateMessage.takeUnless {
                    downloadState.isDownloading || downloadState.isOpeningInstaller || isDownloaded
                }
                if (visibleMessage != null) {
                    Text(
                        text = visibleMessage,
                        color = if (downloadState.errorMessage != null) MaterialTheme.colorScheme.error
                        else MaterialTheme.colorScheme.onSurfaceVariant,
                        fontSize = 11.sp,
                        lineHeight = 16.sp
                    )
                }
            }
        }
    }
}

@Composable
private fun AboutSettingsContent(appVersion: String) {
    Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
        SectionHeading("Application")
        AppSurface(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(22.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .size(46.dp)
                        .background(
                            MaterialTheme.colorScheme.primary.copy(alpha = 0.10f),
                            RoundedCornerShape(15.dp)
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        Icons.Outlined.Watch,
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.primary,
                        modifier = Modifier.size(23.dp)
                    )
                }
                Spacer(Modifier.width(12.dp))
                Column(verticalArrangement = Arrangement.spacedBy(3.dp)) {
                    Text(
                        "Plum Watch",
                        color = MaterialTheme.colorScheme.onSurface,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                    Text(
                        "Version " + appVersion,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        fontSize = 11.sp
                    )
                }
            }
        }
    }

    Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
        SectionHeading("Developers")
        AppSurface(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(22.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(17.dp),
                verticalArrangement = Arrangement.spacedBy(15.dp)
            ) {
                DeveloperRow("Doruk Çavdar", "VeriBotOfficial")
                DeveloperRow("Troy Mitchell", "TroyMitchell911")
            }
        }
    }
}

@Composable
private fun PaletteChoice(
    palette: PlumPalette,
    selected: Boolean,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    val borderColor by animateColorAsState(
        targetValue = if (selected) MaterialTheme.colorScheme.primary.copy(alpha = 0.78f)
        else MaterialTheme.colorScheme.outline.copy(alpha = 0.36f),
        animationSpec = tween(240),
        label = "palette-choice-border"
    )
    Surface(
        onClick = onClick,
        modifier = modifier.height(68.dp),
        shape = RoundedCornerShape(17.dp),
        color = if (selected) MaterialTheme.colorScheme.primary.copy(alpha = 0.075f)
        else MaterialTheme.colorScheme.surface,
        border = BorderStroke(1.dp, borderColor)
    ) {
        Row(
            modifier = Modifier.fillMaxSize().padding(horizontal = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Box(
                modifier = Modifier.size(25.dp).background(palette.previewColor, CircleShape)
            )
            Text(
                text = palette.name,
                modifier = Modifier.weight(1f),
                color = MaterialTheme.colorScheme.onSurface,
                fontSize = 12.sp,
                fontWeight = if (selected) FontWeight.SemiBold else FontWeight.Medium,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
            if (selected) {
                Icon(
                    imageVector = Icons.Outlined.CheckCircle,
                    contentDescription = "Selected",
                    tint = MaterialTheme.colorScheme.primary,
                    modifier = Modifier.size(16.dp)
                )
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
             icon = Icons.Outlined.Widgets,
            selected = uiStyle == "classic",
            modifier = Modifier.weight(1f),
            onClick = { onUiStyleChange("classic") }
        )
        InterfaceChoiceCard(
            label = "Liquid Glass",
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
        modifier = modifier.height(96.dp),
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
