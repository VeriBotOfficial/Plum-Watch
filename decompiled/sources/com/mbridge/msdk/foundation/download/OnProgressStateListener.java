package com.mbridge.msdk.foundation.download;

/* loaded from: classes17.dex */
public interface OnProgressStateListener<T> {
    void onProgress(DownloadMessage<T> downloadMessage, DownloadProgress downloadProgress);
}
