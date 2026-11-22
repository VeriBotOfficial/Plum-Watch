package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.GradientDrawable;

/* loaded from: classes13.dex */
public class kg extends GradientDrawable {
    protected Path fxn;
    private final Paint kg;

    public kg() {
        this.fxn = new Path();
        Paint paint = new Paint(1);
        this.kg = paint;
        paint.setColor(-1);
    }

    public kg(GradientDrawable.Orientation orientation, int[] iArr) {
        super(orientation, iArr);
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
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), this.kg, 31);
        fxn(canvas);
        this.kg.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        canvas.drawPath(this.fxn, this.kg);
        this.kg.setXfermode(null);
        canvas.restoreToCount(saveLayer);
    }

    protected void fxn(Canvas canvas) {
        super.draw(canvas);
    }

    public void fxn(int i, int i2, int i3, int i4) {
        this.fxn.addRect(i, i2, i3, i4, Path.Direction.CW);
        invalidateSelf();
    }
}
