package com.qumeng.overseas.advlib.__remote__.core.proto.utils;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* loaded from: classes17.dex */
public class q {
    public static String a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "NETTYPE_UNKNOWN" : "NETTYPE_NR" : "NETTYPE_LTE" : "NETTYPE_WCDMA" : "NETTYPE_GPRS" : "NETTYPE_WIFI";
    }

    public static int b() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) e.a().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return 0;
            }
            int a2 = a(activeNetworkInfo);
            int type = activeNetworkInfo.getType();
            if (type != 0) {
                return type != 1 ? 0 : 1;
            }
            if (a2 == 20) {
                return 5;
            }
            switch (a2) {
            }
            return 0;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    public static String a() {
        return a(com.qumeng.overseas.advlib.__remote__.core.coreutils.a.c0);
    }

    private static int a(NetworkInfo networkInfo) {
        return networkInfo.getSubtype();
    }
}
