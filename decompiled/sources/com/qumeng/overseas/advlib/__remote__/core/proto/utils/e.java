package com.qumeng.overseas.advlib.__remote__.core.proto.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.qumeng.overseas.advlib.__remote__.__bootstrap__.LibInit;
import com.xiaomi.mipush.sdk.Constants;

/* loaded from: classes17.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static volatile Context f12855a;

    public static Context a() {
        if (f12855a == null) {
            synchronized (e.class) {
                if (f12855a == null) {
                    try {
                        f12855a = (Context) com.qumeng.overseas.advlib.__remote__.utils.reflect.a.g("android.app.ActivityThread").b("currentActivityThread").b("getApplication").c();
                    } catch (Throwable th) {
                        th.printStackTrace();
                        try {
                            f12855a = (Context) com.qumeng.overseas.advlib.__remote__.utils.reflect.a.g("android.app.ActivityThread").b("currentApplication").c();
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                        }
                    }
                }
            }
        }
        return f12855a;
    }

    public static void b(Context context) {
        f12855a = context;
    }

    private static String c() {
        return "1.049." + (LibInit.aisdk_bootstrap_version.equals("") ? "0" : z.b(LibInit.aisdk_bootstrap_version));
    }

    public static boolean d() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        boolean z = runningAppProcessInfo.importance != 100;
        com.qumeng.overseas.advlib.__remote__.utils.n.a("isInBackground", "isInBackground:" + z + " costtime:" + (SystemClock.elapsedRealtime() - elapsedRealtime), new Object[0]);
        return z || com.qumeng.overseas.advlib.__remote__.ui.incite.a.e().g();
    }

    public static String b() {
        try {
            return (String) com.qumeng.overseas.advlib.__remote__.utils.reflect.a.g("android.app.ActivityThread").b("currentProcessName").c();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void a(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            if (context.getPackageManager() != null) {
                a(context, b.l(context, str));
            }
        } catch (Exception e) {
            e.printStackTrace();
            com.qumeng.overseas.advlib.__remote__.utils.bugman.a.a(com.qumeng.overseas.advlib.__remote__.core.c.class, "exp_ICliUtils_startActivity", e.getMessage(), (Throwable) e);
        }
    }

    public static void a(Context context, Intent intent) {
        if (intent != null) {
            try {
                if (context instanceof Activity) {
                    context.startActivity(intent);
                } else {
                    intent.setFlags(268435456);
                    context.startActivity(intent);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean a(Activity activity) {
        if (activity == null || activity.isFinishing() || activity.isRestricted()) {
            return false;
        }
        try {
            return !activity.isDestroyed();
        } catch (Throwable th) {
            th.printStackTrace();
            return true;
        }
    }

    public static String a(String str) {
        String str2;
        try {
            str2 = Base64.encodeToString(c().getBytes(), 10);
        } catch (Throwable unused) {
            str2 = "";
        }
        return "cpc/sdk-" + str2 + Constants.ACCEPT_TIME_SEPARATOR_SERVER + str;
    }

    public static boolean a(Context context) {
        return context.getApplicationContext().getPackageName().equals(b());
    }
}
