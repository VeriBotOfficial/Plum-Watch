package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e22 extends TextView {

    /* renamed from: a, reason: collision with root package name */
    private Rect f15337a;
    private Paint b;
    private int c;
    private int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e22(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f15337a = new Rect();
        this.b = new Paint();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.c = wh2.a(context2, 1.0f);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.d = wh2.a(context3, 4.0f);
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int a2 = wh2.a(getCurrentTextColor(), 85.0f);
        Paint paint = this.b;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.c);
        paint.setColor(a2);
        int lineCount = getLineCount();
        Layout layout = getLayout();
        for (int i = 0; i < lineCount; i++) {
            int lineBounds = getLineBounds(i, this.f15337a);
            int lineStart = layout.getLineStart(i);
            int lineEnd = layout.getLineEnd(i);
            float primaryHorizontal = layout.getPrimaryHorizontal(lineStart);
            float primaryHorizontal2 = (layout.getPrimaryHorizontal(lineStart + 1) - primaryHorizontal) + layout.getPrimaryHorizontal(lineEnd - 1);
            float f = lineBounds + this.d;
            canvas.drawLine(primaryHorizontal, f, primaryHorizontal2, f, paint);
        }
        super.onDraw(canvas);
    }
}
