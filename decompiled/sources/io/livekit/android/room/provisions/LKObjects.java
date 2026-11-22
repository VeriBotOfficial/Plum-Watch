package io.livekit.android.room.provisions;

import javax.inject.Inject;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import livekit.org.webrtc.EglBase;
import livekit.org.webrtc.audio.AudioDeviceModule;

/* compiled from: LKObjects.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B#\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lio/livekit/android/room/provisions/LKObjects;", "", "eglBaseProvider", "Ljavax/inject/Provider;", "Llivekit/org/webrtc/EglBase;", "audioDeviceModuleProvider", "Llivekit/org/webrtc/audio/AudioDeviceModule;", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "audioDeviceModule", "getAudioDeviceModule", "()Llivekit/org/webrtc/audio/AudioDeviceModule;", "eglBase", "getEglBase", "()Llivekit/org/webrtc/EglBase;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LKObjects {
    private final Provider<AudioDeviceModule> audioDeviceModuleProvider;
    private final Provider<EglBase> eglBaseProvider;

    @Inject
    public LKObjects(Provider<EglBase> eglBaseProvider, Provider<AudioDeviceModule> audioDeviceModuleProvider) {
        Intrinsics.checkNotNullParameter(eglBaseProvider, "eglBaseProvider");
        Intrinsics.checkNotNullParameter(audioDeviceModuleProvider, "audioDeviceModuleProvider");
        this.eglBaseProvider = eglBaseProvider;
        this.audioDeviceModuleProvider = audioDeviceModuleProvider;
    }

    public final EglBase getEglBase() {
        EglBase eglBase = this.eglBaseProvider.get();
        Intrinsics.checkNotNullExpressionValue(eglBase, "get(...)");
        return eglBase;
    }

    public final AudioDeviceModule getAudioDeviceModule() {
        AudioDeviceModule audioDeviceModule = this.audioDeviceModuleProvider.get();
        Intrinsics.checkNotNullExpressionValue(audioDeviceModule, "get(...)");
        return audioDeviceModule;
    }
}
