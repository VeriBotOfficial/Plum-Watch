package io.agora.rtc2.video;

/* loaded from: classes6.dex */
public class AgoraMetadata {
    public String channelId;
    public byte[] data;
    public long timeStampMs;
    public int uid;

    public AgoraMetadata() {
        this.channelId = null;
        this.uid = 0;
        this.data = null;
        this.timeStampMs = 0L;
    }

    public AgoraMetadata(String channelId, int uid, byte[] data, long timeStampMs) {
        this.channelId = channelId;
        this.uid = uid;
        this.data = data;
        this.timeStampMs = timeStampMs;
    }
}
