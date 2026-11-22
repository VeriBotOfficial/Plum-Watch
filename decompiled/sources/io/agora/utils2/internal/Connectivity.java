package io.agora.utils2.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class Connectivity {
    public static final int Network_2G = 3;
    public static final int Network_3G = 4;
    public static final int Network_4G = 5;
    public static final int Network_5G = 6;
    public static final int Network_DISCONNECTED = 0;
    public static final int Network_LAN = 1;
    public static final int Network_SubType_WIFI_2P4G = 100;
    public static final int Network_SubType_WIFI_5G = 101;
    public static final int Network_UNKNOWN = -1;
    public static final int Network_WIFI = 2;
    private static final String TAG = "Connectivity";

    public static int VPNBehindAddress(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities == null) {
            Logging.d(TAG, "VPNBehindAddress NetworkCapabilities is null");
            return 0;
        }
        boolean hasTransport = networkCapabilities.hasTransport(4);
        Logging.d(TAG, "VPNBehindAddress vpnInUse is " + hasTransport);
        return hasTransport ? 1 : 0;
    }

    public static ArrayList<String> getDnsList() {
        Logging.d(TAG, "getDnsList()");
        return null;
    }

    public static NetworkInfo getNetworkInfo(Context context) {
        if (context != null && CommonUtility.checkAccessNetworkState(context)) {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        }
        return null;
    }

    public static int getNetworkType(Context context) {
        return getNetworkType(getNetworkInfo(context));
    }

    public static int getNetworkType(NetworkInfo info) {
        if (info == null || !info.isConnected()) {
            return 0;
        }
        int type = info.getType();
        if (type == 1) {
            return 2;
        }
        if (type != 0) {
            return -1;
        }
        int subtype = info.getSubtype();
        if (subtype == 20) {
            return 6;
        }
        switch (subtype) {
        }
        return 0;
    }

    public static boolean isConnected(Context context) {
        NetworkInfo networkInfo = getNetworkInfo(context);
        return networkInfo != null && networkInfo.isConnected();
    }
}
