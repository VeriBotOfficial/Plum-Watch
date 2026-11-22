package com.anythink.core.common.v;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.BatteryManager;
import android.os.Build;
import android.text.TextUtils;
import com.facebook.soloader.MinElf;
import java.io.File;

/* loaded from: classes12.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f4437a = {"/su", "/su/bin/su", "/sbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/data/local/su", "/system/xbin/su", "/system/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/system/bin/cufsdosck", "/system/xbin/cufsdosck", "/system/bin/cufsmgr", "/system/xbin/cufsmgr", "/system/bin/cufaevdd", "/system/xbin/cufaevdd", "/system/bin/conbb", "/system/xbin/conbb"};

    public static String a() {
        try {
            String[] strArr = f4437a;
            int length = strArr.length;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (new File(strArr[i]).exists()) {
                    z = true;
                    break;
                }
                i++;
            }
            if (Build.TAGS != null) {
                if (Build.TAGS.contains("test-keys")) {
                    return "1";
                }
            }
            return z ? "1" : "2";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String a(Context context) {
        try {
            String property = System.getProperty("http.proxyHost");
            String property2 = System.getProperty("http.proxyPort");
            if (property2 == null) {
                property2 = "-1";
            }
            return (TextUtils.isEmpty(property) || Integer.parseInt(property2) == -1) ? "2" : "1";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String b() {
        String str;
        try {
            str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                str = Build.CPU_ABI2;
            }
        } catch (Throwable unused) {
        }
        return str != null ? str : "";
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(android.content.Context r6) {
        /*
            r0 = 2
            android.content.IntentFilter r1 = new android.content.IntentFilter     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = "android.intent.action.BATTERY_CHANGED"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L36
            r2 = 0
            android.content.Intent r6 = r6.registerReceiver(r2, r1)     // Catch: java.lang.Throwable -> L36
            java.lang.String r1 = "status"
            r2 = -1
            int r1 = r6.getIntExtra(r1, r2)     // Catch: java.lang.Throwable -> L36
            r3 = 0
            r4 = 1
            if (r1 == r0) goto L1e
            r5 = 5
            if (r1 != r5) goto L1c
            goto L1e
        L1c:
            r1 = r3
            goto L1f
        L1e:
            r1 = r4
        L1f:
            java.lang.String r5 = "plugged"
            int r6 = r6.getIntExtra(r5, r2)     // Catch: java.lang.Throwable -> L36
            if (r6 != r0) goto L29
            r2 = r4
            goto L2a
        L29:
            r2 = r3
        L2a:
            if (r6 != r4) goto L2d
            r3 = r4
        L2d:
            if (r1 == 0) goto L36
            if (r2 == 0) goto L33
        L31:
            r0 = r4
            goto L36
        L33:
            if (r3 == 0) goto L36
            goto L31
        L36:
            java.lang.String r6 = java.lang.String.valueOf(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.v.v.b(android.content.Context):java.lang.String");
    }

    public static String c(Context context) {
        return g(context) ? "1" : "2";
    }

    private static boolean g(Context context) {
        NetworkInfo networkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null || (networkInfo = connectivityManager.getNetworkInfo(17)) == null) {
                return false;
            }
            return networkInfo.isConnected();
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean h(Context context) {
        return "1".equals(a(context, "ro.kernel.qemu"));
    }

    private static boolean i(Context context) {
        String a2 = a(context, "ro.product.cpu.abi");
        return (a2 == null || TextUtils.isEmpty(a2) || !a2.contains(MinElf.ISA.X86)) ? false : true;
    }

    private static String a(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("android.os.SystemProperties");
            return (String) loadClass.getMethod("get", String.class).invoke(loadClass, str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String f(Context context) {
        try {
            return String.valueOf(((BatteryManager) context.getSystemService("batterymanager")).getIntProperty(4));
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String d(Context context) {
        String a2 = a(context, "ro.product.cpu.abi");
        return (a2 == null || TextUtils.isEmpty(a2) || !a2.contains(MinElf.ISA.X86)) ? "2" : "1";
    }

    public static String e(Context context) {
        if (!"1".equals(a(context, "ro.kernel.qemu"))) {
            return "2";
        }
        return "1";
    }
}
