package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.fj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3229fj implements Xa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f18276a;
    public final /* synthetic */ Throwable b;

    public C3229fj(String str, Throwable th) {
        this.f18276a = str;
        this.b = th;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya) {
        ya.reportError(this.f18276a, this.b);
    }
}
