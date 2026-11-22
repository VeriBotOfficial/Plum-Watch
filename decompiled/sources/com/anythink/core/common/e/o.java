package com.anythink.core.common.e;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.ad;
import com.anythink.core.common.h.af;

/* loaded from: classes12.dex */
public class o extends c<com.anythink.core.common.a.m> {
    private static volatile o b;

    /* renamed from: a, reason: collision with root package name */
    private final String f3782a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f3783a = "offer_data_cache";
        public static final String b = "placement_id";
        public static final String c = "bid_id";
        public static final String d = "adsource_id";
        public static final String e = "network_firm_id";
        public static final String f = "bid_result";
        public static final String g = "offer_data";
        public static final String h = "out_date_timestamp";
        public static final String i = "vast_parse_result";
        public static final String j = "CREATE TABLE IF NOT EXISTS offer_data_cache(placement_id TEXT ,bid_id TEXT ,adsource_id TEXT ,network_firm_id INTEGER ,bid_result TEXT ,offer_data TEXT ,out_date_timestamp INTEGER ,vast_parse_result TEXT)";
    }

    private o(d dVar) {
        super(dVar);
        this.f3782a = o.class.getName();
    }

    public static o a(d dVar) {
        if (b == null) {
            synchronized (o.class) {
                if (b == null) {
                    b = new o(dVar);
                }
            }
        }
        return b;
    }

    public final synchronized void a(String str) {
        try {
            d().delete(a.f3783a, "bid_id = ? ", new String[]{str});
        } catch (Throwable th) {
            com.anythink.core.common.u.e.b("Error_SQL_DELETE", th.getMessage(), t.b().r());
        }
    }

    public final synchronized long a(String str, ad adVar) {
        if (d() == null || adVar == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("placement_id", str);
            contentValues.put("adsource_id", adVar.k);
            contentValues.put("network_firm_id", Integer.valueOf(adVar.d));
            contentValues.put(a.c, adVar.token);
            contentValues.put(a.f, adVar.b());
            contentValues.put(a.h, Long.valueOf(adVar.f));
            if (!TextUtils.isEmpty(adVar.i)) {
                contentValues.put("offer_data", adVar.i);
            }
            if (e(adVar.token)) {
                String str2 = adVar.token;
                return d().update(a.f3783a, contentValues, "bid_id = ? ", new String[]{adVar.token});
            }
            String str3 = adVar.token;
            String str4 = adVar.k;
            return d().insert(a.f3783a, null, contentValues);
        } catch (Exception unused) {
            return -1L;
        }
    }

    public final synchronized int a(ad adVar) {
        if (e(adVar.token)) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put(a.f, adVar.b());
                return d().update(a.f3783a, contentValues, "bid_id = ? ", new String[]{adVar.token});
            } catch (Throwable unused) {
            }
        }
        return -1;
    }

    public final synchronized af b(String str) {
        af afVar;
        Cursor cursor;
        afVar = new af();
        try {
            cursor = c().query(a.f3783a, new String[]{"placement_id", "adsource_id", a.f}, "out_date_timestamp>? AND placement_id=?", new String[]{String.valueOf(System.currentTimeMillis()), str}, null, null, null);
            while (cursor.moveToNext()) {
                try {
                    String string = cursor.getString(cursor.getColumnIndex("adsource_id"));
                    ad a2 = ad.a(cursor.getString(cursor.getColumnIndex(a.f)));
                    if (a2 != null) {
                        afVar.a(string, a2);
                    }
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
            cursor = null;
        }
        if (cursor != null) {
            try {
                cursor.close();
            } catch (Throwable unused3) {
            }
        }
        return afVar;
    }

    public final synchronized long a(String str, String str2, String str3) {
        if (d() == null) {
            return -1L;
        }
        try {
            new ContentValues().put("offer_data", str3);
            if (!e(str2)) {
                return -1L;
            }
            return d().update(a.f3783a, r7, "bid_id = ? ", new String[]{str2});
        } catch (Exception unused) {
            return -1L;
        }
    }

    public final synchronized long a(String str, String str2) {
        if (d() == null) {
            return -1L;
        }
        try {
            new ContentValues().put(a.i, str2);
            if (e(str)) {
                str2.length();
                return d().update(a.f3783a, r0, "bid_id = ? ", new String[]{str});
            }
            str2.length();
            return -1L;
        } catch (Exception unused) {
            return -1L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r12 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0044, code lost:
    
        if (r12 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0053, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized com.anythink.core.common.h.bg c(java.lang.String r12) {
        /*
            r11 = this;
            monitor-enter(r11)
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r11.c()     // Catch: java.lang.Throwable -> L47
            java.lang.String r2 = "offer_data_cache"
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L47
            java.lang.String r4 = "offer_data"
            r9 = 0
            r3[r9] = r4     // Catch: java.lang.Throwable -> L47
            java.lang.String r4 = "out_date_timestamp"
            r10 = 1
            r3[r10] = r4     // Catch: java.lang.Throwable -> L47
            java.lang.String r4 = "bid_id=?"
            java.lang.String[] r5 = new java.lang.String[r10]     // Catch: java.lang.Throwable -> L47
            r5[r9] = r12     // Catch: java.lang.Throwable -> L47
            r7 = 0
            r8 = 0
            r6 = 0
            android.database.Cursor r12 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L47
            if (r12 == 0) goto L44
            int r1 = r12.getCount()     // Catch: java.lang.Throwable -> L48
            if (r1 <= 0) goto L44
            r12.moveToNext()     // Catch: java.lang.Throwable -> L48
            java.lang.String r1 = r12.getString(r9)     // Catch: java.lang.Throwable -> L48
            long r2 = r12.getLong(r10)     // Catch: java.lang.Throwable -> L48
            com.anythink.core.common.h.bg r4 = new com.anythink.core.common.h.bg     // Catch: java.lang.Throwable -> L48
            r4.<init>(r1, r2)     // Catch: java.lang.Throwable -> L48
            r12.close()     // Catch: java.lang.Throwable -> L48
            if (r12 == 0) goto L42
            r12.close()     // Catch: java.lang.Throwable -> L4e
        L42:
            monitor-exit(r11)
            return r4
        L44:
            if (r12 == 0) goto L52
            goto L4a
        L47:
            r12 = r0
        L48:
            if (r12 == 0) goto L52
        L4a:
            r12.close()     // Catch: java.lang.Throwable -> L4e
            goto L52
        L4e:
            r0 = move-exception
            r12 = r0
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L4e
            throw r12
        L52:
            monitor-exit(r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.e.o.c(java.lang.String):com.anythink.core.common.h.bg");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
    
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        if (r11 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003b, code lost:
    
        if (r11 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004a, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.lang.String d(java.lang.String r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.c()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r2 = "offer_data_cache"
            r3 = 1
            r4 = r3
            java.lang.String[] r3 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L3e
            java.lang.String r5 = "vast_parse_result"
            r9 = 0
            r3[r9] = r5     // Catch: java.lang.Throwable -> L3e
            r5 = r4
            java.lang.String r4 = "bid_id=?"
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L3e
            r5[r9] = r11     // Catch: java.lang.Throwable -> L3e
            r7 = 0
            r8 = 0
            r6 = 0
            android.database.Cursor r11 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L3e
            if (r11 == 0) goto L3b
            int r1 = r11.getCount()     // Catch: java.lang.Throwable -> L3f
            if (r1 <= 0) goto L3b
            r11.moveToNext()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = r11.getString(r9)     // Catch: java.lang.Throwable -> L3f
            r11.close()     // Catch: java.lang.Throwable -> L3f
            r1.length()     // Catch: java.lang.Throwable -> L3f
            if (r11 == 0) goto L39
            r11.close()     // Catch: java.lang.Throwable -> L45
        L39:
            monitor-exit(r10)
            return r1
        L3b:
            if (r11 == 0) goto L49
            goto L41
        L3e:
            r11 = r0
        L3f:
            if (r11 == 0) goto L49
        L41:
            r11.close()     // Catch: java.lang.Throwable -> L45
            goto L49
        L45:
            r0 = move-exception
            r11 = r0
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L45
            throw r11
        L49:
            monitor-exit(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.e.o.d(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0032, code lost:
    
        if (r11 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002e, code lost:
    
        if (r11 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized boolean e(java.lang.String r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.c()     // Catch: java.lang.Throwable -> L31
            java.lang.String r2 = "offer_data_cache"
            r9 = 1
            java.lang.String[] r3 = new java.lang.String[r9]     // Catch: java.lang.Throwable -> L31
            java.lang.String r4 = "offer_data"
            r3[r0] = r4     // Catch: java.lang.Throwable -> L31
            java.lang.String r4 = "bid_id=?"
            java.lang.String[] r5 = new java.lang.String[r9]     // Catch: java.lang.Throwable -> L31
            r5[r0] = r11     // Catch: java.lang.Throwable -> L31
            r7 = 0
            r8 = 0
            r6 = 0
            android.database.Cursor r11 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L31
            if (r11 == 0) goto L2e
            int r1 = r11.getCount()     // Catch: java.lang.Throwable -> L32
            if (r1 <= 0) goto L2e
            r11.close()     // Catch: java.lang.Throwable -> L32
            if (r11 == 0) goto L2c
            r11.close()     // Catch: java.lang.Throwable -> L38
        L2c:
            monitor-exit(r10)
            return r9
        L2e:
            if (r11 == 0) goto L3c
            goto L34
        L31:
            r11 = 0
        L32:
            if (r11 == 0) goto L3c
        L34:
            r11.close()     // Catch: java.lang.Throwable -> L38
            goto L3c
        L38:
            r0 = move-exception
            r11 = r0
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L38
            throw r11
        L3c:
            monitor-exit(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.e.o.e(java.lang.String):boolean");
    }
}
