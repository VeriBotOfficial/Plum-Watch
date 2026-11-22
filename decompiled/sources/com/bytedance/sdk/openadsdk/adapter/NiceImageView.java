package com.bytedance.sdk.openadsdk.adapter;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.os.Build;
import android.util.AttributeSet;
import com.bytedance.sdk.openadsdk.core.bh.hm;
import com.bytedance.sdk.openadsdk.utils.wc;

/* loaded from: classes14.dex */
public class NiceImageView extends hm {
    private int bh;
    private Path bx;
    private int ckl;
    private int dgx;
    private RectF dx;
    private final Context fxn;
    private boolean gff;
    private int hie;
    private int hm;
    private final Paint iwp;
    private final float[] je;
    private int jq;
    private final Path jz;
    private boolean kg;
    private int mvp;
    private int rb;
    private int rlu;
    private float rmu;

    /* renamed from: sg, reason: collision with root package name */
    private int f9419sg;
    private int tw;
    private final float[] ud;
    private final RectF ums;
    private int xdg;
    private final Xfermode zu;

    public NiceImageView(Context context) {
        this(context, null);
    }

    public NiceImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NiceImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.rb = -1;
        this.f9419sg = -1;
        this.fxn = context;
        this.tw = wc.kg(context, 10.0f);
        this.je = new float[8];
        this.ud = new float[8];
        this.ums = new RectF();
        this.dx = new RectF();
        this.iwp = new Paint();
        this.jz = new Path();
        if (Build.VERSION.SDK_INT <= 27) {
            this.zu = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        } else {
            this.zu = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
            this.bx = new Path();
        }
        gff();
        hm();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.ckl = i;
        this.xdg = i2;
        fxn();
        kg();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        canvas.saveLayer(this.dx, null, 31);
        if (!this.gff) {
            int i = this.ckl;
            int i2 = this.hm;
            int i3 = this.bh;
            int i4 = this.xdg;
            canvas.scale((((i - (i2 * 2)) - (i3 * 2)) * 1.0f) / i, (((i4 - (i2 * 2)) - (i3 * 2)) * 1.0f) / i4, i / 2.0f, i4 / 2.0f);
        }
        super.onDraw(canvas);
        this.iwp.reset();
        this.jz.reset();
        if (this.kg) {
            this.jz.addCircle(this.ckl / 2.0f, this.xdg / 2.0f, this.rmu, Path.Direction.CCW);
        } else {
            this.jz.addRoundRect(this.dx, this.ud, Path.Direction.CCW);
        }
        this.iwp.setAntiAlias(true);
        this.iwp.setStyle(Paint.Style.FILL);
        this.iwp.setXfermode(this.zu);
        if (Build.VERSION.SDK_INT <= 27) {
            canvas.drawPath(this.jz, this.iwp);
        } else {
            this.bx.addRect(this.dx, Path.Direction.CCW);
            this.bx.op(this.jz, Path.Op.DIFFERENCE);
            canvas.drawPath(this.bx, this.iwp);
        }
        this.iwp.setXfermode(null);
        int i5 = this.rlu;
        if (i5 != 0) {
            this.iwp.setColor(i5);
            canvas.drawPath(this.jz, this.iwp);
        }
        canvas.restore();
        fxn(canvas);
    }

    private void fxn(Canvas canvas) {
        if (this.kg) {
            int i = this.hm;
            if (i > 0) {
                fxn(canvas, i, this.rb, this.rmu - (i / 2.0f));
            }
            int i2 = this.bh;
            if (i2 > 0) {
                fxn(canvas, i2, this.f9419sg, (this.rmu - this.hm) - (i2 / 2.0f));
                return;
            }
            return;
        }
        int i3 = this.hm;
        if (i3 > 0) {
            fxn(canvas, i3, this.rb, this.ums, this.je);
        }
    }

    private void fxn(Canvas canvas, int i, int i2, float f) {
        fxn(i, i2);
        this.jz.addCircle(this.ckl / 2.0f, this.xdg / 2.0f, f, Path.Direction.CCW);
        canvas.drawPath(this.jz, this.iwp);
    }

    private void fxn(Canvas canvas, int i, int i2, RectF rectF, float[] fArr) {
        fxn(i, i2);
        this.jz.addRoundRect(rectF, fArr, Path.Direction.CCW);
        canvas.drawPath(this.jz, this.iwp);
    }

    private void fxn(int i, int i2) {
        this.jz.reset();
        this.iwp.setStrokeWidth(i);
        this.iwp.setColor(i2);
        this.iwp.setStyle(Paint.Style.STROKE);
    }

    private void fxn() {
        if (this.kg) {
            return;
        }
        RectF rectF = this.ums;
        int i = this.hm;
        rectF.set(i / 2.0f, i / 2.0f, this.ckl - (i / 2.0f), this.xdg - (i / 2.0f));
    }

    private void kg() {
        if (this.kg) {
            float min = Math.min(this.ckl, this.xdg) / 2.0f;
            this.rmu = min;
            RectF rectF = this.dx;
            int i = this.ckl;
            int i2 = this.xdg;
            rectF.set((i / 2.0f) - min, (i2 / 2.0f) - min, (i / 2.0f) + min, (i2 / 2.0f) + min);
            return;
        }
        this.dx.set(0.0f, 0.0f, this.ckl, this.xdg);
        if (this.gff) {
            this.dx = this.ums;
        }
    }

    private void gff() {
        if (this.kg) {
            return;
        }
        int i = 0;
        if (this.tw <= 0) {
            float[] fArr = this.je;
            int i2 = this.jq;
            float f = i2;
            fArr[1] = f;
            fArr[0] = f;
            int i3 = this.hie;
            float f2 = i3;
            fArr[3] = f2;
            fArr[2] = f2;
            int i4 = this.mvp;
            float f3 = i4;
            fArr[5] = f3;
            fArr[4] = f3;
            int i5 = this.dgx;
            float f4 = i5;
            fArr[7] = f4;
            fArr[6] = f4;
            float[] fArr2 = this.ud;
            int i6 = this.hm;
            float f5 = i2 - (i6 / 2.0f);
            fArr2[1] = f5;
            fArr2[0] = f5;
            float f6 = i3 - (i6 / 2.0f);
            fArr2[3] = f6;
            fArr2[2] = f6;
            float f7 = i4 - (i6 / 2.0f);
            fArr2[5] = f7;
            fArr2[4] = f7;
            float f8 = i5 - (i6 / 2.0f);
            fArr2[7] = f8;
            fArr2[6] = f8;
            return;
        }
        while (true) {
            float[] fArr3 = this.je;
            if (i >= fArr3.length) {
                return;
            }
            int i7 = this.tw;
            fArr3[i] = i7;
            this.ud[i] = i7 - (this.hm / 2.0f);
            i++;
        }
    }

    private void fxn(boolean z) {
        if (z) {
            this.tw = 0;
        }
        gff();
        fxn();
        invalidate();
    }

    private void hm() {
        if (this.kg) {
            return;
        }
        this.bh = 0;
    }

    public void isCoverSrc(boolean z) {
        this.gff = z;
        kg();
        invalidate();
    }

    public void isCircle(boolean z) {
        this.kg = z;
        hm();
        kg();
        invalidate();
    }

    public void setBorderWidth(int i) {
        this.hm = wc.kg(this.fxn, i);
        fxn(false);
    }

    public void setBorderColor(int i) {
        this.rb = i;
        invalidate();
    }

    public void setInnerBorderWidth(int i) {
        this.bh = wc.kg(this.fxn, i);
        hm();
        invalidate();
    }

    public void setInnerBorderColor(int i) {
        this.f9419sg = i;
        invalidate();
    }

    public void setCornerRadius(int i) {
        this.tw = wc.kg(this.fxn, i);
        fxn(false);
    }

    public void setCornerTopLeftRadius(int i) {
        this.jq = wc.kg(this.fxn, i);
        fxn(true);
    }

    public void setCornerTopRightRadius(int i) {
        this.hie = wc.kg(this.fxn, i);
        fxn(true);
    }

    public void setCornerBottomLeftRadius(int i) {
        this.dgx = wc.kg(this.fxn, i);
        fxn(true);
    }

    public void setCornerBottomRightRadius(int i) {
        this.mvp = wc.kg(this.fxn, i);
        fxn(true);
    }

    public void setMaskColor(int i) {
        this.rlu = i;
        invalidate();
    }
}
