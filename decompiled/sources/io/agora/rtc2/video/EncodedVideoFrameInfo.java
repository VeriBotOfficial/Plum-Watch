package io.agora.rtc2.video;

/* loaded from: classes6.dex */
public class EncodedVideoFrameInfo {
    public long captureTimeMs;
    public int codecType;
    public long decodeTimeMs;
    public int frameType;
    public int framesPerSecond;
    public int height;
    public int rotation;
    public int streamType;
    public int trackId;
    public int uid;
    public int width;

    public EncodedVideoFrameInfo() {
        this.uid = 0;
        this.codecType = 2;
        this.width = 0;
        this.height = 0;
        this.framesPerSecond = 0;
        this.frameType = 0;
        this.rotation = 0;
        this.trackId = 0;
        this.captureTimeMs = 0L;
        this.decodeTimeMs = 0L;
        this.streamType = 0;
    }

    public EncodedVideoFrameInfo(int codecType, int width, int height, int framesPerSecond, int frameType, int rotation, int trackId, long captureTimeMs, long decodeTimeMs, int uid, int streamType) {
        this.codecType = codecType;
        this.width = width;
        this.height = height;
        this.framesPerSecond = framesPerSecond;
        this.frameType = frameType;
        this.rotation = rotation;
        this.trackId = trackId;
        this.captureTimeMs = captureTimeMs;
        this.decodeTimeMs = decodeTimeMs;
        this.uid = uid;
        this.streamType = streamType;
    }

    public long getCaptureTimeMs() {
        return this.captureTimeMs;
    }

    public int getCodecType() {
        return this.codecType;
    }

    public long getDecodeTimeMs() {
        return this.decodeTimeMs;
    }

    public int getFrameType() {
        return this.frameType;
    }

    public int getFramesPerSecond() {
        return this.framesPerSecond;
    }

    public int getHeight() {
        return this.height;
    }

    public int getRotation() {
        return this.rotation;
    }

    public int getStreamType() {
        return this.streamType;
    }

    public int getTrackId() {
        return this.trackId;
    }

    public int getUid() {
        return this.uid;
    }

    public int getWidth() {
        return this.width;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("codecType=");
        sb.append(this.codecType);
        sb.append(" width=").append(this.width);
        sb.append(" height=").append(this.height);
        sb.append(" framesPerSecond=").append(this.framesPerSecond);
        sb.append(" frameType=").append(this.frameType);
        sb.append(" rotation=").append(this.rotation);
        sb.append(" trackId=").append(this.trackId);
        sb.append(" captureTimeMs=").append(this.captureTimeMs);
        sb.append(" decodeTimeMs=").append(this.decodeTimeMs);
        sb.append(" uid=").append(this.uid);
        sb.append(" streamType=").append(this.streamType);
        return sb.toString();
    }
}
