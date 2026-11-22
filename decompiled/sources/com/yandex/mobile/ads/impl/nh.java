package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class nh implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final ViewTreeObserver.OnGlobalLayoutListener f16340a;

    public nh(ViewTreeObserver.OnGlobalLayoutListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f16340a = listener;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        v.getViewTreeObserver().addOnGlobalLayoutListener(this.f16340a);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        v.getViewTreeObserver().removeOnGlobalLayoutListener(this.f16340a);
    }
}
