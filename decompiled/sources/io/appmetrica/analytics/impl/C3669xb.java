package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.xb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3669xb implements Oa, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f18578a = new HashMap();
    public final HashMap b = new HashMap();
    public final String c = "preferences";
    public final C3644wb d;
    public volatile boolean e;
    public final F6 f;

    public C3669xb(F6 f6) {
        this.f = f6;
        C3644wb c3644wb = new C3644wb(this, String.format(Locale.US, "IAA-DW-%s", Integer.valueOf(ThreadFactoryC3696yd.a())));
        this.d = c3644wb;
        c3644wb.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0029 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Integer] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(io.appmetrica.analytics.impl.C3669xb r15) {
        /*
            java.lang.String r0 = "type"
            java.lang.String r1 = "value"
            java.lang.String r2 = "key"
            r15.getClass()
            r3 = 0
            io.appmetrica.analytics.impl.F6 r4 = r15.f     // Catch: java.lang.Throwable -> L89
            android.database.sqlite.SQLiteDatabase r5 = r4.a()     // Catch: java.lang.Throwable -> L89
            if (r5 == 0) goto L8a
            java.lang.String r6 = r15.c     // Catch: java.lang.Throwable -> L8a
            r4 = 3
            java.lang.String[] r7 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L8a
            r8 = 0
            r7[r8] = r2     // Catch: java.lang.Throwable -> L8a
            r13 = 1
            r7[r13] = r1     // Catch: java.lang.Throwable -> L8a
            r14 = 2
            r7[r14] = r0     // Catch: java.lang.Throwable -> L8a
            r11 = 0
            r12 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            android.database.Cursor r6 = r5.query(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L8a
        L29:
            boolean r7 = r6.moveToNext()     // Catch: java.lang.Throwable -> L87
            if (r7 == 0) goto L87
            int r7 = r6.getColumnIndexOrThrow(r2)     // Catch: java.lang.Throwable -> L87
            java.lang.String r7 = r6.getString(r7)     // Catch: java.lang.Throwable -> L87
            int r8 = r6.getColumnIndexOrThrow(r1)     // Catch: java.lang.Throwable -> L87
            java.lang.String r8 = r6.getString(r8)     // Catch: java.lang.Throwable -> L87
            int r9 = r6.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L87
            int r9 = r6.getInt(r9)     // Catch: java.lang.Throwable -> L87
            boolean r10 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L87
            if (r10 != 0) goto L29
            if (r9 == r13) goto L6a
            if (r9 == r14) goto L65
            if (r9 == r4) goto L60
            r10 = 4
            if (r9 == r10) goto L7f
            r10 = 5
            if (r9 == r10) goto L5b
        L59:
            r8 = r3
            goto L7f
        L5b:
            java.lang.Float r8 = io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils.parseFloat(r8)     // Catch: java.lang.Throwable -> L87
            goto L7f
        L60:
            java.lang.Long r8 = io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils.parseLong(r8)     // Catch: java.lang.Throwable -> L87
            goto L7f
        L65:
            java.lang.Integer r8 = io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils.parseInt(r8)     // Catch: java.lang.Throwable -> L87
            goto L7f
        L6a:
            java.lang.String r9 = "true"
            boolean r9 = r9.equals(r8)     // Catch: java.lang.Throwable -> L87
            if (r9 == 0) goto L75
            java.lang.Boolean r8 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L87
            goto L7f
        L75:
            java.lang.String r9 = "false"
            boolean r8 = r9.equals(r8)     // Catch: java.lang.Throwable -> L87
            if (r8 == 0) goto L59
            java.lang.Boolean r8 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L87
        L7f:
            if (r8 == 0) goto L29
            java.util.HashMap r9 = r15.f18578a     // Catch: java.lang.Throwable -> L87
            r9.put(r7, r8)     // Catch: java.lang.Throwable -> L87
            goto L29
        L87:
            r3 = r6
            goto L8a
        L89:
            r5 = r3
        L8a:
            io.appmetrica.analytics.impl.In.a(r3)
            io.appmetrica.analytics.impl.F6 r15 = r15.f
            r15.a(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C3669xb.a(io.appmetrica.analytics.impl.xb):void");
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final void b() {
        synchronized (this.d) {
            this.d.notifyAll();
        }
    }

    public final void c() {
        if (this.e) {
            return;
        }
        try {
            this.f18578a.wait();
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.d.isRunning()) {
            this.d.stopRunning();
        }
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final boolean getBoolean(String str, boolean z) {
        Object b = b(str);
        return b instanceof Boolean ? ((Boolean) b).booleanValue() : z;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final int getInt(String str, int i) {
        Object b = b(str);
        return b instanceof Integer ? ((Integer) b).intValue() : i;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final long getLong(String str, long j) {
        Object b = b(str);
        return b instanceof Long ? ((Long) b).longValue() : j;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final String getString(String str, String str2) {
        Object b = b(str);
        return b instanceof String ? (String) b : str2;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final Oa remove(String str) {
        synchronized (this.f18578a) {
            c();
            this.f18578a.remove(str);
        }
        synchronized (this.d) {
            this.b.put(str, this);
            this.d.notifyAll();
        }
        return this;
    }

    public final Object b(String str) {
        Object obj;
        synchronized (this.f18578a) {
            c();
            obj = this.f18578a.get(str);
        }
        return obj;
    }

    public static void a(C3669xb c3669xb, HashMap hashMap) {
        SQLiteDatabase sQLiteDatabase;
        c3669xb.getClass();
        int size = hashMap.size();
        ContentValues[] contentValuesArr = new ContentValues[size];
        int i = 0;
        for (Map.Entry entry : hashMap.entrySet()) {
            ContentValues contentValues = new ContentValues();
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            contentValues.put("key", str);
            if (value == c3669xb) {
                contentValues.putNull("value");
            } else if (value instanceof String) {
                contentValues.put("value", (String) value);
                contentValues.put("type", (Integer) 4);
            } else if (value instanceof Long) {
                contentValues.put("value", (Long) value);
                contentValues.put("type", (Integer) 3);
            } else if (value instanceof Integer) {
                contentValues.put("value", (Integer) value);
                contentValues.put("type", (Integer) 2);
            } else if (value instanceof Boolean) {
                contentValues.put("value", String.valueOf(((Boolean) value).booleanValue()));
                contentValues.put("type", (Integer) 1);
            } else if (value instanceof Float) {
                contentValues.put("value", (Float) value);
                contentValues.put("type", (Integer) 5);
            }
            contentValuesArr[i] = contentValues;
            i++;
        }
        SQLiteDatabase sQLiteDatabase2 = null;
        try {
            sQLiteDatabase = c3669xb.f.a();
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.beginTransaction();
                    for (int i2 = 0; i2 < size; i2++) {
                        ContentValues contentValues2 = contentValuesArr[i2];
                        if (contentValues2.getAsString("value") == null) {
                            sQLiteDatabase.delete(c3669xb.c, "key = ?", new String[]{contentValues2.getAsString("key")});
                        } else {
                            sQLiteDatabase.insertWithOnConflict(c3669xb.c, null, contentValues2, 5);
                        }
                    }
                    sQLiteDatabase.setTransactionSuccessful();
                } catch (Throwable unused) {
                    sQLiteDatabase2 = sQLiteDatabase;
                    if (sQLiteDatabase2 != null) {
                        try {
                            sQLiteDatabase2.endTransaction();
                        } catch (Throwable unused2) {
                        }
                    }
                    sQLiteDatabase = sQLiteDatabase2;
                    c3669xb.f.a(sQLiteDatabase);
                }
            }
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.endTransaction();
                } catch (Throwable unused3) {
                }
            }
        } catch (Throwable unused4) {
        }
        c3669xb.f.a(sQLiteDatabase);
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final synchronized Oa a(String str, String str2) {
        a(str, (Object) str2);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final Oa a(String str, long j) {
        a(str, Long.valueOf(j));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final synchronized Oa a(int i, String str) {
        a(str, Integer.valueOf(i));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final Oa a(String str, boolean z) {
        a(str, Boolean.valueOf(z));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final Oa a(String str, float f) {
        a(str, Float.valueOf(f));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final boolean a(String str) {
        boolean containsKey;
        synchronized (this.f18578a) {
            c();
            containsKey = this.f18578a.containsKey(str);
        }
        return containsKey;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final Set a() {
        HashSet hashSet;
        synchronized (this.f18578a) {
            hashSet = new HashSet(this.f18578a.keySet());
        }
        return hashSet;
    }

    public final void a(String str, Object obj) {
        synchronized (this.f18578a) {
            c();
            this.f18578a.put(str, obj);
        }
        synchronized (this.d) {
            this.b.put(str, obj);
            this.d.notifyAll();
        }
    }
}
