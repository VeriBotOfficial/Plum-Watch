package com.baidu.ar;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import com.reactnativecommunity.netinfo.BroadcastReceiverConnectivityReceiver;

/* JADX INFO: loaded from: classes16.dex */
public class l9 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f7064a;

    public interface a {
        void a(int r1);
    }

    public void a() {
        this.f7064a = null;
    }

    public void a(a aVar) {
        this.f7064a = aVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        NetworkInfo networkInfo;
        a aVar;
        if ("android.net.wifi.WIFI_STATE_CHANGED".equals(intent.getAction())) {
            intent.getIntExtra("wifi_state", 0);
        }
        if (!BroadcastReceiverConnectivityReceiver.CONNECTIVITY_ACTION.equals(intent.getAction()) || (networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo")) == null) {
            return;
        }
        if (NetworkInfo.State.CONNECTED != networkInfo.getState() || !networkInfo.isAvailable()) {
            a aVar2 = this.f7064a;
            if (aVar2 != null) {
                aVar2.a(2);
                return;
            }
            return;
        }
        if ((networkInfo.getType() == 1 || networkInfo.getType() == 0) && (aVar = this.f7064a) != null) {
            aVar.a(1);
        }
    }
}
