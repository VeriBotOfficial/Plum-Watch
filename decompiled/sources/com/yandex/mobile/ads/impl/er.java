package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.su0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class er implements su0 {

    /* renamed from: a, reason: collision with root package name */
    private final su0.a f15413a;
    private final su0[] b;

    public er(su0... measureSpecProviders) {
        Intrinsics.checkNotNullParameter(measureSpecProviders, "measureSpecProviders");
        this.f15413a = new su0.a();
        this.b = measureSpecProviders;
    }

    @Override // com.yandex.mobile.ads.impl.su0
    public final su0.a a(int i, int i2) {
        su0[] su0VarArr = this.b;
        int length = su0VarArr.length;
        int i3 = 0;
        while (i3 < length) {
            su0.a a2 = su0VarArr[i3].a(i, i2);
            int i4 = a2.f16895a;
            i3++;
            i2 = a2.b;
            i = i4;
        }
        su0.a aVar = this.f15413a;
        aVar.f16895a = i;
        aVar.b = i2;
        return aVar;
    }
}
