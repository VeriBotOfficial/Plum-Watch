package com.qumeng.overseas.advlib.__remote__.ui.elements;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/* JADX INFO: loaded from: classes2.dex */
public class c extends ImageSpan {
    public c(Context context, Bitmap bitmap, int r3) {
        super(context, bitmap, r3);
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int r3, int r4, float f, int r6, int r7, int r8, Paint paint) {
        try {
            Drawable drawable = getDrawable();
            canvas.save();
            canvas.translate(f, (((r8 - r6) - drawable.getBounds().bottom) / 2) + r6);
            drawable.draw(canvas);
            canvas.restore();
        } catch (Exception unused) {
        }
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int r4, int r5, Paint.FontMetricsInt fontMetricsInt) {
        try {
            Rect bounds = getDrawable().getBounds();
            if (fontMetricsInt != null) {
                Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
                int r6 = fontMetricsInt2.bottom - fontMetricsInt2.top;
                int r2 = bounds.bottom - bounds.top;
                int r7 = (r2 / 2) - (r6 / 4);
                int r3 = -((r2 / 2) + (r6 / 4));
                fontMetricsInt.ascent = r3;
                fontMetricsInt.top = r3;
                fontMetricsInt.bottom = r7;
                fontMetricsInt.descent = r7;
            }
            return bounds.right;
        } catch (Exception unused) {
            return 20;
        }
    }
}
