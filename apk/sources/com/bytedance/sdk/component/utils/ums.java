package com.bytedance.sdk.component.utils;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes15.dex */
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
        String strFxn = fxn();
        fxn = strFxn;
        if (!TextUtils.isEmpty(strFxn)) {
            return fxn;
        }
        String strKg = kg();
        fxn = strKg;
        if (!TextUtils.isEmpty(strKg)) {
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
            Object objInvoke = declaredMethod.invoke(null, new Object[0]);
            if (objInvoke instanceof String) {
                return (String) objInvoke;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
