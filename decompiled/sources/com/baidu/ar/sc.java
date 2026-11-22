package com.baidu.ar;

import android.util.Log;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes12.dex */
public class sc {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7192a;
    public static final int b;
    public static final int c;
    public static ThreadPoolExecutor d;
    public static ThreadPoolExecutor e;
    public static ThreadPoolExecutor f;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f7192a = availableProcessors;
        int i = availableProcessors + 1;
        b = i;
        int i2 = (availableProcessors * 2) + 1;
        c = i2;
        Log.d("ThreadPoolFactory", "CPU_COUNT = " + availableProcessors + ", CORE_POOL_SIZE = " + i + ", MAXIMUM_POOL_SIZE = " + i2 + ", KEEP_ALIVE = 15");
        new LinkedBlockingQueue(128);
        new LinkedBlockingQueue(128);
        new LinkedBlockingQueue(128);
        d = null;
        e = null;
        f = null;
    }

    public static void a() {
        try {
            a(f);
            a(d);
            a(e);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void a(ThreadPoolExecutor threadPoolExecutor) {
        if (threadPoolExecutor != null) {
            threadPoolExecutor.shutdown();
        }
    }
}
