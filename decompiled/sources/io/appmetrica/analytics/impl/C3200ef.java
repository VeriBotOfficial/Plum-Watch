package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* renamed from: io.appmetrica.analytics.impl.ef, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3200ef implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Integer fromModel(X7 x7) {
        int ordinal = x7.ordinal();
        if (ordinal == 1) {
            return 1;
        }
        if (ordinal != 2) {
            return ordinal != 3 ? 0 : 2;
        }
        return 3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final X7 toModel(Integer num) {
        int intValue = num.intValue();
        if (intValue == 1) {
            return X7.c;
        }
        if (intValue == 2) {
            return X7.e;
        }
        if (intValue != 3) {
            return X7.b;
        }
        return X7.d;
    }
}
