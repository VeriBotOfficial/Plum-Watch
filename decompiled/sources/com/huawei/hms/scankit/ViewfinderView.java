package com.huawei.hms.scankit;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;

/* loaded from: classes14.dex */
public final class ViewfinderView extends View {
    private int[] A;
    private float[] B;
    private Rect C;
    private boolean D;
    Point E;
    private boolean F;

    /* renamed from: a, reason: collision with root package name */
    private Paint f10501a;
    private TextPaint b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private float h;
    private b i;
    private String j;
    private int k;
    private float l;
    public int m;
    public int n;
    private boolean o;
    private int p;

    /* renamed from: q, reason: collision with root package name */
    private int f10502q;
    private int r;
    private int s;
    private a t;
    private int u;
    private int v;
    private Rect w;
    private int x;
    private ValueAnimator y;
    Paint z;

    public enum a {
        NONE(0),
        LINE(1),
        GRID(2);

        private int e;

        a(int i) {
            this.e = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static a b(int i) {
            for (a aVar : values()) {
                if (aVar.e == i) {
                    return aVar;
                }
            }
            return LINE;
        }
    }

    public enum b {
        TOP(0),
        BOTTOM(1);

        private int d;

        b(int i) {
            this.d = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b b(int i) {
            for (b bVar : values()) {
                if (bVar.d == i) {
                    return bVar;
                }
            }
            return TOP;
        }
    }

    public ViewfinderView(Context context) {
        this(context, null);
    }

    private void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ViewfinderView);
        this.c = obtainStyledAttributes.getColor(R.styleable.ViewfinderView_scankit_maskColor, b(context, R.color.scankit_viewfinder_mask));
        this.d = obtainStyledAttributes.getColor(R.styleable.ViewfinderView_scankit_frameColor, b(context, R.color.scankit_viewfinder_frame));
        this.f = obtainStyledAttributes.getColor(R.styleable.ViewfinderView_scankit_cornerColor, b(context, R.color.scankit_viewfinder_corner));
        this.e = obtainStyledAttributes.getColor(R.styleable.ViewfinderView_scankit_laserColor, b(context, R.color.scankit_viewfinder_lasers));
        this.g = obtainStyledAttributes.getColor(R.styleable.ViewfinderView_scankit_resultPointColor, b(context, R.color.scankit_viewfinder_result_point_color));
        this.j = obtainStyledAttributes.getString(R.styleable.ViewfinderView_scankit_labelText);
        this.k = obtainStyledAttributes.getColor(R.styleable.ViewfinderView_scankit_labelTextColor, b(context, R.color.scankit_viewfinder_text_color));
        this.l = obtainStyledAttributes.getDimension(R.styleable.ViewfinderView_scankit_labelTextSize, TypedValue.applyDimension(2, 14.0f, getResources().getDisplayMetrics()));
        this.h = obtainStyledAttributes.getDimension(R.styleable.ViewfinderView_scankit_labelTextPadding, TypedValue.applyDimension(1, 24.0f, getResources().getDisplayMetrics()));
        this.i = b.b(obtainStyledAttributes.getInt(R.styleable.ViewfinderView_scankit_labelTextLocation, 0));
        this.o = obtainStyledAttributes.getBoolean(R.styleable.ViewfinderView_scankit_showResultPoint, false);
        this.r = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ViewfinderView_scankit_frameWidth, 0);
        this.s = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ViewfinderView_scankit_frameHeight, 0);
        this.t = a.b(obtainStyledAttributes.getInt(R.styleable.ViewfinderView_scankit_laserStyle, a.LINE.e));
        this.u = obtainStyledAttributes.getInt(R.styleable.ViewfinderView_scankit_gridColumn, 20);
        this.v = (int) obtainStyledAttributes.getDimension(R.styleable.ViewfinderView_scankit_gridHeight, TypedValue.applyDimension(1, 40.0f, getResources().getDisplayMetrics()));
        this.F = obtainStyledAttributes.getBoolean(R.styleable.ViewfinderView_scankit_line_anim, true);
        obtainStyledAttributes.recycle();
        this.f10501a = new Paint(1);
        this.b = new TextPaint(1);
        this.x = a(context, 136);
        this.f10502q = getDisplayMetrics().heightPixels;
        this.p = getDisplayMetrics().widthPixels;
    }

    public static int b(Context context, int i) {
        try {
            return context.getColor(i);
        } catch (Resources.NotFoundException unused) {
            Log.e("ViewfinderView", "getColor: Resources.NotFoundException");
            return 16777215;
        } catch (Exception unused2) {
            Log.e("ViewfinderView", "getColor: Exception");
            return 16777215;
        }
    }

    private DisplayMetrics getDisplayMetrics() {
        return getResources().getDisplayMetrics();
    }

    public void a(com.huawei.hms.scankit.aiscan.common.z zVar) {
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.y;
        if (valueAnimator != null) {
            valueAnimator.pause();
            this.y.removeAllListeners();
            this.y.cancel();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.F) {
            canvas.save();
            a(canvas, "HWTAH".equals(Build.DEVICE) || Build.DEVICE.equals("HWTAH-C"));
            canvas.restore();
        }
        a(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.p = i;
        this.f10502q = i2;
        a();
    }

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewfinderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.m = 0;
        this.n = 0;
        this.w = new Rect();
        this.z = new Paint();
        this.A = new int[]{Color.parseColor("#FFFFFFFF"), Color.parseColor("#72FFFFFF"), Color.parseColor("#58FFFFFF"), Color.parseColor("#40FFFFFF"), Color.parseColor("#28FFFFFF"), Color.parseColor("#13FFFFFF"), Color.parseColor("#00FFFFFF")};
        this.B = new float[]{0.0f, 0.5f, 0.6f, 0.7f, 0.8f, 0.9f, 1.0f};
        this.D = true;
        this.F = true;
        a(context, attributeSet);
    }

    private void a(Canvas canvas, boolean z) {
        this.f10501a.setStyle(Paint.Style.FILL);
        this.f10501a.setColor(this.e);
        if (!q.b && !z) {
            Rect rect = this.w;
            rect.left = 0;
            int i = this.m;
            rect.top = i;
            rect.bottom = i + this.x;
            rect.right = this.p;
        } else {
            Rect rect2 = this.w;
            int i2 = this.p / 2;
            rect2.left = i2 - 540;
            int i3 = this.m;
            rect2.top = i3;
            rect2.bottom = i3 + this.x;
            rect2.right = i2 + 540;
        }
        float f = this.p / 2;
        float f2 = this.w.bottom + 500;
        this.f10501a.setShader(new RadialGradient(f, f2, 690, this.A, this.B, Shader.TileMode.CLAMP));
        this.f10501a.setStrokeWidth(10.0f);
        Rect rect3 = this.w;
        float f3 = rect3.left;
        float f4 = rect3.bottom;
        canvas.drawLine(f3, f4, rect3.right, f4, this.f10501a);
        canvas.clipRect(this.w);
        canvas.drawCircle(f, f2, r12 + 200, this.f10501a);
    }

    public void a() {
        if (q.b) {
            this.n = this.f10502q;
        } else {
            this.n = this.f10502q - a(getContext(), 139);
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, this.n - this.x);
        this.y = ofInt;
        ofInt.setDuration(3000L);
        this.y.setInterpolator(new AccelerateDecelerateInterpolator());
        this.y.setRepeatMode(1);
        this.y.setRepeatCount(-1);
        this.y.addUpdateListener(new F(this));
        this.y.start();
    }

    public void a(Rect rect, boolean z, Point point) {
        this.D = z;
        this.E = point;
        if (this.C == null) {
            this.C = rect;
            invalidate();
        }
    }

    public static int a(Context context, int i) {
        return (int) ((i * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private void a(Canvas canvas) {
        Point point;
        int i;
        int i2;
        int i3;
        if (this.C == null) {
            return;
        }
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        if (this.D) {
            Point point2 = this.E;
            point = new Point(point2.y, point2.x);
        } else {
            Point point3 = this.E;
            point = new Point(point3.x, point3.y);
        }
        int i4 = point.x;
        float f = width / i4;
        int i5 = point.y;
        float f2 = height / i5;
        int i6 = (int) (i5 * 0.1d);
        int i7 = (int) ((i4 * 0.15d) / 2.0d);
        RectF rectF = new RectF();
        if (this.D) {
            if (f > f2) {
                i2 = (int) (point.y * f);
                canvas.translate(0.0f, (height / 2) - (i2 / 2));
                i3 = width;
            } else {
                i = (int) (point.x * f2);
                canvas.translate((width / 2) - (i / 2), 0.0f);
                i3 = i;
                i2 = height;
            }
        } else if (f > f2) {
            i2 = (int) (point.y * f);
            canvas.translate(0.0f, (height / 2) - (i2 / 2));
            i3 = width;
        } else {
            i = (int) (point.x * f2);
            canvas.translate((width / 2) - (i / 2), 0.0f);
            i3 = i;
            i2 = height;
        }
        Rect rect = this.C;
        float f3 = rect.left + i7;
        float f4 = point.x;
        float f5 = rect.top + i6;
        float f6 = point.y;
        float f7 = f5 / f6;
        float f8 = (rect.bottom + i6) / f6;
        float f9 = i3;
        rectF.left = (f3 / f4) * f9;
        rectF.right = ((rect.right + i7) / f4) * f9;
        float f10 = i2;
        rectF.top = f7 * f10;
        rectF.bottom = f8 * f10;
        float f11 = (rectF.left + rectF.right) / 2.0f;
        float f12 = (rectF.top + rectF.bottom) / 2.0f;
        this.z.setStyle(Paint.Style.FILL);
        this.z.setColor(-1);
        canvas.drawCircle(f11, f12, ((int) ((getDisplayMetrics().density * 24.0f) + 0.5d)) / 2, this.z);
        this.z.setColor(Color.parseColor("#007DFF"));
        canvas.drawCircle(f11, f12, ((int) ((getDisplayMetrics().density * 22.0f) + 0.5d)) / 2, this.z);
        if (this.D) {
            if (f > f2) {
                canvas.translate(0.0f, (i2 / 2) - (height / 2));
                return;
            } else {
                canvas.translate((i3 / 2) - (width / 2), 0.0f);
                return;
            }
        }
        if (f > f2) {
            canvas.translate(0.0f, (i2 / 2) - (height / 2));
        } else {
            canvas.translate((i3 / 2) - (width / 2), 0.0f);
        }
    }
}
