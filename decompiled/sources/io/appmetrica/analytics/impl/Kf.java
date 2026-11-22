package io.appmetrica.analytics.impl;

/* loaded from: classes6.dex */
public final class Kf implements InterfaceC3276hg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Rf f17938a;

    public Kf(Rf rf) {
        this.f17938a = rf;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3276hg
    public final void a(C3151cg c3151cg) {
        Rf rf = this.f17938a;
        Rf.a(rf, c3151cg, (Jf) rf.d.getValue());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3276hg
    public final void a(Throwable th) {
        Rf rf = this.f17938a;
        Rf.a(rf, null, (Jf) rf.d.getValue());
    }
}
