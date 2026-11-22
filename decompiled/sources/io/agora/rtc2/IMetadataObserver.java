package io.agora.rtc2;

import io.agora.rtc2.video.AgoraMetadata;

/* loaded from: classes6.dex */
public interface IMetadataObserver {
    public static final int UNKNOWN_METADATA = -1;
    public static final int VIDEO_METADATA = 0;

    int getMaxMetadataSize();

    void onMetadataReceived(AgoraMetadata metadata);

    byte[] onReadyToSendMetadata(long timeStampMs, int sourceType);
}
