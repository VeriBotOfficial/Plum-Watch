package com.efs.sdk.memoryinfo;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.Process;
import com.autonavi.aps.amapapi.config.Const;

/* loaded from: classes14.dex */
final class c {
    final String activity;
    final String bg;
    final long n;
    final long o;
    final long p;

    /* renamed from: q, reason: collision with root package name */
    final long f9931q;
    final float r;
    final long s;
    final long t;

    c(Context context) {
        Debug.MemoryInfo[] processMemoryInfo;
        Debug.MemoryInfo memoryInfo = null;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(Const.STR_PROCESS_TAG);
            if (activityManager != null && (processMemoryInfo = activityManager.getProcessMemoryInfo(new int[]{Process.myPid()})) != null && processMemoryInfo.length > 0) {
                memoryInfo = processMemoryInfo[0];
            }
        } catch (Throwable unused) {
        }
        if (memoryInfo == null) {
            memoryInfo = new Debug.MemoryInfo();
            Debug.getMemoryInfo(memoryInfo);
        }
        this.bg = UMMemoryMonitor.get().isForeground() ? "fg" : "bg";
        this.n = memoryInfo.getTotalPss() * 1024;
        this.o = memoryInfo.dalvikPss * 1024;
        this.p = memoryInfo.nativePss * 1024;
        this.s = f.a(memoryInfo) * 1024;
        long freeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        this.f9931q = freeMemory;
        long maxMemory = Runtime.getRuntime().maxMemory();
        if (maxMemory != 0) {
            this.r = (freeMemory * 1.0f) / maxMemory;
        } else {
            this.r = 1.0f;
        }
        this.t = f.a() * 1024;
        this.activity = UMMemoryMonitor.get().getCurrentActivity();
    }
}
