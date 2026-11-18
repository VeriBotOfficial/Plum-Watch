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

/* JADX INFO: loaded from: classes15.dex */
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

    public uhw(Context context, AttributeSet attributeSet, int r3) {
        super(context, attributeSet, r3);
        this.kg = 25;
        this.gff = 25;
        Paint paint = new Paint();
        this.fxn = paint;
        paint.setAntiAlias(true);
        this.fxn.setFilterBitmap(true);
        this.hm = new Matrix();
    }

    public void setXRound(int r1) {
        this.kg = r1;
        postInvalidate();
    }

    public void setYRound(int r1) {
        this.gff = r1;
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
            Bitmap bitmapFxn = fxn(drawable);
            if (bitmapFxn != null) {
                Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                BitmapShader bitmapShader = new BitmapShader(bitmapFxn, tileMode, tileMode);
                float fMax = (bitmapFxn.getWidth() == getWidth() && bitmapFxn.getHeight() == getHeight()) ? 1.0f : Math.max((getWidth() * 1.0f) / bitmapFxn.getWidth(), (getHeight() * 1.0f) / bitmapFxn.getHeight());
                this.hm.setScale(fMax, fMax);
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
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, width, height);
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }
}
