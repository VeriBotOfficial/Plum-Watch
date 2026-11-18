package com.facebook.widget.text.span;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes11.dex */
public class BetterImageSpan extends ReplacementSpan {
    public static final int ALIGN_BASELINE = 1;
    public static final int ALIGN_BOTTOM = 0;
    public static final int ALIGN_CENTER = 2;
    private final int mAlignment;
    private Rect mBounds;
    private final Drawable mDrawable;
    private final Paint.FontMetricsInt mFontMetricsInt;
    protected int mHeight;
    private final Rect mMargin;
    protected int mWidth;

    @Retention(RetentionPolicy.SOURCE)
    public @interface BetterImageSpanAlignment {
    }

    public static final int normalizeAlignment(int r1) {
        if (r1 != 0) {
            return r1 != 2 ? 1 : 2;
        }
        return 0;
    }

    public BetterImageSpan(Drawable drawable) {
        this(drawable, 1);
    }

    public BetterImageSpan(Drawable drawable, int r3) {
        this(drawable, r3, new Rect());
    }

    public BetterImageSpan(Drawable drawable, int r3, Rect rect) {
        this.mFontMetricsInt = new Paint.FontMetricsInt();
        this.mDrawable = drawable;
        this.mAlignment = r3;
        this.mMargin = rect;
        updateBounds();
    }

    public Drawable getDrawable() {
        return this.mDrawable;
    }

    public Rect getMargin() {
        return this.mMargin;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int r3, int r4, Paint.FontMetricsInt fontMetricsInt) {
        updateBounds();
        if (fontMetricsInt == null) {
            return this.mWidth;
        }
        return calculateLineWidthAndFontHeight(fontMetricsInt);
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int r9, int r10, float f, int r12, int r13, int r14, Paint paint) {
        paint.getFontMetricsInt(this.mFontMetricsInt);
        int iconTop = getIconTop(r13, this.mFontMetricsInt.ascent, this.mFontMetricsInt.descent, r12, r14);
        float f2 = f + this.mMargin.left;
        canvas.translate(f2, iconTop);
        this.mDrawable.draw(canvas);
        canvas.translate(-f2, -iconTop);
    }

    public void updateBounds() {
        Rect bounds = this.mDrawable.getBounds();
        this.mBounds = bounds;
        this.mWidth = bounds.width() + this.mMargin.left + this.mMargin.right;
        this.mHeight = this.mBounds.height();
    }

    protected int getOffsetAboveBaseline(int r3, int r4) {
        int r5;
        int r6;
        int r0 = this.mAlignment;
        if (r0 == 0) {
            return (r4 - this.mHeight) - this.mMargin.bottom;
        }
        if (r0 == 2) {
            r5 = r3 + (((((r4 - r3) + this.mMargin.top) + this.mMargin.bottom) - this.mHeight) / 2);
            r6 = this.mMargin.bottom;
        } else {
            r5 = -this.mHeight;
            r6 = this.mMargin.bottom;
        }
        return r5 - r6;
    }

    protected int getIconTop(int r1, int r2, int r3, int r4, int r5) {
        return r1 + getOffsetAboveBaseline(this.mFontMetricsInt.ascent, this.mFontMetricsInt.descent);
    }

    protected int calculateLineWidthAndFontHeight(Paint.FontMetricsInt fontMetricsInt) {
        int r0;
        int offsetAboveBaseline = getOffsetAboveBaseline(fontMetricsInt.ascent, fontMetricsInt.descent);
        int r1 = this.mHeight + offsetAboveBaseline;
        if (this.mAlignment == 2) {
            r0 = offsetAboveBaseline - this.mMargin.top;
            r1 += this.mMargin.bottom;
        } else {
            r0 = offsetAboveBaseline - this.mMargin.top;
        }
        updateFontHeight(fontMetricsInt, r0, r1);
        return this.mWidth;
    }

    protected void updateFontHeight(Paint.FontMetricsInt fontMetricsInt, int r3, int r4) {
        if (r3 < fontMetricsInt.ascent) {
            fontMetricsInt.ascent = r3;
        }
        if (r3 < fontMetricsInt.top) {
            fontMetricsInt.top = r3;
        }
        if (r4 > fontMetricsInt.descent) {
            fontMetricsInt.descent = r4;
        }
        if (r4 > fontMetricsInt.bottom) {
            fontMetricsInt.bottom = r4;
        }
    }
}
