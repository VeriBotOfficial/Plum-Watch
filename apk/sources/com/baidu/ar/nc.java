package com.baidu.ar;

import android.app.ActivityManager;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import com.autonavi.aps.amapapi.config.Const;
import com.baidu.ar.util.SystemInfoUtil;
import com.umeng.analytics.pro.ak;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes16.dex */
public class nc {

    public class a implements FileFilter {
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

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0071: MOVE (r6 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:42:0x0071 */
    public static String a() throws Throwable {
        Throwable th;
        InputStreamReader inputStreamReader;
        Exception e;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        BufferedReader bufferedReader3 = null;
        try {
            try {
                inputStreamReader = new InputStreamReader(new FileInputStream("/proc/cpuinfo"), Charset.forName("utf-8"));
                try {
                    bufferedReader = new BufferedReader(inputStreamReader);
                    try {
                        String[] strArrSplit = bufferedReader.readLine().split(":\\s+", 2);
                        for (int r4 = 0; r4 < strArrSplit.length; r4++) {
                        }
                        String str = strArrSplit[1];
                        try {
                            bufferedReader.close();
                        } catch (IOException e2) {
                            e2.printStackTrace(System.out);
                        }
                        try {
                            inputStreamReader.close();
                        } catch (IOException e3) {
                            e3.printStackTrace(System.out);
                        }
                        return str;
                    } catch (Exception e4) {
                        e = e4;
                        e.printStackTrace(System.out);
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e5) {
                                e5.printStackTrace(System.out);
                            }
                        }
                        if (inputStreamReader != null) {
                            try {
                                inputStreamReader.close();
                            } catch (IOException e6) {
                                e6.printStackTrace(System.out);
                            }
                        }
                        return null;
                    }
                } catch (Exception e7) {
                    e = e7;
                    bufferedReader = null;
                } catch (Throwable th2) {
                    th = th2;
                    if (bufferedReader3 != null) {
                        try {
                            bufferedReader3.close();
                        } catch (IOException e8) {
                            e8.printStackTrace(System.out);
                        }
                    }
                    if (inputStreamReader == null) {
                        throw th;
                    }
                    try {
                        inputStreamReader.close();
                        throw th;
                    } catch (IOException e9) {
                        e9.printStackTrace(System.out);
                        throw th;
                    }
                }
            } catch (Exception e10) {
                e = e10;
                inputStreamReader = null;
                bufferedReader = null;
            } catch (Throwable th3) {
                th = th3;
                inputStreamReader = null;
            }
        } catch (Throwable th4) {
            th = th4;
            bufferedReader3 = bufferedReader2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x009e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:? A[SYNTHETIC] */
    public static long b(Context context) throws Throwable {
        InputStreamReader inputStreamReader;
        Throwable th;
        long j;
        BufferedReader bufferedReader = null;
        try {
            inputStreamReader = new InputStreamReader(new FileInputStream(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MEM_INFO), Charset.forName("utf-8"));
            try {
                BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader, 8192);
                try {
                    String line = bufferedReader2.readLine();
                    String[] strArrSplit = line.split("\\s+");
                    for (String str : strArrSplit) {
                        Log.i("bdar:", line + ", " + str + Separators.HT);
                    }
                    j = Integer.parseInt(strArrSplit[1]);
                    try {
                        bufferedReader2.close();
                    } catch (IOException e) {
                        e.printStackTrace(System.out);
                    }
                } catch (Exception e2) {
                    bufferedReader = bufferedReader2;
                    e = e2;
                    try {
                        e.printStackTrace(System.out);
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e3) {
                                e3.printStackTrace(System.out);
                            }
                        }
                        j = 0;
                        if (inputStreamReader != null) {
                        }
                        return j / 1024;
                    } catch (Throwable th2) {
                        BufferedReader bufferedReader3 = bufferedReader;
                        th = th2;
                        bufferedReader2 = bufferedReader3;
                        Throwable th3 = th;
                        bufferedReader = bufferedReader2;
                        th = th3;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e4) {
                                e4.printStackTrace(System.out);
                            }
                        }
                        if (inputStreamReader == null) {
                            throw th;
                        }
                        try {
                            inputStreamReader.close();
                            throw th;
                        } catch (IOException e5) {
                            e5.printStackTrace(System.out);
                            throw th;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    Throwable th5 = th;
                    bufferedReader = bufferedReader2;
                    th = th5;
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    if (inputStreamReader == null) {
                        throw th;
                    }
                    inputStreamReader.close();
                    throw th;
                }
            } catch (Exception e6) {
                e = e6;
            } catch (Throwable th6) {
                th = th6;
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (inputStreamReader == null) {
                    throw th;
                }
                inputStreamReader.close();
                throw th;
            }
        } catch (Exception e7) {
            e = e7;
            inputStreamReader = null;
        } catch (Throwable th7) {
            th = th7;
            inputStreamReader = null;
        }
        try {
            inputStreamReader.close();
        } catch (IOException e8) {
            e8.printStackTrace(System.out);
        }
        return j / 1024;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0081 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:? A[SYNTHETIC] */
    public static String b() throws Throwable {
        InputStreamReader inputStreamReader;
        InputStreamReader inputStreamReader2;
        String strValueOf = SystemInfoUtil.NA;
        BufferedReader bufferedReader = null;
        try {
            try {
                inputStreamReader = new InputStreamReader(new FileInputStream("/sys/devices/system/cpu/cpu0/cpufreq/scaling_cur_freq"), Charset.forName("utf-8"));
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader);
                    try {
                        strValueOf = String.valueOf(Integer.parseInt(bufferedReader2.readLine().trim().trim()) / 1000);
                        try {
                            bufferedReader2.close();
                        } catch (IOException e) {
                            e.printStackTrace(System.out);
                        }
                        inputStreamReader.close();
                    } catch (Exception e2) {
                        e = e2;
                        bufferedReader = bufferedReader2;
                        inputStreamReader2 = inputStreamReader;
                        try {
                            e.printStackTrace(System.out);
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException e3) {
                                    e3.printStackTrace(System.out);
                                }
                            }
                            if (inputStreamReader2 != null) {
                                inputStreamReader2.close();
                            }
                            return strValueOf;
                        } catch (Throwable th) {
                            th = th;
                            inputStreamReader = inputStreamReader2;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException e4) {
                                    e4.printStackTrace(System.out);
                                }
                            }
                            if (inputStreamReader != null) {
                                throw th;
                            }
                            try {
                                inputStreamReader.close();
                                throw th;
                            } catch (IOException e5) {
                                e5.printStackTrace(System.out);
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        if (inputStreamReader != null) {
                            throw th;
                        }
                        inputStreamReader.close();
                        throw th;
                    }
                } catch (Exception e6) {
                    inputStreamReader2 = inputStreamReader;
                    e = e6;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Exception e7) {
                e = e7;
                inputStreamReader2 = null;
            } catch (Throwable th4) {
                th = th4;
                inputStreamReader = null;
            }
        } catch (IOException e8) {
            e8.printStackTrace(System.out);
        }
        return strValueOf;
    }

    public static String c() {
        String strValueOf;
        try {
            InputStream inputStream = new ProcessBuilder("/system/bin/cat", "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq").start().getInputStream();
            byte[] bArr = new byte[24];
            String str = "";
            while (inputStream.read(bArr) != -1) {
                str = str + new String(bArr, "utf-8");
            }
            inputStream.close();
            strValueOf = String.valueOf(Integer.parseInt(str.trim()) / 1000);
        } catch (Exception e) {
            e.printStackTrace(System.out);
            strValueOf = SystemInfoUtil.NA;
        }
        return String.valueOf(strValueOf);
    }

    public static boolean c(Context context) {
        return ((SensorManager) context.getSystemService(ak.ac)).getDefaultSensor(4) != null;
    }

    public static String d() {
        String strValueOf;
        try {
            InputStream inputStream = new ProcessBuilder("/system/bin/cat", "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq").start().getInputStream();
            byte[] bArr = new byte[24];
            String str = "";
            while (inputStream.read(bArr) != -1) {
                str = str + new String(bArr, "utf-8");
            }
            inputStream.close();
            strValueOf = String.valueOf(Integer.parseInt(str.trim()) / 1000);
        } catch (Exception unused) {
            strValueOf = SystemInfoUtil.NA;
        }
        return strValueOf.trim();
    }

    public static boolean d(Context context) {
        String str = Build.MODEL;
        return "RLIAN00".equalsIgnoreCase(str) || "RLIN29".equalsIgnoreCase(str) || "TAH-AN00".equalsIgnoreCase(str) || "TAHN29".equalsIgnoreCase(str) || "TAH-AN00m".equalsIgnoreCase(str) || "RLI-N29".equalsIgnoreCase(str) || "TAH-N29".equalsIgnoreCase(str) || "RHA-AN00m".equalsIgnoreCase(str);
    }

    public static int e() {
        try {
            File[] fileArrListFiles = new File("/sys/devices/system/cpu/").listFiles(new a());
            Log.d("bdar", "CPU Count: " + fileArrListFiles.length);
            return fileArrListFiles.length;
        } catch (Exception e) {
            Log.d("bdar", "CPU Count: Failed.");
            e.printStackTrace(System.out);
            return 1;
        }
    }

    public static long[] f() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockSize = statFs.getBlockSize();
        return new long[]{(((long) statFs.getBlockCount()) * blockSize) / 1048576, (blockSize * ((long) statFs.getAvailableBlocks())) / 1048576};
    }

    public static long g() {
        if ("mounted".equals(Environment.getExternalStorageState())) {
            try {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                return (((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks())) / 1048576;
            } catch (Exception e) {
                e.printStackTrace(System.out);
            }
        }
        return 0L;
    }

    public static long h() {
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                return (((long) statFs.getBlockSize()) * ((long) statFs.getBlockCount())) / 1048576;
            }
        } catch (Throwable th) {
            th.printStackTrace(System.out);
        }
        return 0L;
    }

    public static boolean i() {
        return true;
    }

    public static boolean j() {
        return "Nexus 5X".equals(Build.MODEL);
    }

    public static boolean k() {
        String str = Build.MODEL;
        return "Nexus 6P".equals(str) || "AOSP on angler".equals(str);
    }
}
