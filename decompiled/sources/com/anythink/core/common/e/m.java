package com.anythink.core.common.e;

import android.content.ContentValues;
import com.anythink.core.common.h.bd;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public class m extends c<m> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f3777a = "com.anythink.core.common.e.m";
    private static m b;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public List<bd> f3778a;
        public Map<String, bd> b;
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static final String f3779a = "notice_url_fail_info";
        public static final String b = "id";
        public static final String c = "req_type";
        public static final String d = "req_url";
        public static final String e = "req_head";
        public static final String f = "first_fail_time";
        public static final String g = "offer_out_date_time";
        public static final String h = "retry_count";
        public static final String i = "CREATE TABLE IF NOT EXISTS notice_url_fail_info(id TEXT, req_type INTEGER, req_url TEXT, req_head TEXT, first_fail_time INTEGER, offer_out_date_time INTEGER, retry_count INTEGER )";
    }

    private m(d dVar) {
        super(dVar);
    }

    public static m a(d dVar) {
        if (b == null) {
            synchronized (m.class) {
                if (b == null) {
                    b = new m(dVar);
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
            d().delete(b.f3779a, null, null);
        } catch (Exception unused) {
        }
    }

    public final synchronized long a(bd bdVar) {
        if (d() == null || bdVar == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", bdVar.f3867a);
            contentValues.put("req_type", Integer.valueOf(bdVar.b));
            contentValues.put("req_url", bdVar.d);
            contentValues.put("req_head", bdVar.c);
            contentValues.put(b.f, Long.valueOf(bdVar.e));
            contentValues.put(b.g, Long.valueOf(bdVar.f));
            contentValues.put("retry_count", Integer.valueOf(bdVar.g));
            if (a(bdVar.f3867a)) {
                return d().update(b.f3779a, contentValues, "id = ? ", new String[]{bdVar.f3867a});
            }
            return d().insert(b.f3779a, null, contentValues);
        } catch (Exception unused) {
            return -1L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        if (r11 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002d, code lost:
    
        if (r11 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0036, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        r11.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(java.lang.String r11) {
        /*
            r10 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.c()     // Catch: java.lang.Throwable -> L30
            java.lang.String r2 = "notice_url_fail_info"
            r9 = 1
            java.lang.String[] r3 = new java.lang.String[r9]     // Catch: java.lang.Throwable -> L30
            java.lang.String r4 = "id"
            r3[r0] = r4     // Catch: java.lang.Throwable -> L30
            java.lang.String r4 = "id=?"
            java.lang.String[] r5 = new java.lang.String[r9]     // Catch: java.lang.Throwable -> L30
            r5[r0] = r11     // Catch: java.lang.Throwable -> L30
            java.lang.String r6 = "id"
            r7 = 0
            r8 = 0
            android.database.Cursor r11 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L30
            if (r11 == 0) goto L2d
            int r1 = r11.getCount()     // Catch: java.lang.Throwable -> L31
            if (r1 <= 0) goto L2d
            r11.close()     // Catch: java.lang.Throwable -> L31
            if (r11 == 0) goto L2c
            r11.close()
        L2c:
            return r9
        L2d:
            if (r11 == 0) goto L36
            goto L33
        L30:
            r11 = 0
        L31:
            if (r11 == 0) goto L36
        L33:
            r11.close()
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.e.m.a(java.lang.String):boolean");
    }

    public final synchronized int b(bd bdVar) {
        if (d() == null || bdVar == null) {
            return -1;
        }
        try {
            return d().delete(b.f3779a, "id=?", new String[]{bdVar.f3867a});
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d7, code lost:
    
        if (r2 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d9, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f1, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ed, code lost:
    
        if (r2 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e3, code lost:
    
        if (r2 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00dd, code lost:
    
        if (r2 != null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized com.anythink.core.common.e.m.a a() {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.e.m.a():com.anythink.core.common.e.m$a");
    }
}
