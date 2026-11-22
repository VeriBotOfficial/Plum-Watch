package com.amap.api.col.p0003sl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* compiled from: DB.java */
/* loaded from: classes11.dex */
public final class va extends SQLiteOpenHelper {

    /* renamed from: a, reason: collision with root package name */
    private ra f1937a;

    public va(Context context, String str, int i, ra raVar) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.f1937a = raVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        this.f1937a.onCreate(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.f1937a.onUpgrade(sQLiteDatabase, i, i2);
    }
}
