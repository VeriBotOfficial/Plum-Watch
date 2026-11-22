package com.anythink.core.common.e;

import android.content.ContentValues;
import android.database.Cursor;
import com.anythink.core.common.h.bs;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public class f extends c<bs> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f3762a = "com.anythink.core.common.e.f";
    private static volatile f b;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f3763a = "sdkconfig";
        public static final String b = "key";
        public static final String c = "type";
        public static final String d = "value";
        public static final String e = "lastupdatetime";
        public static final String f = "CREATE TABLE IF NOT EXISTS sdkconfig(key TEXT ,type TEXT ,lastupdatetime TEXT ,value TEXT )";
    }

    private f(d dVar) {
        super(dVar);
    }

    public static f a(d dVar) {
        if (b == null) {
            synchronized (f.class) {
                if (b == null) {
                    b = new f(dVar);
                }
            }
        }
        return b;
    }

    public final synchronized long a(String str, String str2, String str3) {
        if (d() == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("key", str);
            contentValues.put("type", str3);
            contentValues.put("value", str2);
            contentValues.put(a.e, new StringBuilder().append(System.currentTimeMillis()).toString());
            if (b(str, str3)) {
                return d().update(a.f3763a, contentValues, "key = ? AND type = ?", new String[]{str, str3});
            }
            return d().insert(a.f3763a, null, contentValues);
        } catch (Exception unused) {
            return -1L;
        }
    }

    private synchronized long a(bs bsVar) {
        if (d() == null || bsVar == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("key", bsVar.b());
            contentValues.put("type", bsVar.c());
            contentValues.put("value", bsVar.d());
            contentValues.put(a.e, bsVar.a());
            if (b(bsVar.b(), bsVar.a(), bsVar.c())) {
                return d().update(a.f3763a, contentValues, "key = ? AND type = ? AND lastupdatetime = ?  ", new String[]{bsVar.b(), bsVar.c(), bsVar.a()});
            }
            return d().insert(a.f3763a, null, contentValues);
        } catch (Exception unused) {
            return -1L;
        }
    }

    private synchronized boolean b(String str, String str2) {
        Cursor query = c().query(a.f3763a, new String[]{"key"}, "key=? AND type=?", new String[]{str, str2}, null, null, null);
        if (query != null && query.getCount() > 0) {
            query.close();
            return true;
        }
        if (query != null) {
            query.close();
        }
        return false;
    }

    private synchronized boolean b(String str, String str2, String str3) {
        Cursor query = c().query(a.f3763a, new String[]{"key"}, "key=? AND type=? AND lastupdatetime=?", new String[]{str, str3, str2}, null, null, null);
        if (query != null && query.getCount() > 0) {
            query.close();
            return true;
        }
        if (query != null) {
            query.close();
        }
        return false;
    }

    private synchronized void c(String str, String str2) {
        List<bs> c = c(str, str2, bs.a.f3885a);
        if (c != null && c.size() > 0) {
            for (bs bsVar : c) {
                bsVar.d(new StringBuilder().append(Integer.parseInt(bsVar.d()) + 1).toString());
                a(bsVar);
            }
            return;
        }
        bs bsVar2 = new bs();
        bsVar2.a(str2);
        bsVar2.d("1");
        bsVar2.c(bs.a.f3885a);
        bsVar2.b(str);
        a(bsVar2);
    }

    private synchronized List<bs> a(Cursor cursor) {
        if (cursor != null) {
            if (cursor.getCount() > 0) {
                ArrayList arrayList = new ArrayList();
                while (cursor.moveToNext()) {
                    bs bsVar = new bs();
                    bsVar.b(cursor.getString(cursor.getColumnIndex("key")));
                    bsVar.c(cursor.getString(cursor.getColumnIndex("type")));
                    bsVar.d(cursor.getString(cursor.getColumnIndex("value")));
                    bsVar.a(cursor.getString(cursor.getColumnIndex(a.e)));
                    arrayList.add(bsVar);
                }
                cursor.close();
                return arrayList;
            }
        }
        return null;
    }

    private synchronized void a(String str) {
        try {
            if (d() == null) {
                return;
            }
            d().delete(a.f3763a, "lastupdatetime< ? and type = ?", new String[]{str, bs.a.f3885a});
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        if (r10 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0031, code lost:
    
        if (r10 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x002a, code lost:
    
        if (r10 == null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized java.util.List<com.anythink.core.common.h.bs> c(java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r9.c()     // Catch: java.lang.Throwable -> L29 java.lang.OutOfMemoryError -> L2d java.lang.Exception -> L3f
            java.lang.String r2 = "sdkconfig"
            java.lang.String r4 = "key = ? and type = ? and lastupdatetime = ?"
            r3 = 3
            java.lang.String[] r5 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L29 java.lang.OutOfMemoryError -> L2d java.lang.Exception -> L3f
            r3 = 0
            r5[r3] = r10     // Catch: java.lang.Throwable -> L29 java.lang.OutOfMemoryError -> L2d java.lang.Exception -> L3f
            r10 = 1
            r5[r10] = r12     // Catch: java.lang.Throwable -> L29 java.lang.OutOfMemoryError -> L2d java.lang.Exception -> L3f
            r10 = 2
            r5[r10] = r11     // Catch: java.lang.Throwable -> L29 java.lang.OutOfMemoryError -> L2d java.lang.Exception -> L3f
            r7 = 0
            r8 = 0
            r3 = 0
            r6 = 0
            android.database.Cursor r10 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L29 java.lang.OutOfMemoryError -> L2d java.lang.Exception -> L3f
            java.util.List r11 = r9.a(r10)     // Catch: java.lang.Throwable -> L2a java.lang.OutOfMemoryError -> L2e java.lang.Exception -> L40
            if (r10 == 0) goto L27
            r10.close()     // Catch: java.lang.Throwable -> L43
        L27:
            monitor-exit(r9)
            return r11
        L29:
            r10 = r0
        L2a:
            if (r10 == 0) goto L47
            goto L42
        L2d:
            r10 = r0
        L2e:
            java.lang.System.gc()     // Catch: java.lang.Throwable -> L37
            if (r10 == 0) goto L47
        L33:
            r10.close()     // Catch: java.lang.Throwable -> L43
            goto L47
        L37:
            r0 = move-exception
            r11 = r0
            if (r10 == 0) goto L3e
            r10.close()     // Catch: java.lang.Throwable -> L43
        L3e:
            throw r11     // Catch: java.lang.Throwable -> L43
        L3f:
            r10 = r0
        L40:
            if (r10 == 0) goto L47
        L42:
            goto L33
        L43:
            r0 = move-exception
            r10 = r0
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L43
            throw r10
        L47:
            monitor-exit(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.e.f.c(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r10 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002e, code lost:
    
        if (r10 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0027, code lost:
    
        if (r10 == null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.util.List<com.anythink.core.common.h.bs> a(java.lang.String r10, java.lang.String r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r9.c()     // Catch: java.lang.Throwable -> L26 java.lang.OutOfMemoryError -> L2a java.lang.Exception -> L3c
            java.lang.String r2 = "sdkconfig"
            java.lang.String r4 = "key = ? and type = ?"
            r3 = 2
            java.lang.String[] r5 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L26 java.lang.OutOfMemoryError -> L2a java.lang.Exception -> L3c
            r3 = 0
            r5[r3] = r10     // Catch: java.lang.Throwable -> L26 java.lang.OutOfMemoryError -> L2a java.lang.Exception -> L3c
            r10 = 1
            r5[r10] = r11     // Catch: java.lang.Throwable -> L26 java.lang.OutOfMemoryError -> L2a java.lang.Exception -> L3c
            r7 = 0
            r8 = 0
            r3 = 0
            r6 = 0
            android.database.Cursor r10 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L26 java.lang.OutOfMemoryError -> L2a java.lang.Exception -> L3c
            java.util.List r11 = r9.a(r10)     // Catch: java.lang.Throwable -> L27 java.lang.OutOfMemoryError -> L2b java.lang.Exception -> L3d
            if (r10 == 0) goto L24
            r10.close()     // Catch: java.lang.Throwable -> L40
        L24:
            monitor-exit(r9)
            return r11
        L26:
            r10 = r0
        L27:
            if (r10 == 0) goto L44
            goto L3f
        L2a:
            r10 = r0
        L2b:
            java.lang.System.gc()     // Catch: java.lang.Throwable -> L34
            if (r10 == 0) goto L44
        L30:
            r10.close()     // Catch: java.lang.Throwable -> L40
            goto L44
        L34:
            r0 = move-exception
            r11 = r0
            if (r10 == 0) goto L3b
            r10.close()     // Catch: java.lang.Throwable -> L40
        L3b:
            throw r11     // Catch: java.lang.Throwable -> L40
        L3c:
            r10 = r0
        L3d:
            if (r10 == 0) goto L44
        L3f:
            goto L30
        L40:
            r0 = move-exception
            r10 = r0
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L40
            throw r10
        L44:
            monitor-exit(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.e.f.a(java.lang.String, java.lang.String):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r10 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002e, code lost:
    
        if (r10 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0027, code lost:
    
        if (r10 == null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized java.util.List<com.anythink.core.common.h.bs> d(java.lang.String r10, java.lang.String r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r9.c()     // Catch: java.lang.Throwable -> L26 java.lang.OutOfMemoryError -> L2a java.lang.Exception -> L3c
            java.lang.String r2 = "sdkconfig"
            java.lang.String r4 = "key != ? and type = ?"
            r3 = 2
            java.lang.String[] r5 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L26 java.lang.OutOfMemoryError -> L2a java.lang.Exception -> L3c
            r3 = 0
            r5[r3] = r10     // Catch: java.lang.Throwable -> L26 java.lang.OutOfMemoryError -> L2a java.lang.Exception -> L3c
            r10 = 1
            r5[r10] = r11     // Catch: java.lang.Throwable -> L26 java.lang.OutOfMemoryError -> L2a java.lang.Exception -> L3c
            r7 = 0
            r8 = 0
            r3 = 0
            r6 = 0
            android.database.Cursor r10 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L26 java.lang.OutOfMemoryError -> L2a java.lang.Exception -> L3c
            java.util.List r11 = r9.a(r10)     // Catch: java.lang.Throwable -> L27 java.lang.OutOfMemoryError -> L2b java.lang.Exception -> L3d
            if (r10 == 0) goto L24
            r10.close()     // Catch: java.lang.Throwable -> L40
        L24:
            monitor-exit(r9)
            return r11
        L26:
            r10 = r0
        L27:
            if (r10 == 0) goto L44
            goto L3f
        L2a:
            r10 = r0
        L2b:
            java.lang.System.gc()     // Catch: java.lang.Throwable -> L34
            if (r10 == 0) goto L44
        L30:
            r10.close()     // Catch: java.lang.Throwable -> L40
            goto L44
        L34:
            r0 = move-exception
            r11 = r0
            if (r10 == 0) goto L3b
            r10.close()     // Catch: java.lang.Throwable -> L40
        L3b:
            throw r11     // Catch: java.lang.Throwable -> L40
        L3c:
            r10 = r0
        L3d:
            if (r10 == 0) goto L44
        L3f:
            goto L30
        L40:
            r0 = move-exception
            r10 = r0
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L40
            throw r10
        L44:
            monitor-exit(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.e.f.d(java.lang.String, java.lang.String):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (r10 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002b, code lost:
    
        if (r10 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0024, code lost:
    
        if (r10 == null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized java.util.List<com.anythink.core.common.h.bs> b(java.lang.String r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r9.c()     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L27 java.lang.Exception -> L38
            java.lang.String r2 = "sdkconfig"
            java.lang.String r4 = "type = ?"
            r3 = 1
            java.lang.String[] r5 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L27 java.lang.Exception -> L38
            r3 = 0
            r5[r3] = r10     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L27 java.lang.Exception -> L38
            r7 = 0
            r8 = 0
            r3 = 0
            r6 = 0
            android.database.Cursor r10 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L23 java.lang.OutOfMemoryError -> L27 java.lang.Exception -> L38
            java.util.List r0 = r9.a(r10)     // Catch: java.lang.Throwable -> L24 java.lang.OutOfMemoryError -> L28 java.lang.Exception -> L39
            if (r10 == 0) goto L21
            r10.close()     // Catch: java.lang.Throwable -> L3c
        L21:
            monitor-exit(r9)
            return r0
        L23:
            r10 = r0
        L24:
            if (r10 == 0) goto L40
            goto L3b
        L27:
            r10 = r0
        L28:
            java.lang.System.gc()     // Catch: java.lang.Throwable -> L31
            if (r10 == 0) goto L40
        L2d:
            r10.close()     // Catch: java.lang.Throwable -> L3c
            goto L40
        L31:
            r0 = move-exception
            if (r10 == 0) goto L37
            r10.close()     // Catch: java.lang.Throwable -> L3c
        L37:
            throw r0     // Catch: java.lang.Throwable -> L3c
        L38:
            r10 = r0
        L39:
            if (r10 == 0) goto L40
        L3b:
            goto L2d
        L3c:
            r0 = move-exception
            r10 = r0
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L3c
            throw r10
        L40:
            monitor-exit(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.e.f.b(java.lang.String):java.util.List");
    }
}
