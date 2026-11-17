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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Download
import androidx.compose.material.icons.outlined.Image
import androidx.compose.material.icons.outlined.Refresh
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
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
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 23.dp)
            .padding(top = 32.dp, bottom = 122.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        PageHeader(
            eyebrow = "PERSONALISE YOUR WATCH",
            title = "Watchfaces",
            subtitle = "A small collection of watchfaces, ready to install."
        )

        when {
            loading -> Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(260.dp),
                contentAlignment = Alignment.Center
            ) {
                CircularProgressIndicator(color = MaterialTheme.colorScheme.primary)
            }

            result is WatchfaceLibraryResult.PrivateOrUnavailable -> {
                WatchfaceInfoState(
                    title = "Library not public yet",
                    description = "Plum-Watch is currently a private GitHub repository. The app does not contain a personal access token, so it cannot read private files. The catalogue will load when the watchface files are served from a public source.",
                    action = "Try again",
                    onAction = { scope.launch { refreshLibrary() } }
                )
            }

            result is WatchfaceLibraryResult.Failed -> {
                val message = (result as WatchfaceLibraryResult.Failed).message
                WatchfaceInfoState(
                    title = "Couldn't load the library",
                    description = message,
                    action = "Refresh",
                    onAction = { scope.launch { refreshLibrary() } }
                )
            }

            result is WatchfaceLibraryResult.Available -> {
                val watchfaces = (result as WatchfaceLibraryResult.Available).watchfaces
                if (watchfaces.isEmpty()) {
                    WatchfaceInfoState(
                        title = "No watchfaces yet",
                        description = "New designs will appear here automatically. Add a folder inside watchfaces/ with a ZIP file and a preview image.",
                        action = "Check again",
                        onAction = { scope.launch { refreshLibrary() } }
                    )
                } else {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "${watchfaces.size} WATCHFACES",
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            fontSize = 11.sp,
                            fontWeight = FontWeight.SemiBold,
                            letterSpacing = 1.5.sp
                        )
                        OutlinedButton(
                            onClick = { scope.launch { refreshLibrary() } },
                            shape = RoundedCornerShape(16.dp)
                        ) {
                            Icon(Icons.Outlined.Refresh, contentDescription = null)
                            Text("Refresh", modifier = Modifier.padding(start = 6.dp))
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

            else -> Unit
        }
    }
}

@Composable
private fun WatchfaceInfoState(
    title: String,
    description: String,
    action: String,
    onAction: () -> Unit
) {
    Surface(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(30.dp),
        color = MaterialTheme.colorScheme.surface
    ) {
        Column(
            modifier = Modifier.padding(horizontal = 24.dp, vertical = 30.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(14.dp)
        ) {
            Box(
                modifier = Modifier
                    .height(74.dp)
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Surface(
                    shape = RoundedCornerShape(24.dp),
                    color = MaterialTheme.colorScheme.surfaceVariant
                ) {
                    Icon(
                        imageVector = Icons.Outlined.Image,
                        contentDescription = null,
                        modifier = Modifier.padding(20.dp),
                        tint = MaterialTheme.colorScheme.primary
                    )
                }
            }

            Text(
                text = title,
                color = MaterialTheme.colorScheme.onSurface,
                fontSize = 21.sp,
                fontWeight = FontWeight.SemiBold
            )
            Text(
                text = description,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                fontSize = 14.sp,
                lineHeight = 21.sp
            )
            Button(
                onClick = onAction,
                shape = RoundedCornerShape(17.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = MaterialTheme.colorScheme.onPrimary
                )
            ) {
                Text(action)
            }
        }
    }
}

@Composable
private fun WatchfaceCard(
    watchface: Watchface,
    onDownload: () -> Unit
) {
    Surface(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(27.dp),
        color = MaterialTheme.colorScheme.surface
    ) {
        Column {
            WatchfacePreview(
                url = watchface.previewUrl,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(220.dp)
            )

            Row(
                modifier = Modifier.padding(horizontal = 17.dp, vertical = 17.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    modifier = Modifier.weight(1f),
                    verticalArrangement = Arrangement.spacedBy(5.dp)
                ) {
                    Text(
                        text = watchface.name,
                        color = MaterialTheme.colorScheme.onSurface,
                        fontSize = 17.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                    Text(
                        text = "WATCHFACE ARCHIVE · ZIP",
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        fontSize = 9.sp,
                        letterSpacing = 1.1.sp,
                        fontWeight = FontWeight.Medium
                    )
                }

                Button(
                    onClick = onDownload,
                    shape = RoundedCornerShape(16.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = MaterialTheme.colorScheme.primary,
                        contentColor = MaterialTheme.colorScheme.onPrimary
                    )
                ) {
                    Icon(Icons.Outlined.Download, contentDescription = null)
                    Text("Download", modifier = Modifier.padding(start = 6.dp))
                }
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
                connection.inputStream.use { BitmapFactory.decodeStream(it) }
                    .also { connection.disconnect() }
            }.getOrNull()
        }
    }

    if (bitmap != null) {
        Image(
            bitmap = bitmap!!.asImageBitmap(),
            contentDescription = "Preview of the ${url.substringAfterLast('/')} watchface",
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
                contentDescription = "Watchface preview",
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
            .setDescription("Downloading to Downloads/Plum Watchfaces")
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
            exception.message ?: "Could not start the download.",
            Toast.LENGTH_LONG
        ).show()
    }
}
