package com.anythink.core.common.e;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.anythink.core.common.h.al;

/* loaded from: classes12.dex */
public class j extends c<al> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f3771a = "j";
    private static volatile j b;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        static final String f3772a = "dyn_wf_ad_source_filter";
        static final String b = "placement_id";
        static final String c = "ad_source_id";
        static final String d = "request_id";
        static final String e = "expired_timestamp";
        static final String f = "match_error_code";
        public static final String g = "CREATE TABLE IF NOT EXISTS dyn_wf_ad_source_filter(placement_id TEXT ,ad_source_id TEXT ,request_id TEXT ,match_error_code TEXT ,expired_timestamp INTEGER)";
        public static final String h = "CREATE INDEX IF NOT EXISTS idx_placement_id ON dyn_wf_ad_source_filter(placement_id)";
        public static final String i = "CREATE INDEX IF NOT EXISTS idx_ad_source_id ON dyn_wf_ad_source_filter(ad_source_id)";
        public static final String j = "CREATE INDEX IF NOT EXISTS idx_ad_request_id ON dyn_wf_ad_source_filter(request_id)";
        public static final String k = "CREATE INDEX IF NOT EXISTS idx_expired_timestamp ON dyn_wf_ad_source_filter(expired_timestamp)";
        public static final String l = "CREATE INDEX IF NOT EXISTS idx_match_error_code ON dyn_wf_ad_source_filter(match_error_code)";
    }

    private j(d dVar) {
        super(dVar);
    }

    public static j a(Context context) {
        if (b == null) {
            synchronized (j.class) {
                if (b == null) {
                    b = new j(e.a(context));
                }
            }
        }
        return b;
    }

    public final synchronized void a(al alVar) {
        if (alVar == null) {
            return;
        }
        try {
            new Object[]{alVar};
            SQLiteDatabase d = d();
            ContentValues contentValues = new ContentValues();
            contentValues.put("placement_id", alVar.b());
            contentValues.put("ad_source_id", alVar.a());
            contentValues.put("request_id", alVar.g());
            contentValues.put("match_error_code", alVar.h());
            contentValues.put("expired_timestamp", Long.valueOf(alVar.f()));
            Cursor query = c().query("dyn_wf_ad_source_filter", new String[]{"request_id"}, "request_id = ? AND ad_source_id = ?", new String[]{alVar.g(), alVar.a()}, null, null, null);
            if (query == null || query.getCount() <= 0) {
                if (query != null) {
                    query.close();
                }
                new Object[]{Long.valueOf(d.insertOrThrow("dyn_wf_ad_source_filter", null, contentValues))};
            } else {
                query.close();
                new Object[]{Long.valueOf(d.update("dyn_wf_ad_source_filter", contentValues, "request_id = ? AND ad_source_id = ?", new String[]{alVar.g(), alVar.a()}))};
            }
        } catch (Throwable th) {
            new Object[]{th.getMessage()};
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0060, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        if (r3 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0052, code lost:
    
        if (r3 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0063, code lost:
    
        new java.lang.Object[]{java.lang.Integer.valueOf(r1.size())};
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.Map<java.lang.String, java.lang.Integer> c(java.lang.String r14) {
        /*
            r13 = this;
            java.lang.String r0 = "ad_source_id"
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2 = 2
            r3 = 0
            java.lang.String[] r6 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L55
            r4 = 0
            r6[r4] = r0     // Catch: java.lang.Throwable -> L55
            java.lang.String r5 = "count(request_id)"
            r12 = 1
            r6[r12] = r5     // Catch: java.lang.Throwable -> L55
            java.lang.String r7 = "placement_id = ? AND expired_timestamp >= ?"
            java.lang.String[] r8 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L55
            r8[r4] = r14     // Catch: java.lang.Throwable -> L55
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L55
            java.lang.String r14 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L55
            r8[r12] = r14     // Catch: java.lang.Throwable -> L55
            java.lang.String r9 = "ad_source_id"
            android.database.sqlite.SQLiteDatabase r4 = r13.c()     // Catch: java.lang.Throwable -> L55
            java.lang.String r5 = "dyn_wf_ad_source_filter"
            r10 = 0
            r11 = 0
            android.database.Cursor r3 = r4.query(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L55
        L31:
            boolean r14 = r3.moveToNext()     // Catch: java.lang.Throwable -> L55
            if (r14 == 0) goto L52
            int r14 = a(r3, r0)     // Catch: java.lang.Throwable -> L55
            java.lang.String r14 = r3.getString(r14)     // Catch: java.lang.Throwable -> L55
            int r2 = r3.getInt(r12)     // Catch: java.lang.Throwable -> L55
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L55
            new java.lang.Object[]{r14, r4}     // Catch: java.lang.Throwable -> L55
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L55
            r1.put(r14, r2)     // Catch: java.lang.Throwable -> L55
            goto L31
        L52:
            if (r3 == 0) goto L63
            goto L60
        L55:
            r0 = move-exception
            r14 = r0
            java.lang.String r14 = r14.getMessage()     // Catch: java.lang.Throwable -> L6f
            new java.lang.Object[]{r14}     // Catch: java.lang.Throwable -> L6f
            if (r3 == 0) goto L63
        L60:
            r3.close()
        L63:
            int r14 = r1.size()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            new java.lang.Object[]{r14}
            return r1
        L6f:
            r0 = move-exception
            r14 = r0
            if (r3 == 0) goto L76
            r3.close()
        L76:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.e.j.c(java.lang.String):java.util.Map");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x008e, code lost:
    
        if (r2 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0090, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009f, code lost:
    
        r1.b(c(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009c, code lost:
    
        if (r2 == null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized com.anythink.core.common.h.am a(java.lang.String r13) {
        /*
            r12 = this;
            monitor-enter(r12)
            com.anythink.core.common.h.am r1 = new com.anythink.core.common.h.am     // Catch: java.lang.Throwable -> Lb0
            r1.<init>(r13)     // Catch: java.lang.Throwable -> Lb0
            r0 = 3
            r2 = 0
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L94
            java.lang.String r3 = "ad_source_id"
            r4 = 0
            r5[r4] = r3     // Catch: java.lang.Throwable -> L94
            java.lang.String r3 = "match_error_code"
            r6 = 1
            r5[r6] = r3     // Catch: java.lang.Throwable -> L94
            java.lang.String r3 = "count(request_id)"
            r11 = 2
            r5[r11] = r3     // Catch: java.lang.Throwable -> L94
            r3 = r6
            java.lang.String r6 = "placement_id = ? AND match_error_code IS NOT NULL AND match_error_code != ? AND expired_timestamp >= ?"
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L94
            r7[r4] = r13     // Catch: java.lang.Throwable -> L94
            java.lang.String r0 = ""
            r7[r3] = r0     // Catch: java.lang.Throwable -> L94
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L94
            java.lang.String r0 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L94
            r7[r11] = r0     // Catch: java.lang.Throwable -> L94
            java.lang.String r8 = "ad_source_id,match_error_code"
            android.database.sqlite.SQLiteDatabase r3 = r12.c()     // Catch: java.lang.Throwable -> L94
            java.lang.String r4 = "dyn_wf_ad_source_filter"
            java.lang.String r10 = "ad_source_id"
            r9 = 0
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L94
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L94
            r0.<init>()     // Catch: java.lang.Throwable -> L94
        L42:
            boolean r3 = r2.moveToNext()     // Catch: java.lang.Throwable -> L94
            if (r3 == 0) goto L80
            java.lang.String r3 = "ad_source_id"
            int r3 = a(r2, r3)     // Catch: java.lang.Throwable -> L94
            java.lang.String r3 = r2.getString(r3)     // Catch: java.lang.Throwable -> L94
            java.lang.String r4 = "match_error_code"
            int r4 = a(r2, r4)     // Catch: java.lang.Throwable -> L94
            java.lang.String r4 = r2.getString(r4)     // Catch: java.lang.Throwable -> L94
            int r5 = r2.getInt(r11)     // Catch: java.lang.Throwable -> L94
            java.lang.Object r6 = r0.get(r3)     // Catch: java.lang.Throwable -> L94
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Throwable -> L94
            if (r6 != 0) goto L6d
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L94
            r6.<init>()     // Catch: java.lang.Throwable -> L94
        L6d:
            com.anythink.core.common.h.am$a r7 = new com.anythink.core.common.h.am$a     // Catch: java.lang.Throwable -> L94
            r7.<init>(r4, r5)     // Catch: java.lang.Throwable -> L94
            r6.add(r7)     // Catch: java.lang.Throwable -> L94
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L94
            new java.lang.Object[]{r3, r4, r5}     // Catch: java.lang.Throwable -> L94
            r0.put(r3, r6)     // Catch: java.lang.Throwable -> L94
            goto L42
        L80:
            int r3 = r0.size()     // Catch: java.lang.Throwable -> L94
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L94
            new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> L94
            r1.a(r0)     // Catch: java.lang.Throwable -> L94
            if (r2 == 0) goto L9f
        L90:
            r2.close()     // Catch: java.lang.Throwable -> Lb0
            goto L9f
        L94:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> La8
            new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> La8
            if (r2 == 0) goto L9f
            goto L90
        L9f:
            java.util.Map r13 = r12.c(r13)     // Catch: java.lang.Throwable -> Lb0
            r1.b(r13)     // Catch: java.lang.Throwable -> Lb0
            monitor-exit(r12)
            return r1
        La8:
            r0 = move-exception
            r13 = r0
            if (r2 == 0) goto Laf
            r2.close()     // Catch: java.lang.Throwable -> Lb0
        Laf:
            throw r13     // Catch: java.lang.Throwable -> Lb0
        Lb0:
            r0 = move-exception
            r13 = r0
            monitor-exit(r12)     // Catch: java.lang.Throwable -> Lb0
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.e.j.a(java.lang.String):com.anythink.core.common.h.am");
    }

    public final synchronized void b(String str) {
        try {
            new Object[]{Integer.valueOf(d().delete("dyn_wf_ad_source_filter", "placement_id = ? AND expired_timestamp < ?", new String[]{str, String.valueOf(System.currentTimeMillis())})), str};
        } catch (Throwable th) {
            new Object[]{th.getMessage()};
        }
    }

    private static int a(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        throw new IllegalArgumentException("columnIndex must >= 0.");
    }

    private boolean b(al alVar) {
        Cursor query = c().query("dyn_wf_ad_source_filter", new String[]{"request_id"}, "request_id = ? AND ad_source_id = ?", new String[]{alVar.g(), alVar.a()}, null, null, null);
        if (query != null && query.getCount() > 0) {
            query.close();
            return true;
        }
        if (query != null) {
            query.close();
        }
        return false;
    }
}
