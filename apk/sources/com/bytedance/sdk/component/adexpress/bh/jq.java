package com.bytedance.sdk.component.adexpress.bh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: loaded from: classes15.dex */
public class jq extends View {
    private int bh;
    private int fxn;
    private final RectF gff;
    private Paint hm;
    private int kg;
    private Paint rb;

    /* JADX INFO: renamed from: sg, reason: collision with root package name */
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

    public void setRadius(int r1) {
        this.bh = r1;
    }

    public void setDislikeColor(int r2) {
        this.f9313sg.setColor(r2);
    }

    public void setDislikeWidth(int r2) {
        this.f9313sg.setStrokeWidth(r2);
    }

    public void setStrokeColor(int r3) {
        this.hm.setStyle(Paint.Style.STROKE);
        this.hm.setColor(r3);
    }

    public void setStrokeWidth(int r3) {
        this.hm.setStrokeWidth(r3);
        this.tw = r3;
    }

    public void setBgColor(int r3) {
        this.rb.setStyle(Paint.Style.FILL);
        this.rb.setColor(r3);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.gff;
        int r1 = this.bh;
        canvas.drawRoundRect(rectF, r1, r1, this.rb);
        RectF rectF2 = this.gff;
        int r2 = this.bh;
        canvas.drawRoundRect(rectF2, r2, r2, this.hm);
        int r0 = this.fxn;
        int r3 = this.kg;
        canvas.drawLine(r0 * 0.3f, r3 * 0.3f, r0 * 0.7f, r3 * 0.7f, this.f9313sg);
        int r4 = this.fxn;
        int r5 = this.kg;
        canvas.drawLine(r4 * 0.7f, r5 * 0.3f, r4 * 0.3f, r5 * 0.7f, this.f9313sg);
    }

    @Override // android.view.View
    protected void onSizeChanged(int r3, int r4, int r5, int r6) {
        super.onSizeChanged(r3, r4, r5, r6);
        this.fxn = r3;
        this.kg = r4;
        RectF rectF = this.gff;
        int r7 = this.tw;
        rectF.set(r7, r7, r3 - r7, r4 - r7);
    }
}
