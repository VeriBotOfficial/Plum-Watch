package com.baidu.mapsdkplatform.comapi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.baidu.mapapi.NetworkUtil;
import com.baidu.mapsdkplatform.comapi.util.g;

/* loaded from: classes13.dex */
public class NetworkListener extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f8327a = "NetworkListener";

    public void a(Context context) {
        String currentNetMode = NetworkUtil.getCurrentNetMode(context);
        String f = g.f();
        if (f == null) {
            g.a(currentNetMode);
        } else {
            if (f.equals(currentNetMode)) {
                return;
            }
            g.a(currentNetMode);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        a(context);
        NetworkUtil.updateNetworkProxy(context);
    }
}
