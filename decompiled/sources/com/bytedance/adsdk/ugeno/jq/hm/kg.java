package com.bytedance.adsdk.ugeno.jq.hm;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;
import android.widget.ImageView;
import java.util.HashSet;

/* loaded from: classes13.dex */
public class kg extends Drawable {
    private final int bh;
    private float ckl;
    private final RectF dgx;
    private ImageView.ScaleType dx;
    private final RectF gff;
    private final Matrix hie;
    private final Bitmap hm;
    private float je;
    private final Paint jq;
    private Shader.TileMode mvp;
    private final Paint rb;
    private Shader.TileMode rlu;
    private boolean rmu;

    /* renamed from: sg, reason: collision with root package name */
    private final int f9293sg;
    private final RectF tw;
    private ColorStateList ud;
    private final boolean[] xdg;
    private boolean zu;
    private final RectF fxn = new RectF();
    private final RectF kg = new RectF();

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public kg(Bitmap bitmap) {
        RectF rectF = new RectF();
        this.gff = rectF;
        this.tw = new RectF();
        this.hie = new Matrix();
        this.dgx = new RectF();
        this.mvp = Shader.TileMode.CLAMP;
        this.rlu = Shader.TileMode.CLAMP;
        this.zu = true;
        this.ckl = 0.0f;
        this.xdg = new boolean[]{true, true, true, true};
        this.rmu = false;
        this.je = 0.0f;
        this.ud = ColorStateList.valueOf(-16777216);
        this.dx = ImageView.ScaleType.FIT_CENTER;
        this.hm = bitmap;
        int width = bitmap.getWidth();
        this.bh = width;
        int height = bitmap.getHeight();
        this.f9293sg = height;
        rectF.set(0.0f, 0.0f, width, height);
        Paint paint = new Paint();
        this.rb = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.jq = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(this.ud.getColorForState(getState(), -16777216));
        paint2.setStrokeWidth(this.je);
    }

    public static kg fxn(Bitmap bitmap) {
        if (bitmap != null) {
            return new kg(bitmap);
        }
        return null;
    }

    public static Drawable fxn(Drawable drawable) {
        if (drawable != null) {
            if (drawable instanceof kg) {
                return drawable;
            }
            if (Build.VERSION.SDK_INT >= 28 && (drawable instanceof AnimatedImageDrawable)) {
                return drawable;
            }
            if (drawable instanceof LayerDrawable) {
                Drawable.ConstantState constantState = drawable.mutate().getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                for (int i = 0; i < numberOfLayers; i++) {
                    layerDrawable.setDrawableByLayerId(layerDrawable.getId(i), fxn(layerDrawable.getDrawable(i)));
                }
                return layerDrawable;
            }
        }
        Bitmap kg = kg(drawable);
        return kg != null ? new kg(kg) : drawable;
    }

    public static Bitmap kg(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(Math.max(drawable.getIntrinsicWidth(), 2), Math.max(drawable.getIntrinsicHeight(), 2), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return createBitmap;
        } catch (Throwable unused) {
            Log.w("RoundedDrawable", "Failed to create bitmap from drawable!");
            return null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.ud.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int colorForState = this.ud.getColorForState(iArr, 0);
        if (this.jq.getColor() != colorForState) {
            this.jq.setColor(colorForState);
            return true;
        }
        return super.onStateChange(iArr);
    }

    /* renamed from: com.bytedance.adsdk.ugeno.jq.hm.kg$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] fxn;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            fxn = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                fxn[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                fxn[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                fxn[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                fxn[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                fxn[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                fxn[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private void fxn() {
        float width;
        float height;
        int i = AnonymousClass1.fxn[this.dx.ordinal()];
        if (i == 1) {
            this.tw.set(this.fxn);
            RectF rectF = this.tw;
            float f = this.je;
            rectF.inset(f / 2.0f, f / 2.0f);
            this.hie.reset();
            this.hie.setTranslate((int) (((this.tw.width() - this.bh) * 0.5f) + 0.5f), (int) (((this.tw.height() - this.f9293sg) * 0.5f) + 0.5f));
        } else if (i == 2) {
            this.tw.set(this.fxn);
            RectF rectF2 = this.tw;
            float f2 = this.je;
            rectF2.inset(f2 / 2.0f, f2 / 2.0f);
            this.hie.reset();
            float f3 = 0.0f;
            if (this.bh * this.tw.height() > this.tw.width() * this.f9293sg) {
                width = this.tw.height() / this.f9293sg;
                height = 0.0f;
                f3 = (this.tw.width() - (this.bh * width)) * 0.5f;
            } else {
                width = this.tw.width() / this.bh;
                height = (this.tw.height() - (this.f9293sg * width)) * 0.5f;
            }
            this.hie.setScale(width, width);
            Matrix matrix = this.hie;
            float f4 = this.je;
            matrix.postTranslate(((int) (f3 + 0.5f)) + (f4 / 2.0f), ((int) (height + 0.5f)) + (f4 / 2.0f));
        } else if (i == 3) {
            this.hie.reset();
            float min = (((float) this.bh) > this.fxn.width() || ((float) this.f9293sg) > this.fxn.height()) ? Math.min(this.fxn.width() / this.bh, this.fxn.height() / this.f9293sg) : 1.0f;
            float width2 = (int) (((this.fxn.width() - (this.bh * min)) * 0.5f) + 0.5f);
            float height2 = (int) (((this.fxn.height() - (this.f9293sg * min)) * 0.5f) + 0.5f);
            this.hie.setScale(min, min);
            this.hie.postTranslate(width2, height2);
            this.tw.set(this.gff);
            this.hie.mapRect(this.tw);
            RectF rectF3 = this.tw;
            float f5 = this.je;
            rectF3.inset(f5 / 2.0f, f5 / 2.0f);
            this.hie.setRectToRect(this.gff, this.tw, Matrix.ScaleToFit.FILL);
        } else if (i == 5) {
            this.tw.set(this.gff);
            this.hie.setRectToRect(this.gff, this.fxn, Matrix.ScaleToFit.END);
            this.hie.mapRect(this.tw);
            RectF rectF4 = this.tw;
            float f6 = this.je;
            rectF4.inset(f6 / 2.0f, f6 / 2.0f);
            this.hie.setRectToRect(this.gff, this.tw, Matrix.ScaleToFit.FILL);
        } else if (i == 6) {
            this.tw.set(this.gff);
            this.hie.setRectToRect(this.gff, this.fxn, Matrix.ScaleToFit.START);
            this.hie.mapRect(this.tw);
            RectF rectF5 = this.tw;
            float f7 = this.je;
            rectF5.inset(f7 / 2.0f, f7 / 2.0f);
            this.hie.setRectToRect(this.gff, this.tw, Matrix.ScaleToFit.FILL);
        } else if (i != 7) {
            this.tw.set(this.gff);
            this.hie.setRectToRect(this.gff, this.fxn, Matrix.ScaleToFit.CENTER);
            this.hie.mapRect(this.tw);
            RectF rectF6 = this.tw;
            float f8 = this.je;
            rectF6.inset(f8 / 2.0f, f8 / 2.0f);
            this.hie.setRectToRect(this.gff, this.tw, Matrix.ScaleToFit.FILL);
        } else {
            this.tw.set(this.fxn);
            RectF rectF7 = this.tw;
            float f9 = this.je;
            rectF7.inset(f9 / 2.0f, f9 / 2.0f);
            this.hie.reset();
            this.hie.setRectToRect(this.gff, this.tw, Matrix.ScaleToFit.FILL);
        }
        this.kg.set(this.tw);
        this.zu = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.fxn.set(rect);
        fxn();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.zu) {
            BitmapShader bitmapShader = new BitmapShader(this.hm, this.mvp, this.rlu);
            if (this.mvp == Shader.TileMode.CLAMP && this.rlu == Shader.TileMode.CLAMP) {
                bitmapShader.setLocalMatrix(this.hie);
            }
            this.rb.setShader(bitmapShader);
            this.zu = false;
        }
        if (this.rmu) {
            if (this.je > 0.0f) {
                canvas.drawOval(this.kg, this.rb);
                canvas.drawOval(this.tw, this.jq);
                return;
            } else {
                canvas.drawOval(this.kg, this.rb);
                return;
            }
        }
        if (fxn(this.xdg)) {
            float f = this.ckl;
            if (this.je > 0.0f) {
                canvas.drawRoundRect(this.kg, f, f, this.rb);
                canvas.drawRoundRect(this.tw, f, f, this.jq);
                fxn(canvas);
                kg(canvas);
                return;
            }
            canvas.drawRoundRect(this.kg, f, f, this.rb);
            fxn(canvas);
            return;
        }
        canvas.drawRect(this.kg, this.rb);
        if (this.je > 0.0f) {
            canvas.drawRect(this.tw, this.jq);
        }
    }

    private void fxn(Canvas canvas) {
        if (kg(this.xdg) || this.ckl == 0.0f) {
            return;
        }
        float f = this.kg.left;
        float f2 = this.kg.top;
        float width = this.kg.width() + f;
        float height = this.kg.height() + f2;
        float f3 = this.ckl;
        if (!this.xdg[0]) {
            this.dgx.set(f, f2, f + f3, f2 + f3);
            canvas.drawRect(this.dgx, this.rb);
        }
        if (!this.xdg[1]) {
            this.dgx.set(width - f3, f2, width, f3);
            canvas.drawRect(this.dgx, this.rb);
        }
        if (!this.xdg[2]) {
            this.dgx.set(width - f3, height - f3, width, height);
            canvas.drawRect(this.dgx, this.rb);
        }
        if (this.xdg[3]) {
            return;
        }
        this.dgx.set(f, height - f3, f3 + f, height);
        canvas.drawRect(this.dgx, this.rb);
    }

    private void kg(Canvas canvas) {
        float f;
        float f2;
        if (kg(this.xdg) || this.ckl == 0.0f) {
            return;
        }
        float f3 = this.kg.left;
        float f4 = this.kg.top;
        float width = this.kg.width() + f3;
        float height = f4 + this.kg.height();
        float f5 = this.ckl;
        float f6 = this.je / 2.0f;
        if (this.xdg[0]) {
            f = f4;
        } else {
            f = f4;
            canvas.drawLine(f3 - f6, f4, f3 + f5, f, this.jq);
            canvas.drawLine(f3, f - f6, f3, f + f5, this.jq);
        }
        if (!this.xdg[1]) {
            float f7 = f;
            canvas.drawLine((width - f5) - f6, f7, width, f, this.jq);
            canvas.drawLine(width, f7 - f6, width, f7 + f5, this.jq);
            width = width;
        }
        if (this.xdg[2]) {
            f2 = height;
        } else {
            canvas.drawLine((width - f5) - f6, height, width + f6, height, this.jq);
            float f8 = width;
            canvas.drawLine(f8, height - f5, width, height, this.jq);
            f2 = height;
        }
        if (this.xdg[3]) {
            return;
        }
        canvas.drawLine(f3 - f6, f2, f3 + f5, f2, this.jq);
        canvas.drawLine(f3, f2 - f5, f3, f2, this.jq);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.rb.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.rb.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.rb.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.rb.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.rb.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.rb.setFilterBitmap(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.bh;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f9293sg;
    }

    public kg fxn(float f, float f2, float f3, float f4) {
        HashSet hashSet = new HashSet(4);
        hashSet.add(Float.valueOf(f));
        hashSet.add(Float.valueOf(f2));
        hashSet.add(Float.valueOf(f3));
        hashSet.add(Float.valueOf(f4));
        hashSet.remove(Float.valueOf(0.0f));
        if (hashSet.size() > 1) {
            throw new IllegalArgumentException("Multiple nonzero corner radii not yet supported.");
        }
        if (!hashSet.isEmpty()) {
            float floatValue = ((Float) hashSet.iterator().next()).floatValue();
            if (Float.isInfinite(floatValue) || Float.isNaN(floatValue) || floatValue < 0.0f) {
                throw new IllegalArgumentException("Invalid radius value: ".concat(String.valueOf(floatValue)));
            }
            this.ckl = floatValue;
        } else {
            this.ckl = 0.0f;
        }
        boolean[] zArr = this.xdg;
        zArr[0] = f > 0.0f;
        zArr[1] = f2 > 0.0f;
        zArr[2] = f3 > 0.0f;
        zArr[3] = f4 > 0.0f;
        return this;
    }

    public kg fxn(float f) {
        this.je = f;
        this.jq.setStrokeWidth(f);
        return this;
    }

    public kg fxn(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.ud = colorStateList;
        this.jq.setColor(colorStateList.getColorForState(getState(), -16777216));
        return this;
    }

    public kg fxn(boolean z) {
        this.rmu = z;
        return this;
    }

    public kg fxn(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        if (this.dx != scaleType) {
            this.dx = scaleType;
            fxn();
        }
        return this;
    }

    public kg fxn(Shader.TileMode tileMode) {
        if (this.mvp != tileMode) {
            this.mvp = tileMode;
            this.zu = true;
            invalidateSelf();
        }
        return this;
    }

    public kg kg(Shader.TileMode tileMode) {
        if (this.rlu != tileMode) {
            this.rlu = tileMode;
            this.zu = true;
            invalidateSelf();
        }
        return this;
    }

    private static boolean fxn(boolean[] zArr) {
        for (boolean z : zArr) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    private static boolean kg(boolean[] zArr) {
        for (boolean z : zArr) {
            if (z) {
                return false;
            }
        }
        return true;
    }
}
