package com.amap.api.col.p0003sl;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: OfflineDBCreator.java */
/* loaded from: classes11.dex */
public class o2 implements ra {

    /* renamed from: a, reason: collision with root package name */
    private static volatile o2 f1800a;

    private o2() {
    }

    public static o2 a() {
        if (f1800a == null) {
            synchronized (o2.class) {
                if (f1800a == null) {
                    f1800a = new o2();
                }
            }
        }
        return f1800a;
    }

    @Override // com.amap.api.col.p0003sl.ra
    public String getDBName() {
        return "offlineDbV4.db";
    }

    @Override // com.amap.api.col.p0003sl.ra
    public int getVersion() {
        return 2;
    }

    @Override // com.amap.api.col.p0003sl.ra
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase == null) {
            return;
        }
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS update_item (_id integer primary key autoincrement, title  TEXT, url TEXT,mAdcode TEXT,fileName TEXT,version TEXT,lLocalLength INTEGER,lRemoteLength INTEGER,localPath TEXT,mIndex INTEGER,isProvince INTEGER NOT NULL,mCompleteCode INTEGER,mCityCode TEXT,mState INTEGER,mPinyin TEXT, UNIQUE(mAdcode));");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS update_item_file (_id integer primary key autoincrement,mAdcode TTEXT, file TEXT);");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS update_item_download_info (_id integer primary key autoincrement,mAdcode TEXT,fileLength integer,splitter integer,startPos integer,endPos integer, UNIQUE(mAdcode));");
        } catch (Throwable th) {
            ja.a(th, "DB", "onCreate");
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.col.p0003sl.ra
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        SQLiteDatabase sQLiteDatabase2;
        if (sQLiteDatabase != null && i == 1) {
            sQLiteDatabase.execSQL("ALTER TABLE update_item ADD COLUMN mPinyin TEXT;");
            Cursor query = sQLiteDatabase.query("update_item", null, null, null, null, null, null);
            if (query == null) {
                sQLiteDatabase.close();
                sQLiteDatabase2 = null;
            } else {
                sQLiteDatabase2 = sQLiteDatabase;
            }
            if (query != null) {
                while (query.moveToNext()) {
                    String string = query.getString(query.getColumnIndex("url"));
                    String substring = string.substring(string.lastIndexOf("/") + 1);
                    sQLiteDatabase2.execSQL("update update_item set mPinyin=? where url =?", new String[]{substring.substring(0, substring.lastIndexOf(".")), string});
                }
                query.close();
            }
        }
    }
}
