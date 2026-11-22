package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.g40;
import com.yandex.mobile.ads.impl.h40;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes5.dex */
public final class u50 implements g40 {

    /* renamed from: a, reason: collision with root package name */
    private final g40.a f17020a;

    @Override // com.yandex.mobile.ads.impl.g40
    public final void a(h40.a aVar) {
    }

    @Override // com.yandex.mobile.ads.impl.g40
    public final void b(h40.a aVar) {
    }

    @Override // com.yandex.mobile.ads.impl.g40
    public final fv getCryptoConfig() {
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.g40
    public final UUID getSchemeUuid() {
        return rm.f16778a;
    }

    @Override // com.yandex.mobile.ads.impl.g40
    public final int getState() {
        return 1;
    }

    @Override // com.yandex.mobile.ads.impl.g40
    public final boolean playClearSamplesWithoutKeys() {
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.g40
    public final Map<String, String> queryKeyStatus() {
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.g40
    public final boolean requiresSecureDecoder(String str) {
        return false;
    }

    public u50(g40.a aVar) {
        this.f17020a = (g40.a) hg.a(aVar);
    }

    @Override // com.yandex.mobile.ads.impl.g40
    public final g40.a getError() {
        return this.f17020a;
    }
}
