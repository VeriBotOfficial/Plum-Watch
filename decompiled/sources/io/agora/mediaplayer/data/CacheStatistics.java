package io.agora.mediaplayer.data;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public class CacheStatistics {
    private long fileSize = 0;
    private long cacheSize = 0;
    private long downloadSize = 0;

    public long getCacheSize() {
        return this.cacheSize;
    }

    public long getDownloadSize() {
        return this.downloadSize;
    }

    public long getFileSize() {
        return this.fileSize;
    }

    public void setCacheSize(long cacheSize) {
        this.cacheSize = cacheSize;
    }

    public void setDownloadSize(long downloadSize) {
        this.downloadSize = downloadSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

    public String toString() {
        return "CacheStatistics{fileSize=" + this.fileSize + ", cacheSize=" + this.cacheSize + ", downloadSize=" + this.downloadSize + AbstractJsonLexerKt.END_OBJ;
    }
}
