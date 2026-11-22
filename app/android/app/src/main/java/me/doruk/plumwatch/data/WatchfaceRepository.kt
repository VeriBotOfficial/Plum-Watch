package me.doruk.plumwatch.data

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.json.JSONArray
import org.json.JSONObject
import java.net.HttpURLConnection
import java.net.URL

data class Watchface(
    val id: String,
    val name: String,
    val previewUrl: String?,
    val archiveUrl: String,
    val archiveSizeBytes: Long? = null,
    val animatedPreviewUrl: String? = null
)

sealed interface WatchfaceLibraryResult {
    data class Available(val watchfaces: List<Watchface>) : WatchfaceLibraryResult
    data object PrivateOrUnavailable : WatchfaceLibraryResult
    data class Failed(val message: String) : WatchfaceLibraryResult
}

object WatchfaceRepository {
    private const val MANIFEST_URL =
        "https://raw.githubusercontent.com/VeriBotOfficial/Plum-Watch/main/store/index.json"

    suspend fun load(): WatchfaceLibraryResult = withContext(Dispatchers.IO) {
        var connection: HttpURLConnection? = null
        try {
            connection = (URL(MANIFEST_URL).openConnection() as HttpURLConnection).apply {
                requestMethod = "GET"
                connectTimeout = 12_000
                readTimeout = 15_000
                setRequestProperty("Accept", "application/json")
                setRequestProperty("User-Agent", "Plum-Watch-Android")
                setRequestProperty("Cache-Control", "no-cache")
            }
            when (connection.responseCode) {
                HttpURLConnection.HTTP_NOT_FOUND,
                HttpURLConnection.HTTP_UNAUTHORIZED -> return@withContext WatchfaceLibraryResult.PrivateOrUnavailable
                in 200..299 -> Unit
                else -> return@withContext WatchfaceLibraryResult.Failed(
                    "Store catalogue unavailable (HTTP ${connection.responseCode})."
                )
            }

            val response = connection.inputStream.bufferedReader().use { it.readText() }
            val manifest = if (response.trimStart().startsWith("{")) JSONObject(response) else null
            val previewRevision = manifest?.optString("generatedAt")
                ?.filter { it.isLetterOrDigit() }
                ?.takeIf { it.isNotBlank() }
            val entries = if (manifest != null) {
                manifest.optJSONArray("watchfaces") ?: JSONArray()
            } else {
                JSONArray(response)
            }
            val watchfaces = buildList {
                for (index in 0 until entries.length()) {
                    val item = entries.optJSONObject(index) ?: continue
                    val id = item.optString("id").takeIf { it.isNotBlank() } ?: continue
                    val name = item.optString("name").takeIf { it.isNotBlank() } ?: id
                    fun versionedPreviewUrl(key: String): String? =
                        item.optString(key).takeIf { it.startsWith("https://") }?.let { source ->
                            previewRevision?.let { "$source?v=$it" } ?: source
                        }
                    val preview = versionedPreviewUrl("previewUrl")
                    val animatedPreview = versionedPreviewUrl("animatedPreviewUrl")
                    val archive = item.optString("archiveUrl").takeIf { it.startsWith("https://") } ?: continue
                    val archiveSizeBytes = item.optLong("archiveSizeBytes", -1L).takeIf { it > 0L }
                    add(
                        Watchface(
                            id = id,
                            name = name,
                            previewUrl = preview,
                            archiveUrl = archive,
                            archiveSizeBytes = archiveSizeBytes,
                            animatedPreviewUrl = animatedPreview
                        )
                    )
                }
            }.sortedBy { it.name.lowercase() }
            WatchfaceLibraryResult.Available(watchfaces)
        } catch (exception: Exception) {
            WatchfaceLibraryResult.Failed(
                exception.message?.takeIf { it.isNotBlank() } ?: "Could not reach the Store."
            )
        } finally {
            connection?.disconnect()
        }
    }
}
