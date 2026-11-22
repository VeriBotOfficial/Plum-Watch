package com.bytedance.sdk.component.bh.fxn.fxn.fxn;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.sdk.component.bh.fxn.tw;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes13.dex */
public class hm extends SQLiteOpenHelper {
    final Context fxn;

    public hm(Context context) {
        super(context, "ttadlog.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.fxn = context;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            fxn(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }

    private void fxn(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.bh.fxn.fxn.fxn.fxn.fxn.kg(tw.sg().hm().kg()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.bh.fxn.fxn.fxn.fxn.hm.gff(tw.sg().hm().fxn()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.bh.fxn.fxn.fxn.fxn.sg.gff(tw.sg().hm().hm()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.bh.fxn.fxn.fxn.fxn.bh.fxn(tw.sg().hm().rb()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.bh.fxn.bh.bh.kg());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        try {
            if (i > i2) {
                kg(sQLiteDatabase);
                fxn(sQLiteDatabase);
            } else {
                fxn(sQLiteDatabase);
            }
        } catch (Throwable unused) {
        }
    }

    private void kg(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> gff = gff(sQLiteDatabase);
        if (gff == null || gff.size() <= 0) {
            return;
        }
        Iterator<String> it = gff.iterator();
        while (it.hasNext()) {
            sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s ;", it.next()));
        }
    }

    private ArrayList<String> gff(SQLiteDatabase sQLiteDatabase) {
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
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }
}
