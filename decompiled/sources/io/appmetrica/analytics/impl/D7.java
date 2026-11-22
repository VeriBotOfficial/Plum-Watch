package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.math.BigDecimal;
import java.math.BigInteger;
import kotlin.Pair;
import kotlin.TuplesKt;

/* loaded from: classes6.dex */
public final class D7 implements ProtobufConverter {
    public final BigDecimal a(C3392m8 c3392m8) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3392m8 fromModel(BigDecimal bigDecimal) {
        BigInteger bigInteger = F7.f17845a;
        int i = -bigDecimal.scale();
        BigInteger unscaledValue = bigDecimal.unscaledValue();
        while (true) {
            if (unscaledValue.compareTo(F7.f17845a) <= 0 && unscaledValue.compareTo(F7.b) >= 0) {
                Pair pair = TuplesKt.to(Long.valueOf(unscaledValue.longValue()), Integer.valueOf(i));
                E7 e7 = new E7(((Number) pair.getSecond()).intValue(), ((Number) pair.getFirst()).longValue());
                C3392m8 c3392m8 = new C3392m8();
                c3392m8.f18395a = e7.f17827a;
                c3392m8.b = e7.b;
                return c3392m8;
            }
            unscaledValue = unscaledValue.divide(BigInteger.TEN);
            i++;
        }
    }
}
