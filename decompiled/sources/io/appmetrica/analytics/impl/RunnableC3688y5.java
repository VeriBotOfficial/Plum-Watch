package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.y5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC3688y5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Sd f18588a;
    public final /* synthetic */ C3713z5 b;

    public RunnableC3688y5(C3713z5 c3713z5, Sd sd) {
        this.b = c3713z5;
        this.f18588a = sd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b) {
            C3713z5 c3713z5 = this.b;
            Object obj = c3713z5.f18605a;
            if (obj == null) {
                c3713z5.b.add(this.f18588a);
            } else {
                this.f18588a.consume(obj);
            }
        }
    }
}
