package io.appmetrica.analytics.location.impl;

import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory;

/* loaded from: classes6.dex */
public final class o implements LocationReceiverProviderFactory {

    /* renamed from: a, reason: collision with root package name */
    public final q f18638a;

    public o(q qVar) {
        this.f18638a = qVar;
    }

    public final q a() {
        return this.f18638a;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory
    public final LocationReceiverProvider getPassiveLocationReceiverProvider() {
        return this.f18638a;
    }
}
