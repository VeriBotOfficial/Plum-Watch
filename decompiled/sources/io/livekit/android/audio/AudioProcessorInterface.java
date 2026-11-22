package io.livekit.android.audio;

import com.iflytek.cloud.SpeechEvent;
import java.nio.ByteBuffer;
import kotlin.Metadata;

/* compiled from: AudioProcessorInterface.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&J\b\u0010\t\u001a\u00020\nH&J \u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0007H&¨\u0006\u0012"}, d2 = {"Lio/livekit/android/audio/AudioProcessorInterface;", "", "getName", "", "initializeAudioProcessing", "", "sampleRateHz", "", "numChannels", "isEnabled", "", "processAudio", "numBands", "numFrames", SpeechEvent.KEY_EVENT_TTS_BUFFER, "Ljava/nio/ByteBuffer;", "resetAudioProcessing", "newRate", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AudioProcessorInterface {
    String getName();

    void initializeAudioProcessing(int sampleRateHz, int numChannels);

    boolean isEnabled();

    void processAudio(int numBands, int numFrames, ByteBuffer buffer);

    void resetAudioProcessing(int newRate);
}
