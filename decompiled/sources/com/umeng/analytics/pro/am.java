package com.umeng.analytics.pro;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteOpenHelper;
import com.umeng.commonsdk.debug.UMRTLog;

/* compiled from: CacheDBHelper.java */
/* loaded from: classes2.dex */
public class am extends SQLiteOpenHelper {
    private static final Object b = new Object();
    private static am c = null;
    private static final String d = "CREATE TABLE IF NOT EXISTS stf(_id INTEGER PRIMARY KEY AUTOINCREMENT, _tp TEXT, _hd TEXT, _bd TEXT, _ts TEXT, _uuid TEXT, _re1 TEXT, _re2 TEXT)";
    private static final String e = "DROP TABLE IF EXISTS stf";
    private static final String f = "DELETE FROM stf WHERE _id IN( SELECT _id FROM stf ORDER BY _id LIMIT 1)";

    /* renamed from: a, reason: collision with root package name */
    private final Context f13790a;

    public static final int a() {
        return 1;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public static am a(Context context) {
        am amVar;
        synchronized (b) {
            if (c == null) {
                c = new am(context, ao.b, null, 1);
            }
            amVar = c;
        }
        return amVar;
    }

    private am(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(context, str, cursorFactory, i);
        this.f13790a = context;
    }

    private void a(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL(e);
            sQLiteDatabase.execSQL(d);
        } catch (SQLException unused) {
        }
    }

    private void b(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL(d);
        } catch (SQLiteDatabaseCorruptException unused) {
            a(sQLiteDatabase);
        } catch (Throwable th) {
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> [有状态]创建二级缓存数据库失败: " + th.getMessage());
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        b(sQLiteDatabase);
    }

    public void b() {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null || !writableDatabase.isOpen()) {
                return;
            }
            writableDatabase.close();
        } catch (Throwable unused) {
        }
    }

    public void a(String str, ContentValues contentValues) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null || !writableDatabase.isOpen()) {
                return;
            }
            try {
                writableDatabase.beginTransaction();
                writableDatabase.insert(str, null, contentValues);
                writableDatabase.setTransactionSuccessful();
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> [有状态]插入二级缓存数据记录 成功。");
                if (writableDatabase == null) {
                    return;
                }
            } catch (Throwable unused) {
                if (writableDatabase == null) {
                    return;
                }
            }
            writableDatabase.endTransaction();
            writableDatabase.close();
        } catch (Throwable unused2) {
        }
    }

    public void a(String str, String str2, String[] strArr) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null || !writableDatabase.isOpen()) {
                return;
            }
            try {
                writableDatabase.beginTransaction();
                writableDatabase.delete(str, str2, strArr);
                writableDatabase.setTransactionSuccessful();
                if (writableDatabase == null) {
                    return;
                }
            } catch (Throwable unused) {
                if (writableDatabase == null) {
                    return;
                }
            }
            writableDatabase.endTransaction();
            writableDatabase.close();
        } catch (Throwable unused2) {
        }
    }

    private void d() {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null || !writableDatabase.isOpen()) {
                return;
            }
            try {
                writableDatabase.execSQL(f);
                if (writableDatabase == null) {
                    return;
                }
            } catch (Throwable unused) {
                if (writableDatabase == null) {
                    return;
                }
            }
            writableDatabase.close();
        } catch (Throwable unused2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008a A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.umeng.analytics.pro.an a(java.lang.String r17) {
        /*
            r16 = this;
            r0 = 6
            r10 = 0
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L82
            java.lang.String r0 = "_uuid"
            r11 = 0
            r3[r11] = r0     // Catch: java.lang.Throwable -> L82
            java.lang.String r0 = "_tp"
            r12 = 1
            r3[r12] = r0     // Catch: java.lang.Throwable -> L82
            java.lang.String r0 = "_hd"
            r13 = 2
            r3[r13] = r0     // Catch: java.lang.Throwable -> L82
            java.lang.String r0 = "_bd"
            r14 = 3
            r3[r14] = r0     // Catch: java.lang.Throwable -> L82
            java.lang.String r0 = "_re1"
            r15 = 4
            r3[r15] = r0     // Catch: java.lang.Throwable -> L82
            java.lang.String r0 = "_re2"
            r1 = 5
            r3[r1] = r0     // Catch: java.lang.Throwable -> L82
            java.lang.String r9 = "1"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r2 = r17
            r0 = r1
            r1 = r16
            android.database.Cursor r2 = r1.a(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L84
            if (r2 == 0) goto L7c
            boolean r3 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L79
            if (r3 == 0) goto L7c
            com.umeng.analytics.pro.an r3 = new com.umeng.analytics.pro.an     // Catch: java.lang.Throwable -> L79
            r3.<init>()     // Catch: java.lang.Throwable -> L79
            java.lang.String r4 = r2.getString(r11)     // Catch: java.lang.Throwable -> L7a
            r3.f13791a = r4     // Catch: java.lang.Throwable -> L7a
            java.lang.String r4 = r2.getString(r12)     // Catch: java.lang.Throwable -> L7a
            r3.b = r4     // Catch: java.lang.Throwable -> L7a
            java.lang.String r4 = r2.getString(r13)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r5 = r2.getString(r14)     // Catch: java.lang.Throwable -> L7a
            android.content.Context r6 = r1.f13790a     // Catch: java.lang.Throwable -> L7a
            com.umeng.analytics.pro.i r6 = com.umeng.analytics.pro.i.a(r6)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r4 = r6.d(r4)     // Catch: java.lang.Throwable -> L7a
            r3.c = r4     // Catch: java.lang.Throwable -> L7a
            android.content.Context r4 = r1.f13790a     // Catch: java.lang.Throwable -> L7a
            com.umeng.analytics.pro.i r4 = com.umeng.analytics.pro.i.a(r4)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r4 = r4.d(r5)     // Catch: java.lang.Throwable -> L7a
            r3.d = r4     // Catch: java.lang.Throwable -> L7a
            java.lang.String r4 = r2.getString(r15)     // Catch: java.lang.Throwable -> L7a
            r3.e = r4     // Catch: java.lang.Throwable -> L7a
            java.lang.String r0 = r2.getString(r0)     // Catch: java.lang.Throwable -> L7a
            r3.f = r0     // Catch: java.lang.Throwable -> L7a
            r10 = r3
            goto L7c
        L79:
            r3 = r10
        L7a:
            r10 = r2
            goto L85
        L7c:
            if (r2 == 0) goto L81
            r2.close()
        L81:
            return r10
        L82:
            r1 = r16
        L84:
            r3 = r10
        L85:
            r1.d()     // Catch: java.lang.Throwable -> L8e
            if (r10 == 0) goto L8d
            r10.close()
        L8d:
            return r3
        L8e:
            r0 = move-exception
            if (r10 == 0) goto L94
            r10.close()
        L94:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.am.a(java.lang.String):com.umeng.analytics.pro.an");
    }

    public void a(String str, String str2) {
        a(str, "_uuid=?", new String[]{str2});
    }

    public Cursor a(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null || !writableDatabase.isOpen()) {
                return null;
            }
            return writableDatabase.query(str, strArr, str2, strArr2, str3, str4, str5, str6);
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean b(String str) {
        SQLiteDatabase sQLiteDatabase;
        Cursor cursor = null;
        try {
            sQLiteDatabase = getWritableDatabase();
            if (sQLiteDatabase != null) {
                try {
                    if (sQLiteDatabase.isOpen()) {
                        cursor = sQLiteDatabase.query(str, null, null, null, null, null, null, null);
                    }
                } catch (Throwable unused) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (sQLiteDatabase == null) {
                        return false;
                    }
                    sQLiteDatabase.close();
                    return false;
                }
            }
            if (cursor != null) {
                if (cursor.getCount() > 0) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                    }
                    return true;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            if (sQLiteDatabase == null) {
                return false;
            }
        } catch (Throwable unused2) {
            sQLiteDatabase = null;
        }
        sQLiteDatabase.close();
        return false;
    }

    public boolean c() {
        return !b(ao.c);
    }
}
