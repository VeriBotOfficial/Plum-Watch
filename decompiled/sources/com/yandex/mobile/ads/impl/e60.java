package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e60 {

    /* renamed from: a, reason: collision with root package name */
    private final f60 f15350a;
    private final String b;

    public e60(f60 type, String value) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f15350a = type;
        this.b = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e60)) {
            return false;
        }
        e60 e60Var = (e60) obj;
        return this.f15350a == e60Var.f15350a && Intrinsics.areEqual(this.b, e60Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f15350a.hashCode() * 31);
    }

    public final String toString() {
        return "ExclusionRule(type=" + this.f15350a + ", value=" + this.b + Separators.RPAREN;
    }

    public final f60 a() {
        return this.f15350a;
    }

    public final String b() {
        return this.b;
    }
}
