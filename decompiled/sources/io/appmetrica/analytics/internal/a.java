package io.appmetrica.analytics.internal;

import android.os.Bundle;
import io.appmetrica.analytics.impl.InterfaceC3584u1;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* loaded from: classes6.dex */
public final class a extends IAppMetricaService.Stub {
    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void pauseUserSession(Bundle bundle) {
        InterfaceC3584u1 interfaceC3584u1;
        interfaceC3584u1 = AppMetricaService.c;
        interfaceC3584u1.pauseUserSession(bundle);
    }

    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void reportData(int i, Bundle bundle) {
        InterfaceC3584u1 interfaceC3584u1;
        interfaceC3584u1 = AppMetricaService.c;
        interfaceC3584u1.reportData(i, bundle);
    }

    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void resumeUserSession(Bundle bundle) {
        InterfaceC3584u1 interfaceC3584u1;
        interfaceC3584u1 = AppMetricaService.c;
        interfaceC3584u1.resumeUserSession(bundle);
    }
}
