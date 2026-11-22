package com.qumeng.overseas.advlib.__remote__.ui.incite.taskcenter;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.view.ViewCompat;

/* loaded from: classes17.dex */
public class c extends Drawable {
    public static final int i = 1;
    public static final int j = 2;

    /* renamed from: a, reason: collision with root package name */
    private Paint f13187a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int[] g;
    private RectF h;

    public static class b {
        private int e;
        private int f;

        /* renamed from: a, reason: collision with root package name */
        private int f13188a = 1;
        private int b = 12;
        private int c = Color.parseColor("#4d000000");
        private int d = 18;
        private int[] g = {0};

        public b() {
            this.e = 0;
            this.f = 0;
            this.e = 0;
            this.f = 0;
        }

        public c builder() {
            return new c(this.f13188a, this.g, this.b, this.c, this.d, this.e, this.f);
        }

        public b setBgColor(int i) {
            this.g[0] = i;
            return this;
        }

        public b setOffsetX(int i) {
            this.e = i;
            return this;
        }

        public b setOffsetY(int i) {
            this.f = i;
            return this;
        }

        public b setShadowColor(int i) {
            this.c = i;
            return this;
        }

        public b setShadowRadius(int i) {
            this.d = i;
            return this;
        }

        public b setShape(int i) {
            this.f13188a = i;
            return this;
        }

        public b setShapeRadius(int i) {
            this.b = i;
            return this;
        }

        public b setBgColor(int[] iArr) {
            this.g = iArr;
            return this;
        }
    }

    public static void a(View view, Drawable drawable) {
        view.setLayerType(1, null);
        ViewCompat.setBackground(view, drawable);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint = new Paint();
        int[] iArr = this.g;
        if (iArr != null) {
            if (iArr.length == 1) {
                paint.setColor(iArr[0]);
            } else {
                RectF rectF = this.h;
                float f = rectF.left;
                float height = rectF.height() / 2.0f;
                RectF rectF2 = this.h;
                paint.setShader(new LinearGradient(f, height, rectF2.right, rectF2.height() / 2.0f, this.g, (float[]) null, Shader.TileMode.CLAMP));
            }
        }
        paint.setAntiAlias(true);
        if (this.c != 1) {
            canvas.drawCircle(this.h.centerX(), this.h.centerY(), Math.min(this.h.width(), this.h.height()) / 2.0f, this.f13187a);
            canvas.drawCircle(this.h.centerX(), this.h.centerY(), Math.min(this.h.width(), this.h.height()) / 2.0f, paint);
            return;
        }
        RectF rectF3 = this.h;
        float f2 = this.d;
        canvas.drawRoundRect(rectF3, f2, f2, this.f13187a);
        RectF rectF4 = this.h;
        float f3 = this.d;
        canvas.drawRoundRect(rectF4, f3, f3, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f13187a.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i2, int i3, int i4, int i5) {
        super.setBounds(i2, i3, i4, i5);
        int i6 = this.b;
        int i7 = this.e;
        int i8 = this.f;
        this.h = new RectF((i2 + i6) - i7, (i3 + i6) - i8, (i4 - i6) - i7, (i5 - i6) - i8);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f13187a.setColorFilter(colorFilter);
    }

    private c(int i2, int[] iArr, int i3, int i4, int i5, int i6, int i7) {
        this.c = i2;
        this.g = iArr;
        this.d = i3;
        this.b = i5;
        this.e = i6;
        this.f = i7;
        Paint paint = new Paint();
        this.f13187a = paint;
        paint.setColor(0);
        this.f13187a.setAntiAlias(true);
        this.f13187a.setShadowLayer(i5, i6, i7, i4);
        this.f13187a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
    }

    public static void a(View view, int i2, int i3, int i4) {
        c builder = new b().setShapeRadius(i2).setShadowColor(i3).setShadowRadius(i4).builder();
        view.setLayerType(1, null);
        ViewCompat.setBackground(view, builder);
    }

    public static void a(View view, int i2, int i3, int i4, int i5) {
        c builder = new b().setShapeRadius(i3).setBgColor(i2).setShadowColor(i4).setShadowRadius(i5).builder();
        view.setLayerType(1, null);
        ViewCompat.setBackground(view, builder);
    }

    public static void a(View view, int i2, int i3, int i4, int i5, int i6, int i7) {
        c builder = new b().setBgColor(i2).setShapeRadius(i3).setShadowColor(i4).setShadowRadius(i5).setOffsetX(i6).setOffsetY(i7).builder();
        view.setLayerType(1, null);
        ViewCompat.setBackground(view, builder);
    }

    public static void a(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        c builder = new b().setShape(i2).setBgColor(i3).setShapeRadius(i4).setShadowColor(i5).setShadowRadius(i6).setOffsetX(i7).setOffsetY(i8).builder();
        view.setLayerType(1, null);
        ViewCompat.setBackground(view, builder);
    }

    public static void a(View view, int[] iArr, int i2, int i3, int i4, int i5, int i6) {
        c builder = new b().setBgColor(iArr).setShapeRadius(i2).setShadowColor(i3).setShadowRadius(i4).setOffsetX(i5).setOffsetY(i6).builder();
        view.setLayerType(1, null);
        ViewCompat.setBackground(view, builder);
    }
}
