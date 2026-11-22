package com.yandex.mobile.ads.impl;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
final class bz extends Lambda implements Function0<Long> {
    final /* synthetic */ cz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bz(cz czVar) {
        super(0);
        this.b = czVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        TimeUnit timeUnit;
        timeUnit = this.b.f15232a;
        return Long.valueOf(timeUnit.toMillis(cz.a(this.b)));
    }
}
