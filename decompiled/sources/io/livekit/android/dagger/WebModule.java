package io.livekit.android.dagger;

import android.content.Context;
import android.net.ConnectivityManager;
import dagger.Module;
import dagger.Provides;
import dagger.Reusable;
import io.livekit.android.memory.CloseableManager;
import io.livekit.android.room.network.NetworkCallbackManager;
import io.livekit.android.room.network.NetworkCallbackManagerImpl;
import io.livekit.android.room.network.NetworkCallbackRegistry;
import io.livekit.android.room.network.NetworkCallbackRegistryImpl;
import io.livekit.android.room.util.ConnectionWarmer;
import io.livekit.android.room.util.OkHttpConnectionWarmer;
import io.livekit.android.stats.AndroidNetworkInfo;
import io.livekit.android.stats.NetworkInfo;
import javax.inject.Named;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import okhttp3.WebSocket;

/* compiled from: WebModule.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J<\u0010\u000b\u001a&\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\fj\u0002`\u0012¢\u0006\u0002\b\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0014\u0010\u001b\u001a\u00020\u001c2\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0007J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u001cH\u0007¨\u0006 "}, d2 = {"Lio/livekit/android/dagger/WebModule;", "", "()V", "connectionWarmer", "Lio/livekit/android/room/util/ConnectionWarmer;", "okHttpConnectionWarmer", "Lio/livekit/android/room/util/OkHttpConnectionWarmer;", "connectivityManager", "Landroid/net/ConnectivityManager;", "context", "Landroid/content/Context;", "networkCallbackManagerFactory", "Lkotlin/Function1;", "Landroid/net/ConnectivityManager$NetworkCallback;", "Lkotlin/ParameterName;", "name", "networkCallback", "Lio/livekit/android/room/network/NetworkCallbackManager;", "Lio/livekit/android/room/network/NetworkCallbackManagerFactory;", "Lkotlin/jvm/JvmSuppressWildcards;", "closeableManager", "Lio/livekit/android/memory/CloseableManager;", "registrar", "Lio/livekit/android/room/network/NetworkCallbackRegistry;", "networkCallbackRegistrar", "networkInfo", "Lio/livekit/android/stats/NetworkInfo;", "okHttpClient", "Lokhttp3/OkHttpClient;", "okHttpClientOverride", "websocketFactory", "Lokhttp3/WebSocket$Factory;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public final class WebModule {
    public static final WebModule INSTANCE = new WebModule();

    private WebModule() {
    }

    @Provides
    @Singleton
    public final OkHttpClient okHttpClient(@Named("override_okhttp") OkHttpClient okHttpClientOverride) {
        return okHttpClientOverride == null ? WebModuleKt.getGlobalOkHttpClient() : okHttpClientOverride;
    }

    @Provides
    public final ConnectionWarmer connectionWarmer(OkHttpConnectionWarmer okHttpConnectionWarmer) {
        Intrinsics.checkNotNullParameter(okHttpConnectionWarmer, "okHttpConnectionWarmer");
        return okHttpConnectionWarmer;
    }

    @Provides
    public final WebSocket.Factory websocketFactory(OkHttpClient okHttpClient) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        return okHttpClient;
    }

    @Provides
    @Reusable
    public final NetworkInfo networkInfo(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new AndroidNetworkInfo(context);
    }

    @Provides
    public final ConnectivityManager connectivityManager(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        return (ConnectivityManager) systemService;
    }

    @Provides
    public final NetworkCallbackRegistry networkCallbackRegistrar(ConnectivityManager connectivityManager) {
        Intrinsics.checkNotNullParameter(connectivityManager, "connectivityManager");
        return new NetworkCallbackRegistryImpl(connectivityManager);
    }

    @Provides
    @Reusable
    public final Function1<ConnectivityManager.NetworkCallback, NetworkCallbackManager> networkCallbackManagerFactory(final CloseableManager closeableManager, final NetworkCallbackRegistry registrar) {
        Intrinsics.checkNotNullParameter(closeableManager, "closeableManager");
        Intrinsics.checkNotNullParameter(registrar, "registrar");
        return new Function1<ConnectivityManager.NetworkCallback, NetworkCallbackManagerImpl>() { // from class: io.livekit.android.dagger.WebModule$networkCallbackManagerFactory$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final NetworkCallbackManagerImpl invoke(ConnectivityManager.NetworkCallback networkCallback) {
                Intrinsics.checkNotNullParameter(networkCallback, "networkCallback");
                NetworkCallbackManagerImpl networkCallbackManagerImpl = new NetworkCallbackManagerImpl(networkCallback, NetworkCallbackRegistry.this);
                closeableManager.registerClosable(networkCallbackManagerImpl);
                return networkCallbackManagerImpl;
            }
        };
    }
}
