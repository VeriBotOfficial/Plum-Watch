package com.huawei.hms.opendevice;

import java.util.concurrent.ThreadFactory;

/* compiled from: AsyncThreadFactory.java */
/* loaded from: classes14.dex */
public class c implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final ThreadGroup f10451a;
    private int b = 1;
    private final String c;

    public c(String str) {
        SecurityManager securityManager = System.getSecurityManager();
        this.f10451a = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
        this.c = str + "-pool-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        synchronized (this) {
            this.b++;
        }
        Thread thread = new Thread(this.f10451a, runnable, this.c + this.b, 0L);
        thread.setUncaughtExceptionHandler(null);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }
}
