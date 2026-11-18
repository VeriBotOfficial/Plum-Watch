package com.bytedance.sdk.component.adexpress.bh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Movie;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes15.dex */
public class rlu extends ImageView {
    private boolean bh;
    private int dgx;
    private Movie fxn;
    private int gff;
    private int hie;
    private AnimatedImageDrawable hm;
    private float jq;
    private long kg;
    private volatile boolean mvp;
    private boolean rb;
    private boolean rlu;

    /* JADX INFO: renamed from: sg, reason: collision with root package name */
    private float f9317sg;
    private float tw;
    private boolean zu;

    public rlu(Context context) {
        super(context);
        this.rb = Build.VERSION.SDK_INT >= 28;
        this.bh = false;
        this.rlu = true;
        this.zu = true;
        fxn();
    }

    void fxn() {
        if (this.rb) {
            return;
        }
        setLayerType(1, null);
    }

    private void setDrawable(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        setImageDrawable(drawable);
        if (Build.VERSION.SDK_INT >= 28 && (drawable instanceof AnimatedImageDrawable)) {
            AnimatedImageDrawable animatedImageDrawable = (AnimatedImageDrawable) drawable;
            this.hm = animatedImageDrawable;
            if (!this.mvp) {
                animatedImageDrawable.start();
            }
            if (!this.zu) {
                animatedImageDrawable.setRepeatCount(0);
            }
        }
        kg();
    }

    public void setRepeatConfig(boolean z) {
        AnimatedImageDrawable animatedImageDrawable;
        this.zu = z;
        if (z) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT < 28 || (animatedImageDrawable = this.hm) == null) {
                return;
            }
            animatedImageDrawable.setRepeatCount(0);
        } catch (Exception unused) {
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int r5, int r6) {
        Movie movie;
        int size;
        int size2;
        super.onMeasure(r5, r6);
        if (this.rb || (movie = this.fxn) == null) {
            return;
        }
        int r0 = movie.width();
        int r1 = this.fxn.height();
        float fMax = 1.0f / Math.max((View.MeasureSpec.getMode(r5) == 0 || r0 <= (size2 = View.MeasureSpec.getSize(r5))) ? 1.0f : r0 / size2, (View.MeasureSpec.getMode(r6) == 0 || r1 <= (size = View.MeasureSpec.getSize(r6))) ? 1.0f : r1 / size);
        this.jq = fMax;
        int r7 = (int) (r0 * fMax);
        this.hie = r7;
        int r8 = (int) (r1 * fMax);
        this.dgx = r8;
        setMeasuredDimension(r7, r8);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int r2, int r3, int r4, int r5) {
        super.onLayout(z, r2, r3, r4, r5);
        if (this.fxn != null && !this.rb) {
            this.f9317sg = (getWidth() - this.hie) / 2.0f;
            this.tw = (getHeight() - this.dgx) / 2.0f;
        }
        this.rlu = getVisibility() == 0;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.fxn != null && !this.rb) {
            try {
                if (!this.mvp) {
                    gff();
                    fxn(canvas);
                    kg();
                    return;
                }
                fxn(canvas);
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        super.onDraw(canvas);
    }

    private void kg() {
        if (this.fxn == null || this.rb || !this.rlu) {
            return;
        }
        postInvalidateOnAnimation();
    }

    private void gff() {
        if (this.fxn == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.kg == 0) {
            this.kg = jUptimeMillis;
        }
        int r2 = this.fxn.duration();
        if (r2 == 0) {
            r2 = 1000;
        }
        if (!this.zu && Math.abs(r2 - this.gff) < 60) {
            this.gff = r2;
            this.mvp = true;
        } else {
            this.gff = (int) ((jUptimeMillis - this.kg) % ((long) r2));
        }
    }

    private void fxn(Canvas canvas) {
        Movie movie = this.fxn;
        if (movie == null) {
            return;
        }
        movie.setTime(this.gff);
        float f = this.jq;
        if (f == 0.0f) {
            canvas.scale(1.0f, 1.0f);
            this.fxn.draw(canvas, 0.0f, 0.0f);
        } else {
            canvas.scale(f, f);
            Movie movie2 = this.fxn;
            float f2 = this.f9317sg;
            float f3 = this.jq;
            movie2.draw(canvas, f2 / f3, this.tw / f3);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public void onScreenStateChanged(int r2) {
        super.onScreenStateChanged(r2);
        if (this.fxn != null) {
            this.rlu = r2 == 1;
            kg();
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int r2) {
        super.onVisibilityChanged(view, r2);
        if (this.fxn != null) {
            this.rlu = r2 == 0;
            kg();
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int r2) {
        super.onWindowVisibilityChanged(r2);
        if (this.fxn != null) {
            this.rlu = r2 == 0;
            kg();
        }
    }
}
