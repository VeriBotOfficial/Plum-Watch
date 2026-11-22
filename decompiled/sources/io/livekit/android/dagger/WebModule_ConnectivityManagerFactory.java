package io.livekit.android.dagger;

import android.content.Context;
import android.net.ConnectivityManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* loaded from: classes6.dex */
public final class WebModule_ConnectivityManagerFactory implements Factory<ConnectivityManager> {
    private final Provider<Context> contextProvider;

    public WebModule_ConnectivityManagerFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider
    public ConnectivityManager get() {
        return connectivityManager(this.contextProvider.get());
    }

    public static WebModule_ConnectivityManagerFactory create(Provider<Context> provider) {
        return new WebModule_ConnectivityManagerFactory(provider);
    }

    public static ConnectivityManager connectivityManager(Context context) {
        return (ConnectivityManager) Preconditions.checkNotNullFromProvides(WebModule.INSTANCE.connectivityManager(context));
    }
}
