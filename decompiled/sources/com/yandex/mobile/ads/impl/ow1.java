package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ow1 implements vr1 {

    /* renamed from: a, reason: collision with root package name */
    private final int f16496a;
    private final String b;

    public ow1(int i, String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f16496a = i;
        this.b = type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ow1)) {
            return false;
        }
        ow1 ow1Var = (ow1) obj;
        return this.f16496a == ow1Var.f16496a && Intrinsics.areEqual(this.b, ow1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f16496a) * 31);
    }

    public final String toString() {
        return "SdkReward(amount=" + this.f16496a + ", type=" + this.b + Separators.RPAREN;
    }

    @Override // com.yandex.mobile.ads.impl.vr1
    public final int getAmount() {
        return this.f16496a;
    }

    @Override // com.yandex.mobile.ads.impl.vr1
    public final String getType() {
        return this.b;
    }
}
