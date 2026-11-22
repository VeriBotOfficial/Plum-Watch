package com.autonavi.aps.amapapi.storage;

import android.database.sqlite.SQLiteDatabase;
import com.amap.api.col.p0003sl.ra;
import com.autonavi.aps.amapapi.utils.CoreUtil;

/* loaded from: classes12.dex */
public class SdCardDbCreator implements ra {
    public static final String FIELD_LASTLOC_ID = "a1";
    public static final String FIELD_LASTLOC_INFO = "a2";
    public static final String FIELD_LASTLOC_NB = "a4";
    public static final String FIELD_LASTLOC_TIME = "a3";
    public static final String TABLE_LASTLOC = "c";

    @Override // com.amap.api.col.p0003sl.ra
    public String getDBName() {
        return "alsn20170807.db";
    }

    @Override // com.amap.api.col.p0003sl.ra
    public int getVersion() {
        return 1;
    }

    public void initDataBase(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS c");
            onCreate(sQLiteDatabase);
        } catch (Throwable th) {
            CoreUtil.reportError(th, "SdCardDbCreator", "initDataBase");
        }
    }

    @Override // com.amap.api.col.p0003sl.ra
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS c (_id integer primary key autoincrement, a2 varchar(100), a4 varchar(2000), a3 LONG );");
        } catch (Throwable th) {
            CoreUtil.reportError(th, "SdCardDbCreator", "onCreate");
        }
    }

    @Override // com.amap.api.col.p0003sl.ra
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
