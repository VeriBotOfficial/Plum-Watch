package com.bytedance.sdk.openadsdk.rmu.fxn;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import com.bytedance.sdk.component.utils.dx;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes14.dex */
public class fxn extends SQLiteOpenHelper {
    private static volatile fxn kg;
    final Context fxn;

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private static fxn gff() {
        if (kg == null) {
            synchronized (fxn.class) {
                if (kg == null) {
                    kg = new fxn(com.bytedance.sdk.openadsdk.rmu.fxn.fxn());
                }
            }
        }
        return kg;
    }

    public static SQLiteDatabase fxn() {
        try {
            fxn gff = gff();
            if (gff == null) {
                return null;
            }
            SQLiteDatabase writableDatabase = gff.getWritableDatabase();
            if (writableDatabase.isOpen()) {
                return writableDatabase;
            }
            return null;
        } catch (Throwable th) {
            Log.i("MonitorSQLiteOpenHelper", th.getMessage());
            return null;
        }
    }

    public static SQLiteDatabase kg() {
        try {
            fxn gff = gff();
            if (gff == null) {
                return null;
            }
            SQLiteDatabase readableDatabase = gff.getReadableDatabase();
            if (readableDatabase.isOpen()) {
                return readableDatabase;
            }
            return null;
        } catch (Throwable th) {
            Log.i("MonitorSQLiteOpenHelper", th.getMessage());
            return null;
        }
    }

    private fxn(Context context) {
        super(context, "pag_monitor.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.fxn = context;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS monitor_table (_id INTEGER PRIMARY KEY AUTOINCREMENT,sdk_version TEXT ,scene TEXT ,start_count INTEGER default 0 , success_count INTEGER default 0  , fail_count INTEGER default 0  , rit TEXT  , tag TEXT  , label TEXT  , timestamp INTEGER default 0 ,mediation TEXT  , is_init INTEGER , extra TEXT )");
        } catch (Throwable th) {
            Log.e("MonitorSQLiteOpenHelper", th.getMessage());
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        try {
            if (i > i2) {
                fxn(sQLiteDatabase);
                onCreate(sQLiteDatabase);
            } else {
                onCreate(sQLiteDatabase);
            }
        } catch (Throwable unused) {
        }
    }

    private void fxn(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> kg2 = kg(sQLiteDatabase);
        if (kg2 == null || kg2.size() <= 0) {
            return;
        }
        Iterator<String> it = kg2.iterator();
        while (it.hasNext()) {
            sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s ;", it.next()));
        }
    }

    private ArrayList<String> kg(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            Cursor rawQuery = sQLiteDatabase.rawQuery("select name from sqlite_master where type='table' order by name", null);
            if (rawQuery != null) {
                while (rawQuery.moveToNext()) {
                    String string = rawQuery.getString(0);
                    if (!string.equals("android_metadata") && !string.equals("sqlite_sequence")) {
                        arrayList.add(string);
                    }
                }
                rawQuery.close();
                return arrayList;
            }
        } catch (Exception e) {
            dx.gff("MonitorSQLiteOpenHelper", e.getMessage());
        }
        return arrayList;
    }
}
