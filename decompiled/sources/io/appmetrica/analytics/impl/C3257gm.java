package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.gm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3257gm implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Xl fromModel(C3232fm c3232fm) {
        Xl xl = new Xl();
        xl.f18141a = c3232fm.f18279a;
        return xl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new C3232fm(((Xl) obj).f18141a);
    }

    public final C3232fm a(Xl xl) {
        return new C3232fm(xl.f18141a);
    }
}
