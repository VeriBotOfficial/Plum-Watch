package io.agora.rtc2.video;

/* loaded from: classes6.dex */
public class VideoSubscriptionOptions {
    private Boolean encodedFrameOnly;
    private REMOTE_VIDEO_STREAM_TYPE streamType;

    public enum REMOTE_VIDEO_STREAM_TYPE {
        REMOTE_VIDEO_STREAM_HIGH,
        REMOTE_VIDEO_STREAM_LOW
    }

    public VideoSubscriptionOptions() {
    }

    public VideoSubscriptionOptions(REMOTE_VIDEO_STREAM_TYPE streamType, boolean encodedFrameOnly) {
        this.encodedFrameOnly = Boolean.valueOf(encodedFrameOnly);
        this.streamType = streamType;
    }

    public int getStreamType() {
        return this.streamType.ordinal();
    }

    public boolean isEncodedFrameOnly() {
        return this.encodedFrameOnly.booleanValue();
    }

    public void setEncodedFrameOnly(boolean encodedFrameOnly) {
        this.encodedFrameOnly = Boolean.valueOf(encodedFrameOnly);
    }

    public void setStreamType(REMOTE_VIDEO_STREAM_TYPE streamType) {
        this.streamType = streamType;
    }
}
