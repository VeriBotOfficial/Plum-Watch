package com.bytedance.sdk.component.tw.gff;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.anythink.expressad.foundation.g.g.a.b;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes13.dex */
public class bh extends ThreadPoolExecutor {
    private final String fxn;
    private int gff;
    private int hm;
    private int kg;
    private boolean rb;

    private bh(fxn fxnVar) {
        super(fxnVar.kg, Integer.MAX_VALUE, fxnVar.rb, fxnVar.f9400sg, (BlockingQueue<Runnable>) fxnVar.jq, fxnVar.hie);
        this.rb = false;
        new Object[]{"create poolType = ", fxnVar.fxn, " coreSize=", Integer.valueOf(fxnVar.kg), " maxSize=", Integer.valueOf(fxnVar.gff), " keepAlive=", Long.valueOf(fxnVar.rb), " createSize=", Integer.valueOf(fxnVar.hm), " isUseConfig=", Boolean.valueOf(fxnVar.tw), "  workQueue", fxnVar.jq};
        this.fxn = fxnVar.fxn;
        this.kg = fxnVar.kg;
        this.gff = fxnVar.gff;
        this.hm = fxnVar.hm;
        allowCoreThreadTimeOut(fxnVar.bh);
        this.rb = fxnVar.tw;
    }

    public void fxn(fxn fxnVar) {
        try {
            if (fxnVar.kg >= 0 && this.kg != fxnVar.kg) {
                int i = fxnVar.kg;
                this.kg = i;
                setCorePoolSize(i);
            }
            this.gff = fxnVar.gff;
            this.hm = fxnVar.hm;
            allowCoreThreadTimeOut(fxnVar.bh);
            this.rb = fxnVar.tw;
        } catch (Throwable th) {
            th.getMessage();
        }
        new Object[]{"update poolType = ", fxnVar.fxn, " coreSize=", Integer.valueOf(fxnVar.kg), " maxSize=", Integer.valueOf(fxnVar.gff), " keepAlive=", Long.valueOf(fxnVar.rb), " createSize=", Integer.valueOf(fxnVar.hm), " isUseConfig=", Boolean.valueOf(fxnVar.tw), "  workQueue", fxnVar.jq};
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void beforeExecute(Thread thread, Runnable runnable) {
        if (runnable instanceof kg) {
            ((kg) runnable).kg(SystemClock.elapsedRealtime());
        }
        super.beforeExecute(thread, runnable);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void afterExecute(Runnable runnable, Throwable th) {
        boolean z = runnable instanceof kg;
        if (z) {
            ((kg) runnable).gff(SystemClock.elapsedRealtime());
        }
        super.afterExecute(runnable, th);
        if (z) {
            kg kgVar = (kg) runnable;
            new Object[]{"submit  poolType = ", this.fxn, " taskName=", kgVar.kg(), "    ", "priority = ", Integer.valueOf(kgVar.fxn()), " SubmitTimestamp=", Long.valueOf(kgVar.gff()), "  BeforeTimestamp=", Long.valueOf(kgVar.hm()), "  AfterTimestamp=", Long.valueOf(kgVar.rb())};
        }
        gff();
    }

    private void kg() {
        int corePoolSize;
        try {
            if (this.kg != 0 && (corePoolSize = getCorePoolSize()) < this.gff) {
                int size = getQueue().size();
                if (getActiveCount() < this.kg || size < this.hm) {
                    return;
                }
                setCorePoolSize(this.gff);
                new Object[]{this.fxn, " increaseToMaxThread  queueSize=", Integer.valueOf(size), "    ", Integer.valueOf(corePoolSize), " --> ", Integer.valueOf(this.gff)};
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private void gff() {
        int corePoolSize;
        int size;
        try {
            if (this.kg != 0 && (corePoolSize = getCorePoolSize()) > this.kg && (size = getQueue().size()) == 0) {
                setCorePoolSize(this.kg);
                new Object[]{this.fxn, " reduceToCoreThread  queueSize=", Integer.valueOf(size), "    ", Integer.valueOf(corePoolSize), " --> ", Integer.valueOf(this.kg)};
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        int i;
        String str;
        runnable.getClass();
        final RunnableFuture newTaskFor = newTaskFor(runnable, null);
        if (!(runnable instanceof kg)) {
            i = 6;
            str = "";
        } else {
            kg kgVar = (kg) runnable;
            i = kgVar.fxn();
            str = kgVar.kg();
        }
        if (i == 0 || TextUtils.isEmpty(str)) {
            new RuntimeException();
        }
        execute(new kg(i, str) { // from class: com.bytedance.sdk.component.tw.gff.bh.1
            @Override // java.lang.Runnable
            public void run() {
                newTaskFor.run();
            }
        });
        return newTaskFor;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        com.bytedance.sdk.component.tw.gff.fxn fxn2;
        if (!(runnable instanceof kg)) {
            runnable = new kg("unknown", runnable) { // from class: com.bytedance.sdk.component.tw.gff.bh.2
                @Override // java.lang.Runnable
                public void run() {
                    Runnable bh = bh();
                    if (bh != null) {
                        bh.run();
                    }
                }
            };
        }
        if (!b.O.equals(this.fxn)) {
            String name = Thread.currentThread().getName();
            if (!TextUtils.isEmpty(name) && name.startsWith(hm.fxn(this.fxn)) && (fxn2 = gff.fxn()) != null) {
                fxn2.fxn(this, (kg) runnable);
            }
        }
        ((kg) runnable).fxn(SystemClock.elapsedRealtime());
        try {
            super.execute(runnable);
            kg();
        } catch (Throwable th) {
            fxn(runnable, th);
        }
    }

    private void fxn(Runnable runnable, Throwable th) {
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                Handler kg = gff.kg();
                if (kg != null) {
                    kg.post(runnable);
                    return;
                }
                return;
            }
            runnable.run();
        } catch (Throwable unused) {
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        if ("aidl".equals(this.fxn)) {
            return Collections.emptyList();
        }
        return super.shutdownNow();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public void shutdown() {
        if ("aidl".equals(this.fxn)) {
            return;
        }
        super.shutdown();
    }

    public boolean fxn() {
        return this.rb;
    }

    public static class fxn {
        private String fxn = b.O;
        private int kg = 4;
        private int gff = 100;
        private int hm = 0;
        private long rb = 30000;
        private boolean bh = false;

        /* renamed from: sg, reason: collision with root package name */
        private TimeUnit f9400sg = TimeUnit.MILLISECONDS;
        private boolean tw = false;
        private BlockingQueue<Runnable> jq = new PriorityBlockingQueue();
        private ThreadFactory hie = null;

        public fxn hm(int i) {
            return this;
        }

        public fxn rb(int i) {
            return this;
        }

        public fxn fxn(String str) {
            this.fxn = str;
            return this;
        }

        public fxn fxn(int i) {
            this.kg = i;
            return this;
        }

        public fxn kg(int i) {
            this.gff = i;
            return this;
        }

        public fxn gff(int i) {
            this.hm = i;
            return this;
        }

        public fxn fxn(long j) {
            this.rb = j;
            return this;
        }

        public fxn fxn(boolean z) {
            this.bh = z;
            return this;
        }

        public fxn kg(boolean z) {
            this.tw = z;
            return this;
        }

        public bh fxn() {
            if (this.hie == null) {
                this.hie = new hm(this.fxn);
            }
            if (this.kg < 0) {
                this.kg = 8;
            }
            if (this.kg == 0) {
                this.jq = new SynchronousQueue();
            }
            if (this.jq == null) {
                this.jq = new LinkedBlockingQueue();
            }
            if (this.gff > 100) {
                this.gff = 100;
            }
            int i = this.gff;
            int i2 = this.kg;
            if (i < i2) {
                this.gff = i2;
            }
            return new bh(this);
        }
    }
}
