package com.baidu.ar;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;

/* JADX INFO: loaded from: classes16.dex */
public class ud extends ReplacementSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7245a;

    public ud(int r1) {
        this.f7245a = r1;
    }

    public final TextPaint a(Paint paint) {
        TextPaint textPaint = new TextPaint(paint);
        int r3 = this.f7245a;
        if (r3 != -1) {
            textPaint.setTextSize(r3 * textPaint.density);
        }
        return textPaint;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int r11, int r12, float f, int r14, int r15, int r16, Paint paint) {
        TextPaint textPaintA = a(paint);
        Paint.FontMetricsInt fontMetricsInt = textPaintA.getFontMetricsInt();
        canvas.drawText(charSequence, r11, r12, f, r15 - (((((fontMetricsInt.ascent + r15) + r15) + fontMetricsInt.descent) / 2) - ((r14 + r16) / 2)), textPaintA);
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int r3, int r4, Paint.FontMetricsInt fontMetricsInt) {
        return (int) a(paint).measureText(charSequence, r3, r4);
    }
}
