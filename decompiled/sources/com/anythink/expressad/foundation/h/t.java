package com.anythink.expressad.foundation.h;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;
import java.util.UUID;

/* loaded from: classes12.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    static boolean f4936a = false;
    static String b = "";
    public static char[] c = {'P', 'a', 'c', 'k', 'a', 'g', 'e', 'M', 'a', 'n', 'a', 'g', 'e', 'r'};
    private static final String d = "common-exception";
    private static final String e = "SameSDCardTool";
    private static boolean f = false;
    private static int g = -1;
    private static int h = -1;
    private static int i = -1;
    private static int j = -1;
    private static String k;

    public static void a(Context context) {
        if (f) {
            return;
        }
        try {
            try {
                b = context.getFilesDir().getAbsolutePath() + File.separator;
                if (context.getPackageManager().checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", context.getPackageName()) == 0) {
                    f4936a = true;
                } else {
                    f4936a = false;
                }
                b(context);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            b = context.getFilesDir().getAbsolutePath() + File.separator;
            b(context);
        }
        f = true;
    }

    private static void b(Context context) {
        String c2 = c(context);
        k = c2;
        com.anythink.expressad.foundation.g.c.d.a(new com.anythink.expressad.foundation.g.c.b(c2));
        com.anythink.expressad.foundation.g.c.d.a().b();
    }

    public static String a() {
        return k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0060, code lost:
    
        if (e() > 31457280) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String c(android.content.Context r6) {
        /*
            r0 = 0
            java.io.File r1 = r6.getExternalFilesDir(r0)     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto Lc
            java.io.File r1 = a(r1)     // Catch: java.lang.Throwable -> Lc
            goto Ld
        Lc:
            r1 = r0
        Ld:
            boolean r2 = com.anythink.expressad.foundation.h.t.f4936a
            if (r2 == 0) goto L62
            if (r1 != 0) goto L57
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.io.File r2 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r2 = r2.getPath()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = java.io.File.separator
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "Android"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = java.io.File.separator
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "data"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = java.io.File.separator
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r6.getPackageName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.io.File r2 = new java.io.File
            r2.<init>(r1)
            java.io.File r1 = a(r2)
        L57:
            long r2 = e()
            r4 = 31457280(0x1e00000, double:1.55419614E-316)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L63
        L62:
            r0 = r1
        L63:
            if (r0 == 0) goto L6b
            boolean r1 = r0.exists()
            if (r1 != 0) goto L73
        L6b:
            java.io.File r6 = r6.getFilesDir()
            java.io.File r0 = r6.getAbsoluteFile()
        L73:
            java.lang.String r6 = r0.getAbsolutePath()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.foundation.h.t.c(android.content.Context):java.lang.String");
    }

    private static File a(File file) {
        File file2 = new File(file, new StringBuilder().append(UUID.randomUUID()).toString());
        if (file2.exists()) {
            file2.delete();
        }
        if (!file2.mkdirs()) {
            return null;
        }
        file2.delete();
        return file.getAbsoluteFile();
    }

    private static boolean c() {
        return f4936a;
    }

    public static boolean b() {
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Exception unused) {
            return false;
        }
    }

    private static int d() {
        try {
            Context e2 = com.anythink.expressad.foundation.b.a.c().e();
            long longValue = ((Long) x.b(e2, "freeExternalSize", 0L)).longValue();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - longValue > 1800000 || h == -1) {
                h = Long.valueOf((e() / 1000) / 1000).intValue();
                x.a(e2, "freeExternalSize", Long.valueOf(currentTimeMillis));
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        return h;
    }

    private static long e() {
        if (b()) {
            try {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                return statFs.getAvailableBlocks() * statFs.getBlockSize();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return 0L;
    }

    private static long d(Context context) {
        try {
            String absolutePath = context.getFilesDir().getAbsolutePath();
            new StatFs(absolutePath).restat(absolutePath);
            return r0.getAvailableBlocks() * r0.getBlockSize();
        } catch (Exception unused) {
            return 0L;
        }
    }

    private static boolean f() {
        return e() > 31457280;
    }

    public static boolean a(long j2) {
        return e() > j2;
    }

    private static int g() {
        if (g == -1) {
            try {
                g = new Long((h() / 1000) / 1000).intValue();
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return g;
    }

    private static long h() {
        if (b()) {
            try {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                return statFs.getBlockCount() * statFs.getBlockSize();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return 0L;
    }

    private static int i() {
        try {
            Context e2 = com.anythink.expressad.foundation.b.a.c().e();
            long longValue = ((Long) x.b(e2, "TotalDataSize", 0L)).longValue();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - longValue > 1800000 || i == -1) {
                StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                i = Long.valueOf(((statFs.getBlockCount() * statFs.getBlockSize()) / 1000) / 1000).intValue();
                x.a(e2, "TotalDataSize", Long.valueOf(currentTimeMillis));
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        return i;
    }

    private static int j() {
        try {
            Context e2 = com.anythink.expressad.foundation.b.a.c().e();
            long longValue = ((Long) x.b(e2, "FreeDataSize", 0L)).longValue();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - longValue > 1800000 || j == -1) {
                StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                j = Long.valueOf(((statFs.getAvailableBlocks() * statFs.getBlockSize()) / 1000) / 1000).intValue();
                x.a(e2, "FreeDataSize", Long.valueOf(currentTimeMillis));
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        return j;
    }

    private static long k() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getAvailableBlocks() * statFs.getBlockSize();
    }

    private static long l() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getBlockCount() * statFs.getBlockSize();
    }
}
