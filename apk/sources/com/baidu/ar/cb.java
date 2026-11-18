package com.baidu.ar;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes16.dex */
public class cb {
    public static volatile cb e;
    public ScheduledExecutorService b;
    public b c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f6856a = true;
    public Runnable d = new a();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (cb.this.f6856a || cb.this.c == null) {
                return;
            }
            cb.this.c.updateRender();
        }
    }

    public interface b {
        void updateRender();
    }

    public static cb b() {
        if (e == null) {
            synchronized (cb.class) {
                if (e == null) {
                    e = new cb();
                }
            }
        }
        return e;
    }

    public final void a() {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.b = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(this.d, 0L, 40L, TimeUnit.MILLISECONDS);
    }

    public void a(b bVar) {
        this.c = bVar;
    }

    public void c() {
        this.f6856a = true;
    }

    public void d() {
        this.f6856a = true;
        ScheduledExecutorService scheduledExecutorService = this.b;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
            this.b = null;
        }
    }

    public void e() {
        this.f6856a = false;
        ScheduledExecutorService scheduledExecutorService = this.b;
        if (scheduledExecutorService == null || scheduledExecutorService.isTerminated()) {
            a();
        }
    }
}
