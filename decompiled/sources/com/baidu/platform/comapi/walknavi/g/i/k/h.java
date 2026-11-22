package com.baidu.platform.comapi.walknavi.g.i.k;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import com.autonavi.aps.amapapi.config.Const;
import com.baidu.ar.util.SystemInfoUtil;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Pattern;

/* compiled from: SystemInfoUtil.java */
/* loaded from: classes13.dex */
public class h {

    /* compiled from: SystemInfoUtil.java */
    class a implements FileFilter {
        a() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return Pattern.matches("cpu[0-9]", file.getName());
        }
    }

    public static long a(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(Const.STR_PROCESS_TAG);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.availMem / 1048576;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
    
        if (r1 == null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long b(android.content.Context r9) {
        /*
            java.lang.String r9 = "/proc/meminfo"
            r0 = 0
            java.io.FileReader r1 = new java.io.FileReader     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L64
            r1.<init>(r9)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L64
            java.io.BufferedReader r9 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L65
            r2 = 8192(0x2000, float:1.148E-41)
            r9.<init>(r1, r2)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L65
            java.lang.String r0 = r9.readLine()     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L53
            java.lang.String r2 = "\\s+"
            java.lang.String[] r2 = r0.split(r2)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L53
            int r3 = r2.length     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L53
            r4 = 0
        L1b:
            if (r4 >= r3) goto L42
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L53
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L53
            r6.<init>()     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L53
            java.lang.StringBuilder r6 = r6.append(r0)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L53
            java.lang.String r7 = ", "
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L53
            java.lang.StringBuilder r5 = r6.append(r5)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L53
            java.lang.String r6 = "\t"
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L53
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L53
            com.baidu.platform.comapi.walknavi.g.i.k.a.a(r5)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L53
            int r4 = r4 + 1
            goto L1b
        L42:
            r0 = 1
            r0 = r2[r0]     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L53
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L53
            long r2 = (long) r0
            r9.close()     // Catch: java.io.IOException -> L6e
            goto L6e
        L4e:
            r0 = move-exception
            r8 = r0
            r0 = r9
            r9 = r8
            goto L59
        L53:
            r0 = r9
            goto L65
        L55:
            r9 = move-exception
            goto L59
        L57:
            r9 = move-exception
            r1 = r0
        L59:
            if (r0 == 0) goto L5e
            r0.close()     // Catch: java.io.IOException -> L5e
        L5e:
            if (r1 == 0) goto L63
            r1.close()     // Catch: java.io.IOException -> L63
        L63:
            throw r9
        L64:
            r1 = r0
        L65:
            if (r0 == 0) goto L6a
            r0.close()     // Catch: java.io.IOException -> L6a
        L6a:
            r2 = 0
            if (r1 == 0) goto L71
        L6e:
            r1.close()     // Catch: java.io.IOException -> L71
        L71:
            r0 = 1024(0x400, double:5.06E-321)
            long r2 = r2 / r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.platform.comapi.walknavi.g.i.k.h.b(android.content.Context):long");
    }

    public static String c() {
        String str;
        try {
            InputStream inputStream = new ProcessBuilder("/system/bin/cat", "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq").start().getInputStream();
            byte[] bArr = new byte[24];
            String str2 = "";
            while (inputStream.read(bArr) != -1) {
                str2 = str2 + new String(bArr);
            }
            inputStream.close();
            str = String.valueOf(Integer.parseInt(str2.trim()) / 1000);
        } catch (Exception unused) {
            str = SystemInfoUtil.NA;
        }
        return String.valueOf(str);
    }

    public static String d() {
        String str;
        try {
            InputStream inputStream = new ProcessBuilder("/system/bin/cat", "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq").start().getInputStream();
            byte[] bArr = new byte[24];
            String str2 = "";
            while (inputStream.read(bArr) != -1) {
                str2 = str2 + new String(bArr);
            }
            inputStream.close();
            str = String.valueOf(Integer.parseInt(str2.trim()) / 1000);
        } catch (Exception unused) {
            str = SystemInfoUtil.NA;
        }
        return str.trim();
    }

    public static int e() {
        try {
            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new a());
            com.baidu.platform.comapi.walknavi.g.i.k.a.a("CPU Count: " + listFiles.length);
            return listFiles.length;
        } catch (Exception unused) {
            com.baidu.platform.comapi.walknavi.g.i.k.a.a("CPU Count: Failed.");
            return 1;
        }
    }

    public static long[] g() {
        long[] jArr = new long[2];
        if ("mounted".equals(Environment.getExternalStorageState())) {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            long blockSize = statFs.getBlockSize();
            long blockCount = statFs.getBlockCount();
            long availableBlocks = statFs.getAvailableBlocks();
            jArr[0] = (blockCount * blockSize) / 1048576;
            jArr[1] = (blockSize * availableBlocks) / 1048576;
        }
        return jArr;
    }

    public static long[] f() {
        long blockSize = new StatFs(Environment.getDataDirectory().getPath()).getBlockSize();
        return new long[]{(r1.getBlockCount() * blockSize) / 1048576, (blockSize * r1.getAvailableBlocks()) / 1048576};
    }

    public static String a() {
        Throwable th;
        FileReader fileReader;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            fileReader = new FileReader("/proc/cpuinfo");
            try {
                bufferedReader = new BufferedReader(fileReader);
            } catch (Exception unused) {
                bufferedReader = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception unused2) {
            fileReader = null;
            bufferedReader = null;
        } catch (Throwable th3) {
            th = th3;
            fileReader = null;
        }
        try {
            String[] split = bufferedReader.readLine().split(":\\s+", 2);
            for (int i = 0; i < split.length; i++) {
            }
            String str = split[1];
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
            try {
                fileReader.close();
            } catch (IOException unused4) {
            }
            return str;
        } catch (Exception unused5) {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException unused6) {
                }
            }
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException unused7) {
                }
            }
            return null;
        } catch (Throwable th4) {
            th = th4;
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (IOException unused8) {
                }
            }
            if (fileReader != null) {
                try {
                    fileReader.close();
                    throw th;
                } catch (IOException unused9) {
                    throw th;
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0043, code lost:
    
        if (r2 == null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b() {
        /*
            java.lang.String r0 = "N/A"
            r1 = 0
            java.io.FileReader r2 = new java.io.FileReader     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L3d
            java.lang.String r3 = "/sys/devices/system/cpu/cpu0/cpufreq/scaling_cur_freq"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L3d
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L3e
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L3e
            java.lang.String r1 = r3.readLine()     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2c
            java.lang.String r0 = r1.trim()     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2c
            java.lang.String r1 = r0.trim()     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2c
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2c
            int r1 = r1 / 1000
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2c
            r3.close()     // Catch: java.io.IOException -> L45
            goto L45
        L29:
            r0 = move-exception
            r1 = r3
            goto L32
        L2c:
            r1 = r3
            goto L3e
        L2e:
            r0 = move-exception
            goto L32
        L30:
            r0 = move-exception
            r2 = r1
        L32:
            if (r1 == 0) goto L37
            r1.close()     // Catch: java.io.IOException -> L37
        L37:
            if (r2 == 0) goto L3c
            r2.close()     // Catch: java.io.IOException -> L3c
        L3c:
            throw r0
        L3d:
            r2 = r1
        L3e:
            if (r1 == 0) goto L43
            r1.close()     // Catch: java.io.IOException -> L43
        L43:
            if (r2 == 0) goto L48
        L45:
            r2.close()     // Catch: java.io.IOException -> L48
        L48:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.platform.comapi.walknavi.g.i.k.h.b():java.lang.String");
    }
}
