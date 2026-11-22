package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.common.ImpressionData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class yl2 implements ImpressionData {

    /* renamed from: a, reason: collision with root package name */
    private final t4 f17436a;

    public yl2(t4 impressionData) {
        Intrinsics.checkNotNullParameter(impressionData, "impressionData");
        this.f17436a = impressionData;
    }

    @Override // com.yandex.mobile.ads.common.ImpressionData
    public final String getRawData() {
        return this.f17436a.c();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof yl2) && Intrinsics.areEqual(((yl2) obj).f17436a, this.f17436a);
    }

    public final int hashCode() {
        return this.f17436a.hashCode();
    }
}
