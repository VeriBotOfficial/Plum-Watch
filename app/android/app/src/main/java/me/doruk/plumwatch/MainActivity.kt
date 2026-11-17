package me.doruk.plumwatch

import android.Manifest
import android.annotation.SuppressLint
import android.app.Activity
import android.app.DownloadManager
import android.app.NotificationChannel
import android.app.NotificationManager
import android.bluetooth.le.ScanFilter
import android.companion.AssociationRequest
import android.companion.BluetoothLeDeviceFilter
import android.companion.CompanionDeviceManager
import android.companion.ObservingDevicePresenceRequest
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.Environment
import android.os.Handler
import android.os.Looper
import android.provider.Settings
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.result.IntentSenderRequest
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.core.content.ContextCompat
import androidx.core.view.WindowCompat
import me.doruk.plumwatch.data.AppUpdateDownloadState
import me.doruk.plumwatch.data.AppUpdateInfo
import me.doruk.plumwatch.ui.PlumWatchApp
import me.doruk.plumwatch.watch.BleWatchManager
import me.doruk.plumwatch.watch.WatchDevice
import java.security.MessageDigest

class MainActivity : ComponentActivity() {
    private lateinit var watchManager: BleWatchManager

    private val companionPreferences by lazy {
        getSharedPreferences(PREF_COMPANION, MODE_PRIVATE)
    }
    private var pendingAssociationDevice: WatchDevice? = null

    private val associationLauncher = registerForActivityResult(
        ActivityResultContracts.StartIntentSenderForResult()
    ) { result ->
        val device = pendingAssociationDevice
        if (result.resultCode == Activity.RESULT_OK && device != null &&
            Build.VERSION.SDK_INT < Build.VERSION_CODES.TIRAMISU
        ) {
            companionPreferences.edit()
                .putString(KEY_COMPANION_ADDRESS, device.address)
                .putString(KEY_COMPANION_NAME, device.name)
                .apply()
            pendingAssociationDevice = null
            beginPresenceObservation(device.address)
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
                watchManager.onCompanionDeviceAppeared()
            } else {
                Toast.makeText(
                    this,
                    "Watch saved. This Android version can reconnect automatically while Plum Watch is running.",
                    Toast.LENGTH_LONG
                ).show()
            }
        } else if (result.resultCode != Activity.RESULT_OK) {
            pendingAssociationDevice = null
            Toast.makeText(
                this,
                "Background reconnection wasn't enabled. You can still reconnect while Plum Watch is open.",
                Toast.LENGTH_LONG
            ).show()
        }
    }
    private val updatePreferences by lazy {
        getSharedPreferences("plum-watch-update", MODE_PRIVATE)
    }

    private val updateDownloadState = mutableStateOf(AppUpdateDownloadState())
    private val progressHandler = Handler(Looper.getMainLooper())

    private var pendingUpdate: AppUpdateInfo? = null
    private var pendingInstallerUri: Uri? = null
    private var activeDownloadId: Long = -1L
    private var expectedApkSha256: String? = null
    private var updateReceiverRegistered = false

    private val progressPoller = object : Runnable {
        override fun run() {
            val downloadId = activeDownloadId
            if (downloadId == -1L) return
            refreshDownloadProgress(downloadId)
            if (activeDownloadId == downloadId) {
                progressHandler.postDelayed(this, PROGRESS_POLL_INTERVAL_MS)
            }
        }
    }

    private val updateDownloadReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
            if (intent.action != DownloadManager.ACTION_DOWNLOAD_COMPLETE) return
            val completedId = intent.getLongExtra(DownloadManager.EXTRA_DOWNLOAD_ID, -1L)
            handleDownloadCompletion(completedId)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)

        activeDownloadId = updatePreferences.getLong(KEY_DOWNLOAD_ID, -1L)
        expectedApkSha256 = updatePreferences.getString(KEY_EXPECTED_SHA256, null)

        watchManager = BleWatchManager.getInstance(applicationContext)
        registerUpdateReceiver()
        createUpdateNotificationChannel()
        restoreCompanionAssociation()

        val preferences = getSharedPreferences("plum-watch-preferences", MODE_PRIVATE)

        setContent {
            var themeMode by rememberSaveable {
                mutableStateOf(preferences.getString("theme-mode", "system") ?: "system")
            }
            var uiStyle by rememberSaveable {
                mutableStateOf(preferences.getString("ui-style", "classic") ?: "classic")
            }

            PlumWatchApp(
                watchManager = watchManager,
                themeMode = themeMode,
                onThemeModeChange = { mode ->
                    themeMode = mode
                    preferences.edit().putString("theme-mode", mode).apply()
                },
                uiStyle = uiStyle,
                onUiStyleChange = { style ->
                    uiStyle = style
                    preferences.edit().putString("ui-style", style).apply()
                },
                updateDownloadState = updateDownloadState.value,
                onInstallUpdate = ::downloadAndInstallUpdate,
                onAssociateWatch = ::associateWatch,
                onRemoveWatch = ::removeSavedWatch,
                onUpdateAvailable = ::notifyUpdateAvailable
            )
        }
    }

    private fun registerUpdateReceiver() {
        val filter = IntentFilter(DownloadManager.ACTION_DOWNLOAD_COMPLETE)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            // DownloadManager is a system package; its completion broadcast must reach an exported receiver.
            registerReceiver(updateDownloadReceiver, filter, Context.RECEIVER_EXPORTED)
        } else {
            @Suppress("DEPRECATION")
            registerReceiver(updateDownloadReceiver, filter)
        }
        updateReceiverRegistered = true
    }

    @SuppressLint("MissingPermission")
    private fun associateWatch(device: WatchDevice) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O ||
            !packageManager.hasSystemFeature(PackageManager.FEATURE_COMPANION_DEVICE_SETUP)
        ) {
            Toast.makeText(
                this,
                "Android companion-device support is unavailable. The watch will still be saved for reconnecting while the app is open.",
                Toast.LENGTH_LONG
            ).show()
            return
        }

        val companionManager =
            getSystemService(Context.COMPANION_DEVICE_SERVICE) as? CompanionDeviceManager
        if (companionManager == null) {
            Toast.makeText(this, "Android companion-device support is unavailable.", Toast.LENGTH_LONG).show()
            return
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            val existing = runCatching {
                companionManager.myAssociations.firstOrNull {
                    it.deviceMacAddress.equals(device.address, ignoreCase = true)
                }
            }.getOrNull()
            if (existing != null) {
                saveCompanionAssociation(device, existing.id)
                beginPresenceObservation(device.address)
                watchManager.onCompanionDeviceAppeared()
                return
            }
        }

        pendingAssociationDevice = device
        val bleFilter = BluetoothLeDeviceFilter.Builder()
            .setScanFilter(ScanFilter.Builder().setDeviceAddress(device.address).build())
            .build()
        val request = AssociationRequest.Builder()
            .addDeviceFilter(bleFilter)
            .setSingleDevice(true)
            .build()

        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                companionManager.associate(
                    request,
                    mainExecutor,
                    object : CompanionDeviceManager.Callback() {
                        override fun onAssociationPending(intentSender: android.content.IntentSender) {
                            associationLauncher.launch(
                                IntentSenderRequest.Builder(intentSender).build()
                            )
                        }

                        override fun onAssociationCreated(
                            associationInfo: android.companion.AssociationInfo
                        ) {
                            val selected = pendingAssociationDevice ?: device
                            pendingAssociationDevice = null
                            saveCompanionAssociation(selected, associationInfo.id)
                            beginPresenceObservation(selected.address)
                            watchManager.onCompanionDeviceAppeared()
                        }

                        override fun onFailure(error: CharSequence?) {
                            pendingAssociationDevice = null
                            Toast.makeText(
                                this@MainActivity,
                                error?.toString() ?: "Could not enable background watch reconnection.",
                                Toast.LENGTH_LONG
                            ).show()
                        }
                    }
                )
            } else {
                @Suppress("DEPRECATION")
                companionManager.associate(
                    request,
                    object : CompanionDeviceManager.Callback() {
                        override fun onDeviceFound(intentSender: android.content.IntentSender) {
                            associationLauncher.launch(
                                IntentSenderRequest.Builder(intentSender).build()
                            )
                        }

                        override fun onFailure(error: CharSequence?) {
                            pendingAssociationDevice = null
                            Toast.makeText(
                                this@MainActivity,
                                error?.toString() ?: "Could not associate this watch.",
                                Toast.LENGTH_LONG
                            ).show()
                        }
                    },
                    Handler(Looper.getMainLooper())
                )
            }
        } catch (exception: Exception) {
            pendingAssociationDevice = null
            Toast.makeText(
                this,
                exception.message ?: "Could not set up background reconnection.",
                Toast.LENGTH_LONG
            ).show()
        }
    }

    private fun saveCompanionAssociation(device: WatchDevice, associationId: Int) {
        companionPreferences.edit()
            .putInt(KEY_COMPANION_ASSOCIATION_ID, associationId)
            .putString(KEY_COMPANION_ADDRESS, device.address)
            .putString(KEY_COMPANION_NAME, device.name)
            .apply()
    }

    @SuppressLint("MissingPermission")
    private fun beginPresenceObservation(address: String) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.S) return
        try {
            watchManager.setCompanionPresenceMonitoring(true)
            val companionManager =
                getSystemService(Context.COMPANION_DEVICE_SERVICE) as CompanionDeviceManager
            if (Build.VERSION.SDK_INT >= 36) {
                val associationId = companionPreferences.getInt(KEY_COMPANION_ASSOCIATION_ID, -1)
                if (associationId == -1) {
                    throw IllegalStateException("Android didn't return a companion association ID.")
                }
                val request = ObservingDevicePresenceRequest.Builder()
                    .setAssociationId(associationId)
                    .build()
                companionManager.startObservingDevicePresence(request)
            } else {
                @Suppress("DEPRECATION")
                companionManager.startObservingDevicePresence(address)
            }
        } catch (exception: Exception) {
            watchManager.setCompanionPresenceMonitoring(false)
            Toast.makeText(
                this,
                exception.message ?: "Android couldn't start background watch detection.",
                Toast.LENGTH_LONG
            ).show()
        }
    }

    @SuppressLint("MissingPermission")
    private fun restoreCompanionAssociation() {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.S) return
        val address = companionPreferences.getString(KEY_COMPANION_ADDRESS, null)
            ?.takeIf { it.isNotBlank() } ?: return

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            val associationId = companionPreferences.getInt(KEY_COMPANION_ASSOCIATION_ID, -1)
            val association = runCatching {
                if (associationId == -1) null
                else getSystemService(CompanionDeviceManager::class.java)
                    ?.myAssociations?.firstOrNull { it.id == associationId }
            }.getOrNull()
            if (association == null) {
                companionPreferences.edit()
                    .remove(KEY_COMPANION_ASSOCIATION_ID)
                    .remove(KEY_COMPANION_ADDRESS)
                    .remove(KEY_COMPANION_NAME)
                    .apply()
                watchManager.setCompanionPresenceMonitoring(false)
                return
            }
        }

        beginPresenceObservation(address)
    }

    @SuppressLint("MissingPermission")
    private fun removeSavedWatch() {
        val address = companionPreferences.getString(KEY_COMPANION_ADDRESS, null)
        val associationId = companionPreferences.getInt(KEY_COMPANION_ASSOCIATION_ID, -1)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S && !address.isNullOrBlank()) {
            runCatching {
                val companionManager =
                    getSystemService(Context.COMPANION_DEVICE_SERVICE) as CompanionDeviceManager
                if (Build.VERSION.SDK_INT >= 36 && associationId != -1) {
                    val request = ObservingDevicePresenceRequest.Builder()
                        .setAssociationId(associationId)
                        .build()
                    companionManager.stopObservingDevicePresence(request)
                } else {
                    @Suppress("DEPRECATION")
                    companionManager.stopObservingDevicePresence(address)
                }

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU && associationId != -1) {
                    companionManager.disassociate(associationId)
                } else {
                    @Suppress("DEPRECATION")
                    companionManager.disassociate(address)
                }
            }
        }

        companionPreferences.edit()
            .remove(KEY_COMPANION_ASSOCIATION_ID)
            .remove(KEY_COMPANION_ADDRESS)
            .remove(KEY_COMPANION_NAME)
            .apply()
        watchManager.disconnect(forgetDevice = true)
    }

    private fun createUpdateNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                UPDATE_CHANNEL_ID,
                "App updates",
                NotificationManager.IMPORTANCE_DEFAULT
            ).apply {
                description = "Notifications when a new Plum Watch version is available."
            }
            getSystemService(NotificationManager::class.java).createNotificationChannel(channel)
        }
    }

    private fun notifyUpdateAvailable(update: AppUpdateInfo) {
        val previouslyNotified = updatePreferences.getInt(KEY_NOTIFIED_UPDATE_VERSION, -1)
        if (previouslyNotified >= update.versionCode) return

        val notificationsAllowed = Build.VERSION.SDK_INT < Build.VERSION_CODES.TIRAMISU ||
            ContextCompat.checkSelfPermission(this, Manifest.permission.POST_NOTIFICATIONS) ==
            PackageManager.PERMISSION_GRANTED

        if (notificationsAllowed && NotificationManagerCompat.from(this).areNotificationsEnabled()) {
            val openAppIntent = Intent(this, MainActivity::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
            }
            val pendingIntent = android.app.PendingIntent.getActivity(
                this,
                0,
                openAppIntent,
                android.app.PendingIntent.FLAG_UPDATE_CURRENT or android.app.PendingIntent.FLAG_IMMUTABLE
            )
            val notification = NotificationCompat.Builder(this, UPDATE_CHANNEL_ID)
                .setSmallIcon(android.R.drawable.stat_sys_download_done)
                .setContentTitle("Plum Watch update available")
                .setContentText("Version ${update.versionName} is ready. Open Settings to install.")
                .setStyle(
                    NotificationCompat.BigTextStyle().bigText(
                        "Plum Watch ${update.versionName} is ready. Open the app's Settings tab to install the update."
                    )
                )
                .setContentIntent(pendingIntent)
                .setAutoCancel(true)
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .build()

            runCatching {
                NotificationManagerCompat.from(this).notify(UPDATE_NOTIFICATION_ID, notification)
            }
        } else {
            Toast.makeText(
                this,
                "Plum Watch ${update.versionName} is available. Open Settings to install the update.",
                Toast.LENGTH_LONG
            ).show()
        }

        updatePreferences.edit()
            .putInt(KEY_NOTIFIED_UPDATE_VERSION, update.versionCode)
            .apply()
    }

    private fun downloadAndInstallUpdate(update: AppUpdateInfo) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O &&
            !packageManager.canRequestPackageInstalls()
        ) {
            pendingUpdate = update
            Toast.makeText(
                this,
                "Allow Plum Watch to install updates, then return here.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(
                Intent(
                    Settings.ACTION_MANAGE_UNKNOWN_APP_SOURCES,
                    Uri.parse("package:$packageName")
                )
            )
            return
        }

        pendingUpdate = null
        pendingInstallerUri = null

        if (activeDownloadId != -1L) {
            handleDownloadCompletion(activeDownloadId)
            if (activeDownloadId != -1L) {
                startProgressPolling()
                Toast.makeText(this, "An app update is already downloading.", Toast.LENGTH_SHORT).show()
                return
            }
        }

        val request = DownloadManager.Request(Uri.parse(update.apkUrl))
            .setTitle("Plum Watch ${update.versionName}")
            .setDescription("Downloading app update")
            .setMimeType("application/vnd.android.package-archive")
            .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
            .setDestinationInExternalFilesDir(
                this,
                Environment.DIRECTORY_DOWNLOADS,
                "plum-watch-update.apk"
            )

        try {
            val manager = getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
            activeDownloadId = manager.enqueue(request)
            expectedApkSha256 = update.sha256

            updatePreferences.edit()
                .putLong(KEY_DOWNLOAD_ID, activeDownloadId)
                .putString(KEY_EXPECTED_SHA256, expectedApkSha256)
                .commit()

            updateDownloadState.value = AppUpdateDownloadState(isDownloading = true)
            startProgressPolling()
        } catch (exception: Exception) {
            clearActiveDownload()
            updateDownloadState.value = AppUpdateDownloadState(
                errorMessage = exception.message ?: "Could not start the update download."
            )
        }
    }

    private fun startProgressPolling() {
        if (activeDownloadId == -1L) return
        progressHandler.removeCallbacks(progressPoller)
        progressHandler.post(progressPoller)
    }

    private fun refreshDownloadProgress(downloadId: Long) {
        if (downloadId != activeDownloadId) return

        val manager = getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
        val cursor = manager.query(DownloadManager.Query().setFilterById(downloadId))

        var status = DownloadManager.STATUS_FAILED
        var downloadedBytes = 0L
        var totalBytes = -1L

        cursor?.use {
            if (it.moveToFirst()) {
                status = it.getInt(it.getColumnIndexOrThrow(DownloadManager.COLUMN_STATUS))
                if (status == DownloadManager.STATUS_PENDING ||
                    status == DownloadManager.STATUS_RUNNING ||
                    status == DownloadManager.STATUS_PAUSED
                ) {
                    downloadedBytes = it.getLong(
                        it.getColumnIndexOrThrow(DownloadManager.COLUMN_BYTES_DOWNLOADED_SO_FAR)
                    )
                    totalBytes = it.getLong(
                        it.getColumnIndexOrThrow(DownloadManager.COLUMN_TOTAL_SIZE_BYTES)
                    )
                }
            }
        }

        when (status) {
            DownloadManager.STATUS_PENDING,
            DownloadManager.STATUS_RUNNING,
            DownloadManager.STATUS_PAUSED -> {
                val progress = if (totalBytes > 0L) {
                    (downloadedBytes.toFloat() / totalBytes.toFloat()).coerceIn(0f, 1f)
                } else null
                updateDownloadState.value = AppUpdateDownloadState(
                    isDownloading = true,
                    progress = progress
                )
            }
            else -> handleDownloadCompletion(downloadId)
        }
    }

    override fun onResume() {
        super.onResume()

        if (updateDownloadState.value.isOpeningInstaller) {
            updateDownloadState.value = AppUpdateDownloadState()
        }

        val update = pendingUpdate
        if (update != null &&
            Build.VERSION.SDK_INT >= Build.VERSION_CODES.O &&
            packageManager.canRequestPackageInstalls()
        ) {
            pendingUpdate = null
            downloadAndInstallUpdate(update)
        }

        val installerUri = pendingInstallerUri
        if (installerUri != null) {
            pendingInstallerUri = null
            openPackageInstaller(installerUri)
        }

        if (activeDownloadId != -1L) {
            refreshDownloadProgress(activeDownloadId)
            if (activeDownloadId != -1L) startProgressPolling()
        }
    }

    override fun onPause() {
        progressHandler.removeCallbacks(progressPoller)
        super.onPause()
    }

    private fun handleDownloadCompletion(downloadId: Long) {
        if (downloadId == -1L || downloadId != activeDownloadId) return

        val manager = getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
        val cursor = manager.query(DownloadManager.Query().setFilterById(downloadId))
        val status = cursor?.use {
            if (it.moveToFirst()) {
                it.getInt(it.getColumnIndexOrThrow(DownloadManager.COLUMN_STATUS))
            } else {
                DownloadManager.STATUS_FAILED
            }
        } ?: DownloadManager.STATUS_FAILED

        when (status) {
            DownloadManager.STATUS_PENDING,
            DownloadManager.STATUS_RUNNING,
            DownloadManager.STATUS_PAUSED -> return

            DownloadManager.STATUS_SUCCESSFUL -> {
                val apkUri = manager.getUriForDownloadedFile(downloadId)
                if (apkUri == null || !verifyDownloadedApk(apkUri)) {
                    manager.remove(downloadId)
                    clearActiveDownload()
                    updateDownloadState.value = AppUpdateDownloadState(
                        errorMessage = "Downloaded APK failed its SHA-256 check."
                    )
                    Toast.makeText(
                        this,
                        "Downloaded APK failed its SHA-256 check.",
                        Toast.LENGTH_LONG
                    ).show()
                    return
                }

                updateDownloadState.value = AppUpdateDownloadState(
                    progress = 1f,
                    isOpeningInstaller = true
                )
                clearActiveDownload()

                if (lifecycle.currentState.isAtLeast(androidx.lifecycle.Lifecycle.State.RESUMED)) {
                    openPackageInstaller(apkUri)
                } else {
                    pendingInstallerUri = apkUri
                }
            }

            else -> {
                clearActiveDownload()
                updateDownloadState.value = AppUpdateDownloadState(
                    errorMessage = "APK download failed. Try installing the update again."
                )
                Toast.makeText(this, "APK download failed.", Toast.LENGTH_LONG).show()
            }
        }
    }

    private fun openPackageInstaller(apkUri: Uri) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O &&
            !packageManager.canRequestPackageInstalls()
        ) {
            updateDownloadState.value = AppUpdateDownloadState(
                errorMessage = "Allow Plum Watch to install apps, then try again."
            )
            Toast.makeText(
                this,
                "Allow Plum Watch to install apps, then open the downloaded APK from Downloads.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(
                Intent(
                    Settings.ACTION_MANAGE_UNKNOWN_APP_SOURCES,
                    Uri.parse("package:$packageName")
                )
            )
            return
        }

        val installIntent = Intent(Intent.ACTION_INSTALL_PACKAGE).apply {
            setDataAndType(apkUri, "application/vnd.android.package-archive")
            addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            putExtra(Intent.EXTRA_RETURN_RESULT, true)
        }

        try {
            startActivity(installIntent)
        } catch (exception: Exception) {
            try {
                val fallbackIntent = Intent(Intent.ACTION_VIEW).apply {
                    setDataAndType(apkUri, "application/vnd.android.package-archive")
                    addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
                    addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                }
                startActivity(fallbackIntent)
            } catch (fallbackException: Exception) {
                val message = fallbackException.message
                    ?: exception.message
                    ?: "Could not open the Android installer. Open the APK from Downloads."
                updateDownloadState.value = AppUpdateDownloadState(errorMessage = message)
                Toast.makeText(this, message, Toast.LENGTH_LONG).show()
            }
        }
    }

    private fun clearActiveDownload() {
        progressHandler.removeCallbacks(progressPoller)
        activeDownloadId = -1L
        expectedApkSha256 = null
        updatePreferences.edit()
            .remove(KEY_DOWNLOAD_ID)
            .remove(KEY_EXPECTED_SHA256)
            .commit()
    }

    private fun verifyDownloadedApk(uri: Uri): Boolean {
        val expected = expectedApkSha256 ?: return false
        val actual = contentResolver.openInputStream(uri)?.use { input ->
            val digest = MessageDigest.getInstance("SHA-256")
            val buffer = ByteArray(16 * 1024)
            while (true) {
                val count = input.read(buffer)
                if (count < 0) break
                digest.update(buffer, 0, count)
            }
            digest.digest().joinToString("") { byte -> "%02x".format(byte) }
        } ?: return false

        return actual.equals(expected, ignoreCase = true)
    }

    override fun onDestroy() {
        progressHandler.removeCallbacks(progressPoller)
        if (updateReceiverRegistered) {
            unregisterReceiver(updateDownloadReceiver)
        }
        watchManager.release()
        super.onDestroy()
    }

    private companion object {
        const val KEY_DOWNLOAD_ID = "active-update-download-id"
        const val KEY_EXPECTED_SHA256 = "active-update-sha256"
        const val KEY_NOTIFIED_UPDATE_VERSION = "last-notified-update-version"
        const val PREF_COMPANION = "plum-watch-companion"
        const val KEY_COMPANION_ASSOCIATION_ID = "association-id"
        const val KEY_COMPANION_ADDRESS = "device-address"
        const val KEY_COMPANION_NAME = "device-name"
        const val UPDATE_CHANNEL_ID = "plum-watch-app-updates"
        const val UPDATE_NOTIFICATION_ID = 2601
        const val PROGRESS_POLL_INTERVAL_MS = 500L
    }
}
