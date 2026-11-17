package me.doruk.plumwatch.data

import kotlinx.coroutines.Dispatchers
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

sealed interface AppUpdateCheckResult {
    data class UpToDate(val versionName: String) : AppUpdateCheckResult
    data class UpdateAvailable(val update: AppUpdateInfo) : AppUpdateCheckResult
    data class Failed(val message: String) : AppUpdateCheckResult
}

object AppUpdateRepository {
    private const val MANIFEST_URL =
        "https://raw.githubusercontent.com/VeriBotOfficial/Plum-Watch/main/app/android/build/update.json"

    suspend fun check(currentVersionCode: Int): AppUpdateCheckResult = withContext(Dispatchers.IO) {
        val connection = URL(MANIFEST_URL).openConnection() as HttpURLConnection
        connection.connectTimeout = 10_000
        connection.readTimeout = 15_000
        connection.requestMethod = "GET"
        connection.setRequestProperty("Cache-Control", "no-cache")

        try {
            val status = connection.responseCode
            if (status == HttpURLConnection.HTTP_NOT_FOUND) {
                return@withContext AppUpdateCheckResult.Failed(
                    "The update manifest is not publicly accessible. The GitHub repository is private."
                )
            }
            if (status !in 200..299) {
                return@withContext AppUpdateCheckResult.Failed(
                    "GitHub returned HTTP $status while checking for updates."
                )
            }

            val json = connection.inputStream.bufferedReader().use { it.readText() }
            val manifest = JSONObject(json)
            val versionCode = manifest.getInt("versionCode")
            val versionName = manifest.getString("versionName")
            val apkUrl = manifest.getString("apkUrl")
            val sha256 = manifest.getString("sha256").lowercase()

            if (!apkUrl.startsWith("https://raw.githubusercontent.com/VeriBotOfficial/Plum-Watch/") ||
                !sha256.matches(Regex("[a-f0-9]{64}")) ||
                versionCode < 1
            ) {
                return@withContext AppUpdateCheckResult.Failed("The update manifest is invalid.")
            }

            if (versionCode > currentVersionCode) {
                AppUpdateCheckResult.UpdateAvailable(
                    AppUpdateInfo(versionCode, versionName, apkUrl, sha256)
                )
            } else {
                AppUpdateCheckResult.UpToDate(versionName)
            }
        } catch (exception: Exception) {
            AppUpdateCheckResult.Failed(
                exception.message?.takeIf { it.isNotBlank() } ?: "Could not reach GitHub."
            )
        } finally {
            connection.disconnect()
        }
    }
}
