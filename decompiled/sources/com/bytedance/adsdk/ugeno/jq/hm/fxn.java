package com.bytedance.adsdk.ugeno.jq.hm;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.util.Log;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.fxn.sg;
import com.bytedance.adsdk.ugeno.fxn.tw;
import com.bytedance.adsdk.ugeno.hm;

/* loaded from: classes13.dex */
public class fxn extends ImageView implements IAnimation, sg {
    public static final Shader.TileMode fxn = Shader.TileMode.CLAMP;
    private static final ImageView.ScaleType[] hm = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    static final /* synthetic */ boolean kg = true;
    private Drawable bh;
    private int ckl;
    private Drawable dgx;
    private hm dx;
    private float gff;
    private boolean hie;
    private Shader.TileMode je;
    private ColorFilter jq;
    private boolean mvp;
    private final float[] rb;
    private boolean rlu;
    private ImageView.ScaleType rmu;

    /* renamed from: sg, reason: collision with root package name */
    private ColorStateList f9292sg;
    private float tw;
    private Shader.TileMode ud;
    private tw ums;
    private int xdg;
    private boolean zu;

    public fxn(Context context) {
        super(context);
        this.rb = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        this.f9292sg = ColorStateList.valueOf(-16777216);
        this.tw = 0.0f;
        this.jq = null;
        this.hie = false;
        this.mvp = false;
        this.rlu = false;
        this.zu = false;
        Shader.TileMode tileMode = fxn;
        this.je = tileMode;
        this.ud = tileMode;
        this.ums = new tw(this);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.rmu;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (!kg && scaleType == null) {
            throw new AssertionError();
        }
        if (this.rmu != scaleType) {
            this.rmu = scaleType;
            int i = AnonymousClass1.fxn[scaleType.ordinal()];
            if (i == 1 || i == 2 || i == 3 || i == 4) {
                super.setScaleType(scaleType);
            } else {
                super.setScaleType(ImageView.ScaleType.FIT_XY);
            }
            gff();
            fxn(false);
            invalidate();
        }
    }

    /* renamed from: com.bytedance.adsdk.ugeno.jq.hm.fxn$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] fxn;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            fxn = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                fxn[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                fxn[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                fxn[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                fxn[ImageView.ScaleType.CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                fxn[ImageView.ScaleType.CENTER_CROP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                fxn[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.ckl = 0;
        this.dgx = kg.fxn(drawable);
        gff();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.ckl = 0;
        this.dgx = kg.fxn(bitmap);
        gff();
        super.setImageDrawable(this.dgx);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        if (this.ckl != i) {
            this.ckl = i;
            this.dgx = fxn();
            gff();
            super.setImageDrawable(this.dgx);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    private Drawable fxn() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i = this.ckl;
        if (i != 0) {
            try {
                drawable = resources.getDrawable(i);
            } catch (Exception e) {
                Log.w("RoundedImageView", "Unable to find resource: " + this.ckl, e);
                this.ckl = 0;
            }
        }
        return kg.fxn(drawable);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        if (this.xdg != i) {
            this.xdg = i;
            Drawable kg2 = kg();
            this.bh = kg2;
            setBackgroundDrawable(kg2);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        ColorDrawable colorDrawable = new ColorDrawable(i);
        this.bh = colorDrawable;
        setBackgroundDrawable(colorDrawable);
    }

    private Drawable kg() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i = this.xdg;
        if (i != 0) {
            try {
                drawable = resources.getDrawable(i);
            } catch (Exception e) {
                Log.w("RoundedImageView", "Unable to find resource: " + this.xdg, e);
                this.xdg = 0;
            }
        }
        return kg.fxn(drawable);
    }

    private void gff() {
        fxn(this.dgx, this.rmu);
    }

    private void fxn(boolean z) {
        if (this.zu) {
            if (z) {
                this.bh = kg.fxn(this.bh);
            }
            fxn(this.bh, ImageView.ScaleType.FIT_XY);
        }
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.jq != colorFilter) {
            this.jq = colorFilter;
            this.mvp = true;
            this.hie = true;
            hm();
            invalidate();
        }
    }

    private void hm() {
        Drawable drawable = this.dgx;
        if (drawable == null || !this.hie) {
            return;
        }
        Drawable mutate = drawable.mutate();
        this.dgx = mutate;
        if (this.mvp) {
            mutate.setColorFilter(this.jq);
        }
    }

    private void fxn(Drawable drawable, ImageView.ScaleType scaleType) {
        if (drawable == null) {
            return;
        }
        if (drawable instanceof kg) {
            kg kgVar = (kg) drawable;
            kgVar.fxn(scaleType).fxn(this.tw).fxn(this.f9292sg).fxn(this.rlu).fxn(this.je).kg(this.ud);
            float[] fArr = this.rb;
            if (fArr != null) {
                kgVar.fxn(fArr[0], fArr[1], fArr[2], fArr[3]);
            }
            hm();
            return;
        }
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i = 0; i < numberOfLayers; i++) {
                fxn(layerDrawable.getDrawable(i), scaleType);
            }
        }
    }

    @Override // android.view.View
    @Deprecated
    public void setBackgroundDrawable(Drawable drawable) {
        this.bh = drawable;
        fxn(true);
        super.setBackgroundDrawable(this.bh);
    }

    public float getCornerRadius() {
        return getMaxCornerRadius();
    }

    public float getMaxCornerRadius() {
        float f = 0.0f;
        for (float f2 : this.rb) {
            f = Math.max(f2, f);
        }
        return f;
    }

    public void setCornerRadiusDimen(int i) {
        float dimension = getResources().getDimension(i);
        fxn(dimension, dimension, dimension, dimension);
    }

    public void setCornerRadius(float f) {
        fxn(f, f, f, f);
    }

    public void fxn(float f, float f2, float f3, float f4) {
        float[] fArr = this.rb;
        if (fArr[0] == f && fArr[1] == f2 && fArr[2] == f4 && fArr[3] == f3) {
            return;
        }
        fArr[0] = f;
        fArr[1] = f2;
        fArr[3] = f3;
        fArr[2] = f4;
        gff();
        fxn(false);
        invalidate();
    }

    public float getBorderWidth() {
        return this.tw;
    }

    public void setBorderWidth(int i) {
        setBorderWidth(getResources().getDimension(i));
    }

    public void setBorderWidth(float f) {
        if (this.tw == f) {
            return;
        }
        this.tw = f;
        gff();
        fxn(false);
        invalidate();
    }

    public int getBorderColor() {
        return this.f9292sg.getDefaultColor();
    }

    public void setBorderColor(int i) {
        setBorderColor(ColorStateList.valueOf(i));
    }

    public ColorStateList getBorderColors() {
        return this.f9292sg;
    }

    public void setBorderColor(ColorStateList colorStateList) {
        if (this.f9292sg.equals(colorStateList)) {
            return;
        }
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(-16777216);
        }
        this.f9292sg = colorStateList;
        gff();
        fxn(false);
        if (this.tw > 0.0f) {
            invalidate();
        }
    }

    public void setOval(boolean z) {
        this.rlu = z;
        gff();
        fxn(false);
        invalidate();
    }

    public Shader.TileMode getTileModeX() {
        return this.je;
    }

    public void setTileModeX(Shader.TileMode tileMode) {
        if (this.je == tileMode) {
            return;
        }
        this.je = tileMode;
        gff();
        fxn(false);
        invalidate();
    }

    public Shader.TileMode getTileModeY() {
        return this.ud;
    }

    public void setTileModeY(Shader.TileMode tileMode) {
        if (this.ud == tileMode) {
            return;
        }
        this.ud = tileMode;
        gff();
        fxn(false);
        invalidate();
    }

    public void fxn(hm hmVar) {
        this.dx = hmVar;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        hm hmVar = this.dx;
        if (hmVar != null) {
            int[] fxn2 = hmVar.fxn(i, i2);
            super.onMeasure(fxn2[0], fxn2[1]);
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        hm hmVar = this.dx;
        if (hmVar != null) {
            hmVar.fxn(i, i2, i3, i4);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        hm hmVar = this.dx;
        if (hmVar != null) {
            hmVar.fxn(canvas, this);
            this.dx.fxn(canvas);
        }
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        hm hmVar = this.dx;
        if (hmVar != null) {
            hmVar.kg(canvas);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        hm hmVar = this.dx;
        if (hmVar != null) {
            hmVar.kg(i, i2, i3, i3);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        hm hmVar = this.dx;
        if (hmVar != null) {
            hmVar.sg();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hm hmVar = this.dx;
        if (hmVar != null) {
            hmVar.tw();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation, com.bytedance.adsdk.ugeno.fxn.sg
    public float getRipple() {
        return this.gff;
    }

    public void setShine(float f) {
        tw twVar = this.ums;
        if (twVar != null) {
            twVar.gff(f);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.fxn.sg
    public float getShine() {
        return this.ums.getShine();
    }

    public void setStretch(float f) {
        tw twVar = this.ums;
        if (twVar != null) {
            twVar.hm(f);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.fxn.sg
    public float getStretch() {
        return this.ums.getStretch();
    }

    public void setRubIn(float f) {
        tw twVar = this.ums;
        if (twVar != null) {
            twVar.rb(f);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.fxn.sg
    public float getRubIn() {
        return this.ums.getRubIn();
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public void setRipple(float f) {
        this.gff = f;
        tw twVar = this.ums;
        if (twVar != null) {
            twVar.kg(f);
        }
        postInvalidate();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    public void setBorderRadius(float f) {
        tw twVar = this.ums;
        if (twVar != null) {
            twVar.fxn(f);
        }
    }

    public float getBorderRadius() {
        return this.ums.fxn();
    }
}
