package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.zj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3727zj implements Xa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f18616a;
    public final /* synthetic */ String b;

    public C3727zj(String str, String str2) {
        this.f18616a = str;
        this.b = str2;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya) {
        ya.putAppEnvironmentValue(this.f18616a, this.b);
    }
}
