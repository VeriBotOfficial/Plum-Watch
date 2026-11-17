package me.doruk.plumwatch.data

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext
import org.json.JSONObject
import java.net.HttpURLConnection
import java.net.URL

data class AppUpdateInfo(
    val versionCode: Int,
    val versionName: String,
    val apkUrl: String,
    val sha256: String
)

data class AppUpdateDownloadState(
    val isDownloading: Boolean = false,
    val progress: Float? = null,
    val isOpeningInstaller: Boolean = false,
    val errorMessage: String? = null
)

sealed interface AppUpdateCheckResult {
    data class UpToDate(val versionName: String) : AppUpdateCheckResult
    data class UpdateAvailable(val update: AppUpdateInfo) : AppUpdateCheckResult
    data class Failed(val message: String) : AppUpdateCheckResult
}

object AppUpdateRepository {
    private const val RAW_MANIFEST_URL =
        "https://raw.githubusercontent.com/VeriBotOfficial/Plum-Watch/main/app/android/build/update.json"
    private const val API_MANIFEST_URL =
        "https://api.github.com/repos/VeriBotOfficial/Plum-Watch/contents/app/android/build/update.json"

    suspend fun check(currentVersionName: String, currentVersionCode: Int): AppUpdateCheckResult = withContext(Dispatchers.IO) {
        val manifests = mutableListOf<AppUpdateInfo>()
        var lastError: String? = null

        // GitHub's raw CDN can briefly lag behind a newly published manifest.
        // Read several cache-busted copies and also query the GitHub Contents API.
        repeat(3) { attempt ->
            val raw = fetchManifest(RAW_MANIFEST_URL, "raw")
            if (raw != null) manifests += raw else lastError = "Could not read the published update manifest."

            val api = fetchManifest(API_MANIFEST_URL, "api")
            if (api != null) manifests += api else lastError = "GitHub's update service is temporarily unavailable."

            if (manifests.any { it.versionCode > currentVersionCode || isNewerVersion(it.versionName, currentVersionName) }) {
                val newest = manifests.maxBy { it.versionCode }
                return@withContext AppUpdateCheckResult.UpdateAvailable(newest)
            }
            if (attempt < 2) delay(900L)
        }

        val newest = manifests.maxByOrNull { it.versionCode }
        if (newest != null) {
            AppUpdateCheckResult.UpToDate(newest.versionName)
        } else {
            AppUpdateCheckResult.Failed(lastError ?: "Could not reach GitHub.")
        }
    }

    private fun fetchManifest(baseUrl: String, source: String): AppUpdateInfo? {
        val connection = runCatching {
            (URL("$baseUrl?nocache=${System.currentTimeMillis()}-${source}").openConnection() as HttpURLConnection)
                .apply {
                    connectTimeout = 8_000
                    readTimeout = 10_000
                    requestMethod = "GET"
                    useCaches = false
                    setRequestProperty("Cache-Control", "no-cache, no-store, max-age=0")
                    setRequestProperty("Pragma", "no-cache")
                    setRequestProperty("Accept", if (source == "api") "application/vnd.github.raw" else "application/json")
                    setRequestProperty("User-Agent", "Plum-Watch-Android")
                }
        }.getOrNull() ?: return null

        return try {
            if (connection.responseCode !in 200..299) return null
            val json = connection.inputStream.bufferedReader().use { it.readText() }
            val manifest = JSONObject(json)
            val versionCode = manifest.getInt("versionCode")
            val versionName = manifest.getString("versionName")
            val apkUrl = manifest.getString("apkUrl")
            val sha256 = manifest.getString("sha256").lowercase()

            if (!apkUrl.startsWith("https://raw.githubusercontent.com/VeriBotOfficial/Plum-Watch/") ||
                !sha256.matches(Regex("[a-f0-9]{64}")) ||
                versionCode < 1 || versionName.isBlank()
            ) return null

            AppUpdateInfo(versionCode, versionName, apkUrl, sha256)
        } catch (_: Exception) {
            null
        } finally {
            connection.disconnect()
        }
    }

    private fun isNewerVersion(remote: String, installed: String): Boolean {
        fun parts(value: String): List<Int>? {
            val match = Regex("^(\\d+)\\.(\\d+)\\.(\\d+)$").matchEntire(value) ?: return null
            return match.groupValues.drop(1).map { it.toIntOrNull() ?: return null }
        }
        val remoteParts = parts(remote)
        val installedParts = parts(installed)
        if (remoteParts == null || installedParts == null) return false
        for (index in 0..2) {
            if (remoteParts[index] != installedParts[index]) return remoteParts[index] > installedParts[index]
        }
        return false
    }
}
