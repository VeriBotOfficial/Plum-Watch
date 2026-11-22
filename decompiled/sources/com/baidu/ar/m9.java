package com.baidu.ar;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* loaded from: classes12.dex */
public final class m9 {
    public static NetworkInfo a(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return null;
        }
        return connectivityManager.getActiveNetworkInfo();
    }

    public static int b(Context context) {
        NetworkInfo a2 = a(context);
        if (a2 != null && a2.isAvailable() && a2.getType() == 0) {
            String subtypeName = a2.getSubtypeName();
            switch (a2.getSubtype()) {
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
        int b = b(context);
        return b == 2 ? "2G" : b == 3 ? "3G" : b == 4 ? "4G" : "other_network";
    }

    public static boolean d(Context context) {
        NetworkInfo a2 = a(context);
        return a2 != null && a2.isAvailable() && a2.getType() == 0;
    }

    public static boolean e(Context context) {
        NetworkInfo a2 = a(context);
        return a2 != null && a2.isAvailable();
    }

    public static boolean f(Context context) {
        NetworkInfo a2 = a(context);
        return a2 != null && a2.isAvailable() && a2.getType() == 1;
    }
}
