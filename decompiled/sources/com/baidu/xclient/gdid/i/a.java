package com.baidu.xclient.gdid.i;

import android.app.ActivityManager;
import android.content.Context;
import android.content.IntentFilter;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.graphics.Point;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.view.Display;
import android.view.WindowManager;
import com.autonavi.aps.amapapi.config.Const;
import com.baidu.platform.comapi.bmsdk.BmLocated;
import com.baidu.xclient.gdid.j.d;
import com.heytap.mcssdk.constant.MessageConstant;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/* loaded from: classes13.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static long f9062a;
    public static long b;
    public static long c;
    public static long d;

    public static int a(long j) {
        try {
            if (g()) {
                String upperCase = Build.BOARD.trim().toUpperCase();
                if (upperCase.startsWith("SQW100-")) {
                    return 3072;
                }
                if (!upperCase.startsWith("SQC100-") && !upperCase.startsWith("SQK100-") && !upperCase.startsWith("SQN100-") && !upperCase.startsWith("SQR100-") && !upperCase.startsWith("STA100-") && !upperCase.startsWith("STK100-") && !upperCase.startsWith("STL100-") && !upperCase.startsWith("STR100-")) {
                    if (upperCase.startsWith("STJ100-")) {
                        return 1536;
                    }
                }
                return 2048;
            }
            float f = j / 1024.0f;
            if (f > 10.0f) {
                return MessageConstant.CommandId.COMMAND_BASE;
            }
            if (f > 8.0f) {
                return 10240;
            }
            if (f > 7.0f) {
                return 8192;
            }
            if (f > 5.0f) {
                return BmLocated.HALF_LEFT_BOTTOM;
            }
            if (f > 4.0f) {
                return BmLocated.HALF_LEFT_TOP;
            }
            if (f > 3.0f) {
                return 4096;
            }
            if (f > 2.0f) {
                return 3072;
            }
            if (f > 1.0f) {
                return 2048;
            }
            if (f > 0.75f) {
                return 1024;
            }
            if (f > 0.5f) {
                return 768;
            }
            return f > 0.25f ? 512 : 0;
        } catch (Throwable th) {
            d.a(th);
            return 0;
        }
    }

    public static long a() {
        try {
            if (!"mounted".equals(Environment.getExternalStorageState())) {
                return -1L;
            }
            if (c == 0) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                c = statFs.getBlockSize() * statFs.getBlockCount();
            }
            return c;
        } catch (Throwable th) {
            d.a(th);
            return -1L;
        }
    }

    public static long a(String str) {
        try {
            return Long.valueOf(str).longValue();
        } catch (NumberFormatException e) {
            d.a(e);
            return Long.MIN_VALUE;
        }
    }

    public static String a(Context context) {
        try {
            int a2 = a(g(context));
            if (a2 <= 0) {
                return null;
            }
            return a2 % 1024 == 0 ? String.format("%d %s", Integer.valueOf(a2 / 1024), "GB") : (a2 < 1024 || a2 % 512 != 0) ? a(Long.valueOf(a2)) : String.format("%.1f %s", Float.valueOf(a2 / 1024.0f), "GB");
        } catch (Throwable th) {
            d.a(th);
            return null;
        }
    }

    public static String a(Long l) {
        try {
            return l.longValue() >= 10240 ? String.format("%.2f %s", Float.valueOf(l.longValue() / 1024.0f), "GB") : String.format("%d %s", l, "MB");
        } catch (Throwable th) {
            d.a(th);
            return "";
        }
    }

    public static long b() {
        try {
            if (!"mounted".equals(Environment.getExternalStorageState())) {
                return -1L;
            }
            if (d == 0) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                d = statFs.getAvailableBlocks() * statFs.getBlockSize();
            }
            return d;
        } catch (Throwable th) {
            d.a(th);
            return -1L;
        }
    }

    public static String b(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(Const.STR_PROCESS_TAG);
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            int i = (int) (memoryInfo.availMem / 1048576);
            return i % 1024 == 0 ? String.format("%d %s", Integer.valueOf(i / 1024), "GB") : (i < 1024 || i % 512 != 0) ? a(Long.valueOf(i)) : String.format("%.1f %s", Float.valueOf(i / 1024.0f), "GB");
        } catch (Throwable th) {
            d.a(th);
            return "";
        }
    }

    public static long c() {
        try {
            if (f9062a == 0) {
                StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                f9062a = statFs.getBlockSize() * statFs.getBlockCount();
            }
            return f9062a;
        } catch (Throwable th) {
            d.a(th);
            return -1L;
        }
    }

    public static String c(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            return "";
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return point.y + TokenNames.X + point.x;
    }

    public static int d(Context context) {
        try {
            return context.getResources().getConfiguration().orientation == 2 ? 0 : 1;
        } catch (Throwable th) {
            d.a(th);
            return 1;
        }
    }

    public static long d() {
        try {
            if (b == 0) {
                StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                b = statFs.getBlockSize() * statFs.getAvailableBlocks();
            }
            return b;
        } catch (Throwable th) {
            d.a(th);
            return -1L;
        }
    }

    public static int e(Context context) {
        try {
            BatteryManager batteryManager = (BatteryManager) context.getSystemService("batterymanager");
            if (batteryManager == null) {
                return 0;
            }
            return batteryManager.getIntProperty(4);
        } catch (Throwable th) {
            d.a(th);
            return 0;
        }
    }

    public static long e() {
        BufferedReader bufferedReader;
        String readLine;
        File a2 = com.baidu.mshield.b.e.a.a(com.baidu.xclient.gdid.d.b, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MEM_INFO);
        long j = 0;
        if (a2 != null && a2.exists()) {
            try {
                bufferedReader = new BufferedReader(new FileReader(a2));
                do {
                    try {
                        readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                    } catch (Throwable th) {
                        th = th;
                        try {
                            d.a(th);
                        } finally {
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Throwable th2) {
                                    d.a(th2);
                                }
                            }
                        }
                    }
                } while (!readLine.startsWith("MemTotal:"));
                String upperCase = readLine.substring(9).trim().toUpperCase();
                int indexOf = upperCase.indexOf(" KB");
                if (indexOf > 0) {
                    long a3 = a(upperCase.substring(0, indexOf));
                    if (a3 > 0) {
                        j = a3 / 1024;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
            }
        }
        return j;
    }

    public static String f() {
        try {
            return Build.MANUFACTURER.trim();
        } catch (Throwable th) {
            d.a(th);
            return "";
        }
    }

    public static boolean f(Context context) {
        try {
            int intExtra = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("status", -1);
            return intExtra == 2 || intExtra == 5;
        } catch (Throwable th) {
            d.a(th);
            return false;
        }
    }

    public static long g(Context context) {
        try {
            long h = h(context);
            return h <= 0 ? e() : h;
        } catch (Throwable th) {
            d.a(th);
            return 0L;
        }
    }

    public static boolean g() {
        try {
            if (f().toUpperCase().equals("BLACKBERRY")) {
                return true;
            }
            return f().equals("RIM");
        } catch (Throwable th) {
            d.a(th);
            return false;
        }
    }

    public static long h(Context context) {
        if (context != null) {
            try {
                ActivityManager activityManager = (ActivityManager) context.getSystemService(Const.STR_PROCESS_TAG);
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                if (activityManager == null) {
                    return 0L;
                }
                activityManager.getMemoryInfo(memoryInfo);
                return memoryInfo.totalMem / 1048576;
            } catch (Throwable th) {
                d.a(th);
            }
        }
        return 0L;
    }
}
