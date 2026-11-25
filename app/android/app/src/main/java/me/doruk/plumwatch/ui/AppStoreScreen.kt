package me.doruk.plumwatch.ui

import android.content.Context
import android.widget.Toast
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.activity.compose.BackHandler
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material.icons.outlined.Download
import androidx.compose.material.icons.outlined.GridView
import androidx.compose.material.icons.outlined.Refresh
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
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
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import me.doruk.plumwatch.data.StoreApp
import me.doruk.plumwatch.data.StoreAppLibraryResult
import me.doruk.plumwatch.data.StoreAppRepository
import me.doruk.plumwatch.watch.BleUiState
import me.doruk.plumwatch.watch.BleWatchManager
import me.doruk.plumwatch.watch.WatchDiagnosticLog
import java.io.ByteArrayOutputStream
import java.io.File
import java.net.HttpURLConnection
import java.net.URL
import java.util.Base64
import java.util.zip.ZipFile

@Composable
fun AppStoreScreen(
    watchManager: BleWatchManager,
    watchState: BleUiState,
    onDetailVisibilityChanged: (Boolean) -> Unit = {}
) {
    val scope = rememberCoroutineScope()
    var result by remember { mutableStateOf<StoreAppLibraryResult?>(null) }
    var loading by remember { mutableStateOf(false) }
    var selectedApp by remember { mutableStateOf<StoreApp?>(null) }
    var query by remember { mutableStateOf("") }

    suspend fun refresh() {
        loading = true
        try {
            result = StoreAppRepository.load()
        } finally {
            loading = false
        }
    }

    LaunchedEffect(Unit) { refresh() }
    BackHandler(enabled = selectedApp != null) { selectedApp = null }
    LaunchedEffect(selectedApp != null) { onDetailVisibilityChanged(selectedApp != null) }

    AnimatedContent(
        targetState = selectedApp,
        modifier = Modifier.fillMaxSize(),
        transitionSpec = {
            val openingPreview = targetState != null
            val direction = if (openingPreview) 1 else -1
            (fadeIn(androidx.compose.animation.core.tween(150)) + androidx.compose.animation.slideInHorizontally(
                animationSpec = androidx.compose.animation.core.tween(
                    210,
                    easing = androidx.compose.animation.core.FastOutSlowInEasing
                ),
                initialOffsetX = { width -> direction * width / 16 }
            )) togetherWith
                (fadeOut(androidx.compose.animation.core.tween(110)) + androidx.compose.animation.slideOutHorizontally(
                    animationSpec = androidx.compose.animation.core.tween(
                        170,
                        easing = androidx.compose.animation.core.FastOutSlowInEasing
                    ),
                    targetOffsetX = { width -> -direction * width / 22 }
                ))
        },
        label = "app-store-navigation"
    ) { selected ->
        if (selected == null) {
            AppStoreGallery(
                result = result,
                loading = loading,
                watchState = watchState,
                query = query,
                onQueryChange = { query = it },
                onRefresh = { scope.launch { refresh() } },
                onSelect = { selectedApp = it }
            )
        } else {
            AppStoreDetail(
                app = selected,
                watchManager = watchManager,
                watchState = watchState,
                onBack = { selectedApp = null }
            )
        }
    }
}

@Composable
private fun AppStoreGallery(
    result: StoreAppLibraryResult?,
    loading: Boolean,
    watchState: BleUiState,
    query: String,
    onQueryChange: (String) -> Unit,
    onRefresh: () -> Unit,
    onSelect: (StoreApp) -> Unit
) {
    LazyVerticalGrid(
        columns = GridCells.Adaptive(minSize = 148.dp),
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(start = 22.dp, end = 22.dp, top = 12.dp, bottom = 126.dp),
        horizontalArrangement = Arrangement.spacedBy(14.dp),
        verticalArrangement = Arrangement.spacedBy(15.dp)
    ) {
        item(span = { GridItemSpan(maxLineSpan) }) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Column {
                    Text("Apps", fontSize = 25.sp, fontWeight = FontWeight.SemiBold,
                        color = MaterialTheme.colorScheme.onSurface)
                }
                Spacer(Modifier.weight(1f))
                TextButton(onClick = onRefresh, enabled = !loading) {
                    if (loading) CircularProgressIndicator(Modifier.size(16.dp), strokeWidth = 2.dp)
                    else {
                        Icon(Icons.Outlined.Refresh, contentDescription = null)
                        Text("Refresh", Modifier.padding(start = 5.dp))
                    }
                }
            }
        }
        item(span = { GridItemSpan(maxLineSpan) }) {
            WatchLogCaptureControls(watchState)
        }
        item(span = { GridItemSpan(maxLineSpan) }) {
            OutlinedTextField(
                value = query,
                onValueChange = onQueryChange,
                modifier = Modifier.fillMaxWidth(),
                singleLine = true,
                shape = RoundedCornerShape(18.dp),
                placeholder = { Text("Search apps and games") },
                leadingIcon = { Icon(Icons.Outlined.Search, contentDescription = null) }
            )
        }
        when (val state = result) {
            null -> item(span = { GridItemSpan(maxLineSpan) }) {
                AppStoreMessage("Loading catalogue")
            }
            StoreAppLibraryResult.Unavailable -> item(span = { GridItemSpan(maxLineSpan) }) {
                AppStoreMessage("Store unavailable")
            }
            is StoreAppLibraryResult.Failed -> item(span = { GridItemSpan(maxLineSpan) }) {
                AppStoreMessage("Couldn't load the catalogue", state.message)
            }
            is StoreAppLibraryResult.Available -> {
                val apps = state.apps.filter {
                    query.isBlank() || it.name.contains(query, true) ||
                        it.description.contains(query, true) || it.category.contains(query, true)
                }
                if (apps.isEmpty()) {
                    item(span = { GridItemSpan(maxLineSpan) }) {
                        AppStoreMessage(if (state.apps.isEmpty()) "No apps yet" else "No matching apps")
                    }
                } else {
                    items(apps, key = { it.id }) { app ->
                        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                            Surface(
                                modifier = Modifier.fillMaxWidth().clickable { onSelect(app) },
                                shape = RoundedCornerShape(24.dp),
                                color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.55f),
                                border = androidx.compose.foundation.BorderStroke(
                                    1.dp, MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.5f)
                                )
                            ) {
                                Column(Modifier.padding(7.dp)) {
                                    StoreAppArtwork(
                                        app.iconUrl,
                                        Modifier.fillMaxWidth().aspectRatio(1f)
                                            .clip(RoundedCornerShape(19.dp))
                                            .background(MaterialTheme.colorScheme.surface)
                                    )
                                    Row(
                                        Modifier.fillMaxWidth().padding(horizontal = 5.dp, vertical = 8.dp),
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Column(Modifier.weight(1f)) {
                                            Text(app.name, fontSize = 14.sp, fontWeight = FontWeight.SemiBold,
                                                color = MaterialTheme.colorScheme.onSurface,
                                                maxLines = 1, overflow = TextOverflow.Ellipsis)
                                            Text("${app.category} · v${app.version.ifBlank { "1.0" }}", fontSize = 11.sp,
                                                color = MaterialTheme.colorScheme.onSurfaceVariant)
                                        }
                                        Icon(Icons.Outlined.Download, contentDescription = null,
                                            tint = MaterialTheme.colorScheme.primary,
                                            modifier = Modifier.size(17.dp))
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun WatchLogCaptureControls(watchState: BleUiState) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    var capturing by remember { mutableStateOf(WatchDiagnosticLog.isCapturing) }
    var logFile by remember { mutableStateOf<File?>(null) }
    val exportLauncher = rememberLauncherForActivityResult(ActivityResultContracts.CreateDocument("text/plain")) { destination ->
        val source = logFile
        if (destination != null && source != null) {
            scope.launch(Dispatchers.IO) {
                val saved = runCatching {
                    context.contentResolver.openOutputStream(destination)?.use { output ->
                        source.inputStream().use { input -> input.copyTo(output) }
                    } ?: error("Could not open destination.")
                }.isSuccess
                withContext(Dispatchers.Main) { Toast.makeText(context, if (saved) "Watch log saved." else "Could not save watch log.", Toast.LENGTH_LONG).show() }
            }
        }
    }
    Surface(modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(20.dp), color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.42f)) {
        Column(Modifier.padding(14.dp), verticalArrangement = Arrangement.spacedBy(5.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Column(Modifier.weight(1f)) {
                    Text("Watch diagnostics", fontSize = 13.sp, fontWeight = FontWeight.SemiBold)
                    Text(if (capturing) "Capturing Bluetooth traffic…" else "Temporary BLE capture", fontSize = 11.sp, color = MaterialTheme.colorScheme.onSurfaceVariant)
                }
                if (capturing) TextButton(onClick = { logFile = WatchDiagnosticLog.stop(); capturing = false }) { Text("Stop") }
                else TextButton(onClick = { logFile = WatchDiagnosticLog.start(context, watchState.connectedDevice?.address ?: watchState.savedDevice?.address); capturing = WatchDiagnosticLog.isCapturing }) { Text("Start") }
            }
            if (!capturing && logFile != null) TextButton(onClick = { exportLauncher.launch("plum-watch-" + System.currentTimeMillis() + ".txt") }) { Text("Export captured log") }
            Text("Captures BLE packets and transfer events, not private firmware console output. Raw packets may contain personal watch data.", fontSize = 10.sp, lineHeight = 14.sp, color = MaterialTheme.colorScheme.onSurfaceVariant)
        }
    }
}

@Composable
private fun AppStoreDetail(
    app: StoreApp,
    watchManager: BleWatchManager,
    watchState: BleUiState,
    onBack: () -> Unit
) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    val watchAddress = watchState.connectedDevice?.address ?: watchState.savedDevice?.address
    val preferences = remember(context) {
        context.getSharedPreferences("plum-store-apps", Context.MODE_PRIVATE)
    }
    val installedKey = "transferred:${watchAddress ?: "no-watch"}:${app.id}"
    var transferred by remember(app.id, watchAddress) { mutableStateOf(false) }
    var transferring by remember(app.id, watchAddress) { mutableStateOf(false) }
    var progress by remember(app.id, watchAddress) { mutableStateOf(0f) }
    var phase by remember(app.id, watchAddress) { mutableStateOf("Downloading…") }
    var error by remember(app.id, watchAddress) { mutableStateOf<String?>(null) }

    val supportedPackage = app.packageType.equals("qjs", true) && app.otaType == 5
    val canInstall = watchState.isConnected && watchState.supportsSifliWatchface && supportedPackage

    LaunchedEffect(app.id, watchAddress) {
        transferred = watchAddress != null && preferences.getBoolean(installedKey, false)
    }

    Column(
        Modifier.fillMaxSize().statusBarsPadding()
            .padding(horizontal = 22.dp).padding(top = 12.dp, bottom = 126.dp),
        verticalArrangement = Arrangement.spacedBy(13.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            PlumBackButton(onClick = onBack, modifier = Modifier.size(42.dp))
            Text(
                "App Store",
                Modifier.padding(start = 13.dp),
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                fontSize = 14.sp
            )
        }

        Text(
            app.name,
            modifier = Modifier.fillMaxWidth().padding(top = 3.dp, bottom = 1.dp),
            color = MaterialTheme.colorScheme.onSurface,
            fontSize = 27.sp,
            lineHeight = 32.sp,
            fontWeight = FontWeight.SemiBold,
            textAlign = androidx.compose.ui.text.style.TextAlign.Center,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis
        )
        Text(
            "Version ${app.version.ifBlank { "1.0" }}",
            modifier = Modifier.fillMaxWidth(),
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            fontSize = 13.sp,
            textAlign = androidx.compose.ui.text.style.TextAlign.Center
        )

        Box(Modifier.fillMaxWidth().weight(1f), contentAlignment = Alignment.Center) {
            StoreAppArtwork(
                app.previewUrl ?: app.iconUrl,
                Modifier.fillMaxWidth(0.84f).aspectRatio(0.82f)
                    .clip(RoundedCornerShape(34.dp))
                    .background(MaterialTheme.colorScheme.surfaceVariant)
                    .border(
                        1.5.dp,
                        MaterialTheme.colorScheme.outline.copy(alpha = 0.55f),
                        RoundedCornerShape(34.dp)
                    )
            )
        }

        PlumDownloadButton(
            label = when {
                !watchState.isConnected -> "Connect your watch"
                !watchState.supportsSifliWatchface -> "Connect your watch"
                !supportedPackage -> "Unavailable"
                error != null -> "Try again"
                else -> "Add to watch"
            },
            downloading = transferring,
            progress = progress,
            downloaded = transferred,
            enabled = canInstall,
            onClick = {
                scope.launch {
                    transferring = true
                    error = null
                    progress = 0f
                    var archive: File? = null
                    try {
                        phase = "Downloading…"
                        archive = downloadStoreAppArchive(context, app) { progress = it }
                        phase = "Adding to watch…"
                        progress = 0f
                        watchManager.installQuickJsApp(archive) { progress = it }
                        progress = 1f
                        transferred = true
                        preferences.edit().putBoolean(installedKey, true).apply()
                    } catch (cancelled: CancellationException) {
                        throw cancelled
                    } catch (exception: Exception) {
                        error = exception.message ?: "Could not add this app to your watch."
                    } finally {
                        archive?.delete()
                        transferring = false
                    }
                }
            },
            modifier = Modifier.fillMaxWidth(),
            downloadingLabel = phase,
            successLabel = "Added to watch"
        )
        if (error != null) {
            Text(error ?: "", color = MaterialTheme.colorScheme.error, fontSize = 12.sp)
        }
    }
}

@Composable
private fun StoreAppArtwork(url: String?, modifier: Modifier = Modifier) {
    val bitmap by produceState<Bitmap?>(initialValue = null, key1 = url) {
        value = if (url.isNullOrBlank()) null else withContext(Dispatchers.IO) {
            runCatching {
                val connection = (URL(url).openConnection() as HttpURLConnection).apply {
                    connectTimeout = 7_000
                    readTimeout = 9_000
                    setRequestProperty("User-Agent", "Plum-Watch-Android")
                }
                try {
                    if (connection.responseCode !in 200..299) return@runCatching null
                    connection.inputStream.use { BitmapFactory.decodeStream(it) }
                } finally {
                    connection.disconnect()
                }
            }.getOrNull()
        }
    }
    Box(modifier, contentAlignment = Alignment.Center) {
        if (bitmap != null) {
            Image(bitmap!!.asImageBitmap(), contentDescription = null,
                modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop)
        } else {
            Icon(Icons.Outlined.GridView, contentDescription = null,
                tint = MaterialTheme.colorScheme.onSurfaceVariant, modifier = Modifier.size(28.dp))
        }
    }
}

@Composable
private fun AppStoreMessage(title: String, detail: String? = null) {
    Column(
        Modifier.fillMaxWidth().padding(vertical = 70.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Icon(Icons.Outlined.GridView, contentDescription = null,
            tint = MaterialTheme.colorScheme.primary, modifier = Modifier.size(30.dp))
        Text(title, fontSize = 15.sp, fontWeight = FontWeight.SemiBold,
            color = MaterialTheme.colorScheme.onSurface)
        if (detail != null) Text(detail, fontSize = 12.sp,
            color = MaterialTheme.colorScheme.onSurfaceVariant)
    }
}

private suspend fun downloadStoreAppArchive(
    context: Context,
    app: StoreApp,
    onProgress: (Float) -> Unit
): File = withContext(Dispatchers.IO) {
    val destination = File(context.cacheDir, "plum-app-${app.id}.zip")
    try {
        val bytes = if (app.archiveParts.isNotEmpty()) {
            val encoded = ByteArrayOutputStream()
            app.archiveParts.forEachIndexed { index, partUrl ->
                val connection = (URL(partUrl).openConnection() as HttpURLConnection).apply {
                    connectTimeout = 12_000
                    readTimeout = 20_000
                    setRequestProperty("User-Agent", "Plum-Watch-Android")
                }
                try {
                    if (connection.responseCode !in 200..299) {
                        throw IllegalStateException("Could not download app package (HTTP ${connection.responseCode}).")
                    }
                    connection.inputStream.use { it.copyTo(encoded) }
                } finally {
                    connection.disconnect()
                }
                withContext(Dispatchers.Main.immediate) {
                    onProgress((index + 1f) / app.archiveParts.size * 0.45f)
                }
            }
            Base64.getDecoder().decode(encoded.toByteArray().toString(Charsets.US_ASCII))
        } else {
            val url = app.archiveUrl ?: throw IllegalStateException("App package URL is missing.")
            val connection = (URL(url).openConnection() as HttpURLConnection).apply {
                connectTimeout = 12_000
                readTimeout = 25_000
                setRequestProperty("User-Agent", "Plum-Watch-Android")
                setRequestProperty("Accept-Encoding", "identity")
            }
            try {
                if (connection.responseCode !in 200..299) {
                    throw IllegalStateException("Could not download app package (HTTP ${connection.responseCode}).")
                }
                connection.inputStream.use { input ->
                    val output = ByteArrayOutputStream()
                    val buffer = ByteArray(16 * 1024)
                    while (true) {
                        val count = input.read(buffer)
                        if (count < 0) break
                        output.write(buffer, 0, count)
                        val total = app.archiveSizeBytes ?: connection.contentLengthLong
                        if (total > 0L) {
                            withContext(Dispatchers.Main.immediate) {
                                onProgress((output.size().toDouble() / total).toFloat().coerceIn(0f, 0.45f))
                            }
                        }
                    }
                    output.toByteArray()
                }
            } finally {
                connection.disconnect()
            }
        }
        if (bytes.size < 4 || bytes[0] != 0x50.toByte() || bytes[1] != 0x4B.toByte()) {
            throw IllegalStateException("The app package is not a valid ZIP archive.")
        }
        destination.writeBytes(bytes)
        ZipFile(destination).use { zip ->
            if (zip.entries().asSequence().none()) throw IllegalStateException("The app package is empty.")
        }
        withContext(Dispatchers.Main.immediate) { onProgress(1f) }
        destination
    } catch (exception: Exception) {
        destination.delete()
        throw exception
    }
}
