package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.qk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3504qk extends O2 {
    @Override // io.appmetrica.analytics.impl.O2
    /* renamed from: a */
    public final MessageNano defaultValue() {
        return new C3454ok();
    }

    public final C3454ok b() {
        return new C3454ok();
    }

    @Override // io.appmetrica.analytics.impl.O2, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final Object defaultValue() {
        return new C3454ok();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3454ok toState(byte[] bArr) {
        return (C3454ok) MessageNano.mergeFrom(new C3454ok(), bArr);
    }
}
