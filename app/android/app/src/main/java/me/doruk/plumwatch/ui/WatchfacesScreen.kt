package me.doruk.plumwatch.ui

import android.content.Context
import android.net.Uri
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Movie
import android.graphics.Canvas as AndroidCanvas
import android.graphics.PorterDuff
import android.os.SystemClock
import android.util.LruCache
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
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material.icons.outlined.GridView
import androidx.compose.material.icons.outlined.Image
import androidx.compose.material.icons.outlined.Refresh
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.AlertDialog as MaterialAlertDialog
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
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
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
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
fun StoreScreen(watchManager: BleWatchManager, watchState: BleUiState) {
    val scope = rememberCoroutineScope()
    var result by remember { mutableStateOf<WatchfaceLibraryResult?>(null) }
    var loading by remember { mutableStateOf(false) }
    var selectedWatchface by remember { mutableStateOf<Watchface?>(null) }
    var selectedSection by remember { mutableStateOf(StoreSection.WATCHFACES) }
    var searchQuery by remember { mutableStateOf("") }

    suspend fun refreshLibrary() {
        loading = true
        result = WatchfaceRepository.load()
        loading = false
    }

    LaunchedEffect(Unit) { refreshLibrary() }
    BackHandler(enabled = selectedWatchface != null) { selectedWatchface = null }

    Column(Modifier.fillMaxSize()) {
        if (selectedWatchface == null) {
            StoreHeader(selectedSection) { selectedSection = it }
        }
        if (selectedSection == StoreSection.APPS && selectedWatchface == null) {
            AppStoreEmptyState()
        } else {
            AnimatedContent(
                targetState = selectedWatchface,
                modifier = Modifier.weight(1f),
                transitionSpec = {
                    val openingPreview = targetState != null
                    val direction = if (openingPreview) 1 else -1
                    (fadeIn(tween(150)) + slideInHorizontally(
                        animationSpec = tween(210, easing = FastOutSlowInEasing),
                        initialOffsetX = { width -> direction * width / 16 }
                    )) togetherWith
                        (fadeOut(tween(110)) + slideOutHorizontally(
                            animationSpec = tween(170, easing = FastOutSlowInEasing),
                            targetOffsetX = { width -> -direction * width / 22 }
                        ))
                },
                label = "store-navigation"
            ) { selected ->
                if (selected == null) {
                    WatchfaceGalleryList(
                        result = result,
                        loading = loading,
                        searchQuery = searchQuery,
                        onSearchQueryChange = { searchQuery = it },
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
    }
}

private enum class StoreSection { WATCHFACES, APPS }

@Composable
private fun StoreHeader(
    selectedSection: StoreSection,
    onSectionSelected: (StoreSection) -> Unit
) {
    Column(
        modifier = Modifier.fillMaxWidth().statusBarsPadding()
            .padding(horizontal = 22.dp).padding(top = 14.dp, bottom = 8.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        PageTitle("Store")
        Row(
            modifier = Modifier.fillMaxWidth()
                .clip(RoundedCornerShape(19.dp))
                .background(MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.55f))
                .padding(4.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            StoreSectionButton(
                label = "Watchface Store",
                selected = selectedSection == StoreSection.WATCHFACES,
                modifier = Modifier.weight(1f),
                onClick = { onSectionSelected(StoreSection.WATCHFACES) }
            )
            StoreSectionButton(
                label = "App Store",
                selected = selectedSection == StoreSection.APPS,
                modifier = Modifier.weight(1f),
                onClick = { onSectionSelected(StoreSection.APPS) }
            )
        }
    }
}

@Composable
private fun StoreSectionButton(
    label: String,
    selected: Boolean,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    AppClickableSurface(onClick = onClick, modifier = modifier, shape = RoundedCornerShape(15.dp)) {
        Box(
            modifier = Modifier.fillMaxWidth()
                .background(if (selected) MaterialTheme.colorScheme.surface else Color.Transparent)
                .padding(vertical = 12.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                label,
                color = if (selected) MaterialTheme.colorScheme.onSurface
                else MaterialTheme.colorScheme.onSurfaceVariant,
                fontSize = 12.sp,
                fontWeight = if (selected) FontWeight.SemiBold else FontWeight.Medium
            )
        }
    }
}

@Composable
private fun AppStoreEmptyState() {
    Column(
        modifier = Modifier.fillMaxSize().padding(horizontal = 30.dp).padding(bottom = 90.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier.size(76.dp).clip(RoundedCornerShape(25.dp))
                .background(MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.7f)),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                Icons.Outlined.GridView,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.primary,
                modifier = Modifier.size(32.dp)
            )
        }
        Spacer(Modifier.height(20.dp))
        Text(
            "Coming soon",
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            fontSize = 13.sp
        )
    }
}

@Composable
private fun WatchfaceGalleryList(
    result: WatchfaceLibraryResult?,
    loading: Boolean,
    searchQuery: String,
    onSearchQueryChange: (String) -> Unit,
    onRefresh: () -> Unit,
    onSelect: (Watchface) -> Unit
) {
    LazyVerticalGrid(
        columns = GridCells.Adaptive(minSize = 148.dp),
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(start = 22.dp, end = 22.dp, top = 8.dp, bottom = 126.dp),
        horizontalArrangement = Arrangement.spacedBy(14.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item(span = { GridItemSpan(maxLineSpan) }) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                PageTitle("Watchfaces")
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
        item(span = { GridItemSpan(maxLineSpan) }) {
            OutlinedTextField(
                value = searchQuery,
                onValueChange = onSearchQueryChange,
                modifier = Modifier.fillMaxWidth(),
                singleLine = true,
                shape = RoundedCornerShape(18.dp),
                placeholder = { Text("Search watchfaces") },
                leadingIcon = { Icon(Icons.Outlined.Search, contentDescription = null) }
            )
        }
        when {
            loading && result == null -> item(span = { GridItemSpan(maxLineSpan) }) {
                Box(Modifier.fillMaxWidth().height(220.dp), contentAlignment = Alignment.Center) {
                    PlumProgressLabel("Loading watchfaces")
                }
            }
            result is WatchfaceLibraryResult.PrivateOrUnavailable -> item(span = { GridItemSpan(maxLineSpan) }) {
                WatchfaceInfoState("Store unavailable", action = "Refresh", onAction = onRefresh)
            }
            result is WatchfaceLibraryResult.Failed -> item(span = { GridItemSpan(maxLineSpan) }) {
                WatchfaceInfoState("Couldn't load watchfaces", detail = result.message, action = "Retry", onAction = onRefresh)
            }
            result is WatchfaceLibraryResult.Available -> {
                val allFaces = result.watchfaces
                val faces = allFaces.filter { face ->
                    searchQuery.isBlank() || face.name.contains(searchQuery, ignoreCase = true)
                }
                if (faces.isEmpty()) {
                    item(span = { GridItemSpan(maxLineSpan) }) {
                        WatchfaceInfoState(
                            if (allFaces.isEmpty()) "No watchfaces yet" else "No matching watchfaces",
                            detail = if (allFaces.isEmpty()) null else "Try another search."
                        )
                    }
                } else {
                    items(faces, key = { it.id }) { face ->
                        Column(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.spacedBy(9.dp)
                        ) {
                            AppClickableSurface(
                                onClick = { onSelect(face) },
                                modifier = Modifier.fillMaxWidth(),
                                shape = RoundedCornerShape(26.dp)
                            ) {
                                Box(
                                    Modifier.padding(4.dp)
                                        .border(
                                            2.dp,
                                            MaterialTheme.colorScheme.outline.copy(alpha = 0.45f),
                                            RoundedCornerShape(22.dp)
                                        )
                                        .clip(RoundedCornerShape(20.dp))
                                        .background(Color(0xFF050607))
                                ) {
                                    WatchfaceArtwork(face.previewUrl, Modifier.fillMaxWidth())
                                }
                            }
                            Text(
                                face.name,
                                color = MaterialTheme.colorScheme.onSurface,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.SemiBold,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis,
                                textAlign = androidx.compose.ui.text.style.TextAlign.Center,
                                modifier = Modifier.fillMaxWidth()
                            )
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
                "Watchface Store",
                Modifier.padding(start = 13.dp),
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                fontSize = 14.sp
            )
        }

        Text(
            watchface.name,
            modifier = Modifier.fillMaxWidth().padding(top = 3.dp, bottom = 1.dp),
            color = MaterialTheme.colorScheme.onSurface,
            fontSize = 27.sp,
            lineHeight = 32.sp,
            fontWeight = FontWeight.SemiBold,
            textAlign = androidx.compose.ui.text.style.TextAlign.Start,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis
        )

        Box(Modifier.fillMaxWidth().weight(1f), contentAlignment = Alignment.Center) {
            WatchfaceArtwork(
                (watchface.animatedPreviewUrl ?: watchface.previewUrl),
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


private const val MAX_WATCHFACE_PREVIEW_BYTES = 8L * 1024 * 1024
private const val MAX_WATCHFACE_PREVIEW_CACHE_BYTES = 32L * 1024 * 1024
private const val MAX_WATCHFACE_PREVIEW_CACHE_FILES = 60
private const val WATCHFACE_PREVIEW_CACHE_MAX_AGE_MS = 14L * 24 * 60 * 60 * 1_000
private val watchfacePreviewCacheLock = Any()

private val watchfacePreviewMemoryCache = object : LruCache<String, ByteArray>(8 * 1024 * 1024) {
    override fun sizeOf(key: String, value: ByteArray): Int = value.size
}

fun cleanupPlumWatchStorage(context: Context) {
    val cacheDirectory = context.cacheDir
    pruneWatchfacePreviewDiskCache(File(cacheDirectory, "store-previews"))

    // A process killed during a transfer cannot run its finally cleanup.
    // No transfer can still be active when the application process starts.
    cacheDirectory.listFiles()?.forEach { file ->
        val isAbandonedWatchfaceTransfer =
            file.name.startsWith("plum-watchface-") ||
                (file.name.startsWith("watchface-") && file.name.endsWith(".zip"))
        if (isAbandonedWatchfaceTransfer && file.lastModified() < System.currentTimeMillis() - 60L * 60 * 1_000) {
            file.deleteRecursively()
        }
    }
}

private fun pruneWatchfacePreviewDiskCache(directory: File) {
    synchronized(watchfacePreviewCacheLock) {
        val files = directory.listFiles()?.filter { it.isFile } ?: return
        val now = System.currentTimeMillis()

        // Remove interrupted writes, invalid files and previews older than two weeks.
        files.filter { file ->
            file.name.endsWith(".tmp") ||
                !file.name.endsWith(".img") ||
                file.length() <= 0L ||
                file.length() > MAX_WATCHFACE_PREVIEW_BYTES ||
                now - file.lastModified() > WATCHFACE_PREVIEW_CACHE_MAX_AGE_MS
        }.forEach { it.delete() }

        val previews = directory.listFiles()
            ?.filter { it.isFile && it.name.endsWith(".img") }
            ?.sortedBy { it.lastModified() }
            ?: return
        var totalBytes = previews.sumOf { it.length() }
        var remainingFiles = previews.size

        // Keep the newest previews and enforce both a byte and file-count ceiling.
        for (file in previews) {
            if (totalBytes <= MAX_WATCHFACE_PREVIEW_CACHE_BYTES &&
                remainingFiles <= MAX_WATCHFACE_PREVIEW_CACHE_FILES
            ) break
            val size = file.length()
            if (file.delete()) {
                totalBytes -= size
                remainingFiles--
            }
        }
    }
}

private suspend fun loadCachedWatchfacePreview(context: Context, url: String): ByteArray? =
    withContext(Dispatchers.IO) {
        watchfacePreviewMemoryCache.get(url)?.let { return@withContext it }
        val directory = File(context.cacheDir, "store-previews")
        if (!directory.exists()) directory.mkdirs()
        pruneWatchfacePreviewDiskCache(directory)

        val fileKey = java.security.MessageDigest.getInstance("SHA-256")
            .digest(url.toByteArray(Charsets.UTF_8))
            .joinToString("") { byte -> "%02x".format(byte) }
        val cachedFile = File(directory, "$fileKey.img")
        if (cachedFile.exists()) {
            val cached = runCatching {
                synchronized(watchfacePreviewCacheLock) {
                    cachedFile.takeIf {
                        it.isFile && it.length() in 1..MAX_WATCHFACE_PREVIEW_BYTES
                    }?.readBytes()
                }
            }.getOrNull()
            if (cached != null) {
                cachedFile.setLastModified(System.currentTimeMillis())
                watchfacePreviewMemoryCache.put(url, cached)
                return@withContext cached
            }
            cachedFile.delete()
        }

        var connection: HttpURLConnection? = null
        try {
            connection = (URL(url).openConnection() as HttpURLConnection).apply {
                connectTimeout = 7_000
                readTimeout = 9_000
                setRequestProperty("User-Agent", "Plum-Watch-Android")
                setRequestProperty("Cache-Control", "public, max-age=86400")
            }
            if (connection.responseCode !in 200..299) return@withContext null
            val data = connection.inputStream.use { input ->
                val output = java.io.ByteArrayOutputStream()
                val buffer = ByteArray(16 * 1024)
                while (true) {
                    val count = input.read(buffer)
                    if (count < 0) break
                    if (output.size().toLong() + count > MAX_WATCHFACE_PREVIEW_BYTES) {
                        return@withContext null
                    }
                    output.write(buffer, 0, count)
                }
                output.toByteArray()
            }
            if (data.isEmpty()) return@withContext null

            synchronized(watchfacePreviewCacheLock) {
                val temporaryFile = File(directory, "$fileKey.tmp")
                runCatching {
                    temporaryFile.writeBytes(data)
                    if (!temporaryFile.renameTo(cachedFile)) temporaryFile.delete()
                }
                pruneWatchfacePreviewDiskCache(directory)
            }
            watchfacePreviewMemoryCache.put(url, data)
            data
        } catch (_: Exception) {
            null
        } finally {
            connection?.disconnect()
        }
    }

@Composable
private fun WatchfaceArtwork(
    url: String?,
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    val bytes by produceState<ByteArray?>(initialValue = null, key1 = url) {
        value = if (url.isNullOrBlank()) null else loadCachedWatchfacePreview(context, url)
    }
    val movie = remember(bytes) {
        bytes?.let { Movie.decodeByteArray(it, 0, it.size) }?.takeIf { it.width() > 0 && it.height() > 0 }
    }
    var frameBitmap by remember(bytes) { mutableStateOf<Bitmap?>(null) }

    LaunchedEffect(bytes, movie) {
        val data = bytes ?: run {
            frameBitmap = null
            return@LaunchedEffect
        }
        if (movie == null) {
            frameBitmap = BitmapFactory.decodeByteArray(data, 0, data.size)
        } else {
            val width = movie.width().coerceIn(1, 1024)
            val height = movie.height().coerceIn(1, 1024)
            val frame = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)
            val canvas = AndroidCanvas(frame)
            val duration = movie.duration().takeIf { it > 0 } ?: 1000
            val startedAt = SystemClock.uptimeMillis()
            while (isActive) {
                val elapsed = ((SystemClock.uptimeMillis() - startedAt) % duration).toInt()
                movie.setTime(elapsed)
                canvas.drawColor(android.graphics.Color.TRANSPARENT, PorterDuff.Mode.CLEAR)
                movie.draw(canvas, 0f, 0f)
                frameBitmap = frame.copy(Bitmap.Config.ARGB_8888, false)
                delay(100)
            }
        }
    }

    Box(
        modifier = modifier.aspectRatio(WATCHFACE_ASPECT_RATIO).background(Color(0xFF050607)),
        contentAlignment = Alignment.Center
    ) {
        if (frameBitmap != null) {
            Image(
                frameBitmap!!.asImageBitmap(),
                "Watchface preview",
                Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
        } else {
            Icon(
                Icons.Outlined.Image,
                null,
                tint = MaterialTheme.colorScheme.onSurfaceVariant,
                modifier = Modifier.size(25.dp)
            )
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
