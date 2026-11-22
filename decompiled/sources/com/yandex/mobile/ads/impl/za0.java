package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class za0 {

    /* renamed from: a, reason: collision with root package name */
    private final xj0 f17499a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof za0) && Intrinsics.areEqual(this.f17499a, ((za0) obj).f17499a);
    }

    public final int hashCode() {
        xj0 xj0Var = this.f17499a;
        if (xj0Var == null) {
            return 0;
        }
        return xj0Var.hashCode();
    }

    public final String toString() {
        return "FeedbackValue(imageValue=" + this.f17499a + Separators.RPAREN;
    }

    public za0(xj0 xj0Var) {
        this.f17499a = xj0Var;
    }

    public final xj0 a() {
        return this.f17499a;
    }
}
