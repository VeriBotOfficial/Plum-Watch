package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class xi2<T> {

    /* renamed from: a, reason: collision with root package name */
    private final ui2 f17339a;
    private final bd1<T> b;

    public xi2(o3 adConfiguration, aj2<T> volleyResponseBodyParser, br1<T> responseBodyParser, ui2 volleyMapper, bd1<T> responseParser) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(volleyResponseBodyParser, "volleyResponseBodyParser");
        Intrinsics.checkNotNullParameter(responseBodyParser, "responseBodyParser");
        Intrinsics.checkNotNullParameter(volleyMapper, "volleyMapper");
        Intrinsics.checkNotNullParameter(responseParser, "responseParser");
        this.f17339a = volleyMapper;
        this.b = responseParser;
    }

    public final o8<T> a(xc1 networkResponse, Map<String, String> headers, ts responseAdType) {
        Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(responseAdType, "responseAdType");
        this.f17339a.getClass();
        return this.b.a(ui2.a(networkResponse), headers, responseAdType);
    }
}
