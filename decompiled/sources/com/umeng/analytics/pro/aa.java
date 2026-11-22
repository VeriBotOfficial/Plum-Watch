package com.umeng.analytics.pro;

import android.content.Context;
import android.os.Looper;

/* compiled from: OpenDeviceId.java */
/* loaded from: classes2.dex */
public class aa {

    /* renamed from: a, reason: collision with root package name */
    private static z f13774a = null;
    private static boolean b = false;

    public static synchronized String a(Context context) {
        synchronized (aa.class) {
            try {
                if (context == null) {
                    throw new RuntimeException("Context is null");
                }
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    throw new IllegalStateException("Cannot be called from the main thread");
                }
                b(context);
                z zVar = f13774a;
                if (zVar != null) {
                    try {
                        return zVar.a(context);
                    } catch (Exception unused) {
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void b(Context context) {
        if (f13774a != null || b) {
            return;
        }
        synchronized (aa.class) {
            if (f13774a == null && !b) {
                f13774a = ac.a(context);
                b = true;
            }
        }
    }
}
