package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.km, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3356km implements ProtobufConverter {
    public final Yl a(C3331jm c3331jm) {
        Yl yl = new Yl();
        yl.f18159a = c3331jm.f18348a;
        return yl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        Yl yl = new Yl();
        yl.f18159a = ((C3331jm) obj).f18348a;
        return yl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new C3331jm(((Yl) obj).f18159a);
    }

    public final C3331jm a(Yl yl) {
        return new C3331jm(yl.f18159a);
    }
}
