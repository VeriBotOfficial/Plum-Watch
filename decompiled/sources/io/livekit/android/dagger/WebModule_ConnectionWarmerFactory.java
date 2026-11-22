package io.livekit.android.dagger;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import io.livekit.android.room.util.ConnectionWarmer;
import io.livekit.android.room.util.OkHttpConnectionWarmer;
import javax.inject.Provider;

/* loaded from: classes6.dex */
public final class WebModule_ConnectionWarmerFactory implements Factory<ConnectionWarmer> {
    private final Provider<OkHttpConnectionWarmer> okHttpConnectionWarmerProvider;

    public WebModule_ConnectionWarmerFactory(Provider<OkHttpConnectionWarmer> provider) {
        this.okHttpConnectionWarmerProvider = provider;
    }

    @Override // javax.inject.Provider
    public ConnectionWarmer get() {
        return connectionWarmer(this.okHttpConnectionWarmerProvider.get());
    }

    public static WebModule_ConnectionWarmerFactory create(Provider<OkHttpConnectionWarmer> provider) {
        return new WebModule_ConnectionWarmerFactory(provider);
    }

    public static ConnectionWarmer connectionWarmer(OkHttpConnectionWarmer okHttpConnectionWarmer) {
        return (ConnectionWarmer) Preconditions.checkNotNullFromProvides(WebModule.INSTANCE.connectionWarmer(okHttpConnectionWarmer));
    }
}
