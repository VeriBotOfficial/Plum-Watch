package me.doruk.plumwatch.ui

import android.content.Context
import android.net.Uri
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.activity.compose.BackHandler
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.core.FastOutSlowInEasing
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
import androidx.compose.material.icons.outlined.Image
import androidx.compose.material.icons.outlined.Refresh
import androidx.compose.material3.AlertDialog as MaterialAlertDialog
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
import java.io.File
import java.io.FileInputStream
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import me.doruk.plumwatch.data.Watchface
import me.doruk.plumwatch.data.WatchfaceLibraryResult
import me.doruk.plumwatch.data.WatchfaceRepository
import me.doruk.plumwatch.watch.BleUiState
import me.doruk.plumwatch.watch.BleWatchManager
import java.net.HttpURLConnection
import java.net.URL

private const val WATCHFACE_ASPECT_RATIO = 0.82f


@Composable
fun WatchfacesScreen(watchManager: BleWatchManager, watchState: BleUiState) {
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
                watchManager = watchManager,
                watchState = watchState,
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
    watchManager: BleWatchManager,
    watchState: BleUiState,
    onBack: () -> Unit
) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    val preferences = remember(context) {
        context.getSharedPreferences("plum-watchface-transfers", Context.MODE_PRIVATE)
    }
    val watchAddress = watchState.connectedDevice?.address ?: watchState.savedDevice?.address
    val sentPreferenceKey = "sent:" + (watchAddress ?: "no-watch") + ":" + watchface.id

    var isPushing by remember(watchface.id, watchAddress) { mutableStateOf(false) }
    var transferProgress by remember(watchface.id, watchAddress) { mutableStateOf(0f) }
    var transferPhase by remember(watchface.id, watchAddress) { mutableStateOf("Downloading…") }
    var alreadySent by remember(watchface.id, watchAddress) { mutableStateOf(false) }
    var transferError by remember(watchface.id, watchAddress) { mutableStateOf<String?>(null) }
    var showResendDialog by remember(watchface.id, watchAddress) { mutableStateOf(false) }

    val canPush = watchState.isConnected && watchState.supportsSifliWatchface

    LaunchedEffect(watchface.id, watchAddress) {
        alreadySent = watchAddress != null &&
            preferences.getBoolean(sentPreferenceKey, false)
    }

    fun startTransfer() {
        if (isPushing) return
        if (!watchState.isConnected) {
            transferError = "Connect your watch before adding a watchface."
            return
        }
        if (!watchState.supportsSifliWatchface) {
            transferError = "This watch does not expose the SiFli watchface transfer service."
            return
        }
        scope.launch {
            isPushing = true
            transferProgress = 0f
            transferPhase = "Downloading…"
            transferError = null

            val safeName = watchface.id.replace(Regex("[^A-Za-z0-9_-]"), "_")
            val archiveFile = File(context.cacheDir, "watchface-" + safeName + ".zip")
            try {
                downloadWatchfaceArchive(
                    url = watchface.archiveUrl,
                    destination = archiveFile,
                    expectedSizeBytes = watchface.archiveSizeBytes
                ) { progress ->
                    transferProgress = progress
                }
                transferPhase = "Sending to watch…"
                transferProgress = 0f

                watchManager.pushWatchface(
                    archiveFile = archiveFile
                ) { progress ->
                    transferProgress = progress.coerceIn(0f, 1f)
                }

                transferProgress = 1f
                alreadySent = true
                if (watchAddress != null) {
                    preferences.edit().putBoolean(sentPreferenceKey, true).apply()
                }
            } catch (cancelled: CancellationException) {
                throw cancelled
            } catch (exception: Exception) {
                transferError = exception.message ?: "Could not send this watchface to your watch."
            } finally {
                archiveFile.delete()
                isPushing = false
            }
        }
    }

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
            Text(
                "Face Gallery",
                Modifier.padding(start = 13.dp),
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                fontSize = 14.sp
            )
        }

        Box(Modifier.fillMaxWidth().weight(1f), contentAlignment = Alignment.Center) {
            WatchfaceArtwork(
                watchface.previewUrl,
                Modifier.fillMaxWidth(0.84f).widthIn(max = 330.dp)
                    .border(
                        5.dp,
                        MaterialTheme.colorScheme.outline.copy(alpha = 0.62f),
                        RoundedCornerShape(43.dp)
                    )
                    .clip(RoundedCornerShape(38.dp))
                    .background(Color(0xFF050607))
                    .padding(8.dp)
            )
        }

        Text(
            watchface.name,
            color = MaterialTheme.colorScheme.onSurface,
            fontSize = 26.sp,
            lineHeight = 31.sp,
            fontWeight = FontWeight.SemiBold
        )

        val buttonLabel = when {
            !watchState.isConnected -> "Connect your watch"
            !watchState.supportsSifliWatchface -> "Transfer unavailable"
            transferError != null -> "Try again"
            alreadySent -> "Transfer complete"
            else -> "Add to watch"
        }

        PlumDownloadButton(
            label = buttonLabel,
            downloading = isPushing,
            progress = transferProgress,
            downloaded = alreadySent,
            enabled = canPush && !isPushing,
            onClick = {
                if (alreadySent) showResendDialog = true else startTransfer()
            },
            modifier = Modifier.fillMaxWidth(),
            downloadingLabel = transferPhase,
            successLabel = "Transfer complete"
        )

        if (!watchState.isConnected) {
            Text(
                "Connect your watch to send this face over Bluetooth.",
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                fontSize = 11.sp,
                lineHeight = 16.sp
            )
        } else if (!watchState.supportsSifliWatchface) {
            Text(
                "This watch does not expose the SiFli watchface transfer service.",
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                fontSize = 11.sp,
                lineHeight = 16.sp
            )
        }

        if (transferError != null) {
            Text(
                transferError ?: "",
                color = MaterialTheme.colorScheme.error,
                fontSize = 11.sp,
                lineHeight = 16.sp
            )
        }
    }

    if (showResendDialog) {
        MaterialAlertDialog(
            onDismissRequest = { showResendDialog = false },
            title = { Text("Transfer this watchface again?") },
            text = {
                Text(
                    "Transfer the " + watchface.name + " ZIP to the connected watch again?",
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            },
            confirmButton = {
                TextButton(onClick = {
                    showResendDialog = false
                    alreadySent = false
                    startTransfer()
                }) {
                    Text("Transfer again")
                }
            },
            dismissButton = {
                TextButton(onClick = { showResendDialog = false }) {
                    Text("Cancel")
                }
            },
            containerColor = MaterialTheme.colorScheme.surface,
            titleContentColor = MaterialTheme.colorScheme.onSurface,
            textContentColor = MaterialTheme.colorScheme.onSurfaceVariant
        )
    }
}

private suspend fun downloadWatchfaceArchive(
    url: String,
    destination: File,
    expectedSizeBytes: Long?,
    onProgress: (Float) -> Unit
): File = withContext(Dispatchers.IO) {
    val connection = URL(url).openConnection() as HttpURLConnection
    connection.connectTimeout = 15_000
    connection.readTimeout = 25_000
    connection.requestMethod = "GET"
    connection.setRequestProperty("User-Agent", "Plum-Watch-Android")
    connection.setRequestProperty("Cache-Control", "no-cache")
    connection.setRequestProperty("Accept-Encoding", "identity")

    try {
        val status = connection.responseCode
        if (status !in 200..299) {
            throw IllegalStateException("Could not fetch the watchface archive (HTTP " + status + ").")
        }
        val totalBytes = connection.contentLengthLong.takeIf { it > 0L }
            ?: expectedSizeBytes?.takeIf { it > 0L }
            ?: -1L
        var receivedBytes = 0L
        var lastProgressUpdateAt = 0L
        connection.inputStream.use { input ->
            destination.outputStream().buffered().use { output ->
                val buffer = ByteArray(16 * 1024)
                while (true) {
                    val count = input.read(buffer)
                    if (count < 0) break
                    output.write(buffer, 0, count)
                    receivedBytes += count
                    if (totalBytes > 0L) {
                        val now = System.nanoTime()
                        if (now - lastProgressUpdateAt >= 100_000_000L || receivedBytes >= totalBytes) {
                            lastProgressUpdateAt = now
                            val progress = (receivedBytes.toDouble() / totalBytes.toDouble())
                                .toFloat().coerceIn(0f, 0.99f)
                            withContext(Dispatchers.Main.immediate) { onProgress(progress) }
                        }
                    }
                }
            }
        }
        if (destination.length() <= 0L) {
            throw IllegalStateException("The watchface archive is empty.")
        }
        if (totalBytes > 0L && receivedBytes != totalBytes) {
            throw IllegalStateException("The watchface archive download was incomplete.")
        }
        val signature = FileInputStream(destination).use { input ->
            val first = input.read()
            val second = input.read()
            first == 0x50 && second == 0x4B
        }
        if (!signature) {
            throw IllegalStateException("The watchface library did not return a valid ZIP archive.")
        }
        withContext(Dispatchers.Main.immediate) { onProgress(1f) }
        destination
    } catch (exception: Exception) {
        destination.delete()
        throw exception
    } finally {
        connection.disconnect()
    }
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
