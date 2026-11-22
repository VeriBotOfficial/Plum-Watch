package io.livekit.android.dagger;

import dagger.internal.Factory;
import io.livekit.android.AudioType;

/* loaded from: classes6.dex */
public final class OverridesModule_AudioOutputTypeFactory implements Factory<AudioType> {
    private final OverridesModule module;

    public OverridesModule_AudioOutputTypeFactory(OverridesModule overridesModule) {
        this.module = overridesModule;
    }

    @Override // javax.inject.Provider
    public AudioType get() {
        return audioOutputType(this.module);
    }

    public static OverridesModule_AudioOutputTypeFactory create(OverridesModule overridesModule) {
        return new OverridesModule_AudioOutputTypeFactory(overridesModule);
    }

    public static AudioType audioOutputType(OverridesModule overridesModule) {
        return overridesModule.audioOutputType();
    }
}
