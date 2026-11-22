package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ig<T> {

    /* renamed from: a, reason: collision with root package name */
    private final String f15811a;
    private final String b;
    private final T c;
    private final vr0 d;
    private final boolean e;
    private final boolean f;

    public ig(String name, String type, T t, vr0 vr0Var, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f15811a = name;
        this.b = type;
        this.c = t;
        this.d = vr0Var;
        this.e = z;
        this.f = z2;
    }

    public static ig a(ig igVar, ex0 ex0Var) {
        String name = igVar.f15811a;
        String type = igVar.b;
        vr0 vr0Var = igVar.d;
        boolean z = igVar.e;
        boolean z2 = igVar.f;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        return new ig(name, type, ex0Var, vr0Var, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ig)) {
            return false;
        }
        ig igVar = (ig) obj;
        return Intrinsics.areEqual(this.f15811a, igVar.f15811a) && Intrinsics.areEqual(this.b, igVar.b) && Intrinsics.areEqual(this.c, igVar.c) && Intrinsics.areEqual(this.d, igVar.d) && this.e == igVar.e && this.f == igVar.f;
    }

    public final int hashCode() {
        int a2 = v3.a(this.b, this.f15811a.hashCode() * 31, 31);
        T t = this.c;
        int hashCode = (a2 + (t == null ? 0 : t.hashCode())) * 31;
        vr0 vr0Var = this.d;
        return Boolean.hashCode(this.f) + a7.a(this.e, (hashCode + (vr0Var != null ? vr0Var.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "Asset(name=" + this.f15811a + ", type=" + this.b + ", value=" + this.c + ", link=" + this.d + ", isClickable=" + this.e + ", isRequired=" + this.f + Separators.RPAREN;
    }

    public final String b() {
        return this.f15811a;
    }

    public final String c() {
        return this.b;
    }

    public final T d() {
        return this.c;
    }

    public final boolean e() {
        return this.e;
    }

    public final vr0 a() {
        return this.d;
    }

    public final boolean f() {
        return this.f;
    }
}
