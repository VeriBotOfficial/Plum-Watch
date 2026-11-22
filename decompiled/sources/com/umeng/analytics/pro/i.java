package com.umeng.analytics.pro;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.umeng.analytics.pro.e;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UMStoreManager.java */
/* loaded from: classes2.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public static final int f13850a = 2049;
    public static final int b = 2050;
    private static final int c = 1000;
    private static Context d = null;
    private static String e = null;
    private static final String f = "umeng+";
    private static final String g = "ek__id";
    private static final String h = "ek_key";
    private List<String> i;
    private List<Integer> j;
    private String k;
    private List<String> l;

    /* compiled from: UMStoreManager.java */
    public enum a {
        AUTOPAGE,
        PAGE,
        BEGIN,
        END,
        NEWSESSION,
        INSTANTSESSIONBEGIN
    }

    /* compiled from: UMStoreManager.java */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final i f13852a = new i();

        private b() {
        }
    }

    private i() {
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = null;
        this.l = new ArrayList();
    }

    public static i a(Context context) {
        i iVar = b.f13852a;
        if (d == null && context != null) {
            d = context.getApplicationContext();
            iVar.k();
        }
        return iVar;
    }

    private void k() {
        synchronized (this) {
            l();
            this.i.clear();
            this.l.clear();
            this.j.clear();
        }
    }

    private Cursor a(String str, SQLiteDatabase sQLiteDatabase, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        if (sQLiteDatabase == null) {
            return null;
        }
        try {
            if (sQLiteDatabase.isOpen()) {
                return sQLiteDatabase.query(str, strArr, str2, strArr2, str3, str4, str5, str6);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public void a() {
        this.i.clear();
    }

    public void b() {
        this.l.clear();
    }

    public boolean c() {
        return this.l.isEmpty();
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00af, code lost:
    
        if (r2 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009d, code lost:
    
        r2.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009b, code lost:
    
        if (r2 == null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(org.json.JSONArray r11) {
        /*
            r10 = this;
            java.lang.String r0 = "__t"
            java.lang.String r1 = "__i"
            r2 = 0
            android.content.Context r3 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L9b android.database.sqlite.SQLiteDatabaseCorruptException -> Laa
            com.umeng.analytics.pro.g r3 = com.umeng.analytics.pro.g.a(r3)     // Catch: java.lang.Throwable -> L9b android.database.sqlite.SQLiteDatabaseCorruptException -> Laa
            android.database.sqlite.SQLiteDatabase r3 = r3.a()     // Catch: java.lang.Throwable -> L9b android.database.sqlite.SQLiteDatabaseCorruptException -> Laa
            r3.beginTransaction()     // Catch: java.lang.Throwable -> L97 android.database.sqlite.SQLiteDatabaseCorruptException -> L99
            r4 = 0
        L13:
            int r5 = r11.length()     // Catch: java.lang.Throwable -> L97 android.database.sqlite.SQLiteDatabaseCorruptException -> L99
            if (r4 >= r5) goto L8e
            org.json.JSONObject r5 = r11.getJSONObject(r4)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> L97 android.database.sqlite.SQLiteDatabaseCorruptException -> L99
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> L97 android.database.sqlite.SQLiteDatabaseCorruptException -> L99
            r6.<init>()     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> L97 android.database.sqlite.SQLiteDatabaseCorruptException -> L99
            java.lang.String r7 = r5.optString(r1)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> L97 android.database.sqlite.SQLiteDatabaseCorruptException -> L99
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> L97 android.database.sqlite.SQLiteDatabaseCorruptException -> L99
            java.lang.String r9 = "-1"
            if (r8 != 0) goto L34
            boolean r8 = r9.equals(r7)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> L97 android.database.sqlite.SQLiteDatabaseCorruptException -> L99
            if (r8 == 0) goto L43
        L34:
            com.umeng.analytics.pro.u r7 = com.umeng.analytics.pro.u.a()     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> L97 android.database.sqlite.SQLiteDatabaseCorruptException -> L99
            java.lang.String r7 = r7.b()     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> L97 android.database.sqlite.SQLiteDatabaseCorruptException -> L99
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> L97 android.database.sqlite.SQLiteDatabaseCorruptException -> L99
            if (r8 == 0) goto L43
            r7 = r9
        L43:
            r6.put(r1, r7)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> L97 android.database.sqlite.SQLiteDatabaseCorruptException -> L99
            java.lang.String r7 = "__e"
            java.lang.String r8 = "id"
            java.lang.String r8 = r5.optString(r8)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> L97 android.database.sqlite.SQLiteDatabaseCorruptException -> L99
            r6.put(r7, r8)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> L97 android.database.sqlite.SQLiteDatabaseCorruptException -> L99
            int r7 = r5.optInt(r0)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> L97 android.database.sqlite.SQLiteDatabaseCorruptException -> L99
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> L97 android.database.sqlite.SQLiteDatabaseCorruptException -> L99
            r6.put(r0, r7)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> L97 android.database.sqlite.SQLiteDatabaseCorruptException -> L99
            java.lang.String r7 = "__av"
            android.content.Context r8 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> L97 android.database.sqlite.SQLiteDatabaseCorruptException -> L99
            java.lang.String r8 = com.umeng.commonsdk.utils.UMUtils.getAppVersionName(r8)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> L97 android.database.sqlite.SQLiteDatabaseCorruptException -> L99
            r6.put(r7, r8)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> L97 android.database.sqlite.SQLiteDatabaseCorruptException -> L99
            java.lang.String r7 = "__vc"
            android.content.Context r8 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> L97 android.database.sqlite.SQLiteDatabaseCorruptException -> L99
            java.lang.String r8 = com.umeng.commonsdk.utils.UMUtils.getAppVersionCode(r8)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> L97 android.database.sqlite.SQLiteDatabaseCorruptException -> L99
            r6.put(r7, r8)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> L97 android.database.sqlite.SQLiteDatabaseCorruptException -> L99
            r5.remove(r1)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> L97 android.database.sqlite.SQLiteDatabaseCorruptException -> L99
            r5.remove(r0)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> L97 android.database.sqlite.SQLiteDatabaseCorruptException -> L99
            java.lang.String r7 = "__s"
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> L97 android.database.sqlite.SQLiteDatabaseCorruptException -> L99
            java.lang.String r5 = r10.c(r5)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> L97 android.database.sqlite.SQLiteDatabaseCorruptException -> L99
            r6.put(r7, r5)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> L97 android.database.sqlite.SQLiteDatabaseCorruptException -> L99
            java.lang.String r5 = "__et"
            r3.insert(r5, r2, r6)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> L97 android.database.sqlite.SQLiteDatabaseCorruptException -> L99
        L8b:
            int r4 = r4 + 1
            goto L13
        L8e:
            r3.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L97 android.database.sqlite.SQLiteDatabaseCorruptException -> L99
            if (r3 == 0) goto La0
            r3.endTransaction()     // Catch: java.lang.Throwable -> La0
            goto La0
        L97:
            r2 = r3
            goto L9b
        L99:
            r2 = r3
            goto Laa
        L9b:
            if (r2 == 0) goto La0
        L9d:
            r2.endTransaction()     // Catch: java.lang.Throwable -> La0
        La0:
            android.content.Context r11 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r11 = com.umeng.analytics.pro.g.a(r11)
            r11.b()
            goto Lb2
        Laa:
            android.content.Context r11 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> Lb3
            com.umeng.analytics.pro.h.a(r11)     // Catch: java.lang.Throwable -> Lb3
            if (r2 == 0) goto La0
            goto L9d
        Lb2:
            return
        Lb3:
            r11 = move-exception
            if (r2 == 0) goto Lb9
            r2.endTransaction()     // Catch: java.lang.Throwable -> Lb9
        Lb9:
            android.content.Context r0 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r0 = com.umeng.analytics.pro.g.a(r0)
            r0.b()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.a(org.json.JSONArray):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        if (r0 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        r0.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0058, code lost:
    
        if (r0 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(java.lang.String r5, java.lang.String r6, int r7) {
        /*
            r4 = this;
            r0 = 0
            android.content.Context r1 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteDatabaseCorruptException -> L67
            com.umeng.analytics.pro.g r1 = com.umeng.analytics.pro.g.a(r1)     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteDatabaseCorruptException -> L67
            android.database.sqlite.SQLiteDatabase r1 = r1.a()     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteDatabaseCorruptException -> L67
            r1.beginTransaction()     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteDatabaseCorruptException -> L56
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteDatabaseCorruptException -> L56
            r2.<init>()     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteDatabaseCorruptException -> L56
            java.lang.String r3 = "__i"
            r2.put(r3, r5)     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteDatabaseCorruptException -> L56
            java.lang.String r5 = r4.c(r6)     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteDatabaseCorruptException -> L56
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteDatabaseCorruptException -> L56
            if (r6 != 0) goto L4b
            java.lang.String r6 = "__a"
            r2.put(r6, r5)     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteDatabaseCorruptException -> L56
            java.lang.String r5 = "__t"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteDatabaseCorruptException -> L56
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteDatabaseCorruptException -> L56
            java.lang.String r5 = "__av"
            android.content.Context r6 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteDatabaseCorruptException -> L56
            java.lang.String r6 = com.umeng.commonsdk.utils.UMUtils.getAppVersionName(r6)     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteDatabaseCorruptException -> L56
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteDatabaseCorruptException -> L56
            java.lang.String r5 = "__vc"
            android.content.Context r6 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteDatabaseCorruptException -> L56
            java.lang.String r6 = com.umeng.commonsdk.utils.UMUtils.getAppVersionCode(r6)     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteDatabaseCorruptException -> L56
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteDatabaseCorruptException -> L56
            java.lang.String r5 = "__er"
            r1.insert(r5, r0, r2)     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteDatabaseCorruptException -> L56
        L4b:
            r1.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteDatabaseCorruptException -> L56
            if (r1 == 0) goto L5d
            r1.endTransaction()     // Catch: java.lang.Throwable -> L5d
            goto L5d
        L54:
            r0 = r1
            goto L58
        L56:
            r0 = r1
            goto L67
        L58:
            if (r0 == 0) goto L5d
        L5a:
            r0.endTransaction()     // Catch: java.lang.Throwable -> L5d
        L5d:
            android.content.Context r5 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r5 = com.umeng.analytics.pro.g.a(r5)
            r5.b()
            goto L6f
        L67:
            android.content.Context r5 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L71
            com.umeng.analytics.pro.h.a(r5)     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L5d
            goto L5a
        L6f:
            r5 = 0
            return r5
        L71:
            r5 = move-exception
            if (r0 == 0) goto L77
            r0.endTransaction()     // Catch: java.lang.Throwable -> L77
        L77:
            android.content.Context r6 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r6 = com.umeng.analytics.pro.g.a(r6)
            r6.b()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.a(java.lang.String, java.lang.String, int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0075, code lost:
    
        if (r0 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007a, code lost:
    
        r0.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
    
        if (r0 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
    
        if (r0 != null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d() {
        /*
            r7 = this;
            r0 = 0
            android.content.Context r1 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteDatabaseCorruptException -> L87
            com.umeng.analytics.pro.g r1 = com.umeng.analytics.pro.g.a(r1)     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteDatabaseCorruptException -> L87
            android.database.sqlite.SQLiteDatabase r0 = r1.a()     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteDatabaseCorruptException -> L87
            r0.beginTransaction()     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteDatabaseCorruptException -> L87
            com.umeng.analytics.pro.u r1 = com.umeng.analytics.pro.u.a()     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteDatabaseCorruptException -> L87
            java.lang.String r1 = r1.c()     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteDatabaseCorruptException -> L87
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteDatabaseCorruptException -> L87
            if (r2 == 0) goto L2b
            if (r0 == 0) goto L21
            r0.endTransaction()     // Catch: java.lang.Throwable -> L21
        L21:
            android.content.Context r0 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r0 = com.umeng.analytics.pro.g.a(r0)
            r0.b()
            return
        L2b:
            r2 = 2
            java.lang.String[] r3 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteDatabaseCorruptException -> L87
            java.lang.String r4 = ""
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteDatabaseCorruptException -> L87
            java.lang.String r4 = "-1"
            r6 = 1
            r3[r6] = r4     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteDatabaseCorruptException -> L87
        L38:
            if (r5 >= r2) goto L72
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteDatabaseCorruptException -> L87
            r4.<init>()     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteDatabaseCorruptException -> L87
            java.lang.String r6 = "update __et set __i=\""
            java.lang.StringBuilder r4 = r4.append(r6)     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteDatabaseCorruptException -> L87
            java.lang.StringBuilder r4 = r4.append(r1)     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteDatabaseCorruptException -> L87
            java.lang.String r6 = "\" where "
            java.lang.StringBuilder r4 = r4.append(r6)     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteDatabaseCorruptException -> L87
            java.lang.String r6 = "__i"
            java.lang.StringBuilder r4 = r4.append(r6)     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteDatabaseCorruptException -> L87
            java.lang.String r6 = "=\""
            java.lang.StringBuilder r4 = r4.append(r6)     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteDatabaseCorruptException -> L87
            r6 = r3[r5]     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteDatabaseCorruptException -> L87
            java.lang.StringBuilder r4 = r4.append(r6)     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteDatabaseCorruptException -> L87
            java.lang.String r6 = "\""
            java.lang.StringBuilder r4 = r4.append(r6)     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteDatabaseCorruptException -> L87
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteDatabaseCorruptException -> L87
            r0.execSQL(r4)     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteDatabaseCorruptException -> L87
            int r5 = r5 + 1
            goto L38
        L72:
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteDatabaseCorruptException -> L87
            if (r0 == 0) goto L7d
            goto L7a
        L78:
            if (r0 == 0) goto L7d
        L7a:
            r0.endTransaction()     // Catch: java.lang.Throwable -> L7d
        L7d:
            android.content.Context r0 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r0 = com.umeng.analytics.pro.g.a(r0)
            r0.b()
            goto L8f
        L87:
            android.content.Context r1 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L90
            com.umeng.analytics.pro.h.a(r1)     // Catch: java.lang.Throwable -> L90
            if (r0 == 0) goto L7d
            goto L7a
        L8f:
            return
        L90:
            r1 = move-exception
            if (r0 == 0) goto L96
            r0.endTransaction()     // Catch: java.lang.Throwable -> L96
        L96:
            android.content.Context r0 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r0 = com.umeng.analytics.pro.g.a(r0)
            r0.b()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.d():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x009b, code lost:
    
        if (r2 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0089, code lost:
    
        r2.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0087, code lost:
    
        if (r2 == null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(java.lang.String r7, org.json.JSONObject r8, com.umeng.analytics.pro.i.a r9) {
        /*
            r6 = this;
            java.lang.String r0 = "__e"
            r1 = 0
            if (r8 != 0) goto L6
            return r1
        L6:
            r2 = 0
            android.content.Context r3 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L87 android.database.sqlite.SQLiteDatabaseCorruptException -> L96
            com.umeng.analytics.pro.g r3 = com.umeng.analytics.pro.g.a(r3)     // Catch: java.lang.Throwable -> L87 android.database.sqlite.SQLiteDatabaseCorruptException -> L96
            android.database.sqlite.SQLiteDatabase r3 = r3.a()     // Catch: java.lang.Throwable -> L87 android.database.sqlite.SQLiteDatabaseCorruptException -> L96
            r3.beginTransaction()     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteDatabaseCorruptException -> L85
            com.umeng.analytics.pro.i$a r4 = com.umeng.analytics.pro.i.a.BEGIN     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteDatabaseCorruptException -> L85
            if (r9 != r4) goto L4f
            java.lang.Object r8 = r8.opt(r0)     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteDatabaseCorruptException -> L85
            java.lang.Long r8 = (java.lang.Long) r8     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteDatabaseCorruptException -> L85
            long r8 = r8.longValue()     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteDatabaseCorruptException -> L85
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteDatabaseCorruptException -> L85
            r4.<init>()     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteDatabaseCorruptException -> L85
            java.lang.String r5 = "__ii"
            r4.put(r5, r7)     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteDatabaseCorruptException -> L85
            java.lang.String r7 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteDatabaseCorruptException -> L85
            r4.put(r0, r7)     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteDatabaseCorruptException -> L85
            java.lang.String r7 = "__av"
            android.content.Context r8 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteDatabaseCorruptException -> L85
            java.lang.String r8 = com.umeng.commonsdk.utils.UMUtils.getAppVersionName(r8)     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteDatabaseCorruptException -> L85
            r4.put(r7, r8)     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteDatabaseCorruptException -> L85
            java.lang.String r7 = "__vc"
            android.content.Context r8 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteDatabaseCorruptException -> L85
            java.lang.String r8 = com.umeng.commonsdk.utils.UMUtils.getAppVersionCode(r8)     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteDatabaseCorruptException -> L85
            r4.put(r7, r8)     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteDatabaseCorruptException -> L85
            java.lang.String r7 = "__sd"
            r3.insert(r7, r2, r4)     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteDatabaseCorruptException -> L85
            goto L7a
        L4f:
            com.umeng.analytics.pro.i$a r0 = com.umeng.analytics.pro.i.a.INSTANTSESSIONBEGIN     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteDatabaseCorruptException -> L85
            if (r9 != r0) goto L57
            r6.b(r7, r8, r3)     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteDatabaseCorruptException -> L85
            goto L7a
        L57:
            com.umeng.analytics.pro.i$a r0 = com.umeng.analytics.pro.i.a.END     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteDatabaseCorruptException -> L85
            if (r9 != r0) goto L5f
            r6.a(r7, r8, r3)     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteDatabaseCorruptException -> L85
            goto L7a
        L5f:
            com.umeng.analytics.pro.i$a r0 = com.umeng.analytics.pro.i.a.PAGE     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteDatabaseCorruptException -> L85
            if (r9 != r0) goto L69
            java.lang.String r9 = "__a"
            r6.a(r7, r8, r3, r9)     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteDatabaseCorruptException -> L85
            goto L7a
        L69:
            com.umeng.analytics.pro.i$a r0 = com.umeng.analytics.pro.i.a.AUTOPAGE     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteDatabaseCorruptException -> L85
            if (r9 != r0) goto L73
            java.lang.String r9 = "__b"
            r6.a(r7, r8, r3, r9)     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteDatabaseCorruptException -> L85
            goto L7a
        L73:
            com.umeng.analytics.pro.i$a r0 = com.umeng.analytics.pro.i.a.NEWSESSION     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteDatabaseCorruptException -> L85
            if (r9 != r0) goto L7a
            r6.c(r7, r8, r3)     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteDatabaseCorruptException -> L85
        L7a:
            r3.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteDatabaseCorruptException -> L85
            if (r3 == 0) goto L8c
            r3.endTransaction()     // Catch: java.lang.Throwable -> L8c
            goto L8c
        L83:
            r2 = r3
            goto L87
        L85:
            r2 = r3
            goto L96
        L87:
            if (r2 == 0) goto L8c
        L89:
            r2.endTransaction()     // Catch: java.lang.Throwable -> L8c
        L8c:
            android.content.Context r7 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r7 = com.umeng.analytics.pro.g.a(r7)
            r7.b()
            goto L9e
        L96:
            android.content.Context r7 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L9f
            com.umeng.analytics.pro.h.a(r7)     // Catch: java.lang.Throwable -> L9f
            if (r2 == 0) goto L8c
            goto L89
        L9e:
            return r1
        L9f:
            r7 = move-exception
            if (r2 == 0) goto La5
            r2.endTransaction()     // Catch: java.lang.Throwable -> La5
        La5:
            android.content.Context r8 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r8 = com.umeng.analytics.pro.g.a(r8)
            r8.b()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.a(java.lang.String, org.json.JSONObject, com.umeng.analytics.pro.i$a):boolean");
    }

    private void a(String str, JSONObject jSONObject, SQLiteDatabase sQLiteDatabase) {
        String str2;
        try {
            long longValue = ((Long) jSONObject.opt(e.d.a.g)).longValue();
            Object opt = jSONObject.opt(e.d.a.h);
            long longValue2 = (opt == null || !(opt instanceof Long)) ? 0L : ((Long) opt).longValue();
            JSONObject optJSONObject = jSONObject.optJSONObject("__sp");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("__pp");
            String str3 = "";
            if (optJSONObject == null || optJSONObject.length() <= 0) {
                str2 = "";
            } else {
                str2 = c(optJSONObject.toString());
            }
            if (optJSONObject2 != null && optJSONObject2.length() > 0) {
                str3 = c(optJSONObject2.toString());
            }
            sQLiteDatabase.execSQL("update __sd set __f=\"" + longValue + "\", __g=\"" + longValue2 + "\", __sp=\"" + str2 + "\", __pp=\"" + str3 + "\" where __ii=\"" + str + "\"");
        } catch (Throwable unused) {
        }
    }

    private void b(String str, JSONObject jSONObject, SQLiteDatabase sQLiteDatabase) {
        String str2;
        try {
            long longValue = ((Long) jSONObject.get("__e")).longValue();
            JSONObject optJSONObject = jSONObject.optJSONObject("__sp");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("__pp");
            String str3 = "";
            if (optJSONObject == null || optJSONObject.length() <= 0) {
                str2 = "";
            } else {
                str2 = c(optJSONObject.toString());
            }
            if (optJSONObject2 != null && optJSONObject2.length() > 0) {
                str3 = c(optJSONObject2.toString());
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("__ii", str);
            contentValues.put("__e", String.valueOf(longValue));
            contentValues.put("__sp", str2);
            contentValues.put("__pp", str3);
            contentValues.put("__av", UMGlobalContext.getInstance(d).getAppVersion());
            contentValues.put("__vc", UMUtils.getAppVersionCode(d));
            sQLiteDatabase.insert(e.c.f13840a, null, contentValues);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        if (r7 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
    
        r7.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        if (r7 != null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long a(java.lang.String r16) {
        /*
            r15 = this;
            java.lang.String r0 = "__f"
            r1 = 0
            r2 = 0
            android.content.Context r4 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L56
            com.umeng.analytics.pro.g r4 = com.umeng.analytics.pro.g.a(r4)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L56
            android.database.sqlite.SQLiteDatabase r7 = r4.a()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L56
            r7.beginTransaction()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L57
            r4 = 1
            java.lang.String[] r8 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L57
            r5 = 0
            r8[r5] = r0     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L57
            java.lang.String r6 = "__sd"
            java.lang.String r9 = "__ii=? "
            java.lang.String[] r10 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L57
            r10[r5] = r16     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L57
            r13 = 0
            r14 = 0
            r11 = 0
            r12 = 0
            r5 = r15
            android.database.Cursor r1 = r5.a(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L57
            if (r1 == 0) goto L36
            r1.moveToFirst()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L57
            int r0 = r1.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L57
            long r2 = r1.getLong(r0)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L57
        L36:
            if (r1 == 0) goto L3b
            r1.close()     // Catch: java.lang.Exception -> L61
        L3b:
            if (r7 == 0) goto L61
            goto L5e
        L3e:
            r0 = move-exception
            goto L42
        L40:
            r0 = move-exception
            r7 = r1
        L42:
            if (r1 == 0) goto L47
            r1.close()     // Catch: java.lang.Exception -> L4c
        L47:
            if (r7 == 0) goto L4c
            r7.endTransaction()     // Catch: java.lang.Exception -> L4c
        L4c:
            android.content.Context r1 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r1 = com.umeng.analytics.pro.g.a(r1)
            r1.b()
            throw r0
        L56:
            r7 = r1
        L57:
            if (r1 == 0) goto L5c
            r1.close()     // Catch: java.lang.Exception -> L61
        L5c:
            if (r7 == 0) goto L61
        L5e:
            r7.endTransaction()     // Catch: java.lang.Exception -> L61
        L61:
            android.content.Context r0 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r0 = com.umeng.analytics.pro.g.a(r0)
            r0.b()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.a(java.lang.String):long");
    }

    private void c(String str, JSONObject jSONObject, SQLiteDatabase sQLiteDatabase) {
        SQLiteDatabase sQLiteDatabase2;
        Cursor cursor;
        Cursor cursor2 = null;
        r13 = null;
        r13 = null;
        String str2 = null;
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject(e.d.a.e);
            if (optJSONObject != null) {
                sQLiteDatabase2 = sQLiteDatabase;
                cursor = a(e.d.f13843a, sQLiteDatabase2, new String[]{e.d.a.e}, "__ii=? ", new String[]{str}, null, null, null, null);
                if (cursor != null) {
                    while (cursor.moveToNext()) {
                        try {
                            str2 = d(cursor.getString(cursor.getColumnIndex(e.d.a.e)));
                        } catch (Throwable unused) {
                            cursor2 = cursor;
                            if (cursor2 != null) {
                                cursor2.close();
                                return;
                            }
                            return;
                        }
                    }
                }
            } else {
                sQLiteDatabase2 = sQLiteDatabase;
                cursor = null;
            }
            if (optJSONObject != null) {
                JSONArray jSONArray = new JSONArray();
                if (!TextUtils.isEmpty(str2)) {
                    jSONArray = new JSONArray(str2);
                }
                jSONArray.put(optJSONObject);
                String c2 = c(jSONArray.toString());
                if (!TextUtils.isEmpty(c2)) {
                    sQLiteDatabase2.execSQL("update  __sd set __d=\"" + c2 + "\" where __ii=\"" + str + "\"");
                }
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject(e.d.a.d);
            if (optJSONObject2 != null) {
                String c3 = c(optJSONObject2.toString());
                if (!TextUtils.isEmpty(c3)) {
                    sQLiteDatabase2.execSQL("update  __sd set __c=\"" + c3 + "\" where __ii=\"" + str + "\"");
                }
            }
            sQLiteDatabase2.execSQL("update  __sd set __f=\"" + String.valueOf(jSONObject.optLong(e.d.a.g)) + "\" where __ii=\"" + str + "\"");
            if (cursor != null) {
                cursor.close();
            }
        } catch (Throwable unused2) {
        }
    }

    private void a(String str, JSONObject jSONObject, SQLiteDatabase sQLiteDatabase, String str2) throws JSONException {
        JSONArray jSONArray;
        JSONArray optJSONArray;
        Cursor cursor = null;
        r13 = null;
        String str3 = null;
        cursor = null;
        try {
            if ("__a".equals(str2)) {
                optJSONArray = jSONObject.optJSONArray("__a");
                if (optJSONArray != null) {
                    if (optJSONArray.length() <= 0) {
                    }
                    jSONArray = optJSONArray;
                }
                return;
            }
            if (e.d.a.c.equals(str2)) {
                optJSONArray = jSONObject.optJSONArray(e.d.a.c);
                if (optJSONArray != null) {
                    if (optJSONArray.length() <= 0) {
                    }
                    jSONArray = optJSONArray;
                }
                return;
            }
            jSONArray = null;
            try {
                Cursor a2 = a(e.d.f13843a, sQLiteDatabase, new String[]{str2}, "__ii=? ", new String[]{str}, null, null, null, null);
                if (a2 != null) {
                    while (a2.moveToNext()) {
                        try {
                            str3 = d(a2.getString(a2.getColumnIndex(str2)));
                        } catch (Throwable unused) {
                            cursor = a2;
                            if (cursor != null) {
                                cursor.close();
                                return;
                            }
                            return;
                        }
                    }
                }
                JSONArray jSONArray2 = new JSONArray();
                if (!TextUtils.isEmpty(str3)) {
                    jSONArray2 = new JSONArray(str3);
                }
                if (jSONArray2.length() > 1000) {
                    if (a2 != null) {
                        a2.close();
                        return;
                    }
                    return;
                }
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        if (jSONObject2 != null) {
                            jSONArray2.put(jSONObject2);
                        }
                    } catch (JSONException unused2) {
                    }
                }
                String c2 = c(jSONArray2.toString());
                if (!TextUtils.isEmpty(c2)) {
                    sQLiteDatabase.execSQL("update __sd set " + str2 + "=\"" + c2 + "\" where __ii=\"" + str + "\"");
                }
                if (a2 != null) {
                    a2.close();
                }
            } catch (Throwable unused3) {
            }
        } catch (Throwable unused4) {
        }
    }

    public boolean e() {
        return this.i.isEmpty();
    }

    public JSONObject a(boolean z) {
        a();
        this.j.clear();
        JSONObject jSONObject = new JSONObject();
        if (!z) {
            a(jSONObject, z);
            b(jSONObject, (String) null);
            a(jSONObject, (String) null);
            return jSONObject;
        }
        String a2 = a(jSONObject, z);
        if (!TextUtils.isEmpty(a2)) {
            b(jSONObject, a2);
            a(jSONObject, a2);
        }
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x009f, code lost:
    
        if (r6 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0085, code lost:
    
        r6.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0083, code lost:
    
        if (r6 != null) goto L54;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.json.JSONObject f() {
        /*
            r14 = this;
            java.lang.String r0 = "__vc"
            java.lang.String r1 = "__av"
            java.util.List<java.lang.String> r2 = r14.l
            boolean r2 = r2.isEmpty()
            r3 = 0
            if (r2 == 0) goto Le
            return r3
        Le:
            android.content.Context r2 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteDatabaseCorruptException -> L93
            com.umeng.analytics.pro.g r2 = com.umeng.analytics.pro.g.a(r2)     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteDatabaseCorruptException -> L93
            android.database.sqlite.SQLiteDatabase r6 = r2.a()     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteDatabaseCorruptException -> L93
            r6.beginTransaction()     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteDatabaseCorruptException -> L7a
            java.util.List<java.lang.String> r2 = r14.l     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteDatabaseCorruptException -> L7a
            r4 = 0
            java.lang.Object r2 = r2.get(r4)     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteDatabaseCorruptException -> L7a
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteDatabaseCorruptException -> L7a
            java.lang.String r5 = "__is"
            java.lang.String r8 = "__ii=? "
            r7 = 1
            java.lang.String[] r9 = new java.lang.String[r7]     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteDatabaseCorruptException -> L7a
            r9[r4] = r2     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteDatabaseCorruptException -> L7a
            r12 = 0
            r13 = 0
            r7 = 0
            r10 = 0
            r11 = 0
            r4 = r14
            android.database.Cursor r2 = r4.a(r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteDatabaseCorruptException -> L7a
            if (r2 == 0) goto L5b
            boolean r4 = r2.moveToNext()     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteDatabaseCorruptException -> L75
            if (r4 == 0) goto L5b
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteDatabaseCorruptException -> L75
            r4.<init>()     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteDatabaseCorruptException -> L75
            int r3 = r2.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteDatabaseCorruptException -> L76
            java.lang.String r3 = r2.getString(r3)     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteDatabaseCorruptException -> L76
            int r5 = r2.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteDatabaseCorruptException -> L76
            java.lang.String r5 = r2.getString(r5)     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteDatabaseCorruptException -> L76
            r4.put(r1, r3)     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteDatabaseCorruptException -> L76
            r4.put(r0, r5)     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteDatabaseCorruptException -> L76
            r3 = r4
        L5b:
            r6.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteDatabaseCorruptException -> L75
            if (r2 == 0) goto L63
            r2.close()
        L63:
            if (r6 == 0) goto L68
            r6.endTransaction()     // Catch: java.lang.Throwable -> L68
        L68:
            android.content.Context r0 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r0 = com.umeng.analytics.pro.g.a(r0)
            r0.b()
            goto La2
        L72:
            r4 = r3
        L73:
            r3 = r2
            goto L7e
        L75:
            r4 = r3
        L76:
            r3 = r2
            goto L95
        L78:
            r4 = r3
            goto L7e
        L7a:
            r4 = r3
            goto L95
        L7c:
            r4 = r3
            r6 = r4
        L7e:
            if (r3 == 0) goto L83
            r3.close()
        L83:
            if (r6 == 0) goto L88
        L85:
            r6.endTransaction()     // Catch: java.lang.Throwable -> L88
        L88:
            android.content.Context r0 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r0 = com.umeng.analytics.pro.g.a(r0)
            r0.b()
            r3 = r4
            goto La2
        L93:
            r4 = r3
            r6 = r4
        L95:
            android.content.Context r0 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> La3
            com.umeng.analytics.pro.h.a(r0)     // Catch: java.lang.Throwable -> La3
            if (r3 == 0) goto L9f
            r3.close()
        L9f:
            if (r6 == 0) goto L88
            goto L85
        La2:
            return r3
        La3:
            r0 = move-exception
            if (r3 == 0) goto La9
            r3.close()
        La9:
            if (r6 == 0) goto Lae
            r6.endTransaction()     // Catch: java.lang.Throwable -> Lae
        Lae:
            android.content.Context r1 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r1 = com.umeng.analytics.pro.g.a(r1)
            r1.b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.f():org.json.JSONObject");
    }

    public JSONObject b(boolean z) {
        JSONObject jSONObject = new JSONObject();
        b(jSONObject, z);
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0199, code lost:
    
        if (r4 != null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0189, code lost:
    
        if (r4 != null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0173, code lost:
    
        if (r4 != null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x019e, code lost:
    
        com.umeng.analytics.pro.g.a(com.umeng.analytics.pro.i.d).b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a7, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x019b, code lost:
    
        r4.endTransaction();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r14v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r14v7, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(org.json.JSONObject r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.a(org.json.JSONObject, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0076, code lost:
    
        if (r4 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009e, code lost:
    
        r4.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a1, code lost:
    
        com.umeng.analytics.pro.g.a(com.umeng.analytics.pro.i.d).b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00aa, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009c, code lost:
    
        if (r4 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x008c, code lost:
    
        if (r4 != null) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r13v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r13v7, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(org.json.JSONObject r13, java.lang.String r14) {
        /*
            r12 = this;
            r0 = 0
            android.content.Context r1 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L7f android.database.sqlite.SQLiteDatabaseCorruptException -> L8f
            com.umeng.analytics.pro.g r1 = com.umeng.analytics.pro.g.a(r1)     // Catch: java.lang.Throwable -> L7f android.database.sqlite.SQLiteDatabaseCorruptException -> L8f
            android.database.sqlite.SQLiteDatabase r4 = r1.a()     // Catch: java.lang.Throwable -> L7f android.database.sqlite.SQLiteDatabaseCorruptException -> L8f
            r4.beginTransaction()     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteDatabaseCorruptException -> L7c
            boolean r1 = android.text.TextUtils.isEmpty(r14)     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteDatabaseCorruptException -> L7c
            if (r1 != 0) goto L2a
            java.lang.String r3 = "__er"
            java.lang.String r6 = "__i=? "
            r1 = 1
            java.lang.String[] r7 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteDatabaseCorruptException -> L7c
            r1 = 0
            r7[r1] = r14     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteDatabaseCorruptException -> L7c
            r10 = 0
            r11 = 0
            r5 = 0
            r8 = 0
            r9 = 0
            r2 = r12
            android.database.Cursor r14 = r2.a(r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteDatabaseCorruptException -> L7c
            r2 = r12
            goto L38
        L2a:
            java.lang.String r3 = "__er"
            r10 = 0
            r11 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r12
            android.database.Cursor r14 = r2.a(r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteDatabaseCorruptException -> L7d
        L38:
            r0 = r14
            if (r0 == 0) goto L6e
            org.json.JSONArray r14 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteDatabaseCorruptException -> L7d
            r14.<init>()     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteDatabaseCorruptException -> L7d
        L40:
            boolean r1 = r0.moveToNext()     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteDatabaseCorruptException -> L7d
            if (r1 == 0) goto L63
            java.lang.String r1 = "__a"
            int r1 = r0.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteDatabaseCorruptException -> L7d
            java.lang.String r1 = r0.getString(r1)     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteDatabaseCorruptException -> L7d
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteDatabaseCorruptException -> L7d
            if (r3 != 0) goto L40
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteDatabaseCorruptException -> L7d
            java.lang.String r1 = r12.d(r1)     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteDatabaseCorruptException -> L7d
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteDatabaseCorruptException -> L7d
            r14.put(r3)     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteDatabaseCorruptException -> L7d
            goto L40
        L63:
            int r1 = r14.length()     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteDatabaseCorruptException -> L7d
            if (r1 <= 0) goto L6e
            java.lang.String r1 = "error"
            r13.put(r1, r14)     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteDatabaseCorruptException -> L7d
        L6e:
            r4.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteDatabaseCorruptException -> L7d
            if (r0 == 0) goto L76
            r0.close()
        L76:
            if (r4 == 0) goto La1
            goto L9e
        L79:
            r2 = r12
        L7a:
            r13 = r0
            goto L82
        L7c:
            r2 = r12
        L7d:
            r13 = r0
            goto L92
        L7f:
            r2 = r12
            r13 = r0
            r4 = r13
        L82:
            android.content.Context r14 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> Lab
            com.umeng.analytics.pro.h.a(r14)     // Catch: java.lang.Throwable -> Lab
            if (r13 == 0) goto L8c
            r13.close()
        L8c:
            if (r4 == 0) goto La1
            goto L9e
        L8f:
            r2 = r12
            r13 = r0
            r4 = r13
        L92:
            android.content.Context r14 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> Lab
            com.umeng.analytics.pro.h.a(r14)     // Catch: java.lang.Throwable -> Lab
            if (r13 == 0) goto L9c
            r13.close()
        L9c:
            if (r4 == 0) goto La1
        L9e:
            r4.endTransaction()     // Catch: java.lang.Throwable -> La1
        La1:
            android.content.Context r13 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r13 = com.umeng.analytics.pro.g.a(r13)
            r13.b()
            return
        Lab:
            r0 = move-exception
            r14 = r0
            if (r13 == 0) goto Lb2
            r13.close()
        Lb2:
            if (r4 == 0) goto Lb7
            r4.endTransaction()     // Catch: java.lang.Throwable -> Lb7
        Lb7:
            android.content.Context r13 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r13 = com.umeng.analytics.pro.g.a(r13)
            r13.b()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.b(org.json.JSONObject, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x009f, code lost:
    
        if (r6 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0085, code lost:
    
        r6.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0083, code lost:
    
        if (r6 != null) goto L54;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.json.JSONObject g() {
        /*
            r14 = this;
            java.lang.String r0 = "__vc"
            java.lang.String r1 = "__av"
            java.util.List<java.lang.String> r2 = r14.i
            boolean r2 = r2.isEmpty()
            r3 = 0
            if (r2 == 0) goto Le
            return r3
        Le:
            android.content.Context r2 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteDatabaseCorruptException -> L93
            com.umeng.analytics.pro.g r2 = com.umeng.analytics.pro.g.a(r2)     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteDatabaseCorruptException -> L93
            android.database.sqlite.SQLiteDatabase r6 = r2.a()     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteDatabaseCorruptException -> L93
            r6.beginTransaction()     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteDatabaseCorruptException -> L7a
            java.util.List<java.lang.String> r2 = r14.i     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteDatabaseCorruptException -> L7a
            r4 = 0
            java.lang.Object r2 = r2.get(r4)     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteDatabaseCorruptException -> L7a
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteDatabaseCorruptException -> L7a
            java.lang.String r5 = "__sd"
            java.lang.String r8 = "__ii=? "
            r7 = 1
            java.lang.String[] r9 = new java.lang.String[r7]     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteDatabaseCorruptException -> L7a
            r9[r4] = r2     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteDatabaseCorruptException -> L7a
            r12 = 0
            r13 = 0
            r7 = 0
            r10 = 0
            r11 = 0
            r4 = r14
            android.database.Cursor r2 = r4.a(r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteDatabaseCorruptException -> L7a
            if (r2 == 0) goto L5b
            boolean r4 = r2.moveToNext()     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteDatabaseCorruptException -> L75
            if (r4 == 0) goto L5b
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteDatabaseCorruptException -> L75
            r4.<init>()     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteDatabaseCorruptException -> L75
            int r3 = r2.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteDatabaseCorruptException -> L76
            java.lang.String r3 = r2.getString(r3)     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteDatabaseCorruptException -> L76
            int r5 = r2.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteDatabaseCorruptException -> L76
            java.lang.String r5 = r2.getString(r5)     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteDatabaseCorruptException -> L76
            r4.put(r1, r3)     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteDatabaseCorruptException -> L76
            r4.put(r0, r5)     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteDatabaseCorruptException -> L76
            r3 = r4
        L5b:
            r6.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteDatabaseCorruptException -> L75
            if (r2 == 0) goto L63
            r2.close()
        L63:
            if (r6 == 0) goto L68
            r6.endTransaction()     // Catch: java.lang.Throwable -> L68
        L68:
            android.content.Context r0 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r0 = com.umeng.analytics.pro.g.a(r0)
            r0.b()
            goto La2
        L72:
            r4 = r3
        L73:
            r3 = r2
            goto L7e
        L75:
            r4 = r3
        L76:
            r3 = r2
            goto L95
        L78:
            r4 = r3
            goto L7e
        L7a:
            r4 = r3
            goto L95
        L7c:
            r4 = r3
            r6 = r4
        L7e:
            if (r3 == 0) goto L83
            r3.close()
        L83:
            if (r6 == 0) goto L88
        L85:
            r6.endTransaction()     // Catch: java.lang.Throwable -> L88
        L88:
            android.content.Context r0 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r0 = com.umeng.analytics.pro.g.a(r0)
            r0.b()
            r3 = r4
            goto La2
        L93:
            r4 = r3
            r6 = r4
        L95:
            android.content.Context r0 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> La3
            com.umeng.analytics.pro.h.a(r0)     // Catch: java.lang.Throwable -> La3
            if (r3 == 0) goto L9f
            r3.close()
        L9f:
            if (r6 == 0) goto L88
            goto L85
        La2:
            return r3
        La3:
            r0 = move-exception
            if (r3 == 0) goto La9
            r3.close()
        La9:
            if (r6 == 0) goto Lae
            r6.endTransaction()     // Catch: java.lang.Throwable -> Lae
        Lae:
            android.content.Context r1 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r1 = com.umeng.analytics.pro.g.a(r1)
            r1.b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.g():org.json.JSONObject");
    }

    private JSONArray b(JSONArray jSONArray) {
        JSONArray jSONArray2 = new JSONArray();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null && optJSONObject.optLong("duration") > 0) {
                jSONArray2.put(optJSONObject);
            }
        }
        return jSONArray2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x021d, code lost:
    
        if (r16 != null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x024f, code lost:
    
        r16.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0252, code lost:
    
        com.umeng.analytics.pro.g.a(com.umeng.analytics.pro.i.d).b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x025b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x024d, code lost:
    
        if (r16 != null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x023b, code lost:
    
        if (r16 != null) goto L130;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0238  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String a(org.json.JSONObject r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 625
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.a(org.json.JSONObject, boolean):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00b4, code lost:
    
        if (r4 != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00df, code lost:
    
        com.umeng.analytics.pro.g.a(com.umeng.analytics.pro.i.d).b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00e8, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00dc, code lost:
    
        r4.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00da, code lost:
    
        if (r4 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ca, code lost:
    
        if (r4 == null) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String b(org.json.JSONObject r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.b(org.json.JSONObject, boolean):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0069, code lost:
    
        if (r0 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0059, code lost:
    
        if (r0 != null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(boolean r6, boolean r7) {
        /*
            r5 = this;
            r0 = 0
            android.content.Context r1 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L5c android.database.sqlite.SQLiteDatabaseCorruptException -> L64
            com.umeng.analytics.pro.g r1 = com.umeng.analytics.pro.g.a(r1)     // Catch: java.lang.Throwable -> L5c android.database.sqlite.SQLiteDatabaseCorruptException -> L64
            android.database.sqlite.SQLiteDatabase r0 = r1.a()     // Catch: java.lang.Throwable -> L5c android.database.sqlite.SQLiteDatabaseCorruptException -> L64
            r0.beginTransaction()     // Catch: java.lang.Throwable -> L5c android.database.sqlite.SQLiteDatabaseCorruptException -> L64
            if (r7 == 0) goto L18
            if (r6 == 0) goto L56
            java.lang.String r6 = "delete from __is"
            r0.execSQL(r6)     // Catch: java.lang.Throwable -> L5c android.database.sqlite.SQLiteDatabaseCorruptException -> L64
            goto L56
        L18:
            java.util.List<java.lang.String> r6 = r5.l     // Catch: java.lang.Throwable -> L5c android.database.sqlite.SQLiteDatabaseCorruptException -> L64
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L5c android.database.sqlite.SQLiteDatabaseCorruptException -> L64
            r7 = 0
            if (r6 <= 0) goto L4f
            r1 = r7
        L22:
            if (r7 >= r6) goto L4e
            java.util.List<java.lang.String> r2 = r5.l     // Catch: java.lang.Throwable -> L5c android.database.sqlite.SQLiteDatabaseCorruptException -> L64
            java.lang.Object r2 = r2.get(r7)     // Catch: java.lang.Throwable -> L5c android.database.sqlite.SQLiteDatabaseCorruptException -> L64
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L5c android.database.sqlite.SQLiteDatabaseCorruptException -> L64
            if (r2 != 0) goto L2f
            r1 = 1
        L2f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c android.database.sqlite.SQLiteDatabaseCorruptException -> L64
            r3.<init>()     // Catch: java.lang.Throwable -> L5c android.database.sqlite.SQLiteDatabaseCorruptException -> L64
            java.lang.String r4 = "delete from __is where __ii=\""
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L5c android.database.sqlite.SQLiteDatabaseCorruptException -> L64
            java.lang.StringBuilder r2 = r3.append(r2)     // Catch: java.lang.Throwable -> L5c android.database.sqlite.SQLiteDatabaseCorruptException -> L64
            java.lang.String r3 = "\""
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L5c android.database.sqlite.SQLiteDatabaseCorruptException -> L64
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L5c android.database.sqlite.SQLiteDatabaseCorruptException -> L64
            r0.execSQL(r2)     // Catch: java.lang.Throwable -> L5c android.database.sqlite.SQLiteDatabaseCorruptException -> L64
            int r7 = r7 + 1
            goto L22
        L4e:
            r7 = r1
        L4f:
            if (r7 == 0) goto L56
            java.lang.String r6 = "delete from __is where __ii is null"
            r0.execSQL(r6)     // Catch: java.lang.Throwable -> L5c android.database.sqlite.SQLiteDatabaseCorruptException -> L64
        L56:
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L5c android.database.sqlite.SQLiteDatabaseCorruptException -> L64
            if (r0 == 0) goto L6e
            goto L6b
        L5c:
            android.content.Context r6 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L78
            com.umeng.analytics.pro.h.a(r6)     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L6e
            goto L6b
        L64:
            android.content.Context r6 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L78
            com.umeng.analytics.pro.h.a(r6)     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L6e
        L6b:
            r0.endTransaction()     // Catch: java.lang.Throwable -> L6e
        L6e:
            android.content.Context r6 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r6 = com.umeng.analytics.pro.g.a(r6)
            r6.b()
            return
        L78:
            r6 = move-exception
            if (r0 == 0) goto L7e
            r0.endTransaction()     // Catch: java.lang.Throwable -> L7e
        L7e:
            android.content.Context r7 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r7 = com.umeng.analytics.pro.g.a(r7)
            r7.b()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.a(boolean, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        if (r0 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
    
        if (r0 != null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(boolean r3, boolean r4) {
        /*
            r2 = this;
            r0 = 0
            android.content.Context r1 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteDatabaseCorruptException -> L65
            com.umeng.analytics.pro.g r1 = com.umeng.analytics.pro.g.a(r1)     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteDatabaseCorruptException -> L65
            android.database.sqlite.SQLiteDatabase r0 = r1.a()     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteDatabaseCorruptException -> L65
            r0.beginTransaction()     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteDatabaseCorruptException -> L65
            if (r4 == 0) goto L18
            if (r3 == 0) goto L50
            java.lang.String r3 = "delete from __sd"
            r0.execSQL(r3)     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteDatabaseCorruptException -> L65
            goto L50
        L18:
            java.util.List<java.lang.String> r3 = r2.i     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteDatabaseCorruptException -> L65
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteDatabaseCorruptException -> L65
            if (r3 <= 0) goto L50
            r3 = 0
        L21:
            java.util.List<java.lang.String> r4 = r2.i     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteDatabaseCorruptException -> L65
            int r4 = r4.size()     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteDatabaseCorruptException -> L65
            if (r3 >= r4) goto L50
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteDatabaseCorruptException -> L65
            r4.<init>()     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteDatabaseCorruptException -> L65
            java.lang.String r1 = "delete from __sd where __ii=\""
            java.lang.StringBuilder r4 = r4.append(r1)     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteDatabaseCorruptException -> L65
            java.util.List<java.lang.String> r1 = r2.i     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteDatabaseCorruptException -> L65
            java.lang.Object r1 = r1.get(r3)     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteDatabaseCorruptException -> L65
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteDatabaseCorruptException -> L65
            java.lang.StringBuilder r4 = r4.append(r1)     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteDatabaseCorruptException -> L65
            java.lang.String r1 = "\""
            java.lang.StringBuilder r4 = r4.append(r1)     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteDatabaseCorruptException -> L65
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteDatabaseCorruptException -> L65
            r0.execSQL(r4)     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteDatabaseCorruptException -> L65
            int r3 = r3 + 1
            goto L21
        L50:
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteDatabaseCorruptException -> L65
            if (r0 == 0) goto L5b
            goto L58
        L56:
            if (r0 == 0) goto L5b
        L58:
            r0.endTransaction()     // Catch: java.lang.Throwable -> L5b
        L5b:
            android.content.Context r3 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r3 = com.umeng.analytics.pro.g.a(r3)
            r3.b()
            goto L6d
        L65:
            android.content.Context r3 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L6e
            com.umeng.analytics.pro.h.a(r3)     // Catch: java.lang.Throwable -> L6e
            if (r0 == 0) goto L5b
            goto L58
        L6d:
            return
        L6e:
            r3 = move-exception
            if (r0 == 0) goto L74
            r0.endTransaction()     // Catch: java.lang.Throwable -> L74
        L74:
            android.content.Context r4 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r4 = com.umeng.analytics.pro.g.a(r4)
            r4.b()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.b(boolean, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (r0 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
    
        if (r0 != null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h() {
        /*
            r4 = this;
            r0 = 0
            android.content.Context r1 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L49 android.database.sqlite.SQLiteDatabaseCorruptException -> L58
            com.umeng.analytics.pro.g r1 = com.umeng.analytics.pro.g.a(r1)     // Catch: java.lang.Throwable -> L49 android.database.sqlite.SQLiteDatabaseCorruptException -> L58
            android.database.sqlite.SQLiteDatabase r0 = r1.a()     // Catch: java.lang.Throwable -> L49 android.database.sqlite.SQLiteDatabaseCorruptException -> L58
            r0.beginTransaction()     // Catch: java.lang.Throwable -> L49 android.database.sqlite.SQLiteDatabaseCorruptException -> L58
            java.util.List<java.lang.Integer> r1 = r4.j     // Catch: java.lang.Throwable -> L49 android.database.sqlite.SQLiteDatabaseCorruptException -> L58
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L49 android.database.sqlite.SQLiteDatabaseCorruptException -> L58
            if (r1 <= 0) goto L3e
            r1 = 0
        L17:
            java.util.List<java.lang.Integer> r2 = r4.j     // Catch: java.lang.Throwable -> L49 android.database.sqlite.SQLiteDatabaseCorruptException -> L58
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L49 android.database.sqlite.SQLiteDatabaseCorruptException -> L58
            if (r1 >= r2) goto L3e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49 android.database.sqlite.SQLiteDatabaseCorruptException -> L58
            r2.<init>()     // Catch: java.lang.Throwable -> L49 android.database.sqlite.SQLiteDatabaseCorruptException -> L58
            java.lang.String r3 = "delete from __et where rowid="
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L49 android.database.sqlite.SQLiteDatabaseCorruptException -> L58
            java.util.List<java.lang.Integer> r3 = r4.j     // Catch: java.lang.Throwable -> L49 android.database.sqlite.SQLiteDatabaseCorruptException -> L58
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L49 android.database.sqlite.SQLiteDatabaseCorruptException -> L58
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L49 android.database.sqlite.SQLiteDatabaseCorruptException -> L58
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L49 android.database.sqlite.SQLiteDatabaseCorruptException -> L58
            r0.execSQL(r2)     // Catch: java.lang.Throwable -> L49 android.database.sqlite.SQLiteDatabaseCorruptException -> L58
            int r1 = r1 + 1
            goto L17
        L3e:
            java.util.List<java.lang.Integer> r1 = r4.j     // Catch: java.lang.Throwable -> L49 android.database.sqlite.SQLiteDatabaseCorruptException -> L58
            r1.clear()     // Catch: java.lang.Throwable -> L49 android.database.sqlite.SQLiteDatabaseCorruptException -> L58
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L49 android.database.sqlite.SQLiteDatabaseCorruptException -> L58
            if (r0 == 0) goto L4e
            goto L4b
        L49:
            if (r0 == 0) goto L4e
        L4b:
            r0.endTransaction()     // Catch: java.lang.Throwable -> L4e
        L4e:
            android.content.Context r0 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r0 = com.umeng.analytics.pro.g.a(r0)
            r0.b()
            goto L60
        L58:
            android.content.Context r1 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L61
            com.umeng.analytics.pro.h.a(r1)     // Catch: java.lang.Throwable -> L61
            if (r0 == 0) goto L4e
            goto L4b
        L60:
            return
        L61:
            r1 = move-exception
            if (r0 == 0) goto L67
            r0.endTransaction()     // Catch: java.lang.Throwable -> L67
        L67:
            android.content.Context r0 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r0 = com.umeng.analytics.pro.g.a(r0)
            r0.b()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.h():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (r0 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0019, code lost:
    
        if (r0 != null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i() {
        /*
            r2 = this;
            r0 = 0
            android.content.Context r1 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L19 android.database.sqlite.SQLiteDatabaseCorruptException -> L28
            com.umeng.analytics.pro.g r1 = com.umeng.analytics.pro.g.a(r1)     // Catch: java.lang.Throwable -> L19 android.database.sqlite.SQLiteDatabaseCorruptException -> L28
            android.database.sqlite.SQLiteDatabase r0 = r1.a()     // Catch: java.lang.Throwable -> L19 android.database.sqlite.SQLiteDatabaseCorruptException -> L28
            r0.beginTransaction()     // Catch: java.lang.Throwable -> L19 android.database.sqlite.SQLiteDatabaseCorruptException -> L28
            java.lang.String r1 = "delete from __er"
            r0.execSQL(r1)     // Catch: java.lang.Throwable -> L19 android.database.sqlite.SQLiteDatabaseCorruptException -> L28
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L19 android.database.sqlite.SQLiteDatabaseCorruptException -> L28
            if (r0 == 0) goto L1e
            goto L1b
        L19:
            if (r0 == 0) goto L1e
        L1b:
            r0.endTransaction()     // Catch: java.lang.Throwable -> L1e
        L1e:
            android.content.Context r0 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r0 = com.umeng.analytics.pro.g.a(r0)
            r0.b()
            goto L30
        L28:
            android.content.Context r1 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L31
            com.umeng.analytics.pro.h.a(r1)     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L1e
            goto L1b
        L30:
            return
        L31:
            r1 = move-exception
            if (r0 == 0) goto L37
            r0.endTransaction()     // Catch: java.lang.Throwable -> L37
        L37:
            android.content.Context r0 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r0 = com.umeng.analytics.pro.g.a(r0)
            r0.b()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.i():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        if (r3 == null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004f, code lost:
    
        if (r3 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j() {
        /*
            r6 = this;
            java.lang.String r0 = "\""
            java.lang.String r1 = "delete from __et where __i=\""
            java.lang.String r2 = "delete from __er where __i=\""
            java.lang.String r3 = r6.k
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            r4 = 0
            if (r3 != 0) goto L77
            android.content.Context r3 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L4e android.database.sqlite.SQLiteDatabaseCorruptException -> L5e
            com.umeng.analytics.pro.g r3 = com.umeng.analytics.pro.g.a(r3)     // Catch: java.lang.Throwable -> L4e android.database.sqlite.SQLiteDatabaseCorruptException -> L5e
            android.database.sqlite.SQLiteDatabase r3 = r3.a()     // Catch: java.lang.Throwable -> L4e android.database.sqlite.SQLiteDatabaseCorruptException -> L5e
            r3.beginTransaction()     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            java.lang.String r2 = r6.k     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            java.lang.StringBuilder r2 = r5.append(r2)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            java.lang.StringBuilder r2 = r2.append(r0)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            r3.execSQL(r2)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            java.lang.String r1 = r6.k     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            java.lang.StringBuilder r1 = r2.append(r1)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            r3.execSQL(r0)     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            r3.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L4f android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            if (r3 == 0) goto L54
            goto L51
        L4e:
            r3 = r4
        L4f:
            if (r3 == 0) goto L54
        L51:
            r3.endTransaction()     // Catch: java.lang.Throwable -> L54
        L54:
            android.content.Context r0 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r0 = com.umeng.analytics.pro.g.a(r0)
            r0.b()
            goto L77
        L5e:
            r3 = r4
        L5f:
            android.content.Context r0 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L67
            com.umeng.analytics.pro.h.a(r0)     // Catch: java.lang.Throwable -> L67
            if (r3 == 0) goto L54
            goto L51
        L67:
            r0 = move-exception
            if (r3 == 0) goto L6d
            r3.endTransaction()     // Catch: java.lang.Throwable -> L6d
        L6d:
            android.content.Context r1 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r1 = com.umeng.analytics.pro.g.a(r1)
            r1.b()
            throw r0
        L77:
            r6.k = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.j():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0077, code lost:
    
        if (r3 == null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        if (r3 != null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(boolean r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.String r6 = "\""
            java.lang.String r0 = "delete from __sd where __ii=\""
            java.lang.String r1 = "delete from __et where __i=\""
            java.lang.String r2 = "delete from __er where __i=\""
            r3 = 0
            android.content.Context r4 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L63 android.database.sqlite.SQLiteDatabaseCorruptException -> L72
            com.umeng.analytics.pro.g r4 = com.umeng.analytics.pro.g.a(r4)     // Catch: java.lang.Throwable -> L63 android.database.sqlite.SQLiteDatabaseCorruptException -> L72
            android.database.sqlite.SQLiteDatabase r3 = r4.a()     // Catch: java.lang.Throwable -> L63 android.database.sqlite.SQLiteDatabaseCorruptException -> L72
            r3.beginTransaction()     // Catch: java.lang.Throwable -> L63 android.database.sqlite.SQLiteDatabaseCorruptException -> L72
            boolean r4 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L63 android.database.sqlite.SQLiteDatabaseCorruptException -> L72
            if (r4 != 0) goto L5d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L63 android.database.sqlite.SQLiteDatabaseCorruptException -> L72
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L63 android.database.sqlite.SQLiteDatabaseCorruptException -> L72
            java.lang.StringBuilder r2 = r4.append(r7)     // Catch: java.lang.Throwable -> L63 android.database.sqlite.SQLiteDatabaseCorruptException -> L72
            java.lang.StringBuilder r2 = r2.append(r6)     // Catch: java.lang.Throwable -> L63 android.database.sqlite.SQLiteDatabaseCorruptException -> L72
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L63 android.database.sqlite.SQLiteDatabaseCorruptException -> L72
            r3.execSQL(r2)     // Catch: java.lang.Throwable -> L63 android.database.sqlite.SQLiteDatabaseCorruptException -> L72
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L63 android.database.sqlite.SQLiteDatabaseCorruptException -> L72
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L63 android.database.sqlite.SQLiteDatabaseCorruptException -> L72
            java.lang.StringBuilder r1 = r2.append(r7)     // Catch: java.lang.Throwable -> L63 android.database.sqlite.SQLiteDatabaseCorruptException -> L72
            java.lang.StringBuilder r1 = r1.append(r6)     // Catch: java.lang.Throwable -> L63 android.database.sqlite.SQLiteDatabaseCorruptException -> L72
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L63 android.database.sqlite.SQLiteDatabaseCorruptException -> L72
            r3.execSQL(r1)     // Catch: java.lang.Throwable -> L63 android.database.sqlite.SQLiteDatabaseCorruptException -> L72
            java.util.List<java.lang.Integer> r1 = r5.j     // Catch: java.lang.Throwable -> L63 android.database.sqlite.SQLiteDatabaseCorruptException -> L72
            r1.clear()     // Catch: java.lang.Throwable -> L63 android.database.sqlite.SQLiteDatabaseCorruptException -> L72
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L63 android.database.sqlite.SQLiteDatabaseCorruptException -> L72
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L63 android.database.sqlite.SQLiteDatabaseCorruptException -> L72
            java.lang.StringBuilder r7 = r1.append(r7)     // Catch: java.lang.Throwable -> L63 android.database.sqlite.SQLiteDatabaseCorruptException -> L72
            java.lang.StringBuilder r6 = r7.append(r6)     // Catch: java.lang.Throwable -> L63 android.database.sqlite.SQLiteDatabaseCorruptException -> L72
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L63 android.database.sqlite.SQLiteDatabaseCorruptException -> L72
            r3.execSQL(r6)     // Catch: java.lang.Throwable -> L63 android.database.sqlite.SQLiteDatabaseCorruptException -> L72
        L5d:
            r3.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L63 android.database.sqlite.SQLiteDatabaseCorruptException -> L72
            if (r3 == 0) goto L68
            goto L65
        L63:
            if (r3 == 0) goto L68
        L65:
            r3.endTransaction()     // Catch: java.lang.Throwable -> L68
        L68:
            android.content.Context r6 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r6 = com.umeng.analytics.pro.g.a(r6)
            r6.b()
            goto L7a
        L72:
            android.content.Context r6 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L7b
            com.umeng.analytics.pro.h.a(r6)     // Catch: java.lang.Throwable -> L7b
            if (r3 == 0) goto L68
            goto L65
        L7a:
            return
        L7b:
            r6 = move-exception
            if (r3 == 0) goto L81
            r3.endTransaction()     // Catch: java.lang.Throwable -> L81
        L81:
            android.content.Context r7 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r7 = com.umeng.analytics.pro.g.a(r7)
            r7.b()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.a(boolean, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        if (r1 == null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
    
        if (r1 != null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r0 = "delete from __is where __ii=\""
            r1 = 0
            android.content.Context r2 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteDatabaseCorruptException -> L41
            com.umeng.analytics.pro.g r2 = com.umeng.analytics.pro.g.a(r2)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteDatabaseCorruptException -> L41
            android.database.sqlite.SQLiteDatabase r1 = r2.a()     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteDatabaseCorruptException -> L41
            r1.beginTransaction()     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteDatabaseCorruptException -> L41
            boolean r2 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteDatabaseCorruptException -> L41
            if (r2 != 0) goto L2c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteDatabaseCorruptException -> L41
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteDatabaseCorruptException -> L41
            java.lang.StringBuilder r4 = r2.append(r4)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteDatabaseCorruptException -> L41
            java.lang.String r0 = "\""
            java.lang.StringBuilder r4 = r4.append(r0)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteDatabaseCorruptException -> L41
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteDatabaseCorruptException -> L41
            r1.execSQL(r4)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteDatabaseCorruptException -> L41
        L2c:
            r1.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteDatabaseCorruptException -> L41
            if (r1 == 0) goto L37
            goto L34
        L32:
            if (r1 == 0) goto L37
        L34:
            r1.endTransaction()     // Catch: java.lang.Throwable -> L37
        L37:
            android.content.Context r4 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r4 = com.umeng.analytics.pro.g.a(r4)
            r4.b()
            goto L49
        L41:
            android.content.Context r4 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L4a
            com.umeng.analytics.pro.h.a(r4)     // Catch: java.lang.Throwable -> L4a
            if (r1 == 0) goto L37
            goto L34
        L49:
            return
        L4a:
            r4 = move-exception
            if (r1 == 0) goto L50
            r1.endTransaction()     // Catch: java.lang.Throwable -> L50
        L50:
            android.content.Context r0 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r0 = com.umeng.analytics.pro.g.a(r0)
            r0.b()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.b(java.lang.String):void");
    }

    private void l() {
        try {
            if (TextUtils.isEmpty(e)) {
                String multiProcessSP = UMUtils.getMultiProcessSP(d, g);
                if (TextUtils.isEmpty(multiProcessSP)) {
                    multiProcessSP = PreferenceWrapper.getDefault(d).getString(g, null);
                    if (TextUtils.isEmpty(multiProcessSP)) {
                        multiProcessSP = UMUtils.genId();
                    }
                    if (!TextUtils.isEmpty(multiProcessSP)) {
                        UMUtils.setMultiProcessSP(d, g, multiProcessSP);
                    }
                }
                if (!TextUtils.isEmpty(multiProcessSP)) {
                    String substring = multiProcessSP.substring(1, 9);
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < substring.length(); i++) {
                        char charAt = substring.charAt(i);
                        if (Character.isDigit(charAt)) {
                            if (Integer.parseInt(Character.toString(charAt)) == 0) {
                                sb.append(0);
                            } else {
                                sb.append(10 - Integer.parseInt(Character.toString(charAt)));
                            }
                        } else {
                            sb.append(charAt);
                        }
                    }
                    e = sb.toString();
                }
                if (TextUtils.isEmpty(e)) {
                    return;
                }
                e += new StringBuilder(e).reverse().toString();
                String multiProcessSP2 = UMUtils.getMultiProcessSP(d, h);
                if (TextUtils.isEmpty(multiProcessSP2)) {
                    UMUtils.setMultiProcessSP(d, h, c(f));
                } else {
                    if (f.equals(d(multiProcessSP2))) {
                        return;
                    }
                    b(true, false);
                    a(true, false);
                    h();
                    i();
                }
            }
        } catch (Throwable unused) {
        }
    }

    public String c(String str) {
        try {
            return TextUtils.isEmpty(e) ? str : Base64.encodeToString(DataHelper.encrypt(str.getBytes(), e.getBytes()), 0);
        } catch (Exception unused) {
            return null;
        }
    }

    public String d(String str) {
        try {
            return TextUtils.isEmpty(e) ? str : new String(DataHelper.decrypt(Base64.decode(str.getBytes(), 0), e.getBytes()));
        } catch (Exception unused) {
            if (Build.VERSION.SDK_INT >= 29 && !TextUtils.isEmpty(str)) {
                try {
                    new JSONObject(str);
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> UMStoreManager decrypt failed, return origin data.");
                    return str;
                } catch (Throwable unused2) {
                    return null;
                }
            }
            return null;
        }
    }
}
