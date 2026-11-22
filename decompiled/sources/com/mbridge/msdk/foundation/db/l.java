package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;

/* compiled from: UnitIDDao.java */
/* loaded from: classes17.dex */
public class l extends a<com.mbridge.msdk.foundation.entity.h> {

    /* renamed from: a, reason: collision with root package name */
    private static l f11517a;

    private l(f fVar) {
        super(fVar);
    }

    public static l a(f fVar) {
        if (f11517a == null) {
            synchronized (l.class) {
                if (f11517a == null) {
                    f11517a = new l(fVar);
                }
            }
        }
        return f11517a;
    }

    public synchronized void a(String str) {
        if (getWritableDatabase() != null) {
            getWritableDatabase().delete("unit_id", "unitId = ?", new String[]{str + ""});
        }
    }

    public synchronized void a(String str, String str2, int i) {
        if (getWritableDatabase() == null) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("placement_id", str);
        contentValues.put("unitId", str2);
        contentValues.put("ad_type", Integer.valueOf(i));
        getWritableDatabase().insert("unit_id", null, contentValues);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0056, code lost:
    
        if (r0 != null) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized java.util.List<com.mbridge.msdk.foundation.entity.i> a(int r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.lang.String r0 = "select * from unit_id WHERE ad_type = ?"
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r6.getReadableDatabase()     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            java.lang.String r4 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            android.database.Cursor r0 = r2.rawQuery(r0, r3)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            if (r0 == 0) goto L56
            int r2 = r0.getCount()     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L52
            if (r2 <= 0) goto L56
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L52
            int r3 = r0.getCount()     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L52
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L52
        L27:
            boolean r1 = r0.moveToNext()     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L4f
            if (r1 == 0) goto L4b
            java.lang.String r1 = "placement_id"
            int r1 = r0.getColumnIndex(r1)     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L4f
            java.lang.String r1 = r0.getString(r1)     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L4f
            java.lang.String r3 = "unitId"
            int r3 = r0.getColumnIndex(r3)     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L4f
            java.lang.String r3 = r0.getString(r3)     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L4f
            com.mbridge.msdk.foundation.entity.i r4 = new com.mbridge.msdk.foundation.entity.i     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L4f
            r4.<init>(r1, r3, r7)     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L4f
            r2.add(r4)     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L4f
            goto L27
        L4b:
            r1 = r2
            goto L56
        L4d:
            r7 = move-exception
            goto L54
        L4f:
            r7 = move-exception
            r1 = r0
            goto L6b
        L52:
            r7 = move-exception
            r2 = r1
        L54:
            r1 = r0
            goto L5d
        L56:
            if (r0 == 0) goto L69
            goto L64
        L59:
            r7 = move-exception
            goto L6b
        L5b:
            r7 = move-exception
            r2 = r1
        L5d:
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L59
            if (r1 == 0) goto L68
            r0 = r1
            r1 = r2
        L64:
            r0.close()     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L71
            goto L69
        L68:
            r1 = r2
        L69:
            monitor-exit(r6)
            return r1
        L6b:
            if (r1 == 0) goto L70
            r1.close()     // Catch: java.lang.Exception -> L70 java.lang.Throwable -> L71
        L70:
            throw r7     // Catch: java.lang.Throwable -> L71
        L71:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L71
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.l.a(int):java.util.List");
    }
}
