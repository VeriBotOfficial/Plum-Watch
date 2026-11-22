package io.appmetrica.analytics.impl;

import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes6.dex */
public final class Sk implements F6 {

    /* renamed from: a, reason: collision with root package name */
    public final C3217f7 f18070a;

    public Sk(C3217f7 c3217f7) {
        this.f18070a = c3217f7;
    }

    @Override // io.appmetrica.analytics.impl.F6
    public final void a(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // io.appmetrica.analytics.impl.F6
    public final SQLiteDatabase a() {
        try {
            return this.f18070a.getWritableDatabase();
        } catch (Throwable unused) {
            return null;
        }
    }
}
