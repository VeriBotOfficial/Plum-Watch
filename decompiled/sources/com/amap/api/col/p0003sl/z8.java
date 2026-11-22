package com.amap.api.col.p0003sl;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.umeng.analytics.pro.ao;
import java.io.File;
import java.io.FileOutputStream;
import java.security.MessageDigest;
import java.util.Locale;

/* compiled from: AppInfo.java */
/* loaded from: classes11.dex */
public class z8 {

    /* renamed from: a, reason: collision with root package name */
    private static String f1997a = "";
    private static String b = "";
    private static String c = "";
    private static String d = "";
    static String e = null;
    static boolean f = false;
    private static int g = 0;
    private static boolean h = false;

    /* compiled from: AppInfo.java */
    static class a extends qc {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f1998a;
        final /* synthetic */ String b;

        a(Context context, String str) {
            this.f1998a = context;
            this.b = str;
        }

        @Override // com.amap.api.col.p0003sl.qc
        public final void runTask() {
            Throwable th;
            FileOutputStream fileOutputStream;
            try {
                File file = new File(ga.a(this.f1998a, "k.store"));
                if (!file.getParentFile().exists()) {
                    file.getParentFile().mkdirs();
                }
                fileOutputStream = new FileOutputStream(file);
                try {
                    fileOutputStream.write(m9.e(this.b));
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        fa.a(th, "AI", ao.c);
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th4) {
                                th4.printStackTrace();
                            }
                        }
                    } catch (Throwable th5) {
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th6) {
                                th6.printStackTrace();
                            }
                        }
                        throw th5;
                    }
                }
            } catch (Throwable th7) {
                th = th7;
                fileOutputStream = null;
            }
        }
    }

    static boolean a() {
        if (f) {
            return true;
        }
        if (b(e)) {
            f = true;
            return true;
        }
        if (!TextUtils.isEmpty(e)) {
            f = false;
            e = null;
            return false;
        }
        if (b(b)) {
            f = true;
            return true;
        }
        if (!TextUtils.isEmpty(b)) {
            f = false;
            b = null;
            return false;
        }
        return true;
    }

    private static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        str.toCharArray();
        for (char c2 : str.toCharArray()) {
            if (('A' > c2 || c2 > 'z') && (('0' > c2 || c2 > ':') && c2 != '.')) {
                try {
                    ja.a(m9.b(), str, "errorPackage");
                } catch (Throwable unused) {
                }
                return false;
            }
        }
        return true;
    }

    public static void c(String str) {
        b = str;
    }

    public static String d(Context context) {
        try {
            return a(context);
        } catch (Throwable th) {
            th.printStackTrace();
            return d;
        }
    }

    public static String e(Context context) {
        try {
            int i = a9.f1515a;
            if (context != null) {
                a9.c = context.getApplicationContext();
            }
        } catch (Throwable unused) {
        }
        try {
            return a(context);
        } catch (Throwable th) {
            fa.a(th, "AI", "gKy");
            return d;
        }
    }

    public static String f(Context context) {
        String str;
        try {
            str = b;
        } catch (Throwable th) {
            fa.a(th, "AI", "gpck");
        }
        if (str != null && !"".equals(str)) {
            return b;
        }
        String packageName = context.getPackageName();
        b = packageName;
        if (!b(packageName)) {
            b = context.getPackageName();
        }
        return b;
    }

    public static String g(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
            byte[] digest = MessageDigest.getInstance(m9.b("IU0hBMQ")).digest(packageInfo.signatures[0].toByteArray());
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b2 : digest) {
                String upperCase = Integer.toHexString(b2 & 255).toUpperCase(Locale.US);
                if (upperCase.length() == 1) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(upperCase);
                stringBuffer.append(":");
            }
            String str = packageInfo.packageName;
            if (b(str)) {
                str = packageInfo.packageName;
            }
            if (!TextUtils.isEmpty(b)) {
                str = f(context);
            }
            stringBuffer.append(str);
            String stringBuffer2 = stringBuffer.toString();
            e = stringBuffer2;
            return stringBuffer2;
        } catch (Throwable th) {
            fa.a(th, "AI", "gsp");
            return e;
        }
    }

    public static String c(Context context) {
        try {
        } catch (Throwable th) {
            fa.a(th, "AI", "gAV");
        }
        if (!"".equals(c)) {
            return c;
        }
        c = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        String str = c;
        return str == null ? "" : str;
    }

    public static String b(Context context) {
        try {
        } catch (Throwable th) {
            fa.a(th, "AI", "gAN");
        }
        if (!"".equals(f1997a)) {
            return f1997a;
        }
        PackageManager packageManager = context.getPackageManager();
        f1997a = (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 0));
        return f1997a;
    }

    public static boolean c() {
        return h;
    }

    static void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        d = str;
    }

    public static int b() {
        return g;
    }

    static void a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        d = str;
        if (context != null) {
            pc.d().b(new a(context, str));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String a(android.content.Context r5) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            java.lang.String r0 = com.amap.api.col.p0003sl.z8.d
            java.lang.String r1 = ""
            if (r0 == 0) goto Lc
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L95
        Lc:
            android.content.pm.PackageManager r0 = r5.getPackageManager()
            java.lang.String r2 = r5.getPackageName()
            r3 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r2, r3)
            if (r0 == 0) goto L98
            android.os.Bundle r0 = r0.metaData
            if (r0 != 0) goto L22
            goto L98
        L22:
            java.lang.String r2 = "com.amap.api.v2.apikey"
            java.lang.String r0 = r0.getString(r2)
            com.amap.api.col.p0003sl.z8.d = r0
            if (r0 != 0) goto L95
            java.lang.String r0 = "k.store"
            java.lang.String r5 = com.amap.api.col.p0003sl.ga.a(r5, r0)
            java.io.File r0 = new java.io.File
            r0.<init>(r5)
            boolean r5 = r0.exists()
            if (r5 != 0) goto L3e
            goto L86
        L3e:
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L64
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L64
            int r2 = r5.available()     // Catch: java.lang.Throwable -> L62
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L62
            r5.read(r2)     // Catch: java.lang.Throwable -> L62
            java.lang.String r2 = com.amap.api.col.p0003sl.m9.c(r2)     // Catch: java.lang.Throwable -> L62
            int r0 = r2.length()     // Catch: java.lang.Throwable -> L62
            r3 = 32
            if (r0 != r3) goto L59
            r1 = r2
        L59:
            r5.close()     // Catch: java.lang.Throwable -> L5d
            goto L86
        L5d:
            r5 = move-exception
            r5.printStackTrace()
            goto L86
        L62:
            r2 = move-exception
            goto L67
        L64:
            r5 = move-exception
            r2 = r5
            r5 = 0
        L67:
            java.lang.String r3 = "AI"
            java.lang.String r4 = "gKe"
            com.amap.api.col.p0003sl.fa.a(r2, r3, r4)     // Catch: java.lang.Throwable -> L89
            boolean r2 = r0.exists()     // Catch: java.lang.Throwable -> L78
            if (r2 == 0) goto L7c
            r0.delete()     // Catch: java.lang.Throwable -> L78
            goto L7c
        L78:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L89
        L7c:
            if (r5 == 0) goto L86
            r5.close()     // Catch: java.lang.Throwable -> L82
            goto L86
        L82:
            r5 = move-exception
            r5.printStackTrace()
        L86:
            com.amap.api.col.p0003sl.z8.d = r1
            goto L95
        L89:
            r0 = move-exception
            if (r5 == 0) goto L94
            r5.close()     // Catch: java.lang.Throwable -> L90
            goto L94
        L90:
            r5 = move-exception
            r5.printStackTrace()
        L94:
            throw r0
        L95:
            java.lang.String r5 = com.amap.api.col.p0003sl.z8.d
            return r5
        L98:
            java.lang.String r5 = com.amap.api.col.p0003sl.z8.d
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.col.p0003sl.z8.a(android.content.Context):java.lang.String");
    }

    public static void a(int i) {
        g = i;
    }

    public static void a(boolean z) {
        h = z;
    }
}
