package com.baidu.ar;

import android.util.Log;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes16.dex */
public class sc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f7192a;
    public static final int b;
    public static final int c;
    public static ThreadPoolExecutor d;
    public static ThreadPoolExecutor e;
    public static ThreadPoolExecutor f;

    static {
        int r0 = Runtime.getRuntime().availableProcessors();
        f7192a = r0;
        int r1 = r0 + 1;
        b = r1;
        int r2 = (r0 * 2) + 1;
        c = r2;
        Log.d("ThreadPoolFactory", "CPU_COUNT = " + r0 + ", CORE_POOL_SIZE = " + r1 + ", MAXIMUM_POOL_SIZE = " + r2 + ", KEEP_ALIVE = 15");
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
