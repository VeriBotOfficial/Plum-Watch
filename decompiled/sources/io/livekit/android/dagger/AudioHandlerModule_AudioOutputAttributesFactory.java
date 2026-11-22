package io.livekit.android.dagger;

import android.media.AudioAttributes;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import io.livekit.android.AudioType;
import javax.inject.Provider;

/* loaded from: classes6.dex */
public final class AudioHandlerModule_AudioOutputAttributesFactory implements Factory<AudioAttributes> {
    private final Provider<AudioType> audioTypeProvider;

    public AudioHandlerModule_AudioOutputAttributesFactory(Provider<AudioType> provider) {
        this.audioTypeProvider = provider;
    }

    @Override // javax.inject.Provider
    public AudioAttributes get() {
        return audioOutputAttributes(this.audioTypeProvider.get());
    }

    public static AudioHandlerModule_AudioOutputAttributesFactory create(Provider<AudioType> provider) {
        return new AudioHandlerModule_AudioOutputAttributesFactory(provider);
    }

    public static AudioAttributes audioOutputAttributes(AudioType audioType) {
        return (AudioAttributes) Preconditions.checkNotNullFromProvides(AudioHandlerModule.INSTANCE.audioOutputAttributes(audioType));
    }
}
