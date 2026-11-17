package me.doruk.plumwatch.ui

import android.app.DownloadManager
import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import android.os.Environment
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Download
import androidx.compose.material.icons.outlined.Image
import androidx.compose.material.icons.outlined.Refresh
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
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

@Composable
fun WatchfacesScreen() {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    var result by remember { mutableStateOf<WatchfaceLibraryResult?>(null) }
    var loading by remember { mutableStateOf(false) }

    suspend fun refreshLibrary() {
        loading = true
        result = WatchfaceRepository.load()
        loading = false
    }

    LaunchedEffect(Unit) {
        refreshLibrary()
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .statusBarsPadding()
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 22.dp)
            .padding(top = 27.dp, bottom = 126.dp),
        verticalArrangement = Arrangement.spacedBy(18.dp)
    ) {
        PageTitle("Watchfaces")

        when {
            loading && result == null -> Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(220.dp),
                contentAlignment = Alignment.Center
            ) {
                PlumProgressLabel(label = "Loading watchfaces")
            }

            result is WatchfaceLibraryResult.PrivateOrUnavailable -> {
                WatchfaceInfoState(
                    title = "Repository is private",
                    action = "Refresh",
                    onAction = { scope.launch { refreshLibrary() } }
                )
            }

            result is WatchfaceLibraryResult.Failed -> {
                WatchfaceInfoState(
                    title = "Couldn't load watchfaces",
                    detail = (result as WatchfaceLibraryResult.Failed).message,
                    action = "Retry",
                    onAction = { scope.launch { refreshLibrary() } }
                )
            }

            result is WatchfaceLibraryResult.Available -> {
                val watchfaces = (result as WatchfaceLibraryResult.Available).watchfaces
                if (watchfaces.isEmpty()) {
                    WatchfaceInfoState(title = "No watchfaces yet")
                } else {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.End,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        TextButton(
                            onClick = { scope.launch { refreshLibrary() } },
                            enabled = !loading
                        ) {
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

                    watchfaces.forEach { watchface ->
                        WatchfaceCard(
                            watchface = watchface,
                            onDownload = { downloadWatchface(context, watchface) }
                        )
                    }
                }
            }
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
        shape = RoundedCornerShape(28.dp),
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

@Composable
private fun WatchfaceCard(
    watchface: Watchface,
    onDownload: () -> Unit
) {
    AppSurface(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(27.dp),
    ) {
        Column {
            WatchfacePreview(
                url = watchface.previewUrl,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(220.dp)
                    .clip(RoundedCornerShape(topStart = 27.dp, topEnd = 27.dp))
            )

            Row(
                modifier = Modifier.padding(horizontal = 17.dp, vertical = 15.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = watchface.name,
                    modifier = Modifier.weight(1f),
                    color = MaterialTheme.colorScheme.onSurface,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold
                )

                PlumActionButton(
                    label = "Download",
                    icon = Icons.Outlined.Download,
                    onClick = onDownload
                )
            }
        }
    }
}

@Composable
private fun WatchfacePreview(
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

    if (bitmap != null) {
        Image(
            bitmap = bitmap!!.asImageBitmap(),
            contentDescription = "Watchface preview",
            modifier = modifier,
            contentScale = ContentScale.Crop
        )
    } else {
        Box(
            modifier = modifier.background(MaterialTheme.colorScheme.surfaceVariant),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = Icons.Outlined.Image,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }
    }
}

private fun downloadWatchface(context: Context, watchface: Watchface) {
    try {
        val safeName = watchface.id.replace(Regex("[^A-Za-z0-9_-]"), "_")
        val request = DownloadManager.Request(Uri.parse(watchface.archiveUrl))
            .setTitle("${watchface.name}.zip")
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
