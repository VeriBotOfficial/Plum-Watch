package io.livekit.android.dagger;

import dagger.internal.Factory;

/* loaded from: classes6.dex */
public final class OverridesModule_DisableCommunicationWorkAroundFactory implements Factory<Boolean> {
    private final OverridesModule module;

    public OverridesModule_DisableCommunicationWorkAroundFactory(OverridesModule overridesModule) {
        this.module = overridesModule;
    }

    @Override // javax.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(disableCommunicationWorkAround(this.module));
    }

    public static OverridesModule_DisableCommunicationWorkAroundFactory create(OverridesModule overridesModule) {
        return new OverridesModule_DisableCommunicationWorkAroundFactory(overridesModule);
    }

    public static boolean disableCommunicationWorkAround(OverridesModule overridesModule) {
        return overridesModule.disableCommunicationWorkAround();
    }
}
