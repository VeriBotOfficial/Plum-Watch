package livekit.org.webrtc;

import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
public interface AudioTrackSink {
    void onData(ByteBuffer audioData, int bitsPerSample, int sampleRate, int numberOfChannels, int numberOfFrames, long absoluteCaptureTimestampMs);
}
