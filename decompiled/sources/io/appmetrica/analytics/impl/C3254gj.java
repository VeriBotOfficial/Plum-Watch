package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.gj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3254gj implements Xa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f18295a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Throwable c;

    public C3254gj(String str, String str2, Throwable th) {
        this.f18295a = str;
        this.b = str2;
        this.c = th;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya) {
        ya.reportError(this.f18295a, this.b, this.c);
    }
}
