package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g6 {

    /* renamed from: a, reason: collision with root package name */
    private final List<m6> f15555a;
    private final int b;
    private final int c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g6)) {
            return false;
        }
        g6 g6Var = (g6) obj;
        return Intrinsics.areEqual(this.f15555a, g6Var.f15555a) && this.b == g6Var.b && this.c == g6Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + dy1.a(this.b, this.f15555a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AdPod(items=" + this.f15555a + ", closableAdPosition=" + this.b + ", rewardAdPosition=" + this.c + Separators.RPAREN;
    }

    public g6(int i, int i2, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f15555a = items;
        this.b = i;
        this.c = i2;
    }

    public final List<m6> b() {
        return this.f15555a;
    }

    public final int a() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }
}
