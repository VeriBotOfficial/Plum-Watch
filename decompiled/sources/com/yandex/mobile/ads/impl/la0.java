package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class la0 {

    /* renamed from: a, reason: collision with root package name */
    private final ea0 f16092a;
    private final List<n90> b;

    public la0(ea0 state, List<n90> items) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f16092a = state;
        this.b = items;
    }

    public final ea0 a() {
        return this.f16092a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof la0)) {
            return false;
        }
        la0 la0Var = (la0) obj;
        return Intrinsics.areEqual(this.f16092a, la0Var.f16092a) && Intrinsics.areEqual(this.b, la0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f16092a.hashCode() * 31);
    }

    public final String toString() {
        return "FeedState(state=" + this.f16092a + ", items=" + this.b + Separators.RPAREN;
    }

    public final ea0 c() {
        return this.f16092a;
    }

    public final List<n90> b() {
        return this.b;
    }
}
