package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes5.dex */
public final class ro2 {
    private static ro2 b = new ro2();

    /* renamed from: a, reason: collision with root package name */
    private Context f16789a;

    private ro2() {
    }

    public static ro2 a() {
        return b;
    }

    public final Context b() {
        return this.f16789a;
    }

    public final void a(Context context) {
        this.f16789a = context != null ? context.getApplicationContext() : null;
    }
}
