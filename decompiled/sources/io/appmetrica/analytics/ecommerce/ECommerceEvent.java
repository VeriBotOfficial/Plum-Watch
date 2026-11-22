package io.appmetrica.analytics.ecommerce;

import io.appmetrica.analytics.impl.B3;
import io.appmetrica.analytics.impl.C3224fe;
import io.appmetrica.analytics.impl.Dk;
import io.appmetrica.analytics.impl.Fk;
import io.appmetrica.analytics.impl.Hk;
import io.appmetrica.analytics.impl.InterfaceC3673xf;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class ECommerceEvent implements InterfaceC3673xf {
    protected ECommerceEvent() {
    }

    public static ECommerceEvent addCartItemEvent(ECommerceCartItem eCommerceCartItem) {
        return new B3(4, eCommerceCartItem);
    }

    public static ECommerceEvent beginCheckoutEvent(ECommerceOrder eCommerceOrder) {
        return new C3224fe(6, eCommerceOrder);
    }

    public static ECommerceEvent purchaseEvent(ECommerceOrder eCommerceOrder) {
        return new C3224fe(7, eCommerceOrder);
    }

    public static ECommerceEvent removeCartItemEvent(ECommerceCartItem eCommerceCartItem) {
        return new B3(5, eCommerceCartItem);
    }

    public static ECommerceEvent showProductCardEvent(ECommerceProduct eCommerceProduct, ECommerceScreen eCommerceScreen) {
        return new Dk(eCommerceProduct, eCommerceScreen);
    }

    public static ECommerceEvent showProductDetailsEvent(ECommerceProduct eCommerceProduct, ECommerceReferrer eCommerceReferrer) {
        return new Fk(eCommerceProduct, eCommerceReferrer);
    }

    public static ECommerceEvent showScreenEvent(ECommerceScreen eCommerceScreen) {
        return new Hk(eCommerceScreen);
    }

    public String getPublicDescription() {
        return "E-commerce base event";
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3673xf
    public abstract /* synthetic */ List toProto();
}
