package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* renamed from: io.appmetrica.analytics.impl.kn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3357kn extends AbstractCallableC3476ph {
    public final int e;
    public final Bundle f;

    public C3357kn(C3285i0 c3285i0, Ck ck, int i, Bundle bundle) {
        super(c3285i0, ck);
        this.e = i;
        this.f = bundle;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC3476ph
    public final void a(IAppMetricaService iAppMetricaService) {
        iAppMetricaService.reportData(this.e, this.f);
    }
}
