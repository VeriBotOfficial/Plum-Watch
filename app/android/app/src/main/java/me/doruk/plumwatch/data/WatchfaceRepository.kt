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
    val description: String? = null,
    val author: String? = null,
    val version: String? = null
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
            val entries = if (response.trimStart().startsWith("[")) {
                JSONArray(response)
            } else {
                JSONObject(response).optJSONArray("watchfaces") ?: JSONArray()
            }
            val watchfaces = buildList {
                for (index in 0 until entries.length()) {
                    val item = entries.optJSONObject(index) ?: continue
                    val id = item.optString("id").takeIf { it.isNotBlank() } ?: continue
                    val name = item.optString("name").takeIf { it.isNotBlank() } ?: id
                    val preview = item.optString("previewUrl").takeIf { it.startsWith("https://") }
                    val archive = item.optString("archiveUrl").takeIf { it.startsWith("https://") } ?: continue
                    val archiveSizeBytes = item.optLong("archiveSizeBytes", -1L).takeIf { it > 0L }
                    add(
                        Watchface(
                            id = id,
                            name = name,
                            previewUrl = preview,
                            archiveUrl = archive,
                            archiveSizeBytes = archiveSizeBytes,
                            description = item.optString("description").takeIf { it.isNotBlank() },
                            author = item.optString("author").takeIf { it.isNotBlank() },
                            version = item.optString("version").takeIf { it.isNotBlank() }
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
