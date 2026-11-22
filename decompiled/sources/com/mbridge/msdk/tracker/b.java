package com.mbridge.msdk.tracker;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/* compiled from: Database.java */
/* loaded from: classes17.dex */
class b extends SQLiteOpenHelper {

    /* renamed from: a, reason: collision with root package name */
    private final String f12271a;

    public b(Context context, String str, String str2) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 2);
        this.f12271a = str2;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (y.b(sQLiteDatabase)) {
            return;
        }
        try {
            sQLiteDatabase.execSQL(String.format(i.i, this.f12271a));
        } catch (Exception e) {
            if (a.f12270a) {
                Log.e("TrackManager", "create table error", e);
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (y.b(sQLiteDatabase)) {
            return;
        }
        try {
            sQLiteDatabase.execSQL(String.format(i.j, this.f12271a));
            sQLiteDatabase.execSQL(String.format(i.i, this.f12271a));
        } catch (Exception e) {
            if (a.f12270a) {
                Log.e("TrackManager", "downgrade table error", e);
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (y.b(sQLiteDatabase)) {
            return;
        }
        try {
            sQLiteDatabase.execSQL(String.format(i.j, this.f12271a));
            sQLiteDatabase.execSQL(String.format(i.i, this.f12271a));
        } catch (Exception e) {
            if (a.f12270a) {
                Log.e("TrackManager", "upgrade table error", e);
            }
        }
    }
}
