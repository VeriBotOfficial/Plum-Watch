package me.doruk.plumwatch.ui

import android.app.DownloadManager
import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import android.os.Environment
import android.widget.Toast
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
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material.icons.outlined.ChevronRight
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import me.doruk.plumwatch.data.Watchface
import me.doruk.plumwatch.data.WatchfaceLibraryResult
import me.doruk.plumwatch.data.WatchfaceRepository
import java.net.HttpURLConnection
import java.net.URL

private const val WATCHFACE_FALLBACK_ASPECT_RATIO = 0.72f

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
                onBack = { selectedWatchface = null },
                onDownload = { downloadWatchface(context, selected) }
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
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .padding(horizontal = 22.dp),
        contentPadding = PaddingValues(top = 27.dp, bottom = 126.dp),
        verticalArrangement = Arrangement.spacedBy(13.dp)
    ) {
        item {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                PageTitle("Watchfaces")
                Spacer(Modifier.weight(1f))
                TextButton(onClick = onRefresh, enabled = !loading) {
                    if (loading) {
                        PlumProgressLabel(
                            label = "Refreshing",
                            modifier = Modifier.padding(vertical = 4.dp)
                        )
                    } else {
                        Icon(Icons.Outlined.Refresh, contentDescription = null)
                        Text("Refresh", modifier = Modifier.padding(start = 5.dp))
                    }
                }
            }
        }

        when {
            loading && result == null -> item {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(220.dp),
                    contentAlignment = Alignment.Center
                ) {
                    PlumProgressLabel(label = "Loading watchfaces")
                }
            }

            result is WatchfaceLibraryResult.PrivateOrUnavailable -> item {
                WatchfaceInfoState(
                    title = "Repository is private",
                    action = "Refresh",
                    onAction = onRefresh
                )
            }

            result is WatchfaceLibraryResult.Failed -> item {
                WatchfaceInfoState(
                    title = "Couldn't load watchfaces",
                    detail = (result as WatchfaceLibraryResult.Failed).message,
                    action = "Retry",
                    onAction = onRefresh
                )
            }

            result is WatchfaceLibraryResult.Available -> {
                val watchfaces = (result as WatchfaceLibraryResult.Available).watchfaces
                if (watchfaces.isEmpty()) {
                    item {
                        WatchfaceInfoState(title = "No watchfaces yet")
                    }
                } else {
                    items(watchfaces, key = { it.id }) { watchface ->
                        WatchfaceListItem(
                            watchface = watchface,
                            onClick = { onSelect(watchface) }
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun WatchfaceListItem(
    watchface: Watchface,
    onClick: () -> Unit
) {
    AppClickableSurface(
        onClick = onClick,
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(25.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(15.dp)
        ) {
            WatchfaceArtwork(
                url = watchface.previewUrl,
                modifier = Modifier
                    .width(88.dp)
                    .border(
                        width = 3.dp,
                        color = MaterialTheme.colorScheme.outline.copy(alpha = 0.48f),
                        shape = RoundedCornerShape(23.dp)
                    )
                    .clip(RoundedCornerShape(20.dp))
                    .background(Color(0xFF08090B))
                    .padding(4.dp)
            )

            Text(
                text = watchface.name,
                modifier = Modifier.weight(1f),
                color = MaterialTheme.colorScheme.onSurface,
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )

            Icon(
                imageVector = Icons.Outlined.ChevronRight,
                contentDescription = "Preview " + watchface.name,
                tint = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.72f),
                modifier = Modifier.size(20.dp)
            )
        }
    }
}

@Composable
private fun WatchfaceDetailScreen(
    watchface: Watchface,
    onBack: () -> Unit,
    onDownload: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .padding(horizontal = 22.dp)
            .padding(top = 17.dp, bottom = 126.dp),
        verticalArrangement = Arrangement.spacedBy(18.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            AppClickableSurface(
                onClick = onBack,
                modifier = Modifier.size(42.dp),
                shape = CircleShape
            ) {
                Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Icon(
                        imageVector = Icons.Outlined.ArrowBack,
                        contentDescription = "Back to watchfaces",
                        tint = MaterialTheme.colorScheme.onSurface,
                        modifier = Modifier.size(20.dp)
                    )
                }
            }
            Text(
                text = "Watchfaces",
                modifier = Modifier.padding(start = 13.dp),
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium
            )
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            contentAlignment = Alignment.Center
        ) {
            WatchfaceArtwork(
                url = watchface.previewUrl,
                modifier = Modifier
                    .fillMaxWidth(0.78f)
                    .widthIn(max = 270.dp)
                    .border(
                        width = 5.dp,
                        color = MaterialTheme.colorScheme.outline.copy(alpha = 0.62f),
                        shape = RoundedCornerShape(43.dp)
                    )
                    .clip(RoundedCornerShape(38.dp))
                    .background(Color(0xFF050607))
                    .padding(8.dp)
            )
        }

        Column(verticalArrangement = Arrangement.spacedBy(14.dp)) {
            Text(
                text = watchface.name,
                color = MaterialTheme.colorScheme.onSurface,
                fontSize = 25.sp,
                lineHeight = 30.sp,
                fontWeight = FontWeight.SemiBold,
                letterSpacing = (-0.45).sp
            )

            PlumActionButton(
                label = "Download",
                icon = Icons.Outlined.Download,
                onClick = onDownload,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(58.dp)
            )
        }
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

    val image = bitmap
    val imageRatio = image?.let {
        (it.width.toFloat() / it.height.toFloat()).coerceIn(0.35f, 1.6f)
    } ?: WATCHFACE_FALLBACK_ASPECT_RATIO

    Box(
        modifier = modifier
            .aspectRatio(imageRatio)
            .background(Color(0xFF08090B)),
        contentAlignment = Alignment.Center
    ) {
        if (image != null) {
            Image(
                bitmap = image.asImageBitmap(),
                contentDescription = "Watchface preview",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Fit
            )
        } else {
            Icon(
                imageVector = Icons.Outlined.Image,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.8f),
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

private fun downloadWatchface(context: Context, watchface: Watchface) {
    try {
        val safeName = watchface.id.replace(Regex("[^A-Za-z0-9_-]"), "_")
        val request = DownloadManager.Request(Uri.parse(watchface.archiveUrl))
            .setTitle(watchface.name + ".zip")
            .setDescription("Downloading watchface")
            .setNotificationVisibility(
                DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED
            )
            .setDestinationInExternalPublicDir(
                Environment.DIRECTORY_DOWNLOADS,
                "Plum Watchfaces/$safeName.zip"
            )

        val manager = context.getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
        manager.enqueue(request)
        Toast.makeText(context, "Download started", Toast.LENGTH_SHORT).show()
    } catch (exception: Exception) {
        Toast.makeText(
            context,
            exception.message ?: "Could not start download",
            Toast.LENGTH_LONG
        ).show()
    }
}
