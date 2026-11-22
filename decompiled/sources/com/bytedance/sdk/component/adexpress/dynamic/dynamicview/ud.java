package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes13.dex */
public class ud extends Drawable {
    private Paint fxn;
    private int gff;
    private RectF hm;
    private int kg;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public ud(int i, int i2) {
        this.gff = i;
        this.kg = i2;
        Paint paint = new Paint();
        this.fxn = paint;
        paint.setColor(0);
        this.fxn.setAntiAlias(true);
        this.fxn.setShadowLayer(i2, 0.0f, 0.0f, -16777216);
        this.fxn.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        int i5 = this.kg;
        this.hm = new RectF(i + i5, i2 + i5, i3 - i5, i4 - i5);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        RectF rectF = this.hm;
        int i = this.gff;
        canvas.drawRoundRect(rectF, i, i, this.fxn);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.fxn.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.fxn.setColorFilter(colorFilter);
    }
}
