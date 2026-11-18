package com.baidu.mshield.x0.d.h;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: SecThreadFactory.java */
/* JADX INFO: loaded from: classes15.dex */
public class c implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicInteger f8456a = new AtomicInteger(1);
    public final AtomicInteger b;
    public String c;
    public int d;

    public c() {
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

    public c(int r3) {
        this.b = new AtomicInteger(1);
        this.c = "sec-" + f8456a.getAndIncrement() + "-thread-";
        this.d = r3;
    }
}
