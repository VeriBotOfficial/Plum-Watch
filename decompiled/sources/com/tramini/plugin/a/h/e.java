package com.tramini.plugin.a.h;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static String f13749a = "";
    private static String b = "";
    private static String c = "";
    private static String d = "";
    private static int e;
    private static String f;
    private static PackageInfo g;

    private e() {
    }

    public static String a(Context context) {
        if (com.tramini.plugin.a.b.c.a().a("app_vc")) {
            return "";
        }
        if (e == 0) {
            try {
                e = d(context).versionCode;
                return new StringBuilder().append(e).toString();
            } catch (Throwable unused) {
                return "";
            }
        }
        return new StringBuilder().append(e).toString();
    }

    public static String b(Context context) {
        if (com.tramini.plugin.a.b.c.a().a("app_vn")) {
            return "";
        }
        try {
            if (TextUtils.isEmpty(d)) {
                String str = d(context).versionName;
                d = str;
                return str;
            }
            return d;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String c(Context context) {
        if (com.tramini.plugin.a.b.c.a().a("package_name")) {
            return "";
        }
        try {
            if (TextUtils.isEmpty(c)) {
                String str = d(context).packageName;
                c = str;
                return str;
            }
            return c;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String a() {
        if (com.tramini.plugin.a.b.c.a().a("os_vc")) {
            return "";
        }
        if (TextUtils.isEmpty(b)) {
            b = String.valueOf(Build.VERSION.SDK_INT);
        }
        return b;
    }

    public static String b() {
        if (com.tramini.plugin.a.b.c.a().a("os_vn")) {
            return "";
        }
        if (TextUtils.isEmpty(f13749a)) {
            f13749a = Build.VERSION.RELEASE;
        }
        return f13749a;
    }

    private static int c() {
        return Build.VERSION.SDK_INT;
    }

    private static PackageInfo d(Context context) {
        if (g == null) {
            try {
                g = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (Throwable unused) {
            }
        }
        return g;
    }
}
