package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreapi.internal.identifiers.SimpleAdvertisingIdGetter;

/* loaded from: classes6.dex */
public interface Ha extends SimpleAdvertisingIdGetter, Ml {
    AdvertisingIdsHolder a();

    AdvertisingIdsHolder a(InterfaceC3651wi interfaceC3651wi);

    @Override // io.appmetrica.analytics.impl.Ml
    /* synthetic */ void a(Hl hl);

    void b(boolean z);

    AdvertisingIdsHolder getIdentifiers();

    void init();
}
