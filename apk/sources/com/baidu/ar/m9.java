package com.baidu.ar;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* JADX INFO: loaded from: classes16.dex */
public final class m9 {
    public static NetworkInfo a(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return null;
        }
        return connectivityManager.getActiveNetworkInfo();
    }

    public static int b(Context context) {
        NetworkInfo networkInfoA = a(context);
        if (networkInfoA != null && networkInfoA.isAvailable() && networkInfoA.getType() == 0) {
            String subtypeName = networkInfoA.getSubtypeName();
            switch (networkInfoA.getSubtype()) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    return 2;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    return 3;
                case 13:
                    return 4;
                default:
                    if (subtypeName.equalsIgnoreCase("TD-SCDMA") || subtypeName.equalsIgnoreCase("WCDMA") || subtypeName.equalsIgnoreCase("CDMA2000")) {
                        return 3;
                    }
                    break;
            }
        }
        return Integer.MIN_VALUE;
    }

    public static String c(Context context) {
        if (!e(context) || context == null) {
            return "not_Reachable";
        }
        if (f(context)) {
            return "wifi";
        }
        int r1 = b(context);
        if (r1 == 2) {
            return "2G";
        }
        if (r1 == 3) {
            return "3G";
        }
        return r1 == 4 ? "4G" : "other_network";
    }

    public static boolean d(Context context) {
        NetworkInfo networkInfoA = a(context);
        return networkInfoA != null && networkInfoA.isAvailable() && networkInfoA.getType() == 0;
    }

    public static boolean e(Context context) {
        NetworkInfo networkInfoA = a(context);
        return networkInfoA != null && networkInfoA.isAvailable();
    }

    public static boolean f(Context context) {
        NetworkInfo networkInfoA = a(context);
        return networkInfoA != null && networkInfoA.isAvailable() && networkInfoA.getType() == 1;
    }
}
