package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class hr0<V extends ViewGroup> {

    /* renamed from: a, reason: collision with root package name */
    private final gt1<V> f15719a;

    public final V a(ViewGroup container, fr0<V> layoutDesign) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(layoutDesign, "layoutDesign");
        Context context = container.getContext();
        int c = layoutDesign.c();
        Class<V> d = layoutDesign.d();
        gt1<V> gt1Var = this.f15719a;
        Intrinsics.checkNotNull(context);
        gt1Var.getClass();
        return (V) gt1.a(context, d, c, container);
    }

    public /* synthetic */ hr0() {
        this(new gt1());
    }

    public hr0(gt1<V> safeLayoutInflater) {
        Intrinsics.checkNotNullParameter(safeLayoutInflater, "safeLayoutInflater");
        this.f15719a = safeLayoutInflater;
    }
}
