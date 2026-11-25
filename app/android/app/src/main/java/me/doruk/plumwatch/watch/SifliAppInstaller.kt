package me.doruk.plumwatch.watch

import android.content.Context
import java.io.File

object SifliAppInstaller {
    suspend fun install(
        context: Context,
        macAddress: String,
        archive: File,
        onProgress: (Float) -> Unit
    ): Nothing {
        throw IllegalStateException("App installation is unavailable until the SiFli OTA SDK can be resolved.")
    }
}
