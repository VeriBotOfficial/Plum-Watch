package com.iab.omid.library.unity3d.internal;

import android.content.Context;

/* loaded from: classes17.dex */
public class f {
    private static f b = new f();

    /* renamed from: a, reason: collision with root package name */
    private Context f11045a;

    private f() {
    }

    public static f b() {
        return b;
    }

    public Context a() {
        return this.f11045a;
    }

    public void a(Context context) {
        this.f11045a = context != null ? context.getApplicationContext() : null;
    }
}
