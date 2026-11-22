package io.livekit.android.audio;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes6.dex */
public final class AudioSwitchHandler_Factory implements Factory<AudioSwitchHandler> {
    private final Provider<Context> contextProvider;

    public AudioSwitchHandler_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider
    public AudioSwitchHandler get() {
        return newInstance(this.contextProvider.get());
    }

    public static AudioSwitchHandler_Factory create(Provider<Context> provider) {
        return new AudioSwitchHandler_Factory(provider);
    }

    public static AudioSwitchHandler newInstance(Context context) {
        return new AudioSwitchHandler(context);
    }
}
