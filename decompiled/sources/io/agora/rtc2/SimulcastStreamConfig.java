package io.agora.rtc2;

import io.agora.rtc2.video.VideoEncoderConfiguration;

/* loaded from: classes6.dex */
public class SimulcastStreamConfig {
    public int bitrate;
    public VideoEncoderConfiguration.VideoDimensions dimensions;
    public int framerate;

    public SimulcastStreamConfig() {
        this.dimensions = new VideoEncoderConfiguration.VideoDimensions(-1, -1);
        this.bitrate = -1;
        this.framerate = 5;
    }

    public SimulcastStreamConfig(VideoEncoderConfiguration.VideoDimensions dimensions, int bitrate, int framerate) {
        this.dimensions = dimensions;
        this.bitrate = bitrate;
        this.framerate = framerate;
    }

    public int getBitrate() {
        return this.bitrate;
    }

    public int getDimensionsHeight() {
        return this.dimensions.height;
    }

    public int getDimensionsWidth() {
        return this.dimensions.width;
    }

    public int getFramerate() {
        return this.framerate;
    }
}
