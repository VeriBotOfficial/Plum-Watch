package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* renamed from: io.appmetrica.analytics.impl.wj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3652wj implements Xa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f18567a;
    public final /* synthetic */ boolean b;

    public C3652wj(AdRevenue adRevenue, boolean z) {
        this.f18567a = adRevenue;
        this.b = z;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya) {
        ya.reportAdRevenue(this.f18567a, this.b);
    }
}
