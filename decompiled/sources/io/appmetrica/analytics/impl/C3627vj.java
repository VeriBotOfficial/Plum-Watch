package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.vj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3627vj implements Xa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f18553a;
    public final /* synthetic */ byte[] b;

    public C3627vj(String str, byte[] bArr) {
        this.f18553a = str;
        this.b = bArr;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya) {
        ya.setSessionExtra(this.f18553a, this.b);
    }
}
