package me.doruk.plumwatch.ui

import android.app.DownloadManager
import android.database.Cursor
import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import android.os.Environment
import androidx.activity.compose.BackHandler
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material.icons.outlined.Check
import androidx.compose.material.icons.outlined.Download
import androidx.compose.material.icons.outlined.Image
import androidx.compose.material.icons.outlined.Refresh
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.produceState
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import me.doruk.plumwatch.data.Watchface
import me.doruk.plumwatch.data.WatchfaceLibraryResult
import me.doruk.plumwatch.data.WatchfaceRepository
import java.net.HttpURLConnection
import java.net.URL

private const val WATCHFACE_ASPECT_RATIO = 0.82f

private data class WatchfaceDownloadState(
    val id: Long? = null,
    val progress: Float = 0f,
    val totalBytes: Long = -1L,
    val downloadedBytes: Long = 0L,
    val complete: Boolean = false,
    val failed: Boolean = false
) {
    val active: Boolean get() = id != null && !complete && !failed
}

@Composable
fun WatchfacesScreen() {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    var result by remember { mutableStateOf<WatchfaceLibraryResult?>(null) }
    var loading by remember { mutableStateOf(false) }
    var selectedWatchface by remember { mutableStateOf<Watchface?>(null) }

    suspend fun refreshLibrary() {
        loading = true
        result = WatchfaceRepository.load()
        loading = false
    }

    LaunchedEffect(Unit) {
        refreshLibrary()
    }

    BackHandler(enabled = selectedWatchface != null) {
        selectedWatchface = null
    }

    AnimatedContent(
        targetState = selectedWatchface,
        modifier = Modifier.fillMaxSize(),
        transitionSpec = {
            val openingPreview = targetState != null
            val direction = if (openingPreview) 1 else -1
            (fadeIn(tween(260)) + slideInHorizontally(
                animationSpec = tween(360, easing = FastOutSlowInEasing),
                initialOffsetX = { width -> direction * width / 16 }
            )) togetherWith
                (fadeOut(tween(190)) + slideOutHorizontally(
                    animationSpec = tween(280, easing = FastOutSlowInEasing),
                    targetOffsetX = { width -> -direction * width / 22 }
                ))
        },
        label = "watchface-gallery-navigation"
    ) { selected ->
        if (selected == null) {
            WatchfaceGalleryList(
                result = result,
                loading = loading,
                onRefresh = { scope.launch { refreshLibrary() } },
                onSelect = { selectedWatchface = it }
            )
        } else {
            WatchfaceDetailScreen(
                watchface = selected,
                onBack = { selectedWatchface = null }
            )
        }
    }
}

@Composable
private fun WatchfaceGalleryList(
    result: WatchfaceLibraryResult?,
    loading: Boolean,
    onRefresh: () -> Unit,
    onSelect: (Watchface) -> Unit
) {
    LazyColumn(
        modifier = Modifier.fillMaxSize().statusBarsPadding(),
        contentPadding = PaddingValues(top = 22.dp, bottom = 126.dp),
        verticalArrangement = Arrangement.spacedBy(18.dp)
    ) {
        item {
            Row(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 22.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                PageTitle("Face Gallery")
                Spacer(Modifier.weight(1f))
                TextButton(onClick = onRefresh, enabled = !loading) {
                    if (loading) {
                        PlumProgressLabel("Refreshing", Modifier.padding(vertical = 4.dp))
                    } else {
                        Icon(Icons.Outlined.Refresh, contentDescription = null)
                        Text("Refresh", Modifier.padding(start = 5.dp))
                    }
                }
            }
        }
        when {
            loading && result == null -> item {
                Box(Modifier.fillMaxWidth().height(220.dp), contentAlignment = Alignment.Center) {
                    PlumProgressLabel("Loading watchfaces")
                }
            }
            result is WatchfaceLibraryResult.PrivateOrUnavailable -> item {
                WatchfaceInfoState("Repository is private", action = "Refresh", onAction = onRefresh)
            }
            result is WatchfaceLibraryResult.Failed -> item {
                WatchfaceInfoState("Couldn't load watchfaces", detail = result.message, action = "Retry", onAction = onRefresh)
            }
            result is WatchfaceLibraryResult.Available -> {
                val faces = result.watchfaces
                if (faces.isEmpty()) item { WatchfaceInfoState("No watchfaces yet") }
                else item {
                    LazyRow(
                        contentPadding = PaddingValues(horizontal = 22.dp),
                        horizontalArrangement = Arrangement.spacedBy(16.dp)
                    ) {
                        items(faces, key = { it.id }) { face ->
                            Column(
                                modifier = Modifier.width(156.dp),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.spacedBy(10.dp)
                            ) {
                                AppClickableSurface(
                                    onClick = { onSelect(face) },
                                    modifier = Modifier.fillMaxWidth(),
                                    shape = RoundedCornerShape(30.dp)
                                ) {
                                    Box(
                                        Modifier.padding(5.dp)
                                            .border(3.dp, MaterialTheme.colorScheme.outline.copy(alpha = 0.5f), RoundedCornerShape(24.dp))
                                            .clip(RoundedCornerShape(21.dp))
                                            .background(Color(0xFF050607))
                                    ) {
                                        WatchfaceArtwork(face.previewUrl, Modifier.fillMaxWidth())
                                    }
                                }
                                Text(
                                    face.name,
                                    color = MaterialTheme.colorScheme.onSurface,
                                    fontSize = 15.sp,
                                    fontWeight = FontWeight.Medium,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun WatchfaceDetailScreen(
    watchface: Watchface,
    onBack: () -> Unit
) {
    val context = LocalContext.current
    var download by remember(watchface.id) { mutableStateOf(WatchfaceDownloadState()) }
    var startError by remember(watchface.id) { mutableStateOf<String?>(null) }

    LaunchedEffect(download.id) {
        val id = download.id ?: return@LaunchedEffect
        val manager = context.getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
        while (true) {
            val state = queryWatchfaceDownload(manager, id)
            if (state == null) {
                download = download.copy(failed = true)
                break
            }
            download = state
            if (state.complete || state.failed) break
            delay(180)
        }
    }

    val animatedProgress by animateFloatAsState(
        targetValue = download.progress.coerceIn(0f, 1f),
        animationSpec = tween(420, easing = FastOutSlowInEasing),
        label = "watchface-download-progress"
    )

    Column(
        modifier = Modifier.fillMaxSize().statusBarsPadding()
            .padding(horizontal = 22.dp).padding(top = 14.dp, bottom = 126.dp),
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            AppClickableSurface(onClick = onBack, modifier = Modifier.size(42.dp), shape = CircleShape) {
                Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Icon(Icons.Outlined.ArrowBack, contentDescription = "Back", tint = MaterialTheme.colorScheme.onSurface)
                }
            }
            Text("Face Gallery", Modifier.padding(start = 13.dp), color = MaterialTheme.colorScheme.onSurfaceVariant, fontSize = 14.sp)
        }

        Box(Modifier.fillMaxWidth().weight(1f), contentAlignment = Alignment.Center) {
            WatchfaceArtwork(
                watchface.previewUrl,
                Modifier.fillMaxWidth(0.84f).widthIn(max = 330.dp)
                    .border(5.dp, MaterialTheme.colorScheme.outline.copy(alpha = 0.62f), RoundedCornerShape(43.dp))
                    .clip(RoundedCornerShape(38.dp))
                    .background(Color(0xFF050607))
                    .padding(8.dp)
            )
        }

        Text(watchface.name, color = MaterialTheme.colorScheme.onSurface, fontSize = 26.sp, lineHeight = 31.sp, fontWeight = FontWeight.SemiBold)

        AppClickableSurface(
            onClick = {
                if (!download.active && !download.complete) {
                    startError = null
                    download = WatchfaceDownloadState()
                    try {
                        val safeName = watchface.id.replace(Regex("[^A-Za-z0-9_-]"), "_")
                        val request = DownloadManager.Request(Uri.parse(watchface.archiveUrl))
                            .setTitle(watchface.name + ".zip")
                            .setDescription("Downloading watchface")
                            .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                            .setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, "Plum Watchfaces/" + safeName + ".zip")
                        val manager = context.getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
                        download = WatchfaceDownloadState(id = manager.enqueue(request))
                    } catch (e: Exception) {
                        startError = e.message ?: "Couldn't start download"
                    }
                }
            },
            modifier = Modifier.fillMaxWidth().height(68.dp),
            shape = RoundedCornerShape(22.dp)
        ) {
            Box(
                Modifier.fillMaxSize().clip(RoundedCornerShape(22.dp))
                    .background(MaterialTheme.colorScheme.primary.copy(alpha = 0.13f))
                    .padding(horizontal = 20.dp, vertical = 11.dp),
                contentAlignment = Alignment.Center
            ) {
                when {
                    download.active -> Column(Modifier.fillMaxWidth(), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                        Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                            val label = if (download.totalBytes > 0L) {
                                (animatedProgress * 100f).toInt().toString() + "%  ·  " +
                                    formatDownloadBytes(download.downloadedBytes) + " / " +
                                    formatDownloadBytes(download.totalBytes)
                            } else "Downloading…"
                            Text(label, color = MaterialTheme.colorScheme.onSurface, fontSize = 13.sp, fontWeight = FontWeight.SemiBold)
                            Spacer(Modifier.weight(1f))
                            Text("DOWNLOADING", color = MaterialTheme.colorScheme.primary, fontSize = 10.sp, fontWeight = FontWeight.Bold)
                        }
                        Box(Modifier.fillMaxWidth().height(7.dp).clip(CircleShape).background(MaterialTheme.colorScheme.surfaceVariant)) {
                            Box(Modifier.fillMaxWidth(animatedProgress).height(7.dp).clip(CircleShape).background(MaterialTheme.colorScheme.primary))
                        }
                    }
                    download.complete -> Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(9.dp)) {
                        Icon(Icons.Outlined.Check, null, tint = MaterialTheme.colorScheme.primary)
                        Text("Downloaded", color = MaterialTheme.colorScheme.primary, fontSize = 16.sp, fontWeight = FontWeight.SemiBold)
                    }
                    else -> Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.spacedBy(2.dp)) {
                        Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(9.dp)) {
                            Icon(Icons.Outlined.Download, null, tint = MaterialTheme.colorScheme.primary)
                            Text(if (download.failed || startError != null) "Try again" else "Download", color = MaterialTheme.colorScheme.primary, fontSize = 17.sp, fontWeight = FontWeight.SemiBold)
                        }
                        if (startError != null) Text(startError!!, color = MaterialTheme.colorScheme.error, fontSize = 10.sp, maxLines = 1)
                        else if (download.failed) Text("Download failed", color = MaterialTheme.colorScheme.error, fontSize = 10.sp)
                    }
                }
            }
        }
    }
}

private suspend fun queryWatchfaceDownload(manager: DownloadManager, id: Long): WatchfaceDownloadState? =
    withContext(Dispatchers.IO) {
        var cursor: Cursor? = null
        try {
            cursor = manager.query(DownloadManager.Query().setFilterById(id))
            if (cursor == null || !cursor.moveToFirst()) return@withContext null
            val status = cursor.getInt(cursor.getColumnIndexOrThrow(DownloadManager.COLUMN_STATUS))
            val downloaded = cursor.getLong(cursor.getColumnIndexOrThrow(DownloadManager.COLUMN_BYTES_DOWNLOADED_SO_FAR))
            val total = cursor.getLong(cursor.getColumnIndexOrThrow(DownloadManager.COLUMN_TOTAL_SIZE_BYTES))
            val progress = if (total > 0L) downloaded.toFloat() / total.toFloat() else 0f
            when (status) {
                DownloadManager.STATUS_SUCCESSFUL -> WatchfaceDownloadState(id, 1f, total, downloaded, complete = true)
                DownloadManager.STATUS_FAILED -> WatchfaceDownloadState(id, progress, total, downloaded, failed = true)
                else -> WatchfaceDownloadState(id, progress, total, downloaded)
            }
        } catch (_: Exception) {
            null
        } finally {
            cursor?.close()
        }
    }

private fun formatDownloadBytes(bytes: Long): String {
    if (bytes < 1024L) return bytes.toString() + " B"
    val kb = bytes / 1024f
    if (kb < 1024f) return kb.toInt().toString() + " KB"
    return String.format("%.1f MB", kb / 1024f)
}

@Composable
private fun WatchfaceArtwork(
    url: String,
    modifier: Modifier = Modifier
) {
    val bitmap by produceState<Bitmap?>(initialValue = null, key1 = url) {
        value = withContext(Dispatchers.IO) {
            runCatching {
                val connection = URL(url).openConnection() as HttpURLConnection
                connection.connectTimeout = 10_000
                connection.readTimeout = 12_000
                try {
                    connection.inputStream.use { BitmapFactory.decodeStream(it) }
                } finally {
                    connection.disconnect()
                }
            }.getOrNull()
        }
    }
    Box(
        modifier = modifier.aspectRatio(WATCHFACE_ASPECT_RATIO).background(Color(0xFF050607)),
        contentAlignment = Alignment.Center
    ) {
        if (bitmap != null) {
            Image(bitmap!!.asImageBitmap(), "Watchface preview", Modifier.fillMaxSize(), contentScale = ContentScale.Crop)
        } else {
            Icon(Icons.Outlined.Image, null, tint = MaterialTheme.colorScheme.onSurfaceVariant, modifier = Modifier.size(25.dp))
        }
    }
}

@Composable
private fun WatchfaceInfoState(
    title: String,
    detail: String? = null,
    action: String? = null,
    onAction: (() -> Unit)? = null
) {
    AppSurface(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(28.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 23.dp, vertical = 25.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Box(
                modifier = Modifier
                    .height(64.dp)
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(21.dp))
                        .background(MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.74f))
                        .padding(17.dp)
                ) {
                    Icon(
                        imageVector = Icons.Outlined.Image,
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.primary
                    )
                }
            }

            Text(
                text = title,
                color = MaterialTheme.colorScheme.onSurface,
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold
            )

            if (detail != null) {
                Text(
                    text = detail,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    fontSize = 12.sp,
                    lineHeight = 17.sp
                )
            }

            if (action != null && onAction != null) {
                TextButton(onClick = onAction) {
                    Text(action)
                }
            }
        }
    }
}
