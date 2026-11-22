package com.anythink.core.common.e;

import android.content.ContentValues;
import com.anythink.core.common.h.at;

/* loaded from: classes12.dex */
public class l extends c<at> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f3775a = "com.anythink.core.common.e.l";
    private static volatile l b;
    private int c;
    private int d;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f3776a = "inspect_info";
        public static final String b = "inspect_id";
        public static final String c = "update_time";
        public static final String d = "inspect_result";
        public static final String e = "pgk_name";
        public static final String f = "CREATE TABLE IF NOT EXISTS inspect_info(inspect_id TEXT, inspect_result INTEGER, pgk_name TEXT, update_time INTEGER )";
        public static final String g = "CREATE TABLE IF NOT EXISTS inspect_info(inspect_id TEXT, update_time INTEGER )";
        public static final String h = "ALTER TABLE inspect_info ADD COLUMN inspect_result INTEGER DEFAULT 1";
        public static final String i = "ALTER TABLE inspect_info DROP COLUMN pgk_name";
    }

    private l(d dVar) {
        super(dVar);
        this.c = 500;
        this.d = -1627869184;
    }

    public static l a(d dVar) {
        if (b == null) {
            synchronized (l.class) {
                if (b == null) {
                    b = new l(dVar);
                }
            }
        }
        return b;
    }

    public final synchronized long a(String str, boolean z) {
        if (d() == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(a.b, str);
            contentValues.put(a.d, Integer.valueOf(z ? 1 : 2));
            contentValues.put("update_time", Long.valueOf(System.currentTimeMillis()));
            if (a(str)) {
                return d().update(a.f3776a, contentValues, "inspect_id = ? ", new String[]{str});
            }
            return d().insert(a.f3776a, null, contentValues);
        } catch (Exception unused) {
            return -1L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        if (r11 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0036, code lost:
    
        if (r11 == null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized boolean a(java.lang.String r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            r0 = 0
            if (r11 != 0) goto L6
            monitor-exit(r10)
            return r0
        L6:
            android.database.sqlite.SQLiteDatabase r1 = r10.c()     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = "inspect_info"
            r9 = 1
            java.lang.String[] r3 = new java.lang.String[r9]     // Catch: java.lang.Throwable -> L35
            java.lang.String r4 = "inspect_id"
            r3[r0] = r4     // Catch: java.lang.Throwable -> L35
            java.lang.String r4 = "inspect_id=?"
            java.lang.String[] r5 = new java.lang.String[r9]     // Catch: java.lang.Throwable -> L35
            r5[r0] = r11     // Catch: java.lang.Throwable -> L35
            r7 = 0
            r8 = 0
            r6 = 0
            android.database.Cursor r11 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L35
            if (r11 == 0) goto L32
            int r1 = r11.getCount()     // Catch: java.lang.Throwable -> L36
            if (r1 <= 0) goto L32
            r11.close()     // Catch: java.lang.Throwable -> L36
            if (r11 == 0) goto L30
            r11.close()     // Catch: java.lang.Throwable -> L3c
        L30:
            monitor-exit(r10)
            return r9
        L32:
            if (r11 == 0) goto L40
            goto L38
        L35:
            r11 = 0
        L36:
            if (r11 == 0) goto L40
        L38:
            r11.close()     // Catch: java.lang.Throwable -> L3c
            goto L40
        L3c:
            r0 = move-exception
            r11 = r0
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L3c
            throw r11
        L40:
            monitor-exit(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.e.l.a(java.lang.String):boolean");
    }

    private synchronized void b(String str) {
        try {
            d().delete(a.f3776a, "inspect_id = ? ", new String[]{str});
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if (r0 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x003b, code lost:
    
        if (r0 != null) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void a() {
        /*
            r12 = this;
            monitor-enter(r12)
            r0 = 0
            r1 = -1
            android.database.sqlite.SQLiteDatabase r3 = r12.c()     // Catch: java.lang.Throwable -> L3b java.lang.OutOfMemoryError -> L3e java.lang.Exception -> L51
            java.lang.String r4 = "inspect_info"
            java.lang.String r10 = "update_time DESC"
            int r5 = r12.c     // Catch: java.lang.Throwable -> L3b java.lang.OutOfMemoryError -> L3e java.lang.Exception -> L51
            java.lang.String r11 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L3b java.lang.OutOfMemoryError -> L3e java.lang.Exception -> L51
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r0 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L3b java.lang.OutOfMemoryError -> L3e java.lang.Exception -> L51
            if (r0 == 0) goto L35
            int r3 = r0.getCount()     // Catch: java.lang.Throwable -> L3b java.lang.OutOfMemoryError -> L3e java.lang.Exception -> L51
            int r4 = r12.c     // Catch: java.lang.Throwable -> L3b java.lang.OutOfMemoryError -> L3e java.lang.Exception -> L51
            if (r3 < r4) goto L35
            r0.moveToLast()     // Catch: java.lang.Throwable -> L3b java.lang.OutOfMemoryError -> L3e java.lang.Exception -> L51
            java.lang.String r3 = "update_time"
            int r3 = r0.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L3b java.lang.OutOfMemoryError -> L3e java.lang.Exception -> L51
            long r1 = r0.getLong(r3)     // Catch: java.lang.Throwable -> L3b java.lang.OutOfMemoryError -> L3e java.lang.Exception -> L51
            r0.close()     // Catch: java.lang.Throwable -> L3b java.lang.OutOfMemoryError -> L3e java.lang.Exception -> L51
        L35:
            if (r0 == 0) goto L54
        L37:
            r0.close()     // Catch: java.lang.Throwable -> L84
            goto L54
        L3b:
            if (r0 == 0) goto L54
            goto L37
        L3e:
            r2 = r1
            r1 = r0
            java.lang.System.gc()     // Catch: java.lang.Throwable -> L4a
            if (r1 == 0) goto L48
            r1.close()     // Catch: java.lang.Throwable -> L84
        L48:
            r1 = r2
            goto L54
        L4a:
            r0 = move-exception
            if (r1 == 0) goto L50
            r1.close()     // Catch: java.lang.Throwable -> L84
        L50:
            throw r0     // Catch: java.lang.Throwable -> L84
        L51:
            if (r0 == 0) goto L54
            goto L37
        L54:
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L84
            int r0 = r12.d     // Catch: java.lang.Throwable -> L84
            long r5 = (long) r0
            long r3 = r3 - r5
            r5 = 0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L66
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L67
        L66:
            r1 = r3
        L67:
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L82
            android.database.sqlite.SQLiteDatabase r0 = r12.d()     // Catch: java.lang.Throwable -> L82
            java.lang.String r3 = "inspect_info"
            java.lang.String r4 = "update_time<?"
            r5 = 1
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L82
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L82
            r2 = 0
            r5[r2] = r1     // Catch: java.lang.Throwable -> L82
            r0.delete(r3, r4, r5)     // Catch: java.lang.Throwable -> L82
            monitor-exit(r12)
            return
        L82:
            monitor-exit(r12)
            return
        L84:
            r0 = move-exception
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L84
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.e.l.a():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x006d, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0080, code lost:
    
        if (r1 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0075, code lost:
    
        if (r1 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x006b, code lost:
    
        if (r1 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0067, code lost:
    
        if (r1 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0087, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.util.List<com.anythink.core.common.h.at> b() {
        /*
            r10 = this;
            monitor-enter(r10)
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.c()     // Catch: java.lang.Throwable -> L6a java.lang.OutOfMemoryError -> L71 java.lang.Exception -> L7f
            java.lang.String r2 = "inspect_info"
            r8 = 0
            r9 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L6a java.lang.OutOfMemoryError -> L71 java.lang.Exception -> L7f
            if (r1 == 0) goto L67
            int r2 = r1.getCount()     // Catch: java.lang.Throwable -> L6b java.lang.OutOfMemoryError -> L72 java.lang.Exception -> L80
            if (r2 <= 0) goto L67
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L6b java.lang.OutOfMemoryError -> L72 java.lang.Exception -> L80
            r2.<init>()     // Catch: java.lang.Throwable -> L6b java.lang.OutOfMemoryError -> L72 java.lang.Exception -> L80
        L20:
            boolean r3 = r1.moveToNext()     // Catch: java.lang.Throwable -> L6b java.lang.OutOfMemoryError -> L72 java.lang.Exception -> L80
            if (r3 == 0) goto L5d
            com.anythink.core.common.h.at r3 = new com.anythink.core.common.h.at     // Catch: java.lang.Throwable -> L20
            r3.<init>()     // Catch: java.lang.Throwable -> L20
            java.lang.String r4 = "inspect_id"
            int r4 = r1.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L20
            java.lang.String r4 = r1.getString(r4)     // Catch: java.lang.Throwable -> L20
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L20
            if (r5 == 0) goto L3c
            goto L20
        L3c:
            java.lang.String r5 = "inspect_result"
            int r5 = r1.getColumnIndex(r5)     // Catch: java.lang.Throwable -> L20
            int r5 = r1.getInt(r5)     // Catch: java.lang.Throwable -> L20
            java.lang.String r6 = "update_time"
            int r6 = r1.getColumnIndex(r6)     // Catch: java.lang.Throwable -> L20
            long r6 = r1.getLong(r6)     // Catch: java.lang.Throwable -> L20
            r3.a(r4)     // Catch: java.lang.Throwable -> L20
            r3.a(r5)     // Catch: java.lang.Throwable -> L20
            r3.a(r6)     // Catch: java.lang.Throwable -> L20
            r2.add(r3)     // Catch: java.lang.Throwable -> L20
            goto L20
        L5d:
            r1.close()     // Catch: java.lang.Throwable -> L6b java.lang.OutOfMemoryError -> L72 java.lang.Exception -> L80
            if (r1 == 0) goto L65
            r1.close()     // Catch: java.lang.Throwable -> L83
        L65:
            monitor-exit(r10)
            return r2
        L67:
            if (r1 == 0) goto L86
            goto L82
        L6a:
            r1 = r0
        L6b:
            if (r1 == 0) goto L86
        L6d:
            r1.close()     // Catch: java.lang.Throwable -> L83
            goto L86
        L71:
            r1 = r0
        L72:
            java.lang.System.gc()     // Catch: java.lang.Throwable -> L78
            if (r1 == 0) goto L86
            goto L82
        L78:
            r0 = move-exception
            if (r1 == 0) goto L7e
            r1.close()     // Catch: java.lang.Throwable -> L83
        L7e:
            throw r0     // Catch: java.lang.Throwable -> L83
        L7f:
            r1 = r0
        L80:
            if (r1 == 0) goto L86
        L82:
            goto L6d
        L83:
            r0 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L83
            throw r0
        L86:
            monitor-exit(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.e.l.b():java.util.List");
    }
}
