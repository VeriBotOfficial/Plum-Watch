package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.internal.view.SupportMenu;
import com.yandex.mobile.ads.impl.su0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class zl extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final o10 f17536a;
    private final su0 b;
    private final int c;
    private final Paint d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zl(Context context, o10 dimensionConverter, su0 emptySizeMeasureSpecProvider) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dimensionConverter, "dimensionConverter");
        Intrinsics.checkNotNullParameter(emptySizeMeasureSpecProvider, "emptySizeMeasureSpecProvider");
        this.f17536a = dimensionConverter;
        this.b = emptySizeMeasureSpecProvider;
        dimensionConverter.getClass();
        this.c = o10.a(context, 0.5f);
        this.d = new Paint();
        a(context);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float f = this.c;
        canvas.drawRect(f, f, getWidth() - this.c, getHeight() - this.c, this.d);
    }

    public final void setColor(int i) {
        if (this.d.getColor() != i) {
            this.d.setColor(i);
            requestLayout();
        }
    }

    private final void a(Context context) {
        this.f17536a.getClass();
        int a2 = o10.a(context, 1.0f);
        this.d.setStyle(Paint.Style.STROKE);
        this.d.setStrokeWidth(a2);
        this.d.setColor(SupportMenu.CATEGORY_MASK);
        setClickable(false);
        setFocusable(false);
        setWillNotDraw(false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        su0.a a2 = this.b.a(i, i2);
        super.onMeasure(a2.f16895a, a2.b);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object parent = getParent();
        if (parent instanceof View) {
            View view = (View) parent;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            setLeft(0);
            setTop(0);
            setRight(measuredWidth);
            setBottom(measuredHeight);
            super.onLayout(z, 0, 0, measuredWidth, measuredHeight);
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
    }
}
