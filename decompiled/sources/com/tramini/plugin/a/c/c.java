package com.tramini.plugin.a.c;

import android.content.Context;

/* loaded from: classes2.dex */
public class c extends b {

    /* renamed from: a, reason: collision with root package name */
    private static c f13713a;

    @Override // com.tramini.plugin.a.c.b
    protected final int d() {
        return 2;
    }

    @Override // com.tramini.plugin.a.c.b
    protected final void e() {
    }

    @Override // com.tramini.plugin.a.c.b
    protected final void f() {
    }

    @Override // com.tramini.plugin.a.c.b
    protected final void g() {
    }

    private c(Context context) {
        super(context);
    }

    public static c a(Context context) {
        if (f13713a == null) {
            synchronized (c.class) {
                f13713a = new c(context.getApplicationContext());
            }
        }
        return f13713a;
    }

    @Override // com.tramini.plugin.a.c.b
    protected final String c() {
        return "tramini.db";
    }

    private void h() {
        try {
            b().execSQL("DROP TABLE IF EXISTS 'il'");
            b().execSQL("DROP TABLE IF EXISTS 'il_all'");
        } catch (Throwable unused) {
        }
    }
}
