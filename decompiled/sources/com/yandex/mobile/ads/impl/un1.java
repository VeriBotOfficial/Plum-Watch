package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class un1 {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, String> f17073a;
    private final String b;

    public un1(String body, HashMap headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(body, "body");
        this.f17073a = headers;
        this.b = body;
    }

    public final Map<String, String> b() {
        return this.f17073a;
    }

    public final String a() {
        return this.b;
    }
}
