package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.z3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3711z3 implements ProtobufConverter {
    public final Rl a(C3661x3 c3661x3) {
        Rl rl = new Rl();
        rl.f18054a = c3661x3.f18574a;
        return rl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        Rl rl = new Rl();
        rl.f18054a = ((C3661x3) obj).f18574a;
        return rl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new C3661x3(((Rl) obj).f18054a);
    }

    public final C3661x3 a(Rl rl) {
        return new C3661x3(rl.f18054a);
    }
}
