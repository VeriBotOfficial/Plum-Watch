package io.appmetrica.analytics.ecommerce;

import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public class ECommerceOrder {

    /* renamed from: a, reason: collision with root package name */
    private final String f17732a;
    private final List b;
    private Map c;

    public ECommerceOrder(String str, List<ECommerceCartItem> list) {
        this.f17732a = str;
        this.b = list;
    }

    public List<ECommerceCartItem> getCartItems() {
        return this.b;
    }

    public String getIdentifier() {
        return this.f17732a;
    }

    public Map<String, String> getPayload() {
        return this.c;
    }

    public ECommerceOrder setPayload(Map<String, String> map) {
        this.c = map;
        return this;
    }

    public String toString() {
        return "ECommerceOrder{identifier='" + this.f17732a + "', cartItems=" + this.b + ", payload=" + this.c + AbstractJsonLexerKt.END_OBJ;
    }
}
