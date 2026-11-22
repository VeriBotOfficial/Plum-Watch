package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.g0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC3235g0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3285i0 f18281a;

    public RunnableC3235g0(C3285i0 c3285i0) {
        this.f18281a = c3285i0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3285i0 c3285i0 = this.f18281a;
        synchronized (c3285i0) {
            if (c3285i0.f18315a != null && c3285i0.a()) {
                try {
                    c3285i0.d = null;
                    c3285i0.f18315a.unbindService(c3285i0.i);
                } catch (Throwable unused) {
                }
            }
            c3285i0.d = null;
        }
    }
}
