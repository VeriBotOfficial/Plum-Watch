package com.bytedance.sdk.component.utils;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.lang.reflect.Method;

/* loaded from: classes13.dex */
public class ums {
    private static String fxn;

    public static boolean fxn(Context context) {
        if (context == null || context.getApplicationContext() == null) {
            return false;
        }
        return TextUtils.equals(context.getApplicationContext().getPackageName(), kg(context));
    }

    public static String kg(Context context) {
        if (!TextUtils.isEmpty(fxn)) {
            return fxn;
        }
        String fxn2 = fxn();
        fxn = fxn2;
        if (!TextUtils.isEmpty(fxn2)) {
            return fxn;
        }
        String kg = kg();
        fxn = kg;
        if (!TextUtils.isEmpty(kg)) {
            return fxn;
        }
        return fxn;
    }

    private static String fxn() {
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        try {
            return Application.getProcessName();
        } catch (Exception unused) {
            return null;
        }
    }

    private static String kg() {
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            if (invoke instanceof String) {
                return (String) invoke;
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
