package io.livekit.android.dagger;

import dagger.internal.Factory;
import livekit.org.webrtc.VideoDecoderFactory;

/* loaded from: classes6.dex */
public final class OverridesModule_VideoDecoderFactoryFactory implements Factory<VideoDecoderFactory> {
    private final OverridesModule module;

    public OverridesModule_VideoDecoderFactoryFactory(OverridesModule overridesModule) {
        this.module = overridesModule;
    }

    @Override // javax.inject.Provider
    public VideoDecoderFactory get() {
        return videoDecoderFactory(this.module);
    }

    public static OverridesModule_VideoDecoderFactoryFactory create(OverridesModule overridesModule) {
        return new OverridesModule_VideoDecoderFactoryFactory(overridesModule);
    }

    public static VideoDecoderFactory videoDecoderFactory(OverridesModule overridesModule) {
        return overridesModule.videoDecoderFactory();
    }
}
