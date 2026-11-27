package me.doruk.plumwatch.ui

import android.Manifest
import android.app.Activity
import android.bluetooth.BluetoothAdapter
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.scaleIn
import androidx.compose.animation.togetherWith
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Alarm
import androidx.compose.material.icons.outlined.BatteryFull
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.CameraAlt
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.GridView
import androidx.compose.material.icons.outlined.MusicNote
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.outlined.Watch
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.zIndex
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.WindowCompat
import me.doruk.plumwatch.R
import me.doruk.plumwatch.data.AppUpdateDownloadState
import me.doruk.plumwatch.ui.glass.LiquidBottomTab
import me.doruk.plumwatch.ui.glass.LiquidBottomTabs
import me.doruk.plumwatch.ui.glass.liquidBottomTabColor
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.random.Random
import me.doruk.plumwatch.data.AppUpdateCheckResult
import me.doruk.plumwatch.data.AppUpdateInfo
import me.doruk.plumwatch.data.AppUpdateRepository
import me.doruk.plumwatch.watch.BleWatchManager
import me.doruk.plumwatch.watch.WatchDevice

private enum class AppPage(val label: String) {
    WATCH("My Watch"),
    STORE("Store"),
    SETTINGS("Settings"),
    WATCH_SETTINGS("Other Settings"),
    ALARMS("Alarms"),
    HEALTH("Health"),
    BATTERY("Battery"),
    DEVICE_INFO("Device information"),
    NOTIFICATIONS("Notifications"),
    CAMERA("Camera"),
    MUSIC("Music"),
    SIMULATOR("Simulator")
}

@Composable
fun PlumWatchApp(
    watchManager: BleWatchManager,
    themeMode: String,
    onThemeModeChange: (String) -> Unit,
    warmLight: Boolean,
    onWarmLightChange: (Boolean) -> Unit,
    uiStyle: String,
    onUiStyleChange: (String) -> Unit,
    colorPalette: String,
    onColorPaletteChange: (String) -> Unit,
    updateDownloadState: AppUpdateDownloadState,
    onInstallUpdate: (AppUpdateInfo) -> Unit,
    onRemoveWatch: () -> Unit,
    onUpdateAvailable: (AppUpdateInfo) -> Unit,
    settingsOpenRequest: Int
) {
    val context = LocalContext.current
    val view = LocalView.current
    val systemDark = androidx.compose.foundation.isSystemInDarkTheme()
    val darkTheme = when (themeMode) {
        "dark" -> true
        "light" -> false
        else -> systemDark
    }
    val packageInfo = remember {
        runCatching { context.packageManager.getPackageInfo(context.packageName, 0) }.getOrNull()
    }
    @Suppress("DEPRECATION")
    val currentVersionCode = packageInfo?.versionCode ?: 1
    val currentVersionName = packageInfo?.versionName ?: "26.0.1"

    var checkingUpdates by remember { mutableStateOf(false) }
    var updateMessage by remember { mutableStateOf<String?>(null) }
    var availableUpdate by remember { mutableStateOf<AppUpdateInfo?>(null) }
    val scope = rememberCoroutineScope()

    LaunchedEffect(currentVersionCode) {
        checkingUpdates = true
        try {
            delay(Random.nextLong(200L, 401L))
            when (val result = AppUpdateRepository.check(currentVersionName, currentVersionCode)) {
                is AppUpdateCheckResult.UpToDate -> {
                    availableUpdate = null
                    updateMessage = null
                }
                is AppUpdateCheckResult.UpdateAvailable -> {
                    availableUpdate = result.update
                    updateMessage = "Version ${result.update.versionName} is available to install."
                    onUpdateAvailable(result.update)
                }
                is AppUpdateCheckResult.Failed -> {
                    // Startup checks are quiet; the manual check surfaces actionable errors.
                }
            }
        } finally {
            checkingUpdates = false
        }
    }

    val checkUpdates: () -> Unit = {
        if (!checkingUpdates && !updateDownloadState.isDownloading &&
            !updateDownloadState.isOpeningInstaller
        ) {
            scope.launch {
                checkingUpdates = true
                updateMessage = "Checking GitHub…"
                try {
                    delay(Random.nextLong(200L, 401L))
                    when (val result = AppUpdateRepository.check(currentVersionName, currentVersionCode)) {
                        is AppUpdateCheckResult.UpToDate -> {
                            availableUpdate = null
                            updateMessage = "You're up to date"
                        }
                        is AppUpdateCheckResult.UpdateAvailable -> {
                            availableUpdate = result.update
                            updateMessage = "Version ${result.update.versionName} is available to install."
                            onUpdateAvailable(result.update)
                        }
                        is AppUpdateCheckResult.Failed -> {
                            updateMessage = result.message
                        }
                    }
                } finally {
                    checkingUpdates = false
                }
            }
        }
    }

    PlumTheme(
        darkTheme = darkTheme,
        paletteId = colorPalette,
        warmLight = themeMode == "light" && warmLight
    ) {
        SideEffect {
            val window = (context as? Activity)?.window
            if (window != null) {
                val controller = WindowCompat.getInsetsController(window, view)
                controller.isAppearanceLightStatusBars = !darkTheme
                controller.isAppearanceLightNavigationBars = !darkTheme
            }
        }

        val watchState by watchManager.state.collectAsState()
        var page by remember { mutableStateOf(AppPage.WATCH) }
        var handledCameraRequest by remember { mutableStateOf(watchState.cameraRequestSequence) }
        LaunchedEffect(watchState.cameraRequestSequence) {
            if (watchState.cameraRequestSequence > handledCameraRequest) {
                handledCameraRequest = watchState.cameraRequestSequence
                if (watchState.isConnected) page = AppPage.CAMERA
            }
        }
        LaunchedEffect(settingsOpenRequest) {
            if (settingsOpenRequest > 0) page = AppPage.SETTINGS
        }

        val bluetoothEnableLauncher = rememberLauncherForActivityResult(
            contract = ActivityResultContracts.StartActivityForResult()
        ) {
            if (watchManager.isBluetoothEnabled()) {
                watchManager.startScan()
            } else {
                Toast.makeText(context, "Bluetooth is still turned off.", Toast.LENGTH_SHORT).show()
            }
        }

        val permissionLauncher = rememberLauncherForActivityResult(
            contract = ActivityResultContracts.RequestMultiplePermissions()
        ) { results ->
            if (hasBluetoothPermissions(context)) {
                if (watchManager.isBluetoothEnabled()) {
                    watchManager.startScan()
                } else {
                    bluetoothEnableLauncher.launch(
                        Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE)
                    )
                }
            } else if (results.values.any { !it }) {
                Toast.makeText(
                    context,
                    "Nearby devices permission is needed to find your watch.",
                    Toast.LENGTH_LONG
                ).show()
            }
        }

        val startScan: () -> Unit = {
            if (!watchManager.isBluetoothSupported()) {
                Toast.makeText(context, "This phone does not support Bluetooth.", Toast.LENGTH_SHORT).show()
            } else {
                val missing = missingBluetoothPermissions(context)
                when {
                    missing.isNotEmpty() -> permissionLauncher.launch(missing)
                    !watchManager.isBluetoothEnabled() -> bluetoothEnableLauncher.launch(
                        Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE)
                    )
                    else -> watchManager.startScan()
                }
            }
        }

        LiquidGlassHost(
            enabled = uiStyle == "glass",
            content = {
                Box(Modifier.fillMaxSize()) {
                    AnimatedContent(
                        targetState = page,
                        modifier = Modifier.fillMaxSize(),
                        transitionSpec = {
                            val movingForward = targetState.ordinal > initialState.ordinal
                            val direction = if (movingForward) 1 else -1
                            (fadeIn(tween(260)) +
                                slideInHorizontally(
                                    animationSpec = tween(320, easing = FastOutSlowInEasing),
                                    initialOffsetX = { width -> direction * (width / 18) }
                                )) togetherWith
                                (fadeOut(tween(190)) +
                                    slideOutHorizontally(
                                        animationSpec = tween(260, easing = FastOutSlowInEasing),
                                        targetOffsetX = { width -> -direction * (width / 24) }
                                    ))
                        },
                        label = "app-page-transition"
                    ) { targetPage ->
                        when (targetPage) {
                            AppPage.WATCH -> MyWatchScreen(
                                state = watchState,
                                onStartScan = startScan,
                                onStopScan = watchManager::stopScan,
                                onConnect = watchManager::connect,
                                onReconnect = watchManager::reconnectSavedDevice,
                                onRemoveWatch = onRemoveWatch,
                                onOpenStore = { page = AppPage.STORE },
                                onOpenOtherSettings = { page = AppPage.WATCH_SETTINGS },
                                onFindWatch = watchManager::findWatch,
                                onOpenAlarms = { page = AppPage.ALARMS },
                                onOpenHealth = { page = AppPage.HEALTH },
                                onOpenBattery = { page = AppPage.BATTERY },
                                onOpenDeviceInfo = { page = AppPage.DEVICE_INFO },
                                onOpenNotifications = { page = AppPage.NOTIFICATIONS },
                                onOpenCamera = { page = AppPage.CAMERA },
                                onOpenMusic = { page = AppPage.MUSIC },
                                onOpenSimulator = { page = AppPage.SIMULATOR }
                            )
                            AppPage.STORE -> StoreScreen(watchManager = watchManager, watchState = watchState)
                            AppPage.SETTINGS -> SettingsScreen(
                                themeMode = themeMode,
                                onThemeModeChange = onThemeModeChange,
                                warmLight = warmLight,
                                onWarmLightChange = onWarmLightChange,
                                uiStyle = uiStyle,
                                onUiStyleChange = onUiStyleChange,
                                colorPalette = colorPalette,
                                onColorPaletteChange = onColorPaletteChange,
                                appVersion = currentVersionName,
                                checkingUpdates = checkingUpdates,
                                updateMessage = updateMessage,
                                availableUpdate = availableUpdate,
                                downloadState = updateDownloadState,
                                onCheckUpdates = checkUpdates,
                                onInstallUpdate = onInstallUpdate
                            )
                            AppPage.WATCH_SETTINGS -> OtherWatchSettingsScreen(
                                onBack = { page = AppPage.WATCH }
                            )
                            AppPage.ALARMS -> AlarmsScreen(onBack = { page = AppPage.WATCH })
                            AppPage.HEALTH -> HealthScreen(onBack = { page = AppPage.WATCH })
                            AppPage.BATTERY -> BatteryHistoryScreen(onBack = { page = AppPage.WATCH })
                            AppPage.DEVICE_INFO -> DeviceInfoScreen(onBack = { page = AppPage.WATCH })
                            AppPage.NOTIFICATIONS -> NotificationsScreen(onBack = { page = AppPage.WATCH })
                            AppPage.CAMERA -> CameraScreen(
                                watchManager = watchManager,
                                onBack = { page = AppPage.WATCH }
                            )
                            AppPage.MUSIC -> MusicScreen(
                                onBack = { page = AppPage.WATCH }
                            )
                            AppPage.SIMULATOR -> FirmwareSimulatorScreen(
                                onBack = { page = AppPage.WATCH }
                            )
                        }
                    }
                    AnimatedVisibility(
                        visible = false,
                        modifier = Modifier.fillMaxSize().zIndex(2f),
                        enter = fadeIn(tween(260)) + scaleIn(
                            initialScale = 0.92f,
                            animationSpec = tween(480, easing = FastOutSlowInEasing)
                        ),
                        exit = fadeOut(tween(180))
                    ) {
                        Box(
                            modifier = Modifier.fillMaxSize().background(MaterialTheme.colorScheme.background),
                            contentAlignment = Alignment.Center
                        ) {
                            Box(
                                modifier = Modifier
                                    .size(148.dp)
                                    .clip(CircleShape)
                                    .background(MaterialTheme.colorScheme.primary.copy(alpha = 0.065f)),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.ic_launcher_foreground),
                                    contentDescription = null,
                                    modifier = Modifier.size(78.dp),
                                    colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.primary)
                                )
                            }
                        }
                    }
                }
            },
            overlay = {
                FloatingNavigationBar(
                    selectedPage = page,
                    onSelect = { page = it },
                    useGlass = uiStyle == "glass",
                    backdrop = LocalLiquidBackdrop.current,
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .padding(bottom = 8.dp)
                )
            }
        )
    }
}

@Composable
private fun FloatingNavigationBar(
    selectedPage: AppPage,
    onSelect: (AppPage) -> Unit,
    useGlass: Boolean,
    backdrop: com.kyant.backdrop.Backdrop?,
    modifier: Modifier = Modifier
) {
    val pages = listOf(AppPage.WATCH, AppPage.STORE, AppPage.SETTINGS)
    val selectedIndex = pages.indexOf(selectedPage).coerceAtLeast(0)
    val selectedTabIndex = remember(selectedIndex) { { selectedIndex } }

    if (useGlass && backdrop != null) {
        LiquidBottomTabs(
            selectedTabIndex = selectedTabIndex,
            onTabSelected = { index -> pages.getOrNull(index)?.let(onSelect) },
            backdrop = backdrop,
            tabsCount = pages.size,
            modifier = modifier
                .navigationBarsPadding()
                .widthIn(max = 360.dp)
                .fillMaxWidth(0.88f)
                .height(72.dp)
        ) {
            pages.forEachIndexed { index, page ->
                LiquidBottomTab(onClick = { onSelect(page) }, tabIndex = index) {
                    val tint = liquidBottomTabColor(
                        MaterialTheme.colorScheme.primary,
                        MaterialTheme.colorScheme.onSurfaceVariant
                    )
                    Icon(
                        imageVector = IconsForPage(page),
                        contentDescription = page.label,
                        tint = tint,
                        modifier = Modifier.size(24.dp)
                    )
                    Text(
                        text = page.label,
                        color = tint,
                        fontSize = 12.sp,
                        fontWeight = if (index == selectedIndex) FontWeight.SemiBold else FontWeight.Medium,
                        letterSpacing = 0.1.sp
                    )
                }
            }
        }
    } else {
        BoxWithConstraints(
            modifier = modifier
                .navigationBarsPadding()
                .widthIn(max = 360.dp)
                .fillMaxWidth(0.88f)
                .height(72.dp)
                .clip(RoundedCornerShape(36.dp))
                .background(MaterialTheme.colorScheme.surface)
                .padding(horizontal = 5.dp)
        ) {
            val tabWidth = maxWidth / pages.size
            val indicatorOffset by animateDpAsState(
                targetValue = tabWidth * selectedIndex,
                animationSpec = spring(dampingRatio = 0.76f, stiffness = 430f),
                label = "classic-navbar-indicator"
            )
            Box(
                Modifier
                    .offset(x = indicatorOffset)
                    .width(tabWidth)
                    .height(62.dp)
                    .align(Alignment.CenterStart)
                    .clip(RoundedCornerShape(30.dp))
                    .background(MaterialTheme.colorScheme.background.copy(alpha = 0.82f))
            )
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .pointerInput(maxWidth, pages) {
                        detectDragGestures { change, _ ->
                            val index = (change.position.x / size.width * pages.size)
                                .toInt().coerceIn(pages.indices)
                            pages.getOrNull(index)?.let(onSelect)
                        }
                    },
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                pages.forEach { page ->
                    Column(
                        modifier = Modifier
                            .weight(1f)
                            .height(68.dp)
                            .clip(RoundedCornerShape(28.dp))
                            .clickable { onSelect(page) }
                            .padding(top = 4.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(2.dp, Alignment.CenterVertically)
                    ) {
                        NavigationItemContent(page, selectedPage, IconsForPage(page))
                    }
                }
            }
        }
    }
}

@Composable
private fun NavigationItemContent(
    page: AppPage,
    selectedPage: AppPage,
    icon: ImageVector
) {
    val selected = selectedPage == page
    Icon(
        imageVector = icon,
        contentDescription = page.label,
        tint = if (selected) MaterialTheme.colorScheme.primary
        else MaterialTheme.colorScheme.onSurfaceVariant,
        modifier = Modifier.size(24.dp)
    )
    Text(
        text = page.label,
        color = if (selected) MaterialTheme.colorScheme.primary
        else MaterialTheme.colorScheme.onSurfaceVariant,
        fontSize = 12.sp,
        fontWeight = if (selected) FontWeight.SemiBold else FontWeight.Medium,
        letterSpacing = 0.1.sp
    )
}

private fun IconsForPage(page: AppPage): ImageVector = when (page) {
    AppPage.WATCH -> Icons.Outlined.Watch
    AppPage.STORE -> Icons.Outlined.GridView
    AppPage.SETTINGS -> Icons.Outlined.Settings
    AppPage.WATCH_SETTINGS -> Icons.Outlined.Settings
    AppPage.ALARMS -> Icons.Outlined.Alarm
    AppPage.HEALTH -> Icons.Outlined.FavoriteBorder
    AppPage.BATTERY -> Icons.Outlined.BatteryFull
    AppPage.DEVICE_INFO -> Icons.Outlined.Info
    AppPage.NOTIFICATIONS -> Icons.Outlined.Notifications
    AppPage.CAMERA -> Icons.Outlined.CameraAlt
    AppPage.MUSIC -> Icons.Outlined.MusicNote
    AppPage.SIMULATOR -> Icons.Outlined.Watch
}

private fun missingBluetoothPermissions(context: android.content.Context): Array<String> {
    val required = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
        arrayOf(
            Manifest.permission.BLUETOOTH_SCAN,
            Manifest.permission.BLUETOOTH_CONNECT
        )
    } else {
        arrayOf(Manifest.permission.ACCESS_FINE_LOCATION)
    }

    return required.filter {
        context.checkSelfPermission(it) != PackageManager.PERMISSION_GRANTED
    }.toTypedArray()
}

private fun hasBluetoothPermissions(context: android.content.Context): Boolean =
    missingBluetoothPermissions(context).isEmpty()
