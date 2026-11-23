package me.doruk.plumwatch.ui

import android.content.Context
import android.content.ComponentName
import android.content.Intent
import android.provider.Settings
import android.provider.Settings.Secure
import android.graphics.BitmapFactory
import android.os.Build
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
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
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.ui.draw.clip
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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
import androidx.compose.material.icons.outlined.BatteryFull
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material.icons.outlined.Bluetooth
import androidx.compose.material.icons.outlined.ChevronRight
import androidx.compose.material.icons.outlined.CameraAlt
import androidx.compose.material.icons.outlined.CheckCircle
import androidx.compose.material.icons.outlined.Check
import androidx.compose.material.icons.outlined.Delete
import androidx.compose.material.icons.outlined.DeleteOutline
import androidx.compose.material.icons.outlined.Download
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Widgets
import androidx.compose.material.icons.outlined.Layers
import androidx.compose.material.icons.outlined.LightMode
import androidx.compose.material.icons.outlined.LocationSearching
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.MusicNote
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Palette
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Refresh
import androidx.compose.material.icons.outlined.SettingsBrightness
import androidx.compose.material.icons.outlined.Vibration
import androidx.compose.material.icons.outlined.VolumeUp
import androidx.compose.material.icons.outlined.Watch
import androidx.compose.material.icons.outlined.GridView
import androidx.compose.material.icons.outlined.Wifi
import androidx.compose.material.icons.outlined.DarkMode
import androidx.compose.material.icons.outlined.KeyboardArrowDown
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
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.FilterChip
import androidx.compose.material3.Switch
import androidx.compose.material3.Checkbox
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.IconButton
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.key
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.togetherWith
import kotlin.math.roundToInt
import me.doruk.plumwatch.data.AppUpdateDownloadState
import me.doruk.plumwatch.data.AppUpdateInfo
import me.doruk.plumwatch.watch.BleUiState
import me.doruk.plumwatch.watch.WatchDevice
import me.doruk.plumwatch.watch.BleWatchManager
import java.io.File
import java.io.FileInputStream
import java.text.DateFormat
import java.util.Date
import java.net.HttpURLConnection
import java.net.URL
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.launch
import kotlinx.coroutines.delay
import androidx.lifecycle.compose.collectAsStateWithLifecycle
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
    successLabel: String = "Downloaded",
    attention: Boolean = false
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
            attention -> MaterialTheme.colorScheme.primary.copy(alpha = 0.23f)
            else -> MaterialTheme.colorScheme.primary.copy(alpha = 0.13f)
        },
        animationSpec = tween(520, easing = FastOutSlowInEasing),
        label = "plum-download-background"
    )
    val foregroundColor = when {
        downloaded -> Color.White
        attention -> MaterialTheme.colorScheme.primary
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
    onOpenStore: () -> Unit,
    onOpenOtherSettings: () -> Unit,
    onFindWatch: () -> Unit,
    onOpenAlarms: () -> Unit,
    onOpenHealth: () -> Unit,
    onOpenBattery: () -> Unit,
    onOpenDeviceInfo: () -> Unit,
    onOpenNotifications: () -> Unit,
    onOpenCamera: () -> Unit,
    onOpenMusic: () -> Unit
) {
    val context = LocalContext.current
    val dashboardPreferences = remember(context) {
        context.getSharedPreferences("plum_watch_dashboard", Context.MODE_PRIVATE)
    }
    var showRemoveDialog by remember { mutableStateOf(false) }
    var showDashboardEditor by remember { mutableStateOf(false) }
    var quickOrder by remember {
        mutableStateOf(
            dashboardPreferences.getString("quick_order", null)
                ?.split("|")?.filter { it.isNotBlank() }
                ?: listOf("Find Watch", "Alarms", "Health", "Battery", "Device info", "Notifications", "Camera", "Music", "Store")
        )
    }
    var hiddenQuickFeatures by remember {
        mutableStateOf(dashboardPreferences.getStringSet("hidden_quick_features", emptySet()).orEmpty())
    }

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
                        supportsBattery = state.supportsBattery,
                        supportsTimeSync = state.supportsTimeSync,
                        lastTimeSyncAt = state.lastTimeSyncAt,
                        onOpenBattery = onOpenBattery
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
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                SectionHeading("Quick controls")
                TextButton(onClick = { showDashboardEditor = true }) {
                    Text("Customize", fontSize = 12.sp)
                }
            }

            val implementedFeatures = listOf(
                QuickFeature("Find Watch", Icons.Outlined.LocationSearching,
                    subtitle = "Ping your watch",
                    enabled = state.isConnected && (state.canFindWatch || state.supportsProprietaryCommands),
                    onClick = { if (state.isConnected) onFindWatch() }
                ),
                QuickFeature("Alarms", Icons.Outlined.Alarm,
                    subtitle = "Create and manage alarms",
                    enabled = state.isConnected && state.supportsProprietaryCommands,
                    onClick = onOpenAlarms
                ),
                QuickFeature("Health", Icons.Outlined.FavoriteBorder,
                    subtitle = state.heartRateBpm?.let { "$it bpm" } ?: "Heart rate and SpO₂",
                    enabled = state.isConnected && state.supportsProprietaryCommands,
                    onClick = onOpenHealth
                ),
                QuickFeature("Battery", Icons.Outlined.BatteryFull,
                    subtitle = "Battery history",
                    enabled = true,
                    onClick = onOpenBattery
                ),
                QuickFeature("Device info", Icons.Outlined.Info,
                    subtitle = "Watch details and capabilities",
                    enabled = state.savedDevice != null,
                    onClick = onOpenDeviceInfo
                ),
                QuickFeature("Notifications", Icons.Outlined.Notifications,
                    subtitle = "Choose app alerts",
                    enabled = state.isConnected && state.supportsProprietaryCommands,
                    onClick = onOpenNotifications
                ),
                QuickFeature("Camera", Icons.Outlined.CameraAlt,
                    subtitle = "Open phone camera",
                    enabled = state.isConnected && state.supportsProprietaryCommands,
                    onClick = onOpenCamera
                ),
                QuickFeature("Music", Icons.Outlined.MusicNote,
                    subtitle = "Send audio files to your watch",
                    enabled = true,
                    onClick = onOpenMusic
                ),
                QuickFeature("Store", Icons.Outlined.GridView,
                    subtitle = "Browse watchfaces and apps",
                    enabled = state.isConnected && state.supportsSifliWatchface,
                    onClick = { if (state.isConnected && state.supportsSifliWatchface) onOpenStore() }
                )
            )

            implementedFeatures
                .filter { it.title !in hiddenQuickFeatures }
                .sortedBy { feature -> quickOrder.indexOf(feature.title).let { if (it < 0) Int.MAX_VALUE else it } }
                .chunked(2).forEach { pair ->
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    pair.forEach { feature ->
                        QuickFeatureTile(
                            feature = feature,
                            modifier = Modifier.weight(1f)
                        )
                    }
                    if (pair.size == 1) Spacer(modifier = Modifier.weight(1f))
                }
            }
        }

        FilledTonalButton(
            onClick = onOpenOtherSettings,
            modifier = Modifier.fillMaxWidth().height(54.dp),
            shape = RoundedCornerShape(18.dp)
        ) {
            Icon(Icons.Outlined.Widgets, contentDescription = null, modifier = Modifier.size(19.dp))
            Spacer(Modifier.width(9.dp))
            Text("Other Settings", fontWeight = FontWeight.Medium)
            Spacer(Modifier.weight(1f))
            Icon(Icons.Outlined.ChevronRight, contentDescription = null, modifier = Modifier.size(18.dp))
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

    if (showDashboardEditor) {
        MaterialAlertDialog(
            onDismissRequest = { showDashboardEditor = false },
            containerColor = MaterialTheme.colorScheme.surface,
            titleContentColor = MaterialTheme.colorScheme.onSurface,
            textContentColor = MaterialTheme.colorScheme.onSurfaceVariant,
            title = { Text("Customize dashboard") },
            text = {
                Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                    Text(
                        "Choose which shortcuts appear and arrange their order.",
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        fontSize = 12.sp
                    )
                    val allNames = listOf("Find Watch", "Alarms", "Health", "Battery", "Device info", "Notifications", "Camera", "Music", "Store")
                    allNames.forEach { name ->
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Checkbox(
                                checked = name !in hiddenQuickFeatures,
                                onCheckedChange = { visible ->
                                    hiddenQuickFeatures = if (visible) hiddenQuickFeatures - name else hiddenQuickFeatures + name
                                    dashboardPreferences.edit()
                                        .putStringSet("hidden_quick_features", hiddenQuickFeatures)
                                        .apply()
                                }
                            )
                            Text(name, modifier = Modifier.weight(1f), fontSize = 13.sp)
                            TextButton(onClick = {
                                val index = quickOrder.indexOf(name).takeIf { it >= 0 } ?: quickOrder.size
                                if (index > 0) {
                                    quickOrder = quickOrder.toMutableList().apply {
                                        val item = removeAt(index)
                                        add(index - 1, item)
                                    }
                                    dashboardPreferences.edit().putString("quick_order", quickOrder.joinToString("|")).apply()
                                }
                            }, enabled = quickOrder.indexOf(name) > 0) { Text("↑") }
                            TextButton(onClick = {
                                val index = quickOrder.indexOf(name).takeIf { it >= 0 } ?: quickOrder.size
                                if (index < quickOrder.lastIndex) {
                                    quickOrder = quickOrder.toMutableList().apply {
                                        val item = removeAt(index)
                                        add(index + 1, item)
                                    }
                                    dashboardPreferences.edit().putString("quick_order", quickOrder.joinToString("|")).apply()
                                }
                            }, enabled = quickOrder.indexOf(name) in 0 until quickOrder.lastIndex) { Text("↓") }
                        }
                    }
                }
            },
            confirmButton = {
                TextButton(onClick = { showDashboardEditor = false }) { Text("Done") }
            },
            dismissButton = {
                TextButton(onClick = {
                    quickOrder = listOf("Find Watch", "Alarms", "Health", "Battery", "Device info", "Notifications", "Camera", "Music", "Store")
                    hiddenQuickFeatures = emptySet()
                    dashboardPreferences.edit().remove("quick_order").remove("hidden_quick_features").apply()
                }) { Text("Reset") }
            }
        )
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
fun OtherWatchSettingsScreen(onBack: () -> Unit) {
    BackHandler(onBack = onBack)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 22.dp)
            .padding(top = 17.dp, bottom = 126.dp),
        verticalArrangement = Arrangement.spacedBy(18.dp)
    ) {
        TextButton(onClick = onBack) {
            Icon(Icons.Outlined.ArrowBack, contentDescription = null, modifier = Modifier.size(18.dp))
            Spacer(Modifier.width(6.dp))
            Text("My Watch")
        }
        PageTitle("Other Settings")
        WatchControlsSettingsContent()
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
    supportsBattery: Boolean,
    supportsTimeSync: Boolean,
    lastTimeSyncAt: Long?,
    onOpenBattery: () -> Unit
) {
    val level = batteryPercent?.coerceIn(0, 100)
    val tint = if (level != null && level <= 20) Color(0xFFE05252) else Color(0xFF36B66A)
    AppSurface(modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(29.dp)) {
        Row(modifier = Modifier.fillMaxWidth().padding(16.dp), verticalAlignment = Alignment.CenterVertically) {
            Box(Modifier.size(52.dp).background(MaterialTheme.colorScheme.surfaceVariant.copy(alpha = .72f), RoundedCornerShape(17.dp)), contentAlignment = Alignment.Center) {
                Icon(Icons.Outlined.Watch, null, tint = MaterialTheme.colorScheme.primary, modifier = Modifier.size(28.dp))
            }
            Spacer(Modifier.width(12.dp))
            Column(Modifier.weight(1f), verticalArrangement = Arrangement.spacedBy(5.dp)) {
                Text(device.name, color = MaterialTheme.colorScheme.onSurface, fontSize = 16.sp, fontWeight = FontWeight.SemiBold, maxLines = 1, overflow = TextOverflow.Ellipsis)
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(Modifier.size(7.dp).background(Color(0xFF69C58E), CircleShape))
                    Spacer(Modifier.width(7.dp))
                    Text("Connected", color = MaterialTheme.colorScheme.onSurfaceVariant, fontSize = 11.sp)
                }
            }
            Row(
                Modifier
                    .clip(RoundedCornerShape(10.dp))
                    .background(MaterialTheme.colorScheme.surfaceVariant.copy(alpha = .55f))
                    .clickable(onClick = onOpenBattery)
                    .padding(horizontal = 8.dp, vertical = 7.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(5.dp)
            ) {
                Box(Modifier.width(22.dp).height(12.dp).border(1.dp, MaterialTheme.colorScheme.onSurfaceVariant, RoundedCornerShape(3.dp)).padding(2.dp)) {
                    Box(Modifier.fillMaxWidth((level ?: 0) / 100f).fillMaxSize().background(if (level == null) MaterialTheme.colorScheme.onSurfaceVariant else tint, RoundedCornerShape(1.dp)))
                }
                Box(Modifier.width(2.dp).height(5.dp).background(MaterialTheme.colorScheme.onSurfaceVariant, RoundedCornerShape(1.dp)))
                Text(level?.toString() ?: "—", color = if (level == null) MaterialTheme.colorScheme.onSurfaceVariant else tint, fontSize = 12.sp, fontWeight = FontWeight.SemiBold)
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

private data class QuickFeature(
    val title: String,
    val icon: ImageVector,
    val subtitle: String,
    val enabled: Boolean = true,
    val onClick: () -> Unit
)

@Composable
private fun QuickFeatureTile(
    feature: QuickFeature,
    modifier: Modifier = Modifier
) {
    val haptic = LocalHapticFeedback.current
    AppClickableSurface(
        onClick = {
            haptic.performHapticFeedback(HapticFeedbackType.LongPress)
            feature.onClick()
        },
        modifier = modifier.height(100.dp),
        shape = RoundedCornerShape(22.dp),
        enabled = feature.enabled
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = feature.icon,
                    contentDescription = null,
                    tint = if (feature.enabled) MaterialTheme.colorScheme.primary
                    else MaterialTheme.colorScheme.onSurfaceVariant,
                    modifier = Modifier.size(24.dp)
                )
                if (!feature.enabled) {
                    Icon(
                        imageVector = Icons.Outlined.Lock,
                        contentDescription = "Locked",
                        tint = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.5f),
                        modifier = Modifier.size(16.dp)
                    )
                }
            }
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(2.dp)
            ) {
                Text(
                    feature.title,
                    color = if (feature.enabled) MaterialTheme.colorScheme.onSurface
                    else MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.5f),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium
                )
                Text(
                    feature.subtitle,
                    color = if (feature.enabled) MaterialTheme.colorScheme.onSurfaceVariant
                    else MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.5f),
                    fontSize = 11.sp
                )
            }
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

enum class SettingsCategory(
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
                updateAvailable = availableUpdate != null,
                updateVersion = availableUpdate?.versionName,
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
    updateAvailable: Boolean,
    updateVersion: String?,
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
                        value = if (updateAvailable) "Update available · ${updateVersion ?: ""}" else appVersion,
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
                    attention = availableUpdate != null,
                    onClick = {
                        val update = availableUpdate
                        if (update != null) onInstallUpdate(update) else onCheckUpdates()
                    },
                    modifier = Modifier.fillMaxWidth()
                )
                if (availableUpdate != null) {
                    TextButton(
                        onClick = onCheckUpdates,
                        enabled = !updateBusy,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Icon(Icons.Outlined.Refresh, contentDescription = null, modifier = Modifier.size(16.dp))
                        Spacer(Modifier.width(6.dp))
                        Text("Check again")
                    }
                }
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
                        .size(64.dp)
                        .background(
                            MaterialTheme.colorScheme.primary.copy(alpha = 0.10f),
                            RoundedCornerShape(19.dp)
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(me.doruk.plumwatch.R.drawable.ic_launcher_foreground),
                        contentDescription = "Plum Watch",
                        contentScale = ContentScale.Fit,
                        colorFilter = androidx.compose.ui.graphics.ColorFilter.tint(MaterialTheme.colorScheme.primary),
                        modifier = Modifier.size(48.dp)
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
fun MusicScreen(onBack: () -> Unit) {
    BackHandler(onBack = onBack)
    Column(
        Modifier.fillMaxSize().statusBarsPadding().verticalScroll(rememberScrollState())
            .padding(horizontal = 22.dp).padding(top = 17.dp, bottom = 126.dp),
        verticalArrangement = Arrangement.spacedBy(18.dp)
    ) {
        TextButton(onClick = onBack) {
            Icon(Icons.Outlined.ArrowBack, null, modifier = Modifier.size(18.dp))
            Spacer(Modifier.width(6.dp))
            Text("My Watch")
        }
        PageTitle("Music")
        AppSurface(Modifier.fillMaxWidth(), shape = RoundedCornerShape(22.dp)) {
            Column(Modifier.fillMaxWidth().padding(18.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
                Icon(Icons.Outlined.MusicNote, null, tint = MaterialTheme.colorScheme.primary, modifier = Modifier.size(30.dp))
                Text("Music transfer unavailable", fontSize = 17.sp, fontWeight = FontWeight.SemiBold)
                Text(
                    "This watch uses WearFit's separate FTP file-transfer channel. The readable app export does not include its MP3 upload handshake or acknowledgement/retry sequence, so Plum cannot safely transfer a track yet.",
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    fontSize = 13.sp,
                    lineHeight = 18.sp
                )
            }
        }
    }
}

private data class HealthSample(
    val timestamp: Long,
    val value: Int
)

private fun decodeHealthSamples(value: String?): List<HealthSample> =
    value.orEmpty().split(",").mapNotNull { token ->
        val parts = token.split(":", limit = 2)
        if (parts.size != 2) return@mapNotNull null
        val timestamp = parts[0].toLongOrNull() ?: return@mapNotNull null
        val sample = parts[1].toIntOrNull() ?: return@mapNotNull null
        HealthSample(timestamp, sample)
    }.takeLast(72)

private fun encodeHealthSamples(samples: List<HealthSample>): String =
    samples.joinToString(",") { "${it.timestamp}:${it.value}" }

private data class NotificationAppChoice(
    val packageName: String,
    val label: String
)

@Composable
fun HealthScreen(onBack: () -> Unit) {
    BackHandler(onBack = onBack)
    val context = LocalContext.current
    val manager = remember(context) { BleWatchManager.getInstance(context) }
    val state by manager.state.collectAsStateWithLifecycle()
    val prefs = remember(context) {
        context.getSharedPreferences("plum_watch_health_history", Context.MODE_PRIVATE)
    }
    val hr = remember(prefs) {
        mutableStateListOf<HealthSample>().apply {
            addAll(decodeHealthSamples(prefs.getString("hr_samples", null)))
        }
    }
    val spo = remember(prefs) {
        mutableStateListOf<HealthSample>().apply {
            addAll(decodeHealthSamples(prefs.getString("spo_samples", null)))
        }
    }
    // Current readings are requested by the background BLE sync service.
    LaunchedEffect(state.heartRateUpdatedAt) {
        if (state.heartRateUpdatedAt != null) {
            // The BLE manager persists samples even while this screen is closed.
            hr.clear()
            hr.addAll(decodeHealthSamples(prefs.getString("hr_samples", null)))
        }
    }
    LaunchedEffect(state.bloodOxygenUpdatedAt) {
        if (state.bloodOxygenUpdatedAt != null) {
            spo.clear()
            spo.addAll(decodeHealthSamples(prefs.getString("spo_samples", null)))
        }
    }

    Column(
        Modifier.fillMaxSize().statusBarsPadding().verticalScroll(rememberScrollState())
            .padding(horizontal = 22.dp).padding(top = 17.dp, bottom = 126.dp),
        verticalArrangement = Arrangement.spacedBy(18.dp)
    ) {
        TextButton(onClick = onBack) {
            Icon(Icons.Outlined.ArrowBack, null, modifier = Modifier.size(18.dp))
            Spacer(Modifier.width(6.dp))
            Text("My Watch")
        }
        PageTitle("Health")
        AppSurface(Modifier.fillMaxWidth(), shape = RoundedCornerShape(22.dp)) {
            Column(Modifier.fillMaxWidth().padding(18.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
                Text("Heart rate", color = MaterialTheme.colorScheme.onSurfaceVariant, fontSize = 12.sp)
                Text(
                    state.heartRateBpm?.let { "$it bpm" } ?: "No reading yet",
                    color = MaterialTheme.colorScheme.onSurface,
                    fontSize = 27.sp,
                    fontWeight = FontWeight.SemiBold
                )
                HealthHistoryChart(hr.toList(), MaterialTheme.colorScheme.primary)
                Text(
                    healthRangeLabel(hr),
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    fontSize = 11.sp
                )
            }
        }
        AppSurface(Modifier.fillMaxWidth(), shape = RoundedCornerShape(22.dp)) {
            Column(Modifier.fillMaxWidth().padding(18.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
                Text("Blood oxygen", color = MaterialTheme.colorScheme.onSurfaceVariant, fontSize = 12.sp)
                Text(
                    state.bloodOxygenPercent?.let { "$it%" } ?: "No reading yet",
                    color = MaterialTheme.colorScheme.onSurface,
                    fontSize = 27.sp,
                    fontWeight = FontWeight.SemiBold
                )
                HealthHistoryChart(spo.toList(), Color(0xFF36A6A0))
                Text(
                    healthRangeLabel(spo),
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    fontSize = 11.sp
                )
            }
        }
        if (!state.isConnected) {
            Text("Connect your watch. Current readings sync automatically while it is connected.", color = MaterialTheme.colorScheme.onSurfaceVariant, fontSize = 12.sp)
        }
        Text(
            "Charts show timestamped readings received by Plum. Historical records already stored on the watch still require the separate Wearfit history-sync response format.",
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            fontSize = 11.sp,
            lineHeight = 16.sp
        )
    }
}

private fun healthRangeLabel(samples: List<HealthSample>): String {
    if (samples.isEmpty()) return "No saved readings"
    val format = DateFormat.getTimeInstance(DateFormat.SHORT)
    val first = format.format(Date(samples.first().timestamp))
    val last = format.format(Date(samples.last().timestamp))
    return "${samples.size} readings · $first – $last"
}

@Composable
private fun HealthHistoryChart(samples: List<HealthSample>, color: Color) {
    androidx.compose.foundation.Canvas(
        Modifier.fillMaxWidth().height(112.dp)
            .background(MaterialTheme.colorScheme.surfaceVariant.copy(alpha = .32f), RoundedCornerShape(14.dp))
            .padding(9.dp)
    ) {
        if (samples.isEmpty()) return@Canvas
        val minTime = samples.first().timestamp
        val maxTime = samples.last().timestamp
        val timeSpan = (maxTime - minTime).coerceAtLeast(1L).toFloat()
        val low = (samples.minOf { it.value } - 5).toFloat()
        val valueSpan = (samples.maxOf { it.value } + 5 - low).coerceAtLeast(1f)
        val path = androidx.compose.ui.graphics.Path()
        val points = samples.map { sample ->
            val x = ((sample.timestamp - minTime).toFloat() / timeSpan) * size.width
            val y = size.height - ((sample.value - low) / valueSpan) * size.height
            androidx.compose.ui.geometry.Offset(x, y)
        }
        points.forEachIndexed { index, point ->
            if (index == 0) path.moveTo(point.x, point.y) else path.lineTo(point.x, point.y)
        }
        if (points.size > 1) {
            drawPath(
                path,
                color,
                style = androidx.compose.ui.graphics.drawscope.Stroke(
                    width = 3.dp.toPx(),
                    cap = androidx.compose.ui.graphics.StrokeCap.Round,
                    join = androidx.compose.ui.graphics.StrokeJoin.Round
                )
            )
        }
        points.forEach { point -> drawCircle(color, radius = 3.dp.toPx(), center = point) }
    }
}

private fun hasNotificationListenerAccess(context: Context): Boolean {
    val enabled = Secure.getString(context.contentResolver, "enabled_notification_listeners").orEmpty()
    return enabled.split(':').any {
        ComponentName.unflattenFromString(it)?.packageName == context.packageName
    }
}

@Composable
fun NotificationsScreen(onBack: () -> Unit) {
    BackHandler(onBack = onBack)
    val context = LocalContext.current
    val manager = remember(context) { BleWatchManager.getInstance(context) }
    val watchState by manager.state.collectAsStateWithLifecycle()
    val preferences = remember(context) {
        context.getSharedPreferences("plum_watch_notifications", Context.MODE_PRIVATE)
    }
    val selectedPackages = remember(preferences) {
        mutableStateListOf<String>().apply {
            addAll(preferences.getStringSet("selected_packages", emptySet()).orEmpty())
        }
    }
    var apps by remember { mutableStateOf<List<NotificationAppChoice>>(emptyList()) }
    var search by remember { mutableStateOf("") }
    var accessEnabled by remember { mutableStateOf(hasNotificationListenerAccess(context)) }
    var loadingApps by remember { mutableStateOf(true) }

    LaunchedEffect(context) {
        apps = withContext(Dispatchers.IO) {
            val pm = context.packageManager
            val launcherIntent = Intent(Intent.ACTION_MAIN).addCategory(Intent.CATEGORY_LAUNCHER)
            pm.queryIntentActivities(launcherIntent, 0)
                .mapNotNull { resolve ->
                    val activity = resolve.activityInfo ?: return@mapNotNull null
                    val packageName = activity.packageName
                    if (packageName == context.packageName) return@mapNotNull null
                    val label = runCatching { resolve.loadLabel(pm).toString() }
                        .getOrDefault(packageName)
                    NotificationAppChoice(packageName, label)
                }
                .distinctBy { it.packageName }
                .sortedBy { it.label.lowercase() }
        }
        loadingApps = false
    }

    LaunchedEffect(Unit) {
        while (true) {
            val enabled = withContext(Dispatchers.IO) { hasNotificationListenerAccess(context) }
            if (accessEnabled != enabled) accessEnabled = enabled
            delay(1800L)
        }
    }

    val filteredApps = remember(apps, search) {
        if (search.isBlank()) apps
        else apps.filter {
            it.label.contains(search, ignoreCase = true) ||
                it.packageName.contains(search, ignoreCase = true)
        }
    }

    LazyColumn(
        modifier = Modifier.fillMaxSize().statusBarsPadding(),
        contentPadding = androidx.compose.foundation.layout.PaddingValues(
            start = 22.dp, end = 22.dp, top = 17.dp, bottom = 126.dp
        ),
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        item {
            TextButton(onClick = onBack) {
                Icon(Icons.Outlined.ArrowBack, contentDescription = null, modifier = Modifier.size(18.dp))
                Spacer(Modifier.width(6.dp))
                Text("My Watch")
            }
            PageTitle("Notifications")
        }
        item {
            AppSurface(modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(22.dp)) {
                Column(
                    modifier = Modifier.fillMaxWidth().padding(16.dp),
                    verticalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Text(
                        if (accessEnabled) "Notification access is enabled."
                        else "Allow Plum Watch to read notifications from the apps you select.",
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        fontSize = 12.sp
                    )
                    FilledTonalButton(
                        onClick = {
                            runCatching {
                                context.startActivity(Intent(Settings.ACTION_NOTIFICATION_LISTENER_SETTINGS))
                            }
                        },
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(16.dp)
                    ) {
                        Text(if (accessEnabled) "Notification access settings" else "Enable notification access")
                    }
                }
            }
        }
        item { NotificationDisplaySettingsContent() }
        item {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                SectionHeading("Apps")
                Text("${selectedPackages.size} selected", color = MaterialTheme.colorScheme.onSurfaceVariant, fontSize = 11.sp)
            }
            OutlinedTextField(
                value = search,
                onValueChange = { search = it },
                modifier = Modifier.fillMaxWidth(),
                singleLine = true,
                placeholder = { Text("Search apps") },
                shape = RoundedCornerShape(16.dp)
            )
        }
        if (loadingApps) {
            item {
                Box(Modifier.fillMaxWidth().padding(28.dp), contentAlignment = Alignment.Center) {
                    CircularProgressIndicator(modifier = Modifier.size(22.dp), strokeWidth = 2.dp)
                }
            }
        } else {
            items(filteredApps, key = { it.packageName }) { app ->
                Row(
                    modifier = Modifier.fillMaxWidth().clickable {
                        if (app.packageName in selectedPackages) selectedPackages.remove(app.packageName)
                        else selectedPackages.add(app.packageName)
                        preferences.edit().putStringSet("selected_packages", selectedPackages.toSet()).apply()
                    }.padding(vertical = 5.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(modifier = Modifier.weight(1f), verticalArrangement = Arrangement.spacedBy(2.dp)) {
                        Text(app.label, color = MaterialTheme.colorScheme.onSurface, fontSize = 14.sp, fontWeight = FontWeight.Medium)
                        Text(app.packageName, color = MaterialTheme.colorScheme.onSurfaceVariant, fontSize = 10.sp, maxLines = 1, overflow = TextOverflow.Ellipsis)
                    }
                    Checkbox(
                        checked = app.packageName in selectedPackages,
                        onCheckedChange = { checked ->
                            if (checked) {
                                if (app.packageName !in selectedPackages) selectedPackages.add(app.packageName)
                            } else selectedPackages.remove(app.packageName)
                            preferences.edit().putStringSet("selected_packages", selectedPackages.toSet()).apply()
                        }
                    )
                }
                Divider(color = MaterialTheme.colorScheme.outlineVariant, thickness = 0.5.dp)
            }
        }
        if (filteredApps.isEmpty() && !loadingApps) {
            item { Text("No matching apps.", color = MaterialTheme.colorScheme.onSurfaceVariant, fontSize = 12.sp) }
        }
        if (selectedPackages.isEmpty()) {
            item {
                Text(
                    "Choose the apps whose notifications should be forwarded to your watch.",
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    fontSize = 12.sp
                )
            }
        }
        if (!watchState.isConnected) {
            item {
                Text("Connect your watch to receive notifications.", color = MaterialTheme.colorScheme.onSurfaceVariant, fontSize = 12.sp)
            }
        }
    }
}

private data class BatteryHistorySample(val timestamp: Long, val percent: Int)

private fun decodeBatteryHistory(value: String?): List<BatteryHistorySample> =
    value.orEmpty().split(",").mapNotNull { token ->
        val parts = token.split(":", limit = 2)
        if (parts.size != 2) return@mapNotNull null
        val timestamp = parts[0].toLongOrNull() ?: return@mapNotNull null
        val percent = parts[1].toIntOrNull() ?: return@mapNotNull null
        if (percent !in 0..100) null else BatteryHistorySample(timestamp, percent)
    }

@Composable
fun BatteryHistoryScreen(onBack: () -> Unit) {
    BackHandler(onBack = onBack)
    val context = LocalContext.current
    val manager = remember(context) { BleWatchManager.getInstance(context) }
    val state by manager.state.collectAsStateWithLifecycle()
    val preferences = remember(context) {
        context.getSharedPreferences("plum-watch-saved-device", Context.MODE_PRIVATE)
    }
    var samples by remember {
        mutableStateOf(decodeBatteryHistory(preferences.getString("battery-history", null)))
    }
    var range by remember { mutableStateOf("24H") }

    LaunchedEffect(state.batteryUpdatedAt) {
        samples = decodeBatteryHistory(preferences.getString("battery-history", null))
    }

    val now = System.currentTimeMillis()
    val duration = when (range) {
        "7D" -> 7L * 24L * 60L * 60L * 1000L
        "30D" -> 30L * 24L * 60L * 60L * 1000L
        else -> 24L * 60L * 60L * 1000L
    }
    val orderedSamples = samples.sortedBy { it.timestamp }
    val visibleSamples = orderedSamples.filter { it.timestamp >= now - duration }
    val latest = state.batteryPercent ?: orderedSamples.lastOrNull()?.percent
    val updatedAt = state.batteryUpdatedAt ?: orderedSamples.lastOrNull()?.timestamp
    val batteryColor = when {
        latest == null -> MaterialTheme.colorScheme.onSurfaceVariant
        latest <= 20 -> MaterialTheme.colorScheme.error
        else -> Color(0xFF39B978)
    }
    val chartColor = if (latest != null && latest <= 20) MaterialTheme.colorScheme.error else Color(0xFF39B978)
    val chartGrid = MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.45f)

    Column(
        Modifier.fillMaxSize().statusBarsPadding().verticalScroll(rememberScrollState())
            .padding(horizontal = 22.dp).padding(top = 17.dp, bottom = 126.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        TextButton(onClick = onBack) {
            Icon(Icons.Outlined.ArrowBack, null, modifier = Modifier.size(18.dp))
            Spacer(Modifier.width(6.dp))
            Text("My Watch")
        }
        PageTitle("Battery")

        AppSurface(Modifier.fillMaxWidth(), shape = RoundedCornerShape(26.dp)) {
            Column(
                Modifier.fillMaxWidth().padding(20.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Row(
                    Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(verticalArrangement = Arrangement.spacedBy(3.dp)) {
                        Text(
                            "CURRENT LEVEL",
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            fontSize = 10.sp,
                            fontWeight = FontWeight.SemiBold,
                            letterSpacing = 1.sp
                        )
                        Row(verticalAlignment = Alignment.Bottom, horizontalArrangement = Arrangement.spacedBy(3.dp)) {
                            Text(
                                latest?.toString() ?: "—",
                                color = MaterialTheme.colorScheme.onSurface,
                                fontSize = 48.sp,
                                lineHeight = 52.sp,
                                fontWeight = FontWeight.SemiBold,
                                letterSpacing = (-2).sp
                            )
                            if (latest != null) {
                                Text("%", color = MaterialTheme.colorScheme.onSurfaceVariant, fontSize = 22.sp)
                            }
                        }
                    }
                    Box(
                        Modifier.size(58.dp).clip(CircleShape)
                            .background(batteryColor.copy(alpha = 0.12f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            Icons.Outlined.BatteryFull,
                            contentDescription = null,
                            tint = batteryColor,
                            modifier = Modifier.size(32.dp)
                        )
                    }
                }
                Box(
                    Modifier.fillMaxWidth().height(8.dp).clip(CircleShape)
                        .background(MaterialTheme.colorScheme.surfaceVariant)
                ) {
                    if (latest != null) {
                        Box(
                            Modifier.fillMaxWidth(latest.coerceIn(0, 100) / 100f).fillMaxSize()
                                .background(batteryColor, CircleShape)
                        )
                    }
                }
                Row(
                    Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        when {
                            !state.isConnected -> "Disconnected"
                            latest == null -> "Waiting for reading"
                            else -> "Connected"
                        },
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        fontSize = 11.sp
                    )
                    if (updatedAt != null) {
                        Text(
                            "Updated " + DateFormat.getTimeInstance(DateFormat.SHORT).format(Date(updatedAt)),
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            fontSize = 11.sp
                        )
                    }
                }
            }
        }

        AppSurface(Modifier.fillMaxWidth(), shape = RoundedCornerShape(24.dp)) {
            Column(
                Modifier.fillMaxWidth().padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(14.dp)
            ) {
                Row(
                    Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text("History", fontSize = 16.sp, fontWeight = FontWeight.SemiBold)
                    Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                        listOf("24H", "7D", "30D").forEach { option ->
                            FilterChip(
                                selected = range == option,
                                onClick = { range = option },
                                label = { Text(option, fontSize = 10.sp) }
                            )
                        }
                    }
                }
                androidx.compose.foundation.Canvas(
                    Modifier.fillMaxWidth().height(172.dp)
                        .clip(RoundedCornerShape(15.dp))
                        .background(MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.22f))
                        .padding(horizontal = 10.dp, vertical = 12.dp)
                ) {
                    for (step in 1..3) {
                        val y = size.height * step / 4f
                        drawLine(
                            chartGrid,
                            androidx.compose.ui.geometry.Offset(0f, y),
                            androidx.compose.ui.geometry.Offset(size.width, y),
                            strokeWidth = 1.dp.toPx()
                        )
                    }
                    if (visibleSamples.isEmpty()) return@Canvas
                    val firstTime = visibleSamples.first().timestamp
                    val lastTime = visibleSamples.last().timestamp
                    val span = (lastTime - firstTime).coerceAtLeast(1L).toFloat()
                    val line = androidx.compose.ui.graphics.Path()
                    val area = androidx.compose.ui.graphics.Path()
                    var lastPoint = androidx.compose.ui.geometry.Offset.Zero
                    visibleSamples.forEachIndexed { index, sample ->
                        val x = ((sample.timestamp - firstTime).toFloat() / span) * size.width
                        val y = size.height - (sample.percent.coerceIn(0, 100) / 100f) * size.height
                        val point = androidx.compose.ui.geometry.Offset(x, y)
                        if (index == 0) {
                            line.moveTo(x, y)
                            area.moveTo(x, y)
                        } else {
                            line.lineTo(x, y)
                            area.lineTo(x, y)
                        }
                        lastPoint = point
                    }
                    area.lineTo(lastPoint.x, size.height)
                    area.lineTo(0f, size.height)
                    area.close()
                    drawPath(area, chartColor.copy(alpha = 0.10f))
                    drawPath(
                        line,
                        chartColor,
                        style = androidx.compose.ui.graphics.drawscope.Stroke(
                            width = 3.dp.toPx(),
                            cap = androidx.compose.ui.graphics.StrokeCap.Round,
                            join = androidx.compose.ui.graphics.StrokeJoin.Round
                        )
                    )
                    drawCircle(chartColor, radius = 4.dp.toPx(), center = lastPoint)
                }
                if (visibleSamples.isEmpty()) {
                    Text(
                        "No history yet",
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        fontSize = 12.sp
                    )
                } else {
                    val low = visibleSamples.minOf { it.percent }
                    val high = visibleSamples.maxOf { it.percent }
                    Row(
                        Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        Column(Modifier.weight(1f), verticalArrangement = Arrangement.spacedBy(2.dp)) {
                            Text("LOW", color = MaterialTheme.colorScheme.onSurfaceVariant, fontSize = 9.sp, fontWeight = FontWeight.SemiBold, letterSpacing = 0.8.sp)
                            Text("$low%", color = MaterialTheme.colorScheme.onSurface, fontSize = 15.sp, fontWeight = FontWeight.SemiBold)
                        }
                        Column(Modifier.weight(1f), verticalArrangement = Arrangement.spacedBy(2.dp)) {
                            Text("HIGH", color = MaterialTheme.colorScheme.onSurfaceVariant, fontSize = 9.sp, fontWeight = FontWeight.SemiBold, letterSpacing = 0.8.sp)
                            Text("$high%", color = MaterialTheme.colorScheme.onSurface, fontSize = 15.sp, fontWeight = FontWeight.SemiBold)
                        }
                        Column(Modifier.weight(1f), verticalArrangement = Arrangement.spacedBy(2.dp)) {
                            Text("READINGS", color = MaterialTheme.colorScheme.onSurfaceVariant, fontSize = 9.sp, fontWeight = FontWeight.SemiBold, letterSpacing = 0.8.sp)
                            Text("${visibleSamples.size}", color = MaterialTheme.colorScheme.onSurface, fontSize = 15.sp, fontWeight = FontWeight.SemiBold)
                        }
                    }
                }
            }
        }
    }
}
@Composable
fun DeviceInfoScreen(onBack: () -> Unit) {
    BackHandler(onBack = onBack)
    val context = LocalContext.current
    val manager = remember(context) { BleWatchManager.getInstance(context) }
    val state by manager.state.collectAsStateWithLifecycle()
    val device = state.connectedDevice ?: state.savedDevice
    val appVersion = remember(context) {
        runCatching {
            @Suppress("DEPRECATION")
            context.packageManager.getPackageInfo(context.packageName, 0).versionName
        }.getOrNull() ?: "Unknown"
    }

    Column(
        Modifier.fillMaxSize().statusBarsPadding().verticalScroll(rememberScrollState())
            .padding(horizontal = 22.dp).padding(top = 17.dp, bottom = 126.dp),
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        TextButton(onClick = onBack) {
            Icon(Icons.Outlined.ArrowBack, null, modifier = Modifier.size(18.dp))
            Spacer(Modifier.width(6.dp))
            Text("My Watch")
        }
        PageTitle("Device information")
        AppSurface(Modifier.fillMaxWidth(), shape = RoundedCornerShape(22.dp)) {
            Column(Modifier.fillMaxWidth().padding(17.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
                Text("WATCH", color = MaterialTheme.colorScheme.primary, fontSize = 10.sp, fontWeight = FontWeight.SemiBold)
                InfoRow("Name", device?.name ?: "No watch saved")
                InfoRow("Bluetooth address", device?.address ?: "—")
                InfoRow("Connection", state.connectionMessage)
                InfoRow("GATT services", if (state.discoveredServiceCount > 0) state.discoveredServiceCount.toString() else "Not discovered")
                InfoRow("Firmware version", "Not exposed by the current watch protocol")
                InfoRow("Hardware revision", "Not exposed by the current watch protocol")
            }
        }
        AppSurface(Modifier.fillMaxWidth(), shape = RoundedCornerShape(22.dp)) {
            Column(Modifier.fillMaxWidth().padding(17.dp), verticalArrangement = Arrangement.spacedBy(10.dp)) {
                Text("CAPABILITIES", color = MaterialTheme.colorScheme.primary, fontSize = 10.sp, fontWeight = FontWeight.SemiBold)
                InfoRow("Battery", if (state.supportsBattery) "Supported" else "Not detected")
                InfoRow("Heart rate", if (state.supportsHeartRate) "Supported" else "Not detected")
                InfoRow("Blood oxygen", if (state.supportsBloodOxygen) "Supported" else "Not detected")
                InfoRow("Wearfit commands", if (state.supportsProprietaryCommands) "Ready" else "Unavailable")
                InfoRow("Watchface transfer", if (state.supportsSifliWatchface) "Available" else "Unavailable")
                InfoRow("Find watch", if (state.canFindWatch) "Available" else "Unavailable")
                InfoRow("Time synchronization", if (state.supportsTimeSync) "Available" else "Unavailable")
            }
        }
        AppSurface(Modifier.fillMaxWidth(), shape = RoundedCornerShape(22.dp)) {
            Column(Modifier.fillMaxWidth().padding(17.dp), verticalArrangement = Arrangement.spacedBy(10.dp)) {
                Text("PHONE & APP", color = MaterialTheme.colorScheme.primary, fontSize = 10.sp, fontWeight = FontWeight.SemiBold)
                InfoRow("Phone", Build.MODEL.ifBlank { "Android device" })
                InfoRow("Android", Build.VERSION.RELEASE ?: "Unknown")
                InfoRow("Plum Watch", appVersion)
            }
        }
    }
}

@Composable
private fun InfoRow(label: String, value: String) {
    Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.Top) {
        Text(label, color = MaterialTheme.colorScheme.onSurfaceVariant, fontSize = 12.sp, modifier = Modifier.weight(0.42f))
        Text(value, color = MaterialTheme.colorScheme.onSurface, fontSize = 12.sp, modifier = Modifier.weight(0.58f), textAlign = TextAlign.End)
    }
}

@Composable
fun AlarmsScreen(onBack: () -> Unit) {
    BackHandler(onBack = onBack)
    val context = LocalContext.current
    val watchManager = remember(context) { BleWatchManager.getInstance(context) }
    val uiState by watchManager.state.collectAsStateWithLifecycle()
    val scope = rememberCoroutineScope()
    val preferences = remember(context) {
        context.getSharedPreferences("plum_watch_alarms", Context.MODE_PRIVATE)
    }
    val alarms = remember {
        mutableStateListOf<AlarmConfig>().apply {
            (0..7).forEach { id ->
                if (preferences.getBoolean("alarm_${id}_exists", false)) {
                    add(
                        AlarmConfig(
                            id = id,
                            enabled = preferences.getBoolean("alarm_${id}_enabled", false),
                            hour = preferences.getInt("alarm_${id}_hour", 8),
                            minute = preferences.getInt("alarm_${id}_minute", 0),
                            repeatMask = preferences.getInt("alarm_${id}_repeat", 128),
                            vibrate = preferences.getBoolean("alarm_${id}_vibrate", true)
                        )
                    )
                }
            }
        }
    }
    var newlyCreatedId by remember { mutableStateOf<Int?>(null) }

    fun persist(config: AlarmConfig) {
        preferences.edit()
            .putBoolean("alarm_${config.id}_exists", true)
            .putBoolean("alarm_${config.id}_enabled", config.enabled)
            .putInt("alarm_${config.id}_hour", config.hour)
            .putInt("alarm_${config.id}_minute", config.minute)
            .putInt("alarm_${config.id}_repeat", config.repeatMask)
            .putBoolean("alarm_${config.id}_vibrate", config.vibrate)
            .apply()
    }

    fun send(config: AlarmConfig, enabled: Boolean = config.enabled) {
        if (!uiState.isConnected || !uiState.supportsProprietaryCommands) return
        scope.launch {
            watchManager.setAlarm(
                id = config.id,
                enabled = enabled,
                hour = config.hour,
                minute = config.minute,
                repeatMask = config.repeatMask,
                // Wearfit alarm flags: bit 0 vibration, bit 1 sound.
                remindFlags = if (config.vibrate) 3 else 2
            )
        }
    }

    fun addAlarm(id: Int) {
        val config = AlarmConfig(id = id, enabled = true)
        alarms.add(config)
        persist(config)
        send(config)
        newlyCreatedId = id
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 22.dp)
            .padding(top = 17.dp, bottom = 126.dp),
        verticalArrangement = Arrangement.spacedBy(18.dp)
    ) {
        TextButton(onClick = onBack) {
            Icon(Icons.Outlined.ArrowBack, contentDescription = null, modifier = Modifier.size(18.dp))
            Spacer(Modifier.width(6.dp))
            Text("My Watch")
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            PageTitle("Alarms")
            IconButton(
                enabled = uiState.isConnected && uiState.supportsProprietaryCommands && alarms.size < 8,
                onClick = {
                    val used = alarms.map { it.id }.toSet()
                    val id = (0..7).firstOrNull { it !in used } ?: return@IconButton
                    addAlarm(id)
                }
            ) {
                Icon(Icons.Outlined.Add, contentDescription = "Add alarm", tint = MaterialTheme.colorScheme.primary)
            }
        }

        if (!uiState.isConnected) {
            Text(
                "Connect your watch to create or update alarms.",
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                fontSize = 13.sp
            )
        }

        if (alarms.isEmpty()) {
            AppSurface(modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(22.dp)) {
                Column(
                    modifier = Modifier.fillMaxWidth().padding(22.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Icon(Icons.Outlined.Alarm, contentDescription = null, tint = MaterialTheme.colorScheme.primary, modifier = Modifier.size(30.dp))
                    Text("No alarms yet", color = MaterialTheme.colorScheme.onSurface, fontWeight = FontWeight.SemiBold)
                    Text(
                        "Create an alarm and choose its time on the clock.",
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        fontSize = 12.sp,
                        textAlign = TextAlign.Center
                    )
                    FilledTonalButton(
                        enabled = uiState.isConnected && uiState.supportsProprietaryCommands,
                        onClick = { addAlarm(0) }
                    ) {
                        Icon(Icons.Outlined.Add, contentDescription = null)
                        Spacer(Modifier.width(6.dp))
                        Text("Add alarm")
                    }
                }
            }
        } else {
            AppSurface(modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(22.dp)) {
                Column(
                    modifier = Modifier.fillMaxWidth().padding(16.dp),
                    verticalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    alarms.sortedBy { it.id }.forEachIndexed { index, config ->
                        key(config.id) {
                            val alarmState = remember(config.id) { mutableStateOf(config) }
                            AlarmRow(
                                alarm = alarmState,
                                enabled = uiState.isConnected && uiState.supportsProprietaryCommands,
                                startExpanded = newlyCreatedId == config.id,
                                onSend = { updated ->
                                    val position = alarms.indexOfFirst { it.id == updated.id }
                                    if (position >= 0) alarms[position] = updated
                                    persist(updated)
                                    send(updated)
                                    newlyCreatedId = null
                                },
                                onDelete = { deleted ->
                                    alarms.removeAll { it.id == deleted.id }
                                    preferences.edit().remove("alarm_${deleted.id}_exists").apply()
                                    send(deleted, enabled = false)
                                }
                            )
                        }
                        if (index < alarms.lastIndex) {
                            Divider(color = MaterialTheme.colorScheme.outlineVariant, thickness = 0.5.dp)
                        }
                    }
                    if (alarms.size < 8) {
                        TextButton(
                            onClick = {
                                val used = alarms.map { it.id }.toSet()
                                val id = (0..7).firstOrNull { it !in used } ?: return@TextButton
                                addAlarm(id)
                            },
                            enabled = uiState.isConnected && uiState.supportsProprietaryCommands,
                            modifier = Modifier.align(Alignment.CenterHorizontally)
                        ) {
                            Icon(Icons.Outlined.Add, contentDescription = null)
                            Spacer(Modifier.width(5.dp))
                            Text("Add another")
                        }
                    }
                }
            }
        }
    }
}

data class AlarmConfig(
    val id: Int = 0,
    val enabled: Boolean = false,
    val hour: Int = 8,
    val minute: Int = 0,
    val repeatMask: Int = 128,
    val vibrate: Boolean = true
)

@OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
@Composable
private fun AlarmRow(
    alarm: MutableState<AlarmConfig>,
    enabled: Boolean,
    onSend: (AlarmConfig) -> Unit,
    onDelete: (AlarmConfig) -> Unit,
    startExpanded: Boolean = false
) {
    val config = alarm.value
    var expanded by remember { mutableStateOf(startExpanded) }
    var showTimePicker by remember { mutableStateOf(false) }
    val timePickerState = androidx.compose.material3.rememberTimePickerState(
        initialHour = config.hour,
        initialMinute = config.minute,
        is24Hour = true
    )

    fun update(updated: AlarmConfig) {
        alarm.value = updated
        onSend(updated)
    }

    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clickable { expanded = !expanded }
                .padding(vertical = 4.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                Switch(
                    checked = config.enabled,
                    onCheckedChange = { update(config.copy(enabled = it)) },
                    enabled = enabled,
                    modifier = Modifier.padding(end = 4.dp)
                )
                Column(verticalArrangement = Arrangement.spacedBy(2.dp)) {
                    Text(
                        "Alarm ${config.id + 1}",
                        color = if (config.enabled) MaterialTheme.colorScheme.onSurface else MaterialTheme.colorScheme.onSurfaceVariant,
                        fontWeight = FontWeight.Medium,
                        fontSize = 14.sp
                    )
                    Text(
                        "${"%02d".format(config.hour)}:${"%02d".format(config.minute)}  •  ${repeatSummary(config.repeatMask)}",
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        fontSize = 11.sp
                    )
                }
            }
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                TextButton(onClick = { expanded = !expanded }) { Text(if (expanded) "Done" else "Edit") }
                IconButton(onClick = { onDelete(config) }, enabled = enabled) {
                    Icon(Icons.Outlined.DeleteOutline, contentDescription = "Delete alarm", tint = MaterialTheme.colorScheme.error)
                }
            }
        }

        AnimatedVisibility(visible = expanded) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 56.dp, top = 8.dp, bottom = 8.dp),
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(verticalArrangement = Arrangement.spacedBy(2.dp)) {
                        Text("Time", color = MaterialTheme.colorScheme.onSurfaceVariant, fontSize = 11.sp)
                        Text(
                            "${"%02d".format(config.hour)}:${"%02d".format(config.minute)}",
                            color = MaterialTheme.colorScheme.onSurface,
                            fontSize = 25.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                    FilledTonalButton(
                        onClick = { showTimePicker = true },
                        enabled = enabled,
                        shape = RoundedCornerShape(14.dp)
                    ) { Text("Choose time") }
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Checkbox(
                        checked = config.vibrate,
                        onCheckedChange = { update(config.copy(vibrate = it)) },
                        enabled = enabled
                    )
                    Text(
                        "Vibration",
                        color = MaterialTheme.colorScheme.onSurface,
                        fontSize = 13.sp
                    )
                }
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    Text("Repeat:", color = MaterialTheme.colorScheme.onSurfaceVariant, fontSize = 12.sp, modifier = Modifier.align(Alignment.CenterVertically))
                    RepeatMaskSelector(
                        currentMask = config.repeatMask,
                        enabled = enabled,
                        onChange = { update(config.copy(repeatMask = it)) }
                    )
                }
            }
        }
    }

    if (showTimePicker) {
        MaterialAlertDialog(
            onDismissRequest = { showTimePicker = false },
            containerColor = MaterialTheme.colorScheme.surface,
            titleContentColor = MaterialTheme.colorScheme.onSurface,
            textContentColor = MaterialTheme.colorScheme.onSurfaceVariant,
            title = { Text("Alarm time") },
            text = {
                androidx.compose.material3.TimePicker(
                    state = timePickerState,
                    colors = androidx.compose.material3.TimePickerDefaults.colors(
                        containerColor = MaterialTheme.colorScheme.surface,
                        clockDialColor = MaterialTheme.colorScheme.surfaceVariant,
                        selectorColor = MaterialTheme.colorScheme.primary,
                        clockDialSelectedContentColor = MaterialTheme.colorScheme.onPrimary,
                        clockDialContentColor = MaterialTheme.colorScheme.onSurface,
                        periodSelectorSelectedContainerColor = MaterialTheme.colorScheme.primaryContainer,
                        periodSelectorContainerColor = MaterialTheme.colorScheme.surfaceVariant,
                        periodSelectorSelectedContentColor = MaterialTheme.colorScheme.onPrimaryContainer,
                        periodSelectorContentColor = MaterialTheme.colorScheme.onSurfaceVariant,
                        timeSelectorSelectedContainerColor = MaterialTheme.colorScheme.primaryContainer,
                        timeSelectorContainerColor = MaterialTheme.colorScheme.surfaceVariant,
                        timeSelectorSelectedContentColor = MaterialTheme.colorScheme.onPrimaryContainer,
                        timeSelectorContentColor = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                )
            },
            confirmButton = {
                TextButton(
                    onClick = {
                        update(config.copy(hour = timePickerState.hour, minute = timePickerState.minute))
                        showTimePicker = false
                    }
                ) { Text("Save time") }
            },
            dismissButton = {
                TextButton(onClick = { showTimePicker = false }) { Text("Cancel") }
            }
        )
    }
}

@Composable
private fun RepeatMaskSelector(
    currentMask: Int,
    enabled: Boolean = true,
    onChange: (Int) -> Unit
) {
    val days = listOf(
        1 to "Mon", 2 to "Tue", 4 to "Wed", 8 to "Thu",
        16 to "Fri", 32 to "Sat", 64 to "Sun", 128 to "Once"
    )
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .horizontalScroll(rememberScrollState()),
        horizontalArrangement = Arrangement.spacedBy(6.dp)
    ) {
        days.forEach { (bit, label) ->
            val checked = (currentMask and bit) != 0
            FilterChip(
                selected = checked,
                enabled = enabled,
                onClick = {
                    val nextMask = when {
                        checked -> currentMask and bit.inv()
                        bit == 128 -> 128
                        else -> (currentMask and 128.inv()) or bit
                    }
                    onChange(nextMask)
                },
                label = { Text(label, fontSize = 11.sp) },
                modifier = Modifier.padding(vertical = 4.dp)
            )
        }
    }
}

fun repeatSummary(mask: Int): String {
    if (mask == 0 || mask == 128) return "Once"
    val days = listOf(1 to "Mon", 2 to "Tue", 4 to "Wed", 8 to "Thu", 16 to "Fri", 32 to "Sat", 64 to "Sun")
    val selected = days.filter { (mask and it.first) != 0 }.map { it.second }
    if (selected.size == 7) return "Daily"
    if (selected.size >= 5 && days.take(5).all { (mask and it.first) != 0 } && selected.size == 5) return "Weekdays"
    if (selected.size == 2 && days.takeLast(2).all { (mask and it.first) != 0 }) return "Weekends"
    return selected.joinToString(", ")
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
    text: @Composable () -> Unit = {},
    confirmButton: @Composable () -> Unit,
    dismissButton: (@Composable () -> Unit)? = null
) {
    MaterialAlertDialog(
        onDismissRequest = onDismissRequest,
        title = title,
        text = text,
        confirmButton = confirmButton,
        dismissButton = dismissButton,
        containerColor = MaterialTheme.colorScheme.surface,
        titleContentColor = MaterialTheme.colorScheme.onSurface,
        textContentColor = MaterialTheme.colorScheme.onSurfaceVariant
    )
}
