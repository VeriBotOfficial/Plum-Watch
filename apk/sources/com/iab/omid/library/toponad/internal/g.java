package com.iab.omid.library.toponad.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class g {
    private static g b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f11009a;

    private g() {
    }

    public static g b() {
        return b;
    }

    public Context a() {
        return this.f11009a;
    }

    public void a(Context context) {
        this.f11009a = context != null ? context.getApplicationContext() : null;
    }
}
