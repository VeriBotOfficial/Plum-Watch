package com.anythink.core.basead.ui.web;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public class WebProgressBarView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
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

    public WebProgressBarView(Context context, AttributeSet attributeSet, int r3) {
        super(context, attributeSet, r3);
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

    public void setProgress(int r1) {
        this.f3580a = r1;
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
