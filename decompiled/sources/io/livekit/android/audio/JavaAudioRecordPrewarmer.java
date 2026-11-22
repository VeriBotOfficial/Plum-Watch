package io.livekit.android.audio;

import com.yandex.div.core.timer.TimerController;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import livekit.org.webrtc.audio.JavaAudioDeviceModule;

/* compiled from: AudioRecordPrewarmer.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lio/livekit/android/audio/JavaAudioRecordPrewarmer;", "Lio/livekit/android/audio/AudioRecordPrewarmer;", "audioDeviceModule", "Llivekit/org/webrtc/audio/JavaAudioDeviceModule;", "(Llivekit/org/webrtc/audio/JavaAudioDeviceModule;)V", "prewarm", "", TimerController.STOP_COMMAND, "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class JavaAudioRecordPrewarmer implements AudioRecordPrewarmer {
    private final JavaAudioDeviceModule audioDeviceModule;

    public JavaAudioRecordPrewarmer(JavaAudioDeviceModule audioDeviceModule) {
        Intrinsics.checkNotNullParameter(audioDeviceModule, "audioDeviceModule");
        this.audioDeviceModule = audioDeviceModule;
    }

    @Override // io.livekit.android.audio.AudioRecordPrewarmer
    public void prewarm() {
        this.audioDeviceModule.prewarmRecording();
    }

    @Override // io.livekit.android.audio.AudioRecordPrewarmer
    public void stop() {
        this.audioDeviceModule.requestStopRecording();
    }
}
