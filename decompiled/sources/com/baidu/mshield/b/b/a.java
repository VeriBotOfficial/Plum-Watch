package com.baidu.mshield.b.b;

import android.content.Context;
import java.lang.reflect.Method;

/* compiled from: DeviceId.java */
/* loaded from: classes13.dex */
public class a {
    public static synchronized String a(Context context) {
        String str;
        synchronized (a.class) {
            try {
                Class<?> cls = Class.forName("com.baidu.mshield.ac.F");
                Method declaredMethod = cls.getDeclaredMethod("getInstance", new Class[0]);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(null, new Object[0]);
                Method declaredMethod2 = cls.getDeclaredMethod("gzd", Context.class);
                declaredMethod2.setAccessible(true);
                str = (String) declaredMethod2.invoke(invoke, context);
            } catch (Throwable th) {
                com.baidu.mshield.b.c.a.a(th);
                return "";
            }
        }
        return str;
    }

    public static String b(Context context) {
        try {
            Method declaredMethod = Class.forName("com.baidu.mshield.utility.c").getDeclaredMethod("loadExternalDeviceId", Context.class);
            declaredMethod.setAccessible(true);
            return (String) declaredMethod.invoke(null, context);
        } catch (Throwable th) {
            com.baidu.mshield.b.c.a.a(th);
            return "";
        }
    }

    public static String c(Context context) {
        try {
            Method declaredMethod = Class.forName("com.baidu.mshield.utility.c").getDeclaredMethod("loadSettingDeviceId", Context.class);
            declaredMethod.setAccessible(true);
            return (String) declaredMethod.invoke(null, context);
        } catch (Throwable th) {
            com.baidu.mshield.b.c.a.a(th);
            return "";
        }
    }
}
