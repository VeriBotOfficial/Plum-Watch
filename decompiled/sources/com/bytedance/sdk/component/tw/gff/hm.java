package com.bytedance.sdk.component.tw.gff;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes13.dex */
public class hm implements ThreadFactory {
    public static volatile boolean gff;
    protected final ThreadGroup fxn;
    private final AtomicInteger hm = new AtomicInteger(1);
    protected final String kg;

    public hm(String str) {
        this.fxn = new ThreadGroup("pag_g_".concat(String.valueOf(str)));
        this.kg = fxn(str);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        if (gff) {
            return null;
        }
        Thread fxn = fxn(this.fxn, runnable, this.kg + "_" + this.hm.getAndIncrement());
        if (fxn.isDaemon()) {
            fxn.setDaemon(false);
        }
        return fxn;
    }

    protected Thread fxn(ThreadGroup threadGroup, Runnable runnable, String str) {
        return new Thread(threadGroup, runnable, str);
    }

    public static String fxn(String str) {
        return "pag_".concat(String.valueOf(str));
    }
}
