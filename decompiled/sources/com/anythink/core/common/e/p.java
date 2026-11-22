package com.anythink.core.common.e;

import android.content.ContentValues;
import android.database.Cursor;
import android.gov.nist.core.Separators;
import android.text.TextUtils;
import com.anythink.core.common.h.bo;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public class p extends c<bo> {
    private static volatile p b;

    /* renamed from: a, reason: collision with root package name */
    private final String f3784a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f3785a = "placement_ad_impression";
        public static final String b = "format";
        public static final String c = "placement_id";
        public static final String d = "adsource_id";
        public static final String e = "hour_time";
        public static final String f = "hour_imp";
        public static final String g = "date_time";
        public static final String h = "date_imp";
        public static final String i = "show_time";
        public static final String j = "CREATE TABLE IF NOT EXISTS placement_ad_impression(format INTEGER ,placement_id TEXT ,adsource_id TEXT ,hour_time TEXT ,hour_imp INTEGER ,date_time TEXT ,date_imp INTEGER , show_time INTEGER)";
    }

    private p(d dVar) {
        super(dVar);
        this.f3784a = p.class.getName();
    }

    public static p a(d dVar) {
        if (b == null) {
            synchronized (p.class) {
                if (b == null) {
                    b = new p(dVar);
                }
            }
        }
        return b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        if (r4 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        r4 = c().query(com.anythink.core.common.e.p.a.f3785a, new java.lang.String[]{"sum(hour_imp)"}, "format=? AND hour_time=?", new java.lang.String[]{java.lang.String.valueOf(r14), r16}, null, null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007b, code lost:
    
        if (r4 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0081, code lost:
    
        if (r4.getCount() <= 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0083, code lost:
    
        r4.moveToNext();
        r1[1] = r4.getInt(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
    
        if (r4 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0092, code lost:
    
        if (r4.getCount() <= 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0094, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0097, code lost:
    
        if (r4 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0099, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ae, code lost:
    
        if (r4 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
    
        java.lang.System.gc();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a3, code lost:
    
        if (r4 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009d, code lost:
    
        if (r4 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0059, code lost:
    
        if (r4 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x004e, code lost:
    
        if (r4 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0048, code lost:
    
        if (r4 != null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized int[] a(int r14, java.lang.String r15, java.lang.String r16) {
        /*
            r13 = this;
            monitor-enter(r13)
            r0 = 2
            int[] r1 = new int[r0]     // Catch: java.lang.Throwable -> Lb3
            r2 = 1
            r3 = 0
            r4 = 0
            android.database.sqlite.SQLiteDatabase r5 = r13.c()     // Catch: java.lang.Throwable -> L48 java.lang.OutOfMemoryError -> L4b java.lang.Exception -> L59
            java.lang.String r6 = "placement_ad_impression"
            java.lang.String[] r7 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L48 java.lang.OutOfMemoryError -> L4b java.lang.Exception -> L59
            java.lang.String r8 = "sum(date_imp)"
            r7[r3] = r8     // Catch: java.lang.Throwable -> L48 java.lang.OutOfMemoryError -> L4b java.lang.Exception -> L59
            java.lang.String r8 = "format=? AND date_time=?"
            java.lang.String[] r9 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L48 java.lang.OutOfMemoryError -> L4b java.lang.Exception -> L59
            java.lang.String r10 = java.lang.String.valueOf(r14)     // Catch: java.lang.Throwable -> L48 java.lang.OutOfMemoryError -> L4b java.lang.Exception -> L59
            r9[r3] = r10     // Catch: java.lang.Throwable -> L48 java.lang.OutOfMemoryError -> L4b java.lang.Exception -> L59
            r9[r2] = r15     // Catch: java.lang.Throwable -> L48 java.lang.OutOfMemoryError -> L4b java.lang.Exception -> L59
            r11 = 0
            r12 = 0
            r10 = 0
            android.database.Cursor r4 = r5.query(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L48 java.lang.OutOfMemoryError -> L4b java.lang.Exception -> L59
            if (r4 == 0) goto L37
            int r15 = r4.getCount()     // Catch: java.lang.Throwable -> L48 java.lang.OutOfMemoryError -> L4b java.lang.Exception -> L59
            if (r15 <= 0) goto L37
            r4.moveToNext()     // Catch: java.lang.Throwable -> L48 java.lang.OutOfMemoryError -> L4b java.lang.Exception -> L59
            int r15 = r4.getInt(r3)     // Catch: java.lang.Throwable -> L48 java.lang.OutOfMemoryError -> L4b java.lang.Exception -> L59
            r1[r3] = r15     // Catch: java.lang.Throwable -> L48 java.lang.OutOfMemoryError -> L4b java.lang.Exception -> L59
        L37:
            if (r4 == 0) goto L42
            int r15 = r4.getCount()     // Catch: java.lang.Throwable -> L48 java.lang.OutOfMemoryError -> L4b java.lang.Exception -> L59
            if (r15 <= 0) goto L42
            r4.close()     // Catch: java.lang.Throwable -> L48 java.lang.OutOfMemoryError -> L4b java.lang.Exception -> L59
        L42:
            if (r4 == 0) goto L5c
        L44:
            r4.close()     // Catch: java.lang.Throwable -> Lb3
            goto L5c
        L48:
            if (r4 == 0) goto L5c
            goto L44
        L4b:
            java.lang.System.gc()     // Catch: java.lang.Throwable -> L51
            if (r4 == 0) goto L5c
            goto L44
        L51:
            r0 = move-exception
            r14 = r0
            if (r4 == 0) goto L58
            r4.close()     // Catch: java.lang.Throwable -> Lb3
        L58:
            throw r14     // Catch: java.lang.Throwable -> Lb3
        L59:
            if (r4 == 0) goto L5c
            goto L44
        L5c:
            android.database.sqlite.SQLiteDatabase r5 = r13.c()     // Catch: java.lang.Throwable -> L9d java.lang.OutOfMemoryError -> La0 java.lang.Exception -> Lae
            java.lang.String r6 = "placement_ad_impression"
            java.lang.String[] r7 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L9d java.lang.OutOfMemoryError -> La0 java.lang.Exception -> Lae
            java.lang.String r15 = "sum(hour_imp)"
            r7[r3] = r15     // Catch: java.lang.Throwable -> L9d java.lang.OutOfMemoryError -> La0 java.lang.Exception -> Lae
            java.lang.String r8 = "format=? AND hour_time=?"
            java.lang.String[] r9 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L9d java.lang.OutOfMemoryError -> La0 java.lang.Exception -> Lae
            java.lang.String r14 = java.lang.String.valueOf(r14)     // Catch: java.lang.Throwable -> L9d java.lang.OutOfMemoryError -> La0 java.lang.Exception -> Lae
            r9[r3] = r14     // Catch: java.lang.Throwable -> L9d java.lang.OutOfMemoryError -> La0 java.lang.Exception -> Lae
            r9[r2] = r16     // Catch: java.lang.Throwable -> L9d java.lang.OutOfMemoryError -> La0 java.lang.Exception -> Lae
            r11 = 0
            r12 = 0
            r10 = 0
            android.database.Cursor r4 = r5.query(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L9d java.lang.OutOfMemoryError -> La0 java.lang.Exception -> Lae
            if (r4 == 0) goto L8c
            int r14 = r4.getCount()     // Catch: java.lang.Throwable -> L9d java.lang.OutOfMemoryError -> La0 java.lang.Exception -> Lae
            if (r14 <= 0) goto L8c
            r4.moveToNext()     // Catch: java.lang.Throwable -> L9d java.lang.OutOfMemoryError -> La0 java.lang.Exception -> Lae
            int r14 = r4.getInt(r3)     // Catch: java.lang.Throwable -> L9d java.lang.OutOfMemoryError -> La0 java.lang.Exception -> Lae
            r1[r2] = r14     // Catch: java.lang.Throwable -> L9d java.lang.OutOfMemoryError -> La0 java.lang.Exception -> Lae
        L8c:
            if (r4 == 0) goto L97
            int r14 = r4.getCount()     // Catch: java.lang.Throwable -> L9d java.lang.OutOfMemoryError -> La0 java.lang.Exception -> Lae
            if (r14 <= 0) goto L97
            r4.close()     // Catch: java.lang.Throwable -> L9d java.lang.OutOfMemoryError -> La0 java.lang.Exception -> Lae
        L97:
            if (r4 == 0) goto Lb1
        L99:
            r4.close()     // Catch: java.lang.Throwable -> Lb3
            goto Lb1
        L9d:
            if (r4 == 0) goto Lb1
            goto L99
        La0:
            java.lang.System.gc()     // Catch: java.lang.Throwable -> La6
            if (r4 == 0) goto Lb1
            goto L99
        La6:
            r0 = move-exception
            r14 = r0
            if (r4 == 0) goto Lad
            r4.close()     // Catch: java.lang.Throwable -> Lb3
        Lad:
            throw r14     // Catch: java.lang.Throwable -> Lb3
        Lae:
            if (r4 == 0) goto Lb1
            goto L99
        Lb1:
            monitor-exit(r13)
            return r1
        Lb3:
            r0 = move-exception
            r14 = r0
            monitor-exit(r13)     // Catch: java.lang.Throwable -> Lb3
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.e.p.a(int, java.lang.String, java.lang.String):int[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00f5, code lost:
    
        if (r11 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00e8, code lost:
    
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00fd, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e6, code lost:
    
        if (r11 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00df, code lost:
    
        if (r11 == null) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00d9 A[Catch: all -> 0x00f8, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:9:0x00d9, B:17:0x00e8, B:28:0x00f0, B:29:0x00f3, B:22:0x00e3), top: B:3:0x0002, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized com.anythink.core.common.h.bo a(java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.e.p.a(java.lang.String, java.lang.String, java.lang.String):com.anythink.core.common.h.bo");
    }

    private synchronized long a(int i, String str, bo.a aVar) {
        if (d() == null || aVar == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("format", Integer.valueOf(i));
            contentValues.put("placement_id", str);
            contentValues.put("adsource_id", aVar.f3880a);
            contentValues.put(a.e, aVar.b);
            contentValues.put(a.f, Integer.valueOf(aVar.e));
            contentValues.put(a.g, aVar.c);
            contentValues.put(a.h, Integer.valueOf(aVar.d));
            contentValues.put("show_time", Long.valueOf(aVar.f));
            Cursor query = c().query(a.f3785a, new String[]{"adsource_id"}, "adsource_id=?", new String[]{aVar.f3880a}, "adsource_id", null, null);
            if (query == null || query.getCount() <= 0) {
                if (query != null) {
                    query.close();
                }
                return d().insert(a.f3785a, null, contentValues);
            }
            query.close();
            return d().update(a.f3785a, contentValues, "adsource_id = ? ", new String[]{aVar.f3880a});
        } catch (Exception unused) {
            return -1L;
        }
    }

    private boolean b(String str) {
        Cursor query = c().query(a.f3785a, new String[]{"adsource_id"}, "adsource_id=?", new String[]{str}, "adsource_id", null, null);
        if (query != null && query.getCount() > 0) {
            query.close();
            return true;
        }
        if (query != null) {
            query.close();
        }
        return false;
    }

    private static bo a(Cursor cursor, String str, String str2) {
        if (cursor == null || cursor.getCount() <= 0) {
            return null;
        }
        bo boVar = new bo();
        boVar.h = new ConcurrentHashMap<>();
        while (cursor.moveToNext()) {
            boVar.f3879a = cursor.getInt(cursor.getColumnIndex("format"));
            boVar.b = cursor.getString(cursor.getColumnIndex("placement_id"));
            bo.a aVar = new bo.a();
            aVar.f3880a = cursor.getString(cursor.getColumnIndex("adsource_id"));
            aVar.b = cursor.getString(cursor.getColumnIndex(a.e));
            aVar.c = cursor.getString(cursor.getColumnIndex(a.g));
            if (!TextUtils.equals(aVar.b, str2)) {
                aVar.e = 0;
            } else {
                aVar.e = cursor.getInt(cursor.getColumnIndex(a.f));
            }
            boVar.d += aVar.e;
            if (!TextUtils.equals(aVar.c, str)) {
                aVar.d = 0;
            } else {
                aVar.d = cursor.getInt(cursor.getColumnIndex(a.h));
            }
            boVar.c += aVar.d;
            aVar.f = cursor.getLong(cursor.getColumnIndex("show_time"));
            if (aVar.f >= boVar.e) {
                boVar.e = aVar.f;
            }
            boVar.h.put(aVar.f3880a, aVar);
        }
        return boVar;
    }

    public final void a(String str) {
        String str2;
        synchronized (this) {
            try {
                str2 = "date_time!='" + str + Separators.QUOTE;
            } catch (Exception unused) {
            }
            if (d() == null) {
                return;
            }
            d().delete(a.f3785a, str2, null);
        }
    }
}
