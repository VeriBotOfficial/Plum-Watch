package io.livekit.android.dagger;

import dagger.internal.Factory;
import livekit.org.webrtc.audio.AudioDeviceModule;

/* loaded from: classes6.dex */
public final class OverridesModule_AudioDeviceModuleFactory implements Factory<AudioDeviceModule> {
    private final OverridesModule module;

    public OverridesModule_AudioDeviceModuleFactory(OverridesModule overridesModule) {
        this.module = overridesModule;
    }

    @Override // javax.inject.Provider
    public AudioDeviceModule get() {
        return audioDeviceModule(this.module);
    }

    public static OverridesModule_AudioDeviceModuleFactory create(OverridesModule overridesModule) {
        return new OverridesModule_AudioDeviceModuleFactory(overridesModule);
    }

    public static AudioDeviceModule audioDeviceModule(OverridesModule overridesModule) {
        return overridesModule.audioDeviceModule();
    }
}
