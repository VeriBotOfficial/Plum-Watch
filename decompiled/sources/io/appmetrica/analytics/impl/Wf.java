package io.appmetrica.analytics.impl;

/* loaded from: classes6.dex */
public final class Wf implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3276hg f18123a;
    public final /* synthetic */ Throwable b;

    public Wf(InterfaceC3276hg interfaceC3276hg, Throwable th) {
        this.f18123a = interfaceC3276hg;
        this.b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18123a.a(this.b);
    }
}
