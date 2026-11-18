package com.anythink.expressad.video.dynview.widget;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes16.dex */
public class ATRotationView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Runnable f5274a;
    private Camera b;
    private Matrix c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private float l;
    private float m;
    private boolean n;
    private boolean o;
    private boolean p;

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public ATRotationView(Context context) {
        super(context);
        this.f = 40;
        this.g = 20;
        this.h = 0;
        this.i = 0;
        this.k = 0;
        this.l = 0.5f;
        this.m = 0.9f;
        this.n = true;
        this.o = false;
        this.p = false;
        this.f5274a = new Runnable() { // from class: com.anythink.expressad.video.dynview.widget.ATRotationView.1
            @Override // java.lang.Runnable
            public final void run() {
                ATRotationView.a(ATRotationView.this);
            }
        };
        a();
    }

    public ATRotationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = 40;
        this.g = 20;
        this.h = 0;
        this.i = 0;
        this.k = 0;
        this.l = 0.5f;
        this.m = 0.9f;
        this.n = true;
        this.o = false;
        this.p = false;
        this.f5274a = new Runnable() { // from class: com.anythink.expressad.video.dynview.widget.ATRotationView.1
            @Override // java.lang.Runnable
            public final void run() {
                ATRotationView.a(ATRotationView.this);
            }
        };
        a();
    }

    public ATRotationView(Context context, AttributeSet attributeSet, int r3) {
        super(context, attributeSet, r3);
        this.f = 40;
        this.g = 20;
        this.h = 0;
        this.i = 0;
        this.k = 0;
        this.l = 0.5f;
        this.m = 0.9f;
        this.n = true;
        this.o = false;
        this.p = false;
        this.f5274a = new Runnable() { // from class: com.anythink.expressad.video.dynview.widget.ATRotationView.1
            @Override // java.lang.Runnable
            public final void run() {
                ATRotationView.a(ATRotationView.this);
            }
        };
        a();
    }

    private void a() {
        this.b = new Camera();
        this.c = new Matrix();
        setWillNotDraw(false);
    }

    public void setWidthRatio(float f) {
        this.l = f;
    }

    public void setHeightRatio(float f) {
        this.m = f;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int r7, int r8, int r9, int r10) {
        int r11 = r9 - r7;
        float f = r11;
        float f2 = this.l;
        int r1 = (int) (((1.0f - f2) * f) / 2.0f);
        int r12 = r10 - r8;
        float f3 = r12;
        float f4 = this.m;
        int r0 = (int) (((1.0f - f4) * f3) / 2.0f);
        this.d = (int) (f3 * f4);
        this.e = (int) (f * f2);
        int childCount = getChildCount();
        for (int r13 = 0; r13 < childCount; r13++) {
            View childAt = getChildAt(r13);
            childAt.layout(r1, r0, r11 - r1, r12 - r0);
            childAt.setClickable(true);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            int r3 = layoutParams.width;
            int r4 = this.e;
            if (r3 != r4) {
                layoutParams.width = r4;
                layoutParams.height = this.d;
                childAt.setLayoutParams(layoutParams);
            }
        }
    }

    private void a(Canvas canvas) {
        int width = getWidth() / 2;
        int r2 = ((this.h * this.e) / 2) / this.f;
        b(canvas, r2, width, 0);
        b(canvas, r2, width, 1);
        if (Math.abs(this.h) > this.f / 2) {
            b(canvas, r2, width, 3);
            b(canvas, r2, width, 2);
        } else {
            b(canvas, r2, width, 2);
            b(canvas, r2, width, 3);
        }
    }

    private void b(Canvas canvas) {
        int height = getHeight() / 2;
        int r2 = ((this.h * this.d) / 2) / this.f;
        a(canvas, r2, height, 0);
        a(canvas, r2, height, 1);
        if (Math.abs(this.h) > this.f / 2) {
            a(canvas, r2, height, 3);
            a(canvas, r2, height, 2);
        } else {
            a(canvas, r2, height, 2);
            a(canvas, r2, height, 3);
        }
    }

    public void setRotateV(boolean z) {
        this.o = z;
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (getChildCount() == 0) {
            return;
        }
        if (this.o) {
            int height = getHeight() / 2;
            int r5 = ((this.h * this.d) / 2) / this.f;
            a(canvas, r5, height, 0);
            a(canvas, r5, height, 1);
            if (Math.abs(this.h) > this.f / 2) {
                a(canvas, r5, height, 3);
                a(canvas, r5, height, 2);
                return;
            } else {
                a(canvas, r5, height, 2);
                a(canvas, r5, height, 3);
                return;
            }
        }
        int width = getWidth() / 2;
        int r6 = ((this.h * this.e) / 2) / this.f;
        b(canvas, r6, width, 0);
        b(canvas, r6, width, 1);
        if (Math.abs(this.h) > this.f / 2) {
            b(canvas, r6, width, 3);
            b(canvas, r6, width, 2);
        } else {
            b(canvas, r6, width, 2);
            b(canvas, r6, width, 3);
        }
    }

    public void setAutoscroll(boolean z) {
        if (z) {
            postDelayed(this.f5274a, 1000 / this.g);
        }
        this.n = z;
    }

    private void a(int r3, int r4, int r5) {
        float f = (-r3) / 2.0f;
        if (r5 == 0) {
            this.b.translate(0.0f, f, 0.0f);
            float f2 = -r4;
            this.b.rotateX(f2);
            this.b.translate(0.0f, f, 0.0f);
            this.b.translate(0.0f, f, 0.0f);
            this.b.rotateX(f2);
            this.b.translate(0.0f, f, 0.0f);
            return;
        }
        if (r5 == 1) {
            this.b.translate(0.0f, f, 0.0f);
            this.b.rotateX(r4);
            this.b.translate(0.0f, f, 0.0f);
        } else if (r5 != 2) {
            if (r5 != 3) {
                return;
            }
            this.b.rotateX(0.0f);
        } else {
            this.b.translate(0.0f, f, 0.0f);
            this.b.rotateX(-r4);
            this.b.translate(0.0f, f, 0.0f);
        }
    }

    private void b() {
        int r0;
        if (getChildCount() == 0) {
            return;
        }
        int r1 = this.h - 1;
        this.h = r1;
        int r2 = this.i;
        this.j = r2;
        int r3 = this.f;
        int r4 = r2 - (r1 / r3);
        int r5 = r1 % r3;
        this.h = r5;
        this.i = r4;
        if (Math.abs(r5) > this.f / 2) {
            r0 = a(2);
        } else {
            r0 = a(3);
        }
        if (this.k != r0) {
            this.k = r0;
        }
        invalidate();
        if (this.n) {
            postDelayed(this.f5274a, 1000 / this.g);
        }
    }

    private void a(Canvas canvas, int r6, int r7, int r8) {
        canvas.save();
        this.b.save();
        this.c.reset();
        float f = r6;
        this.b.translate(0.0f, f, 0.0f);
        this.b.rotateX(this.h);
        this.b.translate(0.0f, f, 0.0f);
        if (r6 == 0) {
            if (this.p) {
                a(this.d, this.f, r8);
            } else {
                a(-this.d, -this.f, r8);
            }
        } else if (r6 > 0) {
            a(this.d, this.f, r8);
        } else if (r6 < 0) {
            a(-this.d, -this.f, r8);
        }
        this.b.getMatrix(this.c);
        this.b.restore();
        this.c.preTranslate((-getWidth()) / 2, -r7);
        this.c.postTranslate(getWidth() / 2, r7);
        canvas.concat(this.c);
        View childAt = getChildAt(a(r8));
        if (childAt != null) {
            drawChild(canvas, childAt, 0L);
        }
        canvas.restore();
    }

    private int a(int r3) {
        int r4;
        int r5;
        int r6;
        if (r3 != 0) {
            if (r3 != 1) {
                if (r3 == 2) {
                    if (this.p) {
                        r5 = this.i;
                        r4 = r5 - 1;
                    } else {
                        r6 = this.i;
                        r4 = r6 + 1;
                    }
                } else {
                    r4 = r3 != 3 ? 0 : this.i;
                }
            } else if (this.p) {
                r6 = this.i;
                r4 = r6 + 1;
            } else {
                r5 = this.i;
                r4 = r5 - 1;
            }
        } else if (this.p) {
            r4 = this.i - 2;
        } else {
            r4 = this.i + 2;
        }
        int childCount = r4 % getChildCount();
        return childCount >= 0 ? childCount : childCount + getChildCount();
    }

    private void b(int r4) {
        int r5;
        int r0 = this.f;
        int r2 = this.j - (r4 / r0);
        int r6 = r4 % r0;
        this.h = r6;
        this.i = r2;
        if (Math.abs(r6) > this.f / 2) {
            r5 = a(2);
        } else {
            r5 = a(3);
        }
        if (this.k != r5) {
            this.k = r5;
        }
        invalidate();
    }

    private void b(int r4, int r5, int r6) {
        if (r6 == 0) {
            float f = (-r4) / 2;
            this.b.translate(f, 0.0f, 0.0f);
            float f2 = -r5;
            this.b.rotateY(f2);
            this.b.translate(f, 0.0f, 0.0f);
            this.b.translate(f, 0.0f, 0.0f);
            this.b.rotateY(f2);
            this.b.translate(f, 0.0f, 0.0f);
            return;
        }
        if (r6 == 1) {
            float f3 = r4 / 2;
            this.b.translate(f3, 0.0f, 0.0f);
            this.b.rotateY(r5);
            this.b.translate(f3, 0.0f, 0.0f);
            return;
        }
        if (r6 != 2) {
            if (r6 != 3) {
                return;
            }
            this.b.rotateY(0.0f);
        } else {
            float f4 = (-r4) / 2;
            this.b.translate(f4, 0.0f, 0.0f);
            this.b.rotateY(-r5);
            this.b.translate(f4, 0.0f, 0.0f);
        }
    }

    private void b(Canvas canvas, int r6, int r7, int r8) {
        canvas.save();
        this.b.save();
        this.c.reset();
        float f = r6;
        this.b.translate(f, 0.0f, 0.0f);
        this.b.rotateY(this.h);
        this.b.translate(f, 0.0f, 0.0f);
        if (r6 == 0) {
            if (this.p) {
                b(this.e, this.f, r8);
            } else {
                b(-this.e, -this.f, r8);
            }
        } else if (r6 > 0) {
            b(this.e, this.f, r8);
        } else if (r6 < 0) {
            b(-this.e, -this.f, r8);
        }
        this.b.getMatrix(this.c);
        this.b.restore();
        this.c.preTranslate(-r7, (-getHeight()) / 2);
        this.c.postTranslate(r7, getHeight() / 2);
        canvas.concat(this.c);
        View childAt = getChildAt(a(r8));
        if (childAt != null) {
            drawChild(canvas, childAt, 0L);
        }
        canvas.restore();
    }

    private void c(int r3) {
        int r4;
        this.i = r3;
        if (Math.abs(this.h) > this.f / 2) {
            r4 = a(2);
        } else {
            r4 = a(3);
        }
        if (this.k != r4) {
            this.k = r4;
        }
    }

    static /* synthetic */ void a(ATRotationView aTRotationView) {
        int r0;
        if (aTRotationView.getChildCount() != 0) {
            int r1 = aTRotationView.h - 1;
            aTRotationView.h = r1;
            int r2 = aTRotationView.i;
            aTRotationView.j = r2;
            int r3 = aTRotationView.f;
            int r4 = r2 - (r1 / r3);
            int r5 = r1 % r3;
            aTRotationView.h = r5;
            aTRotationView.i = r4;
            if (Math.abs(r5) > aTRotationView.f / 2) {
                r0 = aTRotationView.a(2);
            } else {
                r0 = aTRotationView.a(3);
            }
            if (aTRotationView.k != r0) {
                aTRotationView.k = r0;
            }
            aTRotationView.invalidate();
            if (aTRotationView.n) {
                aTRotationView.postDelayed(aTRotationView.f5274a, 1000 / aTRotationView.g);
            }
        }
    }
}
