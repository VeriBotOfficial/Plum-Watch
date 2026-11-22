package com.alipay.sdk.m.c;

import android.content.Context;
import android.os.Looper;

/* loaded from: classes11.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static b f1344a = null;
    public static boolean b = false;

    public static synchronized String a(Context context) {
        synchronized (c.class) {
            if (context == null) {
                throw new RuntimeException("Context is null");
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                throw new IllegalStateException("Cannot be called from the main thread");
            }
            b(context);
            b bVar = f1344a;
            if (bVar != null) {
                try {
                    return bVar.a(context);
                } catch (Exception unused) {
                }
            }
            return null;
        }
    }

    public static void b(Context context) {
        if (f1344a != null || b) {
            return;
        }
        synchronized (c.class) {
            if (f1344a == null && !b) {
                f1344a = com.alipay.sdk.m.d.a.a(context);
                b = true;
            }
        }
    }
}
