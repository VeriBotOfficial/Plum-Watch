package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.out.Campaign;

/* compiled from: DailyPlayCapDao.java */
/* loaded from: classes17.dex */
public class h extends a<Campaign> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11513a = "com.mbridge.msdk.foundation.db.h";
    private static h b;

    private h(f fVar) {
        super(fVar);
    }

    public static h a(f fVar) {
        if (b == null) {
            synchronized (h.class) {
                if (b == null) {
                    b = new h(fVar);
                }
            }
        }
        return b;
    }

    private synchronized void c(String str) {
        try {
        } catch (Throwable unused) {
            o0.c(f11513a, "resetTimeAndTimestamp error");
        }
        if (getWritableDatabase() == null) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("first_insert_timestamp", (Integer) 0);
        contentValues.put("play_time", (Integer) 0);
        getWritableDatabase().update("dailyplaycap", contentValues, "unit_id = ?", new String[]{str});
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ad, code lost:
    
        if (r1 != null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b8, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b6, code lost:
    
        if (0 == 0) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void b(java.lang.String r21) {
        /*
            r20 = this;
            r0 = r21
            monitor-enter(r20)
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r20.getWritableDatabase()     // Catch: java.lang.Throwable -> Lb0 java.lang.Exception -> Lb2
            if (r2 != 0) goto Lc
            monitor-exit(r20)
            return
        Lc:
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch: java.lang.Throwable -> Lb0 java.lang.Exception -> Lb2
            r2.<init>()     // Catch: java.lang.Throwable -> Lb0 java.lang.Exception -> Lb2
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lb0 java.lang.Exception -> Lb2
            boolean r5 = r20.a(r21)     // Catch: java.lang.Throwable -> Lb0 java.lang.Exception -> Lb2
            if (r5 == 0) goto L8a
            java.lang.String r5 = "SELECT * FROM dailyplaycap where unit_id = ?"
            android.database.sqlite.SQLiteDatabase r8 = r20.getReadableDatabase()     // Catch: java.lang.Throwable -> Lb0 java.lang.Exception -> Lb2
            r9 = 1
            java.lang.String[] r10 = new java.lang.String[r9]     // Catch: java.lang.Throwable -> Lb0 java.lang.Exception -> Lb2
            r11 = 0
            r10[r11] = r0     // Catch: java.lang.Throwable -> Lb0 java.lang.Exception -> Lb2
            android.database.Cursor r1 = r8.rawQuery(r5, r10)     // Catch: java.lang.Throwable -> Lb0 java.lang.Exception -> Lb2
            r12 = 0
            if (r1 == 0) goto L5d
            int r5 = r1.getCount()     // Catch: java.lang.Throwable -> Lb0 java.lang.Exception -> Lb2
            if (r5 <= 0) goto L5d
            r1.moveToFirst()     // Catch: java.lang.Throwable -> Lb0 java.lang.Exception -> Lb2
            java.lang.String r5 = "first_insert_timestamp"
            int r5 = r1.getColumnIndex(r5)     // Catch: java.lang.Throwable -> Lb0 java.lang.Exception -> Lb2
            long r14 = r1.getLong(r5)     // Catch: java.lang.Throwable -> Lb0 java.lang.Exception -> Lb2
            java.lang.String r5 = "play_time"
            int r5 = r1.getColumnIndex(r5)     // Catch: java.lang.Throwable -> Lb0 java.lang.Exception -> Lb2
            int r5 = r1.getInt(r5)     // Catch: java.lang.Throwable -> Lb0 java.lang.Exception -> Lb2
            r16 = 1
            long r6 = (long) r5     // Catch: java.lang.Throwable -> Lb0 java.lang.Exception -> Lb2
            r18 = 86400000(0x5265c00, double:4.2687272E-316)
            long r18 = r3 - r18
            int r5 = (r18 > r14 ? 1 : (r18 == r14 ? 0 : -1))
            if (r5 <= 0) goto L61
            r20.c(r21)     // Catch: java.lang.Throwable -> Lb0 java.lang.Exception -> Lb2
            r6 = r12
            goto L61
        L5d:
            r16 = 1
            r6 = r12
            r14 = r6
        L61:
            int r5 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r5 != 0) goto L6e
            java.lang.String r5 = "first_insert_timestamp"
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> Lb0 java.lang.Exception -> Lb2
            r2.put(r5, r3)     // Catch: java.lang.Throwable -> Lb0 java.lang.Exception -> Lb2
        L6e:
            java.lang.String r3 = "play_time"
            long r6 = r6 + r16
            java.lang.Long r4 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> Lb0 java.lang.Exception -> Lb2
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> Lb0 java.lang.Exception -> Lb2
            java.lang.String r3 = "unit_id = ?"
            android.database.sqlite.SQLiteDatabase r4 = r20.getWritableDatabase()     // Catch: java.lang.Throwable -> Lb0 java.lang.Exception -> Lb2
            java.lang.String r5 = "dailyplaycap"
            java.lang.String[] r6 = new java.lang.String[r9]     // Catch: java.lang.Throwable -> Lb0 java.lang.Exception -> Lb2
            r6[r11] = r0     // Catch: java.lang.Throwable -> Lb0 java.lang.Exception -> Lb2
            r4.update(r5, r2, r3, r6)     // Catch: java.lang.Throwable -> Lb0 java.lang.Exception -> Lb2
            goto Lad
        L8a:
            r16 = 1
            java.lang.String r5 = "first_insert_timestamp"
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> Lb0 java.lang.Exception -> Lb2
            r2.put(r5, r3)     // Catch: java.lang.Throwable -> Lb0 java.lang.Exception -> Lb2
            java.lang.String r3 = "play_time"
            java.lang.Long r4 = java.lang.Long.valueOf(r16)     // Catch: java.lang.Throwable -> Lb0 java.lang.Exception -> Lb2
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> Lb0 java.lang.Exception -> Lb2
            java.lang.String r3 = "unit_id"
            r2.put(r3, r0)     // Catch: java.lang.Throwable -> Lb0 java.lang.Exception -> Lb2
            android.database.sqlite.SQLiteDatabase r0 = r20.getWritableDatabase()     // Catch: java.lang.Throwable -> Lb0 java.lang.Exception -> Lb2
            java.lang.String r3 = "dailyplaycap"
            r0.insert(r3, r1, r2)     // Catch: java.lang.Throwable -> Lb0 java.lang.Exception -> Lb2
        Lad:
            if (r1 == 0) goto Lbb
            goto Lb8
        Lb0:
            r0 = move-exception
            goto Lbd
        Lb2:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Throwable -> Lb0
            if (r1 == 0) goto Lbb
        Lb8:
            r1.close()     // Catch: java.lang.Throwable -> Lbb
        Lbb:
            monitor-exit(r20)
            return
        Lbd:
            if (r1 == 0) goto Lc2
            r1.close()     // Catch: java.lang.Throwable -> Lc2
        Lc2:
            throw r0     // Catch: java.lang.Throwable -> Lc3
        Lc3:
            r0 = move-exception
            monitor-exit(r20)     // Catch: java.lang.Throwable -> Lc3
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.h.b(java.lang.String):void");
    }

    public synchronized boolean a(String str) {
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT play_time FROM dailyplaycap WHERE unit_id= ?", new String[]{str});
            if (rawQuery != null && rawQuery.getCount() > 0) {
                rawQuery.close();
                return true;
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x006b, code lost:
    
        if (r1 == null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(java.lang.String r13, int r14) {
        /*
            r12 = this;
            java.lang.String r0 = "isOverCap is error"
            r1 = 0
            r2 = 0
            java.lang.String r3 = "SELECT * FROM dailyplaycap where unit_id = ?"
            android.database.sqlite.SQLiteDatabase r4 = r12.getReadableDatabase()     // Catch: java.lang.Throwable -> L58
            r5 = 1
            java.lang.String[] r6 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L58
            r6[r2] = r13     // Catch: java.lang.Throwable -> L58
            android.database.Cursor r1 = r4.rawQuery(r3, r6)     // Catch: java.lang.Throwable -> L58
            if (r1 == 0) goto L54
            int r3 = r1.getCount()     // Catch: java.lang.Throwable -> L58
            if (r3 <= 0) goto L54
            boolean r3 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L58
            if (r3 == 0) goto L54
            java.lang.String r3 = "first_insert_timestamp"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L58
            long r3 = r1.getLong(r3)     // Catch: java.lang.Throwable -> L58
            java.lang.String r6 = "play_time"
            int r6 = r1.getColumnIndex(r6)     // Catch: java.lang.Throwable -> L58
            int r6 = r1.getInt(r6)     // Catch: java.lang.Throwable -> L58
            long r6 = (long) r6     // Catch: java.lang.Throwable -> L58
            r8 = 0
            int r8 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r8 == 0) goto L54
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L58
            r10 = 86400000(0x5265c00, double:4.2687272E-316)
            long r8 = r8 - r10
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 <= 0) goto L4c
            r12.c(r13)     // Catch: java.lang.Throwable -> L58
            goto L54
        L4c:
            if (r14 <= 0) goto L54
            long r13 = (long) r14
            int r13 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r13 < 0) goto L54
            r2 = r5
        L54:
            if (r1 == 0) goto L57
            goto L6d
        L57:
            return r2
        L58:
            r13 = move-exception
            java.lang.String r14 = com.mbridge.msdk.foundation.db.h.f11513a     // Catch: java.lang.Throwable -> L71
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L71
            java.lang.StringBuilder r13 = r3.append(r13)     // Catch: java.lang.Throwable -> L71
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L71
            com.mbridge.msdk.foundation.tools.o0.c(r14, r13)     // Catch: java.lang.Throwable -> L71
            if (r1 == 0) goto L70
        L6d:
            r1.close()     // Catch: java.lang.Throwable -> L70
        L70:
            return r2
        L71:
            r13 = move-exception
            if (r1 == 0) goto L77
            r1.close()     // Catch: java.lang.Throwable -> L77
        L77:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.h.a(java.lang.String, int):boolean");
    }
}
