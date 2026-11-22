package io.appmetrica.analytics.adrevenue.admob.v23.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenue;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;

/* loaded from: classes6.dex */
public abstract class g implements ModuleAdRevenueProcessor {

    /* renamed from: a, reason: collision with root package name */
    protected final d f17635a;
    public final ClientContext b;

    public g(d dVar, ClientContext clientContext) {
        this.f17635a = dVar;
        this.b = clientContext;
    }

    public final void a(ModuleAdRevenue moduleAdRevenue) {
        this.b.getModuleAdRevenueContext().getAdRevenueReporter().reportAutoAdRevenue(moduleAdRevenue);
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Ad Revenue from AdMob was reported", new Object[0]);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final String getDescription() {
        return "AdMob";
    }
}
