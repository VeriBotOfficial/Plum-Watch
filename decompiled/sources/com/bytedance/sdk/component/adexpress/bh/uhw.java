package com.bytedance.sdk.component.adexpress.bh;

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
import android.widget.ImageView;

/* loaded from: classes13.dex */
public class uhw extends ImageView {
    private Paint fxn;
    private int gff;
    private Matrix hm;
    private int kg;

    public uhw(Context context) {
        this(context, null);
    }

    public uhw(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public uhw(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.kg = 25;
        this.gff = 25;
        Paint paint = new Paint();
        this.fxn = paint;
        paint.setAntiAlias(true);
        this.fxn.setFilterBitmap(true);
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

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        Drawable drawable = getDrawable();
        if (Build.VERSION.SDK_INT >= 28 && (drawable instanceof AnimatedImageDrawable)) {
            super.onDraw(canvas);
            return;
        }
        if (drawable != null) {
            Bitmap fxn = fxn(drawable);
            if (fxn != null) {
                Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                BitmapShader bitmapShader = new BitmapShader(fxn, tileMode, tileMode);
                float max = (fxn.getWidth() == getWidth() && fxn.getHeight() == getHeight()) ? 1.0f : Math.max((getWidth() * 1.0f) / fxn.getWidth(), (getHeight() * 1.0f) / fxn.getHeight());
                this.hm.setScale(max, max);
                bitmapShader.setLocalMatrix(this.hm);
                this.fxn.setShader(bitmapShader);
                canvas.drawRoundRect(new RectF(0.0f, 0.0f, getWidth(), getHeight()), this.kg, this.gff, this.fxn);
                return;
            }
            super.onDraw(canvas);
            return;
        }
        super.onDraw(canvas);
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
