package com.anythink.expressad.videocommon.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.reactnativecommunity.netinfo.BroadcastReceiverConnectivityReceiver;

/* loaded from: classes12.dex */
public final class k extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        try {
            if (BroadcastReceiverConnectivityReceiver.CONNECTIVITY_ACTION.equals(intent.getAction())) {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                    if (activeNetworkInfo.getType() == 1) {
                        e.a().a(true);
                        return;
                    } else {
                        if (activeNetworkInfo.getType() == 0) {
                            e.a().c();
                            return;
                        }
                        return;
                    }
                }
                e.a().b();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
