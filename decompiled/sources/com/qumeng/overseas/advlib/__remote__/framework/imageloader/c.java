package com.qumeng.overseas.advlib.__remote__.framework.imageloader;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes17.dex */
public class c implements ThreadFactory {
    private static final AtomicInteger d = new AtomicInteger(1);

    /* renamed from: a, reason: collision with root package name */
    private final ThreadGroup f12935a;
    private final AtomicInteger b = new AtomicInteger(1);
    private final String c;

    public c(String str) {
        SecurityManager securityManager = System.getSecurityManager();
        this.f12935a = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
        this.c = str + d.getAndIncrement() + "-thread-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread a2 = oqm.a.a(this.f12935a, runnable, this.c + this.b.getAndIncrement(), 0L);
        if (a2.isDaemon()) {
            a2.setDaemon(false);
        }
        if (a2.getPriority() != 10) {
            a2.setPriority(10);
        }
        return a2;
    }
}
