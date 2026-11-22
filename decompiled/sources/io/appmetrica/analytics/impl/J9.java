package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes6.dex */
public final class J9 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Tl fromModel(I9 i9) {
        Tl tl = new Tl();
        if (i9 != null) {
            tl.f18086a = i9.f17903a;
        }
        return tl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new I9(((Tl) obj).f18086a);
    }

    public final I9 a(Tl tl) {
        return new I9(tl.f18086a);
    }
}
