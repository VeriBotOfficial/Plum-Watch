package com.yandex.mobile.ads.impl;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ou {

    /* renamed from: a, reason: collision with root package name */
    private final View f16486a;
    private final RectF b;
    private final Path c;
    private final float[] d;

    public final void a(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.d == null || this.c.isEmpty()) {
            return;
        }
        canvas.clipPath(this.c);
    }

    public /* synthetic */ ou(View view, float f, float f2, float f3, float f4) {
        this(view, f, f2, f3, f4, new RectF(), new Path());
    }

    public ou(View roundView, float f, float f2, float f3, float f4, RectF clipRect, Path clipPath) {
        Intrinsics.checkNotNullParameter(roundView, "roundView");
        Intrinsics.checkNotNullParameter(clipRect, "clipRect");
        Intrinsics.checkNotNullParameter(clipPath, "clipPath");
        this.f16486a = roundView;
        this.b = clipRect;
        this.c = clipPath;
        this.d = a(f, f2, f3, f4);
    }

    private static float[] a(float f, float f2, float f3, float f4) {
        if (f > 0.0f || f2 > 0.0f || f3 > 0.0f || f4 > 0.0f) {
            return new float[]{f, f, f2, f2, f3, f3, f4, f4};
        }
        return null;
    }

    public final void a() {
        if (this.d != null) {
            int measuredWidth = this.f16486a.getMeasuredWidth();
            int measuredHeight = this.f16486a.getMeasuredHeight();
            int paddingLeft = this.f16486a.getPaddingLeft();
            int paddingTop = this.f16486a.getPaddingTop();
            int paddingRight = measuredWidth - this.f16486a.getPaddingRight();
            int paddingBottom = measuredHeight - this.f16486a.getPaddingBottom();
            if (paddingLeft >= paddingRight || paddingTop >= paddingBottom) {
                return;
            }
            this.b.set(paddingLeft, paddingTop, paddingRight, paddingBottom);
            this.c.reset();
            this.c.addRoundRect(this.b, this.d, Path.Direction.CW);
        }
    }
}
