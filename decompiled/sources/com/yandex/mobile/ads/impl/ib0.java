package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ib0 {

    /* renamed from: a, reason: collision with root package name */
    private final List<pl0> f15796a;

    public ib0(ArrayList installedPackages) {
        Intrinsics.checkNotNullParameter(installedPackages, "installedPackages");
        this.f15796a = installedPackages;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ib0) && Intrinsics.areEqual(this.f15796a, ((ib0) obj).f15796a);
    }

    public final int hashCode() {
        return this.f15796a.hashCode();
    }

    public final String toString() {
        return "FilteringRule(installedPackages=" + this.f15796a + Separators.RPAREN;
    }
}
