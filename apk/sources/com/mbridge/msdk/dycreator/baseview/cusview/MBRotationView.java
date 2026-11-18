package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public class MBRotationView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Camera f11379a;
    private Matrix b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private float k;
    private float l;
    private boolean m;
    private boolean n;
    private boolean o;
    Runnable p;

    public MBRotationView(Context context) {
        super(context);
        this.e = 40;
        this.f = 20;
        this.g = 0;
        this.h = 0;
        this.j = 0;
        this.k = 0.5f;
        this.l = 0.9f;
        this.m = true;
        this.n = false;
        this.o = false;
        this.p = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView.1
            @Override // java.lang.Runnable
            public void run() {
                MBRotationView.this.b();
            }
        };
        a();
    }

    private void b(Canvas canvas) {
        int height = getHeight() / 2;
        int r2 = ((this.g * this.c) / 2) / this.e;
        a(canvas, r2, height, 0);
        a(canvas, r2, height, 1);
        if (Math.abs(this.g) > this.e / 2) {
            a(canvas, r2, height, 3);
            a(canvas, r2, height, 2);
        } else {
            a(canvas, r2, height, 2);
            a(canvas, r2, height, 3);
        }
    }

    private int c(int r3) {
        int r4;
        int r5;
        int r6;
        if (r3 == 0) {
            r4 = this.o ? this.h - 2 : this.h + 2;
        } else if (r3 != 1) {
            if (r3 != 2) {
                r4 = r3 != 3 ? 0 : this.h;
            } else if (this.o) {
                r5 = this.h;
                r4 = r5 - 1;
            } else {
                r6 = this.h;
                r4 = r6 + 1;
            }
        } else if (this.o) {
            r6 = this.h;
            r4 = r6 + 1;
        } else {
            r5 = this.h;
            r4 = r5 - 1;
        }
        int childCount = r4 % getChildCount();
        return childCount >= 0 ? childCount : childCount + getChildCount();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (getChildCount() == 0) {
            return;
        }
        if (this.n) {
            b(canvas);
        } else {
            a(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int r7, int r8, int r9, int r10) {
        int r11 = r9 - r7;
        float f = r11;
        float f2 = this.k;
        int r1 = (int) (((1.0f - f2) * f) / 2.0f);
        int r12 = r10 - r8;
        float f3 = r12;
        float f4 = this.l;
        int r0 = (int) (((1.0f - f4) * f3) / 2.0f);
        this.c = (int) (f3 * f4);
        this.d = (int) (f * f2);
        int childCount = getChildCount();
        for (int r13 = 0; r13 < childCount; r13++) {
            View childAt = getChildAt(r13);
            childAt.layout(r1, r0, r11 - r1, r12 - r0);
            childAt.setClickable(true);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            int r3 = layoutParams.width;
            int r4 = this.d;
            if (r3 != r4) {
                layoutParams.width = r4;
                layoutParams.height = this.c;
                childAt.setLayoutParams(layoutParams);
            }
        }
    }

    public void setAutoscroll(boolean z) {
        if (z) {
            postDelayed(this.p, 1000 / this.f);
        }
        this.m = z;
    }

    public void setHeightRatio(float f) {
        this.l = f;
    }

    public void setRotateV(boolean z) {
        this.n = z;
        invalidate();
    }

    public void setWidthRatio(float f) {
        this.k = f;
    }

    private void a() {
        this.f11379a = new Camera();
        this.b = new Matrix();
        setWillNotDraw(false);
    }

    private void a(Canvas canvas) {
        int width = getWidth() / 2;
        int r2 = ((this.g * this.d) / 2) / this.e;
        b(canvas, r2, width, 0);
        b(canvas, r2, width, 1);
        if (Math.abs(this.g) > this.e / 2) {
            b(canvas, r2, width, 3);
            b(canvas, r2, width, 2);
        } else {
            b(canvas, r2, width, 2);
            b(canvas, r2, width, 3);
        }
    }

    private void b(int r3, int r4, int r5) {
        float f = (-r3) / 2.0f;
        if (r5 == 0) {
            this.f11379a.translate(0.0f, f, 0.0f);
            float f2 = -r4;
            this.f11379a.rotateX(f2);
            this.f11379a.translate(0.0f, f, 0.0f);
            this.f11379a.translate(0.0f, f, 0.0f);
            this.f11379a.rotateX(f2);
            this.f11379a.translate(0.0f, f, 0.0f);
            return;
        }
        if (r5 == 1) {
            this.f11379a.translate(0.0f, f, 0.0f);
            this.f11379a.rotateX(r4);
            this.f11379a.translate(0.0f, f, 0.0f);
        } else if (r5 != 2) {
            if (r5 != 3) {
                return;
            }
            this.f11379a.rotateX(0.0f);
        } else {
            this.f11379a.translate(0.0f, f, 0.0f);
            this.f11379a.rotateX(-r4);
            this.f11379a.translate(0.0f, f, 0.0f);
        }
    }

    private void a(Canvas canvas, int r6, int r7, int r8) {
        canvas.save();
        this.f11379a.save();
        this.b.reset();
        float f = r6;
        this.f11379a.translate(0.0f, f, 0.0f);
        this.f11379a.rotateX(this.g);
        this.f11379a.translate(0.0f, f, 0.0f);
        if (r6 == 0) {
            if (this.o) {
                b(this.c, this.e, r8);
            } else {
                b(-this.c, -this.e, r8);
            }
        } else if (r6 > 0) {
            b(this.c, this.e, r8);
        } else if (r6 < 0) {
            b(-this.c, -this.e, r8);
        }
        this.f11379a.getMatrix(this.b);
        this.f11379a.restore();
        this.b.preTranslate((-getWidth()) / 2, -r7);
        this.b.postTranslate(getWidth() / 2, r7);
        canvas.concat(this.b);
        View childAt = getChildAt(c(r8));
        if (childAt != null) {
            drawChild(canvas, childAt, 0L);
        }
        canvas.restore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (getChildCount() == 0) {
            return;
        }
        int r0 = this.g - 1;
        this.g = r0;
        this.i = this.h;
        a(r0);
        if (this.m) {
            postDelayed(this.p, 1000 / this.f);
        }
    }

    private void b(Canvas canvas, int r6, int r7, int r8) {
        canvas.save();
        this.f11379a.save();
        this.b.reset();
        float f = r6;
        this.f11379a.translate(f, 0.0f, 0.0f);
        this.f11379a.rotateY(this.g);
        this.f11379a.translate(f, 0.0f, 0.0f);
        if (r6 == 0) {
            if (this.o) {
                a(this.d, this.e, r8);
            } else {
                a(-this.d, -this.e, r8);
            }
        } else if (r6 > 0) {
            a(this.d, this.e, r8);
        } else if (r6 < 0) {
            a(-this.d, -this.e, r8);
        }
        this.f11379a.getMatrix(this.b);
        this.f11379a.restore();
        this.b.preTranslate(-r7, (-getHeight()) / 2);
        this.b.postTranslate(r7, getHeight() / 2);
        canvas.concat(this.b);
        View childAt = getChildAt(c(r8));
        if (childAt != null) {
            drawChild(canvas, childAt, 0L);
        }
        canvas.restore();
    }

    private void a(int r4) {
        int r0 = this.e;
        int r2 = this.i - (r4 / r0);
        this.g = r4 % r0;
        b(r2);
        invalidate();
    }

    private void a(int r4, int r5, int r6) {
        if (r6 == 0) {
            float f = (-r4) / 2;
            this.f11379a.translate(f, 0.0f, 0.0f);
            float f2 = -r5;
            this.f11379a.rotateY(f2);
            this.f11379a.translate(f, 0.0f, 0.0f);
            this.f11379a.translate(f, 0.0f, 0.0f);
            this.f11379a.rotateY(f2);
            this.f11379a.translate(f, 0.0f, 0.0f);
            return;
        }
        if (r6 == 1) {
            float f3 = r4 / 2;
            this.f11379a.translate(f3, 0.0f, 0.0f);
            this.f11379a.rotateY(r5);
            this.f11379a.translate(f3, 0.0f, 0.0f);
            return;
        }
        if (r6 != 2) {
            if (r6 != 3) {
                return;
            }
            this.f11379a.rotateY(0.0f);
        } else {
            float f4 = (-r4) / 2;
            this.f11379a.translate(f4, 0.0f, 0.0f);
            this.f11379a.rotateY(-r5);
            this.f11379a.translate(f4, 0.0f, 0.0f);
        }
    }

    private void b(int r3) {
        int r4;
        this.h = r3;
        if (Math.abs(this.g) > this.e / 2) {
            r4 = c(2);
        } else {
            r4 = c(3);
        }
        if (this.j != r4) {
            this.j = r4;
        }
    }

    public MBRotationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = 40;
        this.f = 20;
        this.g = 0;
        this.h = 0;
        this.j = 0;
        this.k = 0.5f;
        this.l = 0.9f;
        this.m = true;
        this.n = false;
        this.o = false;
        this.p = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView.1
            @Override // java.lang.Runnable
            public void run() {
                MBRotationView.this.b();
            }
        };
        a();
    }

    public MBRotationView(Context context, AttributeSet attributeSet, int r3) {
        super(context, attributeSet, r3);
        this.e = 40;
        this.f = 20;
        this.g = 0;
        this.h = 0;
        this.j = 0;
        this.k = 0.5f;
        this.l = 0.9f;
        this.m = true;
        this.n = false;
        this.o = false;
        this.p = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView.1
            @Override // java.lang.Runnable
            public void run() {
                MBRotationView.this.b();
            }
        };
        a();
    }
}
