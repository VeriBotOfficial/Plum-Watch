package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessorsHolder;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueReporter;

/* loaded from: classes6.dex */
public final class V5 implements U5 {

    /* renamed from: a, reason: collision with root package name */
    public final ModuleAdRevenueReporter f18107a;
    public final C3613v5 b;

    public V5(ModuleAdRevenueReporter moduleAdRevenueReporter, C3613v5 c3613v5) {
        this.f18107a = moduleAdRevenueReporter;
        this.b = c3613v5;
    }

    @Override // io.appmetrica.analytics.impl.U5, io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext
    public final C3613v5 getAdRevenueProcessorsHolder() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.impl.U5, io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext
    public final ModuleAdRevenueReporter getAdRevenueReporter() {
        return this.f18107a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext
    public final ModuleAdRevenueProcessorsHolder getAdRevenueProcessorsHolder() {
        return this.b;
    }
}
