package me.doruk.plumwatch

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.core.view.WindowCompat
import me.doruk.plumwatch.ui.PlumWatchApp
import me.doruk.plumwatch.watch.BleWatchManager

class MainActivity : ComponentActivity() {
    private lateinit var watchManager: BleWatchManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)

        watchManager = BleWatchManager(applicationContext)
        val preferences = getSharedPreferences("plum-watch-preferences", MODE_PRIVATE)

        setContent {
            var themeMode by rememberSaveable {
                mutableStateOf(preferences.getString("theme-mode", "system") ?: "system")
            }

            PlumWatchApp(
                watchManager = watchManager,
                themeMode = themeMode,
                onThemeModeChange = { mode ->
                    themeMode = mode
                    preferences.edit().putString("theme-mode", mode).apply()
                }
            )
        }
    }

    override fun onDestroy() {
        watchManager.release()
        super.onDestroy()
    }
}
