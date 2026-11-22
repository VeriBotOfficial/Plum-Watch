package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a10 {

    /* renamed from: a, reason: collision with root package name */
    private final String f14959a;
    private final String b;
    private final String c;
    private final List<xj0> d;

    public a10(String type, String target, String layout, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.f14959a = type;
        this.b = target;
        this.c = layout;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a10)) {
            return false;
        }
        a10 a10Var = (a10) obj;
        return Intrinsics.areEqual(this.f14959a, a10Var.f14959a) && Intrinsics.areEqual(this.b, a10Var.b) && Intrinsics.areEqual(this.c, a10Var.c) && Intrinsics.areEqual(this.d, a10Var.d);
    }

    public final int hashCode() {
        int a2 = v3.a(this.c, v3.a(this.b, this.f14959a.hashCode() * 31, 31), 31);
        List<xj0> list = this.d;
        return a2 + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Design(type=" + this.f14959a + ", target=" + this.b + ", layout=" + this.c + ", images=" + this.d + Separators.RPAREN;
    }

    public final String d() {
        return this.f14959a;
    }

    public final String c() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public final List<xj0> a() {
        return this.d;
    }
}
