package me.doruk.plumwatch.data

import android.util.Base64
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
    val isDownloaded: Boolean = false,
    val errorMessage: String? = null
)

sealed interface AppUpdateCheckResult {
    data class UpToDate(val versionName: String) : AppUpdateCheckResult
    data class UpdateAvailable(val update: AppUpdateInfo) : AppUpdateCheckResult
    data class Failed(val message: String) : AppUpdateCheckResult
}

object AppUpdateRepository {
    private const val MANIFEST_API_URL =
        "https://api.github.com/repos/VeriBotOfficial/Plum-Watch/contents/app/android/build/update.json?ref=main"

    suspend fun check(currentVersionName: String, currentVersionCode: Int): AppUpdateCheckResult =
        withContext(Dispatchers.IO) {
            var lastError = "Could not reach the update server."

            repeat(3) { attempt ->
                val manifest = fetchManifest()
                if (manifest != null) {
                    if (
                        manifest.versionCode > currentVersionCode ||
                        isNewerVersion(manifest.versionName, currentVersionName)
                    ) {
                        return@withContext AppUpdateCheckResult.UpdateAvailable(manifest)
                    }
                    return@withContext AppUpdateCheckResult.UpToDate(manifest.versionName)
                }

                lastError = "GitHub's update manifest is temporarily unavailable."
                if (attempt < 2) delay(900L)
            }

            AppUpdateCheckResult.Failed(lastError)
        }

    private fun fetchManifest(): AppUpdateInfo? {
        val connection = runCatching {
            (URL("$MANIFEST_API_URL&nocache=${System.currentTimeMillis()}").openConnection() as HttpURLConnection)
                .apply {
                    connectTimeout = 8_000
                    readTimeout = 10_000
                    requestMethod = "GET"
                    useCaches = false
                    setRequestProperty("Cache-Control", "no-cache, no-store, max-age=0")
                    setRequestProperty("Pragma", "no-cache")
                    setRequestProperty("Accept", "application/vnd.github+json")
                    setRequestProperty("X-GitHub-Api-Version", "2022-11-28")
                    setRequestProperty("User-Agent", "Plum-Watch-Android")
                }
        }.getOrNull() ?: return null

        return try {
            if (connection.responseCode !in 200..299) return null

            val response = JSONObject(connection.inputStream.bufferedReader().use { it.readText() })
            if (response.optString("encoding") != "base64") return null

            val encodedContent = response.getString("content")
            val manifestText = String(Base64.decode(encodedContent, Base64.DEFAULT), Charsets.UTF_8)
            val manifest = JSONObject(manifestText)

            val versionCode = manifest.getInt("versionCode")
            val versionName = manifest.getString("versionName")
            val apkUrl = manifest.getString("apkUrl")
            val sha256 = manifest.getString("sha256").lowercase()

            if (
                !apkUrl.startsWith("https://raw.githubusercontent.com/VeriBotOfficial/Plum-Watch/") ||
                !sha256.matches(Regex("[a-f0-9]{64}")) ||
                versionCode < 1 ||
                versionName.isBlank()
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
