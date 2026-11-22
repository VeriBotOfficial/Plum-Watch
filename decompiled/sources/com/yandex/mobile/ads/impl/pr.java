package com.yandex.mobile.ads.impl;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class pr {

    /* renamed from: a, reason: collision with root package name */
    private final co1 f16597a;

    public final co1 a() {
        return this.f16597a;
    }

    public pr() {
        this(TimeUnit.MINUTES);
    }

    public pr(co1 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f16597a = delegate;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public pr(TimeUnit timeUnit) {
        this(new co1(l42.h, timeUnit));
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
    }
}
