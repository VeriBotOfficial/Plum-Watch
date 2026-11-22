package com.yandex.mobile.ads.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes5.dex */
final class bn {
    private static final String[] c = {"name", "length", "last_touch_timestamp"};

    /* renamed from: a, reason: collision with root package name */
    private final zv f15124a;
    private String b;

    public bn(k60 k60Var) {
        this.f15124a = k60Var;
    }

    public final HashMap a() throws yv {
        try {
            this.b.getClass();
            Cursor query = this.f15124a.getReadableDatabase().query(this.b, c, null, null, null, null, null);
            try {
                HashMap hashMap = new HashMap(query.getCount());
                while (query.moveToNext()) {
                    String string = query.getString(0);
                    string.getClass();
                    hashMap.put(string, new an(query.getLong(1), query.getLong(2)));
                }
                query.close();
                return hashMap;
            } finally {
            }
        } catch (Throwable th) {
            throw new yv(th);
        }
    }

    public final void a(long j) throws yv {
        try {
            String hexString = Long.toHexString(j);
            this.b = "ExoPlayerCacheFileMetadata" + hexString;
            if (jb2.a(this.f15124a.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = this.f15124a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    jb2.a(writableDatabase, 2, hexString, 1);
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + this.b);
                    writableDatabase.execSQL("CREATE TABLE " + this.b + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (Throwable th) {
            throw new yv(th);
        }
    }

    public final void a(String str) throws yv {
        this.b.getClass();
        try {
            this.f15124a.getWritableDatabase().delete(this.b, "name = ?", new String[]{str});
        } catch (Throwable th) {
            throw new yv(th);
        }
    }

    public final void a(Set<String> set) throws yv {
        this.b.getClass();
        try {
            SQLiteDatabase writableDatabase = this.f15124a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete(this.b, "name = ?", new String[]{it.next()});
                }
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (Throwable th) {
            throw new yv(th);
        }
    }

    public final void a(String str, long j, long j2) throws yv {
        this.b.getClass();
        try {
            SQLiteDatabase writableDatabase = this.f15124a.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j));
            contentValues.put("last_touch_timestamp", Long.valueOf(j2));
            writableDatabase.replaceOrThrow(this.b, null, contentValues);
        } catch (Throwable th) {
            throw new yv(th);
        }
    }
}
