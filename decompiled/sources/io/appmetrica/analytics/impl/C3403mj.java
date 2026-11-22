package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;

/* renamed from: io.appmetrica.analytics.impl.mj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3403mj implements Xa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Revenue f18405a;

    public C3403mj(Revenue revenue) {
        this.f18405a = revenue;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya) {
        ya.reportRevenue(this.f18405a);
    }
}
