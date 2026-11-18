package com.amap.api.col.p0003sl;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: compiled from: DBCreator.java */
/* JADX INFO: loaded from: classes7.dex */
public interface ra {
    String getDBName();

    int getVersion();

    void onCreate(SQLiteDatabase sQLiteDatabase);

    void onUpgrade(SQLiteDatabase sQLiteDatabase, int r2, int r3);
}
