package me.doruk.plumwatch.ui

import android.Manifest
import android.content.pm.PackageManager
import androidx.activity.compose.BackHandler
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.camera.core.CameraSelector
import androidx.camera.core.ImageCapture
import androidx.camera.core.Preview
import androidx.camera.core.ImageCaptureException
import androidx.camera.lifecycle.ProcessCameraProvider
import androidx.camera.view.PreviewView
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material.icons.outlined.CameraAlt
import androidx.compose.material.icons.outlined.Cameraswitch
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat
import androidx.compose.ui.viewinterop.AndroidView
import androidx.lifecycle.compose.LocalLifecycleOwner
import me.doruk.plumwatch.watch.BleWatchManager
import java.io.File

@Composable
fun CameraScreen(
    watchManager: BleWatchManager,
    onBack: () -> Unit
) {
    BackHandler(onBack = onBack)
    val context = LocalContext.current
    val lifecycleOwner = LocalLifecycleOwner.current
    val watchState by watchManager.state.collectAsState()
    var hasCameraPermission by remember {
        mutableStateOf(
            ContextCompat.checkSelfPermission(context, Manifest.permission.CAMERA) ==
                PackageManager.PERMISSION_GRANTED
        )
    }
    var lensFacing by remember { mutableStateOf(CameraSelector.LENS_FACING_BACK) }
    var imageCapture by remember { mutableStateOf<ImageCapture?>(null) }
    var watchCameraEnabled by remember { mutableStateOf(false) }
    val cameraSessionStarted by rememberUpdatedState(watchCameraEnabled)
    var handledShutterSequence by remember { mutableStateOf(0) }
    var handledSwitchSequence by remember { mutableStateOf(0) }
    var photoIndex by remember { mutableStateOf(0) }
    var statusMessage by remember { mutableStateOf<String?>(null) }
    val previewView = remember(context) {
        PreviewView(context).apply {
            scaleType = PreviewView.ScaleType.FILL_CENTER
            implementationMode = PreviewView.ImplementationMode.COMPATIBLE
        }
    }
    val cameraProviderFuture = remember(context) {
        ProcessCameraProvider.getInstance(context)
    }
    val permissionLauncher = rememberLauncherForActivityResult(
        ActivityResultContracts.RequestPermission()
    ) { granted ->
        hasCameraPermission = granted
        if (!granted) statusMessage = "Camera permission is required for preview."
    }

    fun capturePhoto() {
        val capture = imageCapture
        if (capture == null) {
            statusMessage = "Camera is still starting."
            return
        }
        val output = File(context.cacheDir, "plum-camera-${System.currentTimeMillis()}.jpg")
        val options = ImageCapture.OutputFileOptions.Builder(output).build()
        capture.takePicture(
            options,
            ContextCompat.getMainExecutor(context),
            object : ImageCapture.OnImageSavedCallback {
                override fun onImageSaved(result: ImageCapture.OutputFileResults) {
                    photoIndex = (photoIndex + 1) and 0xFF
                    statusMessage = "Photo captured on the phone."
                }

                override fun onError(exception: ImageCaptureException) {
                    statusMessage = "The camera could not capture the photo."
                }
            }
        )
    }

    LaunchedEffect(Unit) {
        if (!hasCameraPermission) permissionLauncher.launch(Manifest.permission.CAMERA)
    }

    LaunchedEffect(hasCameraPermission) {
        if (hasCameraPermission) {
            watchCameraEnabled = watchManager.startCamera()
            statusMessage = if (watchCameraEnabled) {
                "Camera connected to the watch. Shake the watch to take a photo."
            } else {
                "Phone camera is ready, but the watch command could not be queued."
            }
        }
    }

    LaunchedEffect(hasCameraPermission, lensFacing, lifecycleOwner) {
        if (!hasCameraPermission) return@LaunchedEffect
        cameraProviderFuture.addListener({
            val provider = runCatching { cameraProviderFuture.get() }.getOrNull()
                ?: run {
                    statusMessage = "Unable to open the phone camera."
                    return@addListener
                }
            val preview = Preview.Builder().build().also {
                it.setSurfaceProvider(previewView.surfaceProvider)
            }
            val capture = ImageCapture.Builder()
                .setCaptureMode(ImageCapture.CAPTURE_MODE_MINIMIZE_LATENCY)
                .build()
            val selector = CameraSelector.Builder()
                .requireLensFacing(lensFacing)
                .build()
            runCatching {
                provider.unbindAll()
                provider.bindToLifecycle(lifecycleOwner, selector, preview, capture)
                imageCapture = capture
            }.onFailure {
                statusMessage = "The selected camera could not be started."
            }
        }, ContextCompat.getMainExecutor(context))
    }

    LaunchedEffect(watchState.cameraShutterSequence, hasCameraPermission, imageCapture) {
        if (
            hasCameraPermission &&
            imageCapture != null &&
            watchState.cameraShutterSequence > handledShutterSequence
        ) {
            val count = (watchState.cameraShutterSequence - handledShutterSequence).coerceAtMost(3)
            handledShutterSequence = watchState.cameraShutterSequence
            repeat(count) { capturePhoto() }
        }
    }

    LaunchedEffect(watchState.cameraSwitchSequence) {
        if (watchState.cameraSwitchSequence > handledSwitchSequence) {
            val count = (watchState.cameraSwitchSequence - handledSwitchSequence).coerceAtMost(3)
            handledSwitchSequence = watchState.cameraSwitchSequence
            repeat(count) {
                lensFacing = if (lensFacing == CameraSelector.LENS_FACING_BACK) {
                    CameraSelector.LENS_FACING_FRONT
                } else {
                    CameraSelector.LENS_FACING_BACK
                }
            }
        }
    }

    DisposableEffect(Unit) {
        onDispose {
            runCatching { cameraProviderFuture.get().unbindAll() }
            if (cameraSessionStarted) watchManager.stopCamera()
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .padding(horizontal = 22.dp)
            .padding(top = 17.dp, bottom = 126.dp),
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        TextButton(onClick = onBack) {
            Icon(Icons.Outlined.ArrowBack, contentDescription = null, modifier = Modifier.size(18.dp))
            androidx.compose.foundation.layout.Spacer(Modifier.size(6.dp))
            Text("My Watch")
        }
        Text(
            "Camera",
            color = MaterialTheme.colorScheme.onSurface,
            style = MaterialTheme.typography.headlineMedium
        )

        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .clip(RoundedCornerShape(26.dp))
        ) {
            if (hasCameraPermission) {
                AndroidView(
                    factory = { previewView },
                    modifier = Modifier.fillMaxSize()
                )
            } else {
                Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(
                            Icons.Outlined.CameraAlt,
                            contentDescription = null,
                            tint = MaterialTheme.colorScheme.onSurfaceVariant,
                            modifier = Modifier.size(34.dp)
                        )
                        Text("Camera permission is needed", color = MaterialTheme.colorScheme.onSurfaceVariant)
                    }
                }
            }
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            FilledTonalButton(
                onClick = {
                    lensFacing = if (lensFacing == CameraSelector.LENS_FACING_BACK) {
                        CameraSelector.LENS_FACING_FRONT
                    } else {
                        CameraSelector.LENS_FACING_BACK
                    }
                },
                enabled = hasCameraPermission,
                modifier = Modifier.weight(1f).height(52.dp),
                shape = RoundedCornerShape(16.dp)
            ) {
                Icon(Icons.Outlined.Cameraswitch, contentDescription = null)
                androidx.compose.foundation.layout.Spacer(Modifier.size(8.dp))
                Text("Flip")
            }
            FilledTonalButton(
                onClick = ::capturePhoto,
                enabled = hasCameraPermission,
                modifier = Modifier.weight(1f).height(52.dp),
                shape = RoundedCornerShape(16.dp)
            ) {
                Icon(Icons.Outlined.CameraAlt, contentDescription = null)
                androidx.compose.foundation.layout.Spacer(Modifier.size(8.dp))
                Text("Capture")
            }
        }
        if (statusMessage != null) {
            Text(
                statusMessage!!,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                style = MaterialTheme.typography.bodySmall
            )
        }
    }
}
