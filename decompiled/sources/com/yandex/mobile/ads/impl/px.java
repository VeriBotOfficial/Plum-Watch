package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class px {

    /* renamed from: a, reason: collision with root package name */
    private final String f16603a;
    private final String b;

    public px(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f16603a = name;
        this.b = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof px)) {
            return false;
        }
        px pxVar = (px) obj;
        return Intrinsics.areEqual(this.f16603a, pxVar.f16603a) && Intrinsics.areEqual(this.b, pxVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f16603a.hashCode() * 31);
    }

    public final String toString() {
        return "DebugPanelMediationAdapterParameterData(name=" + this.f16603a + ", value=" + this.b + Separators.RPAREN;
    }

    public final String a() {
        return this.f16603a;
    }

    public final String b() {
        return this.b;
    }
}
