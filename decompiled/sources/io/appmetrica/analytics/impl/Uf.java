package io.appmetrica.analytics.impl;

/* loaded from: classes6.dex */
public final class Uf implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3151cg f18095a;
    public final /* synthetic */ Vf b;

    public Uf(Vf vf, C3151cg c3151cg) {
        this.b = vf;
        this.f18095a = c3151cg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.f18110a.a(this.f18095a);
    }
}
