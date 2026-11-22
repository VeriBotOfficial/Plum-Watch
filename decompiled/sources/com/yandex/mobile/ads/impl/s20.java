package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s20 {

    /* renamed from: a, reason: collision with root package name */
    private final t20 f16826a;
    private final String b;

    public s20(t20 type, String assetName) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        this.f16826a = type;
        this.b = assetName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s20)) {
            return false;
        }
        s20 s20Var = (s20) obj;
        return this.f16826a == s20Var.f16826a && Intrinsics.areEqual(this.b, s20Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f16826a.hashCode() * 31);
    }

    public final String toString() {
        return "DivKitAsset(type=" + this.f16826a + ", assetName=" + this.b + Separators.RPAREN;
    }

    public final String a() {
        return this.b;
    }

    public final t20 b() {
        return this.f16826a;
    }
}
