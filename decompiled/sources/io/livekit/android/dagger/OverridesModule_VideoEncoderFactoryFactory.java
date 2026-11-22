package io.livekit.android.dagger;

import dagger.internal.Factory;
import livekit.org.webrtc.VideoEncoderFactory;

/* loaded from: classes6.dex */
public final class OverridesModule_VideoEncoderFactoryFactory implements Factory<VideoEncoderFactory> {
    private final OverridesModule module;

    public OverridesModule_VideoEncoderFactoryFactory(OverridesModule overridesModule) {
        this.module = overridesModule;
    }

    @Override // javax.inject.Provider
    public VideoEncoderFactory get() {
        return videoEncoderFactory(this.module);
    }

    public static OverridesModule_VideoEncoderFactoryFactory create(OverridesModule overridesModule) {
        return new OverridesModule_VideoEncoderFactoryFactory(overridesModule);
    }

    public static VideoEncoderFactory videoEncoderFactory(OverridesModule overridesModule) {
        return overridesModule.videoEncoderFactory();
    }
}
