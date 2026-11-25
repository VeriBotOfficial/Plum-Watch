package me.doruk.plumwatch.watch

import android.app.Application
import android.content.Context
import android.os.Handler
import android.os.Looper
import com.sifli.siflicore.error.SFError
import com.sifli.sifliotasdk.manager.ISFOtaV3ManagerCallback
import com.sifli.sifliotasdk.manager.SFOtaV3Manager
import com.sifli.sifliotasdk.manager.SFTransmissionMode
import com.sifli.sifliotasdk.modules.sol2.usermodel.OtaV3DfuFileType
import com.sifli.sifliotasdk.modules.sol2.usermodel.OtaV3ResourceFileInfo
import kotlinx.coroutines.suspendCancellableCoroutine
import java.io.File
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException

object SifliAppInstaller {
    suspend fun install(
        context: Context,
        macAddress: String,
        archive: File,
        otaType: Int,
        onTransferProgress: (Float) -> Unit
    ) {
        require(macAddress.isNotBlank()) { "Connect your watch before installing an app." }
        require(archive.isFile && archive.length() > 0L) { "The app package is missing or empty." }
        require(otaType == 5 || otaType == 12) {
            "This package type is not a standalone installable app."
        }

        val application = context.applicationContext as? Application
            ?: throw IllegalStateException("Could not initialize the SiFli installer.")

        suspendCancellableCoroutine<Unit> { continuation ->
            val manager = SFOtaV3Manager.getInstance()
            val mainHandler = Handler(Looper.getMainLooper())
            val callback = object : ISFOtaV3ManagerCallback {
                override fun onManagerStatusChanged(status: Int) = Unit

                override fun onProgress(currentBytes: Long, totalBytes: Long) {
                    val progress = if (totalBytes > 0L) {
                        (currentBytes.toDouble() / totalBytes.toDouble()).toFloat().coerceIn(0f, 1f)
                    } else 0f
                    mainHandler.post {
                        if (continuation.isActive) onTransferProgress(progress)
                    }
                }

                override fun onComplete(success: Boolean, error: SFError?) {
                    if (continuation.isActive) {
                        if (success) {
                            continuation.resume(Unit)
                        } else {
                            continuation.resumeWithException(
                                IllegalStateException(
                                    error?.toString()?.takeIf { it.isNotBlank() }
                                        ?: "The watch rejected the app installation."
                                )
                            )
                        }
                    }
                    manager.stop()
                }
            }

            try {
                manager.setCallback(callback)
                manager.init(application, SFTransmissionMode.TRANSMISSION_MODE_BLE)
                val resource = OtaV3ResourceFileInfo(
                    OtaV3DfuFileType.ZIP_RESOURCE,
                    archive.absolutePath,
                    otaType == 5
                )
                manager.startOtaV3(macAddress, otaType, resource, false)
            } catch (exception: Exception) {
                manager.stop()
                if (continuation.isActive) continuation.resumeWithException(exception)
            }

            continuation.invokeOnCancellation {
                manager.userCancel()
                manager.stop()
            }
        }
    }
}
