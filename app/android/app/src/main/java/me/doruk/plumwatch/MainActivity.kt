package me.doruk.plumwatch

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
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
            val initialTheme = preferences.getString("theme-mode", "system") ?: "system"
            androidx.compose.runtime.rememberSaveable { androidx.compose.runtime.mutableStateOf(initialTheme) }
                .also { themeState ->
                    PlumWatchApp(
                        watchManager = watchManager,
                        themeMode = themeState.value,
                        onThemeModeChange = { mode ->
                            themeState.value = mode
                            preferences.edit().putString("theme-mode", mode).apply()
                        }
                    )
                }
        }
    }

    override fun onDestroy() {
        watchManager.release()
        super.onDestroy()
    }
}
