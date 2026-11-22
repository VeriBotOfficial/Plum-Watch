package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ka0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f15999a;

    public ka0(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f15999a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ka0) && Intrinsics.areEqual(this.f15999a, ((ka0) obj).f15999a);
    }

    public final int hashCode() {
        return this.f15999a.hashCode();
    }

    public final String toString() {
        return "FeedSessionData(value=" + this.f15999a + Separators.RPAREN;
    }

    public final String a() {
        return this.f15999a;
    }
}
