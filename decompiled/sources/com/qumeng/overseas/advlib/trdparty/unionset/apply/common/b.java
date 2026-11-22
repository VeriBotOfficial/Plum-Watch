package com.qumeng.overseas.advlib.trdparty.unionset.apply.common;

import android.gov.nist.javax.sip.parser.TokenNames;
import android.os.Build;
import com.qumeng.overseas.advlib.__remote__.utils.n;
import java.lang.reflect.Method;

/* loaded from: classes17.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f13348a = "HiddenApiUtils";
    static Object b;
    static Method c;
    static volatile boolean d;
    static volatile boolean e;

    public static boolean a(String... strArr) {
        Method method;
        Object obj = b;
        if (obj == null || (method = c) == null) {
            return false;
        }
        try {
            method.invoke(obj, strArr);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static void b() {
        try {
            Method declaredMethod = Class.class.getDeclaredMethod("forName", String.class);
            Method declaredMethod2 = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
            Class cls = (Class) declaredMethod.invoke(null, "dalvik.system.VMRuntime");
            c = (Method) declaredMethod2.invoke(cls, "setHiddenApiExemptions", new Class[]{String[].class});
            Object invoke = ((Method) declaredMethod2.invoke(cls, "getRuntime", null)).invoke(null, new Object[0]);
            b = invoke;
            if (invoke != null) {
                n.a(f13348a, "reflect bootstrap success", new Object[0]);
            }
            e = true;
        } catch (Throwable th) {
            e = false;
            n.a(f13348a, "reflect bootstrap failed:" + th.toString(), new Object[0]);
        }
    }

    public static boolean c() {
        return e;
    }

    public static void d() {
        if (d) {
            return;
        }
        d = true;
        e();
    }

    public static int e() {
        if (Build.VERSION.SDK_INT < 28) {
            return 0;
        }
        b();
        return a() ? 0 : -21;
    }

    public static boolean a() {
        return a(TokenNames.L);
    }
}
