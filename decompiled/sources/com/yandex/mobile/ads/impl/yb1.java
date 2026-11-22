package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.TextureView;
import android.widget.FrameLayout;
import com.yandex.mobile.ads.impl.su0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class yb1 extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final af2 f17410a;
    private final TextureView b;
    private final qa1 c;
    private gb1 d;
    private su0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb1(Context context, af2 placeholderView, TextureView textureView, qa1 actionViewsContainer) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placeholderView, "placeholderView");
        Intrinsics.checkNotNullParameter(textureView, "textureView");
        Intrinsics.checkNotNullParameter(actionViewsContainer, "actionViewsContainer");
        this.f17410a = placeholderView;
        this.b = textureView;
        this.c = actionViewsContainer;
        this.e = new ry1();
    }

    public final af2 b() {
        return this.f17410a;
    }

    public final TextureView c() {
        return this.b;
    }

    public final qa1 a() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        su0.a a2 = this.e.a(i, i2);
        super.onMeasure(a2.f16895a, a2.b);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        gb1 gb1Var = this.d;
        if (gb1Var != null) {
            gb1Var.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gb1 gb1Var = this.d;
        if (gb1Var != null) {
            gb1Var.a();
        }
    }

    public final void setAspectRatio(float f) {
        this.e = new lm1(f);
    }

    public final void setOnAttachStateChangeListener(gb1 gb1Var) {
        this.d = gb1Var;
    }
}
