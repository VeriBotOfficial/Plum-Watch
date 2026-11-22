package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class cr1<T> implements br1<T> {

    /* renamed from: a, reason: collision with root package name */
    private final aj2<T> f15220a;
    private final ui2 b;

    @Override // com.yandex.mobile.ads.impl.br1
    public final T a(wq1 response) {
        Intrinsics.checkNotNullParameter(response, "networkResponse");
        this.b.getClass();
        Intrinsics.checkNotNullParameter(response, "response");
        return this.f15220a.a(new xc1(response.c(), response.a().a(), response.b(), true));
    }

    public /* synthetic */ cr1(aj2 aj2Var) {
        this(aj2Var, new ui2());
    }

    public cr1(aj2<T> responseBodyParser, ui2 volleyMapper) {
        Intrinsics.checkNotNullParameter(responseBodyParser, "responseBodyParser");
        Intrinsics.checkNotNullParameter(volleyMapper, "volleyMapper");
        this.f15220a = responseBodyParser;
        this.b = volleyMapper;
    }
}
