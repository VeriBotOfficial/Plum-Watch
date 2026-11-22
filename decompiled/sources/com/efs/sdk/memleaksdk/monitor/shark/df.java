package com.efs.sdk.memleaksdk.monitor.shark;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Debug;
import android.os.StatFs;
import com.autonavi.aps.amapapi.config.Const;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileReader;

/* loaded from: classes14.dex */
public class df {
    public static String a() {
        try {
            StringBuilder sb = new StringBuilder("JavaMax:    ");
            sb.append(Runtime.getRuntime().maxMemory() / 1024).append(" kB\nJavaTotal:  ");
            sb.append(Runtime.getRuntime().totalMemory() / 1024).append(" kB\nJavaFree:   ");
            sb.append(Runtime.getRuntime().freeMemory() / 1024).append(" kB\nNativeHeap: ");
            sb.append(Debug.getNativeHeapSize() / 1024).append(" kB\nNativeAllocated: ");
            sb.append(Debug.getNativeHeapAllocatedSize() / 1024).append(" kB\nNativeFree: ");
            sb.append(Debug.getNativeHeapFreeSize() / 1024).append(" kB\n");
            try {
                ActivityManager activityManager = (ActivityManager) UMGlobalContext.getAppContext().getSystemService(Const.STR_PROCESS_TAG);
                if (activityManager != null) {
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    activityManager.getMemoryInfo(memoryInfo);
                    sb.append("availMem:   ").append(memoryInfo.availMem / 1024).append(" kB\n");
                    sb.append("threshold:  ").append(memoryInfo.threshold / 1024).append(" kB\n");
                    sb.append("lowMemory:  ").append(memoryInfo.lowMemory);
                }
            } catch (Throwable unused) {
            }
            sb.append("\n");
            return sb.toString();
        } catch (Throwable unused2) {
            return "";
        }
    }

    public static String b() {
        BufferedReader bufferedReader;
        StringBuilder sb = new StringBuilder();
        try {
            bufferedReader = new BufferedReader(new FileReader(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MEM_INFO), 1024);
            int i = 0;
            do {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine.trim()).append("\n");
                    i++;
                } catch (Throwable unused) {
                }
            } while (i < 500);
        } catch (Throwable unused2) {
            bufferedReader = null;
        }
        a(bufferedReader);
        sb.append("\n");
        return sb.toString();
    }

    private static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static String a(Context context) {
        try {
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver == null) {
                return "";
            }
            int intExtra = registerReceiver.getIntExtra("level", -1);
            int intExtra2 = registerReceiver.getIntExtra("voltage", -1);
            int intExtra3 = registerReceiver.getIntExtra("temperature", -1);
            int intExtra4 = registerReceiver.getIntExtra("status", -1);
            int i = 0;
            int i2 = intExtra4 == 1 ? -1 : intExtra4 == 2 ? 1 : intExtra4 == 5 ? 2 : 0;
            int intExtra5 = registerReceiver.getIntExtra("plugged", -1);
            if (intExtra5 == 1) {
                i = 1;
            } else if (intExtra5 == 2) {
                i = 2;
            }
            return "level: " + intExtra + "\nscale: " + registerReceiver.getIntExtra("scale", -1) + "\nhealth: " + registerReceiver.getIntExtra("health", -1) + "\npluged: " + i + "\nstatus: " + i2 + "\nvoltage: " + intExtra2 + "\ntemperature: " + intExtra3 + "\ntechnology: " + registerReceiver.getStringExtra("technology") + "\n";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String b(Context context) {
        try {
            StatFs statFs = new StatFs(context.getFilesDir().getParent());
            long b = b(statFs);
            return "total:      " + ((a(statFs) * b) / 1024) + " kB\navailable:  " + ((c(statFs) * b) / 1024) + " kB\nfree:       " + ((d(statFs) * b) / 1024) + " kB\nblock size: " + b + " B\n";
        } catch (Throwable unused) {
            return "";
        }
    }

    private static long a(StatFs statFs) {
        return statFs.getBlockCountLong();
    }

    private static long b(StatFs statFs) {
        return statFs.getBlockSizeLong();
    }

    private static long c(StatFs statFs) {
        return statFs.getAvailableBlocksLong();
    }

    private static long d(StatFs statFs) {
        return statFs.getFreeBlocksLong();
    }
}
