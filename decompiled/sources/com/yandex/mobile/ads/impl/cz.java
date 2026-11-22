package com.yandex.mobile.ads.impl;

import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class cz {

    /* renamed from: a, reason: collision with root package name */
    private final TimeUnit f15232a;
    private final Lazy b;

    public cz(TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        this.f15232a = timeUnit;
        this.b = LazyKt.lazy(new bz(this));
    }

    public static final /* synthetic */ long a(cz czVar) {
        czVar.getClass();
        return 1L;
    }

    public final long a() {
        return ((Number) this.b.getValue()).longValue();
    }
}
