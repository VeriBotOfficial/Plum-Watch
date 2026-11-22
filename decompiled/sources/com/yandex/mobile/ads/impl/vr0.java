package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class vr0 {

    /* renamed from: a, reason: collision with root package name */
    private final List<x> f17190a;
    private final m80 b;
    private final List<String> c;
    private final String d;
    private final long e;

    /* JADX WARN: Multi-variable type inference failed */
    public vr0(List<? extends x> list, m80 m80Var, List<String> trackingUrls, String str, long j) {
        Intrinsics.checkNotNullParameter(trackingUrls, "trackingUrls");
        this.f17190a = list;
        this.b = m80Var;
        this.c = trackingUrls;
        this.d = str;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vr0)) {
            return false;
        }
        vr0 vr0Var = (vr0) obj;
        return Intrinsics.areEqual(this.f17190a, vr0Var.f17190a) && Intrinsics.areEqual(this.b, vr0Var.b) && Intrinsics.areEqual(this.c, vr0Var.c) && Intrinsics.areEqual(this.d, vr0Var.d) && this.e == vr0Var.e;
    }

    public final int hashCode() {
        List<x> list = this.f17190a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        m80 m80Var = this.b;
        int a2 = aa.a(this.c, (hashCode + (m80Var == null ? 0 : m80Var.hashCode())) * 31, 31);
        String str = this.d;
        return Long.hashCode(this.e) + ((a2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Link(actions=" + this.f17190a + ", falseClick=" + this.b + ", trackingUrls=" + this.c + ", url=" + this.d + ", clickableDelay=" + this.e + Separators.RPAREN;
    }

    public final List<x> a() {
        return this.f17190a;
    }

    public final m80 c() {
        return this.b;
    }

    public final List<String> d() {
        return this.c;
    }

    public final String e() {
        return this.d;
    }

    public final long b() {
        return this.e;
    }
}
