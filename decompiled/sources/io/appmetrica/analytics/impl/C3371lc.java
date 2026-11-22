package io.appmetrica.analytics.impl;

import android.text.TextUtils;

/* renamed from: io.appmetrica.analytics.impl.lc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3371lc {

    /* renamed from: a, reason: collision with root package name */
    public volatile String f18377a;

    public static String a() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            return (String) cls.getMethod("getProcessName", new Class[0]).invoke(cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]), new Object[0]);
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    public final String b() {
        if (this.f18377a != null) {
            return this.f18377a;
        }
        synchronized (this) {
            if (this.f18377a == null) {
                this.f18377a = a();
            }
        }
        return this.f18377a;
    }

    public final boolean c() {
        try {
            if (TextUtils.isEmpty(b())) {
                return false;
            }
            return !b().contains(":");
        } catch (Throwable unused) {
            return false;
        }
    }

    public final boolean a(String str) {
        try {
            if (!TextUtils.isEmpty(b())) {
                if (b().endsWith(":" + str)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}
