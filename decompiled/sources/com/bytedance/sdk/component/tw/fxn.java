package com.bytedance.sdk.component.tw;

import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes13.dex */
class fxn extends ThreadPoolExecutor {
    private String fxn;

    public fxn(String str, int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
        this.fxn = str;
    }

    private void fxn(Runnable runnable) {
        try {
            super.execute(runnable);
        } catch (OutOfMemoryError e) {
            fxn(runnable, e);
        } catch (Throwable th) {
            fxn(runnable, th);
        }
    }

    private void fxn(Runnable runnable, OutOfMemoryError outOfMemoryError) {
        fxn(runnable, (Throwable) outOfMemoryError);
    }

    private void fxn(Runnable runnable, Throwable th) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                runnable.run();
            } catch (Throwable unused) {
            }
        }
    }

    private void fxn(BlockingQueue<Runnable> blockingQueue, int i) {
        if (getCorePoolSize() == i || blockingQueue == null || blockingQueue.size() > 0) {
            return;
        }
        try {
            setCorePoolSize(i);
            new Object[]{"reduceCoreThreadSize: reduce poolType =  ", this.fxn, " coreSize=", Integer.valueOf(getCorePoolSize()), "  maxSize=", Integer.valueOf(getMaximumPoolSize())};
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private void fxn(BlockingQueue<Runnable> blockingQueue, int i, int i2) {
        if (getCorePoolSize() == i || blockingQueue == null || blockingQueue.size() < i2) {
            return;
        }
        try {
            setCorePoolSize(i);
            new Object[]{"increaseCoreThreadSize: increase poolType =  ", this.fxn, " coreSize=", Integer.valueOf(getCorePoolSize()), "  maxSize=", Integer.valueOf(getMaximumPoolSize())};
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        BlockingQueue<Runnable> queue;
        if (runnable instanceof tw) {
            fxn(new kg((tw) runnable, this));
        } else {
            fxn(new kg(new tw("unknown") { // from class: com.bytedance.sdk.component.tw.fxn.1
                @Override // java.lang.Runnable
                public void run() {
                    runnable.run();
                }
            }, this));
        }
        if (!bh.sg() || TextUtils.isEmpty(this.fxn) || (queue = getQueue()) == null) {
            return;
        }
        String str = this.fxn;
        str.hashCode();
        switch (str) {
            case "io":
                fxn(queue, bh.fxn + 2, getCorePoolSize() * 2);
                break;
            case "log":
                fxn(queue, 8, 8);
                break;
            case "aidl":
                fxn(queue, 5, 5);
                break;
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void afterExecute(Runnable runnable, Throwable th) {
        BlockingQueue<Runnable> queue;
        super.afterExecute(runnable, th);
        if (!bh.sg() || TextUtils.isEmpty(this.fxn) || (queue = getQueue()) == null) {
            return;
        }
        String str = this.fxn;
        str.hashCode();
        switch (str) {
            case "io":
                fxn(queue, 2);
                break;
            case "log":
                fxn(queue, 4);
                break;
            case "aidl":
                fxn(queue, 2);
                break;
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        if ("io".equals(this.fxn) || "aidl".equals(this.fxn)) {
            return Collections.emptyList();
        }
        return super.shutdownNow();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public void shutdown() {
        if ("io".equals(this.fxn) || "aidl".equals(this.fxn)) {
            return;
        }
        super.shutdown();
    }

    public String fxn() {
        return this.fxn;
    }

    /* renamed from: com.bytedance.sdk.component.tw.fxn$fxn, reason: collision with other inner class name */
    public static class C0487fxn {
        private RejectedExecutionHandler tw;
        private String fxn = "io";
        private int kg = 1;
        private long gff = 30;
        private TimeUnit hm = TimeUnit.SECONDS;
        private int rb = Integer.MAX_VALUE;
        private BlockingQueue<Runnable> bh = null;

        /* renamed from: sg, reason: collision with root package name */
        private ThreadFactory f9399sg = null;
        private int jq = 5;

        public C0487fxn fxn(String str) {
            this.fxn = str;
            return this;
        }

        public C0487fxn fxn(int i) {
            this.kg = i;
            return this;
        }

        public C0487fxn fxn(long j) {
            this.gff = j;
            return this;
        }

        public C0487fxn fxn(TimeUnit timeUnit) {
            this.hm = timeUnit;
            return this;
        }

        public C0487fxn fxn(BlockingQueue<Runnable> blockingQueue) {
            this.bh = blockingQueue;
            return this;
        }

        public C0487fxn fxn(ThreadFactory threadFactory) {
            this.f9399sg = threadFactory;
            return this;
        }

        public C0487fxn fxn(RejectedExecutionHandler rejectedExecutionHandler) {
            this.tw = rejectedExecutionHandler;
            return this;
        }

        public C0487fxn kg(int i) {
            this.jq = i;
            return this;
        }

        public fxn fxn() {
            if (this.f9399sg == null) {
                this.f9399sg = rb.fxn().createThreadFactory(this.jq, this.fxn);
            }
            if (this.tw == null) {
                this.tw = bh.tw();
            }
            if (this.bh == null) {
                this.bh = new LinkedBlockingQueue();
            }
            return new fxn(this.fxn, this.kg, this.rb, this.gff, this.hm, this.bh, this.f9399sg, this.tw);
        }
    }
}
