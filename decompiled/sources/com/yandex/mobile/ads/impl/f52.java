package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f52 {

    /* renamed from: a, reason: collision with root package name */
    private final xl1 f15457a;
    private final z1 b;
    private final mz c;
    private final kp d;
    private final aq e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f52)) {
            return false;
        }
        f52 f52Var = (f52) obj;
        return Intrinsics.areEqual(this.f15457a, f52Var.f15457a) && Intrinsics.areEqual(this.b, f52Var.b) && Intrinsics.areEqual(this.c, f52Var.c) && Intrinsics.areEqual(this.d, f52Var.d) && Intrinsics.areEqual(this.e, f52Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f15457a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TimeProviderContainer(progressIncrementer=" + this.f15457a + ", adBlockDurationProvider=" + this.b + ", defaultContentDelayProvider=" + this.c + ", closableAdChecker=" + this.d + ", closeTimerProgressIncrementer=" + this.e + Separators.RPAREN;
    }

    public /* synthetic */ f52(xl1 xl1Var, z1 z1Var, mz mzVar, kp kpVar) {
        this(xl1Var, z1Var, mzVar, kpVar, new aq());
    }

    public f52(xl1 progressIncrementer, z1 adBlockDurationProvider, mz defaultContentDelayProvider, kp closableAdChecker, aq closeTimerProgressIncrementer) {
        Intrinsics.checkNotNullParameter(progressIncrementer, "progressIncrementer");
        Intrinsics.checkNotNullParameter(adBlockDurationProvider, "adBlockDurationProvider");
        Intrinsics.checkNotNullParameter(defaultContentDelayProvider, "defaultContentDelayProvider");
        Intrinsics.checkNotNullParameter(closableAdChecker, "closableAdChecker");
        Intrinsics.checkNotNullParameter(closeTimerProgressIncrementer, "closeTimerProgressIncrementer");
        this.f15457a = progressIncrementer;
        this.b = adBlockDurationProvider;
        this.c = defaultContentDelayProvider;
        this.d = closableAdChecker;
        this.e = closeTimerProgressIncrementer;
    }

    public final xl1 e() {
        return this.f15457a;
    }

    public final z1 a() {
        return this.b;
    }

    public final mz d() {
        return this.c;
    }

    public final kp b() {
        return this.d;
    }

    public final aq c() {
        return this.e;
    }
}
