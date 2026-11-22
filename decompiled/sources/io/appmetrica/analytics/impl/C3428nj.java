package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;

/* renamed from: io.appmetrica.analytics.impl.nj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3428nj implements Xa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ECommerceEvent f18419a;

    public C3428nj(ECommerceEvent eCommerceEvent) {
        this.f18419a = eCommerceEvent;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya) {
        ya.reportECommerce(this.f18419a);
    }
}
