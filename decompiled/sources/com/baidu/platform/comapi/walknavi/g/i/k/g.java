package com.baidu.platform.comapi.walknavi.g.i.k;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;

/* compiled from: NetworkUtil.java */
/* loaded from: classes13.dex */
public final class g {
    public static NetworkInfo a(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return null;
        }
        return connectivityManager.getActiveNetworkInfo();
    }

    public static boolean b(Context context) {
        if (c(context)) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            if (activeNetworkInfo.isConnectedOrConnecting()) {
                return true;
            }
        }
        return false;
    }

    public static boolean c(Context context) {
        ConnectivityManager connectivityManager;
        if (context != null && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && 1 == activeNetworkInfo.getType()) {
                    if (activeNetworkInfo.isConnected()) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static boolean d(Context context) {
        int i;
        if (context == null) {
            return false;
        }
        try {
            i = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getWifiState();
        } catch (Exception unused) {
            i = -1;
        }
        return i == 3;
    }
}
