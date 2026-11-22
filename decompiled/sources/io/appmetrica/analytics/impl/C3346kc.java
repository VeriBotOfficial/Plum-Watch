package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;

/* renamed from: io.appmetrica.analytics.impl.kc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3346kc extends AbstractC3581tn {
    public final AppMetricaConfig b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3346kc(InterfaceC3096ab interfaceC3096ab, AppMetricaConfig appMetricaConfig) {
        super(interfaceC3096ab);
        String str = appMetricaConfig.apiKey;
        this.b = appMetricaConfig;
    }

    public final InterfaceC3121bb a() {
        return this.f18520a.a().b(this.b);
    }
}
