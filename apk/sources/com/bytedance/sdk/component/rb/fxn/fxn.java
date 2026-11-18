package com.bytedance.sdk.component.rb.fxn;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes15.dex */
public class fxn implements ThreadFactory {
    private final ThreadGroup fxn;
    private final AtomicInteger kg = new AtomicInteger(1);

    public fxn(String str) {
        this.fxn = new ThreadGroup("tt_img_".concat(String.valueOf(str)));
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.fxn, runnable, "tt_img_" + this.kg.getAndIncrement());
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }
}
