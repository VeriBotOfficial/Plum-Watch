package io.livekit.android.room.network;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NetworkCallbackManager.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lio/livekit/android/room/network/NetworkCallbackRegistryImpl;", "Lio/livekit/android/room/network/NetworkCallbackRegistry;", "connectivityManager", "Landroid/net/ConnectivityManager;", "(Landroid/net/ConnectivityManager;)V", "getConnectivityManager", "()Landroid/net/ConnectivityManager;", "registerNetworkCallback", "", "networkRequest", "Landroid/net/NetworkRequest;", "networkCallback", "Landroid/net/ConnectivityManager$NetworkCallback;", "unregisterNetworkCallback", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NetworkCallbackRegistryImpl implements NetworkCallbackRegistry {
    private final ConnectivityManager connectivityManager;

    public NetworkCallbackRegistryImpl(ConnectivityManager connectivityManager) {
        Intrinsics.checkNotNullParameter(connectivityManager, "connectivityManager");
        this.connectivityManager = connectivityManager;
    }

    public final ConnectivityManager getConnectivityManager() {
        return this.connectivityManager;
    }

    @Override // io.livekit.android.room.network.NetworkCallbackRegistry
    public void registerNetworkCallback(NetworkRequest networkRequest, ConnectivityManager.NetworkCallback networkCallback) {
        Intrinsics.checkNotNullParameter(networkRequest, "networkRequest");
        Intrinsics.checkNotNullParameter(networkCallback, "networkCallback");
        this.connectivityManager.registerNetworkCallback(networkRequest, networkCallback);
    }

    @Override // io.livekit.android.room.network.NetworkCallbackRegistry
    public void unregisterNetworkCallback(ConnectivityManager.NetworkCallback networkCallback) {
        Intrinsics.checkNotNullParameter(networkCallback, "networkCallback");
        this.connectivityManager.unregisterNetworkCallback(networkCallback);
    }
}
