package com.heytap.mcssdk.utils;

import android.os.Binder;
import android.os.UserHandle;
import java.lang.reflect.Method;

/* loaded from: classes11.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10112a = "PushService";
    private static final int b = 100000;

    public static int a() {
        try {
            UserHandle callingUserHandle = Binder.getCallingUserHandle();
            Method declaredMethod = callingUserHandle.getClass().getDeclaredMethod("getIdentifier", new Class[0]);
            declaredMethod.setAccessible(true);
            return ((Integer) declaredMethod.invoke(callingUserHandle, new Object[0])).intValue();
        } catch (Exception e) {
            d.b(f10112a, "get userId exception," + e);
            return 0;
        }
    }

    public static int a(int i, int i2) {
        return (i2 * 100000) + (i % 100000);
    }
}
