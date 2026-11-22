package com.baidu.platform.comapi.util;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: DefaultThreadPool.java */
/* loaded from: classes13.dex */
class f {

    /* renamed from: a, reason: collision with root package name */
    private static final int f8679a;
    private static final int b;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f8679a = availableProcessors;
        b = Math.min((availableProcessors * 2) + 1, 8);
    }

    public static ExecutorService a(String str) {
        int i = b;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60L, timeUnit, new LinkedBlockingQueue(), new b(str));
        try {
            threadPoolExecutor.setKeepAliveTime(60L, timeUnit);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        } catch (Exception unused) {
        }
        return threadPoolExecutor;
    }
}
