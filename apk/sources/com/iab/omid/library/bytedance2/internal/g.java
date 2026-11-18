package com.iab.omid.library.bytedance2.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class g {
    private static g b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f10937a;

    private g() {
    }

    public static g b() {
        return b;
    }

    public Context a() {
        return this.f10937a;
    }

    public void a(Context context) {
        this.f10937a = context != null ? context.getApplicationContext() : null;
    }
}
