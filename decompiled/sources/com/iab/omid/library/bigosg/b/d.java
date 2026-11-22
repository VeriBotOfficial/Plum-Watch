package com.iab.omid.library.bigosg.b;

import android.content.Context;

/* loaded from: classes17.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static d f10903a = new d();
    private Context b;

    private d() {
    }

    public static d a() {
        return f10903a;
    }

    public void a(Context context) {
        this.b = context != null ? context.getApplicationContext() : null;
    }

    public Context b() {
        return this.b;
    }
}
