package me.doruk.plumwatch.ui.liquid

import androidx.compose.runtime.withFrameNanos

internal suspend fun awaitFrame() {
    withFrameNanos { }
}
