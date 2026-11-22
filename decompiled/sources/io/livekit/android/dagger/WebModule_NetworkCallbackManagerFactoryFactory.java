package io.livekit.android.dagger;

import android.net.ConnectivityManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import io.livekit.android.memory.CloseableManager;
import io.livekit.android.room.network.NetworkCallbackManager;
import io.livekit.android.room.network.NetworkCallbackRegistry;
import javax.inject.Provider;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class WebModule_NetworkCallbackManagerFactoryFactory implements Factory<Function1<ConnectivityManager.NetworkCallback, NetworkCallbackManager>> {
    private final Provider<CloseableManager> closeableManagerProvider;
    private final Provider<NetworkCallbackRegistry> registrarProvider;

    public WebModule_NetworkCallbackManagerFactoryFactory(Provider<CloseableManager> provider, Provider<NetworkCallbackRegistry> provider2) {
        this.closeableManagerProvider = provider;
        this.registrarProvider = provider2;
    }

    @Override // javax.inject.Provider
    public Function1<ConnectivityManager.NetworkCallback, NetworkCallbackManager> get() {
        return networkCallbackManagerFactory(this.closeableManagerProvider.get(), this.registrarProvider.get());
    }

    public static WebModule_NetworkCallbackManagerFactoryFactory create(Provider<CloseableManager> provider, Provider<NetworkCallbackRegistry> provider2) {
        return new WebModule_NetworkCallbackManagerFactoryFactory(provider, provider2);
    }

    public static Function1<ConnectivityManager.NetworkCallback, NetworkCallbackManager> networkCallbackManagerFactory(CloseableManager closeableManager, NetworkCallbackRegistry networkCallbackRegistry) {
        return (Function1) Preconditions.checkNotNullFromProvides(WebModule.INSTANCE.networkCallbackManagerFactory(closeableManager, networkCallbackRegistry));
    }
}
