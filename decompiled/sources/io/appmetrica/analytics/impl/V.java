package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceAmount;
import java.math.BigDecimal;

/* loaded from: classes6.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final BigDecimal f18103a;
    public final String b;

    public V(ECommerceAmount eCommerceAmount) {
        this(eCommerceAmount.getAmount(), eCommerceAmount.getUnit());
    }

    public final String toString() {
        return "AmountWrapper{amount=" + this.f18103a + ", unit='" + this.b + "'}";
    }

    public V(BigDecimal bigDecimal, String str) {
        this.f18103a = bigDecimal;
        this.b = str;
    }
}
