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
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.spring
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
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.CircleShape
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
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.WindowCompat
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
    onThemeModeChange: (String) -> Unit
) {
    val context = LocalContext.current
    val view = LocalView.current
    val systemDark = androidx.compose.foundation.isSystemInDarkTheme()
    val darkTheme = when (themeMode) {
        "dark" -> true
        "light" -> false
        else -> systemDark
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
                val permanentlyDeniedOrMissing = results.values.any { !it }
                if (permanentlyDeniedOrMissing) {
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

        LiquidGlassHost(darkTheme = darkTheme) {
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
                        bluetoothSupported = watchManager.isBluetoothSupported(),
                        bluetoothEnabled = watchManager.isBluetoothEnabled(),
                        isConnected = watchState.isConnected
                    )
                }

                FloatingNavigationBar(
                    selectedPage = page,
                    onSelect = { page = it },
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
    modifier: Modifier = Modifier
) {
    BoxWithConstraints(
        modifier = modifier
            .widthIn(max = 360.dp)
            .fillMaxWidth(0.88f)
            .height(76.dp)
    ) {
        val tabWidth = maxWidth / AppPage.values().size
        val selectedOffset by animateDpAsState(
            targetValue = tabWidth * selectedPage.ordinal,
            animationSpec = spring(dampingRatio = 0.76f, stiffness = 520f),
            label = "liquid-tab-position"
        )

        LiquidGlassSurface(
            modifier = Modifier.fillMaxSize(),
            shape = CircleShape,
            fillAlpha = 0.12f
        ) {
            Box(Modifier.fillMaxSize()) {
                LiquidGlassSurface(
                    modifier = Modifier
                        .offset(x = selectedOffset)
                        .width(tabWidth)
                        .height(68.dp)
                        .padding(4.dp),
                    shape = CircleShape,
                    fillAlpha = 0.13f
                ) {}

                Row(
                    modifier = Modifier.fillMaxSize().padding(horizontal = 5.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    NavigationItem(
                        page = AppPage.WATCH,
                        selectedPage = selectedPage,
                        icon = Icons.Outlined.Watch,
                        onSelect = onSelect,
                        modifier = Modifier.weight(1f)
                    )
                    NavigationItem(
                        page = AppPage.WATCHFACES,
                        selectedPage = selectedPage,
                        icon = Icons.Outlined.GridView,
                        onSelect = onSelect,
                        modifier = Modifier.weight(1f)
                    )
                    NavigationItem(
                        page = AppPage.SETTINGS,
                        selectedPage = selectedPage,
                        icon = Icons.Outlined.Settings,
                        onSelect = onSelect,
                        modifier = Modifier.weight(1f)
                    )
                }
            }
        }
    }
}

@Composable
private fun NavigationItem(
    page: AppPage,
    selectedPage: AppPage,
    icon: ImageVector,
    onSelect: (AppPage) -> Unit,
    modifier: Modifier = Modifier
) {
    val selected = selectedPage == page

    Column(
        modifier = modifier
            .height(66.dp)
            .clickable { onSelect(page) },
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
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
