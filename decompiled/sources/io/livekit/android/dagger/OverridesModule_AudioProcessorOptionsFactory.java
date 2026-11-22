package io.livekit.android.dagger;

import dagger.internal.Factory;
import io.livekit.android.audio.AudioProcessorOptions;

/* loaded from: classes6.dex */
public final class OverridesModule_AudioProcessorOptionsFactory implements Factory<AudioProcessorOptions> {
    private final OverridesModule module;

    public OverridesModule_AudioProcessorOptionsFactory(OverridesModule overridesModule) {
        this.module = overridesModule;
    }

    @Override // javax.inject.Provider
    public AudioProcessorOptions get() {
        return audioProcessorOptions(this.module);
    }

    public static OverridesModule_AudioProcessorOptionsFactory create(OverridesModule overridesModule) {
        return new OverridesModule_AudioProcessorOptionsFactory(overridesModule);
    }

    public static AudioProcessorOptions audioProcessorOptions(OverridesModule overridesModule) {
        return overridesModule.audioProcessorOptions();
    }
}
