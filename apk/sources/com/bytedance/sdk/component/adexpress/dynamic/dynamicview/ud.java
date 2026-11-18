package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes15.dex */
public class ud extends Drawable {
    private Paint fxn;
    private int gff;
    private RectF hm;
    private int kg;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public ud(int r3, int r4) {
        this.gff = r3;
        this.kg = r4;
        Paint paint = new Paint();
        this.fxn = paint;
        paint.setColor(0);
        this.fxn.setAntiAlias(true);
        this.fxn.setShadowLayer(r4, 0.0f, 0.0f, -16777216);
        this.fxn.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int r3, int r4, int r5, int r6) {
        super.setBounds(r3, r4, r5, r6);
        int r1 = this.kg;
        this.hm = new RectF(r3 + r1, r4 + r1, r5 - r1, r6 - r1);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        RectF rectF = this.hm;
        int r1 = this.gff;
        canvas.drawRoundRect(rectF, r1, r1, this.fxn);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
        this.fxn.setAlpha(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.fxn.setColorFilter(colorFilter);
    }
}
