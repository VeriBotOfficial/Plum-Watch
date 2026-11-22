package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class nh2 {

    /* renamed from: a, reason: collision with root package name */
    private final mh2 f16344a;
    private final nr0 b;
    private final tu0 c;
    private final Map<String, String> d;

    public nh2(mh2 view, nr0 layoutParams, tu0 measured, Map<String, String> additionalInfo) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(layoutParams, "layoutParams");
        Intrinsics.checkNotNullParameter(measured, "measured");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        this.f16344a = view;
        this.b = layoutParams;
        this.c = measured;
        this.d = additionalInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nh2)) {
            return false;
        }
        nh2 nh2Var = (nh2) obj;
        return Intrinsics.areEqual(this.f16344a, nh2Var.f16344a) && Intrinsics.areEqual(this.b, nh2Var.b) && Intrinsics.areEqual(this.c, nh2Var.c) && Intrinsics.areEqual(this.d, nh2Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f16344a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ViewSizeInfo(view=" + this.f16344a + ", layoutParams=" + this.b + ", measured=" + this.c + ", additionalInfo=" + this.d + Separators.RPAREN;
    }

    public final mh2 d() {
        return this.f16344a;
    }

    public final nr0 b() {
        return this.b;
    }

    public final tu0 c() {
        return this.c;
    }

    public final Map<String, String> a() {
        return this.d;
    }
}
