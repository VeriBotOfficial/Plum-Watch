package io.livekit.android.audio;

import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import livekit.org.webrtc.AudioTrackSink;
import livekit.org.webrtc.audio.JavaAudioDeviceModule;

/* compiled from: AudioRecordSamplesDispatcher.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0005J\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lio/livekit/android/audio/AudioRecordSamplesDispatcher;", "Llivekit/org/webrtc/audio/JavaAudioDeviceModule$SamplesReadyCallback;", "()V", "sinks", "", "Llivekit/org/webrtc/AudioTrackSink;", "getBytesPerSample", "", "audioFormat", "onWebRtcAudioRecordSamplesReady", "", "samples", "Llivekit/org/webrtc/audio/JavaAudioDeviceModule$AudioSamples;", "registerSink", "sink", "unregisterSink", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AudioRecordSamplesDispatcher implements JavaAudioDeviceModule.SamplesReadyCallback {
    private final Set<AudioTrackSink> sinks = new LinkedHashSet();

    public final synchronized void registerSink(AudioTrackSink sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.sinks.add(sink);
    }

    public final synchronized void unregisterSink(AudioTrackSink sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.sinks.remove(sink);
    }

    private final int getBytesPerSample(int audioFormat) {
        if (audioFormat == 0) {
            throw new IllegalArgumentException("Bad audio format " + audioFormat);
        }
        int i = 1;
        if (audioFormat != 1 && audioFormat != 2) {
            if (audioFormat != 3) {
                i = 4;
                if (audioFormat != 4) {
                    if (audioFormat != 13) {
                        throw new IllegalArgumentException("Bad audio format " + audioFormat);
                    }
                }
            }
            return i;
        }
        return 2;
    }

    @Override // livekit.org.webrtc.audio.JavaAudioDeviceModule.SamplesReadyCallback
    public synchronized void onWebRtcAudioRecordSamplesReady(JavaAudioDeviceModule.AudioSamples samples) {
        Intrinsics.checkNotNullParameter(samples, "samples");
        int bytesPerSample = getBytesPerSample(samples.getAudioFormat()) * 8;
        int sampleRate = samples.getSampleRate() / 100;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Iterator<AudioTrackSink> it = this.sinks.iterator();
        while (it.hasNext()) {
            it.next().onData(ByteBuffer.wrap(samples.getData()), bytesPerSample, samples.getSampleRate(), samples.getChannelCount(), sampleRate, elapsedRealtime);
        }
    }
}
