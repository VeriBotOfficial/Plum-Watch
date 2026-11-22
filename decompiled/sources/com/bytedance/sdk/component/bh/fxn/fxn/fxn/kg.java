package com.bytedance.sdk.component.bh.fxn.fxn.fxn;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.bytedance.sdk.component.bh.fxn.tw;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes13.dex */
class kg {
    private C0477kg fxn;
    private Context kg;

    kg(Context context) {
        try {
            this.kg = context.getApplicationContext();
            if (this.fxn == null) {
                this.fxn = new C0477kg();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: com.bytedance.sdk.component.bh.fxn.fxn.fxn.kg$kg, reason: collision with other inner class name */
    public class C0477kg {
        private volatile SQLiteDatabase kg = null;

        public C0477kg() {
        }

        private void fxn() {
            boolean kg;
            try {
                if (this.kg == null || !this.kg.isOpen()) {
                    synchronized (this) {
                        if (this.kg == null || !this.kg.isOpen()) {
                            this.kg = tw.sg().hm().fxn(tw.sg().bh());
                            this.kg.setLockingEnabled(false);
                        }
                    }
                }
            } finally {
                if (!kg) {
                }
            }
        }

        public void fxn(String str) throws SQLException {
            try {
                fxn();
                this.kg.execSQL(str);
            } catch (Throwable th) {
                if (kg()) {
                    throw th;
                }
            }
        }

        public Cursor fxn(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            try {
                fxn();
                return this.kg.query(str, strArr, str2, strArr2, str3, str4, str5);
            } catch (Throwable th) {
                fxn fxnVar = new fxn();
                if (kg()) {
                    throw th;
                }
                return fxnVar;
            }
        }

        public int fxn(String str, ContentValues contentValues, String str2, String[] strArr) {
            try {
                fxn();
                return this.kg.update(str, contentValues, str2, strArr);
            } catch (Exception e) {
                if (kg()) {
                    throw e;
                }
                return 0;
            }
        }

        public long fxn(String str, String str2, ContentValues contentValues) {
            try {
                fxn();
                return this.kg.insert(str, str2, contentValues);
            } catch (Exception e) {
                if (kg()) {
                    throw e;
                }
                return -1L;
            }
        }

        public synchronized void fxn(String str, String str2, List<com.bytedance.sdk.component.bh.fxn.hm.fxn> list) {
            JSONObject sg2;
            try {
                try {
                    fxn();
                    this.kg.beginTransaction();
                    ContentValues contentValues = new ContentValues();
                    for (int i = 0; i < list.size(); i++) {
                        com.bytedance.sdk.component.bh.fxn.hm.fxn fxnVar = list.get(i);
                        if (fxnVar != null && (sg2 = fxnVar.sg()) != null) {
                            contentValues.put("id", fxnVar.gff());
                            String kg = tw.sg().xdg().kg(sg2.toString());
                            if (!TextUtils.isEmpty(kg)) {
                                contentValues.put("value", kg);
                                contentValues.put("gen_time", Long.valueOf(System.currentTimeMillis()));
                                contentValues.put("retry", (Integer) 0);
                                contentValues.put("encrypt", (Integer) 1);
                                if (com.bytedance.sdk.component.bh.fxn.gff.fxn.hm() && fxnVar.hie() > 0 && (fxnVar.hm() == 0 || fxnVar.hm() == 3)) {
                                    contentValues.put("channel", Integer.valueOf(fxnVar.hie()));
                                }
                                this.kg.insert(str, str2, contentValues);
                            }
                            contentValues.clear();
                        }
                    }
                    this.kg.setTransactionSuccessful();
                    new StringBuilder().append(str).append(" insert list size=");
                    list.size();
                    if (this.kg != null) {
                        this.kg.endTransaction();
                    }
                } catch (Exception e) {
                    new StringBuilder().append(str).append(" insert list error=");
                    list.size();
                    if (kg()) {
                        throw e;
                    }
                    if (this.kg != null) {
                        this.kg.endTransaction();
                    }
                }
            } catch (Throwable th) {
                if (this.kg != null) {
                    this.kg.endTransaction();
                }
                throw th;
            }
        }

        public int fxn(String str, String str2, String[] strArr) {
            try {
                fxn();
                return this.kg.delete(str, str2, strArr);
            } catch (Exception e) {
                if (kg()) {
                    throw e;
                }
                return 0;
            }
        }

        private boolean kg() {
            SQLiteDatabase sQLiteDatabase = this.kg;
            return sQLiteDatabase != null && sQLiteDatabase.inTransaction();
        }
    }

    public C0477kg fxn() {
        return this.fxn;
    }

    private class fxn extends AbstractCursor {
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

        private fxn() {
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public String[] getColumnNames() {
            return new String[0];
        }
    }
}
