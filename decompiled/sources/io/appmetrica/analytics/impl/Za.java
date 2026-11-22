package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes6.dex */
public interface Za extends InterfaceC3096ab {
    Pa a(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger, boolean z);

    @Override // io.appmetrica.analytics.impl.InterfaceC3096ab
    /* synthetic */ Za a();

    void a(ReporterConfig reporterConfig);

    Pa b(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger, boolean z);

    Ya b(ReporterConfig reporterConfig);

    InterfaceC3121bb b(AppMetricaConfig appMetricaConfig);
}
