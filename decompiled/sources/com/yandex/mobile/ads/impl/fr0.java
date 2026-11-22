package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import android.view.ViewGroup;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class fr0<V extends ViewGroup> {

    /* renamed from: a, reason: collision with root package name */
    private final int f15523a;
    private final Class<V> b;
    private final b10<V> c;
    private final c10 d;

    public fr0(int i, ar designComponentBinder, c10 designConstraint) {
        Intrinsics.checkNotNullParameter(ExtendedNativeAdView.class, "layoutViewClass");
        Intrinsics.checkNotNullParameter(designComponentBinder, "designComponentBinder");
        Intrinsics.checkNotNullParameter(designConstraint, "designConstraint");
        this.f15523a = i;
        this.b = ExtendedNativeAdView.class;
        this.c = designComponentBinder;
        this.d = designConstraint;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fr0)) {
            return false;
        }
        fr0 fr0Var = (fr0) obj;
        return this.f15523a == fr0Var.f15523a && Intrinsics.areEqual(this.b, fr0Var.b) && Intrinsics.areEqual(this.c, fr0Var.c) && Intrinsics.areEqual(this.d, fr0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.f15523a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "LayoutDesign(layoutId=" + this.f15523a + ", layoutViewClass=" + this.b + ", designComponentBinder=" + this.c + ", designConstraint=" + this.d + Separators.RPAREN;
    }

    public final int c() {
        return this.f15523a;
    }

    public final Class<V> d() {
        return this.b;
    }

    public final b10<V> a() {
        return this.c;
    }

    public final c10 b() {
        return this.d;
    }
}
