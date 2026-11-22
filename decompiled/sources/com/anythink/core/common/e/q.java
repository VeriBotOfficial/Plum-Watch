package com.anythink.core.common.e;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;

/* loaded from: classes12.dex */
public class q extends c<com.anythink.core.common.a.n> {
    private static volatile q b;

    /* renamed from: a, reason: collision with root package name */
    private final String f3786a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f3787a = "video_res_cache_info";
        public static final String b = "video_url";
        public static final String c = "file_path";
        public static final String d = "ready_rate";
        public static final String e = "download_size";
        public static final String f = "total_size";
        public static final String g = "update_time";
        public static final String h = "CREATE TABLE IF NOT EXISTS video_res_cache_info(video_url TEXT, file_path TEXT, ready_rate INTEGER, download_size INTEGER, total_size INTEGER, update_time INTEGER )";
    }

    private q(d dVar) {
        super(dVar);
        this.f3786a = "q";
    }

    public static q a(d dVar) {
        if (b == null) {
            synchronized (o.class) {
                if (b == null) {
                    b = new q(dVar);
                }
            }
        }
        return b;
    }

    public final synchronized void a(String str, String str2, long j, long j2, int i) {
        if (!TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(str2)) {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("video_url", str);
                    contentValues.put("file_path", str2);
                    contentValues.put("ready_rate", Integer.valueOf(i));
                    contentValues.put(a.e, Long.valueOf(j2));
                    contentValues.put(a.f, Long.valueOf(j));
                    contentValues.put("update_time", Long.valueOf(System.currentTimeMillis()));
                    if (e(str)) {
                        d().update(a.f3787a, contentValues, "video_url = ? ", new String[]{str});
                    } else {
                        d().insert(a.f3787a, null, contentValues);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006f, code lost:
    
        if (r1 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0078, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0075, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
    
        if (r1 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.anythink.core.common.a.n a(java.lang.String r10) {
        /*
            r9 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r9.c()     // Catch: java.lang.Throwable -> L72
            java.lang.String r2 = "video_res_cache_info"
            java.lang.String r4 = "video_url=?"
            r3 = 1
            java.lang.String[] r5 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L72
            r3 = 0
            r5[r3] = r10     // Catch: java.lang.Throwable -> L72
            r7 = 0
            r8 = 0
            r3 = 0
            r6 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L72
            boolean r2 = r1.moveToNext()     // Catch: java.lang.Throwable -> L73
            if (r2 == 0) goto L6f
            com.anythink.core.common.a.n r2 = new com.anythink.core.common.a.n     // Catch: java.lang.Throwable -> L73
            r2.<init>()     // Catch: java.lang.Throwable -> L73
            r2.a(r10)     // Catch: java.lang.Throwable -> L73
            java.lang.String r10 = "file_path"
            int r10 = r1.getColumnIndex(r10)     // Catch: java.lang.Throwable -> L73
            java.lang.String r10 = r1.getString(r10)     // Catch: java.lang.Throwable -> L73
            r2.b(r10)     // Catch: java.lang.Throwable -> L73
            java.lang.String r10 = "ready_rate"
            int r10 = r1.getColumnIndex(r10)     // Catch: java.lang.Throwable -> L73
            int r10 = r1.getInt(r10)     // Catch: java.lang.Throwable -> L73
            r2.a(r10)     // Catch: java.lang.Throwable -> L73
            java.lang.String r10 = "download_size"
            int r10 = r1.getColumnIndex(r10)     // Catch: java.lang.Throwable -> L73
            long r3 = r1.getLong(r10)     // Catch: java.lang.Throwable -> L73
            r2.b(r3)     // Catch: java.lang.Throwable -> L73
            java.lang.String r10 = "total_size"
            int r10 = r1.getColumnIndex(r10)     // Catch: java.lang.Throwable -> L73
            long r3 = r1.getLong(r10)     // Catch: java.lang.Throwable -> L73
            r2.a(r3)     // Catch: java.lang.Throwable -> L73
            java.lang.String r10 = "update_time"
            int r10 = r1.getColumnIndex(r10)     // Catch: java.lang.Throwable -> L73
            long r3 = r1.getLong(r10)     // Catch: java.lang.Throwable -> L73
            r2.c(r3)     // Catch: java.lang.Throwable -> L73
            r1.close()     // Catch: java.lang.Throwable -> L73
            if (r1 == 0) goto L6e
            r1.close()
        L6e:
            return r2
        L6f:
            if (r1 == 0) goto L78
            goto L75
        L72:
            r1 = r0
        L73:
            if (r1 == 0) goto L78
        L75:
            r1.close()
        L78:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.e.q.a(java.lang.String):com.anythink.core.common.a.n");
    }

    public final void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("update_time", Long.valueOf(System.currentTimeMillis()));
            d().update(a.f3787a, contentValues, "video_url = ? ", new String[]{str});
        } catch (Throwable unused) {
        }
    }

    public final long a() {
        Cursor cursor = null;
        try {
            cursor = c().query(a.f3787a, new String[]{"sum(download_size)"}, null, null, null, null, null);
        } catch (Throwable th) {
            try {
                th.getMessage();
                if (cursor == null) {
                    return 0L;
                }
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }
        if (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            cursor.close();
            return j;
        }
        if (cursor == null) {
            return 0L;
        }
        cursor.close();
        return 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00af, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b0, code lost:
    
        r0.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c0, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00bd, code lost:
    
        if (r2 == null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.anythink.core.common.a.n> b() {
        /*
            r11 = this;
            java.lang.String r0 = "update_time"
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r11.c()     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r4 = "video_res_cache_info"
            java.lang.String r10 = "update_time DESC"
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> Lb9
            int r3 = r2.getCount()     // Catch: java.lang.Throwable -> Lb9
            if (r3 <= 0) goto Lb3
            int r3 = r2.getCount()     // Catch: java.lang.Throwable -> Lb9
            double r3 = (double) r3     // Catch: java.lang.Throwable -> Lb9
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r3 * r5
            double r3 = r3 + r5
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r3 = r3 / r5
            long r3 = java.lang.Math.round(r3)     // Catch: java.lang.Throwable -> Lb9
            int r3 = (int) r3     // Catch: java.lang.Throwable -> Lb9
            r4 = 1
            int r3 = r3 - r4
            boolean r3 = r2.moveToPosition(r3)     // Catch: java.lang.Throwable -> Lb9
            if (r3 == 0) goto Lb3
            int r3 = r2.getColumnIndex(r0)     // Catch: java.lang.Throwable -> Lb9
            long r5 = r2.getLong(r3)     // Catch: java.lang.Throwable -> Lb9
        L40:
            com.anythink.core.common.a.n r3 = new com.anythink.core.common.a.n     // Catch: java.lang.Throwable -> Lb9
            r3.<init>()     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r7 = "video_url"
            int r7 = r2.getColumnIndex(r7)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r7 = r2.getString(r7)     // Catch: java.lang.Throwable -> Lb9
            r3.a(r7)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r7 = "file_path"
            int r7 = r2.getColumnIndex(r7)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r7 = r2.getString(r7)     // Catch: java.lang.Throwable -> Lb9
            r3.b(r7)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r7 = "ready_rate"
            int r7 = r2.getColumnIndex(r7)     // Catch: java.lang.Throwable -> Lb9
            int r7 = r2.getInt(r7)     // Catch: java.lang.Throwable -> Lb9
            r3.a(r7)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r7 = "download_size"
            int r7 = r2.getColumnIndex(r7)     // Catch: java.lang.Throwable -> Lb9
            long r7 = r2.getLong(r7)     // Catch: java.lang.Throwable -> Lb9
            r3.b(r7)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r7 = "total_size"
            int r7 = r2.getColumnIndex(r7)     // Catch: java.lang.Throwable -> Lb9
            long r7 = r2.getLong(r7)     // Catch: java.lang.Throwable -> Lb9
            r3.a(r7)     // Catch: java.lang.Throwable -> Lb9
            int r7 = r2.getColumnIndex(r0)     // Catch: java.lang.Throwable -> Lb9
            long r7 = r2.getLong(r7)     // Catch: java.lang.Throwable -> Lb9
            r3.c(r7)     // Catch: java.lang.Throwable -> Lb9
            r1.add(r3)     // Catch: java.lang.Throwable -> Lb9
            boolean r3 = r2.moveToNext()     // Catch: java.lang.Throwable -> Lb9
            if (r3 != 0) goto L40
            android.database.sqlite.SQLiteDatabase r0 = r11.d()     // Catch: java.lang.Throwable -> Laf
            java.lang.String r3 = "video_res_cache_info"
            java.lang.String r7 = "update_time<=?"
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> Laf
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> Laf
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.Throwable -> Laf
            r0.delete(r3, r7, r4)     // Catch: java.lang.Throwable -> Laf
            goto Lb3
        Laf:
            r0 = move-exception
            r0.getMessage()     // Catch: java.lang.Throwable -> Lb9
        Lb3:
            if (r2 == 0) goto Lc0
        Lb5:
            r2.close()
            goto Lc0
        Lb9:
            r0 = move-exception
            r0.getMessage()     // Catch: java.lang.Throwable -> Lc1
            if (r2 == 0) goto Lc0
            goto Lb5
        Lc0:
            return r1
        Lc1:
            r0 = move-exception
            if (r2 == 0) goto Lc7
            r2.close()
        Lc7:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.e.q.b():java.util.List");
    }

    private void d(String str) {
        Cursor cursor = null;
        try {
            cursor = c().query(a.f3787a, null, null, null, null, null, null);
            cursor.getCount();
        } catch (Throwable th) {
            try {
                th.getMessage();
                if (cursor != null) {
                    cursor.close();
                }
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }
    }

    public final void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            d().delete(a.f3787a, "video_url=?", new String[]{str});
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0037, code lost:
    
        if (r11 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        if (r11 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003c, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean e(java.lang.String r11) {
        /*
            r10 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            android.database.sqlite.SQLiteDatabase r2 = r10.c()     // Catch: java.lang.Throwable -> L36
            java.lang.String r3 = "video_res_cache_info"
            r0 = 1
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L36
            java.lang.String r5 = "video_url"
            r4[r1] = r5     // Catch: java.lang.Throwable -> L36
            java.lang.String r5 = "video_url=?"
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L36
            r6[r1] = r11     // Catch: java.lang.Throwable -> L36
            r8 = 0
            r9 = 0
            r7 = 0
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L36
            if (r11 == 0) goto L33
            int r2 = r11.getCount()     // Catch: java.lang.Throwable -> L37
            if (r2 <= 0) goto L33
            r11.close()     // Catch: java.lang.Throwable -> L37
            if (r11 == 0) goto L32
            r11.close()
        L32:
            return r0
        L33:
            if (r11 == 0) goto L3c
            goto L39
        L36:
            r11 = 0
        L37:
            if (r11 == 0) goto L3c
        L39:
            r11.close()
        L3c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.e.q.e(java.lang.String):boolean");
    }
}
