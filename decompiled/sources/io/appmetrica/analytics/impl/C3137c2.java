package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.c2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3137c2 extends O2 {
    @Override // io.appmetrica.analytics.impl.O2
    /* renamed from: a */
    public final MessageNano defaultValue() {
        return new C3112b2();
    }

    public final C3112b2 b() {
        return new C3112b2();
    }

    @Override // io.appmetrica.analytics.impl.O2, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final Object defaultValue() {
        return new C3112b2();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3112b2 toState(byte[] bArr) throws IOException {
        return (C3112b2) MessageNano.mergeFrom(new C3112b2(), bArr);
    }
}
