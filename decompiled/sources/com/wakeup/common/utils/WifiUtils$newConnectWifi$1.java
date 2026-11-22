package com.wakeup.common.utils;

import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Handler;
import com.wakeup.common.log.LogUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WifiUtils.kt */
@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/wakeup/common/utils/WifiUtils$newConnectWifi$1", "Landroid/net/ConnectivityManager$NetworkCallback;", "onAvailable", "", "network", "Landroid/net/Network;", "onUnavailable", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WifiUtils$newConnectWifi$1 extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ Function1<Boolean, Unit> $callback;
    final /* synthetic */ ConnectivityManager $connectivityManager;

    /* JADX WARN: Multi-variable type inference failed */
    WifiUtils$newConnectWifi$1(ConnectivityManager connectivityManager, Function1<? super Boolean, Unit> function1) {
        this.$connectivityManager = connectivityManager;
        this.$callback = function1;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        int i;
        Handler handler;
        Handler handler2;
        Intrinsics.checkNotNullParameter(network, "network");
        i = WifiUtils.status;
        if (i != 0) {
            return;
        }
        WifiUtils wifiUtils = WifiUtils.INSTANCE;
        WifiUtils.status = 1;
        LogUtils.i("WifiUtils", "connectWifi onAvailable");
        handler = WifiUtils.handler;
        handler.removeCallbacksAndMessages(null);
        handler2 = WifiUtils.handler;
        final Function1<Boolean, Unit> function1 = this.$callback;
        handler2.post(new Runnable() { // from class: com.wakeup.common.utils.WifiUtils$newConnectWifi$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                WifiUtils$newConnectWifi$1.onAvailable$lambda$0(Function1.this);
            }
        });
        this.$connectivityManager.bindProcessToNetwork(network);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAvailable$lambda$0(Function1 function1) {
        function1.invoke(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onUnavailable() {
        Handler handler;
        Handler handler2;
        LogUtils.i("WifiUtils", "connectWifi onUnavailable");
        handler = WifiUtils.handler;
        handler.removeCallbacksAndMessages(null);
        handler2 = WifiUtils.handler;
        final Function1<Boolean, Unit> function1 = this.$callback;
        handler2.post(new Runnable() { // from class: com.wakeup.common.utils.WifiUtils$newConnectWifi$1$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                WifiUtils$newConnectWifi$1.onUnavailable$lambda$1(Function1.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onUnavailable$lambda$1(Function1 function1) {
        function1.invoke(false);
    }
}
