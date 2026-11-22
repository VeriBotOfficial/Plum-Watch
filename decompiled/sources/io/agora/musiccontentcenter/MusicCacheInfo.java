package io.agora.musiccontentcenter;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public class MusicCacheInfo {
    public long songCode;
    public int status;

    public MusicCacheInfo() {
    }

    public MusicCacheInfo(long songCode, int status) {
        this.songCode = songCode;
        this.status = status;
    }

    public long getSongCode() {
        return this.songCode;
    }

    public int getStatus() {
        return this.status;
    }

    public String toString() {
        return "MusicCacheInfo{songCode=" + this.songCode + ", status=" + this.status + AbstractJsonLexerKt.END_OBJ;
    }
}
