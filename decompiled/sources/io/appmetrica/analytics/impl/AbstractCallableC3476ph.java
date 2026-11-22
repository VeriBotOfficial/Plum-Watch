package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.os.RemoteException;
import io.appmetrica.analytics.internal.IAppMetricaService;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* renamed from: io.appmetrica.analytics.impl.ph, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractCallableC3476ph implements Callable {
    public static final C3451oh d = new C3451oh();

    /* renamed from: a, reason: collision with root package name */
    public final C3285i0 f18455a;
    public final Ck b;
    public boolean c;

    public AbstractCallableC3476ph(C3285i0 c3285i0, Ck ck) {
        this.f18455a = c3285i0;
        this.b = ck;
    }

    public abstract void a(IAppMetricaService iAppMetricaService);

    public void a(Throwable th) {
    }

    public final C3285i0 b() {
        return this.f18455a;
    }

    public boolean c() {
        C3285i0 c3285i0 = this.f18455a;
        synchronized (c3285i0) {
            if (c3285i0.d == null) {
                c3285i0.e = new CountDownLatch(1);
                Intent a2 = AbstractC3180dk.a(c3285i0.f18315a);
                try {
                    c3285i0.g.b(c3285i0.f18315a);
                    c3285i0.f18315a.bindService(a2, c3285i0.i, 1);
                } catch (Throwable unused) {
                }
            }
        }
        this.f18455a.a(5000L);
        return true;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        a();
        return Unit.INSTANCE;
    }

    public final boolean d() {
        return this.c;
    }

    public final void a(boolean z) {
        this.c = z;
    }

    public void a() {
        IAppMetricaService iAppMetricaService;
        try {
            if (this.c) {
                return;
            }
            this.c = true;
            int i = 0;
            do {
                C3285i0 c3285i0 = this.f18455a;
                synchronized (c3285i0) {
                    iAppMetricaService = c3285i0.d;
                }
                if (iAppMetricaService != null) {
                    try {
                        a(iAppMetricaService);
                        Ck ck = this.b;
                        if (ck == null || ((C3103ai) ck).a()) {
                            this.f18455a.c();
                            return;
                        }
                        return;
                    } catch (RemoteException unused) {
                    }
                }
                i++;
                if (!c()) {
                    return;
                }
                AtomicBoolean atomicBoolean = S1.e;
                if (S1.e.get()) {
                    return;
                }
            } while (i < 3);
        } catch (Throwable th) {
            a(th);
        }
    }
}
