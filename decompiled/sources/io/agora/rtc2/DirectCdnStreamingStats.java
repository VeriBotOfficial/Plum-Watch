package io.agora.rtc2;

import java.util.Locale;

/* loaded from: classes6.dex */
public class DirectCdnStreamingStats {
    public int audioBitrate;
    public int fps;
    public int videoBitrate;
    public int videoHeight;
    public int videoWidth;

    public DirectCdnStreamingStats() {
        this.videoWidth = 0;
        this.videoHeight = 0;
        this.fps = 0;
        this.videoBitrate = 0;
        this.audioBitrate = 0;
    }

    public DirectCdnStreamingStats(int videoWidth, int videoHeight, int fps, int videoBitrate, int audioBitrate) {
        this.videoWidth = videoWidth;
        this.videoHeight = videoHeight;
        this.fps = fps;
        this.videoBitrate = videoBitrate;
        this.audioBitrate = audioBitrate;
    }

    public String toString() {
        return String.format(Locale.getDefault(), "videoWidth=%d videoHeight=%d fps=%d videoBitrate=%d audioBitrate=%d", Integer.valueOf(this.videoWidth), Integer.valueOf(this.videoHeight), Integer.valueOf(this.fps), Integer.valueOf(this.videoBitrate), Integer.valueOf(this.audioBitrate));
    }
}
