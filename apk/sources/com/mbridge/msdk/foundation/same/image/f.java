package com.mbridge.msdk.foundation.same.image;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: ImageLoaderController.java */
/* JADX INFO: loaded from: classes2.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ThreadPoolExecutor f11578a;

    /* JADX INFO: compiled from: ImageLoaderController.java */
    class a implements ThreadFactory {
        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("mb-image-loader-thread");
            return thread;
        }
    }

    private static ThreadFactory a() {
        return new a();
    }

    public static ThreadPoolExecutor b() {
        if (f11578a == null) {
            int r3 = Runtime.getRuntime().availableProcessors();
            f11578a = new ThreadPoolExecutor(r3, r3, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), a(), new ThreadPoolExecutor.DiscardPolicy());
        }
        f11578a.allowCoreThreadTimeOut(true);
        return f11578a;
    }
}
