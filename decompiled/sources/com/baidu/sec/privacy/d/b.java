package com.baidu.sec.privacy.d;

import android.content.Context;
import android.content.SharedPreferences;
import com.baidu.sec.privacy.f.c;
import java.lang.reflect.Method;

/* compiled from: SDKPrvHelper.java */
/* loaded from: classes13.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f9023a = false;
    public static String b = "";
    public static String c = "";

    public static boolean a() {
        try {
            SharedPreferences c2 = c();
            if (c2 == null) {
                c2 = com.baidu.sec.privacy.b.b.a().getSharedPreferences("leroadcfg", 0);
            }
            return c2.getBoolean("s_a_pl", false);
        } catch (Throwable th) {
            c.a(th);
            return false;
        }
    }

    public static boolean b(String str) {
        Method method;
        try {
        } catch (Throwable th) {
            c.a(th);
        }
        if (f9023a) {
            return true;
        }
        if (com.baidu.sec.privacy.b.b.d()) {
            com.baidu.sec.privacy.c c2 = com.baidu.sec.privacy.b.b.c();
            if (c2 != null) {
                f9023a = c2.a();
            }
            return f9023a;
        }
        com.baidu.sec.privacy.a b2 = com.baidu.sec.privacy.b.b.b();
        if (b2 != null) {
            boolean a2 = b2.a();
            f9023a = a2;
            return a2;
        }
        try {
            Class<?> cls = Class.forName("com.baidu." + str + ".ac.F");
            int i = 0;
            Object invoke = cls.getDeclaredMethod("getInstance", new Class[0]).invoke(cls, new Object[0]);
            Method[] declaredMethods = Class.forName("com.baidu." + str + ".ac.FI").getDeclaredMethods();
            int length = declaredMethods.length;
            while (true) {
                if (i >= length) {
                    method = null;
                    break;
                }
                method = declaredMethods[i];
                if (com.alipay.sdk.m.m.b.m.equals(method.getName())) {
                    break;
                }
                i++;
            }
            if (method == null) {
                f9023a = a();
            } else {
                f9023a = ((Boolean) method.invoke(invoke, com.baidu.sec.privacy.b.b.a())).booleanValue();
            }
        } catch (Throwable unused) {
            f9023a = a();
        }
        return f9023a;
    }

    public static SharedPreferences c() {
        return a("getPlatformSharedSharedPreferences");
    }

    public static String a(String str, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        try {
            SharedPreferences b2 = b();
            if (b2 == null) {
                b2 = com.baidu.sec.privacy.b.b.a().getSharedPreferences(c, 0);
            }
            b2.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
            return b2.getString(b, "");
        } catch (Throwable th) {
            c.a(th);
            return "";
        }
    }

    public static void a(String str, boolean z, com.baidu.sec.privacy.c cVar) {
        try {
            if (z) {
                if (cVar == null) {
                    return;
                }
                c = cVar.b();
                b = cVar.c();
                return;
            }
            if ("sofire".equals(str)) {
                str = "";
            }
            c = "leroad" + str + "cfg";
            b = "p_s_p_c";
        } catch (Throwable th) {
            c.a(th);
        }
    }

    public static SharedPreferences a(String str) {
        try {
            Class<?> cls = Class.forName("com.baidu.mshield.ac.F");
            return (SharedPreferences) cls.getDeclaredMethod(str, Context.class).invoke(cls.getDeclaredMethod("getInstance", new Class[0]).invoke(cls, new Object[0]), com.baidu.sec.privacy.b.b.a());
        } catch (Throwable th) {
            c.a(th);
            return null;
        }
    }

    public static SharedPreferences b() {
        return a("getPlatformPrivateSharedPreferences");
    }
}
