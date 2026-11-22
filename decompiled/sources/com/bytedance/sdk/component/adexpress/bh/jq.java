package com.bytedance.sdk.component.adexpress.bh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* loaded from: classes13.dex */
public class jq extends View {
    private int bh;
    private int fxn;
    private final RectF gff;
    private Paint hm;
    private int kg;
    private Paint rb;

    /* renamed from: sg, reason: collision with root package name */
    private Paint f9313sg;
    private int tw;

    public jq(Context context) {
        super(context);
        this.gff = new RectF();
        fxn();
    }

    private void fxn() {
        Paint paint = new Paint();
        this.hm = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f9313sg = paint2;
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.rb = paint3;
        paint3.setAntiAlias(true);
    }

    public void setRadius(int i) {
        this.bh = i;
    }

    public void setDislikeColor(int i) {
        this.f9313sg.setColor(i);
    }

    public void setDislikeWidth(int i) {
        this.f9313sg.setStrokeWidth(i);
    }

    public void setStrokeColor(int i) {
        this.hm.setStyle(Paint.Style.STROKE);
        this.hm.setColor(i);
    }

    public void setStrokeWidth(int i) {
        this.hm.setStrokeWidth(i);
        this.tw = i;
    }

    public void setBgColor(int i) {
        this.rb.setStyle(Paint.Style.FILL);
        this.rb.setColor(i);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.gff;
        int i = this.bh;
        canvas.drawRoundRect(rectF, i, i, this.rb);
        RectF rectF2 = this.gff;
        int i2 = this.bh;
        canvas.drawRoundRect(rectF2, i2, i2, this.hm);
        int i3 = this.fxn;
        int i4 = this.kg;
        canvas.drawLine(i3 * 0.3f, i4 * 0.3f, i3 * 0.7f, i4 * 0.7f, this.f9313sg);
        int i5 = this.fxn;
        int i6 = this.kg;
        canvas.drawLine(i5 * 0.7f, i6 * 0.3f, i5 * 0.3f, i6 * 0.7f, this.f9313sg);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.fxn = i;
        this.kg = i2;
        RectF rectF = this.gff;
        int i5 = this.tw;
        rectF.set(i5, i5, i - i5, i2 - i5);
    }
}
