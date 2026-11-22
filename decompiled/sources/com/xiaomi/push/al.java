package com.xiaomi.push;

import android.content.Context;

/* loaded from: classes4.dex */
class al {

    /* renamed from: a, reason: collision with root package name */
    private static volatile boolean f14430a = false;

    private static void a(Class<?> cls, Context context) {
        if (f14430a) {
            return;
        }
        try {
            f14430a = true;
            cls.getDeclaredMethod("InitEntry", Context.class).invoke(cls, context);
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.b.m11781a("mdid:load lib error " + th);
        }
    }

    public static boolean a(Context context) {
        try {
            Class<?> a2 = s.a(context, "com.bun.miitmdid.core.JLibrary");
            if (a2 == null) {
                return false;
            }
            a(a2, context);
            return true;
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.b.m11781a("mdid:check error " + th);
            return false;
        }
    }
}
