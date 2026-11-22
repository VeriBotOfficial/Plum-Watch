package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.y2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3685y2 extends O2 {
    @Override // io.appmetrica.analytics.impl.O2
    /* renamed from: a */
    public final MessageNano defaultValue() {
        return new C3660x2();
    }

    public final C3660x2 b() {
        return new C3660x2();
    }

    @Override // io.appmetrica.analytics.impl.O2, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final Object defaultValue() {
        return new C3660x2();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3660x2 toState(byte[] bArr) throws IOException {
        return (C3660x2) MessageNano.mergeFrom(new C3660x2(), bArr);
    }
}
