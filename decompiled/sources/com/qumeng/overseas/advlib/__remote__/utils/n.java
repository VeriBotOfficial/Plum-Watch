package com.qumeng.overseas.advlib.__remote__.utils;

import android.text.TextUtils;
import android.util.Log;

/* loaded from: classes17.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public static final String f13237a = "AdxNode";
    public static final int b = 2000;
    private static final int c;
    private static final boolean d;
    private static final boolean e;
    private static final boolean f;
    public static boolean g;
    public static boolean h;
    public static boolean i;

    static {
        c = com.qumeng.overseas.advlib.__remote__.core.f.a("NO_LOG") ? 8 : com.qumeng.overseas.advlib.__remote__.core.f.a("SHOW_ASSERT_LOG") ? 7 : com.qumeng.overseas.advlib.__remote__.core.f.a("SHOW_ERROR_LOG") ? 6 : com.qumeng.overseas.advlib.__remote__.core.f.a("SHOW_WARN_LOG") ? 5 : com.qumeng.overseas.advlib.__remote__.core.f.a("SHOW_INFO_LOG") ? 4 : com.qumeng.overseas.advlib.__remote__.core.f.a("SHOW_DEBUG_LOG") ? 3 : com.qumeng.overseas.advlib.__remote__.core.f.a("SHOW_VERBOSE_LOG") ? 2 : 1;
        d = !com.qumeng.overseas.advlib.__remote__.core.f.a("NO_SENSITIVE_LOGCAT");
        e = !com.qumeng.overseas.advlib.__remote__.core.f.a("NO_CRAP_LOG");
        f = com.qumeng.overseas.advlib.__remote__.core.f.a("DEBUG_LOG");
        g = a("cpc_sdk_tag", 3);
        h = a("cpc_sdk_api_tag", 2);
        i = a("cpc_sdk_v6_log", 2);
    }

    public static void a(boolean z, String str) {
    }

    public static void b(String str, String str2, Object... objArr) {
        a(6, str, str2, objArr);
    }

    public static void c(String str, String str2, Object... objArr) {
        a(4, str, str2, objArr);
    }

    public static void d(String str, String str2, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str2 = String.format(str2, objArr);
        }
        Log.i(str + "1.049", str2);
    }

    public static void e(String str, String str2, Object... objArr) {
        a(2, str, str2, objArr);
    }

    public static void f(String str, String str2, Object... objArr) {
        a(5, str, str2, objArr);
    }

    public static void a(int i2, String str, String str2, Object... objArr) {
        if ((c > i2 || !(f || com.qumeng.overseas.advlib.__remote__.core.coreutils.a.f12826a)) && !g) {
            return;
        }
        if (objArr != null && objArr.length > 0) {
            str2 = String.format(str2, objArr);
        }
        a(i2, str + "1.049", str2);
    }

    public static void b(String str) {
        c(f13237a, str, new Object[0]);
        a(true, str);
    }

    private static void a(int i2, String str, String str2) {
        if (str2.length() <= 2000) {
            Log.println(i2, str, str2);
            return;
        }
        int i3 = 2001;
        int i4 = 0;
        while (i3 > 2000) {
            i4++;
            Log.println(i2, str + "[" + i4 + "]", str2.substring(0, 2000));
            str2 = str2.substring(2000);
            i3 = str2.length();
        }
        if (i3 <= 2000) {
            Log.println(i2, str + "[" + (i4 + 1) + "]", str2);
        }
    }

    public static void a(String str, String str2, Object... objArr) {
        a(3, str, str2, objArr);
    }

    public static void a(String str, String str2) {
        if (d) {
            c(str, str2, new Object[0]);
        }
    }

    public static void a(Object obj, String str) {
        a((Class) obj.getClass(), str);
    }

    public static void a(Class cls, String str) {
        if (e) {
            String simpleName = cls.getSimpleName();
            if (TextUtils.isEmpty(simpleName)) {
                simpleName = "crap";
            }
            a(simpleName, str, new Object[0]);
        }
    }

    private static boolean a(String str, int i2) {
        try {
            return Log.isLoggable(str, i2);
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void a(String str) {
        if (com.qumeng.overseas.advlib.__remote__.core.coreutils.a.f12826a) {
            Log.w("debug", "=============================================================");
            new Exception(str).printStackTrace();
            Log.w("debug", "=============================================================");
        }
    }

    public static boolean a() {
        return f || com.qumeng.overseas.advlib.__remote__.core.coreutils.a.f12826a || g;
    }
}
