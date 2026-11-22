package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class fi0 extends nk {

    /* renamed from: a, reason: collision with root package name */
    private final nk f15499a;
    private final c92 b;

    public fi0(nk httpStackDelegate, c92 userAgentProvider) {
        Intrinsics.checkNotNullParameter(httpStackDelegate, "httpStackDelegate");
        Intrinsics.checkNotNullParameter(userAgentProvider, "userAgentProvider");
        this.f15499a = httpStackDelegate;
        this.b = userAgentProvider;
    }

    @Override // com.yandex.mobile.ads.impl.nk
    public final ci0 a(up1<?> request, Map<String, String> additionalHeaders) throws IOException, ai {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(additionalHeaders, "additionalHeaders");
        HashMap hashMap = new HashMap();
        hashMap.putAll(additionalHeaders);
        hashMap.put(vh0.U.a(), this.b.a());
        ci0 a2 = this.f15499a.a(request, hashMap);
        Intrinsics.checkNotNullExpressionValue(a2, "executeRequest(...)");
        return a2;
    }
}
