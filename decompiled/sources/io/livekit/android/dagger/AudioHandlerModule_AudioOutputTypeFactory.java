package io.livekit.android.dagger;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import io.livekit.android.AudioType;
import javax.inject.Provider;

/* loaded from: classes6.dex */
public final class AudioHandlerModule_AudioOutputTypeFactory implements Factory<AudioType> {
    private final Provider<AudioType> audioOutputOverrideProvider;

    public AudioHandlerModule_AudioOutputTypeFactory(Provider<AudioType> provider) {
        this.audioOutputOverrideProvider = provider;
    }

    @Override // javax.inject.Provider
    public AudioType get() {
        return audioOutputType(this.audioOutputOverrideProvider.get());
    }

    public static AudioHandlerModule_AudioOutputTypeFactory create(Provider<AudioType> provider) {
        return new AudioHandlerModule_AudioOutputTypeFactory(provider);
    }

    public static AudioType audioOutputType(AudioType audioType) {
        return (AudioType) Preconditions.checkNotNullFromProvides(AudioHandlerModule.INSTANCE.audioOutputType(audioType));
    }
}
