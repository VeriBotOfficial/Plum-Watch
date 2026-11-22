package sg.bigo.ads.common.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import com.autonavi.aps.amapapi.config.Const;
import java.io.File;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes9.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private static long f19729a;
    private static long b;
    private static long c;
    private static long d;

    public static long a() {
        if (System.currentTimeMillis() - b > 60000) {
            f19729a = e();
            b = System.currentTimeMillis();
        }
        return f19729a;
    }

    public static long a(Context context) {
        ActivityManager.MemoryInfo d2 = d(context);
        if (d2 == null) {
            return 0L;
        }
        return f.a(d2.availMem, 3);
    }

    public static <T> Set<T> a(final int i) {
        return Collections.newSetFromMap(new LinkedHashMap<T, Boolean>() { // from class: sg.bigo.ads.common.utils.p.1
            @Override // java.util.LinkedHashMap
            protected final boolean removeEldestEntry(Map.Entry<T, Boolean> entry) {
                return size() > i;
            }
        });
    }

    public static long b(Context context) {
        ActivityManager.MemoryInfo d2 = d(context);
        if (d2 == null) {
            return 0L;
        }
        return f.a(d2.totalMem, 3);
    }

    public static boolean b() {
        return f() > 20971520;
    }

    public static int c(Context context) {
        try {
            return (int) Math.min(15728640L, (((ActivityManager) context.getSystemService(Const.STR_PROCESS_TAG)).getLargeMemoryClass() / 8) * 1048576);
        } catch (Exception unused) {
            return 15728640;
        }
    }

    public static long c() {
        if (System.currentTimeMillis() - d > 60000) {
            try {
                c = f();
            } catch (Throwable th) {
                sg.bigo.ads.common.t.a.a(0, "StorageUtils", th.toString());
            }
            d = System.currentTimeMillis();
        }
        return c;
    }

    private static ActivityManager.MemoryInfo d(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(Const.STR_PROCESS_TAG);
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo;
        } catch (Exception unused) {
            return null;
        }
    }

    public static File d() {
        return new File(Environment.getExternalStorageDirectory(), "Pictures");
    }

    private static long e() {
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        } catch (Throwable th) {
            sg.bigo.ads.common.t.a.a(0, "StorageUtils", "getExternalStorageRemainSpace" + th.getMessage());
            return 0L;
        }
    }

    private static long f() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
    }
}
