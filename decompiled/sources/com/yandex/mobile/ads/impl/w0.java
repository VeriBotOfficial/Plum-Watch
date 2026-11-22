package com.yandex.mobile.ads.impl;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w0 {
    public static String a() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread", false, q11.class.getClassLoader());
            Intrinsics.checkNotNullExpressionValue(cls, "forName(...)");
            Method declaredMethod = cls.getDeclaredMethod("currentActivityThread", new Class[0]);
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = cls.getDeclaredMethod("getProcessName", new Class[0]);
            declaredMethod2.setAccessible(true);
            Object invoke = declaredMethod2.invoke(declaredMethod.invoke(null, new Object[0]), new Object[0]);
            Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type kotlin.String");
            return (String) invoke;
        } catch (Throwable unused) {
            sp0.c(new Object[0]);
            return null;
        }
    }

    public static String b() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread", false, q11.class.getClassLoader());
            Intrinsics.checkNotNullExpressionValue(cls, "forName(...)");
            Method declaredMethod = cls.getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type kotlin.String");
            return (String) invoke;
        } catch (Throwable unused) {
            sp0.c(new Object[0]);
            return null;
        }
    }
}
