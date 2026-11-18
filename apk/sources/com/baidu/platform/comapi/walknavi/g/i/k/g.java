package com.baidu.platform.comapi.walknavi.g.i.k;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;

/* JADX INFO: compiled from: NetworkUtil.java */
/* JADX INFO: loaded from: classes15.dex */
public final class g {
    public static NetworkInfo a(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return null;
        }
        return connectivityManager.getActiveNetworkInfo();
    }

    public static boolean b(Context context) {
        try {
            if (c(context)) {
                return true;
            }
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean c(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null && 1 == activeNetworkInfo.getType() && activeNetworkInfo.isConnected();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean d(Context context) {
        int wifiState;
        if (context == null) {
            return false;
        }
        try {
            wifiState = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getWifiState();
        } catch (Exception unused) {
            wifiState = -1;
        }
        return wifiState == 3;
    }
}
