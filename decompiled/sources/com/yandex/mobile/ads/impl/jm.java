package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes5.dex */
public final class jm {

    /* renamed from: a, reason: collision with root package name */
    private static Method f15926a;

    public static IBinder a(Bundle bundle, String str) {
        if (f92.f15466a >= 18) {
            return bundle.getBinder(str);
        }
        Method method = f15926a;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("getIBinder", String.class);
                f15926a = method2;
                method2.setAccessible(true);
                method = f15926a;
            } catch (NoSuchMethodException e) {
                et0.a("Failed to retrieve getIBinder method", (Exception) e);
                return null;
            }
        }
        try {
            return (IBinder) method.invoke(bundle, str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
            et0.a("Failed to invoke getIBinder via reflection", e2);
            return null;
        }
    }
}
