package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import java.math.BigDecimal;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public final class E3 {

    /* renamed from: a, reason: collision with root package name */
    public final C3598uf f17824a;
    public final BigDecimal b;
    public final C3424nf c;
    public final C3400mg d;

    public E3(ECommerceCartItem eCommerceCartItem) {
        this(new C3598uf(eCommerceCartItem.getProduct()), eCommerceCartItem.getQuantity(), new C3424nf(eCommerceCartItem.getRevenue()), eCommerceCartItem.getReferrer() == null ? null : new C3400mg(eCommerceCartItem.getReferrer()));
    }

    public final String toString() {
        return "CartItemWrapper{product=" + this.f17824a + ", quantity=" + this.b + ", revenue=" + this.c + ", referrer=" + this.d + AbstractJsonLexerKt.END_OBJ;
    }

    public E3(C3598uf c3598uf, BigDecimal bigDecimal, C3424nf c3424nf, C3400mg c3400mg) {
        this.f17824a = c3598uf;
        this.b = bigDecimal;
        this.c = c3424nf;
        this.d = c3400mg;
    }
}
