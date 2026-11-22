package com.anythink.expressad.foundation.webview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import com.anythink.expressad.foundation.h.k;
import com.anythink.expressad.foundation.webview.b;

/* loaded from: classes12.dex */
public class ProgressBar extends View implements b {
    private static final float C = 1200.0f;
    private static final long L = 25;
    private static final String g = "ProgressBar";
    private static final boolean h = false;
    private static final float t = 0.05f;
    private static final float u = 0.2f;
    private static final float v = 0.4f;
    private static final float w = 1.0f;
    private static final long x = 2000;
    private static final float y = 0.2f;
    private int A;
    private int B;
    private long D;
    private Drawable E;
    private Drawable F;
    private Drawable G;
    private Drawable H;
    private boolean I;
    private b.a J;
    private Handler K;
    private boolean M;
    private boolean N;
    Runnable f;
    private Rect i;
    private float j;
    private float k;
    private long l;
    private float m;
    private boolean n;
    private float o;
    private float p;

    /* renamed from: q, reason: collision with root package name */
    private float f4952q;
    private long r;
    private int s;
    private int z;

    @Override // android.view.View
    public Bitmap getDrawingCache(boolean z) {
        return null;
    }

    public ProgressBar(Context context) {
        super(context);
        this.i = new Rect();
        this.k = 0.95f;
        this.D = L;
        this.I = false;
        this.K = new Handler(Looper.getMainLooper());
        this.f = new Runnable() { // from class: com.anythink.expressad.foundation.webview.ProgressBar.1
            @Override // java.lang.Runnable
            public final void run() {
                ProgressBar.this.invalidate();
            }
        };
        this.N = false;
        setWillNotDraw(false);
    }

    public ProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = new Rect();
        this.k = 0.95f;
        this.D = L;
        this.I = false;
        this.K = new Handler(Looper.getMainLooper());
        this.f = new Runnable() { // from class: com.anythink.expressad.foundation.webview.ProgressBar.1
            @Override // java.lang.Runnable
            public final void run() {
                ProgressBar.this.invalidate();
            }
        };
        this.N = false;
        setWillNotDraw(false);
    }

    private void a() {
        setWillNotDraw(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r11.M != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x005a, code lost:
    
        r5 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x004b, code lost:
    
        if (r11.M == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0050, code lost:
    
        if (r11.M != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0058, code lost:
    
        if (r11.M != false) goto L29;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r12) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.foundation.webview.ProgressBar.draw(android.graphics.Canvas):void");
    }

    private float b() {
        if (this.n) {
            return this.M ? 1.0f : 0.4f;
        }
        if (this.r < 2000) {
            if (this.A == 1) {
                return this.M ? 1.0f : 0.4f;
            }
            if (this.z == 1) {
                return this.M ? 0.4f : 0.2f;
            }
            if (this.M) {
                return 0.2f;
            }
        }
        return 0.05f;
    }

    @Override // com.anythink.expressad.foundation.webview.b
    public void onThemeChange() {
        if (this.I) {
            initResource(true);
        }
    }

    @Override // com.anythink.expressad.foundation.webview.b
    public void initResource(boolean z) {
        if (z || (this.H == null && this.E == null && this.F == null && this.G == null)) {
            Drawable drawable = getResources().getDrawable(k.a(getContext(), "anythink_cm_highlight", k.c));
            this.H = drawable;
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.H.getIntrinsicHeight());
            }
            Drawable drawable2 = getResources().getDrawable(k.a(getContext(), "anythink_cm_head", k.c));
            this.E = drawable2;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), this.E.getIntrinsicHeight());
            }
            this.F = getResources().getDrawable(k.a(getContext(), "anythink_cm_tail", k.c));
            this.G = getResources().getDrawable(k.a(getContext(), "anythink_cm_end_animation", k.c));
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        Drawable drawable = this.H;
        if (drawable != null) {
            drawable.setBounds(0, 0, (int) (drawable.getIntrinsicWidth() * 1.5d), getHeight());
        }
        Drawable drawable2 = this.E;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, getWidth(), getHeight());
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    private void a(Canvas canvas, float f) {
        Drawable drawable;
        Drawable drawable2;
        if (this.n) {
            float f2 = this.o;
            float f3 = this.j;
            int i = (int) ((1.0f - (f2 / (f3 * 0.5f))) * 255.0f);
            if (i < 0) {
                i = 0;
            }
            if (f2 > f3 * 0.5f) {
                setVisible(false);
            }
            Drawable drawable3 = this.F;
            if (drawable3 != null) {
                drawable3.setAlpha(i);
            }
            Drawable drawable4 = this.G;
            if (drawable4 != null) {
                drawable4.setAlpha(i);
            }
            Drawable drawable5 = this.E;
            if (drawable5 != null) {
                drawable5.setAlpha(i);
            }
            canvas.save();
            canvas.translate(this.o, 0.0f);
        }
        if (this.F != null && this.E != null) {
            Drawable drawable6 = this.F;
            drawable6.setBounds(0, 0, (int) (this.i.width() - (this.E.getIntrinsicWidth() * 0.05f)), drawable6.getIntrinsicHeight());
            this.F.draw(canvas);
        }
        if (this.n && (drawable2 = this.G) != null && this.E != null) {
            int intrinsicWidth = drawable2.getIntrinsicWidth();
            Drawable drawable7 = this.G;
            drawable7.setBounds(0, 0, intrinsicWidth, drawable7.getIntrinsicHeight());
            canvas.save();
            canvas.translate(-intrinsicWidth, 0.0f);
            this.G.draw(canvas);
            canvas.restore();
        }
        if (this.E != null) {
            canvas.save();
            canvas.translate(this.i.width() - getWidth(), 0.0f);
            this.E.draw(canvas);
            canvas.restore();
        }
        if (!this.n && Math.abs(this.p - this.k) < 1.0E-5f && (drawable = this.H) != null) {
            int i2 = (int) (this.s + (f * 0.2f * this.j));
            this.s = i2;
            if (i2 + drawable.getIntrinsicWidth() >= this.i.width()) {
                this.s = -this.H.getIntrinsicWidth();
            }
            canvas.save();
            canvas.translate(this.s, 0.0f);
            this.H.draw(canvas);
            canvas.restore();
        }
        if (this.n) {
            canvas.restore();
        }
    }

    @Override // com.anythink.expressad.foundation.webview.b
    public void startEndAnimation() {
        if (this.n) {
            return;
        }
        this.n = true;
        this.o = 0.0f;
    }

    @Override // com.anythink.expressad.foundation.webview.b
    public void setProgress(float f, boolean z) {
        if (!z || f < 1.0f) {
            return;
        }
        startEndAnimation();
    }

    @Override // com.anythink.expressad.foundation.webview.b
    public void setVisible(boolean z) {
        if (z) {
            this.M = true;
            this.l = System.currentTimeMillis();
            this.m = 0.0f;
            this.r = 0L;
            this.n = false;
            this.o = 0.0f;
            this.p = 0.0f;
            this.j = getMeasuredWidth();
            this.N = false;
            this.z = 0;
            this.A = 0;
            this.B = 0;
            Drawable drawable = this.H;
            if (drawable != null) {
                this.s = -drawable.getIntrinsicWidth();
            } else {
                this.s = 0;
            }
            Drawable drawable2 = this.F;
            if (drawable2 != null) {
                drawable2.setAlpha(255);
            }
            Drawable drawable3 = this.G;
            if (drawable3 != null) {
                drawable3.setAlpha(255);
            }
            Drawable drawable4 = this.E;
            if (drawable4 != null) {
                drawable4.setAlpha(255);
            }
            setVisibility(0);
            invalidate();
            return;
        }
        setVisibility(4);
    }

    @Override // com.anythink.expressad.foundation.webview.b
    public float getProgress() {
        return this.p;
    }

    @Override // com.anythink.expressad.foundation.webview.b
    public void setProgressBarListener(b.a aVar) {
        this.J = aVar;
    }

    @Override // android.view.View, com.anythink.expressad.foundation.webview.b
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // com.anythink.expressad.foundation.webview.b
    public void setProgressState(int i) {
        if (i == 5) {
            this.z = 1;
            this.A = 0;
            this.B = 0;
            this.r = 0L;
            return;
        }
        if (i == 6) {
            this.A = 1;
            if (this.B == 1) {
                startEndAnimation();
            }
            this.r = 0L;
            return;
        }
        if (i == 7) {
            startEndAnimation();
        } else {
            if (i != 8) {
                return;
            }
            this.B = 1;
            if (this.A == 1) {
                startEndAnimation();
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.j = getMeasuredWidth();
    }

    @Override // com.anythink.expressad.foundation.webview.b
    public void setPaused(boolean z) {
        this.N = z;
        if (z) {
            return;
        }
        this.l = System.currentTimeMillis();
    }
}
