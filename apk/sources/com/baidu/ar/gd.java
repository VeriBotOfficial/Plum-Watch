package com.baidu.ar;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes16.dex */
public class gd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Handler f6950a = new Handler(Looper.getMainLooper());

    public static void a(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (a()) {
            runnable.run();
        } else {
            f6950a.post(runnable);
        }
    }

    public static void a(Runnable runnable, long j) {
        f6950a.postDelayed(runnable, j);
    }

    public static boolean a() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
