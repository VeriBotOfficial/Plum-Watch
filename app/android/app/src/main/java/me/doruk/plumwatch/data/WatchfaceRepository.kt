package me.doruk.plumwatch.data

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.json.JSONObject
import java.net.HttpURLConnection
import java.net.URL
import java.net.URLEncoder
import java.nio.charset.StandardCharsets

data class Watchface(
    val id: String,
    val name: String,
    val previewUrl: String,
    val archiveUrl: String
)

sealed interface WatchfaceLibraryResult {
    data class Available(val watchfaces: List<Watchface>) : WatchfaceLibraryResult
    data object PrivateOrUnavailable : WatchfaceLibraryResult
    data class Failed(val message: String) : WatchfaceLibraryResult
}

private data class WatchfaceFiles(
    var archivePath: String? = null,
    var previewPath: String? = null
)

object WatchfaceRepository {
    private const val TREE_URL =
        "https://api.github.com/repos/VeriBotOfficial/Plum-Watch/git/trees/main?recursive=1"
    private const val RAW_BASE =
        "https://raw.githubusercontent.com/VeriBotOfficial/Plum-Watch/main/"

    suspend fun load(): WatchfaceLibraryResult = withContext(Dispatchers.IO) {
        var connection: HttpURLConnection? = null

        try {
            connection = (URL(TREE_URL).openConnection() as HttpURLConnection).apply {
                requestMethod = "GET"
                connectTimeout = 12_000
                readTimeout = 15_000
                setRequestProperty("Accept", "application/vnd.github+json")
                setRequestProperty("X-GitHub-Api-Version", "2026-03-10")
                setRequestProperty("User-Agent", "Plum-Watch-Android")
            }

            when (connection.responseCode) {
                HttpURLConnection.HTTP_NOT_FOUND,
                HttpURLConnection.HTTP_UNAUTHORIZED -> {
                    return@withContext WatchfaceLibraryResult.PrivateOrUnavailable
                }

                HttpURLConnection.HTTP_FORBIDDEN -> {
                    val body = connection.errorStream?.bufferedReader()?.use { it.readText() }.orEmpty()
                    val message = if (body.contains("rate limit", ignoreCase = true)) {
                        "GitHub's public API rate limit has been reached. Try again later."
                    } else {
                        "GitHub refused the request. Try again later."
                    }
                    return@withContext WatchfaceLibraryResult.Failed(message)
                }

                in 200..299 -> Unit

                else -> {
                    return@withContext WatchfaceLibraryResult.Failed(
                        "GitHub returned HTTP ${connection.responseCode}."
                    )
                }
            }

            val response = connection.inputStream.bufferedReader().use { it.readText() }
            val tree = JSONObject(response).optJSONArray("tree")
                ?: return@withContext WatchfaceLibraryResult.Failed(
                    "The repository did not return a valid file list."
                )

            val grouped = linkedMapOf<String, WatchfaceFiles>()

            for (index in 0 until tree.length()) {
                val entry = tree.optJSONObject(index) ?: continue
                if (entry.optString("type") != "blob") continue

                val path = entry.optString("path")
                if (!path.startsWith("watchfaces/")) continue

                val relative = path.removePrefix("watchfaces/")
                val slash = relative.indexOf('/')
                if (slash <= 0) continue

                val folder = relative.substring(0, slash)
                val fileName = relative.substring(slash + 1)
                if (fileName.isBlank() || fileName.startsWith(".")) continue

                val files = grouped.getOrPut(folder) { WatchfaceFiles() }
                val lowerName = fileName.lowercase()

                if (lowerName.endsWith(".zip")) {
                    if (files.archivePath == null || lowerName == "${folder.lowercase()}.zip") {
                        files.archivePath = path
                    }
                } else if (
                    lowerName.endsWith(".png") ||
                    lowerName.endsWith(".jpg") ||
                    lowerName.endsWith(".jpeg") ||
                    lowerName.endsWith(".webp")
                ) {
                    val isPreferredPreview = lowerName.startsWith("preview") ||
                        lowerName.startsWith("cover") ||
                        lowerName.startsWith("thumbnail")
                    if (files.previewPath == null || isPreferredPreview) {
                        files.previewPath = path
                    }
                }
            }

            val watchfaces = grouped.mapNotNull { (id, files) ->
                val archive = files.archivePath ?: return@mapNotNull null
                val preview = files.previewPath ?: return@mapNotNull null

                Watchface(
                    id = id,
                    name = id
                        .replace('-', ' ')
                        .replace('_', ' ')
                        .split(' ')
                        .filter { it.isNotBlank() }
                        .joinToString(" ") { word ->
                            word.replaceFirstChar { it.uppercase() }
                        },
                    previewUrl = RAW_BASE + encodePath(preview),
                    archiveUrl = RAW_BASE + encodePath(archive)
                )
            }.sortedBy { it.name.lowercase() }

            WatchfaceLibraryResult.Available(watchfaces)
        } catch (exception: Exception) {
            WatchfaceLibraryResult.Failed(
                exception.message?.takeIf { it.isNotBlank() }
                    ?: "Could not reach the watchface library."
            )
        } finally {
            connection?.disconnect()
        }
    }

    private fun encodePath(path: String): String = path
        .split('/')
        .joinToString("/") { segment ->
            URLEncoder.encode(segment, StandardCharsets.UTF_8.name()).replace("+", "%20")
        }
}
