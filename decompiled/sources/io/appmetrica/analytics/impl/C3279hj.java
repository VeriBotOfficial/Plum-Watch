package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.hj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3279hj implements Xa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f18310a;

    public C3279hj(Throwable th) {
        this.f18310a = th;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya) {
        ya.reportUnhandledException(this.f18310a);
    }
}
