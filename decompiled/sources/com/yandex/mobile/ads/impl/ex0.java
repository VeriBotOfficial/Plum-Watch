package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ex0 {

    /* renamed from: a, reason: collision with root package name */
    private final wu0 f15428a;
    private final lb2 b;
    private final List<xj0> c;

    public static ex0 a(ex0 ex0Var, lb2 lb2Var) {
        wu0 wu0Var = ex0Var.f15428a;
        List<xj0> list = ex0Var.c;
        ex0Var.getClass();
        return new ex0(wu0Var, lb2Var, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ex0)) {
            return false;
        }
        ex0 ex0Var = (ex0) obj;
        return Intrinsics.areEqual(this.f15428a, ex0Var.f15428a) && Intrinsics.areEqual(this.b, ex0Var.b) && Intrinsics.areEqual(this.c, ex0Var.c);
    }

    public final int hashCode() {
        wu0 wu0Var = this.f15428a;
        int hashCode = (wu0Var == null ? 0 : wu0Var.hashCode()) * 31;
        lb2 lb2Var = this.b;
        int hashCode2 = (hashCode + (lb2Var == null ? 0 : lb2Var.hashCode())) * 31;
        List<xj0> list = this.c;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "MediaValue(media=" + this.f15428a + ", video=" + this.b + ", imageValues=" + this.c + Separators.RPAREN;
    }

    public ex0(wu0 wu0Var, lb2 lb2Var, List<xj0> list) {
        this.f15428a = wu0Var;
        this.b = lb2Var;
        this.c = list;
    }

    public final wu0 b() {
        return this.f15428a;
    }

    public final lb2 c() {
        return this.b;
    }

    public final List<xj0> a() {
        return this.c;
    }
}
