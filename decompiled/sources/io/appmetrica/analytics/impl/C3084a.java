package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3084a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f18174a;

    public C3084a(Context context) {
        this.f18174a = context;
    }

    public final byte[] a() {
        try {
            return Wi.a(new StringBuilder(this.f18174a.getPackageName()).reverse().toString());
        } catch (Throwable unused) {
            return new byte[16];
        }
    }

    public final byte[] b() {
        try {
            return Wi.a(this.f18174a.getPackageName());
        } catch (Throwable unused) {
            return new byte[16];
        }
    }
}
