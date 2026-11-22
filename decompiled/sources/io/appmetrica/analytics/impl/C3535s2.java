package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.s2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3535s2 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ql fromModel(BillingConfig billingConfig) {
        Ql ql = new Ql();
        ql.f18035a = billingConfig.sendFrequencySeconds;
        ql.b = billingConfig.firstCollectingInappMaxAgeSeconds;
        return ql;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        Ql ql = (Ql) obj;
        return new BillingConfig(ql.f18035a, ql.b);
    }

    public final BillingConfig a(Ql ql) {
        return new BillingConfig(ql.f18035a, ql.b);
    }
}
