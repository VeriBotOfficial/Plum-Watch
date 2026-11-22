package com.anythink.expressad.foundation.c;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* loaded from: classes12.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private a f4769a;

    protected abstract void a(SQLiteDatabase sQLiteDatabase);

    protected abstract void b(SQLiteDatabase sQLiteDatabase);

    protected abstract String c();

    protected abstract int d();

    protected abstract void e();

    public b(Context context) {
        this.f4769a = new a(context, c());
    }

    public final SQLiteDatabase a() {
        return this.f4769a.getReadableDatabase();
    }

    public final synchronized SQLiteDatabase b() {
        SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = this.f4769a.getWritableDatabase();
        } catch (Exception unused) {
            sQLiteDatabase = null;
        }
        return sQLiteDatabase;
    }

    private class a extends SQLiteOpenHelper {
        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        }

        public a(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 72);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            b.this.a(sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            b.this.b(sQLiteDatabase);
        }
    }
}
