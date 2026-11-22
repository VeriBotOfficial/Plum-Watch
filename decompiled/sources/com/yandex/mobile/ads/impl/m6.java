package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m6 {

    /* renamed from: a, reason: collision with root package name */
    private final long f16210a;
    private final n6 b;
    private final o6 c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m6)) {
            return false;
        }
        m6 m6Var = (m6) obj;
        return this.f16210a == m6Var.f16210a && Intrinsics.areEqual(this.b, m6Var.b) && this.c == m6Var.c;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.f16210a) * 31;
        n6 n6Var = this.b;
        int hashCode2 = (hashCode + (n6Var == null ? 0 : n6Var.hashCode())) * 31;
        o6 o6Var = this.c;
        return hashCode2 + (o6Var != null ? o6Var.hashCode() : 0);
    }

    public final String toString() {
        return "AdPodItem(duration=" + this.f16210a + ", skip=" + this.b + ", transitionPolicy=" + this.c + Separators.RPAREN;
    }

    public m6(long j, n6 n6Var, o6 o6Var) {
        this.f16210a = j;
        this.b = n6Var;
        this.c = o6Var;
    }

    public final long a() {
        return this.f16210a;
    }

    public final n6 b() {
        return this.b;
    }

    public final o6 c() {
        return this.c;
    }
}
