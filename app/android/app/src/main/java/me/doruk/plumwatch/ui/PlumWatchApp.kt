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
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.GridView
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.outlined.Watch
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.border
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.WindowCompat
import kotlinx.coroutines.launch
import me.doruk.plumwatch.data.AppUpdateCheckResult
import me.doruk.plumwatch.data.AppUpdateInfo
import me.doruk.plumwatch.data.AppUpdateRepository
import me.doruk.plumwatch.ui.liquid.LiquidBottomTab
import me.doruk.plumwatch.ui.liquid.LiquidBottomTabs
import me.doruk.plumwatch.watch.BleWatchManager

private enum class AppPage(val label: String) {
    WATCH("My Watch"),
    WATCHFACES("Watchfaces"),
    SETTINGS("Settings")
}

@Composable
fun PlumWatchApp(
    watchManager: BleWatchManager,
    themeMode: String,
    onThemeModeChange: (String) -> Unit,
    uiStyle: String,
    onUiStyleChange: (String) -> Unit,
    onInstallUpdate: (AppUpdateInfo) -> Unit
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
    val currentVersionName = packageInfo?.versionName ?: "0.1.0"

    var checkingUpdates by remember { mutableStateOf(false) }
    var updateMessage by remember { mutableStateOf<String?>(null) }
    val scope = rememberCoroutineScope()

    val checkUpdates: () -> Unit = {
        if (!checkingUpdates) {
            scope.launch {
                checkingUpdates = true
                updateMessage = "Checking GitHub…"
                when (val result = AppUpdateRepository.check(currentVersionCode)) {
                    is AppUpdateCheckResult.UpToDate -> {
                        updateMessage = "You're up to date · ${result.versionName}"
                    }
                    is AppUpdateCheckResult.UpdateAvailable -> {
                        updateMessage = "Version ${result.update.versionName} found. Starting download…"
                        onInstallUpdate(result.update)
                    }
                    is AppUpdateCheckResult.Failed -> {
                        updateMessage = result.message
                    }
                }
                checkingUpdates = false
            }
        }
    }

    PlumTheme(darkTheme = darkTheme) {
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
            } else {
                val denied = results.values.any { !it }
                if (denied) {
                    Toast.makeText(
                        context,
                        "Nearby devices permission is needed to find your watch.",
                        Toast.LENGTH_LONG
                    ).show()
                }
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

        LiquidGlassHost(enabled = uiStyle == "glass") {
            Box(modifier = Modifier.fillMaxSize()) {
                when (page) {
                    AppPage.WATCH -> MyWatchScreen(
                        state = watchState,
                        onStartScan = startScan,
                        onStopScan = watchManager::stopScan,
                        onConnect = watchManager::connect,
                        onDisconnect = { watchManager.disconnect(forgetDevice = true) },
                        onOpenWatchfaces = { page = AppPage.WATCHFACES }
                    )
                    AppPage.WATCHFACES -> WatchfacesScreen()
                    AppPage.SETTINGS -> SettingsScreen(
                        themeMode = themeMode,
                        onThemeModeChange = onThemeModeChange,
                        uiStyle = uiStyle,
                        onUiStyleChange = onUiStyleChange,
                        appVersion = currentVersionName,
                        checkingUpdates = checkingUpdates,
                        updateMessage = updateMessage,
                        onCheckUpdates = checkUpdates
                    )
                }

                FloatingNavigationBar(
                    selectedPage = page,
                    onSelect = { page = it },
                    useGlass = uiStyle == "glass",
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .navigationBarsPadding()
                        .padding(bottom = 12.dp)
                )
            }
        }
    }
}

@Composable
private fun FloatingNavigationBar(
    selectedPage: AppPage,
    onSelect: (AppPage) -> Unit,
    useGlass: Boolean,
    modifier: Modifier = Modifier
) {
    val pages = AppPage.values()
    if (useGlass) {
        val backdrop = LocalLiquidBackdrop.current
        if (backdrop != null) {
            LiquidBottomTabs(
                selectedTabIndex = { selectedPage.ordinal },
                onTabSelected = { index -> onSelect(pages[index.coerceIn(pages.indices)]) },
                backdrop = backdrop,
                tabsCount = pages.size,
                modifier = modifier
                    .widthIn(max = 360.dp)
                    .fillMaxWidth(0.88f)
            ) {
                pages.forEach { page ->
                    LiquidBottomTab(onClick = { onSelect(page) }) {
                        NavigationItemContent(page, selectedPage, IconsForPage(page))
                    }
                }
            }
            return
        }
    }

    Box(
        modifier = modifier
            .widthIn(max = 360.dp)
            .fillMaxWidth(0.88f)
            .height(64.dp)
            .clip(RoundedCornerShape(32.dp))
            .background(MaterialTheme.colorScheme.surface)
            .border(
                1.dp,
                MaterialTheme.colorScheme.outline.copy(alpha = 0.38f),
                RoundedCornerShape(32.dp)
            )
            .padding(horizontal = 5.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            pages.forEach { page ->
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .height(60.dp)
                        .clickable { onSelect(page) },
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    NavigationItemContent(page, selectedPage, IconsForPage(page))
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
        else MaterialTheme.colorScheme.onSurfaceVariant
    )
    Text(
        text = page.label,
        color = if (selected) MaterialTheme.colorScheme.primary
        else MaterialTheme.colorScheme.onSurfaceVariant,
        fontSize = 10.sp,
        fontWeight = if (selected) FontWeight.SemiBold else FontWeight.Medium,
        letterSpacing = 0.1.sp
    )
}

private fun IconsForPage(page: AppPage): ImageVector = when (page) {
    AppPage.WATCH -> Icons.Outlined.Watch
    AppPage.WATCHFACES -> Icons.Outlined.GridView
    AppPage.SETTINGS -> Icons.Outlined.Settings
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
