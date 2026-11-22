package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.e3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3188e3 implements ProtobufConverter {
    public static C3635w2 a(BillingInfo billingInfo) {
        C3635w2 c3635w2 = new C3635w2();
        int i = AbstractC3163d3.f18228a[billingInfo.type.ordinal()];
        c3635w2.f18559a = i != 1 ? i != 2 ? 1 : 3 : 2;
        c3635w2.b = billingInfo.productId;
        c3635w2.c = billingInfo.purchaseToken;
        c3635w2.d = billingInfo.purchaseTime;
        c3635w2.e = billingInfo.sendTime;
        return c3635w2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final /* bridge */ /* synthetic */ Object fromModel(Object obj) {
        return a((BillingInfo) obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        C3635w2 c3635w2 = (C3635w2) obj;
        int i = c3635w2.f18559a;
        return new BillingInfo(i != 2 ? i != 3 ? ProductType.UNKNOWN : ProductType.SUBS : ProductType.INAPP, c3635w2.b, c3635w2.c, c3635w2.d, c3635w2.e);
    }
}
