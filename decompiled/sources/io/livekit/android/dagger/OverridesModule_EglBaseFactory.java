package io.livekit.android.dagger;

import dagger.internal.Factory;
import livekit.org.webrtc.EglBase;

/* loaded from: classes6.dex */
public final class OverridesModule_EglBaseFactory implements Factory<EglBase> {
    private final OverridesModule module;

    public OverridesModule_EglBaseFactory(OverridesModule overridesModule) {
        this.module = overridesModule;
    }

    @Override // javax.inject.Provider
    public EglBase get() {
        return eglBase(this.module);
    }

    public static OverridesModule_EglBaseFactory create(OverridesModule overridesModule) {
        return new OverridesModule_EglBaseFactory(overridesModule);
    }

    public static EglBase eglBase(OverridesModule overridesModule) {
        return overridesModule.eglBase();
    }
}
