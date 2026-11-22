package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class gr0<V extends ViewGroup> {

    /* renamed from: a, reason: collision with root package name */
    private b10<V> f15624a;

    public final void a(ViewGroup container, V designView, fr0<V> layoutDesign) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(designView, "designView");
        Intrinsics.checkNotNullParameter(layoutDesign, "layoutDesign");
        try {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            container.removeAllViews();
            container.addView(designView, layoutParams);
        } catch (Throwable unused) {
        }
        b10<V> a2 = layoutDesign.a();
        this.f15624a = a2;
        if (a2 != null) {
            a2.a(designView);
        }
    }

    public final void a(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        try {
            container.removeAllViews();
            b10<V> b10Var = this.f15624a;
            if (b10Var != null) {
                b10Var.c();
            }
        } catch (Throwable unused) {
        }
    }
}
