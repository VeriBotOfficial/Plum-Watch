package io.livekit.android.dagger;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import io.livekit.android.stats.NetworkInfo;
import javax.inject.Provider;

/* loaded from: classes6.dex */
public final class WebModule_NetworkInfoFactory implements Factory<NetworkInfo> {
    private final Provider<Context> contextProvider;

    public WebModule_NetworkInfoFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider
    public NetworkInfo get() {
        return networkInfo(this.contextProvider.get());
    }

    public static WebModule_NetworkInfoFactory create(Provider<Context> provider) {
        return new WebModule_NetworkInfoFactory(provider);
    }

    public static NetworkInfo networkInfo(Context context) {
        return (NetworkInfo) Preconditions.checkNotNullFromProvides(WebModule.INSTANCE.networkInfo(context));
    }
}
