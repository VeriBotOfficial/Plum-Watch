package com.anythink.basead.c;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.gov.nist.core.Separators;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static a f2317a;
    private Context b;

    /* renamed from: com.anythink.basead.c.a$a, reason: collision with other inner class name */
    public static class C0128a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f2318a = "my_offer_cap_pacing";
        public static final String b = "offer_id";
        public static final String c = "offer_cap";
        public static final String d = "offer_pacing";
        public static final String e = "show_num";
        public static final String f = "show_time";
        public static final String g = "record_date";
        public static final String h = "CREATE TABLE IF NOT EXISTS my_offer_cap_pacing (offer_id TEXT,offer_cap INTEGER,offer_pacing INTEGER,show_num INTEGER,show_time INTEGER,record_date INTEGER )";
    }

    private a(Context context) {
        this.b = context;
    }

    public static a a(Context context) {
        if (f2317a == null) {
            f2317a = new a(context);
        }
        return f2317a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        if (r11 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0045, code lost:
    
        if (r11 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x003b, code lost:
    
        if (r11 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0037, code lost:
    
        if (r11 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0058, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized com.anythink.basead.d.c a(java.lang.String r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            r0 = 0
            android.content.Context r1 = r10.b     // Catch: java.lang.Throwable -> L3a java.lang.OutOfMemoryError -> L41 java.lang.Exception -> L4f
            com.anythink.basead.c.c r1 = com.anythink.basead.c.c.a(r1)     // Catch: java.lang.Throwable -> L3a java.lang.OutOfMemoryError -> L41 java.lang.Exception -> L4f
            android.database.sqlite.SQLiteDatabase r2 = r1.getReadableDatabase()     // Catch: java.lang.Throwable -> L3a java.lang.OutOfMemoryError -> L41 java.lang.Exception -> L4f
            java.lang.String r3 = "my_offer_cap_pacing"
            java.lang.String r5 = "offer_id = ?"
            r1 = 1
            java.lang.String[] r6 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> L3a java.lang.OutOfMemoryError -> L41 java.lang.Exception -> L4f
            r1 = 0
            r6[r1] = r11     // Catch: java.lang.Throwable -> L3a java.lang.OutOfMemoryError -> L41 java.lang.Exception -> L4f
            r8 = 0
            r9 = 0
            r4 = 0
            r7 = 0
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L3a java.lang.OutOfMemoryError -> L41 java.lang.Exception -> L4f
            if (r11 == 0) goto L37
            int r1 = r11.getCount()     // Catch: java.lang.Throwable -> L3b java.lang.OutOfMemoryError -> L42 java.lang.Exception -> L50
            if (r1 <= 0) goto L37
            r11.moveToNext()     // Catch: java.lang.Throwable -> L3b java.lang.OutOfMemoryError -> L42 java.lang.Exception -> L50
            com.anythink.basead.d.c r1 = a(r11)     // Catch: java.lang.Throwable -> L3b java.lang.OutOfMemoryError -> L42 java.lang.Exception -> L50
            r11.close()     // Catch: java.lang.Throwable -> L3b java.lang.OutOfMemoryError -> L42 java.lang.Exception -> L50
            if (r11 == 0) goto L35
            r11.close()     // Catch: java.lang.Throwable -> L53
        L35:
            monitor-exit(r10)
            return r1
        L37:
            if (r11 == 0) goto L57
            goto L52
        L3a:
            r11 = r0
        L3b:
            if (r11 == 0) goto L57
        L3d:
            r11.close()     // Catch: java.lang.Throwable -> L53
            goto L57
        L41:
            r11 = r0
        L42:
            java.lang.System.gc()     // Catch: java.lang.Throwable -> L48
            if (r11 == 0) goto L57
            goto L52
        L48:
            r0 = move-exception
            if (r11 == 0) goto L4e
            r11.close()     // Catch: java.lang.Throwable -> L53
        L4e:
            throw r0     // Catch: java.lang.Throwable -> L53
        L4f:
            r11 = r0
        L50:
            if (r11 == 0) goto L57
        L52:
            goto L3d
        L53:
            r0 = move-exception
            r11 = r0
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L53
            throw r11
        L57:
            monitor-exit(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.c.a.a(java.lang.String):com.anythink.basead.d.c");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004e, code lost:
    
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        if (r11 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
    
        if (r11 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x004c, code lost:
    
        if (r11 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0048, code lost:
    
        if (r11 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0069, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.util.List<com.anythink.basead.d.c> b(java.lang.String r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            r0 = 0
            android.content.Context r1 = r10.b     // Catch: java.lang.Throwable -> L4b java.lang.OutOfMemoryError -> L52 java.lang.Exception -> L60
            com.anythink.basead.c.c r1 = com.anythink.basead.c.c.a(r1)     // Catch: java.lang.Throwable -> L4b java.lang.OutOfMemoryError -> L52 java.lang.Exception -> L60
            android.database.sqlite.SQLiteDatabase r2 = r1.getReadableDatabase()     // Catch: java.lang.Throwable -> L4b java.lang.OutOfMemoryError -> L52 java.lang.Exception -> L60
            java.lang.String r3 = "my_offer_cap_pacing"
            java.lang.String r5 = "offer_cap <= show_num AND record_date = ? AND offer_cap  >= ?"
            r1 = 2
            java.lang.String[] r6 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> L4b java.lang.OutOfMemoryError -> L52 java.lang.Exception -> L60
            r1 = 0
            r6[r1] = r11     // Catch: java.lang.Throwable -> L4b java.lang.OutOfMemoryError -> L52 java.lang.Exception -> L60
            java.lang.String r11 = "0"
            r1 = 1
            r6[r1] = r11     // Catch: java.lang.Throwable -> L4b java.lang.OutOfMemoryError -> L52 java.lang.Exception -> L60
            r8 = 0
            r9 = 0
            r4 = 0
            r7 = 0
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L4b java.lang.OutOfMemoryError -> L52 java.lang.Exception -> L60
            if (r11 == 0) goto L48
            int r1 = r11.getCount()     // Catch: java.lang.Throwable -> L4c java.lang.OutOfMemoryError -> L53 java.lang.Exception -> L61
            if (r1 <= 0) goto L48
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4c java.lang.OutOfMemoryError -> L53 java.lang.Exception -> L61
            r1.<init>()     // Catch: java.lang.Throwable -> L4c java.lang.OutOfMemoryError -> L53 java.lang.Exception -> L61
        L30:
            boolean r2 = r11.moveToNext()     // Catch: java.lang.Throwable -> L4c java.lang.OutOfMemoryError -> L53 java.lang.Exception -> L61
            if (r2 == 0) goto L3e
            com.anythink.basead.d.c r2 = a(r11)     // Catch: java.lang.Throwable -> L4c java.lang.OutOfMemoryError -> L53 java.lang.Exception -> L61
            r1.add(r2)     // Catch: java.lang.Throwable -> L4c java.lang.OutOfMemoryError -> L53 java.lang.Exception -> L61
            goto L30
        L3e:
            r11.close()     // Catch: java.lang.Throwable -> L4c java.lang.OutOfMemoryError -> L53 java.lang.Exception -> L61
            if (r11 == 0) goto L46
            r11.close()     // Catch: java.lang.Throwable -> L64
        L46:
            monitor-exit(r10)
            return r1
        L48:
            if (r11 == 0) goto L68
            goto L63
        L4b:
            r11 = r0
        L4c:
            if (r11 == 0) goto L68
        L4e:
            r11.close()     // Catch: java.lang.Throwable -> L64
            goto L68
        L52:
            r11 = r0
        L53:
            java.lang.System.gc()     // Catch: java.lang.Throwable -> L59
            if (r11 == 0) goto L68
            goto L63
        L59:
            r0 = move-exception
            if (r11 == 0) goto L5f
            r11.close()     // Catch: java.lang.Throwable -> L64
        L5f:
            throw r0     // Catch: java.lang.Throwable -> L64
        L60:
            r11 = r0
        L61:
            if (r11 == 0) goto L68
        L63:
            goto L4e
        L64:
            r0 = move-exception
            r11 = r0
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L64
            throw r11
        L68:
            monitor-exit(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.c.a.b(java.lang.String):java.util.List");
    }

    public final synchronized void c(String str) {
        String str2;
        synchronized (this) {
            try {
                str2 = "record_date != '" + str + Separators.QUOTE;
            } catch (Exception unused) {
            }
            if (c.a(this.b).getWritableDatabase() == null) {
                return;
            }
            c.a(this.b).getWritableDatabase().delete(C0128a.f2318a, str2, null);
        }
    }

    public final synchronized long a(com.anythink.basead.d.c cVar) {
        synchronized (this) {
            if (cVar == null) {
                return 0L;
            }
            try {
                if (c.a(this.b).getWritableDatabase() == null) {
                    return -1L;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("offer_id", cVar.f2327a);
                contentValues.put(C0128a.e, Integer.valueOf(cVar.d));
                contentValues.put("show_time", Long.valueOf(cVar.e));
                contentValues.put(C0128a.g, cVar.f);
                contentValues.put(C0128a.c, Integer.valueOf(cVar.b));
                contentValues.put(C0128a.d, Long.valueOf(cVar.c));
                if (d(cVar.f2327a)) {
                    return c.a(this.b).getWritableDatabase().update(C0128a.f2318a, contentValues, "offer_id = '" + cVar.f2327a + Separators.QUOTE, null);
                }
                return c.a(this.b).getWritableDatabase().insert(C0128a.f2318a, null, contentValues);
            } catch (Exception e) {
                e.printStackTrace();
                return -1L;
            }
        }
    }

    private synchronized boolean d(String str) {
        Cursor query = c.a(this.b).getReadableDatabase().query(C0128a.f2318a, new String[]{"offer_id"}, "offer_id = ?", new String[]{str}, null, null, null);
        if (query != null && query.getCount() > 0) {
            query.close();
            return true;
        }
        if (query != null) {
            query.close();
        }
        return false;
    }

    private static com.anythink.basead.d.c a(Cursor cursor) {
        com.anythink.basead.d.c cVar = new com.anythink.basead.d.c();
        cVar.f2327a = cursor.getString(cursor.getColumnIndex("offer_id"));
        cVar.d = cursor.getInt(cursor.getColumnIndex(C0128a.e));
        cVar.e = cursor.getLong(cursor.getColumnIndex("show_time"));
        cVar.f = cursor.getString(cursor.getColumnIndex(C0128a.g));
        cVar.b = cursor.getInt(cursor.getColumnIndex(C0128a.c));
        cVar.c = cursor.getLong(cursor.getColumnIndex(C0128a.d));
        return cVar;
    }
}
