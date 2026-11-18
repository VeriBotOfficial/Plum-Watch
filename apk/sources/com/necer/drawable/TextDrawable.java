package com.necer.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public class TextDrawable extends Drawable {
    private String mText;
    private Paint mTextPaint;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    public TextDrawable(float f) {
        Paint paint = new Paint();
        this.mTextPaint = paint;
        paint.setAntiAlias(true);
        this.mTextPaint.setTextSize(f);
        this.mTextPaint.setTextAlign(Paint.Align.CENTER);
    }

    public void setText(String str) {
        this.mText = str;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.drawColor(-1);
        canvas.drawText(this.mText, bounds.centerX(), getTextBaseLineY(bounds.centerY()), this.mTextPaint);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
        this.mTextPaint.setAlpha(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.mTextPaint.setColorFilter(colorFilter);
    }

    private float getTextBaseLineY(float f) {
        Paint.FontMetrics fontMetrics = this.mTextPaint.getFontMetrics();
        return (f - ((fontMetrics.bottom - fontMetrics.top) / 2.0f)) - fontMetrics.top;
    }
}
