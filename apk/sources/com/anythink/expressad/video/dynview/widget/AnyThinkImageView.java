package com.anythink.expressad.video.dynview.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes16.dex */
public class AnyThinkImageView extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f5278a = "AnyThinkImageView";
    private Xfermode b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private float[] l;
    private float[] m;
    private RectF n;
    private RectF o;
    private boolean p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f5279q;
    private Path r;
    private Paint s;

    public AnyThinkImageView(Context context) {
        this(context, null);
    }

    public AnyThinkImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AnyThinkImageView(Context context, AttributeSet attributeSet, int r3) {
        super(context, attributeSet, r3);
        this.r = new Path();
        this.s = new Paint();
        this.l = new float[8];
        this.m = new float[8];
        this.o = new RectF();
        this.n = new RectF();
        this.b = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
    }

    @Override // android.view.View
    protected void onSizeChanged(int r4, int r5, int r6, int r7) {
        int r8;
        int r9;
        int r10;
        super.onSizeChanged(r4, r5, r6, r7);
        this.c = r4;
        this.d = r5;
        int r11 = 0;
        if (this.f5279q) {
            try {
                if (this.l != null && this.m != null) {
                    while (true) {
                        r8 = 2;
                        if (r11 >= 2) {
                            break;
                        }
                        float[] fArr = this.l;
                        int r12 = this.f;
                        fArr[r11] = r12;
                        this.m[r11] = r12 - (this.j / 2.0f);
                        r11++;
                    }
                    while (true) {
                        r9 = 4;
                        if (r8 >= 4) {
                            break;
                        }
                        float[] fArr2 = this.l;
                        int r13 = this.g;
                        fArr2[r8] = r13;
                        this.m[r8] = r13 - (this.j / 2.0f);
                        r8++;
                    }
                    while (true) {
                        if (r9 >= 6) {
                            break;
                        }
                        float[] fArr3 = this.l;
                        int r14 = this.h;
                        fArr3[r9] = r14;
                        this.m[r9] = r14 - (this.j / 2.0f);
                        r9++;
                    }
                    for (r10 = 6; r10 < 8; r10++) {
                        float[] fArr4 = this.l;
                        int r15 = this.i;
                        fArr4[r10] = r15;
                        this.m[r10] = r15 - (this.j / 2.0f);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (this.l != null && this.m != null) {
            while (true) {
                try {
                    float[] fArr5 = this.l;
                    if (r11 >= fArr5.length) {
                        break;
                    }
                    int r16 = this.e;
                    fArr5[r11] = r16;
                    this.m[r11] = r16 - (this.j / 2.0f);
                    r11++;
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
        RectF rectF = this.o;
        if (rectF != null) {
            int r17 = this.j;
            rectF.set(r17 / 2.0f, r17 / 2.0f, this.c - (r17 / 2.0f), this.d - (r17 / 2.0f));
        }
        RectF rectF2 = this.n;
        if (rectF2 != null) {
            rectF2.set(0.0f, 0.0f, this.c, this.d);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        try {
            canvas.saveLayer(this.n, null, 31);
            int r0 = this.c;
            int r1 = this.j;
            int r5 = this.d;
            canvas.scale(((r0 - (r1 * 2)) * 1.0f) / r0, ((r5 - (r1 * 2)) * 1.0f) / r5, r0 / 2.0f, r5 / 2.0f);
            super.onDraw(canvas);
            Paint paint = this.s;
            if (paint != null) {
                paint.reset();
                this.s.setAntiAlias(true);
                this.s.setStyle(Paint.Style.FILL);
                this.s.setXfermode(this.b);
            }
            Path path = this.r;
            if (path != null) {
                path.reset();
                this.r.addRoundRect(this.n, this.m, Path.Direction.CCW);
            }
            canvas.drawPath(this.r, this.s);
            Paint paint2 = this.s;
            if (paint2 != null) {
                paint2.setXfermode(null);
            }
            canvas.restore();
            if (this.p) {
                a(canvas, this.j, this.k, this.o, this.l);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void setCornerRadius(int r1) {
        this.e = r1;
    }

    public void setBorder(int r2, int r3, int r4) {
        this.p = true;
        this.j = r3;
        this.k = r4;
        this.e = r2;
    }

    public void setCustomBorder(int r2, int r3, int r4, int r5, int r6, int r7) {
        this.p = true;
        this.f5279q = true;
        this.j = r6;
        this.k = r7;
        this.f = r2;
        this.h = r4;
        this.g = r3;
        this.i = r5;
    }

    private void a(Canvas canvas) {
        a(canvas, this.j, this.k, this.o, this.l);
    }

    private void a(Canvas canvas, int r2, int r3, RectF rectF, float[] fArr) {
        try {
            a(r2, r3);
            Path path = this.r;
            if (path != null) {
                path.addRoundRect(rectF, fArr, Path.Direction.CCW);
            }
            if (canvas != null) {
                canvas.drawPath(this.r, this.s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void a(int r2, int r3) {
        Path path = this.r;
        if (path != null) {
            path.reset();
        }
        Paint paint = this.s;
        if (paint != null) {
            paint.setStrokeWidth(r2);
            this.s.setColor(r3);
            this.s.setStyle(Paint.Style.STROKE);
        }
    }

    private void a() {
        if (this.l == null || this.m == null) {
            return;
        }
        int r0 = 0;
        while (true) {
            try {
                float[] fArr = this.l;
                if (r0 >= fArr.length) {
                    return;
                }
                int r2 = this.e;
                fArr[r0] = r2;
                this.m[r0] = r2 - (this.j / 2.0f);
                r0++;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
    }

    private void b() {
        int r1;
        int r0;
        int r2;
        try {
            if (this.l == null || this.m == null) {
                return;
            }
            int r3 = 0;
            while (true) {
                r1 = 2;
                if (r3 >= 2) {
                    break;
                }
                float[] fArr = this.l;
                int r4 = this.f;
                fArr[r3] = r4;
                this.m[r3] = r4 - (this.j / 2.0f);
                r3++;
            }
            while (true) {
                r0 = 4;
                if (r1 >= 4) {
                    break;
                }
                float[] fArr2 = this.l;
                int r5 = this.g;
                fArr2[r1] = r5;
                this.m[r1] = r5 - (this.j / 2.0f);
                r1++;
            }
            while (true) {
                if (r0 >= 6) {
                    break;
                }
                float[] fArr3 = this.l;
                int r6 = this.h;
                fArr3[r0] = r6;
                this.m[r0] = r6 - (this.j / 2.0f);
                r0++;
            }
            for (r2 = 6; r2 < 8; r2++) {
                float[] fArr4 = this.l;
                int r7 = this.i;
                fArr4[r2] = r7;
                this.m[r2] = r7 - (this.j / 2.0f);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void c() {
        RectF rectF = this.o;
        if (rectF != null) {
            int r1 = this.j;
            rectF.set(r1 / 2.0f, r1 / 2.0f, this.c - (r1 / 2.0f), this.d - (r1 / 2.0f));
        }
    }

    private void d() {
        RectF rectF = this.n;
        if (rectF != null) {
            rectF.set(0.0f, 0.0f, this.c, this.d);
        }
    }
}
