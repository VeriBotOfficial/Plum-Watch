package com.amap.api.col.p0003sl;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: DBCreator.java */
/* loaded from: classes11.dex */
public interface ra {
    String getDBName();

    int getVersion();

    void onCreate(SQLiteDatabase sQLiteDatabase);

    void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2);
}
