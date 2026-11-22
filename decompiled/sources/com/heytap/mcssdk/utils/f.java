package com.heytap.mcssdk.utils;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes11.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static final ExecutorService f10111a = Executors.newSingleThreadExecutor();
    private static Handler b = new Handler(Looper.getMainLooper());

    public static void a(Runnable runnable) {
        f10111a.execute(runnable);
    }

    public static void b(Runnable runnable) {
        b.post(runnable);
    }
}
