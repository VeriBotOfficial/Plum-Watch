package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.ma, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3394ma implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC3199ee f18398a;

    public C3394ma() {
        this(new C3604ul());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ul fromModel(C4 c4) {
        Ul ul = new Ul();
        ul.b = c4.b;
        ul.f18100a = c4.f17791a;
        ul.c = c4.c;
        ul.d = c4.d;
        ul.e = c4.e;
        ul.f = this.f18398a.a(c4.f);
        return ul;
    }

    public C3394ma(C3604ul c3604ul) {
        this.f18398a = c3604ul;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4 toModel(Ul ul) {
        A4 a4 = new A4();
        a4.d = ul.d;
        a4.c = ul.c;
        a4.b = ul.b;
        a4.f17760a = ul.f18100a;
        a4.e = ul.e;
        a4.f = this.f18398a.a(ul.f);
        return new C4(a4);
    }
}
