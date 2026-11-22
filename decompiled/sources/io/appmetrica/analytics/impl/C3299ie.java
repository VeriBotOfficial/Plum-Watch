package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* renamed from: io.appmetrica.analytics.impl.ie, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3299ie extends AbstractCallableC3476ph {
    public final C3474pf e;

    public C3299ie(C3285i0 c3285i0, Ck ck, C3474pf c3474pf) {
        super(c3285i0, ck);
        this.e = c3474pf;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC3476ph
    public final void a(IAppMetricaService iAppMetricaService) {
        Bundle bundle = new Bundle();
        C3474pf c3474pf = this.e;
        synchronized (c3474pf) {
            bundle.putParcelable("PROCESS_CFG_OBJ", c3474pf);
        }
        iAppMetricaService.pauseUserSession(bundle);
    }
}
