package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceConfiguration;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider;

/* loaded from: classes6.dex */
public final class Gn implements Ml {

    /* renamed from: a, reason: collision with root package name */
    public final UtilityServiceProvider f17878a;

    public Gn(UtilityServiceProvider utilityServiceProvider) {
        this.f17878a = utilityServiceProvider;
    }

    @Override // io.appmetrica.analytics.impl.Ml
    public final void a(Hl hl) {
        this.f17878a.updateConfiguration(new UtilityServiceConfiguration(hl.v, hl.u));
    }
}
