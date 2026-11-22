package com.vivo.push.util;

import android.os.UserHandle;
import java.lang.reflect.Method;

/* compiled from: MultiUserManager.java */
/* loaded from: classes2.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private static int f14166a = -1;

    public static int a() {
        int i = f14166a;
        if (i != -1) {
            return i;
        }
        try {
            Method declaredMethod = UserHandle.class.getDeclaredMethod("myUserId", new Class[0]);
            declaredMethod.setAccessible(true);
            f14166a = ((Integer) declaredMethod.invoke(null, null)).intValue();
            t.d("MultiUserManager", "getMyUserId = " + f14166a);
            return f14166a;
        } catch (Exception e) {
            t.a("MultiUserManager", "getMyUserId error " + e.getMessage());
            return 0;
        }
    }
}
