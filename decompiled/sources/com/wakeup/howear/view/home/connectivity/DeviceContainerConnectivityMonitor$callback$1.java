package com.wakeup.howear.view.home.connectivity;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: DeviceContainerConnectivityMonitor.kt */
@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, d2 = {"com/wakeup/howear/view/home/connectivity/DeviceContainerConnectivityMonitor$callback$1", "Landroid/net/ConnectivityManager$NetworkCallback;", "onAvailable", "", "network", "Landroid/net/Network;", "onCapabilitiesChanged", "capabilities", "Landroid/net/NetworkCapabilities;", "onLost", "onUnavailable", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeviceContainerConnectivityMonitor$callback$1 extends ConnectivityManager.NetworkCallback {
    DeviceContainerConnectivityMonitor$callback$1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAvailable$lambda$0(Network network) {
        DeviceContainerConnectivityMonitor.INSTANCE.handleNetworkAvailable(network);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(final Network network) {
        Handler handler;
        Intrinsics.checkNotNullParameter(network, "network");
        handler = DeviceContainerConnectivityMonitor.mainHandler;
        handler.post(new Runnable() { // from class: com.wakeup.howear.view.home.connectivity.DeviceContainerConnectivityMonitor$callback$1$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                DeviceContainerConnectivityMonitor$callback$1.onAvailable$lambda$0(network);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCapabilitiesChanged$lambda$1(Network network, NetworkCapabilities networkCapabilities) {
        DeviceContainerConnectivityMonitor.INSTANCE.handleCapabilitiesChanged(network, networkCapabilities);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(final Network network, final NetworkCapabilities capabilities) {
        Handler handler;
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(capabilities, "capabilities");
        handler = DeviceContainerConnectivityMonitor.mainHandler;
        handler.post(new Runnable() { // from class: com.wakeup.howear.view.home.connectivity.DeviceContainerConnectivityMonitor$callback$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                DeviceContainerConnectivityMonitor$callback$1.onCapabilitiesChanged$lambda$1(network, capabilities);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onLost$lambda$2(Network network) {
        DeviceContainerConnectivityMonitor.INSTANCE.handleNetworkLost(network);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(final Network network) {
        Handler handler;
        Intrinsics.checkNotNullParameter(network, "network");
        handler = DeviceContainerConnectivityMonitor.mainHandler;
        handler.post(new Runnable() { // from class: com.wakeup.howear.view.home.connectivity.DeviceContainerConnectivityMonitor$callback$1$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                DeviceContainerConnectivityMonitor$callback$1.onLost$lambda$2(network);
            }
        });
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onUnavailable() {
        Handler handler;
        handler = DeviceContainerConnectivityMonitor.mainHandler;
        handler.post(new Runnable() { // from class: com.wakeup.howear.view.home.connectivity.DeviceContainerConnectivityMonitor$callback$1$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                DeviceContainerConnectivityMonitor$callback$1.onUnavailable$lambda$3();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onUnavailable$lambda$3() {
        MutableStateFlow mutableStateFlow;
        DeviceContainerConnectivityMonitor deviceContainerConnectivityMonitor = DeviceContainerConnectivityMonitor.INSTANCE;
        DeviceContainerConnectivityMonitor.defaultNetwork = null;
        DeviceContainerConnectivityMonitor deviceContainerConnectivityMonitor2 = DeviceContainerConnectivityMonitor.INSTANCE;
        DeviceContainerConnectivityMonitor.defaultCapabilities = null;
        mutableStateFlow = DeviceContainerConnectivityMonitor.mutableState;
        if (mutableStateFlow.getValue() != DeviceContainerNetworkState.CONFIRMED_OFFLINE) {
            DeviceContainerConnectivityMonitor.INSTANCE.ensureOfflineConfirmation(null, "network_unavailable", true);
        }
    }
}
