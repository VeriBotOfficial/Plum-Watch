package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public class fk {

    /* renamed from: a, reason: collision with root package name */
    private final gz1 f15505a;

    protected fk(gz1 sizeInfo) {
        Intrinsics.checkNotNullParameter(sizeInfo, "sizeInfo");
        this.f15505a = sizeInfo;
    }

    public final gz1 a() {
        return this.f15505a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof fk) && Intrinsics.areEqual(((fk) obj).f15505a, this.f15505a);
    }

    public final int hashCode() {
        return this.f15505a.hashCode();
    }

    public final String toString() {
        return this.f15505a.toString();
    }
}
