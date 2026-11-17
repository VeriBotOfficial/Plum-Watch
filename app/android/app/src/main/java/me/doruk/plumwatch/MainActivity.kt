package me.doruk.plumwatch

import android.app.DownloadManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.Environment
import android.provider.Settings
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.core.view.WindowCompat
import me.doruk.plumwatch.data.AppUpdateInfo
import me.doruk.plumwatch.ui.PlumWatchApp
import me.doruk.plumwatch.watch.BleWatchManager
import java.security.MessageDigest

class MainActivity : ComponentActivity() {
    private lateinit var watchManager: BleWatchManager
    private var pendingUpdate: AppUpdateInfo? = null
    private var activeDownloadId: Long = -1L
    private var expectedApkSha256: String? = null
    private var updateReceiverRegistered = false

    private val updateDownloadReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
            if (intent.action != DownloadManager.ACTION_DOWNLOAD_COMPLETE) return
            val completedId = intent.getLongExtra(DownloadManager.EXTRA_DOWNLOAD_ID, -1L)
            if (completedId != activeDownloadId) return

            val manager = getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
            val query = DownloadManager.Query().setFilterById(completedId)
            val cursor = manager.query(query)
            val status = try {
                if (cursor.moveToFirst()) {
                    cursor.getInt(cursor.getColumnIndexOrThrow(DownloadManager.COLUMN_STATUS))
                } else {
                    DownloadManager.STATUS_FAILED
                }
            } finally {
                cursor.close()
            }

            if (status != DownloadManager.STATUS_SUCCESSFUL) {
                Toast.makeText(this@MainActivity, "APK download failed.", Toast.LENGTH_LONG).show()
                return
            }

            val apkUri = manager.getUriForDownloadedFile(completedId)
            if (apkUri == null || !verifyDownloadedApk(apkUri)) {
                manager.remove(completedId)
                Toast.makeText(this@MainActivity, "Downloaded APK failed its SHA-256 check.", Toast.LENGTH_LONG).show()
                return
            }

            try {
                val installIntent = Intent(Intent.ACTION_VIEW).apply {
                    setDataAndType(apkUri, "application/vnd.android.package-archive")
                    addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
                    addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                }
                startActivity(installIntent)
            } catch (exception: Exception) {
                Toast.makeText(
                    this@MainActivity,
                    exception.message ?: "Could not open the Android installer.",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)

        watchManager = BleWatchManager(applicationContext)
        registerUpdateReceiver()

        val preferences = getSharedPreferences("plum-watch-preferences", MODE_PRIVATE)

        setContent {
            var themeMode by rememberSaveable {
                mutableStateOf(preferences.getString("theme-mode", "system") ?: "system")
            }
            var uiStyle by rememberSaveable {
                mutableStateOf(preferences.getString("ui-style", "glass") ?: "glass")
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
                onInstallUpdate = ::downloadAndInstallUpdate
            )
        }
    }

    private fun registerUpdateReceiver() {
        val filter = IntentFilter(DownloadManager.ACTION_DOWNLOAD_COMPLETE)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            registerReceiver(updateDownloadReceiver, filter, Context.RECEIVER_NOT_EXPORTED)
        } else {
            @Suppress("DEPRECATION")
            registerReceiver(updateDownloadReceiver, filter)
        }
        updateReceiverRegistered = true
    }

    private fun downloadAndInstallUpdate(update: AppUpdateInfo) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O && !packageManager.canRequestPackageInstalls()) {
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

        activeDownloadId = (getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager)
            .enqueue(request)
        expectedApkSha256 = update.sha256
        Toast.makeText(this, "Downloading Plum Watch ${update.versionName}…", Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        val update = pendingUpdate
        if (update != null &&
            Build.VERSION.SDK_INT >= Build.VERSION_CODES.O &&
            packageManager.canRequestPackageInstalls()
        ) {
            downloadAndInstallUpdate(update)
        }
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
        if (updateReceiverRegistered) {
            unregisterReceiver(updateDownloadReceiver)
        }
        watchManager.release()
        super.onDestroy()
    }
}
