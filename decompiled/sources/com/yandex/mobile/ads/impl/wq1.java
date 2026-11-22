package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class wq1 {

    /* renamed from: a, reason: collision with root package name */
    private final int f17275a;
    private final ar1 b;
    private final Map<String, String> c;

    public wq1(int i, ar1 body, Map<String, String> headers) {
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f17275a = i;
        this.b = body;
        this.c = headers;
    }

    public final int c() {
        return this.f17275a;
    }

    public final ar1 a() {
        return this.b;
    }

    public final Map<String, String> b() {
        return this.c;
    }
}
