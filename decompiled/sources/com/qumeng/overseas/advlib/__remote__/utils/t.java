package com.qumeng.overseas.advlib.__remote__.utils;

import android.util.Log;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes17.dex */
public class t {
    private static final String h = "SdkInitWatchdog";

    /* renamed from: a, reason: collision with root package name */
    private final String f13246a;
    private final int b;
    private final long c;
    private final AtomicInteger d = new AtomicInteger(0);
    private final AtomicReference<d> e = new AtomicReference<>(d.NEW);
    private final AtomicBoolean f = new AtomicBoolean(false);
    private volatile Runnable g;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f13247a;
        final /* synthetic */ e b;

        a(c cVar, e eVar) {
            this.f13247a = cVar;
            this.b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            if (t.this.b()) {
                t.this.e();
                return;
            }
            try {
            } catch (Throwable th) {
                Log.e(t.h, "[" + t.this.f13246a + "] check exception", th);
                z = false;
            } finally {
            }
            if (!t.this.f.compareAndSet(false, true)) {
                t.this.d();
                return;
            }
            z = this.f13247a.isInitialized();
            if (!z) {
                int incrementAndGet = t.this.d.incrementAndGet();
                if (incrementAndGet < t.this.b) {
                    Log.i(t.h, "[" + t.this.f13246a + "] watchdog checking count=" + incrementAndGet + " thread=" + Thread.currentThread().getName());
                    t.this.d();
                } else if (t.this.c()) {
                    Log.i(t.h, "[" + t.this.f13246a + "] watchdog timeout thread=" + Thread.currentThread().getName());
                    e eVar = this.b;
                    if (eVar != null) {
                        eVar.onTimeout();
                    }
                }
            } else if (t.this.c()) {
                Log.i(t.h, "[" + t.this.f13246a + "] watchdog success thread=" + Thread.currentThread().getName());
                e eVar2 = this.b;
                if (eVar2 != null) {
                    eVar2.onSuccess();
                }
            }
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f13248a;

        b(f fVar) {
            this.f13248a = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (t.this.b()) {
                t.this.e();
                return;
            }
            int incrementAndGet = t.this.d.incrementAndGet();
            if (incrementAndGet < t.this.b) {
                Log.i(t.h, "[" + t.this.f13246a + "] watchdog timeout-only checking count=" + incrementAndGet + " thread=" + Thread.currentThread().getName());
                t.this.d();
            } else if (t.this.c()) {
                Log.i(t.h, "[" + t.this.f13246a + "] watchdog timeout thread=" + Thread.currentThread().getName());
                f fVar = this.f13248a;
                if (fVar != null) {
                    fVar.onTimeout();
                }
            }
        }
    }

    public interface c {
        boolean isInitialized();
    }

    private enum d {
        NEW,
        RUNNING,
        FINISHED
    }

    public interface e {
        void onSuccess();

        void onTimeout();
    }

    public interface f {
        void onTimeout();
    }

    public t(String str, int i, long j) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxChecks must > 0");
        }
        if (j <= 0) {
            throw new IllegalArgumentException("intervalMillis must > 0");
        }
        this.f13246a = str;
        this.b = i;
        this.c = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        Runnable runnable = this.g;
        if (runnable == null || b()) {
            return;
        }
        j.b().postDelayed(runnable, this.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        try {
            Runnable runnable = this.g;
            this.g = null;
            if (runnable != null) {
                j.b().removeCallbacks(runnable);
                Log.i(h, "[" + this.f13246a + "] watchdog stopped");
            }
        } catch (Throwable th) {
            Log.e(h, "[" + this.f13246a + "] watchdog stopped error: " + th.getMessage());
        }
    }

    public void a(c cVar, e eVar) {
        try {
            if (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.e, d.NEW, d.RUNNING)) {
                Log.w(h, "[" + this.f13246a + "] watchdog already started");
                return;
            }
            if (b()) {
                return;
            }
            Log.i(h, "[" + this.f13246a + "] watchdog start thread=" + Thread.currentThread().getName());
            this.g = new a(cVar, eVar);
            d();
            if (b()) {
                e();
            }
        } catch (Throwable th) {
            Log.e(h, "[" + this.f13246a + "] start error: " + th.getMessage());
        }
    }

    public boolean b() {
        return this.e.get() == d.FINISHED;
    }

    public boolean c() {
        d dVar;
        d dVar2;
        do {
            dVar = this.e.get();
            dVar2 = d.FINISHED;
            if (dVar == dVar2) {
                return false;
            }
        } while (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.e, dVar, dVar2));
        e();
        return true;
    }

    public void a(f fVar) {
        try {
            if (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.e, d.NEW, d.RUNNING)) {
                Log.w(h, "[" + this.f13246a + "] watchdog already started");
                return;
            }
            if (b()) {
                return;
            }
            Log.i(h, "[" + this.f13246a + "] watchdog timeout-only start thread=" + Thread.currentThread().getName());
            this.g = new b(fVar);
            d();
            if (b()) {
                e();
            }
        } catch (Throwable th) {
            Log.e(h, "[" + this.f13246a + "] timeout-only start error: " + th.getMessage());
        }
    }

    public void a() {
        Log.i(h, "[" + this.f13246a + "] watchdog cancel");
        c();
    }
}
