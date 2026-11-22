package com.xiaomi.push;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;

/* loaded from: classes4.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    private static Context f14692a;

    /* renamed from: a, reason: collision with other field name */
    private static String f937a;

    public static void a(Context context) {
        f14692a = context.getApplicationContext();
    }

    /* renamed from: a, reason: collision with other method in class */
    public static Context m12370a() {
        return f14692a;
    }

    public static int a() {
        try {
            Class<?> a2 = a(null, "miui.os.Build");
            if (a2.getField("IS_STABLE_VERSION").getBoolean(null)) {
                return 3;
            }
            return a2.getField("IS_DEVELOPMENT_VERSION").getBoolean(null) ? 2 : 1;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m12373a(Context context) {
        try {
            return (context.getApplicationInfo().flags & 2) != 0;
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.a(e);
            return false;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m12372a() {
        return TextUtils.equals((String) ax.a("android.os.SystemProperties", "get", "sys.boot_completed"), "1");
    }

    /* renamed from: b, reason: collision with other method in class */
    public static boolean m12374b() {
        try {
            return a(null, "miui.os.Build").getField("IS_GLOBAL_BUILD").getBoolean(false);
        } catch (ClassNotFoundException unused) {
            com.xiaomi.channel.commonutils.logger.b.d("miui.os.Build ClassNotFound");
            return false;
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.a(e);
            return false;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static synchronized String m12371a() {
        synchronized (s.class) {
            String str = f937a;
            if (str != null) {
                return str;
            }
            String e = j.e();
            if (a() <= 0) {
                String b = b();
                if (TextUtils.isEmpty(b)) {
                    b = c();
                    if (TextUtils.isEmpty(b)) {
                        b = d();
                        if (TextUtils.isEmpty(b)) {
                            e = String.valueOf(q.a("ro.product.brand", "Android") + "_" + e);
                        }
                    }
                }
                e = b;
            }
            f937a = e;
            return e;
        }
    }

    private static String b() {
        String a2 = q.a(com.alipay.sdk.m.d.a.f1367a, "");
        f937a = a2;
        return a2;
    }

    private static String c() {
        String a2 = q.a("ro.build.version.opporom", "");
        if (!TextUtils.isEmpty(a2) && !a2.startsWith("ColorOS_")) {
            f937a = "ColorOS_" + a2;
        }
        return f937a;
    }

    private static String d() {
        String a2 = q.a("ro.vivo.os.version", "");
        if (!TextUtils.isEmpty(a2) && !a2.startsWith("FuntouchOS_")) {
            f937a = "FuntouchOS_" + a2;
        }
        return f937a;
    }

    public static Class<?> a(Context context, String str) {
        if (str == null || str.trim().length() == 0) {
            throw new ClassNotFoundException("class is empty");
        }
        boolean z = context != null;
        if (z && Build.VERSION.SDK_INT >= 29) {
            try {
                return context.getClassLoader().loadClass(str);
            } catch (Throwable unused) {
            }
        }
        try {
            return Class.forName(str);
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.b.m11781a(String.format("loadClass fail hasContext= %s, errMsg = %s", Boolean.valueOf(z), th.getLocalizedMessage()));
            throw new ClassNotFoundException("loadClass fail ", th);
        }
    }
}
