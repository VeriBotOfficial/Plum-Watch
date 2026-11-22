package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.ne, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3423ne implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Wl fromModel(C3398me c3398me) {
        Wl wl = new Wl();
        wl.f18126a = c3398me.f18401a;
        wl.b = c3398me.b;
        return wl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        Wl wl = (Wl) obj;
        return new C3398me(wl.f18126a, wl.b);
    }

    public final C3398me a(Wl wl) {
        return new C3398me(wl.f18126a, wl.b);
    }
}
