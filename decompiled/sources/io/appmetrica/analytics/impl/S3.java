package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* loaded from: classes6.dex */
public final class S3 extends O2 {
    @Override // io.appmetrica.analytics.impl.O2
    /* renamed from: a */
    public final MessageNano defaultValue() {
        return new R3();
    }

    public final R3 b() {
        return new R3();
    }

    @Override // io.appmetrica.analytics.impl.O2, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final Object defaultValue() {
        return new R3();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final R3 toState(byte[] bArr) {
        return (R3) MessageNano.mergeFrom(new R3(), bArr);
    }
}
