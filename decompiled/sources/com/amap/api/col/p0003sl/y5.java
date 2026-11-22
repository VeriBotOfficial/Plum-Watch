package com.amap.api.col.p0003sl;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: ServiceUtils.java */
/* loaded from: classes11.dex */
public class y5 {

    /* renamed from: a, reason: collision with root package name */
    private static AssetManager f1984a = null;
    private static Resources b = null;
    private static Context c = null;
    private static String e = "amap_resource1_0_0.png";
    private static String f = "";
    private static String d = "amap_resource1_0_0.jar";
    private static String g = f + d;
    public static int h = -1;

    /* compiled from: ServiceUtils.java */
    static class a implements FilenameFilter {
        a() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            int i = y5.h;
            return str.startsWith("amap_resource") && !str.endsWith("1_0_0.jar");
        }
    }

    public static Resources a() {
        Resources resources = b;
        return resources == null ? c.getResources() : resources;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0034, code lost:
    
        r9.getFilesDir();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0032, code lost:
    
        if (r2 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0007, code lost:
    
        if (r9 != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0083 A[Catch: all -> 0x00d6, TRY_LEAVE, TryCatch #2 {all -> 0x00d6, blocks: (B:3:0x0001, B:9:0x004b, B:10:0x0064, B:14:0x0083, B:20:0x00b5, B:24:0x00ae, B:28:0x0034, B:44:0x0045, B:48:0x00d2, B:49:0x00d5), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d2 A[Catch: all -> 0x00d6, TryCatch #2 {all -> 0x00d6, blocks: (B:3:0x0001, B:9:0x004b, B:10:0x0064, B:14:0x0083, B:20:0x00b5, B:24:0x00ae, B:28:0x0034, B:44:0x0045, B:48:0x00d2, B:49:0x00d5), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004b A[Catch: all -> 0x00d6, TryCatch #2 {all -> 0x00d6, blocks: (B:3:0x0001, B:9:0x004b, B:10:0x0064, B:14:0x0083, B:20:0x00b5, B:24:0x00ae, B:28:0x0034, B:44:0x0045, B:48:0x00d2, B:49:0x00d5), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(android.content.Context r9) {
        /*
            r0 = 1
            com.amap.api.col.p0003sl.y5.c = r9     // Catch: java.lang.Throwable -> Ld6
            r1 = 0
            if (r9 != 0) goto La
            r2 = r1
            if (r9 == 0) goto L49
            goto L34
        La:
            java.lang.String r2 = android.os.Environment.getExternalStorageState()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3e
            java.lang.String r3 = "mounted"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3e
            if (r2 == 0) goto L2e
            java.io.File r2 = android.os.Environment.getExternalStorageDirectory()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3e
            boolean r3 = r2.canWrite()     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> Lcf
            if (r3 != 0) goto L25
            java.io.File r2 = r9.getFilesDir()     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> Lcf
            goto L32
        L25:
            java.lang.String r3 = "LBS"
            java.io.File r2 = r9.getExternalFilesDir(r3)     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> Lcf
            goto L32
        L2c:
            r3 = move-exception
            goto L40
        L2e:
            java.io.File r2 = r9.getFilesDir()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3e
        L32:
            if (r2 != 0) goto L49
        L34:
            r9.getFilesDir()     // Catch: java.lang.Throwable -> Ld6
            goto L49
        L38:
            r2 = move-exception
            r8 = r2
            r2 = r1
            r1 = r8
            goto Ld0
        L3e:
            r3 = move-exception
            r2 = r1
        L40:
            r3.printStackTrace()     // Catch: java.lang.Throwable -> Lcf
            if (r2 != 0) goto L49
            java.io.File r2 = r9.getFilesDir()     // Catch: java.lang.Throwable -> Ld6
        L49:
            if (r2 == 0) goto L64
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld6
            r3.<init>()     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r2 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> Ld6
            java.lang.StringBuilder r2 = r3.append(r2)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r3 = "/"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Ld6
            com.amap.api.col.p0003sl.y5.f = r2     // Catch: java.lang.Throwable -> Ld6
        L64:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld6
            r2.<init>()     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r3 = com.amap.api.col.p0003sl.y5.f     // Catch: java.lang.Throwable -> Ld6
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r3 = com.amap.api.col.p0003sl.y5.d     // Catch: java.lang.Throwable -> Ld6
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Ld6
            com.amap.api.col.p0003sl.y5.g = r2     // Catch: java.lang.Throwable -> Ld6
            boolean r2 = a(r9)     // Catch: java.lang.Throwable -> Ld6
            r3 = 0
            if (r2 != 0) goto L83
            return r3
        L83:
            java.lang.String r2 = com.amap.api.col.p0003sl.y5.g     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r4 = "android.content.res.AssetManager"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.Throwable -> Lab
            java.lang.reflect.Constructor r5 = r4.getConstructor(r1)     // Catch: java.lang.Throwable -> Lab
            java.lang.Object r5 = r5.newInstance(r1)     // Catch: java.lang.Throwable -> Lab
            android.content.res.AssetManager r5 = (android.content.res.AssetManager) r5     // Catch: java.lang.Throwable -> Lab
            java.lang.String r1 = "addAssetPath"
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> La9
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r6[r3] = r7     // Catch: java.lang.Throwable -> La9
            java.lang.reflect.Method r1 = r4.getDeclaredMethod(r1, r6)     // Catch: java.lang.Throwable -> La9
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Throwable -> La9
            r1.invoke(r5, r2)     // Catch: java.lang.Throwable -> La9
            goto Lb5
        La9:
            r1 = move-exception
            goto Lae
        Lab:
            r2 = move-exception
            r5 = r1
            r1 = r2
        Lae:
            java.lang.String r2 = "ResourcesUtil"
            java.lang.String r3 = "getAssetManager(String apkPath)"
            com.amap.api.col.p0003sl.ja.a(r1, r2, r3)     // Catch: java.lang.Throwable -> Ld6
        Lb5:
            com.amap.api.col.p0003sl.y5.f1984a = r5     // Catch: java.lang.Throwable -> Ld6
            android.util.DisplayMetrics r1 = new android.util.DisplayMetrics     // Catch: java.lang.Throwable -> Ld6
            r1.<init>()     // Catch: java.lang.Throwable -> Ld6
            r1.setToDefaults()     // Catch: java.lang.Throwable -> Ld6
            android.content.res.Resources r9 = r9.getResources()     // Catch: java.lang.Throwable -> Ld6
            android.content.res.Configuration r9 = r9.getConfiguration()     // Catch: java.lang.Throwable -> Ld6
            android.content.res.Resources r2 = new android.content.res.Resources     // Catch: java.lang.Throwable -> Ld6
            r2.<init>(r5, r1, r9)     // Catch: java.lang.Throwable -> Ld6
            com.amap.api.col.p0003sl.y5.b = r2     // Catch: java.lang.Throwable -> Ld6
            goto Lda
        Lcf:
            r1 = move-exception
        Ld0:
            if (r2 != 0) goto Ld5
            r9.getFilesDir()     // Catch: java.lang.Throwable -> Ld6
        Ld5:
            throw r1     // Catch: java.lang.Throwable -> Ld6
        Ld6:
            r9 = move-exception
            r9.printStackTrace()
        Lda:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.col.p0003sl.y5.b(android.content.Context):boolean");
    }

    private static boolean a(Context context) {
        f = context.getFilesDir().getAbsolutePath();
        g = f + "/" + d;
        InputStream inputStream = null;
        try {
            InputStream d2 = m4.d(context, e);
            File file = new File(g);
            long length = file.length();
            int available = d2.available();
            if (file.exists() && length == available) {
                d2.close();
                try {
                    d2.close();
                    return true;
                } catch (IOException e2) {
                    e2.printStackTrace();
                    ja.a(e2, "ResourcesUtil", "copyResourceJarToAppFilesDir(Context ctx)");
                    return true;
                }
            }
            File[] listFiles = new File(f).listFiles(new a());
            if (listFiles != null && listFiles.length > 0) {
                for (File file2 : listFiles) {
                    file2.delete();
                }
            }
            FileOutputStream fileOutputStream = new FileOutputStream(new File(f, d));
            byte[] bArr = new byte[1024];
            while (true) {
                int read = d2.read(bArr);
                if (read > 0) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    try {
                        break;
                    } catch (IOException e3) {
                        e3.printStackTrace();
                        ja.a(e3, "ResourcesUtil", "copyResourceJarToAppFilesDir(Context ctx)");
                    }
                }
            }
            d2.close();
            fileOutputStream.close();
            return true;
        } catch (Throwable th) {
            try {
                th.printStackTrace();
                ja.a(th, "ResourcesUtil", "copyResourceJarToAppFilesDir(Context ctx)");
                return false;
            } finally {
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                        ja.a(e4, "ResourcesUtil", "copyResourceJarToAppFilesDir(Context ctx)");
                    }
                }
            }
        }
    }

    public static View a(Context context, int i, ViewGroup viewGroup) {
        XmlResourceParser xml = a().getXml(i);
        View view = null;
        try {
            int i2 = h;
            if (i2 == -1) {
                i2 = 0;
            }
            view = LayoutInflater.from(new x5(context, i2, y5.class.getClassLoader())).inflate(xml, (ViewGroup) null);
        } finally {
            try {
                return view;
            } finally {
            }
        }
        return view;
    }
}
