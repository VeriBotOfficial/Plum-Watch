package com.baidu.mshield.x6.f.m;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: FinThreadFactory.java */
/* JADX INFO: loaded from: classes15.dex */
public class b implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicInteger f8488a = new AtomicInteger(1);
    public final AtomicInteger b;
    public String c;
    public int d;

    public b() {
        this(5);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.c + this.b.getAndIncrement());
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        int r4 = this.d;
        if (r4 != 5) {
            thread.setPriority(r4);
        } else {
            thread.setPriority(5);
        }
        return thread;
    }

    public b(int r3) {
        this.b = new AtomicInteger(1);
        this.c = "fin-" + f8488a.getAndIncrement() + "-thread-";
        this.d = r3;
    }
}
