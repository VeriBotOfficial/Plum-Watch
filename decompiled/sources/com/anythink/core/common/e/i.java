package com.anythink.core.common.e;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public class i extends c<com.anythink.core.common.a.l> {
    private static volatile i c;

    /* renamed from: a, reason: collision with root package name */
    private final String f3769a;
    private final long b;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f3770a = "dsp_offer_show_record";
        public static final String b = "dsp_id";
        public static final String c = "dsp_offer_id";
        public static final String d = "show_limit";
        public static final String e = "show_count";
        public static final String f = "create_time";
        public static final String g = "last_update_time";
        public static final String h = "CREATE TABLE IF NOT EXISTS dsp_offer_show_record(dsp_id TEXT ,dsp_offer_id TEXT ,show_limit INTEGER ,show_count INTEGER ,create_time INTEGER ,last_update_time INTEGER)";
    }

    private i(d dVar) {
        super(dVar);
        this.f3769a = i.class.getName();
        this.b = 86400000L;
    }

    public static i a(d dVar) {
        if (c == null) {
            synchronized (i.class) {
                if (c == null) {
                    c = new i(dVar);
                }
            }
        }
        return c;
    }

    public final synchronized long a(com.anythink.core.common.a.l lVar) {
        if (d() == null) {
            return -1L;
        }
        if (lVar.c() <= 0) {
            return -1L;
        }
        if (a(lVar.a(), lVar.b()) == null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("dsp_id", lVar.a());
            contentValues.put("dsp_offer_id", lVar.b());
            contentValues.put(a.d, Integer.valueOf(lVar.c()));
            contentValues.put("show_count", (Integer) 0);
            contentValues.put("create_time", Long.valueOf(System.currentTimeMillis()));
            contentValues.put("last_update_time", Long.valueOf(System.currentTimeMillis()));
            lVar.a();
            lVar.b();
            return d().insert(a.f3770a, null, contentValues);
        }
        lVar.a();
        lVar.b();
        return -1L;
    }

    public final synchronized long b(com.anythink.core.common.a.l lVar) {
        if (d() == null) {
            return -1L;
        }
        if (lVar.c() <= 0) {
            return -1L;
        }
        com.anythink.core.common.a.l a2 = a(lVar.a(), lVar.b());
        if (a2 != null) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("dsp_id", lVar.a());
                contentValues.put("dsp_offer_id", lVar.b());
                contentValues.put(a.d, Integer.valueOf(lVar.c()));
                contentValues.put("show_count", Integer.valueOf(a2.d() + 1));
                contentValues.put("last_update_time", Long.valueOf(System.currentTimeMillis()));
                lVar.a();
                lVar.b();
                a2.d();
                lVar.c();
                return d().update(a.f3770a, contentValues, "dsp_id = ? and dsp_offer_id = ? ", new String[]{lVar.a(), lVar.b()});
            } catch (Exception unused) {
            }
        }
        return -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        if (r11 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
    
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        if (r11 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0043, code lost:
    
        if (r11 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0039, code lost:
    
        if (r11 == null) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized com.anythink.core.common.a.l a(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.c()     // Catch: java.lang.Throwable -> L38 java.lang.OutOfMemoryError -> L3f java.lang.Exception -> L4e
            java.lang.String r2 = "dsp_offer_show_record"
            java.lang.String r4 = "dsp_id = ?  AND dsp_offer_id = ? "
            r3 = 2
            java.lang.String[] r5 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L38 java.lang.OutOfMemoryError -> L3f java.lang.Exception -> L4e
            r9 = 0
            r5[r9] = r11     // Catch: java.lang.Throwable -> L38 java.lang.OutOfMemoryError -> L3f java.lang.Exception -> L4e
            r11 = 1
            r5[r11] = r12     // Catch: java.lang.Throwable -> L38 java.lang.OutOfMemoryError -> L3f java.lang.Exception -> L4e
            r7 = 0
            r8 = 0
            r3 = 0
            r6 = 0
            android.database.Cursor r11 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L38 java.lang.OutOfMemoryError -> L3f java.lang.Exception -> L4e
            java.util.List r12 = r10.a(r11)     // Catch: java.lang.Throwable -> L39 java.lang.OutOfMemoryError -> L40 java.lang.Exception -> L4f
            r11.close()     // Catch: java.lang.Throwable -> L39 java.lang.OutOfMemoryError -> L40 java.lang.Exception -> L4f
            int r1 = r12.size()     // Catch: java.lang.Throwable -> L39 java.lang.OutOfMemoryError -> L40 java.lang.Exception -> L4f
            if (r1 <= 0) goto L35
            java.lang.Object r12 = r12.get(r9)     // Catch: java.lang.Throwable -> L39 java.lang.OutOfMemoryError -> L40 java.lang.Exception -> L4f
            com.anythink.core.common.a.l r12 = (com.anythink.core.common.a.l) r12     // Catch: java.lang.Throwable -> L39 java.lang.OutOfMemoryError -> L40 java.lang.Exception -> L4f
            if (r11 == 0) goto L33
            r11.close()     // Catch: java.lang.Throwable -> L52
        L33:
            monitor-exit(r10)
            return r12
        L35:
            if (r11 == 0) goto L56
            goto L51
        L38:
            r11 = r0
        L39:
            if (r11 == 0) goto L56
        L3b:
            r11.close()     // Catch: java.lang.Throwable -> L52
            goto L56
        L3f:
            r11 = r0
        L40:
            java.lang.System.gc()     // Catch: java.lang.Throwable -> L46
            if (r11 == 0) goto L56
            goto L51
        L46:
            r0 = move-exception
            r12 = r0
            if (r11 == 0) goto L4d
            r11.close()     // Catch: java.lang.Throwable -> L52
        L4d:
            throw r12     // Catch: java.lang.Throwable -> L52
        L4e:
            r11 = r0
        L4f:
            if (r11 == 0) goto L56
        L51:
            goto L3b
        L52:
            r0 = move-exception
            r11 = r0
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L52
            throw r11
        L56:
            monitor-exit(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.e.i.a(java.lang.String, java.lang.String):com.anythink.core.common.a.l");
    }

    private synchronized List<com.anythink.core.common.a.l> a(Cursor cursor) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        if (cursor != null) {
            if (cursor.getCount() > 0) {
                while (cursor.moveToNext()) {
                    try {
                        com.anythink.core.common.a.l lVar = new com.anythink.core.common.a.l();
                        lVar.a(cursor.getString(cursor.getColumnIndex("dsp_id")));
                        lVar.b(cursor.getString(cursor.getColumnIndex("dsp_offer_id")));
                        lVar.a(cursor.getInt(cursor.getColumnIndex(a.d)));
                        lVar.b(cursor.getInt(cursor.getColumnIndex("show_count")));
                        arrayList.add(lVar);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if (r1 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
    
        if (r1 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        if (r1 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0034, code lost:
    
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
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4a
            r0.<init>()     // Catch: java.lang.Throwable -> L4a
            if (r12 > 0) goto La
            monitor-exit(r11)
            return r0
        La:
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r11.c()     // Catch: java.lang.Throwable -> L34 java.lang.OutOfMemoryError -> L37 java.lang.Exception -> L45
            java.lang.String r3 = "dsp_offer_show_record"
            java.lang.String r5 = "show_count > show_limit"
            java.lang.String r9 = "last_update_time DESC"
            java.lang.String r10 = java.lang.String.valueOf(r12)     // Catch: java.lang.Throwable -> L34 java.lang.OutOfMemoryError -> L37 java.lang.Exception -> L45
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L34 java.lang.OutOfMemoryError -> L37 java.lang.Exception -> L45
            java.util.List r12 = r11.a(r1)     // Catch: java.lang.Throwable -> L34 java.lang.OutOfMemoryError -> L37 java.lang.Exception -> L45
            r12.size()     // Catch: java.lang.Throwable -> L34 java.lang.OutOfMemoryError -> L37 java.lang.Exception -> L45
            r1.close()     // Catch: java.lang.Throwable -> L34 java.lang.OutOfMemoryError -> L37 java.lang.Exception -> L45
            r0.addAll(r12)     // Catch: java.lang.Throwable -> L34 java.lang.OutOfMemoryError -> L37 java.lang.Exception -> L45
            if (r1 == 0) goto L48
        L30:
            r1.close()     // Catch: java.lang.Throwable -> L4a
            goto L48
        L34:
            if (r1 == 0) goto L48
            goto L30
        L37:
            java.lang.System.gc()     // Catch: java.lang.Throwable -> L3d
            if (r1 == 0) goto L48
            goto L30
        L3d:
            r0 = move-exception
            r12 = r0
            if (r1 == 0) goto L44
            r1.close()     // Catch: java.lang.Throwable -> L4a
        L44:
            throw r12     // Catch: java.lang.Throwable -> L4a
        L45:
            if (r1 == 0) goto L48
            goto L30
        L48:
            monitor-exit(r11)
            return r0
        L4a:
            r0 = move-exception
            r12 = r0
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L4a
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.e.i.a(int):java.util.List");
    }

    public final void a() {
        try {
            String str = "create_time < " + (System.currentTimeMillis() - 86400000);
            if (d() == null) {
                return;
            }
            d().delete(a.f3770a, str, null);
        } catch (Exception unused) {
        }
    }
}
