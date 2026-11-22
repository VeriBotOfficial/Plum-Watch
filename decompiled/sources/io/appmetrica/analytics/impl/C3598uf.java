package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: io.appmetrica.analytics.impl.uf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3598uf {

    /* renamed from: a, reason: collision with root package name */
    public final String f18537a;
    public final String b;
    public final List c;
    public final Map d;
    public final C3424nf e;
    public final C3424nf f;
    public final List g;

    public C3598uf(ECommerceProduct eCommerceProduct) {
        this(eCommerceProduct.getSku(), eCommerceProduct.getName(), CollectionUtils.arrayListCopyOfNullableCollection(eCommerceProduct.getCategoriesPath()), CollectionUtils.mapCopyOfNullableMap(eCommerceProduct.getPayload()), eCommerceProduct.getActualPrice() == null ? null : new C3424nf(eCommerceProduct.getActualPrice()), eCommerceProduct.getOriginalPrice() != null ? new C3424nf(eCommerceProduct.getOriginalPrice()) : null, CollectionUtils.arrayListCopyOfNullableCollection(eCommerceProduct.getPromocodes()));
    }

    public final String toString() {
        return "ProductWrapper{sku='" + this.f18537a + "', name='" + this.b + "', categoriesPath=" + this.c + ", payload=" + this.d + ", actualPrice=" + this.e + ", originalPrice=" + this.f + ", promocodes=" + this.g + AbstractJsonLexerKt.END_OBJ;
    }

    public C3598uf(String str, String str2, List list, Map map, C3424nf c3424nf, C3424nf c3424nf2, List list2) {
        this.f18537a = str;
        this.b = str2;
        this.c = list;
        this.d = map;
        this.e = c3424nf;
        this.f = c3424nf2;
        this.g = list2;
    }
}
