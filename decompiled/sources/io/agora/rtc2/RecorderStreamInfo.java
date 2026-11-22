package io.agora.rtc2;

/* loaded from: classes6.dex */
public class RecorderStreamInfo {
    public String channelId;
    public int recorderStreamType;
    public int uid;

    public RecorderStreamInfo() {
        this.uid = 0;
        this.channelId = null;
        this.recorderStreamType = 0;
    }

    public RecorderStreamInfo(String channelId, int uid, int recorderStreamType) {
        this.uid = uid;
        this.channelId = channelId;
        this.recorderStreamType = recorderStreamType;
    }

    public String toString() {
        return "channelId=" + this.channelId;
    }
}
