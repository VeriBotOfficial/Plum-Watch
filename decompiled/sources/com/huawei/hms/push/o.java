package com.huawei.hms.push;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: ReceiverThreadPoolExecutor.java */
/* loaded from: classes14.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f10484a = new Object();
    private static ThreadPoolExecutor b = new ThreadPoolExecutor(1, 50, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public static ThreadPoolExecutor a() {
        ThreadPoolExecutor threadPoolExecutor;
        synchronized (f10484a) {
            threadPoolExecutor = b;
        }
        return threadPoolExecutor;
    }
}
