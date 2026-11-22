package com.iflytek.cloud.ui.b;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.iflytek.cloud.msc.util.log.DebugLog;

/* loaded from: classes17.dex */
public class e extends View {

    /* renamed from: a, reason: collision with root package name */
    private Drawable f11220a;
    private Drawable b;
    private PaintFlagsDrawFilter c;
    Path d;

    public e(Context context) {
        super(context);
        this.c = new PaintFlagsDrawFilter(1, 2);
        try {
            this.f11220a = a.b(getContext(), "voice_empty");
            this.b = a.b(getContext(), "voice_full");
            this.f11220a.setBounds(new Rect((-this.f11220a.getIntrinsicWidth()) / 2, (-this.f11220a.getIntrinsicHeight()) / 2, this.f11220a.getIntrinsicWidth() / 2, this.f11220a.getIntrinsicHeight() / 2));
            this.b.setBounds(new Rect((-this.b.getIntrinsicWidth()) / 2, (-this.b.getIntrinsicHeight()) / 2, this.b.getIntrinsicWidth() / 2, this.b.getIntrinsicHeight() / 2));
            this.d = new Path();
            setVolume(0);
        } catch (Exception e) {
            DebugLog.LogE(e);
        }
    }

    public void finalize() throws Throwable {
        this.f11220a = null;
        this.b = null;
        super.finalize();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        canvas.setDrawFilter(this.c);
        canvas.translate(getWidth() / 2, getHeight() / 2);
        this.f11220a.draw(canvas);
        canvas.clipPath(this.d);
        this.b.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        Drawable background = getBackground();
        if (background != null) {
            size = background.getMinimumWidth();
            size2 = background.getMinimumHeight();
        }
        setMeasuredDimension(View.resolveSize(size, i), View.resolveSize(size2, i2));
    }

    public void setVolume(int i) {
        this.d.reset();
        this.d.addCircle(0.0f, 0.0f, (this.f11220a.getIntrinsicWidth() * i) / 12, Path.Direction.CCW);
    }
}
