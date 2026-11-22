package com.tramini.plugin.a.c;

import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes2.dex */
public abstract class a<T> {

    /* renamed from: a, reason: collision with root package name */
    private b f13710a;

    public abstract long a();

    public abstract long b();

    protected abstract boolean c();

    private a(b bVar) {
        this.f13710a = bVar;
    }

    private SQLiteDatabase d() {
        return this.f13710a.a();
    }

    private SQLiteDatabase e() {
        return this.f13710a.b();
    }
}
