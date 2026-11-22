package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e30 implements c10 {

    /* renamed from: a, reason: collision with root package name */
    private final o8<?> f15338a;

    public e30(o8<?> adResponse) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        this.f15338a = adResponse;
    }

    @Override // com.yandex.mobile.ads.impl.c10
    public final boolean a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return Intrinsics.areEqual(g10.c.a(), this.f15338a.w());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e30) && Intrinsics.areEqual(this.f15338a, ((e30) obj).f15338a);
    }

    public final int hashCode() {
        return this.f15338a.hashCode();
    }

    public final String toString() {
        return "DivKitDesignConstraint(adResponse=" + this.f15338a + Separators.RPAREN;
    }
}
