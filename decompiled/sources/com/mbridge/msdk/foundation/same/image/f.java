package com.mbridge.msdk.foundation.same.image;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: ImageLoaderController.java */
/* loaded from: classes17.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static ThreadPoolExecutor f11578a;

    /* compiled from: ImageLoaderController.java */
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
            int availableProcessors = Runtime.getRuntime().availableProcessors();
            f11578a = new ThreadPoolExecutor(availableProcessors, availableProcessors, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), a(), new ThreadPoolExecutor.DiscardPolicy());
        }
        f11578a.allowCoreThreadTimeOut(true);
        return f11578a;
    }
}
