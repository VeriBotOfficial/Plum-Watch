package io.agora.rtc2;

import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public interface IAudioEncodedFrameObserver {
    void onMixedAudioEncodedFrame(ByteBuffer buffer, int samplesPerChannel, int channels, int samplesPerSec, int codecType);

    void onPlaybackAudioEncodedFrame(ByteBuffer buffer, int samplesPerChannel, int channels, int samplesPerSec, int codecType);

    void onRecordAudioEncodedFrame(ByteBuffer buffer, int samplesPerChannel, int channels, int samplesPerSec, int codecType);
}
