package com.anythink.core.common.e;

import com.anythink.core.common.h.aq;

/* loaded from: classes12.dex */
public class k extends c<aq> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f3773a = "com.anythink.core.common.e.k";
    private static k b;
    private int c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f3774a = "request_info";
        public static final String b = "id";
        public static final String c = "req_type";
        public static final String d = "req_url";
        public static final String e = "req_head";
        public static final String f = "req_content";
        public static final String g = "time";
        public static final String h = "extra";
        public static final String i = "CREATE TABLE IF NOT EXISTS request_info(id TEXT, req_type INTEGER, req_url TEXT, req_head TEXT, req_content TEXT, time INTEGER, extra TEXT )";
    }

    private k(d dVar) {
        super(dVar);
        this.c = 1000;
    }

    public static k a(d dVar) {
        if (b == null) {
            synchronized (k.class) {
                if (b == null) {
                    b = new k(dVar);
                }
            }
        }
        return b;
    }

    private synchronized void b() {
        try {
            if (d() == null) {
                return;
            }
            d().delete(a.f3774a, null, null);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0027, code lost:
    
        if (r4 != null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0029, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003a, code lost:
    
        if (r4 == null) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized long a(com.anythink.core.common.h.aq r13) {
        /*
            r12 = this;
            monitor-enter(r12)
            android.database.sqlite.SQLiteDatabase r0 = r12.d()     // Catch: java.lang.Throwable -> L89
            r1 = -1
            if (r0 != 0) goto Lb
            monitor-exit(r12)
            return r1
        Lb:
            r3 = 0
            android.database.sqlite.SQLiteDatabase r4 = r12.c()     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L39
            java.lang.String r5 = "request_info"
            r10 = 0
            r11 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L39
            int r0 = r4.getCount()     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L3a
            int r5 = r12.c     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L3a
            if (r0 < r5) goto L27
            r12.b()     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L3a
        L27:
            if (r4 == 0) goto L3d
        L29:
            r4.close()     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L89
            goto L3d
        L2d:
            r0 = move-exception
            r13 = r0
            r3 = r4
            goto L33
        L31:
            r0 = move-exception
            r13 = r0
        L33:
            if (r3 == 0) goto L38
            r3.close()     // Catch: java.lang.Exception -> L38 java.lang.Throwable -> L89
        L38:
            throw r13     // Catch: java.lang.Throwable -> L89
        L39:
            r4 = r3
        L3a:
            if (r4 == 0) goto L3d
            goto L29
        L3d:
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch: java.lang.Exception -> L87 java.lang.Throwable -> L89
            r0.<init>()     // Catch: java.lang.Exception -> L87 java.lang.Throwable -> L89
            java.lang.String r4 = "id"
            java.lang.String r5 = r13.f3852a     // Catch: java.lang.Exception -> L87 java.lang.Throwable -> L89
            r0.put(r4, r5)     // Catch: java.lang.Exception -> L87 java.lang.Throwable -> L89
            java.lang.String r4 = "req_type"
            int r5 = r13.b     // Catch: java.lang.Exception -> L87 java.lang.Throwable -> L89
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Exception -> L87 java.lang.Throwable -> L89
            r0.put(r4, r5)     // Catch: java.lang.Exception -> L87 java.lang.Throwable -> L89
            java.lang.String r4 = "req_url"
            java.lang.String r5 = r13.d     // Catch: java.lang.Exception -> L87 java.lang.Throwable -> L89
            r0.put(r4, r5)     // Catch: java.lang.Exception -> L87 java.lang.Throwable -> L89
            java.lang.String r4 = "req_head"
            java.lang.String r5 = r13.c     // Catch: java.lang.Exception -> L87 java.lang.Throwable -> L89
            r0.put(r4, r5)     // Catch: java.lang.Exception -> L87 java.lang.Throwable -> L89
            java.lang.String r4 = "req_content"
            java.lang.String r5 = r13.e     // Catch: java.lang.Exception -> L87 java.lang.Throwable -> L89
            r0.put(r4, r5)     // Catch: java.lang.Exception -> L87 java.lang.Throwable -> L89
            java.lang.String r4 = "time"
            long r5 = r13.f     // Catch: java.lang.Exception -> L87 java.lang.Throwable -> L89
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Exception -> L87 java.lang.Throwable -> L89
            r0.put(r4, r5)     // Catch: java.lang.Exception -> L87 java.lang.Throwable -> L89
            java.lang.String r4 = "extra"
            java.lang.String r13 = r13.g     // Catch: java.lang.Exception -> L87 java.lang.Throwable -> L89
            r0.put(r4, r13)     // Catch: java.lang.Exception -> L87 java.lang.Throwable -> L89
            android.database.sqlite.SQLiteDatabase r13 = r12.d()     // Catch: java.lang.Exception -> L87 java.lang.Throwable -> L89
            java.lang.String r4 = "request_info"
            long r0 = r13.insert(r4, r3, r0)     // Catch: java.lang.Exception -> L87 java.lang.Throwable -> L89
            monitor-exit(r12)
            return r0
        L87:
            monitor-exit(r12)
            return r1
        L89:
            r0 = move-exception
            r13 = r0
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L89
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.e.k.a(com.anythink.core.common.h.aq):long");
    }

    public final synchronized int b(aq aqVar) {
        if (d() == null || aqVar == null) {
            return -1;
        }
        try {
            return d().delete(a.f3774a, "id=?", new String[]{aqVar.f3852a});
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ac, code lost:
    
        if (r1 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a0, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b3, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009e, code lost:
    
        if (r1 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0097, code lost:
    
        if (r1 == null) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.util.List<com.anythink.core.common.h.aq> a() {
        /*
            r10 = this;
            monitor-enter(r10)
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.c()     // Catch: java.lang.Throwable -> L96 java.lang.OutOfMemoryError -> L9a java.lang.Exception -> Lab
            java.lang.String r2 = "request_info"
            java.lang.String r8 = "time"
            java.lang.String r9 = "10"
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L96 java.lang.OutOfMemoryError -> L9a java.lang.Exception -> Lab
            if (r1 == 0) goto L8f
            int r2 = r1.getCount()     // Catch: java.lang.Throwable -> L97 java.lang.OutOfMemoryError -> L9b java.lang.Exception -> Lac
            if (r2 <= 0) goto L8f
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L97 java.lang.OutOfMemoryError -> L9b java.lang.Exception -> Lac
            r2.<init>()     // Catch: java.lang.Throwable -> L97 java.lang.OutOfMemoryError -> L9b java.lang.Exception -> Lac
        L22:
            boolean r3 = r1.moveToNext()     // Catch: java.lang.Throwable -> L97 java.lang.OutOfMemoryError -> L9b java.lang.Exception -> Lac
            if (r3 == 0) goto L85
            com.anythink.core.common.h.aq r3 = new com.anythink.core.common.h.aq     // Catch: java.lang.Throwable -> L97 java.lang.OutOfMemoryError -> L9b java.lang.Exception -> Lac
            r3.<init>()     // Catch: java.lang.Throwable -> L97 java.lang.OutOfMemoryError -> L9b java.lang.Exception -> Lac
            java.lang.String r4 = "id"
            int r4 = r1.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L97 java.lang.OutOfMemoryError -> L9b java.lang.Exception -> Lac
            java.lang.String r4 = r1.getString(r4)     // Catch: java.lang.Throwable -> L97 java.lang.OutOfMemoryError -> L9b java.lang.Exception -> Lac
            r3.f3852a = r4     // Catch: java.lang.Throwable -> L97 java.lang.OutOfMemoryError -> L9b java.lang.Exception -> Lac
            java.lang.String r4 = "req_type"
            int r4 = r1.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L97 java.lang.OutOfMemoryError -> L9b java.lang.Exception -> Lac
            int r4 = r1.getInt(r4)     // Catch: java.lang.Throwable -> L97 java.lang.OutOfMemoryError -> L9b java.lang.Exception -> Lac
            r3.b = r4     // Catch: java.lang.Throwable -> L97 java.lang.OutOfMemoryError -> L9b java.lang.Exception -> Lac
            java.lang.String r4 = "req_url"
            int r4 = r1.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L97 java.lang.OutOfMemoryError -> L9b java.lang.Exception -> Lac
            java.lang.String r4 = r1.getString(r4)     // Catch: java.lang.Throwable -> L97 java.lang.OutOfMemoryError -> L9b java.lang.Exception -> Lac
            r3.d = r4     // Catch: java.lang.Throwable -> L97 java.lang.OutOfMemoryError -> L9b java.lang.Exception -> Lac
            java.lang.String r4 = "req_head"
            int r4 = r1.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L97 java.lang.OutOfMemoryError -> L9b java.lang.Exception -> Lac
            java.lang.String r4 = r1.getString(r4)     // Catch: java.lang.Throwable -> L97 java.lang.OutOfMemoryError -> L9b java.lang.Exception -> Lac
            r3.c = r4     // Catch: java.lang.Throwable -> L97 java.lang.OutOfMemoryError -> L9b java.lang.Exception -> Lac
            java.lang.String r4 = "req_content"
            int r4 = r1.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L97 java.lang.OutOfMemoryError -> L9b java.lang.Exception -> Lac
            java.lang.String r4 = r1.getString(r4)     // Catch: java.lang.Throwable -> L97 java.lang.OutOfMemoryError -> L9b java.lang.Exception -> Lac
            r3.e = r4     // Catch: java.lang.Throwable -> L97 java.lang.OutOfMemoryError -> L9b java.lang.Exception -> Lac
            java.lang.String r4 = "time"
            int r4 = r1.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L97 java.lang.OutOfMemoryError -> L9b java.lang.Exception -> Lac
            long r4 = r1.getLong(r4)     // Catch: java.lang.Throwable -> L97 java.lang.OutOfMemoryError -> L9b java.lang.Exception -> Lac
            r3.f = r4     // Catch: java.lang.Throwable -> L97 java.lang.OutOfMemoryError -> L9b java.lang.Exception -> Lac
            java.lang.String r4 = "extra"
            int r4 = r1.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L97 java.lang.OutOfMemoryError -> L9b java.lang.Exception -> Lac
            java.lang.String r4 = r1.getString(r4)     // Catch: java.lang.Throwable -> L97 java.lang.OutOfMemoryError -> L9b java.lang.Exception -> Lac
            r3.g = r4     // Catch: java.lang.Throwable -> L97 java.lang.OutOfMemoryError -> L9b java.lang.Exception -> Lac
            r2.add(r3)     // Catch: java.lang.Throwable -> L97 java.lang.OutOfMemoryError -> L9b java.lang.Exception -> Lac
            goto L22
        L85:
            r1.close()     // Catch: java.lang.Throwable -> L97 java.lang.OutOfMemoryError -> L9b java.lang.Exception -> Lac
            if (r1 == 0) goto L8d
            r1.close()     // Catch: java.lang.Throwable -> Laf
        L8d:
            monitor-exit(r10)
            return r2
        L8f:
            if (r1 == 0) goto L94
            r1.close()     // Catch: java.lang.Throwable -> Laf
        L94:
            monitor-exit(r10)
            return r0
        L96:
            r1 = r0
        L97:
            if (r1 == 0) goto Lb2
            goto Lae
        L9a:
            r1 = r0
        L9b:
            java.lang.System.gc()     // Catch: java.lang.Throwable -> La4
            if (r1 == 0) goto Lb2
        La0:
            r1.close()     // Catch: java.lang.Throwable -> Laf
            goto Lb2
        La4:
            r0 = move-exception
            if (r1 == 0) goto Laa
            r1.close()     // Catch: java.lang.Throwable -> Laf
        Laa:
            throw r0     // Catch: java.lang.Throwable -> Laf
        Lab:
            r1 = r0
        Lac:
            if (r1 == 0) goto Lb2
        Lae:
            goto La0
        Laf:
            r0 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Laf
            throw r0
        Lb2:
            monitor-exit(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.e.k.a():java.util.List");
    }
}
