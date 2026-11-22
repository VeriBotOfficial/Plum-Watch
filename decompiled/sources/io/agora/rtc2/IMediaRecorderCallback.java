package io.agora.rtc2;

/* loaded from: classes6.dex */
public interface IMediaRecorderCallback {
    void onRecorderInfoUpdated(String channelId, int uid, RecorderInfo info);

    void onRecorderStateChanged(String channelId, int uid, int state, int reason);
}
