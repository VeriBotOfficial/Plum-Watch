package io.appmetrica.analytics.ecommerce;

import io.appmetrica.analytics.impl.In;
import java.math.BigDecimal;

/* loaded from: classes6.dex */
public class ECommerceAmount {

    /* renamed from: a, reason: collision with root package name */
    private final BigDecimal f17730a;
    private final String b;

    public ECommerceAmount(long j, String str) {
        this(In.a(j), str);
    }

    public BigDecimal getAmount() {
        return this.f17730a;
    }

    public String getUnit() {
        return this.b;
    }

    public String toString() {
        return "ECommerceAmount{amount=" + this.f17730a + ", unit='" + this.b + "'}";
    }

    public ECommerceAmount(double d, String str) {
        this(new BigDecimal(In.a(d)), str);
    }

    public ECommerceAmount(BigDecimal bigDecimal, String str) {
        this.f17730a = bigDecimal;
        this.b = str;
    }
}
