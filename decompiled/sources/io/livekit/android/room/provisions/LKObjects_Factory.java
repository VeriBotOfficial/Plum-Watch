package io.livekit.android.room.provisions;

import dagger.internal.Factory;
import javax.inject.Provider;
import livekit.org.webrtc.EglBase;
import livekit.org.webrtc.audio.AudioDeviceModule;

/* loaded from: classes6.dex */
public final class LKObjects_Factory implements Factory<LKObjects> {
    private final Provider<AudioDeviceModule> audioDeviceModuleProvider;
    private final Provider<EglBase> eglBaseProvider;

    public LKObjects_Factory(Provider<EglBase> provider, Provider<AudioDeviceModule> provider2) {
        this.eglBaseProvider = provider;
        this.audioDeviceModuleProvider = provider2;
    }

    @Override // javax.inject.Provider
    public LKObjects get() {
        return newInstance(this.eglBaseProvider, this.audioDeviceModuleProvider);
    }

    public static LKObjects_Factory create(Provider<EglBase> provider, Provider<AudioDeviceModule> provider2) {
        return new LKObjects_Factory(provider, provider2);
    }

    public static LKObjects newInstance(Provider<EglBase> provider, Provider<AudioDeviceModule> provider2) {
        return new LKObjects(provider, provider2);
    }
}
