package io.livekit.android.dagger;

import dagger.internal.Factory;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import livekit.org.webrtc.audio.JavaAudioDeviceModule;

/* loaded from: classes6.dex */
public final class OverridesModule_JavaAudioDeviceModuleCustomizerFactory implements Factory<Function1<JavaAudioDeviceModule.Builder, Unit>> {
    private final OverridesModule module;

    public OverridesModule_JavaAudioDeviceModuleCustomizerFactory(OverridesModule overridesModule) {
        this.module = overridesModule;
    }

    @Override // javax.inject.Provider
    public Function1<JavaAudioDeviceModule.Builder, Unit> get() {
        return javaAudioDeviceModuleCustomizer(this.module);
    }

    public static OverridesModule_JavaAudioDeviceModuleCustomizerFactory create(OverridesModule overridesModule) {
        return new OverridesModule_JavaAudioDeviceModuleCustomizerFactory(overridesModule);
    }

    public static Function1<JavaAudioDeviceModule.Builder, Unit> javaAudioDeviceModuleCustomizer(OverridesModule overridesModule) {
        return overridesModule.javaAudioDeviceModuleCustomizer();
    }
}
