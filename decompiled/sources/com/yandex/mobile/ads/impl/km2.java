package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import com.yandex.mobile.ads.instream.InstreamAdRequestConfiguration;
import java.util.Collections;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class km2 implements oi2 {

    /* renamed from: a, reason: collision with root package name */
    private final InstreamAdRequestConfiguration f16036a;

    public km2(InstreamAdRequestConfiguration adRequestConfiguration) {
        Intrinsics.checkNotNullParameter(adRequestConfiguration, "adRequestConfiguration");
        this.f16036a = adRequestConfiguration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof km2) && Intrinsics.areEqual(this.f16036a, ((km2) obj).f16036a);
    }

    public final int hashCode() {
        return this.f16036a.hashCode();
    }

    public final String toString() {
        return "YandexInstreamAdRequestConfigurationAdapter(adRequestConfiguration=" + this.f16036a + Separators.RPAREN;
    }

    @Override // com.yandex.mobile.ads.impl.oi2
    public final String b() {
        return this.f16036a.getCategoryId();
    }

    @Override // com.yandex.mobile.ads.impl.oi2
    public final String a() {
        return this.f16036a.getCom.wakeup.howear.rn.api.burypoint.RnBuryPointApi.KEY_PAGE_ID java.lang.String();
    }

    @Override // com.yandex.mobile.ads.impl.oi2
    public final Map<String, String> getParameters() {
        Map<String, String> parameters = this.f16036a.getParameters();
        if (parameters != null) {
            return parameters;
        }
        Map<String, String> emptyMap = Collections.emptyMap();
        Intrinsics.checkNotNullExpressionValue(emptyMap, "emptyMap(...)");
        return emptyMap;
    }
}
