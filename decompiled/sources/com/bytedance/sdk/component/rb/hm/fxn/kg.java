package com.bytedance.sdk.component.rb.hm.fxn;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes13.dex */
public class kg {
    private static final TimeUnit fxn = TimeUnit.SECONDS;

    public static ExecutorService fxn() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 2, 30L, fxn, new LinkedBlockingQueue(), new fxn("default"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }
}
