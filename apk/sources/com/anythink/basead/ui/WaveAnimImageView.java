package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes7.dex */
public class WaveAnimImageView extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f3153a;
    int b;
    private Paint c;
    private a d;

    public WaveAnimImageView(Context context) {
        super(context);
        a();
    }

    public WaveAnimImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public WaveAnimImageView(Context context, AttributeSet attributeSet, int r3) {
        super(context, attributeSet, r3);
        a();
    }

    private void a() {
        Paint paint = new Paint();
        this.c = paint;
        paint.setAntiAlias(true);
        this.c.setStyle(Paint.Style.STROKE);
        this.c.setColor(Color.parseColor("#FFFFFF"));
    }

    public void setWaveAnimParams(a aVar) {
        this.d = aVar;
        postInvalidate();
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int r2, int r3, int r4, int r5) {
        super.onLayout(z, r2, r3, r4, r5);
        this.f3153a = getWidth() / 2;
        this.b = getHeight() / 2;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        a aVar = this.d;
        if (aVar != null) {
            this.c.setAlpha((int) (aVar.c * 255.0f));
            this.c.setStrokeWidth(this.d.b);
            canvas.drawCircle(this.f3153a, this.b, this.d.f3154a, this.c);
        }
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f3154a;
        float b;
        float c;

        public a(float f, float f2, float f3) {
            this.f3154a = f;
            this.b = f2;
            this.c = f3;
        }
    }
}
