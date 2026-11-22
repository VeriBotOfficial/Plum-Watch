package io.agora.mediaplayer.data;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public class PlayerPlaybackStats {
    private long videoFps = 0;
    private long videoBitrateInKbps = 0;
    private long audioBitrateInKbps = 0;
    private long totalBitrateInKbps = 0;

    public long getAudioBitrate() {
        return this.audioBitrateInKbps;
    }

    public long getTotalBitrate() {
        return this.totalBitrateInKbps;
    }

    public long getVideoBitrate() {
        return this.videoBitrateInKbps;
    }

    public long getVideoFps() {
        return this.videoFps;
    }

    public void setAudioBitrate(long audioBitrate) {
        this.audioBitrateInKbps = audioBitrate;
    }

    public void setTotalBitrate(long totalBitrate) {
        this.totalBitrateInKbps = totalBitrate;
    }

    public void setVideoBitrate(long videoBitrate) {
        this.videoBitrateInKbps = videoBitrate;
    }

    public void setVideoFps(long videoFps) {
        this.videoFps = videoFps;
    }

    public String toString() {
        return "PlayerPlaybackStats{videoFps=" + this.videoFps + ", videoBitrate=" + this.videoBitrateInKbps + ", audioBitrate=" + this.audioBitrateInKbps + ", totalBitrate=" + this.totalBitrateInKbps + AbstractJsonLexerKt.END_OBJ;
    }
}
