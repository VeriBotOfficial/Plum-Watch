package com.scwang.smart.drawable;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public abstract class PaintDrawable extends Drawable {
    protected Paint mPaint;

    @Override // android.graphics.drawable.Drawable
    @Deprecated
    public int getOpacity() {
        return -3;
    }

    protected PaintDrawable() {
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setStyle(Paint.Style.FILL);
        this.mPaint.setAntiAlias(true);
        this.mPaint.setColor(-5592406);
    }

    public void setColor(int r2) {
        this.mPaint.setColor(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
        this.mPaint.setAlpha(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.mPaint.setColorFilter(colorFilter);
    }
}
