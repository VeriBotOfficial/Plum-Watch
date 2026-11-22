package sg.bigo.ads.common.h.b;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
class c extends ThreadPoolExecutor {

    /* renamed from: a, reason: collision with root package name */
    private static c f19630a;

    private c(TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(5, 8, 3000L, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
    }

    protected static synchronized c a(boolean z) {
        c cVar;
        synchronized (c.class) {
            if (f19630a == null) {
                synchronized (c.class) {
                    if (f19630a == null) {
                        b(z);
                    }
                }
            }
            cVar = f19630a;
        }
        return cVar;
    }

    private static synchronized void b(boolean z) {
        synchronized (c.class) {
            f19630a = new c(TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new sg.bigo.ads.common.n.c("Download", z), new ThreadPoolExecutor.AbortPolicy());
        }
    }
}
