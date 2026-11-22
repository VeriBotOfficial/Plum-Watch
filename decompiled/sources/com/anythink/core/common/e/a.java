package com.anythink.core.common.e;

import android.content.ContentValues;
import android.database.Cursor;
import android.provider.BaseColumns;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public class a extends c<com.anythink.core.common.h.f> {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3750a = "1";
    public static final String b = "2";
    public static final String c = "3";
    public static final String d = "4";
    private static volatile a g;
    private final String f;

    /* renamed from: com.anythink.core.common.e.a$a, reason: collision with other inner class name */
    public static class C0193a implements BaseColumns {

        /* renamed from: a, reason: collision with root package name */
        public static final String f3755a = "ad_frequency";
        public static final String b = "event_type";
        public static final String c = "app";
        public static final String d = "format";
        public static final String e = "network_id";
        public static final String f = "network_format";
        public static final String g = "placement_id";
        public static final String h = "source_id";
        public static final String i = "extra";
        public static final String j = "month";
        public static final String k = "day";
        public static final String l = "hour";
        public static final String m = "time_stamp";
        public static final String n = "req_num";
        public static final String o = "rule_id";
        public static final String p = "fail_count";

        /* renamed from: q, reason: collision with root package name */
        public static final String f3756q = "next_req_timestamp";
        public static final String r = "CREATE TABLE IF NOT EXISTS ad_frequency(_id INTEGER PRIMARY KEY AUTOINCREMENT ,event_type TEXT ,app TEXT ,network_id TEXT ,format TEXT ,network_format TEXT ,placement_id TEXT ,source_id TEXT ,extra TEXT ,month INTEGER ,day INTEGER ,hour INTEGER , req_num INTEGER , time_stamp INTEGER)";
        public static final String s = "ALTER TABLE ad_frequency ADD COLUMN rule_id INTEGER;";
        public static final String t = "ALTER TABLE ad_frequency ADD COLUMN fail_count INTEGER;";
        public static final String u = "ALTER TABLE ad_frequency ADD COLUMN next_req_timestamp INTEGER;";
    }

    private a(d dVar) {
        super(dVar);
        this.f = "AdFrequencyDao";
    }

    public static a a(d dVar) {
        if (g == null) {
            synchronized (a.class) {
                if (g == null) {
                    g = new a(dVar);
                }
            }
        }
        return g;
    }

    public final void a(final com.anythink.core.common.h.f fVar) {
        try {
            com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.core.common.e.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    a.this.b(fVar);
                }
            }, 2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void b(com.anythink.core.common.h.f fVar) {
        synchronized (this) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put(C0193a.b, "2");
                contentValues.put("app", fVar.j());
                contentValues.put("placement_id", fVar.d());
                contentValues.put("network_id", fVar.b());
                contentValues.put("format", fVar.c());
                contentValues.put(C0193a.f, fVar.k());
                contentValues.put(C0193a.h, fVar.e());
                contentValues.put(C0193a.j, Integer.valueOf(fVar.f()));
                contentValues.put(C0193a.k, Integer.valueOf(fVar.g()));
                contentValues.put(C0193a.l, Integer.valueOf(fVar.h()));
                contentValues.put(C0193a.m, Long.valueOf(fVar.i()));
                d().insert(C0193a.f3755a, null, contentValues);
            } finally {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
    
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (r12 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003c, code lost:
    
        if (r12 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.anythink.core.common.h.f> a(java.lang.String r12, java.lang.String r13) {
        /*
            r11 = this;
            monitor-enter(r11)
            java.util.Date r0 = new java.util.Date     // Catch: java.lang.Throwable -> L58
            r0.<init>()     // Catch: java.lang.Throwable -> L58
            r1 = 0
            java.lang.String r2 = "event_type = ? and %s = ? and month = ? and day = ?"
            java.lang.Object[] r13 = new java.lang.Object[]{r13}     // Catch: java.lang.Throwable -> L45
            java.lang.String r6 = java.lang.String.format(r2, r13)     // Catch: java.lang.Throwable -> L45
            android.database.sqlite.SQLiteDatabase r3 = r11.c()     // Catch: java.lang.Throwable -> L45
            java.lang.String r4 = "ad_frequency"
            r13 = 4
            java.lang.String[] r7 = new java.lang.String[r13]     // Catch: java.lang.Throwable -> L45
            java.lang.String r13 = "2"
            r2 = 0
            r7[r2] = r13     // Catch: java.lang.Throwable -> L45
            r13 = 1
            r7[r13] = r12     // Catch: java.lang.Throwable -> L45
            java.lang.String r12 = com.anythink.core.a.b.a(r0)     // Catch: java.lang.Throwable -> L45
            r13 = 2
            r7[r13] = r12     // Catch: java.lang.Throwable -> L45
            java.lang.String r12 = com.anythink.core.a.b.b(r0)     // Catch: java.lang.Throwable -> L45
            r13 = 3
            r7[r13] = r12     // Catch: java.lang.Throwable -> L45
            r9 = 0
            r10 = 0
            r5 = 0
            r8 = 0
            android.database.Cursor r12 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L45
            java.util.List r1 = a(r12)     // Catch: java.lang.Throwable -> L42
            if (r12 == 0) goto L4e
        L3e:
            r12.close()     // Catch: java.lang.Throwable -> L58
            goto L4e
        L42:
            r0 = move-exception
            r13 = r0
            goto L48
        L45:
            r0 = move-exception
            r13 = r0
            r12 = r1
        L48:
            r13.printStackTrace()     // Catch: java.lang.Throwable -> L50
            if (r12 == 0) goto L4e
            goto L3e
        L4e:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L58
            return r1
        L50:
            r0 = move-exception
            r13 = r0
            if (r12 == 0) goto L57
            r12.close()     // Catch: java.lang.Throwable -> L58
        L57:
            throw r13     // Catch: java.lang.Throwable -> L58
        L58:
            r0 = move-exception
            r12 = r0
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.e.a.a(java.lang.String, java.lang.String):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0045, code lost:
    
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (r12 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0043, code lost:
    
        if (r12 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.anythink.core.common.h.f> b(java.lang.String r12, java.lang.String r13) {
        /*
            r11 = this;
            monitor-enter(r11)
            java.util.Date r0 = new java.util.Date     // Catch: java.lang.Throwable -> L5f
            r0.<init>()     // Catch: java.lang.Throwable -> L5f
            r1 = 0
            java.lang.String r2 = "event_type = ? and %s = ? and month = ? and day = ? and hour = ?"
            java.lang.Object[] r13 = new java.lang.Object[]{r13}     // Catch: java.lang.Throwable -> L4c
            java.lang.String r6 = java.lang.String.format(r2, r13)     // Catch: java.lang.Throwable -> L4c
            android.database.sqlite.SQLiteDatabase r3 = r11.c()     // Catch: java.lang.Throwable -> L4c
            java.lang.String r4 = "ad_frequency"
            r13 = 5
            java.lang.String[] r7 = new java.lang.String[r13]     // Catch: java.lang.Throwable -> L4c
            java.lang.String r13 = "2"
            r2 = 0
            r7[r2] = r13     // Catch: java.lang.Throwable -> L4c
            r13 = 1
            r7[r13] = r12     // Catch: java.lang.Throwable -> L4c
            java.lang.String r12 = com.anythink.core.a.b.a(r0)     // Catch: java.lang.Throwable -> L4c
            r13 = 2
            r7[r13] = r12     // Catch: java.lang.Throwable -> L4c
            java.lang.String r12 = com.anythink.core.a.b.b(r0)     // Catch: java.lang.Throwable -> L4c
            r13 = 3
            r7[r13] = r12     // Catch: java.lang.Throwable -> L4c
            java.lang.String r12 = com.anythink.core.a.b.c(r0)     // Catch: java.lang.Throwable -> L4c
            r13 = 4
            r7[r13] = r12     // Catch: java.lang.Throwable -> L4c
            r9 = 0
            r10 = 0
            r5 = 0
            r8 = 0
            android.database.Cursor r12 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L4c
            java.util.List r1 = a(r12)     // Catch: java.lang.Throwable -> L49
            if (r12 == 0) goto L55
        L45:
            r12.close()     // Catch: java.lang.Throwable -> L5f
            goto L55
        L49:
            r0 = move-exception
            r13 = r0
            goto L4f
        L4c:
            r0 = move-exception
            r13 = r0
            r12 = r1
        L4f:
            r13.printStackTrace()     // Catch: java.lang.Throwable -> L57
            if (r12 == 0) goto L55
            goto L45
        L55:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L5f
            return r1
        L57:
            r0 = move-exception
            r13 = r0
            if (r12 == 0) goto L5e
            r12.close()     // Catch: java.lang.Throwable -> L5f
        L5e:
            throw r13     // Catch: java.lang.Throwable -> L5f
        L5f:
            r0 = move-exception
            r12 = r0
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.e.a.b(java.lang.String, java.lang.String):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if (r4 == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.anythink.core.common.h.f c(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L41
            java.lang.String r2 = "select * from ad_frequency where event_type = '2' and %s = '"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L41
            java.lang.StringBuilder r4 = r1.append(r4)     // Catch: java.lang.Throwable -> L41
            java.lang.String r1 = "' order by time_stamp DESC limit 1"
            java.lang.StringBuilder r4 = r4.append(r1)     // Catch: java.lang.Throwable -> L41
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L41
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.Throwable -> L41
            java.lang.String r4 = java.lang.String.format(r4, r5)     // Catch: java.lang.Throwable -> L41
            android.database.sqlite.SQLiteDatabase r5 = r3.c()     // Catch: java.lang.Throwable -> L41
            android.database.Cursor r4 = r5.rawQuery(r4, r0)     // Catch: java.lang.Throwable -> L41
            java.util.List r5 = a(r4)     // Catch: java.lang.Throwable -> L3f
            boolean r1 = r5.isEmpty()     // Catch: java.lang.Throwable -> L3f
            if (r1 != 0) goto L39
            r1 = 0
            java.lang.Object r5 = r5.get(r1)     // Catch: java.lang.Throwable -> L3f
            com.anythink.core.common.h.f r5 = (com.anythink.core.common.h.f) r5     // Catch: java.lang.Throwable -> L3f
            r0 = r5
        L39:
            if (r4 == 0) goto L49
        L3b:
            r4.close()     // Catch: java.lang.Throwable -> L4b
            goto L49
        L3f:
            r5 = move-exception
            goto L43
        L41:
            r5 = move-exception
            r4 = r0
        L43:
            r5.printStackTrace()     // Catch: java.lang.Throwable -> L4d
            if (r4 == 0) goto L49
            goto L3b
        L49:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4b
            return r0
        L4b:
            r4 = move-exception
            goto L54
        L4d:
            r5 = move-exception
            if (r4 == 0) goto L53
            r4.close()     // Catch: java.lang.Throwable -> L4b
        L53:
            throw r5     // Catch: java.lang.Throwable -> L4b
        L54:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.e.a.c(java.lang.String, java.lang.String):com.anythink.core.common.h.f");
    }

    private static List<com.anythink.core.common.h.f> a(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        if (cursor != null) {
            while (cursor.moveToNext()) {
                try {
                    arrayList.add(new com.anythink.core.common.h.f(cursor.getString(cursor.getColumnIndex(C0193a.b)), cursor.getString(cursor.getColumnIndex("app")), cursor.getString(cursor.getColumnIndex("network_id")), cursor.getString(cursor.getColumnIndex("format")), cursor.getString(cursor.getColumnIndex(C0193a.f)), cursor.getString(cursor.getColumnIndex("placement_id")), cursor.getString(cursor.getColumnIndex(C0193a.h)), cursor.getInt(cursor.getColumnIndex(C0193a.j)), cursor.getInt(cursor.getColumnIndex(C0193a.k)), cursor.getInt(cursor.getColumnIndex(C0193a.l)), cursor.getLong(cursor.getColumnIndex(C0193a.m))));
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
        return arrayList;
    }

    public final void a(String str, String str2, int i, long j) {
        synchronized (this) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put(C0193a.n, Integer.valueOf(i));
                contentValues.put(C0193a.m, Long.valueOf(j));
                d().update(C0193a.f3755a, contentValues, String.format("event_type = ? and %s = ?", str2), new String[]{"1", str});
            } finally {
            }
        }
    }

    public final void b(final String str, final String str2, final int i, final long j) {
        try {
            com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.core.common.e.a.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (a.this.d(str, str2) != null) {
                        a.this.a(str, str2, i, j);
                    } else {
                        a.this.c(str, str2, i, j);
                    }
                }
            }, 2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void c(String str, String str2, int i, long j) {
        char c2;
        synchronized (this) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put(C0193a.b, "1");
                contentValues.put(C0193a.n, Integer.valueOf(i));
                contentValues.put(C0193a.m, Long.valueOf(j));
                switch (str2.hashCode()) {
                    case -1928631512:
                        if (str2.equals(C0193a.f)) {
                            c2 = 3;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1698410561:
                        if (str2.equals(C0193a.h)) {
                            c2 = 5;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1268779017:
                        if (str2.equals("format")) {
                            c2 = 1;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -478232372:
                        if (str2.equals("network_id")) {
                            c2 = 2;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 96801:
                        if (str2.equals("app")) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1224358069:
                        if (str2.equals("placement_id")) {
                            c2 = 4;
                            break;
                        }
                        c2 = 65535;
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                if (c2 == 0) {
                    contentValues.put("app", str);
                } else if (c2 == 1) {
                    contentValues.put("format", str);
                } else if (c2 == 2) {
                    contentValues.put("network_id", str);
                } else if (c2 == 3) {
                    contentValues.put(C0193a.f, str);
                } else if (c2 == 4) {
                    contentValues.put("placement_id", str);
                } else if (c2 == 5) {
                    contentValues.put(C0193a.h, str);
                }
                d().insert(C0193a.f3755a, null, contentValues);
            } finally {
            }
        }
    }

    public final com.anythink.core.common.h.f d(String str, String str2) {
        Throwable th;
        com.anythink.core.common.h.f fVar;
        com.anythink.core.common.h.f fVar2;
        synchronized (this) {
            Cursor cursor = null;
            fVar2 = null;
            try {
                try {
                    Cursor query = c().query(C0193a.f3755a, null, String.format("event_type = ? and %s = ?", str2), new String[]{"1", str}, null, null, null, "1");
                    while (query.moveToNext()) {
                        try {
                            String str3 = str2;
                            fVar2 = new com.anythink.core.common.h.f(query.getString(query.getColumnIndex(C0193a.b)), query.getString(query.getColumnIndex(str2)), str3, query.getLong(query.getColumnIndex(C0193a.m)), query.getInt(query.getColumnIndex(C0193a.n)));
                            str2 = str3;
                        } catch (Throwable th2) {
                            th = th2;
                            com.anythink.core.common.h.f fVar3 = fVar2;
                            cursor = query;
                            fVar = fVar3;
                            try {
                                th.printStackTrace();
                                if (cursor != null) {
                                    cursor.close();
                                }
                                fVar2 = fVar;
                                return fVar2;
                            } finally {
                            }
                        }
                    }
                    if (query != null) {
                        query.close();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
                fVar = null;
            }
        }
        return fVar2;
    }

    public final void e(String str, String str2) {
        synchronized (this) {
            try {
            } finally {
            }
            if (d() == null) {
                return;
            }
            d().delete(C0193a.f3755a, "event_type = ? and month != ? or day != ?", new String[]{"2", str, str2});
        }
    }

    public final void a(final com.anythink.core.common.h.f fVar, final boolean z) {
        if (fVar == null) {
            return;
        }
        try {
            com.anythink.core.common.v.b.b.a().c(new Runnable() { // from class: com.anythink.core.common.e.a.3
                @Override // java.lang.Runnable
                public final void run() {
                    if (z) {
                        a.a(a.this, fVar);
                    } else {
                        a.b(a.this, fVar);
                    }
                }
            }, 13);
        } catch (Throwable unused) {
        }
    }

    private void c(com.anythink.core.common.h.f fVar) {
        synchronized (this) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put(C0193a.b, fVar.a());
                contentValues.put(C0193a.o, Integer.valueOf(fVar.l()));
                contentValues.put(C0193a.h, fVar.e());
                contentValues.put(C0193a.m, Long.valueOf(fVar.i()));
                contentValues.put(C0193a.f3756q, Long.valueOf(fVar.n()));
                contentValues.put(C0193a.p, Integer.valueOf(fVar.m()));
                contentValues.put(C0193a.n, Integer.valueOf(fVar.f3912a));
                long insert = d().insert(C0193a.f3755a, null, contentValues);
                if (insert < 0) {
                    new Object[]{fVar.e(), Long.valueOf(insert)};
                }
            } catch (Throwable unused) {
                new Object[]{fVar.e()};
            }
        }
    }

    private void d(com.anythink.core.common.h.f fVar) {
        synchronized (this) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put(C0193a.m, Long.valueOf(fVar.i()));
                contentValues.put(C0193a.f3756q, Long.valueOf(fVar.n()));
                contentValues.put(C0193a.p, Integer.valueOf(fVar.m()));
                contentValues.put(C0193a.n, Integer.valueOf(fVar.f3912a));
                int update = d().update(C0193a.f3755a, contentValues, String.format("%s = ? and %s = ? and %s = ?", C0193a.b, C0193a.h, C0193a.o), new String[]{fVar.a(), fVar.e(), String.valueOf(fVar.l())});
                if (update < 0) {
                    new Object[]{fVar.e(), Integer.valueOf(update)};
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a2, code lost:
    
        if (r12 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a4, code lost:
    
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a9, code lost:
    
        if (r12 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.anythink.core.common.h.f> a(java.util.List<android.util.Pair<java.lang.String, java.lang.String>> r12, int r13) {
        /*
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            monitor-enter(r11)
            android.util.Pair r12 = c(r12)     // Catch: java.lang.Throwable -> La8
            java.lang.String r8 = "time_stamp DESC"
            if (r13 <= 0) goto L2a
            android.database.sqlite.SQLiteDatabase r1 = r11.c()     // Catch: java.lang.Throwable -> La8
            java.lang.String r2 = "ad_frequency"
            java.lang.Object r3 = r12.first     // Catch: java.lang.Throwable -> La8
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> La8
            java.lang.Object r12 = r12.second     // Catch: java.lang.Throwable -> La8
            r5 = r12
            java.lang.String[] r5 = (java.lang.String[]) r5     // Catch: java.lang.Throwable -> La8
            java.lang.String r9 = java.lang.String.valueOf(r13)     // Catch: java.lang.Throwable -> La8
            r3 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r12 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> La8
            goto L42
        L2a:
            android.database.sqlite.SQLiteDatabase r1 = r11.c()     // Catch: java.lang.Throwable -> La8
            java.lang.String r2 = "ad_frequency"
            java.lang.Object r13 = r12.first     // Catch: java.lang.Throwable -> La8
            r4 = r13
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> La8
            java.lang.Object r12 = r12.second     // Catch: java.lang.Throwable -> La8
            r5 = r12
            java.lang.String[] r5 = (java.lang.String[]) r5     // Catch: java.lang.Throwable -> La8
            r7 = 0
            r9 = 0
            r3 = 0
            r6 = 0
            android.database.Cursor r12 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> La8
        L42:
            boolean r13 = r12.moveToNext()     // Catch: java.lang.Throwable -> La9
            if (r13 == 0) goto La2
            java.lang.String r13 = "event_type"
            int r13 = r12.getColumnIndex(r13)     // Catch: java.lang.Throwable -> La9
            java.lang.String r2 = r12.getString(r13)     // Catch: java.lang.Throwable -> La9
            java.lang.String r13 = "time_stamp"
            int r13 = r12.getColumnIndex(r13)     // Catch: java.lang.Throwable -> La9
            long r5 = r12.getLong(r13)     // Catch: java.lang.Throwable -> La9
            java.lang.String r13 = "req_num"
            int r13 = r12.getColumnIndex(r13)     // Catch: java.lang.Throwable -> La9
            int r7 = r12.getInt(r13)     // Catch: java.lang.Throwable -> La9
            java.lang.String r13 = "source_id"
            int r13 = r12.getColumnIndex(r13)     // Catch: java.lang.Throwable -> La9
            java.lang.String r3 = r12.getString(r13)     // Catch: java.lang.Throwable -> La9
            java.lang.String r13 = "rule_id"
            int r13 = r12.getColumnIndex(r13)     // Catch: java.lang.Throwable -> La9
            int r13 = r12.getInt(r13)     // Catch: java.lang.Throwable -> La9
            java.lang.String r1 = "fail_count"
            int r1 = r12.getColumnIndex(r1)     // Catch: java.lang.Throwable -> La9
            int r8 = r12.getInt(r1)     // Catch: java.lang.Throwable -> La9
            java.lang.String r1 = "next_req_timestamp"
            int r1 = r12.getColumnIndex(r1)     // Catch: java.lang.Throwable -> La9
            long r9 = r12.getLong(r1)     // Catch: java.lang.Throwable -> La9
            com.anythink.core.common.h.f r1 = new com.anythink.core.common.h.f     // Catch: java.lang.Throwable -> La9
            java.lang.String r4 = "source_id"
            r1.<init>(r2, r3, r4, r5, r7)     // Catch: java.lang.Throwable -> La9
            r1.a(r13)     // Catch: java.lang.Throwable -> La9
            r1.b(r8)     // Catch: java.lang.Throwable -> La9
            r1.b(r9)     // Catch: java.lang.Throwable -> La9
            r0.add(r1)     // Catch: java.lang.Throwable -> La9
            goto L42
        La2:
            if (r12 == 0) goto Lac
        La4:
            r12.close()     // Catch: java.lang.Throwable -> Lac
            goto Lac
        La8:
            r12 = 0
        La9:
            if (r12 == 0) goto Lac
            goto La4
        Lac:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> Lae
            return r0
        Lae:
            r0 = move-exception
            r12 = r0
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.e.a.a(java.util.List, int):java.util.List");
    }

    public final void a(final List<Pair<String, String>> list) {
        com.anythink.core.common.v.b.b.a().c(new Runnable() { // from class: com.anythink.core.common.e.a.4
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (this) {
                    try {
                        Pair c2 = a.c((List<Pair<String, String>>) list);
                        a.this.d().delete(C0193a.f3755a, (String) c2.first, (String[]) c2.second);
                    } catch (Throwable unused) {
                    }
                }
            }
        }, 13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Pair<String, String[]> c(List<Pair<String, String>> list) {
        String[] strArr;
        StringBuilder sb = new StringBuilder();
        if (list == null || list.isEmpty()) {
            strArr = null;
        } else {
            strArr = new String[list.size()];
            for (int i = 0; i < list.size(); i++) {
                Pair<String, String> pair = list.get(i);
                sb.append((String) pair.first);
                if (i != list.size() - 1) {
                    sb.append(" and ");
                }
                strArr[i] = (String) pair.second;
            }
        }
        return new Pair<>(sb.toString(), strArr);
    }

    static /* synthetic */ void a(a aVar, com.anythink.core.common.h.f fVar) {
        synchronized (aVar) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put(C0193a.m, Long.valueOf(fVar.i()));
                contentValues.put(C0193a.f3756q, Long.valueOf(fVar.n()));
                contentValues.put(C0193a.p, Integer.valueOf(fVar.m()));
                contentValues.put(C0193a.n, Integer.valueOf(fVar.f3912a));
                int update = aVar.d().update(C0193a.f3755a, contentValues, String.format("%s = ? and %s = ? and %s = ?", C0193a.b, C0193a.h, C0193a.o), new String[]{fVar.a(), fVar.e(), String.valueOf(fVar.l())});
                if (update < 0) {
                    new Object[]{fVar.e(), Integer.valueOf(update)};
                }
            } catch (Throwable unused) {
            }
        }
    }

    static /* synthetic */ void b(a aVar, com.anythink.core.common.h.f fVar) {
        synchronized (aVar) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put(C0193a.b, fVar.a());
                contentValues.put(C0193a.o, Integer.valueOf(fVar.l()));
                contentValues.put(C0193a.h, fVar.e());
                contentValues.put(C0193a.m, Long.valueOf(fVar.i()));
                contentValues.put(C0193a.f3756q, Long.valueOf(fVar.n()));
                contentValues.put(C0193a.p, Integer.valueOf(fVar.m()));
                contentValues.put(C0193a.n, Integer.valueOf(fVar.f3912a));
                long insert = aVar.d().insert(C0193a.f3755a, null, contentValues);
                if (insert < 0) {
                    new Object[]{fVar.e(), Long.valueOf(insert)};
                }
            } catch (Throwable unused) {
                new Object[]{fVar.e()};
            }
        }
    }
}
