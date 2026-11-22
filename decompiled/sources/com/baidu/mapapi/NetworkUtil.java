package com.baidu.mapapi;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.baidu.mapsdkplatform.comapi.util.SysUpdateObservable;

/* loaded from: classes13.dex */
public class NetworkUtil {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f7800a = false;
    private static ConnectivityManager b;
    private static TelephonyManager c;
    private static b d;
    private static NetworkUpdate2MapListener e;

    private static void a(Context context) {
        if (b == null) {
            b = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
        }
        if (c == null) {
            c = (TelephonyManager) context.getApplicationContext().getSystemService("phone");
        }
    }

    public static NetworkInfo getActiveNetworkInfo(Context context) {
        if (context == null) {
            return null;
        }
        a(context);
        if (Build.VERSION.SDK_INT < 29) {
            return b.getActiveNetworkInfo();
        }
        NetworkRequest build = new NetworkRequest.Builder().build();
        ConnectivityManager connectivityManager = b;
        if (connectivityManager != null) {
            if (f7800a) {
                return connectivityManager.getActiveNetworkInfo();
            }
            b bVar = new b(context);
            d = bVar;
            b.registerNetworkCallback(build, bVar);
            f7800a = true;
        }
        return null;
    }

    public static String getCurrentNetMode(Context context) {
        if (context == null) {
            return null;
        }
        a(context);
        NetworkInfo activeNetworkInfo = getActiveNetworkInfo(context);
        int i = 0;
        if (activeNetworkInfo != null) {
            if (activeNetworkInfo.getType() != 1) {
                if (Build.VERSION.SDK_INT <= 29) {
                    TelephonyManager telephonyManager = c;
                    if (telephonyManager != null) {
                        switch (telephonyManager.getNetworkType()) {
                            case 1:
                            case 2:
                                i = 6;
                                break;
                            case 3:
                            case 9:
                            case 10:
                            case 15:
                                i = 9;
                                break;
                            case 4:
                                i = 5;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 12:
                                i = 7;
                                break;
                            case 8:
                                i = 8;
                                break;
                            case 11:
                                i = 2;
                                break;
                            case 13:
                                i = 4;
                                break;
                            case 14:
                                i = 10;
                                break;
                        }
                    } else {
                        return Integer.toString(0);
                    }
                } else {
                    ConnectivityManager connectivityManager = b;
                    if (connectivityManager == null) {
                        return "mobile";
                    }
                    NetworkCapabilities networkCapabilities = b.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                    if (networkCapabilities != null) {
                        return networkCapabilities.hasTransport(1) ? "WIFI" : networkCapabilities.hasTransport(0) ? "CELLULAR" : networkCapabilities.hasTransport(3) ? "ETHERNET" : networkCapabilities.hasTransport(6) ? "LoWPAN" : networkCapabilities.hasTransport(4) ? "VPN" : networkCapabilities.hasTransport(5) ? "WifiAware" : "mobile";
                    }
                    return "mobile";
                }
            } else {
                if (Build.VERSION.SDK_INT > 29) {
                    return "WIFI";
                }
                i = 1;
            }
        }
        return Integer.toString(i);
    }

    public static boolean initConnectState() {
        return true;
    }

    public static boolean isNetworkAvailable(Context context) {
        NetworkInfo activeNetworkInfo;
        if (context == null) {
            return false;
        }
        a(context);
        if (isWifiConnected(context)) {
            return true;
        }
        ConnectivityManager connectivityManager = b;
        if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
            if (activeNetworkInfo.isConnectedOrConnecting()) {
                return true;
            }
        }
        return false;
    }

    public static boolean isWifiConnected(NetworkInfo networkInfo) {
        if (networkInfo != null) {
            try {
                if (1 == networkInfo.getType()) {
                    if (networkInfo.isConnected()) {
                        return true;
                    }
                }
                return false;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }

    public static void setNetworkUpdate2MapListener(NetworkUpdate2MapListener networkUpdate2MapListener) {
        e = networkUpdate2MapListener;
    }

    public static void unregisterNetworkCallback() {
        ConnectivityManager connectivityManager;
        b bVar;
        if (Build.VERSION.SDK_INT < 29 || (connectivityManager = b) == null || (bVar = d) == null || !f7800a) {
            return;
        }
        connectivityManager.unregisterNetworkCallback(bVar);
        d = null;
        f7800a = false;
    }

    public static void updateNetworkInfo2Map() {
        NetworkUpdate2MapListener networkUpdate2MapListener = e;
        if (networkUpdate2MapListener != null) {
            networkUpdate2MapListener.networkUpdate();
        }
    }

    public static void updateNetworkProxy(Context context) {
        SysUpdateObservable.getInstance().updateNetworkProxy(context);
    }

    public static boolean isWifiConnected(Context context) {
        if (context == null) {
            return false;
        }
        a(context);
        ConnectivityManager connectivityManager = b;
        if (connectivityManager != null) {
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
}
