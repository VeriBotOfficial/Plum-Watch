package com.anythink.basead.ui.animplayerview.viewpager;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public class CircleIndicatorView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f3192a;
    private final Path b;

    public CircleIndicatorView(Context context) {
        this(context, null);
    }

    public CircleIndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircleIndicatorView(Context context, AttributeSet attributeSet, int r3) {
        super(context, attributeSet, r3);
        this.b = new Path();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        int r2 = Math.min(width, height);
        this.b.reset();
        this.b.addCircle(width, height, r2, Path.Direction.CCW);
        canvas.clipPath(this.b);
        canvas.drawColor(this.f3192a ? -7829368 : -1);
        canvas.restore();
    }

    public void setSelectStatus(boolean z) {
        this.f3192a = z;
        invalidate();
    }
}
