package com.anythink.core.common.e;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/* loaded from: classes12.dex */
public class b extends c<com.anythink.core.common.a.l> {
    private static volatile b b;

    /* renamed from: a, reason: collision with root package name */
    private final String f3757a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f3758a = "adx_offer_tracking";
        public static final String b = "placement_id";
        public static final String c = "dsp_id";
        public static final String d = "offer_id";
        public static final String e = "tk_type";
        public static final String f = "extra_info";
        public static final String g = "create_time";
        public static final String h = "CREATE TABLE IF NOT EXISTS adx_offer_tracking(placement_id TEXT ,dsp_id TEXT ,offer_id TEXT ,tk_type INTEGER ,extra_info TEXT ,create_time INTEGER)";
    }

    private b(d dVar) {
        super(dVar);
        this.f3757a = b.class.getName();
    }

    public static b a(d dVar) {
        if (b == null) {
            synchronized (b.class) {
                if (b == null) {
                    b = new b(dVar);
                }
            }
        }
        return b;
    }

    public final synchronized long a(com.anythink.core.common.a.g gVar) {
        if (d() == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("placement_id", gVar.a());
            contentValues.put("dsp_id", gVar.b());
            contentValues.put("offer_id", gVar.c());
            contentValues.put(a.e, Integer.valueOf(gVar.d()));
            contentValues.put("extra_info", gVar.e());
            contentValues.put("create_time", Long.valueOf(System.currentTimeMillis()));
            gVar.b();
            gVar.c();
            return d().insert(a.f3758a, null, contentValues);
        } catch (Exception unused) {
            return -1L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (r1 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
    
        if (r1 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0032, code lost:
    
        if (r1 == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.util.List<com.anythink.core.common.a.g> a() {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r9.c()     // Catch: java.lang.Throwable -> L31 java.lang.OutOfMemoryError -> L35 java.lang.Exception -> L46
            java.lang.String r2 = "adx_offer_tracking"
            java.lang.String r4 = "create_time >= ? "
            r3 = 1
            java.lang.String[] r5 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L31 java.lang.OutOfMemoryError -> L35 java.lang.Exception -> L46
            long r6 = e()     // Catch: java.lang.Throwable -> L31 java.lang.OutOfMemoryError -> L35 java.lang.Exception -> L46
            java.lang.String r3 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L31 java.lang.OutOfMemoryError -> L35 java.lang.Exception -> L46
            r6 = 0
            r5[r6] = r3     // Catch: java.lang.Throwable -> L31 java.lang.OutOfMemoryError -> L35 java.lang.Exception -> L46
            r7 = 0
            r8 = 0
            r3 = 0
            r6 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L31 java.lang.OutOfMemoryError -> L35 java.lang.Exception -> L46
            java.util.List r2 = r9.a(r1)     // Catch: java.lang.Throwable -> L32 java.lang.OutOfMemoryError -> L36 java.lang.Exception -> L47
            r1.close()     // Catch: java.lang.Throwable -> L32 java.lang.OutOfMemoryError -> L36 java.lang.Exception -> L47
            r2.size()     // Catch: java.lang.Throwable -> L32 java.lang.OutOfMemoryError -> L36 java.lang.Exception -> L47
            if (r1 == 0) goto L2f
            r1.close()     // Catch: java.lang.Throwable -> L4a
        L2f:
            monitor-exit(r9)
            return r2
        L31:
            r1 = r0
        L32:
            if (r1 == 0) goto L4d
            goto L49
        L35:
            r1 = r0
        L36:
            java.lang.System.gc()     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L4d
        L3b:
            r1.close()     // Catch: java.lang.Throwable -> L4a
            goto L4d
        L3f:
            r0 = move-exception
            if (r1 == 0) goto L45
            r1.close()     // Catch: java.lang.Throwable -> L4a
        L45:
            throw r0     // Catch: java.lang.Throwable -> L4a
        L46:
            r1 = r0
        L47:
            if (r1 == 0) goto L4d
        L49:
            goto L3b
        L4a:
            r0 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L4a
            throw r0
        L4d:
            monitor-exit(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.e.b.a():java.util.List");
    }

    private synchronized List<com.anythink.core.common.a.g> a(Cursor cursor) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        if (cursor != null) {
            if (cursor.getCount() > 0) {
                while (cursor.moveToNext()) {
                    try {
                        com.anythink.core.common.a.g gVar = new com.anythink.core.common.a.g();
                        int columnIndex = cursor.getColumnIndex("placement_id");
                        if (columnIndex >= 0) {
                            gVar.a(cursor.getString(columnIndex));
                        }
                        int columnIndex2 = cursor.getColumnIndex("dsp_id");
                        if (columnIndex2 >= 0) {
                            gVar.b(cursor.getString(columnIndex2));
                        }
                        int columnIndex3 = cursor.getColumnIndex("offer_id");
                        if (columnIndex3 >= 0) {
                            gVar.c(cursor.getString(columnIndex3));
                        }
                        int columnIndex4 = cursor.getColumnIndex(a.e);
                        if (columnIndex4 >= 0) {
                            gVar.a(cursor.getInt(columnIndex4));
                        }
                        int columnIndex5 = cursor.getColumnIndex("extra_info");
                        if (columnIndex5 >= 0) {
                            gVar.d(cursor.getString(columnIndex5));
                        }
                        arrayList.add(gVar);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        return arrayList;
    }

    public final void b() {
        try {
            String str = "create_time < " + e();
            if (d() == null) {
                return;
            }
            d().delete(a.f3758a, str, null);
        } catch (Exception unused) {
        }
    }

    private static long e() {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            return calendar.getTimeInMillis();
        } catch (Throwable unused) {
            return 0L;
        }
    }
}
