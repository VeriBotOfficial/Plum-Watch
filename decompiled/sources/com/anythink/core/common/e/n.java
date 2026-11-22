package com.anythink.core.common.e;

import android.content.ContentValues;
import android.database.Cursor;
import android.gov.nist.core.Separators;
import com.anythink.core.common.h.be;

/* loaded from: classes12.dex */
public class n extends c<be> {
    private static n b;

    /* renamed from: a, reason: collision with root package name */
    private final String f3780a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f3781a = "offer_action_record";
        public static final String b = "adsource_id";
        public static final String c = "type";
        public static final String d = "unit_id";
        public static final String e = "click_count";
        public static final String f = "show_count";
        public static final String g = "expire_time";
        public static final String h = "CREATE TABLE IF NOT EXISTS offer_action_record(adsource_id TEXT ,type INTEGER ,unit_id TEXT ,click_count INTEGER ,show_count INTEGER ,expire_time INTEGER )";
    }

    private n(d dVar) {
        super(dVar);
        this.f3780a = n.class.getName();
    }

    public static n a(d dVar) {
        if (b == null) {
            synchronized (n.class) {
                if (b == null) {
                    b = new n(dVar);
                }
            }
        }
        return b;
    }

    public final synchronized void a(int i, String str, int i2, int i3) {
        be a2 = a(i, str);
        if (a2 != null) {
            a2.b(a2.d() + i2);
            a2.a(a2.c() + i3);
            a(a2);
        }
    }

    public final synchronized void a(int i, String str, long j) {
        be a2 = a(i, str);
        if (a2 != null) {
            a2.a(j);
            a(a2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0074, code lost:
    
        if (r1 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0076, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008b, code lost:
    
        if (r1 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0080, code lost:
    
        if (r1 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007a, code lost:
    
        if (r1 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.util.List<com.anythink.core.common.h.be> a(int r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L90
            r0.<init>()     // Catch: java.lang.Throwable -> L90
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r10.c()     // Catch: java.lang.Throwable -> L7a java.lang.OutOfMemoryError -> L7d java.lang.Exception -> L8b
            java.lang.String r3 = "offer_action_record"
            java.lang.String r5 = "type = ? and expire_time > ?"
            r4 = 2
            java.lang.String[] r6 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L7a java.lang.OutOfMemoryError -> L7d java.lang.Exception -> L8b
            java.lang.String r4 = java.lang.String.valueOf(r11)     // Catch: java.lang.Throwable -> L7a java.lang.OutOfMemoryError -> L7d java.lang.Exception -> L8b
            r7 = 0
            r6[r7] = r4     // Catch: java.lang.Throwable -> L7a java.lang.OutOfMemoryError -> L7d java.lang.Exception -> L8b
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L7a java.lang.OutOfMemoryError -> L7d java.lang.Exception -> L8b
            java.lang.String r4 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L7a java.lang.OutOfMemoryError -> L7d java.lang.Exception -> L8b
            r7 = 1
            r6[r7] = r4     // Catch: java.lang.Throwable -> L7a java.lang.OutOfMemoryError -> L7d java.lang.Exception -> L8b
            r8 = 0
            r9 = 0
            r4 = 0
            r7 = 0
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L7a java.lang.OutOfMemoryError -> L7d java.lang.Exception -> L8b
            if (r1 == 0) goto L74
            int r2 = r1.getCount()     // Catch: java.lang.Throwable -> L7a java.lang.OutOfMemoryError -> L7d java.lang.Exception -> L8b
            if (r2 <= 0) goto L74
        L34:
            boolean r2 = r1.moveToNext()     // Catch: java.lang.Throwable -> L7a java.lang.OutOfMemoryError -> L7d java.lang.Exception -> L8b
            if (r2 == 0) goto L74
            com.anythink.core.common.h.be r2 = new com.anythink.core.common.h.be     // Catch: java.lang.Throwable -> L7a java.lang.OutOfMemoryError -> L7d java.lang.Exception -> L8b
            java.lang.String r3 = "unit_id"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L7a java.lang.OutOfMemoryError -> L7d java.lang.Exception -> L8b
            java.lang.String r3 = r1.getString(r3)     // Catch: java.lang.Throwable -> L7a java.lang.OutOfMemoryError -> L7d java.lang.Exception -> L8b
            r2.<init>(r11, r3)     // Catch: java.lang.Throwable -> L7a java.lang.OutOfMemoryError -> L7d java.lang.Exception -> L8b
            java.lang.String r3 = "click_count"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L7a java.lang.OutOfMemoryError -> L7d java.lang.Exception -> L8b
            int r3 = r1.getInt(r3)     // Catch: java.lang.Throwable -> L7a java.lang.OutOfMemoryError -> L7d java.lang.Exception -> L8b
            r2.b(r3)     // Catch: java.lang.Throwable -> L7a java.lang.OutOfMemoryError -> L7d java.lang.Exception -> L8b
            java.lang.String r3 = "show_count"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L7a java.lang.OutOfMemoryError -> L7d java.lang.Exception -> L8b
            int r3 = r1.getInt(r3)     // Catch: java.lang.Throwable -> L7a java.lang.OutOfMemoryError -> L7d java.lang.Exception -> L8b
            r2.a(r3)     // Catch: java.lang.Throwable -> L7a java.lang.OutOfMemoryError -> L7d java.lang.Exception -> L8b
            java.lang.String r3 = "expire_time"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L7a java.lang.OutOfMemoryError -> L7d java.lang.Exception -> L8b
            long r3 = r1.getLong(r3)     // Catch: java.lang.Throwable -> L7a java.lang.OutOfMemoryError -> L7d java.lang.Exception -> L8b
            r2.a(r3)     // Catch: java.lang.Throwable -> L7a java.lang.OutOfMemoryError -> L7d java.lang.Exception -> L8b
            r0.add(r2)     // Catch: java.lang.Throwable -> L7a java.lang.OutOfMemoryError -> L7d java.lang.Exception -> L8b
            goto L34
        L74:
            if (r1 == 0) goto L8e
        L76:
            r1.close()     // Catch: java.lang.Throwable -> L90
            goto L8e
        L7a:
            if (r1 == 0) goto L8e
            goto L76
        L7d:
            java.lang.System.gc()     // Catch: java.lang.Throwable -> L83
            if (r1 == 0) goto L8e
            goto L76
        L83:
            r0 = move-exception
            r11 = r0
            if (r1 == 0) goto L8a
            r1.close()     // Catch: java.lang.Throwable -> L90
        L8a:
            throw r11     // Catch: java.lang.Throwable -> L90
        L8b:
            if (r1 == 0) goto L8e
            goto L76
        L8e:
            monitor-exit(r10)
            return r0
        L90:
            r0 = move-exception
            r11 = r0
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L90
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.e.n.a(int):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a6, code lost:
    
        if (r1 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a8, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bd, code lost:
    
        if (r1 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b2, code lost:
    
        if (r1 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ac, code lost:
    
        if (r1 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.util.List<com.anythink.core.common.h.be> a(java.util.List<java.lang.String> r12, int r13) {
        /*
            r11 = this;
            monitor-enter(r11)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lc2
            r0.<init>()     // Catch: java.lang.Throwable -> Lc2
            int r1 = r12.size()     // Catch: java.lang.Throwable -> Lc2
            b(r1)     // Catch: java.lang.Throwable -> Lc2
            r1 = 0
            int r2 = r12.size()     // Catch: java.lang.Throwable -> Lac java.lang.OutOfMemoryError -> Laf java.lang.Exception -> Lbd
            int r2 = r2 + 2
            java.lang.String[] r7 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> Lac java.lang.OutOfMemoryError -> Laf java.lang.Exception -> Lbd
            r12.toArray(r7)     // Catch: java.lang.Throwable -> Lac java.lang.OutOfMemoryError -> Laf java.lang.Exception -> Lbd
            int r2 = r12.size()     // Catch: java.lang.Throwable -> Lac java.lang.OutOfMemoryError -> Laf java.lang.Exception -> Lbd
            java.lang.String r3 = java.lang.String.valueOf(r13)     // Catch: java.lang.Throwable -> Lac java.lang.OutOfMemoryError -> Laf java.lang.Exception -> Lbd
            r7[r2] = r3     // Catch: java.lang.Throwable -> Lac java.lang.OutOfMemoryError -> Laf java.lang.Exception -> Lbd
            int r2 = r12.size()     // Catch: java.lang.Throwable -> Lac java.lang.OutOfMemoryError -> Laf java.lang.Exception -> Lbd
            int r2 = r2 + 1
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lac java.lang.OutOfMemoryError -> Laf java.lang.Exception -> Lbd
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> Lac java.lang.OutOfMemoryError -> Laf java.lang.Exception -> Lbd
            r7[r2] = r3     // Catch: java.lang.Throwable -> Lac java.lang.OutOfMemoryError -> Laf java.lang.Exception -> Lbd
            android.database.sqlite.SQLiteDatabase r3 = r11.c()     // Catch: java.lang.Throwable -> Lac java.lang.OutOfMemoryError -> Laf java.lang.Exception -> Lbd
            java.lang.String r4 = "offer_action_record"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lac java.lang.OutOfMemoryError -> Laf java.lang.Exception -> Lbd
            java.lang.String r5 = "adsource_id IN ("
            r2.<init>(r5)     // Catch: java.lang.Throwable -> Lac java.lang.OutOfMemoryError -> Laf java.lang.Exception -> Lbd
            int r12 = r12.size()     // Catch: java.lang.Throwable -> Lac java.lang.OutOfMemoryError -> Laf java.lang.Exception -> Lbd
            java.lang.String r12 = b(r12)     // Catch: java.lang.Throwable -> Lac java.lang.OutOfMemoryError -> Laf java.lang.Exception -> Lbd
            java.lang.StringBuilder r12 = r2.append(r12)     // Catch: java.lang.Throwable -> Lac java.lang.OutOfMemoryError -> Laf java.lang.Exception -> Lbd
            java.lang.String r2 = ") and type = ? and expire_time > ?"
            java.lang.StringBuilder r12 = r12.append(r2)     // Catch: java.lang.Throwable -> Lac java.lang.OutOfMemoryError -> Laf java.lang.Exception -> Lbd
            java.lang.String r6 = r12.toString()     // Catch: java.lang.Throwable -> Lac java.lang.OutOfMemoryError -> Laf java.lang.Exception -> Lbd
            r9 = 0
            r10 = 0
            r5 = 0
            r8 = 0
            android.database.Cursor r1 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> Lac java.lang.OutOfMemoryError -> Laf java.lang.Exception -> Lbd
            if (r1 == 0) goto La6
            int r12 = r1.getCount()     // Catch: java.lang.Throwable -> Lac java.lang.OutOfMemoryError -> Laf java.lang.Exception -> Lbd
            if (r12 <= 0) goto La6
        L66:
            boolean r12 = r1.moveToNext()     // Catch: java.lang.Throwable -> Lac java.lang.OutOfMemoryError -> Laf java.lang.Exception -> Lbd
            if (r12 == 0) goto La6
            com.anythink.core.common.h.be r12 = new com.anythink.core.common.h.be     // Catch: java.lang.Throwable -> Lac java.lang.OutOfMemoryError -> Laf java.lang.Exception -> Lbd
            java.lang.String r2 = "unit_id"
            int r2 = r1.getColumnIndex(r2)     // Catch: java.lang.Throwable -> Lac java.lang.OutOfMemoryError -> Laf java.lang.Exception -> Lbd
            java.lang.String r2 = r1.getString(r2)     // Catch: java.lang.Throwable -> Lac java.lang.OutOfMemoryError -> Laf java.lang.Exception -> Lbd
            r12.<init>(r13, r2)     // Catch: java.lang.Throwable -> Lac java.lang.OutOfMemoryError -> Laf java.lang.Exception -> Lbd
            java.lang.String r2 = "click_count"
            int r2 = r1.getColumnIndex(r2)     // Catch: java.lang.Throwable -> Lac java.lang.OutOfMemoryError -> Laf java.lang.Exception -> Lbd
            int r2 = r1.getInt(r2)     // Catch: java.lang.Throwable -> Lac java.lang.OutOfMemoryError -> Laf java.lang.Exception -> Lbd
            r12.b(r2)     // Catch: java.lang.Throwable -> Lac java.lang.OutOfMemoryError -> Laf java.lang.Exception -> Lbd
            java.lang.String r2 = "show_count"
            int r2 = r1.getColumnIndex(r2)     // Catch: java.lang.Throwable -> Lac java.lang.OutOfMemoryError -> Laf java.lang.Exception -> Lbd
            int r2 = r1.getInt(r2)     // Catch: java.lang.Throwable -> Lac java.lang.OutOfMemoryError -> Laf java.lang.Exception -> Lbd
            r12.a(r2)     // Catch: java.lang.Throwable -> Lac java.lang.OutOfMemoryError -> Laf java.lang.Exception -> Lbd
            java.lang.String r2 = "expire_time"
            int r2 = r1.getColumnIndex(r2)     // Catch: java.lang.Throwable -> Lac java.lang.OutOfMemoryError -> Laf java.lang.Exception -> Lbd
            long r2 = r1.getLong(r2)     // Catch: java.lang.Throwable -> Lac java.lang.OutOfMemoryError -> Laf java.lang.Exception -> Lbd
            r12.a(r2)     // Catch: java.lang.Throwable -> Lac java.lang.OutOfMemoryError -> Laf java.lang.Exception -> Lbd
            r0.add(r12)     // Catch: java.lang.Throwable -> Lac java.lang.OutOfMemoryError -> Laf java.lang.Exception -> Lbd
            goto L66
        La6:
            if (r1 == 0) goto Lc0
        La8:
            r1.close()     // Catch: java.lang.Throwable -> Lc2
            goto Lc0
        Lac:
            if (r1 == 0) goto Lc0
            goto La8
        Laf:
            java.lang.System.gc()     // Catch: java.lang.Throwable -> Lb5
            if (r1 == 0) goto Lc0
            goto La8
        Lb5:
            r0 = move-exception
            r12 = r0
            if (r1 == 0) goto Lbc
            r1.close()     // Catch: java.lang.Throwable -> Lc2
        Lbc:
            throw r12     // Catch: java.lang.Throwable -> Lc2
        Lbd:
            if (r1 == 0) goto Lc0
            goto La8
        Lc0:
            monitor-exit(r11)
            return r0
        Lc2:
            r0 = move-exception
            r12 = r0
            monitor-exit(r11)     // Catch: java.lang.Throwable -> Lc2
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.e.n.a(java.util.List, int):java.util.List");
    }

    private static String b(int i) {
        if (i <= 0) {
            throw new RuntimeException("No placeholders");
        }
        StringBuilder sb = new StringBuilder((i * 2) - 1);
        sb.append(Separators.QUESTION);
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(",?");
        }
        return sb.toString();
    }

    private synchronized long a(be beVar) {
        if (d() == null || beVar == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("type", Integer.valueOf(beVar.e()));
            contentValues.put("unit_id", beVar.a());
            contentValues.put(a.e, Integer.valueOf(beVar.d()));
            contentValues.put("show_count", Integer.valueOf(beVar.c()));
            contentValues.put(a.g, Long.valueOf(beVar.b()));
            return d().update(a.f3781a, contentValues, "type = ? and unit_id = ?", new String[]{String.valueOf(beVar.e()), beVar.a()});
        } catch (Exception unused) {
            return -1L;
        }
    }

    private synchronized long b(String str, int i, String str2) {
        if (d() == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("adsource_id", str);
            contentValues.put("type", Integer.valueOf(i));
            contentValues.put("unit_id", str2);
            be a2 = a(i, str2);
            if (a2 != null) {
                contentValues.put(a.e, Integer.valueOf(a2.d()));
                contentValues.put("show_count", Integer.valueOf(a2.c()));
                contentValues.put(a.g, Long.valueOf(a2.b()));
            } else {
                contentValues.put(a.e, (Integer) 0);
                contentValues.put("show_count", (Integer) 0);
                contentValues.put(a.g, (Integer) (-1));
            }
            return d().insert(a.f3781a, null, contentValues);
        } catch (Exception unused) {
            return -1L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007e, code lost:
    
        if (r1 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0086, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006f, code lost:
    
        if (r1 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0068, code lost:
    
        if (r1 == null) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized com.anythink.core.common.h.be a(int r10, java.lang.String r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r9.c()     // Catch: java.lang.Throwable -> L67 java.lang.OutOfMemoryError -> L6b java.lang.Exception -> L7d
            java.lang.String r2 = "offer_action_record"
            java.lang.String r4 = "type=? and unit_id = ?"
            r3 = 2
            java.lang.String[] r5 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L67 java.lang.OutOfMemoryError -> L6b java.lang.Exception -> L7d
            java.lang.String r3 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> L67 java.lang.OutOfMemoryError -> L6b java.lang.Exception -> L7d
            r6 = 0
            r5[r6] = r3     // Catch: java.lang.Throwable -> L67 java.lang.OutOfMemoryError -> L6b java.lang.Exception -> L7d
            r3 = 1
            r5[r3] = r11     // Catch: java.lang.Throwable -> L67 java.lang.OutOfMemoryError -> L6b java.lang.Exception -> L7d
            r7 = 0
            r8 = 0
            r3 = 0
            r6 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L67 java.lang.OutOfMemoryError -> L6b java.lang.Exception -> L7d
            if (r1 == 0) goto L60
            int r2 = r1.getCount()     // Catch: java.lang.Throwable -> L68 java.lang.OutOfMemoryError -> L6c java.lang.Exception -> L7e
            if (r2 <= 0) goto L60
            r1.moveToNext()     // Catch: java.lang.Throwable -> L68 java.lang.OutOfMemoryError -> L6c java.lang.Exception -> L7e
            com.anythink.core.common.h.be r2 = new com.anythink.core.common.h.be     // Catch: java.lang.Throwable -> L68 java.lang.OutOfMemoryError -> L6c java.lang.Exception -> L7e
            r2.<init>(r10, r11)     // Catch: java.lang.Throwable -> L68 java.lang.OutOfMemoryError -> L6c java.lang.Exception -> L7e
            java.lang.String r10 = "click_count"
            int r10 = r1.getColumnIndex(r10)     // Catch: java.lang.Throwable -> L68 java.lang.OutOfMemoryError -> L6c java.lang.Exception -> L7e
            int r10 = r1.getInt(r10)     // Catch: java.lang.Throwable -> L68 java.lang.OutOfMemoryError -> L6c java.lang.Exception -> L7e
            r2.b(r10)     // Catch: java.lang.Throwable -> L68 java.lang.OutOfMemoryError -> L6c java.lang.Exception -> L7e
            java.lang.String r10 = "show_count"
            int r10 = r1.getColumnIndex(r10)     // Catch: java.lang.Throwable -> L68 java.lang.OutOfMemoryError -> L6c java.lang.Exception -> L7e
            int r10 = r1.getInt(r10)     // Catch: java.lang.Throwable -> L68 java.lang.OutOfMemoryError -> L6c java.lang.Exception -> L7e
            r2.a(r10)     // Catch: java.lang.Throwable -> L68 java.lang.OutOfMemoryError -> L6c java.lang.Exception -> L7e
            java.lang.String r10 = "expire_time"
            int r10 = r1.getColumnIndex(r10)     // Catch: java.lang.Throwable -> L68 java.lang.OutOfMemoryError -> L6c java.lang.Exception -> L7e
            long r10 = r1.getLong(r10)     // Catch: java.lang.Throwable -> L68 java.lang.OutOfMemoryError -> L6c java.lang.Exception -> L7e
            r2.a(r10)     // Catch: java.lang.Throwable -> L68 java.lang.OutOfMemoryError -> L6c java.lang.Exception -> L7e
            r1.close()     // Catch: java.lang.Throwable -> L68 java.lang.OutOfMemoryError -> L6c java.lang.Exception -> L7e
            if (r1 == 0) goto L5e
            r1.close()     // Catch: java.lang.Throwable -> L81
        L5e:
            monitor-exit(r9)
            return r2
        L60:
            if (r1 == 0) goto L65
            r1.close()     // Catch: java.lang.Throwable -> L81
        L65:
            monitor-exit(r9)
            return r0
        L67:
            r1 = r0
        L68:
            if (r1 == 0) goto L85
            goto L80
        L6b:
            r1 = r0
        L6c:
            java.lang.System.gc()     // Catch: java.lang.Throwable -> L75
            if (r1 == 0) goto L85
        L71:
            r1.close()     // Catch: java.lang.Throwable -> L81
            goto L85
        L75:
            r0 = move-exception
            r10 = r0
            if (r1 == 0) goto L7c
            r1.close()     // Catch: java.lang.Throwable -> L81
        L7c:
            throw r10     // Catch: java.lang.Throwable -> L81
        L7d:
            r1 = r0
        L7e:
            if (r1 == 0) goto L85
        L80:
            goto L71
        L81:
            r0 = move-exception
            r10 = r0
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L81
            throw r10
        L85:
            monitor-exit(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.e.n.a(int, java.lang.String):com.anythink.core.common.h.be");
    }

    private boolean b(int i, String str) {
        Cursor query = c().query(a.f3781a, null, "type = ? and unit_id = ?", new String[]{String.valueOf(i), str}, null, null, null);
        if (query != null && query.getCount() > 0) {
            query.close();
            return true;
        }
        if (query != null) {
            query.close();
        }
        return false;
    }

    private boolean c(String str, int i, String str2) {
        Cursor query = c().query(a.f3781a, null, "adsource_id = ? and type = ? and unit_id = ?", new String[]{str, String.valueOf(i), str2}, null, null, null);
        if (query != null && query.getCount() > 0) {
            query.close();
            return true;
        }
        if (query != null) {
            query.close();
        }
        return false;
    }

    public final synchronized void a(String str, int i, String str2) {
        Cursor query = c().query(a.f3781a, null, "adsource_id = ? and type = ? and unit_id = ?", new String[]{str, String.valueOf(i), str2}, null, null, null);
        if (query == null || query.getCount() <= 0) {
            if (query != null) {
                query.close();
            }
            b(str, i, str2);
        } else {
            query.close();
        }
    }
}
