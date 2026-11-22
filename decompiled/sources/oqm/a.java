package oqm;

import com.qumeng.overseas.advlib.__remote__.core.proto.utils.e;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.r;
import com.qumeng.overseas.advlib.__remote__.framework.imageloader.c;
import com.qumeng.overseas.advlib.__remote__.framework.imageloader.o;
import com.qumeng.overseas.advlib.__remote__.ui.incite.HttpLite;
import com.qumeng.overseas.advlib.__remote__.utils.n;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public class a {
    public static Thread a(Runnable runnable, String str) {
        return new Thread(runnable, str);
    }

    public static ExecutorService b(String str) {
        n.c("ThreadPoolFactory", "newSingleThreadExecutor - " + str, new Object[0]);
        return Executors.newSingleThreadExecutor(new c(e.a(str)));
    }

    public static Thread a(ThreadGroup threadGroup, Runnable runnable, String str, long j) {
        return new Thread(threadGroup, runnable, str, j);
    }

    public static ExecutorService a(int i, String str) {
        n.c("ThreadPoolFactory", "newFixedThreadPool - " + str, new Object[0]);
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(i, new c(e.a(str)));
        threadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static ThreadPoolExecutor b() {
        n.c("ThreadPoolFactory", "getImageThreadPoolExecutor", new Object[0]);
        return o.c();
    }

    public static ExecutorService a(String str) {
        int i = HttpLite.b;
        int max = r.a() ? 8 : Math.max(HttpLite.c, 8);
        n.c("ThreadPoolFactory", "newCachedThreadPool - " + str + ",corePoolSize=" + i + ",max=" + max, new Object[0]);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, max, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new c(e.a(str)));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static ThreadPoolExecutor a(int i, int i2, String str, boolean z) {
        n.c("ThreadPoolFactory", "newThreadPoolExecutor - " + str, new Object[0]);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i2, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(128), new c(e.a(str)), new ThreadPoolExecutor.CallerRunsPolicy());
        if (z) {
            threadPoolExecutor.allowCoreThreadTimeOut(z);
        }
        return threadPoolExecutor;
    }

    public static ThreadPoolExecutor a(int i, int i2, String str) {
        return a(i, i2, str, true);
    }

    public static ThreadPoolExecutor a() {
        n.c("ThreadPoolFactory", "getImageDiskCacheThreadPoolExecutor", new Object[0]);
        return o.b();
    }
}
