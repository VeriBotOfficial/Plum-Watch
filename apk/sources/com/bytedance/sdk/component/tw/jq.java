package com.bytedance.sdk.component.tw;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes15.dex */
public class jq implements ThreadFactory {
    public static final String THREAD_GROUP_NAME_PRE = "csj_g_";
    public static final String THREAD_NAME_PRE = "csj_";
    public static volatile boolean sCrashHappened;
    protected final ThreadGroup fxn;
    protected int gff;
    private final AtomicInteger hm;
    protected final String kg;

    public jq(String str) {
        this(5, str);
    }

    public jq(int r3, String str) {
        this.hm = new AtomicInteger(1);
        this.gff = r3;
        this.fxn = new ThreadGroup(THREAD_GROUP_NAME_PRE.concat(String.valueOf(str)));
        this.kg = THREAD_NAME_PRE.concat(String.valueOf(str));
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        if (sCrashHappened) {
            return null;
        }
        Thread threadFxn = fxn(this.fxn, runnable, this.kg + this.hm.getAndIncrement());
        if (threadFxn.isDaemon()) {
            threadFxn.setDaemon(false);
        }
        int r0 = this.gff;
        if (r0 > 10 || r0 <= 0) {
            this.gff = 5;
        }
        threadFxn.setPriority(this.gff);
        return threadFxn;
    }

    protected Thread fxn(ThreadGroup threadGroup, Runnable runnable, String str) {
        return new Thread(threadGroup, runnable, str);
    }
}
