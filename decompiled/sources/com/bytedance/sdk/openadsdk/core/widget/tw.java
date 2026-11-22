package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes14.dex */
public class tw extends View {
    private static final int[] fxn = {Color.parseColor("#1AFFFFFF"), Color.parseColor("#4DFFFFFF"), Color.parseColor("#99FFFFFF")};
    private final Paint bh;
    private final RectF gff;
    private final ArrayList<fxn> hm;
    private int jq;
    private final RectF kg;
    private final Paint rb;

    /* renamed from: sg, reason: collision with root package name */
    private int f9536sg;
    private int tw;

    public tw(Context context) {
        super(context);
        this.kg = new RectF();
        this.gff = new RectF();
        this.hm = new ArrayList<>();
        this.bh = new Paint();
        Paint paint = new Paint();
        this.rb = paint;
        paint.setColor(Color.parseColor("#D9D9D9"));
    }

    public void setProgress(int i) {
        int i2 = this.tw;
        if (i2 == i) {
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i > 100) {
            i = 100;
        }
        if (i2 == i) {
            return;
        }
        this.tw = i;
        fxn();
    }

    private void fxn() {
        if (this.f9536sg <= 0) {
            return;
        }
        int width = (int) (((this.tw * 1.0f) / 100.0f) * getWidth());
        this.gff.right = Math.max(this.jq, width);
        invalidate();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int i5 = i2 / 2;
        this.f9536sg = i5;
        this.jq = i5 * 5;
        float f = i;
        float f2 = i2;
        this.kg.set(0.0f, 0.0f, f, f2);
        this.gff.set(0.0f, 0.0f, 0.0f, f2);
        this.bh.setShader(new LinearGradient(0.0f, 0.0f, f, f2, new int[]{Color.parseColor("#90C0FF"), Color.parseColor("#196BE4")}, (float[]) null, Shader.TileMode.CLAMP));
        this.hm.clear();
        float f3 = this.f9536sg / 4.0f;
        for (int i6 : fxn) {
            Paint paint = new Paint();
            paint.setColor(i6);
            this.hm.add(new fxn(paint, this.f9536sg / 2.0f, f3, f2 / 2.0f));
            f3 += (this.f9536sg / 2.0f) * 3.0f;
        }
        fxn();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.kg;
        int i = this.f9536sg;
        canvas.drawRoundRect(rectF, i, i, this.rb);
        RectF rectF2 = this.gff;
        int i2 = this.f9536sg;
        canvas.drawRoundRect(rectF2, i2, i2, this.bh);
        int save = canvas.save();
        canvas.translate(this.gff.right - this.jq, 0.0f);
        Iterator<fxn> it = this.hm.iterator();
        while (it.hasNext()) {
            fxn next = it.next();
            canvas.drawCircle(next.gff, next.hm, next.kg, next.fxn);
        }
        canvas.restoreToCount(save);
    }

    private static final class fxn {
        public Paint fxn;
        float gff;
        float hm;
        public float kg;

        public fxn(Paint paint, float f, float f2, float f3) {
            this.fxn = paint;
            this.kg = f;
            this.gff = f2;
            this.hm = f3;
        }
    }
}
