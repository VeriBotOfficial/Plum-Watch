package io.agora.rtc2;

import io.agora.rtc2.audio.AudioParams;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public interface IAudioFrameObserver {
    AudioParams getEarMonitoringAudioParams();

    AudioParams getMixedAudioParams();

    int getObservedAudioFramePosition();

    AudioParams getPlaybackAudioParams();

    AudioParams getRecordAudioParams();

    boolean onEarMonitoringAudioFrame(int type, int samplesPerChannel, int bytesPerSample, int channels, int samplesPerSec, ByteBuffer buffer, long renderTimeMs, int avsync_type);

    boolean onMixedAudioFrame(String channelId, int type, int samplesPerChannel, int bytesPerSample, int channels, int samplesPerSec, ByteBuffer buffer, long renderTimeMs, int avsync_type);

    boolean onPlaybackAudioFrame(String channelId, int type, int samplesPerChannel, int bytesPerSample, int channels, int samplesPerSec, ByteBuffer buffer, long renderTimeMs, int avsync_type);

    boolean onPlaybackAudioFrameBeforeMixing(String channelId, int uid, int type, int samplesPerChannel, int bytesPerSample, int channels, int samplesPerSec, ByteBuffer buffer, long renderTimeMs, int avsync_type, int rtpTimestamp);

    boolean onRecordAudioFrame(String channelId, int type, int samplesPerChannel, int bytesPerSample, int channels, int samplesPerSec, ByteBuffer buffer, long renderTimeMs, int avsync_type);
}
