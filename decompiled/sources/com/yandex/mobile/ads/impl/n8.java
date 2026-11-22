package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n8 extends View {

    /* renamed from: a, reason: collision with root package name */
    private final pv f16315a;
    private final Paint b;
    private final Paint c;
    private final Paint d;
    private int e;
    private int f;
    private int g;
    private float h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n8(Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        this.g = this.f16315a.a() ? -7829368 : -1;
        a();
        invalidate();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawColor(0);
        float min = Math.min(getWidth(), getHeight());
        float f = min / 2.0f;
        canvas.drawCircle(f, f, f, this.b);
        float f2 = min / 5.0f;
        float f3 = f - f2;
        float f4 = f + f2;
        canvas.drawLine(f3, f3, f4, f4, this.c);
        canvas.drawLine(f3, f4, f4, f3, this.c);
        float f5 = this.h;
        if (f5 > 0.0f) {
            this.d.setStrokeWidth(f5);
            canvas.drawCircle(f, f, f - this.h, this.d);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() == 0) {
            a(j8.a());
            a();
            invalidate();
        } else if (1 == event.getAction()) {
            a(this.f);
            a();
            invalidate();
        }
        return super.onTouchEvent(event);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n8(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n8(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f16315a = new pv(context);
        this.e = k8.a();
        this.f = k8.a();
        this.g = -1;
        this.h = -1.0f;
        if (attributeSet == null || i == 0) {
            int a2 = k8.a();
            this.f = a2;
            a(a2);
        }
        Paint paint = new Paint(0);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.b = paint;
        Paint paint2 = new Paint(0);
        paint2.setAntiAlias(true);
        paint2.setStrokeWidth(2.0f);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.c = paint2;
        Paint paint3 = new Paint(0);
        paint3.setAntiAlias(true);
        paint3.setStyle(style);
        this.d = paint3;
        a();
    }

    public final void setBorderWidth(float f) {
        this.h = f;
        invalidate();
    }

    public /* synthetic */ n8(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.f = i;
        a(i);
        a();
        invalidate();
    }

    private final void a() {
        this.b.setColor(this.e);
        this.c.setColor(this.g);
        this.d.setColor(this.g);
    }

    private final void a(int i) {
        int a2 = wh2.a(i, 20.0f);
        this.e = a2;
        float[] fArr = new float[3];
        Color.colorToHSV(a2, fArr);
        if (fArr[2] < 0.5f) {
            this.g = this.f16315a.a() ? -7829368 : -1;
        } else {
            this.g = -16777216;
        }
    }
}
