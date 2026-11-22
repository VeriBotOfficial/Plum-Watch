package io.agora.rtc2.video;

import io.agora.rtc2.video.VideoEncoderConfiguration;

/* loaded from: classes6.dex */
public class ImageTrackOptions {
    private int fps;
    private String imageUrl;
    private VideoEncoderConfiguration.MIRROR_MODE_TYPE mirrorMode;

    public ImageTrackOptions(String url, int fps) {
        this.imageUrl = url;
        this.fps = fps;
        this.mirrorMode = VideoEncoderConfiguration.MIRROR_MODE_TYPE.MIRROR_MODE_DISABLED;
    }

    public ImageTrackOptions(String url, int fps, VideoEncoderConfiguration.MIRROR_MODE_TYPE mirrorMode) {
        this.imageUrl = url;
        this.fps = fps;
        this.mirrorMode = mirrorMode;
    }

    public int getFps() {
        return this.fps;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public int getMirrorMode() {
        return this.mirrorMode.getValue();
    }
}
