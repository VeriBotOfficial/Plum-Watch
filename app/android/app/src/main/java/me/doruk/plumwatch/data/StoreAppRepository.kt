package me.doruk.plumwatch.data

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.json.JSONArray
import org.json.JSONObject
import java.net.HttpURLConnection
import java.net.URL

data class StoreApp(
    val id: String,
    val name: String,
    val description: String,
    val category: String,
    val version: String,
    val author: String?,
    val archiveUrl: String?,
    val archiveParts: List<String>,
    val archiveSizeBytes: Long?,
    val previewUrl: String?,
    val iconUrl: String?,
    val packageType: String,
    val otaType: Int,
    val compatibility: String?
)

sealed interface StoreAppLibraryResult {
    data class Available(val apps: List<StoreApp>) : StoreAppLibraryResult
    data object Unavailable : StoreAppLibraryResult
    data class Failed(val message: String) : StoreAppLibraryResult
}

object StoreAppRepository {
    private const val MANIFEST_URL =
        "https://raw.githubusercontent.com/VeriBotOfficial/Plum-Watch/main/store/index.json"

    suspend fun load(): StoreAppLibraryResult = withContext(Dispatchers.IO) {
        var connection: HttpURLConnection? = null
        try {
            connection = (URL("$MANIFEST_URL?refresh=${System.currentTimeMillis()}").openConnection() as HttpURLConnection).apply {
                requestMethod = "GET"
                connectTimeout = 12_000
                readTimeout = 15_000
                useCaches = false
                setRequestProperty("Accept", "application/json")
                setRequestProperty("User-Agent", "Plum-Watch-Android")
                setRequestProperty("Cache-Control", "no-cache")
            }
            when (connection.responseCode) {
                HttpURLConnection.HTTP_NOT_FOUND,
                HttpURLConnection.HTTP_UNAUTHORIZED -> return@withContext StoreAppLibraryResult.Unavailable
                in 200..299 -> Unit
                else -> return@withContext StoreAppLibraryResult.Failed(
                    "Store catalogue unavailable (HTTP ${connection.responseCode})."
                )
            }

            val manifest = JSONObject(connection.inputStream.bufferedReader().use { it.readText() })
            val revision = manifest.optString("generatedAt").filter { it.isLetterOrDigit() }
            val entries = manifest.optJSONArray("apps") ?: JSONArray()
            val apps = buildList {
                for (index in 0 until entries.length()) {
                    val item = entries.optJSONObject(index) ?: continue
                    val id = item.optString("id").takeIf { it.isNotBlank() } ?: continue
                    val name = item.optString("name").takeIf { it.isNotBlank() } ?: id
                    val archive = item.optString("archiveUrl").takeIf { it.startsWith("https://") }
                    val partsJson = item.optJSONArray("archiveParts") ?: JSONArray()
                    val parts = buildList {
                        for (partIndex in 0 until partsJson.length()) {
                            partsJson.optString(partIndex).takeIf { it.startsWith("https://") }?.let(::add)
                        }
                    }
                    if (archive == null && parts.isEmpty()) continue
                    fun versioned(key: String): String? =
                        item.optString(key).takeIf { it.startsWith("https://") }?.let {
                            if (revision.isBlank()) it else "$it?v=$revision"
                        }
                    add(
                        StoreApp(
                            id = id,
                            name = name,
                            description = item.optString("description"),
                            category = item.optString("category", "Apps"),
                            version = item.optString("version"),
                            author = item.optString("author").takeIf { it.isNotBlank() },
                            archiveUrl = archive,
                            archiveParts = parts,
                            archiveSizeBytes = item.optLong("archiveSizeBytes", -1L).takeIf { it > 0L },
                            previewUrl = versioned("previewUrl"),
                            iconUrl = versioned("iconUrl"),
                            packageType = item.optString("packageType", "unknown"),
                            otaType = item.optInt("otaType", -1),
                            compatibility = item.optString("compatibility").takeIf { it.isNotBlank() }
                        )
                    )
                }
            }.sortedWith(compareBy<StoreApp> { it.category.lowercase() }.thenBy { it.name.lowercase() })
            StoreAppLibraryResult.Available(apps)
        } catch (exception: Exception) {
            StoreAppLibraryResult.Failed(
                exception.message?.takeIf { it.isNotBlank() } ?: "Could not reach the Store."
            )
        } finally {
            connection?.disconnect()
        }
    }
}
