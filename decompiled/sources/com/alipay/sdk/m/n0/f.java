package com.alipay.sdk.m.n0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Log;

/* loaded from: classes11.dex */
public class f {
    public static volatile f g = null;
    public static boolean h = false;
    public BroadcastReceiver f;

    /* renamed from: a, reason: collision with root package name */
    public a f1423a = new a("udid");
    public a b = new a("oaid");
    public a d = new a("vaid");
    public a c = new a("aaid");
    public c e = new c();

    public static d a(Cursor cursor) {
        d dVar = new d(null, 0);
        if (cursor == null) {
            a("parseValue fail, cursor is null.");
            return dVar;
        }
        if (cursor.isClosed()) {
            a("parseValue fail, cursor is closed.");
            return dVar;
        }
        cursor.moveToFirst();
        int columnIndex = cursor.getColumnIndex("value");
        if (columnIndex >= 0) {
            dVar.f1422a = cursor.getString(columnIndex);
        } else {
            a("parseValue fail, index < 0.");
        }
        int columnIndex2 = cursor.getColumnIndex("code");
        if (columnIndex2 >= 0) {
            dVar.b = cursor.getInt(columnIndex2);
        } else {
            a("parseCode fail, index < 0.");
        }
        int columnIndex3 = cursor.getColumnIndex("expired");
        if (columnIndex3 >= 0) {
            dVar.c = cursor.getLong(columnIndex3);
            return dVar;
        }
        a("parseExpired fail, index < 0.");
        return dVar;
    }

    public static final f a() {
        if (g == null) {
            synchronized (f.class) {
                if (g == null) {
                    g = new f();
                }
            }
        }
        return g;
    }

    public static String a(PackageManager packageManager, String str) {
        ProviderInfo resolveContentProvider;
        if (packageManager == null || (resolveContentProvider = packageManager.resolveContentProvider(str, 0)) == null || (resolveContentProvider.applicationInfo.flags & 1) == 0) {
            return null;
        }
        return resolveContentProvider.packageName;
    }

    public static void a(String str) {
        if (h) {
            Log.d("OpenIdManager", str);
        }
    }

    public static void a(boolean z) {
        h = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r8 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
    
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if (r8 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        if ("0".equals(r0.f1422a) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(android.content.Context r9) {
        /*
            java.lang.String r0 = "querySupport version : 1.0.8"
            a(r0)
            java.lang.String r0 = "content://com.meizu.flyme.openidsdk/"
            android.net.Uri r2 = android.net.Uri.parse(r0)
            r7 = 0
            r8 = 0
            android.content.ContentResolver r1 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40
            r9 = 1
            java.lang.String[] r5 = new java.lang.String[r9]     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40
            java.lang.String r0 = "supported"
            r5[r7] = r0     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40
            r6 = 0
            r3 = 0
            r4 = 0
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40
            if (r8 == 0) goto L3a
            com.alipay.sdk.m.n0.d r0 = a(r8)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40
            int r1 = r0.b     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40
            r2 = 1000(0x3e8, float:1.401E-42)
            if (r2 != r1) goto L35
            java.lang.String r1 = "0"
            java.lang.String r0 = r0.f1422a     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40
            if (r0 == 0) goto L36
        L35:
            r7 = r9
        L36:
            r8.close()
            return r7
        L3a:
            if (r8 == 0) goto L5d
            goto L5a
        L3d:
            r0 = move-exception
            r9 = r0
            goto L5e
        L40:
            r0 = move-exception
            r9 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3d
            java.lang.String r1 = "querySupport, Exception : "
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r9 = r9.getMessage()     // Catch: java.lang.Throwable -> L3d
            java.lang.StringBuilder r9 = r0.append(r9)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L3d
            a(r9)     // Catch: java.lang.Throwable -> L3d
            if (r8 == 0) goto L5d
        L5a:
            r8.close()
        L5d:
            return r7
        L5e:
            if (r8 == 0) goto L63
            r8.close()
        L63:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.m.n0.f.a(android.content.Context):boolean");
    }

    public static String b(PackageManager packageManager, String str) {
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            if (packageInfo != null) {
                return packageInfo.versionName;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            a("getAppVersion, Exception : " + e.getMessage());
            return null;
        }
    }

    public final String a(Context context, a aVar) {
        String str;
        if (aVar == null) {
            str = "getId, openId = null.";
        } else {
            if (aVar.a()) {
                return aVar.b;
            }
            if (a(context, true)) {
                return b(context, aVar);
            }
            str = "getId, isSupported = false.";
        }
        a(str);
        return null;
    }

    public final boolean a(Context context, boolean z) {
        if (this.e.a() && !z) {
            return this.e.b();
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        String a2 = a(packageManager, "com.meizu.flyme.openidsdk");
        if (TextUtils.isEmpty(a2)) {
            return false;
        }
        String b = b(packageManager, a2);
        if (this.e.a() && this.e.a(b)) {
            a("use same version cache, safeVersion : ".concat(String.valueOf(b)));
            return this.e.b();
        }
        this.e.b(b);
        boolean a3 = a(context);
        a("query support, result : ".concat(String.valueOf(a3)));
        this.e.a(a3);
        return a3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0096 A[RETURN] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String b(android.content.Context r10, com.alipay.sdk.m.n0.a r11) {
        /*
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "queryId : "
            r0.<init>(r1)
            java.lang.String r1 = r11.c
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            a(r0)
            java.lang.String r0 = "content://com.meizu.flyme.openidsdk/"
            android.net.Uri r2 = android.net.Uri.parse(r0)
            r7 = 0
            android.content.ContentResolver r1 = r10.getContentResolver()     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La3
            r0 = 1
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La3
            java.lang.String r3 = r11.c     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La3
            r8 = 0
            r5[r8] = r3     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La3
            r6 = 0
            r3 = 0
            r4 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La3
            if (r1 == 0) goto L7f
            com.alipay.sdk.m.n0.d r2 = a(r1)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L9b
            java.lang.String r7 = r2.f1422a     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L9b
            r11.a(r7)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L9b
            long r3 = r2.c     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L9b
            r11.a(r3)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L9b
            int r3 = r2.b     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L9b
            r11.a(r3)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L9b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L9b
            r3.<init>()     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L9b
            java.lang.String r4 = r11.c     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L9b
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L9b
            java.lang.String r4 = " errorCode : "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L9b
            int r11 = r11.d     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L9b
            java.lang.StringBuilder r11 = r3.append(r11)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L9b
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L9b
            a(r11)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L9b
            int r11 = r2.b     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L9b
            r2 = 1000(0x3e8, float:1.401E-42)
            if (r11 == r2) goto L93
            r9.b(r10)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L9b
            boolean r11 = r9.a(r10, r8)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L9b
            if (r11 != 0) goto L93
            boolean r10 = r9.a(r10, r0)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L9b
            java.lang.String r11 = "not support, forceQuery isSupported: "
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L9b
        L7a:
            java.lang.String r10 = r11.concat(r10)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L9b
            goto L90
        L7f:
            boolean r11 = r9.a(r10, r8)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L9b
            if (r11 == 0) goto L93
            boolean r10 = r9.a(r10, r0)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L9b
            java.lang.String r11 = "forceQuery isSupported : "
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L9b
            goto L7a
        L90:
            a(r10)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L9b
        L93:
            if (r1 == 0) goto L96
            goto Lc0
        L96:
            return r7
        L97:
            r0 = move-exception
            r10 = r0
            r7 = r1
            goto Lc5
        L9b:
            r0 = move-exception
            r10 = r0
            r11 = r7
            r7 = r1
            goto La6
        La0:
            r0 = move-exception
            r10 = r0
            goto Lc5
        La3:
            r0 = move-exception
            r10 = r0
            r11 = r7
        La6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La0
            java.lang.String r1 = "queryId, Exception : "
            r0.<init>(r1)     // Catch: java.lang.Throwable -> La0
            java.lang.String r10 = r10.getMessage()     // Catch: java.lang.Throwable -> La0
            java.lang.StringBuilder r10 = r0.append(r10)     // Catch: java.lang.Throwable -> La0
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> La0
            a(r10)     // Catch: java.lang.Throwable -> La0
            if (r7 == 0) goto Lc4
            r1 = r7
            r7 = r11
        Lc0:
            r1.close()
            r11 = r7
        Lc4:
            return r11
        Lc5:
            if (r7 == 0) goto Lca
            r7.close()
        Lca:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.m.n0.f.b(android.content.Context, com.alipay.sdk.m.n0.a):java.lang.String");
    }

    public final synchronized void b(Context context) {
        if (this.f != null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.meizu.flyme.openid.ACTION_OPEN_ID_CHANGE");
        e eVar = new e();
        this.f = eVar;
        context.registerReceiver(eVar, intentFilter, "com.meizu.flyme.openid.permission.OPEN_ID_CHANGE", null);
    }
}
