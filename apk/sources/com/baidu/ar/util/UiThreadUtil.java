package com.baidu.ar.util;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes16.dex */
public class UiThreadUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Handler f7251a = new Handler(Looper.getMainLooper());

    public static boolean isOnUiThread() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static void postDelayed(Runnable runnable, long j) {
        f7251a.postDelayed(runnable, j);
    }

    public static void removeCallbacks(Runnable runnable) {
        f7251a.removeCallbacks(runnable);
    }

    public static void removeCallbacksAndMessages() {
        f7251a.removeCallbacksAndMessages(null);
    }

    public static void runOnUiThread(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (isOnUiThread()) {
            runnable.run();
        } else {
            f7251a.post(runnable);
        }
    }
}
