package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.IOException;

/* loaded from: classes6.dex */
public final class Xe extends O2 {
    @Override // io.appmetrica.analytics.impl.O2
    /* renamed from: a */
    public final MessageNano defaultValue() {
        return new C3150cf();
    }

    public final C3150cf b() {
        return new C3150cf();
    }

    @Override // io.appmetrica.analytics.impl.O2, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final Object defaultValue() {
        return new C3150cf();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3150cf toState(byte[] bArr) throws IOException {
        return (C3150cf) MessageNano.mergeFrom(new C3150cf(), bArr);
    }
}
