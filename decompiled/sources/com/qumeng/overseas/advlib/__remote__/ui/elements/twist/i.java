package com.qumeng.overseas.advlib.__remote__.ui.elements.twist;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.Base64;
import android.view.View;
import androidx.core.internal.view.SupportMenu;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.s;
import com.qumeng.overseas.advlib.__remote__.utils.n;

/* loaded from: classes17.dex */
public class i extends View {
    private float A;
    private boolean B;
    private boolean C;
    private int D;
    private a E;
    private float F;
    private float G;
    private float H;
    private int I;
    String t;
    private final Paint u;
    private final Bitmap v;
    private final PorterDuffXfermode w;
    private final RectF x;
    private float y;
    private float z;

    public interface a {
        void complete(float f);
    }

    public i(Context context, int i, int i2) {
        super(context);
        this.t = "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\n5G8AVv4fCG/9t+RjH8EAAAAASUVORK5CYII=\n";
        this.F = -90.0f;
        this.G = 104.0f;
        byte[] decode = Base64.decode("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\n5G8AVv4fCG/9t+RjH8EAAAAASUVORK5CYII=\n", 0);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
        this.v = decodeByteArray;
        Paint paint = new Paint();
        this.u = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(s.a(5.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(s.a(7.0f));
        paint.setColor(SupportMenu.CATEGORY_MASK);
        paint.setDither(true);
        paint.setFilterBitmap(true);
        this.w = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
        float a2 = s.a(5.0f) / 2;
        float f = i - a2;
        this.x = new RectF(a2, a2, f, f);
        this.I = (i / 2) - (decodeByteArray.getWidth() / 2);
        setLayerType(1, null);
    }

    public void a() {
        this.z = 0.0f;
        this.y = 0.0f;
        this.C = true;
        this.B = false;
        postInvalidate();
    }

    public void b() {
        this.C = false;
        this.B = true;
    }

    public int getmFeatureType() {
        return this.D;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(this.v, this.I, 0.0f, this.u);
        float f = (this.y - this.z) * this.H;
        if (this.B) {
            this.u.setXfermode(this.w);
            canvas.drawArc(this.x, this.F, f, false, this.u);
            canvas.drawArc(this.x, this.F, -f, false, this.u);
            this.u.setXfermode(null);
            return;
        }
        if (this.D != 4) {
            this.u.setXfermode(this.w);
            canvas.drawArc(this.x, this.F, f, false, this.u);
            canvas.drawArc(this.x, this.F, -f, false, this.u);
            this.u.setXfermode(null);
        }
        if ((this.E == null || this.A <= 0.0f || Math.abs(this.y - this.z) < this.A) && this.D != 4) {
            return;
        }
        a(2);
        n.c(g.y0, "触发角度：" + this.A, new Object[0]);
        n.c(g.y0, "当前旋转角度：" + (this.y - this.z), new Object[0]);
        n.c(g.y0, "mCurProgress：" + this.y + "  mStartProgress" + this.z, new Object[0]);
        n.c(g.y0, "angleFactor：" + this.H, new Object[0]);
        this.B = true;
        this.E.complete(Math.abs(this.y - this.z) * 2.0f);
    }

    public void setProgress(float f) {
        if (this.B) {
            return;
        }
        if (this.C) {
            this.C = false;
            this.z = f;
        }
        this.y = f;
        postInvalidate();
    }

    public void setmCallBack(a aVar) {
        this.E = aVar;
    }

    public void a(float f, int i) {
        if (i != this.D) {
            this.A = f;
            this.H = (this.G / 2.0f) / f;
            this.D = i;
            a(1);
        }
    }

    private void a(int i) {
        String str;
        if (i == 1) {
            str = "设置";
        } else {
            str = "触发";
        }
        int i2 = this.D;
        if (i2 == 1) {
            n.c(g.y0, str.concat("低敏扭一扭"), new Object[0]);
            return;
        }
        if (i2 == 2) {
            n.c(g.y0, str.concat("中敏扭一扭"), new Object[0]);
            return;
        }
        if (i2 == 3) {
            n.c(g.y0, str.concat("高敏扭一扭"), new Object[0]);
            return;
        }
        if (i2 == 4) {
            n.c(g.y0, str.concat("超敏扭一扭"), new Object[0]);
        } else if (i2 != 5) {
            n.c(g.y0, "未知类型扭一扭", new Object[0]);
        } else {
            n.c(g.y0, str.concat("合规扭一扭"), new Object[0]);
        }
    }
}
