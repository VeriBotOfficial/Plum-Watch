package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* loaded from: classes6.dex */
public final class W4 extends C3675xh {
    public W4(C3474pf c3474pf) {
        super(c3474pf, new CounterConfiguration());
        b().setReporterType(CounterConfigurationReporterType.COMMUTATION);
    }

    @Override // io.appmetrica.analytics.impl.C3675xh
    public final boolean f() {
        return true;
    }
}
