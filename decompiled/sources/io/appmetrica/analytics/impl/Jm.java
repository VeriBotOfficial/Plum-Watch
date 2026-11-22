package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes6.dex */
public class Jm implements Vj, B9 {

    /* renamed from: a, reason: collision with root package name */
    public final La f17926a;
    public final InterfaceC3405ml b;
    public final AtomicBoolean c = new AtomicBoolean(false);

    public Jm(La la, InterfaceC3405ml interfaceC3405ml) {
        this.f17926a = la;
        this.b = interfaceC3405ml;
        Objects.toString(la.b());
    }

    public void a() {
    }

    public final void b() {
        if (this.c.get()) {
            return;
        }
        e();
        a();
    }

    public final La c() {
        return this.f17926a;
    }

    public final boolean d() {
        return this.c.get();
    }

    public void e() {
        this.b.a();
    }

    @Override // io.appmetrica.analytics.impl.Vj
    public final void onCreate() {
        this.c.compareAndSet(true, false);
    }

    @Override // io.appmetrica.analytics.impl.Vj
    public final void onDestroy() {
        if (this.c.compareAndSet(false, true)) {
            a();
        }
    }

    public final void a(NetworkTask networkTask) {
        C3593ua.E.getClass();
        NetworkServiceLocator.getInstance().getNetworkCore().startTask(networkTask);
    }
}
