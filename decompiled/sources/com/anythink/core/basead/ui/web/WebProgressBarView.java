package com.anythink.core.basead.ui.web;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes11.dex */
public class WebProgressBarView extends View {

    /* renamed from: a, reason: collision with root package name */
    int f3580a;
    int b;
    Paint c;

    public WebProgressBarView(Context context) {
        super(context);
        a();
    }

    public WebProgressBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public WebProgressBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    private void a() {
        this.b = -14522893;
        Paint paint = new Paint();
        this.c = paint;
        paint.setColor(this.b);
        this.c.setAntiAlias(true);
        this.c.setDither(true);
        this.f3580a = 0;
        setBackgroundColor(16777215);
    }

    public void setProgress(int i) {
        this.f3580a = i;
        postInvalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.drawRect(0.0f, 0.0f, (getWidth() * this.f3580a) / 100, getHeight(), this.c);
        canvas.restore();
    }
}
