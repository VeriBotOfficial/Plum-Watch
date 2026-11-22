package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final String f15441a;
    private final Set<Long> b;

    public f() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.areEqual(this.f15441a, fVar.f15441a) && Intrinsics.areEqual(this.b, fVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f15441a.hashCode() * 31);
    }

    public final String toString() {
        return "AbExperimentData(experiments=" + this.f15441a + ", triggeredTestIds=" + this.b + Separators.RPAREN;
    }

    public /* synthetic */ f(int i) {
        this("", SetsKt.emptySet());
    }

    public final String a() {
        return this.f15441a;
    }

    public f(String experiments, Set<Long> triggeredTestIds) {
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(triggeredTestIds, "triggeredTestIds");
        this.f15441a = experiments;
        this.b = triggeredTestIds;
    }

    public final Set<Long> b() {
        return this.b;
    }
}
