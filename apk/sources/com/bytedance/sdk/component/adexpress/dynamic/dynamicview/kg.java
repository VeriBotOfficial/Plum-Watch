package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.GradientDrawable;

/* JADX INFO: loaded from: classes15.dex */
public class kg extends GradientDrawable {
    protected Path fxn;
    private final Paint kg;

    public kg() {
        this.fxn = new Path();
        Paint paint = new Paint(1);
        this.kg = paint;
        paint.setColor(-1);
    }

    public kg(GradientDrawable.Orientation orientation, int[] r2) {
        super(orientation, r2);
        this.fxn = new Path();
        Paint paint = new Paint(1);
        this.kg = paint;
        paint.setColor(-1);
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Path path = this.fxn;
        if (path == null || path.isEmpty()) {
            fxn(canvas);
            return;
        }
        int r0 = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), this.kg, 31);
        fxn(canvas);
        this.kg.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        canvas.drawPath(this.fxn, this.kg);
        this.kg.setXfermode(null);
        canvas.restoreToCount(r0);
    }

    protected void fxn(Canvas canvas) {
        super.draw(canvas);
    }

    public void fxn(int r7, int r8, int r9, int r10) {
        this.fxn.addRect(r7, r8, r9, r10, Path.Direction.CW);
        invalidateSelf();
    }
}
