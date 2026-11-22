package io.livekit.android.dagger;

import android.net.ConnectivityManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import io.livekit.android.room.network.NetworkCallbackRegistry;
import javax.inject.Provider;

/* loaded from: classes6.dex */
public final class WebModule_NetworkCallbackRegistrarFactory implements Factory<NetworkCallbackRegistry> {
    private final Provider<ConnectivityManager> connectivityManagerProvider;

    public WebModule_NetworkCallbackRegistrarFactory(Provider<ConnectivityManager> provider) {
        this.connectivityManagerProvider = provider;
    }

    @Override // javax.inject.Provider
    public NetworkCallbackRegistry get() {
        return networkCallbackRegistrar(this.connectivityManagerProvider.get());
    }

    public static WebModule_NetworkCallbackRegistrarFactory create(Provider<ConnectivityManager> provider) {
        return new WebModule_NetworkCallbackRegistrarFactory(provider);
    }

    public static NetworkCallbackRegistry networkCallbackRegistrar(ConnectivityManager connectivityManager) {
        return (NetworkCallbackRegistry) Preconditions.checkNotNullFromProvides(WebModule.INSTANCE.networkCallbackRegistrar(connectivityManager));
    }
}
