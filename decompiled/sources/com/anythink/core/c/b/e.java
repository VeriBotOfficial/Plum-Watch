package com.anythink.core.c.b;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.anythink.core.common.d.t;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public class e extends com.anythink.core.common.e.c<com.anythink.core.c.a.a> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f3597a = "PlacementStatisticsDao";
    private static final int b = 50;
    private static volatile e c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f3598a = "user_value_placement";
        public static final String b = "type";
        public static final String c = "placement_id";
        public static final String d = "request_id";
        public static final String e = "network_firm_id";
        public static final String f = "ad_source_id";
        public static final String g = "dsp_id";
        public static final String h = "price";
        public static final String i = "record_time";
        public static final String j = "ps_id";
        public static final String k = "segment_id";
        public static final String l = "CREATE TABLE IF NOT EXISTS user_value_placement(type INTEGER, placement_id TEXT, request_id TEXT, network_firm_id INTEGER, ad_source_id TEXT, dsp_id TEXT, price DOUBLE, record_time INTEGER, ps_id TEXT )";
        public static final String m = "ALTER TABLE user_value_placement ADD COLUMN segment_id INTEGER";
        public static final String n = "CREATE INDEX placement_id ON user_value_placement (placement_id)";
    }

    private e(com.anythink.core.common.e.d dVar) {
        super(dVar);
    }

    public static e a() {
        if (c == null) {
            synchronized (e.class) {
                if (c == null) {
                    c = new e(com.anythink.core.common.e.e.a(t.b().g()));
                }
            }
        }
        return c;
    }

    public final synchronized void a(com.anythink.core.c.a.a aVar) {
        String j;
        String b2;
        SQLiteDatabase d;
        ContentValues contentValues;
        Cursor query;
        int k = aVar.k();
        Cursor cursor = null;
        try {
            try {
                j = aVar.j();
                b2 = aVar.b();
                d = d();
                contentValues = new ContentValues();
                contentValues.put("type", Integer.valueOf(k));
                contentValues.put("placement_id", j);
                contentValues.put("request_id", b2);
                contentValues.put("ad_source_id", aVar.d());
                contentValues.put("network_firm_id", Integer.valueOf(aVar.c()));
                contentValues.put("dsp_id", aVar.e());
                contentValues.put("price", Double.valueOf(aVar.f()));
                contentValues.put(a.i, Long.valueOf(aVar.g()));
                contentValues.put("ps_id", aVar.h());
                contentValues.put("segment_id", Integer.valueOf(aVar.a()));
                query = c().query(a.f3598a, new String[]{"placement_id", "request_id"}, "placement_id=? AND request_id=? AND type=?", new String[]{j, b2, String.valueOf(k)}, null, null, null);
            } catch (Exception e) {
                e = e;
            }
            if (query == null || query.getCount() <= 0) {
                if (query != null) {
                    query.close();
                }
                Cursor query2 = d.query(a.f3598a, new String[]{a.i}, "type = ? AND placement_id = ?", new String[]{String.valueOf(k), j}, null, null, "record_time ASC");
                try {
                    int count = query2.getCount();
                    new Object[]{Integer.valueOf(count), Integer.valueOf(k), aVar};
                    if (count > 50) {
                        long j2 = query2.moveToNext() ? query2.getLong(query2.getColumnIndexOrThrow(a.i)) : 0L;
                        if (j2 != 0) {
                            new Object[]{Integer.valueOf(d.delete(a.f3598a, "record_time = ?", new String[]{String.valueOf(j2)})), Long.valueOf(j2)};
                        }
                    }
                    new Object[]{Long.valueOf(d.insertOrThrow(a.f3598a, null, contentValues)), Thread.currentThread().getName()};
                    if (query2 != null) {
                        query2.close();
                        return;
                    }
                } catch (Exception e2) {
                    e = e2;
                    cursor = query2;
                    new Object[]{e.getMessage(), Thread.currentThread().getName()};
                    if (cursor != null) {
                        cursor.close();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    th = th;
                    cursor = query2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
                return;
            }
            query.close();
            d().update(a.f3598a, contentValues, "placement_id = ? AND request_id = ? AND type = ?", new String[]{j, b2, String.valueOf(k)});
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private boolean a(String str, String str2, int i) {
        Cursor query = c().query(a.f3598a, new String[]{"placement_id", "request_id"}, "placement_id=? AND request_id=? AND type=?", new String[]{str, str2, String.valueOf(i)}, null, null, null);
        if (query != null && query.getCount() > 0) {
            query.close();
            return true;
        }
        if (query != null) {
            query.close();
        }
        return false;
    }

    public final synchronized List<com.anythink.core.c.a.a> a(String str, int i, long j, int i2) {
        ArrayList arrayList;
        String str2;
        String[] strArr;
        arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                if (i == -1) {
                    str2 = "placement_id = ? AND record_time > ? AND price > ?";
                    strArr = new String[]{str, String.valueOf(j), "0"};
                } else {
                    str2 = "placement_id = ? AND segment_id = ? AND record_time > ? AND price > ?";
                    strArr = new String[]{str, String.valueOf(i), String.valueOf(j), "0"};
                }
                cursor = c().query(a.f3598a, null, str2, strArr, null, null, null, String.valueOf(i2));
                while (cursor.moveToNext()) {
                    com.anythink.core.c.a.a a2 = a(cursor);
                    arrayList.add(a2);
                    new Object[]{a2, Thread.currentThread().getName()};
                }
            } catch (Exception e) {
                new Object[]{e.getMessage(), Thread.currentThread().getName()};
                if (cursor != null) {
                    cursor.close();
                }
                return arrayList;
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0081 A[Catch: all -> 0x0085, TRY_ENTER, TryCatch #2 {, blocks: (B:12:0x0058, B:21:0x0077, B:28:0x0081, B:29:0x0084), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[Catch: all -> 0x0085, SYNTHETIC, TryCatch #2 {, blocks: (B:12:0x0058, B:21:0x0077, B:28:0x0081, B:29:0x0084), top: B:3:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.util.List<com.anythink.core.c.a.a> a(int r12, java.lang.String r13, int r14) {
        /*
            r11 = this;
            monitor-enter(r11)
            r1 = 0
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            r0.<init>()     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            android.database.sqlite.SQLiteDatabase r2 = r11.c()     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            java.lang.String r5 = "type = ? AND placement_id = ?"
            r3 = 2
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            java.lang.String r3 = java.lang.String.valueOf(r12)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            r4 = 0
            r6[r4] = r3     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            r3 = 1
            r6[r3] = r13     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            java.lang.String r9 = "record_time DESC"
            java.lang.String r3 = "user_value_placement"
            java.lang.String r10 = java.lang.String.valueOf(r14)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            r4 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
        L29:
            boolean r3 = r2.moveToNext()     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> L7c
            if (r3 == 0) goto L37
            com.anythink.core.c.a.a r3 = a(r2)     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> L7c
            r0.add(r3)     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> L7c
            goto L29
        L37:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> L7c
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> L7c
            int r3 = r0.size()     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> L7c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> L7c
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> L7c
            long r4 = r4.getId()     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> L7c
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> L7c
            new java.lang.Object[]{r12, r13, r14, r3, r4}     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> L7c
            if (r2 == 0) goto L5b
            r2.close()     // Catch: java.lang.Throwable -> L85
        L5b:
            monitor-exit(r11)
            return r0
        L5d:
            r0 = move-exception
            r12 = r0
            goto L66
        L60:
            r0 = move-exception
            r12 = r0
            goto L7f
        L63:
            r0 = move-exception
            r12 = r0
            r2 = r1
        L66:
            java.lang.String r12 = r12.getMessage()     // Catch: java.lang.Throwable -> L7c
            java.lang.Thread r13 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L7c
            java.lang.String r13 = r13.getName()     // Catch: java.lang.Throwable -> L7c
            new java.lang.Object[]{r12, r13}     // Catch: java.lang.Throwable -> L7c
            if (r2 == 0) goto L7a
            r2.close()     // Catch: java.lang.Throwable -> L85
        L7a:
            monitor-exit(r11)
            return r1
        L7c:
            r0 = move-exception
            r12 = r0
            r1 = r2
        L7f:
            if (r1 == 0) goto L84
            r1.close()     // Catch: java.lang.Throwable -> L85
        L84:
            throw r12     // Catch: java.lang.Throwable -> L85
        L85:
            r0 = move-exception
            r12 = r0
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L85
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.c.b.e.a(int, java.lang.String, int):java.util.List");
    }

    private static com.anythink.core.c.a.a a(Cursor cursor) {
        com.anythink.core.c.a.a aVar = new com.anythink.core.c.a.a();
        int i = cursor.getInt(cursor.getColumnIndexOrThrow("type"));
        String string = cursor.getString(cursor.getColumnIndexOrThrow("placement_id"));
        String string2 = cursor.getString(cursor.getColumnIndexOrThrow("request_id"));
        int i2 = cursor.getInt(cursor.getColumnIndexOrThrow("network_firm_id"));
        String string3 = cursor.getString(cursor.getColumnIndexOrThrow("ad_source_id"));
        String string4 = cursor.getString(cursor.getColumnIndexOrThrow("dsp_id"));
        double d = cursor.getDouble(cursor.getColumnIndexOrThrow("price"));
        long j = cursor.getLong(cursor.getColumnIndexOrThrow(a.i));
        String string5 = cursor.getString(cursor.getColumnIndexOrThrow("ps_id"));
        int i3 = cursor.getInt(cursor.getColumnIndexOrThrow("segment_id"));
        aVar.c(i);
        aVar.e(string);
        aVar.a(string2);
        aVar.b(i2);
        aVar.b(string3);
        aVar.c(string4);
        aVar.a(d);
        aVar.a(j);
        aVar.d(string5);
        aVar.a(i3);
        return aVar;
    }

    public final synchronized void a(String str) {
        try {
            new Object[]{str, Integer.valueOf(d().delete(a.f3598a, "placement_id = ?", new String[]{str}))};
        } catch (Exception e) {
            new Object[]{e.getMessage(), Thread.currentThread().getName()};
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        if (r2 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
    
        if (r2 == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized double[] a(java.lang.String[] r13, java.lang.String r14) {
        /*
            r12 = this;
            monitor-enter(r12)
            r0 = 2
            double[] r1 = new double[r0]     // Catch: java.lang.Throwable -> L4f
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r12.c()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L33
            r10 = 0
            r11 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r5 = r13
            r4 = r14
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L33
            boolean r13 = r2.moveToNext()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L33
            if (r13 == 0) goto L2a
            r13 = 0
            double r3 = r2.getDouble(r13)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L33
            r1[r13] = r3     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L33
            r13 = 1
            int r14 = r2.getInt(r13)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L33
            double r3 = (double) r14     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L33
            r1[r13] = r3     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L33
        L2a:
            if (r2 == 0) goto L47
        L2c:
            r2.close()     // Catch: java.lang.Throwable -> L4f
            goto L47
        L30:
            r0 = move-exception
            r13 = r0
            goto L49
        L33:
            r0 = move-exception
            r13 = r0
            java.lang.String r13 = r13.getMessage()     // Catch: java.lang.Throwable -> L30
            java.lang.Thread r14 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L30
            java.lang.String r14 = r14.getName()     // Catch: java.lang.Throwable -> L30
            new java.lang.Object[]{r13, r14}     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L47
            goto L2c
        L47:
            monitor-exit(r12)
            return r1
        L49:
            if (r2 == 0) goto L4e
            r2.close()     // Catch: java.lang.Throwable -> L4f
        L4e:
            throw r13     // Catch: java.lang.Throwable -> L4f
        L4f:
            r0 = move-exception
            r13 = r0
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L4f
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.c.b.e.a(java.lang.String[], java.lang.String):double[]");
    }
}
