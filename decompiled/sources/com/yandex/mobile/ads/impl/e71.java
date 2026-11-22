package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e71 implements View.OnTouchListener, View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private final to f15355a;
    private final y51 b;

    public e71(Context context, View.OnClickListener onClickListener, to clickAreaVerificationListener, y51 nativeAdHighlightingController) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        Intrinsics.checkNotNullParameter(clickAreaVerificationListener, "clickAreaVerificationListener");
        Intrinsics.checkNotNullParameter(nativeAdHighlightingController, "nativeAdHighlightingController");
        this.f15355a = clickAreaVerificationListener;
        this.b = nativeAdHighlightingController;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent event) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(event, "event");
        this.b.b(view, event);
        return this.f15355a.onTouch(view, event);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f15355a.onClick(view);
    }
}
