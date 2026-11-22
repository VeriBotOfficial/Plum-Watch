package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public final class Ik implements InterfaceC3268h8 {

    /* renamed from: a, reason: collision with root package name */
    public final Oi f17910a;

    public Ik() {
        this(new Oi());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C3576ti> fromModel(Hk hk) {
        A8 a8 = new A8();
        a8.f17764a = 1;
        a8.b = new C3716z8();
        C3576ti fromModel = this.f17910a.fromModel(hk.f17890a);
        a8.b.f18607a = (C3641w8) fromModel.f18516a;
        C3586u3 c3586u3 = new C3586u3(C3586u3.b(fromModel));
        fromModel.b.getBytesTruncated();
        return Collections.singletonList(new C3576ti(a8, c3586u3));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Ik(Oi oi) {
        this.f17910a = oi;
    }

    public final Hk a(List<C3576ti> list) {
        throw new UnsupportedOperationException();
    }
}
