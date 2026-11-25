package me.doruk.plumwatch.watch

import android.content.Context
import java.io.BufferedWriter
import java.io.File
import java.io.FileWriter
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

/** Temporary, opt-in BLE diagnostic capture for watch transfer investigation. */
object WatchDiagnosticLog {
    private val lock = Any()
    private var writer: BufferedWriter? = null
    private var outputFile: File? = null
    @Volatile var isCapturing: Boolean = false
        private set

    fun start(context: Context, watchAddress: String?): File = synchronized(lock) {
        stopLocked()
        val directory = File(context.getExternalFilesDir(null) ?: context.filesDir, "diagnostics")
        directory.mkdirs()
        val file = File(directory, "watch-${System.currentTimeMillis()}.log")
        writer = BufferedWriter(FileWriter(file, false))
        outputFile = file
        isCapturing = true
        writeLocked("CAPTURE", "started; watch=${watchAddress ?: "unknown"}")
        file
    }

    fun record(event: String, details: String) = synchronized(lock) {
        if (!isCapturing) return
        writeLocked(event, details)
    }

    fun stop(): File? = synchronized(lock) { stopLocked() }

    private fun stopLocked(): File? {
        if (isCapturing) writeLocked("CAPTURE", "stopped")
        isCapturing = false
        runCatching { writer?.flush(); writer?.close() }
        writer = null
        return outputFile
    }

    private fun writeLocked(event: String, details: String) {
        val timestamp = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.US).format(Date())
        runCatching {
            writer?.apply {
                write("$timestamp [$event] $details")
                newLine()
                flush()
            }
        }
    }

    fun hex(bytes: ByteArray, maxBytes: Int = 2048): String {
        val shown = bytes.take(maxBytes).joinToString("") { "%02X".format(it) }
        return if (bytes.size > maxBytes) "$shown…(+${bytes.size - maxBytes} bytes)" else shown
    }
}
