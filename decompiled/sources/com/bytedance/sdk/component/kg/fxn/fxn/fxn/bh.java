package com.bytedance.sdk.component.kg.fxn.fxn.fxn;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes13.dex */
public class bh extends com.bytedance.sdk.component.kg.fxn.hm {
    private ExecutorService fxn;
    private List<com.bytedance.sdk.component.kg.fxn.kg> kg = new CopyOnWriteArrayList();
    private List<com.bytedance.sdk.component.kg.fxn.kg> gff = new CopyOnWriteArrayList();
    private AtomicInteger hm = new AtomicInteger(64);

    public bh() {
        if (this.fxn == null) {
            this.fxn = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 20L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() { // from class: com.bytedance.sdk.component.kg.fxn.fxn.fxn.bh.1
                @Override // java.util.concurrent.ThreadFactory
                public Thread newThread(Runnable runnable) {
                    Thread thread = new Thread(runnable, "systemHttp Dispatcher");
                    thread.setDaemon(false);
                    thread.setPriority(10);
                    return thread;
                }
            });
        }
    }

    @Override // com.bytedance.sdk.component.kg.fxn.hm
    public ExecutorService kg() {
        return this.fxn;
    }

    @Override // com.bytedance.sdk.component.kg.fxn.hm
    public void fxn(int i) {
        this.hm.set(i);
    }

    @Override // com.bytedance.sdk.component.kg.fxn.hm
    public List<com.bytedance.sdk.component.kg.fxn.kg> gff() {
        return this.kg;
    }

    @Override // com.bytedance.sdk.component.kg.fxn.hm
    public List<com.bytedance.sdk.component.kg.fxn.kg> hm() {
        return this.gff;
    }

    @Override // com.bytedance.sdk.component.kg.fxn.hm
    public int fxn() {
        return this.hm.get();
    }
}
