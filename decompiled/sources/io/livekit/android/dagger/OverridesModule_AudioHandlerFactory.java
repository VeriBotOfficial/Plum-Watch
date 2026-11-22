package io.livekit.android.dagger;

import dagger.internal.Factory;
import io.livekit.android.audio.AudioHandler;

/* loaded from: classes6.dex */
public final class OverridesModule_AudioHandlerFactory implements Factory<AudioHandler> {
    private final OverridesModule module;

    public OverridesModule_AudioHandlerFactory(OverridesModule overridesModule) {
        this.module = overridesModule;
    }

    @Override // javax.inject.Provider
    public AudioHandler get() {
        return audioHandler(this.module);
    }

    public static OverridesModule_AudioHandlerFactory create(OverridesModule overridesModule) {
        return new OverridesModule_AudioHandlerFactory(overridesModule);
    }

    public static AudioHandler audioHandler(OverridesModule overridesModule) {
        return overridesModule.audioHandler();
    }
}
