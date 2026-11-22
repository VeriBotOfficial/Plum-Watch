package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.su0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ry1 implements su0 {

    /* renamed from: a, reason: collision with root package name */
    private final su0.a f16809a;

    public /* synthetic */ ry1() {
        this(new su0.a());
    }

    public ry1(su0.a measureSpecHolder) {
        Intrinsics.checkNotNullParameter(measureSpecHolder, "measureSpecHolder");
        this.f16809a = measureSpecHolder;
    }

    @Override // com.yandex.mobile.ads.impl.su0
    public final su0.a a(int i, int i2) {
        su0.a aVar = this.f16809a;
        aVar.f16895a = i;
        aVar.b = i2;
        return aVar;
    }
}
