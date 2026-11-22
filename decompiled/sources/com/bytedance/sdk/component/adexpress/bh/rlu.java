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

/* loaded from: classes13.dex */
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

    /* renamed from: sg, reason: collision with root package name */
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
    protected void onMeasure(int i, int i2) {
        Movie movie;
        int size;
        int size2;
        super.onMeasure(i, i2);
        if (this.rb || (movie = this.fxn) == null) {
            return;
        }
        int width = movie.width();
        int height = this.fxn.height();
        float max = 1.0f / Math.max((View.MeasureSpec.getMode(i) == 0 || width <= (size2 = View.MeasureSpec.getSize(i))) ? 1.0f : width / size2, (View.MeasureSpec.getMode(i2) == 0 || height <= (size = View.MeasureSpec.getSize(i2))) ? 1.0f : height / size);
        this.jq = max;
        int i3 = (int) (width * max);
        this.hie = i3;
        int i4 = (int) (height * max);
        this.dgx = i4;
        setMeasuredDimension(i3, i4);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
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
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.kg == 0) {
            this.kg = uptimeMillis;
        }
        int duration = this.fxn.duration();
        if (duration == 0) {
            duration = 1000;
        }
        if (!this.zu && Math.abs(duration - this.gff) < 60) {
            this.gff = duration;
            this.mvp = true;
        } else {
            this.gff = (int) ((uptimeMillis - this.kg) % duration);
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
    public void onScreenStateChanged(int i) {
        super.onScreenStateChanged(i);
        if (this.fxn != null) {
            this.rlu = i == 1;
            kg();
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (this.fxn != null) {
            this.rlu = i == 0;
            kg();
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.fxn != null) {
            this.rlu = i == 0;
            kg();
        }
    }
}
