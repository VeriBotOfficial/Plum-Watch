package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;

/* loaded from: classes14.dex */
public class rmu extends com.bytedance.sdk.openadsdk.core.bh.hm {
    private BitmapShader bh;
    private final Paint fxn;
    private int gff;
    private final Matrix hm;
    private int kg;
    private final RectF rb;

    public rmu(Context context) {
        this(context, null);
    }

    public rmu(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public rmu(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.kg = 25;
        this.gff = 25;
        this.rb = new RectF();
        Paint paint = new Paint();
        this.fxn = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        this.hm = new Matrix();
    }

    public void setXRound(int i) {
        this.kg = i;
        postInvalidate();
    }

    public void setYRound(int i) {
        this.gff = i;
        postInvalidate();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.rb.set(0.0f, 0.0f, i, i2);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        Bitmap fxn;
        Drawable drawable = getDrawable();
        if (drawable == null) {
            super.onDraw(canvas);
            return;
        }
        if (Build.VERSION.SDK_INT >= 28 && (drawable instanceof AnimatedImageDrawable)) {
            super.onDraw(canvas);
            return;
        }
        if (this.bh == null && (fxn = fxn(drawable)) != null) {
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.bh = new BitmapShader(fxn, tileMode, tileMode);
            float max = (fxn.getWidth() == getWidth() && fxn.getHeight() == getHeight()) ? 1.0f : Math.max((getWidth() * 1.0f) / fxn.getWidth(), (getHeight() * 1.0f) / fxn.getHeight());
            this.hm.setScale(max, max);
            this.bh.setLocalMatrix(this.hm);
        }
        BitmapShader bitmapShader = this.bh;
        if (bitmapShader != null) {
            this.fxn.setShader(bitmapShader);
            canvas.drawRoundRect(this.rb, this.kg, this.gff, this.fxn);
        } else {
            super.onDraw(canvas);
        }
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        super.unscheduleDrawable(drawable);
        this.bh = null;
    }

    private Bitmap fxn(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int width = drawable.getIntrinsicWidth() <= 0 ? getWidth() : drawable.getIntrinsicWidth();
        int height = drawable.getIntrinsicHeight() <= 0 ? getHeight() : drawable.getIntrinsicHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, width, height);
        drawable.draw(canvas);
        return createBitmap;
    }
}
