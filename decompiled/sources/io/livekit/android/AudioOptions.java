package io.livekit.android;

import io.livekit.android.audio.AudioHandler;
import io.livekit.android.audio.AudioProcessorOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.org.webrtc.audio.AudioDeviceModule;
import livekit.org.webrtc.audio.JavaAudioDeviceModule;

/* compiled from: LiveKitOverrides.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001Bf\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012%\b\u0002\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR.\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lio/livekit/android/AudioOptions;", "", "audioOutputType", "Lio/livekit/android/AudioType;", "audioHandler", "Lio/livekit/android/audio/AudioHandler;", "audioDeviceModule", "Llivekit/org/webrtc/audio/AudioDeviceModule;", "javaAudioDeviceModuleCustomizer", "Lkotlin/Function1;", "Llivekit/org/webrtc/audio/JavaAudioDeviceModule$Builder;", "Lkotlin/ParameterName;", "name", "builder", "", "disableCommunicationModeWorkaround", "", "audioProcessorOptions", "Lio/livekit/android/audio/AudioProcessorOptions;", "(Lio/livekit/android/AudioType;Lio/livekit/android/audio/AudioHandler;Llivekit/org/webrtc/audio/AudioDeviceModule;Lkotlin/jvm/functions/Function1;ZLio/livekit/android/audio/AudioProcessorOptions;)V", "getAudioDeviceModule", "()Llivekit/org/webrtc/audio/AudioDeviceModule;", "getAudioHandler", "()Lio/livekit/android/audio/AudioHandler;", "getAudioOutputType", "()Lio/livekit/android/AudioType;", "getAudioProcessorOptions", "()Lio/livekit/android/audio/AudioProcessorOptions;", "getDisableCommunicationModeWorkaround", "()Z", "getJavaAudioDeviceModuleCustomizer", "()Lkotlin/jvm/functions/Function1;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AudioOptions {
    private final AudioDeviceModule audioDeviceModule;
    private final AudioHandler audioHandler;
    private final AudioType audioOutputType;
    private final AudioProcessorOptions audioProcessorOptions;
    private final boolean disableCommunicationModeWorkaround;
    private final Function1<JavaAudioDeviceModule.Builder, Unit> javaAudioDeviceModuleCustomizer;

    public AudioOptions() {
        this(null, null, null, null, false, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AudioOptions(AudioType audioType, AudioHandler audioHandler, AudioDeviceModule audioDeviceModule, Function1<? super JavaAudioDeviceModule.Builder, Unit> function1, boolean z, AudioProcessorOptions audioProcessorOptions) {
        this.audioOutputType = audioType;
        this.audioHandler = audioHandler;
        this.audioDeviceModule = audioDeviceModule;
        this.javaAudioDeviceModuleCustomizer = function1;
        this.disableCommunicationModeWorkaround = z;
        this.audioProcessorOptions = audioProcessorOptions;
    }

    public /* synthetic */ AudioOptions(AudioType audioType, AudioHandler audioHandler, AudioDeviceModule audioDeviceModule, Function1 function1, boolean z, AudioProcessorOptions audioProcessorOptions, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : audioType, (i & 2) != 0 ? null : audioHandler, (i & 4) != 0 ? null : audioDeviceModule, (i & 8) != 0 ? null : function1, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : audioProcessorOptions);
    }

    public final AudioType getAudioOutputType() {
        return this.audioOutputType;
    }

    public final AudioHandler getAudioHandler() {
        return this.audioHandler;
    }

    public final AudioDeviceModule getAudioDeviceModule() {
        return this.audioDeviceModule;
    }

    public final Function1<JavaAudioDeviceModule.Builder, Unit> getJavaAudioDeviceModuleCustomizer() {
        return this.javaAudioDeviceModuleCustomizer;
    }

    public final boolean getDisableCommunicationModeWorkaround() {
        return this.disableCommunicationModeWorkaround;
    }

    public final AudioProcessorOptions getAudioProcessorOptions() {
        return this.audioProcessorOptions;
    }
}
