package com.bytedance.sdk.openadsdk.core;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public class bh {
    private static final Object gff = new Object();
    private gff fxn;
    private Context kg;

    bh(Context context) {
        try {
            this.kg = context == null ? rmu.fxn() : context.getApplicationContext();
            if (this.fxn == null) {
                this.fxn = new gff();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context gff() {
        Context context = this.kg;
        return context == null ? rmu.fxn() : context;
    }

    public class gff {
        private SQLiteDatabase kg = null;

        public gff() {
        }

        private synchronized void rb() {
            try {
                synchronized (bh.gff) {
                    SQLiteDatabase sQLiteDatabase = this.kg;
                    if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
                        bh bhVar = bh.this;
                        SQLiteDatabase writableDatabase = bhVar.new fxn(bhVar.gff()).getWritableDatabase();
                        this.kg = writableDatabase;
                        writableDatabase.setLockingEnabled(false);
                    }
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.dx.gff("DBHelper", th.getMessage());
                if (bh()) {
                    throw th;
                }
            }
        }

        public SQLiteDatabase fxn() {
            rb();
            return this.kg;
        }

        public synchronized void fxn(String str) throws SQLException {
            try {
                rb();
                this.kg.execSQL(str);
            } catch (Throwable th) {
                if (bh()) {
                    throw th;
                }
            }
        }

        public synchronized Cursor fxn(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            Cursor cursor;
            try {
                rb();
                cursor = this.kg.query(str, strArr, str2, strArr2, str3, str4, str5);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.dx.gff("DBHelper", th.getMessage());
                kg kgVar = new kg();
                if (bh()) {
                    throw th;
                }
                cursor = kgVar;
            }
            return cursor;
        }

        public synchronized int fxn(String str, ContentValues contentValues, String str2, String[] strArr) {
            int i;
            try {
                rb();
                i = this.kg.update(str, contentValues, str2, strArr);
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.dx.gff("DBHelper", e.getMessage());
                if (bh()) {
                    throw e;
                }
                i = 0;
            }
            return i;
        }

        public synchronized long fxn(String str, String str2, ContentValues contentValues) {
            long j;
            try {
                rb();
                j = this.kg.replace(str, str2, contentValues);
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.dx.gff("DBHelper", e.getMessage());
                if (bh()) {
                    throw e;
                }
                j = -1;
            }
            return j;
        }

        public synchronized int fxn(String str, String str2, String[] strArr) {
            int i;
            try {
                rb();
                i = this.kg.delete(str, str2, strArr);
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.dx.gff("DBHelper", e.getMessage());
                if (bh()) {
                    throw e;
                }
                i = 0;
            }
            return i;
        }

        public synchronized void kg() {
            rb();
            SQLiteDatabase sQLiteDatabase = this.kg;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.beginTransaction();
        }

        public synchronized void gff() {
            rb();
            SQLiteDatabase sQLiteDatabase = this.kg;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.setTransactionSuccessful();
        }

        public synchronized void hm() {
            rb();
            SQLiteDatabase sQLiteDatabase = this.kg;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.endTransaction();
        }

        private synchronized boolean bh() {
            SQLiteDatabase sQLiteDatabase = this.kg;
            if (sQLiteDatabase != null) {
                if (sQLiteDatabase.inTransaction()) {
                    return true;
                }
            }
            return false;
        }
    }

    private class fxn extends SQLiteOpenHelper {
        final Context fxn;

        public fxn(Context context) {
            super(context, "ttopensdk.db", (SQLiteDatabase.CursorFactory) null, 11);
            this.fxn = context;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                fxn(sQLiteDatabase, this.fxn);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.dx.gff("DBHelper", th.getMessage());
            }
        }

        private void fxn(SQLiteDatabase sQLiteDatabase, Context context) {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.hm.hm.fxn());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.hm.hie.gff());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.hm.ckl.fxn());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.hm.zu.fxn());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.bx.kg.fxn());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.hm.rmu.gff());
            sQLiteDatabase.execSQL(com.bytedance.sdk.component.adexpress.fxn.kg.kg.gff());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.core.dgx.fxn.gff.gff());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.hm.xdg.fxn());
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (i > i2) {
                try {
                    gff(sQLiteDatabase);
                    fxn(sQLiteDatabase, bh.this.kg);
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.dx.gff(th.getMessage(), new Object[0]);
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (i > i2) {
                try {
                    gff(sQLiteDatabase);
                } catch (Throwable unused) {
                }
            }
            fxn(sQLiteDatabase, bh.this.kg);
            switch (i) {
                case 1:
                    fxn(sQLiteDatabase);
                    break;
                case 2:
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'ad_video_info';");
                    fxn(sQLiteDatabase);
                    break;
                case 3:
                    sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.hm.ckl.fxn());
                    fxn(sQLiteDatabase);
                    break;
                case 4:
                    sQLiteDatabase.execSQL(com.bytedance.sdk.component.adexpress.fxn.kg.kg.gff());
                    fxn(sQLiteDatabase);
                    break;
                case 5:
                    sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.hm.zu.fxn());
                    fxn(sQLiteDatabase);
                    break;
                case 6:
                    fxn(sQLiteDatabase);
                    break;
            }
            if (i < 11) {
                try {
                    kg(sQLiteDatabase);
                    com.bytedance.sdk.openadsdk.bx.kg.fxn(sQLiteDatabase);
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.dx.gff("DBHelper", th.getMessage());
                }
            }
        }

        private void fxn(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.hm.hm.kg());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.hm.hie.hm());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.hm.ckl.kg());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.hm.zu.kg());
        }

        private void kg(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.core.dgx.fxn.gff.hm());
        }

        private void gff(SQLiteDatabase sQLiteDatabase) {
            ArrayList<String> hm = hm(sQLiteDatabase);
            if (hm == null || hm.size() <= 0) {
                return;
            }
            Iterator<String> it = hm.iterator();
            while (it.hasNext()) {
                sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s ;", it.next()));
            }
        }

        private ArrayList<String> hm(SQLiteDatabase sQLiteDatabase) {
            ArrayList<String> arrayList = new ArrayList<>();
            Cursor cursor = null;
            try {
                cursor = sQLiteDatabase.rawQuery("select name from sqlite_master where type='table' order by name", null);
                if (cursor != null) {
                    while (cursor.moveToNext()) {
                        String string = cursor.getString(0);
                        if (!string.equals("android_metadata") && !string.equals("sqlite_sequence")) {
                            arrayList.add(string);
                        }
                    }
                }
                if (cursor != null) {
                    cursor.close();
                    return arrayList;
                }
            } catch (Exception unused) {
                if (cursor != null) {
                    cursor.close();
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
            return arrayList;
        }
    }

    public gff fxn() {
        return this.fxn;
    }

    private class kg extends AbstractCursor {
        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getCount() {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public double getDouble(int i) {
            return 0.0d;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public float getFloat(int i) {
            return 0.0f;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getInt(int i) {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public long getLong(int i) {
            return 0L;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public short getShort(int i) {
            return (short) 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public String getString(int i) {
            return null;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public boolean isNull(int i) {
            return true;
        }

        private kg() {
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public String[] getColumnNames() {
            return new String[0];
        }
    }
}
