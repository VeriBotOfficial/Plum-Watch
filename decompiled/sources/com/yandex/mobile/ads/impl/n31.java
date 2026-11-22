package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n31 implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final g31 f16302a;
    private final long b;

    public n31(g31 multiBannerAutoSwipeController, long j) {
        Intrinsics.checkNotNullParameter(multiBannerAutoSwipeController, "multiBannerAutoSwipeController");
        this.f16302a = multiBannerAutoSwipeController;
        this.b = j;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        this.f16302a.a(this.b);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        this.f16302a.b();
    }
}
