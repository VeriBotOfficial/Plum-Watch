package com.anythink.core.common.e;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public class h extends c<com.anythink.core.common.a.k> {
    private static volatile h b;

    /* renamed from: a, reason: collision with root package name */
    private final String f3767a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f3768a = "dsp_offer_install_record";
        public static final String b = "dsp_id";
        public static final String c = "dsp_offer_id";
        public static final String d = "package_name";
        public static final String e = "last_update_time";
        public static final String f = "CREATE TABLE IF NOT EXISTS dsp_offer_install_record(dsp_id TEXT ,dsp_offer_id TEXT ,package_name TEXT ,last_update_time INTEGER)";
    }

    private h(d dVar) {
        super(dVar);
        this.f3767a = h.class.getName();
    }

    public static h a(d dVar) {
        if (b == null) {
            synchronized (h.class) {
                if (b == null) {
                    b = new h(dVar);
                }
            }
        }
        return b;
    }

    public final synchronized long a(com.anythink.core.common.a.k kVar) {
        if (d() == null) {
            return -1L;
        }
        if (!a(kVar.a(), kVar.b())) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("dsp_id", kVar.a());
                contentValues.put("dsp_offer_id", kVar.b());
                contentValues.put("package_name", kVar.c());
                contentValues.put("last_update_time", Long.valueOf(System.currentTimeMillis()));
                kVar.a();
                kVar.b();
                kVar.c();
                return d().insert(a.f3768a, null, contentValues);
            } catch (Exception unused) {
            }
        } else {
            kVar.a();
            kVar.b();
            kVar.c();
        }
        return -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        if (r1 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
    
        if (r1 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0039, code lost:
    
        if (r1 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0030, code lost:
    
        if (r1 != null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized boolean a(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            r0 = 0
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r10.c()     // Catch: java.lang.Throwable -> L30 java.lang.OutOfMemoryError -> L36 java.lang.Exception -> L44
            java.lang.String r3 = "dsp_offer_install_record"
            java.lang.String r5 = "dsp_id = ?  AND dsp_offer_id = ? "
            r4 = 2
            java.lang.String[] r6 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L30 java.lang.OutOfMemoryError -> L36 java.lang.Exception -> L44
            r6[r0] = r11     // Catch: java.lang.Throwable -> L30 java.lang.OutOfMemoryError -> L36 java.lang.Exception -> L44
            r11 = 1
            r6[r11] = r12     // Catch: java.lang.Throwable -> L30 java.lang.OutOfMemoryError -> L36 java.lang.Exception -> L44
            r8 = 0
            r9 = 0
            r4 = 0
            r7 = 0
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L30 java.lang.OutOfMemoryError -> L36 java.lang.Exception -> L44
            if (r1 == 0) goto L2d
            int r12 = r1.getCount()     // Catch: java.lang.Throwable -> L30 java.lang.OutOfMemoryError -> L36 java.lang.Exception -> L44
            if (r12 <= 0) goto L2d
            r1.close()     // Catch: java.lang.Throwable -> L30 java.lang.OutOfMemoryError -> L36 java.lang.Exception -> L44
            if (r1 == 0) goto L2b
            r1.close()     // Catch: java.lang.Throwable -> L47
        L2b:
            monitor-exit(r10)
            return r11
        L2d:
            if (r1 == 0) goto L4b
            goto L46
        L30:
            if (r1 == 0) goto L4b
        L32:
            r1.close()     // Catch: java.lang.Throwable -> L47
            goto L4b
        L36:
            java.lang.System.gc()     // Catch: java.lang.Throwable -> L3c
            if (r1 == 0) goto L4b
            goto L46
        L3c:
            r0 = move-exception
            r11 = r0
            if (r1 == 0) goto L43
            r1.close()     // Catch: java.lang.Throwable -> L47
        L43:
            throw r11     // Catch: java.lang.Throwable -> L47
        L44:
            if (r1 == 0) goto L4b
        L46:
            goto L32
        L47:
            r0 = move-exception
            r11 = r0
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L47
            throw r11
        L4b:
            monitor-exit(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.e.h.a(java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        if (r1 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        if (r1 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        if (r1 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0033, code lost:
    
        if (r1 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.util.List<com.anythink.core.common.a.j> a(int r12) {
        /*
            r11 = this;
            monitor-enter(r11)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L49
            r0.<init>()     // Catch: java.lang.Throwable -> L49
            if (r12 > 0) goto La
            monitor-exit(r11)
            return r0
        La:
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r11.c()     // Catch: java.lang.Throwable -> L33 java.lang.OutOfMemoryError -> L36 java.lang.Exception -> L44
            java.lang.String r3 = "dsp_offer_install_record"
            java.lang.String r9 = "last_update_time DESC"
            java.lang.String r10 = java.lang.String.valueOf(r12)     // Catch: java.lang.Throwable -> L33 java.lang.OutOfMemoryError -> L36 java.lang.Exception -> L44
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L33 java.lang.OutOfMemoryError -> L36 java.lang.Exception -> L44
            java.util.List r12 = r11.a(r1)     // Catch: java.lang.Throwable -> L33 java.lang.OutOfMemoryError -> L36 java.lang.Exception -> L44
            r1.close()     // Catch: java.lang.Throwable -> L33 java.lang.OutOfMemoryError -> L36 java.lang.Exception -> L44
            r12.size()     // Catch: java.lang.Throwable -> L33 java.lang.OutOfMemoryError -> L36 java.lang.Exception -> L44
            r0.addAll(r12)     // Catch: java.lang.Throwable -> L33 java.lang.OutOfMemoryError -> L36 java.lang.Exception -> L44
            if (r1 == 0) goto L47
        L2f:
            r1.close()     // Catch: java.lang.Throwable -> L49
            goto L47
        L33:
            if (r1 == 0) goto L47
            goto L2f
        L36:
            java.lang.System.gc()     // Catch: java.lang.Throwable -> L3c
            if (r1 == 0) goto L47
            goto L2f
        L3c:
            r0 = move-exception
            r12 = r0
            if (r1 == 0) goto L43
            r1.close()     // Catch: java.lang.Throwable -> L49
        L43:
            throw r12     // Catch: java.lang.Throwable -> L49
        L44:
            if (r1 == 0) goto L47
            goto L2f
        L47:
            monitor-exit(r11)
            return r0
        L49:
            r0 = move-exception
            r12 = r0
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L49
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.e.h.a(int):java.util.List");
    }

    private synchronized List<com.anythink.core.common.a.k> a(Cursor cursor) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        if (cursor != null) {
            if (cursor.getCount() > 0) {
                while (cursor.moveToNext()) {
                    try {
                        com.anythink.core.common.a.k kVar = new com.anythink.core.common.a.k();
                        kVar.a(cursor.getString(cursor.getColumnIndex("dsp_id")));
                        kVar.b(cursor.getString(cursor.getColumnIndex("dsp_offer_id")));
                        kVar.c(cursor.getString(cursor.getColumnIndex("package_name")));
                        arrayList.add(kVar);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        return arrayList;
    }
}
