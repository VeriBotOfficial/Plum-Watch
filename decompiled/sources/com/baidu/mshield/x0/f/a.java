package com.baidu.mshield.x0.f;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.baidu.mshield.x0.d.d;

/* compiled from: VolcanoDb.java */
/* loaded from: classes13.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static a f8459a;
    public C0390a d;
    public SQLiteDatabase e;
    public String b = "msvolcano.db";
    public int c = 1;
    public String f = "msal";
    public String g = "CREATE TABLE IF NOT EXISTS " + this.f + "(a TEXT PRIMARY KEY ON CONFLICT ABORT,b INTEGER,c TEXT)";

    /* compiled from: VolcanoDb.java */
    /* renamed from: com.baidu.mshield.x0.f.a$a, reason: collision with other inner class name */
    public class C0390a extends SQLiteOpenHelper {
        public C0390a(Context context) {
            super(context, a.this.b, (SQLiteDatabase.CursorFactory) null, a.this.c);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                sQLiteDatabase.execSQL(a.this.g);
            } catch (Throwable th) {
                d.a(th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }
    }

    public a(Context context) {
        try {
            context.getApplicationContext();
            C0390a c0390a = new C0390a(context.getApplicationContext());
            this.d = c0390a;
            this.e = c0390a.getWritableDatabase();
        } catch (Throwable th) {
            d.a(th);
        }
    }

    public static synchronized a a(Context context) {
        a aVar;
        synchronized (a.class) {
            if (f8459a == null) {
                f8459a = new a(context);
            }
            aVar = f8459a;
        }
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0036, code lost:
    
        if (r9.isClosed() == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(java.lang.String r12) {
        /*
            r11 = this;
            android.database.sqlite.SQLiteDatabase r0 = r11.e
            r8 = 0
            if (r0 != 0) goto L6
            return r8
        L6:
            r9 = 0
            java.lang.String r1 = r11.f     // Catch: java.lang.Throwable -> L2b
            java.lang.String r3 = "a=?"
            r10 = 1
            java.lang.String[] r4 = new java.lang.String[r10]     // Catch: java.lang.Throwable -> L2b
            r4[r8] = r12     // Catch: java.lang.Throwable -> L2b
            r6 = 0
            r7 = 0
            r2 = 0
            r5 = 0
            android.database.Cursor r9 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L2b
            if (r9 == 0) goto L21
            int r12 = r9.getCount()     // Catch: java.lang.Throwable -> L2b
            if (r12 <= 0) goto L21
            r8 = r10
        L21:
            if (r9 == 0) goto L2a
            boolean r12 = r9.isClosed()
            if (r12 != 0) goto L2a
            goto L38
        L2a:
            return r8
        L2b:
            r0 = move-exception
            r12 = r0
            com.baidu.mshield.x0.d.d.a(r12)     // Catch: java.lang.Throwable -> L3c
            if (r9 == 0) goto L3b
            boolean r12 = r9.isClosed()
            if (r12 != 0) goto L3b
        L38:
            r9.close()
        L3b:
            return r8
        L3c:
            r0 = move-exception
            r12 = r0
            if (r9 == 0) goto L49
            boolean r0 = r9.isClosed()
            if (r0 != 0) goto L49
            r9.close()
        L49:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.mshield.x0.f.a.b(java.lang.String):boolean");
    }

    public int a(com.baidu.mshield.x0.d.a aVar) {
        if (aVar != null && this.e != null) {
            try {
                String b = d.b(aVar.f8448a);
                if (!TextUtils.isEmpty(b)) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("a", b);
                    contentValues.put("b", Integer.valueOf(aVar.b));
                    contentValues.put("c", Long.valueOf(aVar.c));
                    return b(b) ? this.e.update(this.f, contentValues, "a= ?", new String[]{b}) : (int) this.e.insert(this.f, null, contentValues);
                }
            } catch (Throwable th) {
                d.a(th);
            }
        }
        return 0;
    }

    public com.baidu.mshield.x0.d.a a(String str) {
        Cursor cursor;
        com.baidu.mshield.x0.d.a aVar;
        String b;
        com.baidu.mshield.x0.d.a aVar2 = null;
        if (this.e != null) {
            try {
                b = d.b(str);
            } catch (Throwable th) {
                th = th;
                cursor = null;
            }
            if (!TextUtils.isEmpty(b)) {
                cursor = this.e.query(this.f, null, "a=?", new String[]{b}, null, null, null);
                if (cursor != null) {
                    try {
                        if (cursor.getCount() > 0) {
                            while (cursor.moveToNext()) {
                                aVar = new com.baidu.mshield.x0.d.a();
                                try {
                                    aVar.f8448a = d.a(cursor.getString(cursor.getColumnIndex("a")));
                                    aVar.b = cursor.getInt(cursor.getColumnIndex("b"));
                                    aVar.c = Long.parseLong(cursor.getString(cursor.getColumnIndex("c")));
                                    aVar2 = aVar;
                                } catch (Throwable th2) {
                                    th = th2;
                                    try {
                                        d.a(th);
                                        if (cursor == null && !cursor.isClosed()) {
                                            aVar2 = aVar;
                                            cursor.close();
                                            return aVar2;
                                        }
                                    } catch (Throwable th3) {
                                        if (cursor != null && !cursor.isClosed()) {
                                            cursor.close();
                                        }
                                        throw th3;
                                    }
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        aVar = aVar2;
                        d.a(th);
                        return cursor == null ? aVar : aVar;
                    }
                }
                if (cursor == null || cursor.isClosed()) {
                    return aVar2;
                }
                cursor.close();
                return aVar2;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        if (r1.isClosed() == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.baidu.mshield.x0.d.a> a() {
        /*
            r11 = this;
            android.database.sqlite.SQLiteDatabase r0 = r11.e
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            android.database.sqlite.SQLiteDatabase r3 = r11.e     // Catch: java.lang.Throwable -> L66
            java.lang.String r4 = r11.f     // Catch: java.lang.Throwable -> L66
            java.lang.String r10 = "b DESC"
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r1 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L66
            if (r1 == 0) goto L5d
            int r0 = r1.getCount()     // Catch: java.lang.Throwable -> L66
            if (r0 <= 0) goto L5d
        L22:
            boolean r0 = r1.moveToNext()     // Catch: java.lang.Throwable -> L66
            if (r0 == 0) goto L5d
            com.baidu.mshield.x0.d.a r0 = new com.baidu.mshield.x0.d.a     // Catch: java.lang.Throwable -> L66
            r0.<init>()     // Catch: java.lang.Throwable -> L66
            java.lang.String r3 = "a"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L66
            java.lang.String r3 = r1.getString(r3)     // Catch: java.lang.Throwable -> L66
            java.lang.String r3 = com.baidu.mshield.x0.d.d.a(r3)     // Catch: java.lang.Throwable -> L66
            r0.f8448a = r3     // Catch: java.lang.Throwable -> L66
            java.lang.String r3 = "b"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L66
            int r3 = r1.getInt(r3)     // Catch: java.lang.Throwable -> L66
            r0.b = r3     // Catch: java.lang.Throwable -> L66
            java.lang.String r3 = "c"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L66
            java.lang.String r3 = r1.getString(r3)     // Catch: java.lang.Throwable -> L66
            long r3 = java.lang.Long.parseLong(r3)     // Catch: java.lang.Throwable -> L66
            r0.c = r3     // Catch: java.lang.Throwable -> L66
            r2.add(r0)     // Catch: java.lang.Throwable -> L66
            goto L22
        L5d:
            if (r1 == 0) goto L75
            boolean r0 = r1.isClosed()
            if (r0 != 0) goto L75
            goto L72
        L66:
            r0 = move-exception
            com.baidu.mshield.x0.d.d.a(r0)     // Catch: java.lang.Throwable -> L76
            if (r1 == 0) goto L75
            boolean r0 = r1.isClosed()
            if (r0 != 0) goto L75
        L72:
            r1.close()
        L75:
            return r2
        L76:
            r0 = move-exception
            if (r1 == 0) goto L82
            boolean r2 = r1.isClosed()
            if (r2 != 0) goto L82
            r1.close()
        L82:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.mshield.x0.f.a.a():java.util.List");
    }
}
