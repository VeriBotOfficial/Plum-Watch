package com.qumeng.overseas.advlib.__remote__.framework.videoplayer.cache;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes17.dex */
final class a extends Thread {
    private static final int d = 3;
    private static final int e = 8;

    /* renamed from: a, reason: collision with root package name */
    private volatile ServerSocket f13002a;
    private final AtomicBoolean b;
    private final ExecutorService c;

    /* renamed from: com.qumeng.overseas.advlib.__remote__.framework.videoplayer.cache.a$a, reason: collision with other inner class name */
    class ThreadFactoryC0811a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f13003a = new AtomicInteger(0);

        ThreadFactoryC0811a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "VideoProxy-Worker-" + this.f13003a.getAndIncrement());
            thread.setDaemon(true);
            return thread;
        }
    }

    a() {
        super("VideoProxy-Server");
        this.b = new AtomicBoolean(false);
        setDaemon(true);
        this.c = b();
    }

    private ExecutorService b() {
        return new ThreadPoolExecutor(2, 8, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactoryC0811a(), new ThreadPoolExecutor.CallerRunsPolicy());
    }

    boolean a() {
        try {
            this.f13002a = new ServerSocket(0, 8, InetAddress.getByName("127.0.0.1"));
            return true;
        } catch (Throwable unused) {
            for (int i = 0; i < 3; i++) {
                try {
                    this.f13002a = new ServerSocket(((int) (Math.random() * 55000.0d)) + 10000, 8, InetAddress.getByName("127.0.0.1"));
                    return true;
                } catch (Throwable unused2) {
                }
            }
            return false;
        }
    }

    int c() {
        if (this.f13002a != null) {
            return this.f13002a.getLocalPort();
        }
        return -1;
    }

    boolean d() {
        return (!this.b.get() || this.f13002a == null || this.f13002a.isClosed()) ? false : true;
    }

    void e() {
        this.b.set(false);
        interrupt();
        try {
            if (this.f13002a != null && !this.f13002a.isClosed()) {
                this.f13002a.close();
            }
        } catch (Throwable unused) {
        }
        try {
            this.c.shutdownNow();
        } catch (Throwable unused2) {
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        this.b.set(true);
        while (!isInterrupted() && this.b.get() && this.f13002a != null && !this.f13002a.isClosed()) {
            try {
                try {
                    this.c.execute(new b(this.f13002a.accept()));
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
            }
        }
        this.b.set(false);
    }
}
