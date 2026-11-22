package com.anythink.core.common.e;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.gov.nist.core.Separators;
import android.text.TextUtils;
import com.anythink.core.common.h.ag;
import java.util.List;

/* loaded from: classes12.dex */
public class g extends c<ag> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f3764a = "g";
    private static volatile g b;

    public static class a {
        public static final String A = "ad_source_id";
        public static final String B = "network_firm_id";
        public static final String C = "progress";
        public static final String D = "file_size";
        public static final String E = "apk_redownload";
        public static final String F = "apk_allow_install_in_bg";
        public static final String G = "offer_cache_time";
        public static final String H = "app_name";
        public static final String I = "downloading_scene";
        public static final String J = "recover_download_scene";
        public static final String K = "download_failed_scene_list";
        public static final String L = "dsp_id";
        public static final String M = "action_offer_download_tk";
        public static final String N = "app_desc";
        public static final String O = "CREATE TABLE IF NOT EXISTS download_task(unique_id TEXT ,click_id TEXT ,request_id TEXT ,offer_id TEXT ,pkg_name TEXT ,url TEXT ,title TEXT ,deeplink_click_action TEXT ,icon_url TEXT ,deeplink_url TEXT ,file_path TEXT ,placement_id TEXT ,ad_source_id TEXT ,network_firm_id TEXT ,app_name TEXT ,download_failed_scene_list TEXT ,dsp_id TEXT ,action_offer_download_tk TEXT ,app_desc TEXT ,apk_verify INTEGER ,enable_use_webview_ua INTEGER ,download_type INTEGER ,notification_type INTEGER ,int_open_switch INTEGER ,int_open_time INTEGER ,offer_source_type INTEGER ,part_count INTEGER ,enable_part_download INTEGER ,download_start_timestamp INTEGER ,download_end_timestamp INTEGER ,status INTEGER ,is_upload_installed_agentevent INTEGER ,progress INTEGER ,file_size INTEGER ,apk_redownload INTEGER ,apk_allow_install_in_bg INTEGER ,offer_cache_time INTEGER ,downloading_scene INTEGER ,recover_download_scene INTEGER)";

        /* renamed from: a, reason: collision with root package name */
        public static final String f3765a = "download_task";
        public static final String b = "unique_id";
        public static final String c = "click_id";
        public static final String d = "request_id";
        public static final String e = "offer_id";
        public static final String f = "url";
        public static final String g = "pkg_name";
        public static final String h = "title";
        public static final String i = "deeplink_click_action";
        public static final String j = "apk_verify";
        public static final String k = "enable_use_webview_ua";
        public static final String l = "download_type";
        public static final String m = "notification_type";
        public static final String n = "int_open_switch";
        public static final String o = "int_open_time";
        public static final String p = "icon_url";

        /* renamed from: q, reason: collision with root package name */
        public static final String f3766q = "deeplink_url";
        public static final String r = "offer_source_type";
        public static final String s = "file_path";
        public static final String t = "part_count";
        public static final String u = "enable_part_download";
        public static final String v = "download_start_timestamp";
        public static final String w = "download_end_timestamp";
        public static final String x = "status";
        public static final String y = "is_upload_installed_agentevent";
        public static final String z = "placement_id";
    }

    private g(d dVar) {
        super(dVar);
    }

    public static g a(Context context) {
        if (b == null) {
            synchronized (g.class) {
                if (b == null) {
                    b = new g(e.a(context));
                }
            }
        }
        return b;
    }

    public final synchronized void a(ag agVar) {
        try {
            SQLiteDatabase d = d();
            if (c(agVar)) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("progress", Long.valueOf(agVar.F()));
                d.update(a.f3765a, contentValues, "unique_id = ?", new String[]{agVar.j()});
            }
        } catch (Throwable th) {
            new Object[]{th.getMessage()};
        }
    }

    public final synchronized void b(ag agVar) {
        if (agVar != null) {
            try {
                if (!TextUtils.isEmpty(agVar.j())) {
                    new Object[]{agVar};
                    SQLiteDatabase d = d();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("unique_id", agVar.j());
                    contentValues.put(a.c, agVar.k());
                    contentValues.put("request_id", agVar.l());
                    contentValues.put("offer_id", agVar.m());
                    contentValues.put("pkg_name", agVar.o());
                    contentValues.put("url", agVar.n());
                    contentValues.put("title", agVar.p());
                    contentValues.put(a.i, agVar.q());
                    contentValues.put("icon_url", agVar.v());
                    contentValues.put("deeplink_url", agVar.w());
                    contentValues.put("file_path", agVar.g());
                    contentValues.put(a.j, Integer.valueOf(agVar.C()));
                    contentValues.put(a.k, Integer.valueOf(agVar.y()));
                    contentValues.put(a.l, Integer.valueOf(agVar.r()));
                    contentValues.put(a.m, Integer.valueOf(agVar.s()));
                    contentValues.put(a.n, Integer.valueOf(agVar.t()));
                    contentValues.put(a.o, Integer.valueOf(agVar.u()));
                    contentValues.put(a.r, Integer.valueOf(agVar.z()));
                    contentValues.put(a.t, Integer.valueOf(agVar.h()));
                    contentValues.put(a.u, Integer.valueOf(agVar.i() ? 1 : 0));
                    contentValues.put(a.v, Long.valueOf(agVar.A()));
                    contentValues.put(a.w, Long.valueOf(agVar.B()));
                    contentValues.put("status", Integer.valueOf(agVar.D()));
                    contentValues.put(a.y, Integer.valueOf(agVar.E()));
                    contentValues.put("placement_id", agVar.d());
                    contentValues.put("ad_source_id", agVar.e());
                    contentValues.put("network_firm_id", agVar.f());
                    contentValues.put("progress", Long.valueOf(agVar.F()));
                    contentValues.put("file_size", Long.valueOf(agVar.G()));
                    contentValues.put(a.E, Integer.valueOf(agVar.H()));
                    contentValues.put(a.F, Integer.valueOf(agVar.I()));
                    contentValues.put(a.G, Long.valueOf(agVar.J()));
                    contentValues.put("app_name", agVar.K());
                    contentValues.put(a.I, Integer.valueOf(agVar.a()));
                    contentValues.put(a.J, Integer.valueOf(agVar.b()));
                    contentValues.put(a.K, agVar.c());
                    contentValues.put("dsp_id", agVar.c());
                    contentValues.put(a.M, agVar.M());
                    contentValues.put(a.N, agVar.N());
                    if (c(agVar)) {
                        d.update(a.f3765a, contentValues, "unique_id = ?", new String[]{agVar.j()});
                    } else {
                        new Object[]{Long.valueOf(d.insertOrThrow(a.f3765a, null, contentValues))};
                    }
                }
            } catch (Throwable th) {
                new Object[]{th.getMessage()};
            }
        }
    }

    private boolean c(ag agVar) {
        Cursor query = c().query(a.f3765a, new String[]{"unique_id"}, "unique_id = ?", new String[]{agVar.j()}, null, null, null);
        if (query != null && query.getCount() > 0) {
            query.close();
            return true;
        }
        if (query != null) {
            query.close();
        }
        return false;
    }

    public final synchronized ag a(String str) {
        Cursor cursor;
        ag agVar;
        try {
            agVar = new ag();
            String str2 = "download_start_timestamp > " + System.currentTimeMillis() + " - offer_cache_time AND unique_id = '" + str + Separators.QUOTE;
            new Object[]{str2};
            cursor = c().query(a.f3765a, null, str2, null, null, null, a.v);
        } catch (Throwable th) {
            th = th;
            cursor = null;
        }
        try {
            if (cursor.moveToFirst()) {
                agVar = a(cursor);
            }
            return agVar;
        } catch (Throwable th2) {
            th = th2;
            try {
                new Object[]{th.getMessage()};
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        if (r2 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.util.List<com.anythink.core.common.h.ag> a() {
        /*
            r11 = this;
            monitor-enter(r11)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L58
            r1.<init>()     // Catch: java.lang.Throwable -> L58
            r2 = 0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L44
            java.lang.String r3 = "download_start_timestamp <= "
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L44
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L44
            java.lang.StringBuilder r0 = r0.append(r3)     // Catch: java.lang.Throwable -> L44
            java.lang.String r3 = " - offer_cache_time"
            java.lang.StringBuilder r0 = r0.append(r3)     // Catch: java.lang.Throwable -> L44
            java.lang.String r6 = r0.toString()     // Catch: java.lang.Throwable -> L44
            android.database.sqlite.SQLiteDatabase r3 = r11.c()     // Catch: java.lang.Throwable -> L44
            java.lang.String r4 = "download_task"
            java.lang.String r10 = "download_start_timestamp"
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L44
        L30:
            boolean r0 = r2.moveToNext()     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L3e
            com.anythink.core.common.h.ag r0 = a(r2)     // Catch: java.lang.Throwable -> L44
            r1.add(r0)     // Catch: java.lang.Throwable -> L44
            goto L30
        L3e:
            if (r2 == 0) goto L4f
        L40:
            r2.close()     // Catch: java.lang.Throwable -> L58
            goto L4f
        L44:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L51
            new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L51
            if (r2 == 0) goto L4f
            goto L40
        L4f:
            monitor-exit(r11)
            return r1
        L51:
            r0 = move-exception
            if (r2 == 0) goto L57
            r2.close()     // Catch: java.lang.Throwable -> L58
        L57:
            throw r0     // Catch: java.lang.Throwable -> L58
        L58:
            r0 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L58
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.e.g.a():java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
    
        if (r2 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.util.List<com.anythink.core.common.h.ag> b() {
        /*
            r11 = this;
            monitor-enter(r11)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L56
            r1.<init>()     // Catch: java.lang.Throwable -> L56
            r2 = 0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L42
            java.lang.String r3 = "status = 5 AND is_upload_installed_agentevent != 1 AND download_end_timestamp >= "
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L42
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L42
            r5 = 604800000(0x240c8400, double:2.988109026E-315)
            long r3 = r3 - r5
            java.lang.StringBuilder r0 = r0.append(r3)     // Catch: java.lang.Throwable -> L42
            java.lang.String r6 = r0.toString()     // Catch: java.lang.Throwable -> L42
            android.database.sqlite.SQLiteDatabase r3 = r11.c()     // Catch: java.lang.Throwable -> L42
            java.lang.String r4 = "download_task"
            java.lang.String r10 = "download_start_timestamp"
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L42
        L2e:
            boolean r0 = r2.moveToNext()     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L3c
            com.anythink.core.common.h.ag r0 = a(r2)     // Catch: java.lang.Throwable -> L42
            r1.add(r0)     // Catch: java.lang.Throwable -> L42
            goto L2e
        L3c:
            if (r2 == 0) goto L4d
        L3e:
            r2.close()     // Catch: java.lang.Throwable -> L56
            goto L4d
        L42:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L4f
            new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L4f
            if (r2 == 0) goto L4d
            goto L3e
        L4d:
            monitor-exit(r11)
            return r1
        L4f:
            r0 = move-exception
            if (r2 == 0) goto L55
            r2.close()     // Catch: java.lang.Throwable -> L56
        L55:
            throw r0     // Catch: java.lang.Throwable -> L56
        L56:
            r0 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L56
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.e.g.b():java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008d, code lost:
    
        if (r2 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008f, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009c, code lost:
    
        if (r2 == null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.util.List<com.anythink.core.common.h.ag> a(java.util.List<java.lang.Integer> r12, int r13) {
        /*
            r11 = this;
            monitor-enter(r11)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La9
            r1.<init>()     // Catch: java.lang.Throwable -> La9
            r2 = 0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L93
            r0.<init>()     // Catch: java.lang.Throwable -> L93
            java.lang.String r3 = "status IN ("
            r0.append(r3)     // Catch: java.lang.Throwable -> L93
            r3 = 0
        L12:
            int r4 = r12.size()     // Catch: java.lang.Throwable -> L93
            if (r3 >= r4) goto L2f
            java.lang.Object r4 = r12.get(r3)     // Catch: java.lang.Throwable -> L93
            r0.append(r4)     // Catch: java.lang.Throwable -> L93
            int r4 = r12.size()     // Catch: java.lang.Throwable -> L93
            int r4 = r4 + (-1)
            if (r3 == r4) goto L2c
            java.lang.String r4 = ","
            r0.append(r4)     // Catch: java.lang.Throwable -> L93
        L2c:
            int r3 = r3 + 1
            goto L12
        L2f:
            java.lang.String r12 = ")"
            r0.append(r12)     // Catch: java.lang.Throwable -> L93
            java.lang.String r12 = " AND "
            r0.append(r12)     // Catch: java.lang.Throwable -> L93
            java.lang.String r12 = "download_start_timestamp"
            r0.append(r12)     // Catch: java.lang.Throwable -> L93
            java.lang.String r12 = " > "
            r0.append(r12)     // Catch: java.lang.Throwable -> L93
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L93
            r0.append(r3)     // Catch: java.lang.Throwable -> L93
            java.lang.String r12 = " - "
            r0.append(r12)     // Catch: java.lang.Throwable -> L93
            java.lang.String r12 = "offer_cache_time"
            r0.append(r12)     // Catch: java.lang.Throwable -> L93
            if (r13 <= 0) goto L68
            java.lang.String r12 = " AND "
            r0.append(r12)     // Catch: java.lang.Throwable -> L93
            java.lang.String r12 = "apk_redownload"
            r0.append(r12)     // Catch: java.lang.Throwable -> L93
            java.lang.String r12 = " = "
            r0.append(r12)     // Catch: java.lang.Throwable -> L93
            r0.append(r13)     // Catch: java.lang.Throwable -> L93
        L68:
            java.lang.String r6 = r0.toString()     // Catch: java.lang.Throwable -> L93
            new java.lang.Object[]{r6}     // Catch: java.lang.Throwable -> L93
            java.lang.String r10 = "download_start_timestamp"
            android.database.sqlite.SQLiteDatabase r3 = r11.c()     // Catch: java.lang.Throwable -> L93
            java.lang.String r4 = "download_task"
            r8 = 0
            r9 = 0
            r5 = 0
            r7 = 0
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L93
        L7f:
            boolean r12 = r2.moveToNext()     // Catch: java.lang.Throwable -> L93
            if (r12 == 0) goto L8d
            com.anythink.core.common.h.ag r12 = a(r2)     // Catch: java.lang.Throwable -> L93
            r1.add(r12)     // Catch: java.lang.Throwable -> L93
            goto L7f
        L8d:
            if (r2 == 0) goto L9f
        L8f:
            r2.close()     // Catch: java.lang.Throwable -> La9
            goto L9f
        L93:
            r0 = move-exception
            r12 = r0
            java.lang.String r12 = r12.getMessage()     // Catch: java.lang.Throwable -> La1
            new java.lang.Object[]{r12}     // Catch: java.lang.Throwable -> La1
            if (r2 == 0) goto L9f
            goto L8f
        L9f:
            monitor-exit(r11)
            return r1
        La1:
            r0 = move-exception
            r12 = r0
            if (r2 == 0) goto La8
            r2.close()     // Catch: java.lang.Throwable -> La9
        La8:
            throw r12     // Catch: java.lang.Throwable -> La9
        La9:
            r0 = move-exception
            r12 = r0
            monitor-exit(r11)     // Catch: java.lang.Throwable -> La9
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.e.g.a(java.util.List, int):java.util.List");
    }

    private synchronized ag b(List<Integer> list, int i) {
        Throwable th;
        Cursor cursor;
        Cursor query;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("status IN (");
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(list.get(i2));
                if (i2 != list.size() - 1) {
                    sb.append(",");
                }
            }
            sb.append(Separators.RPAREN);
            sb.append(" AND ");
            sb.append(a.v);
            sb.append(" > ");
            sb.append(System.currentTimeMillis());
            sb.append(" - ");
            sb.append(a.G);
            String sb2 = sb.toString();
            new Object[]{sb2};
            query = c().query(a.f3765a, null, sb2, null, null, null, a.v, String.valueOf(i));
            try {
            } catch (Throwable th2) {
                cursor = query;
                th = th2;
                try {
                    new Object[]{th.getMessage()};
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                } finally {
                }
            }
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
        if (!query.moveToFirst()) {
            if (query != null) {
                query.close();
            }
            return null;
        }
        ag a2 = a(query);
        if (query != null) {
            query.close();
        }
        return a2;
    }

    public final synchronized void e() {
        try {
            new Object[]{Integer.valueOf(d().delete(a.f3765a, "download_start_timestamp <= " + System.currentTimeMillis() + " - offer_cache_time", null))};
        } catch (Throwable th) {
            new Object[]{th.getMessage()};
        }
    }

    public final synchronized void b(String str) {
        try {
            new Object[]{Integer.valueOf(d().delete(a.f3765a, "unique_id = ?", new String[]{str})), str};
        } catch (Throwable th) {
            new Object[]{th.getMessage()};
        }
    }

    private static ag a(Cursor cursor) {
        ag agVar = new ag();
        try {
            agVar.f(cursor.getString(a(cursor, "unique_id")));
            agVar.g(cursor.getString(a(cursor, a.c)));
            agVar.h(cursor.getString(a(cursor, "request_id")));
            agVar.i(cursor.getString(a(cursor, "offer_id")));
            agVar.j(cursor.getString(a(cursor, "url")));
            agVar.k(cursor.getString(a(cursor, "pkg_name")));
            agVar.l(cursor.getString(a(cursor, "title")));
            agVar.m(cursor.getString(a(cursor, a.i)));
            agVar.n(cursor.getString(a(cursor, "icon_url")));
            agVar.o(cursor.getString(a(cursor, "deeplink_url")));
            agVar.e(cursor.getString(a(cursor, "file_path")));
            agVar.b(cursor.getString(a(cursor, "placement_id")));
            agVar.c(cursor.getString(a(cursor, "ad_source_id")));
            agVar.d(cursor.getString(a(cursor, "network_firm_id")));
            agVar.p(cursor.getString(a(cursor, "app_name")));
            agVar.a(cursor.getString(a(cursor, a.K)));
            agVar.q(cursor.getString(a(cursor, "dsp_id")));
            agVar.r(cursor.getString(a(cursor, a.M)));
            agVar.s(cursor.getString(a(cursor, a.N)));
            agVar.j(cursor.getInt(a(cursor, a.j)));
            agVar.h(cursor.getInt(a(cursor, a.k)));
            agVar.d(cursor.getInt(a(cursor, a.l)));
            agVar.e(cursor.getInt(a(cursor, a.m)));
            agVar.f(cursor.getInt(a(cursor, a.n)));
            agVar.g(cursor.getInt(a(cursor, a.o)));
            agVar.i(cursor.getInt(a(cursor, a.r)));
            agVar.c(cursor.getInt(a(cursor, a.t)));
            boolean z = true;
            if (cursor.getInt(a(cursor, a.u)) != 1) {
                z = false;
            }
            agVar.a(z);
            agVar.a(cursor.getLong(a(cursor, a.v)));
            agVar.b(cursor.getLong(a(cursor, a.w)));
            agVar.k(cursor.getInt(a(cursor, "status")));
            agVar.l(cursor.getInt(a(cursor, a.y)));
            agVar.c(cursor.getLong(a(cursor, "progress")));
            agVar.d(cursor.getLong(a(cursor, "file_size")));
            agVar.m(cursor.getInt(a(cursor, a.E)));
            agVar.n(cursor.getInt(a(cursor, a.F)));
            agVar.e(cursor.getLong(a(cursor, a.G)));
            agVar.a(cursor.getInt(a(cursor, a.I)));
            agVar.b(cursor.getInt(a(cursor, a.J)));
            return agVar;
        } catch (Throwable th) {
            new Object[]{th.getMessage()};
            return agVar;
        }
    }

    private static int a(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        throw new IllegalArgumentException("columnIndex must >= 0.");
    }
}
