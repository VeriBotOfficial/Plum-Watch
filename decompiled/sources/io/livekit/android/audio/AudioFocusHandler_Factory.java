package io.livekit.android.audio;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes6.dex */
public final class AudioFocusHandler_Factory implements Factory<AudioFocusHandler> {
    private final Provider<Context> contextProvider;

    public AudioFocusHandler_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider
    public AudioFocusHandler get() {
        return newInstance(this.contextProvider.get());
    }

    public static AudioFocusHandler_Factory create(Provider<Context> provider) {
        return new AudioFocusHandler_Factory(provider);
    }

    public static AudioFocusHandler newInstance(Context context) {
        return new AudioFocusHandler(context);
    }
}
