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

/* JADX INFO: loaded from: classes11.dex */
public class tw extends View {
    private static final int[] fxn = {Color.parseColor("#1AFFFFFF"), Color.parseColor("#4DFFFFFF"), Color.parseColor("#99FFFFFF")};
    private final Paint bh;
    private final RectF gff;
    private final ArrayList<fxn> hm;
    private int jq;
    private final RectF kg;
    private final Paint rb;

    /* JADX INFO: renamed from: sg, reason: collision with root package name */
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

    public void setProgress(int r3) {
        int r0 = this.tw;
        if (r0 == r3) {
            return;
        }
        if (r3 < 0) {
            r3 = 0;
        } else if (r3 > 100) {
            r3 = 100;
        }
        if (r0 == r3) {
            return;
        }
        this.tw = r3;
        fxn();
    }

    private void fxn() {
        if (this.f9536sg <= 0) {
            return;
        }
        this.gff.right = Math.max(this.jq, (int) (((this.tw * 1.0f) / 100.0f) * getWidth()));
        invalidate();
    }

    @Override // android.view.View
    protected void onSizeChanged(int r9, int r10, int r11, int r12) {
        super.onSizeChanged(r9, r10, r11, r12);
        int r13 = r10 / 2;
        this.f9536sg = r13;
        this.jq = r13 * 5;
        float f = r9;
        float f2 = r10;
        this.kg.set(0.0f, 0.0f, f, f2);
        this.gff.set(0.0f, 0.0f, 0.0f, f2);
        this.bh.setShader(new LinearGradient(0.0f, 0.0f, f, f2, new int[]{Color.parseColor("#90C0FF"), Color.parseColor("#196BE4")}, (float[]) null, Shader.TileMode.CLAMP));
        this.hm.clear();
        float f3 = this.f9536sg / 4.0f;
        for (int r1 : fxn) {
            Paint paint = new Paint();
            paint.setColor(r1);
            this.hm.add(new fxn(paint, this.f9536sg / 2.0f, f3, f2 / 2.0f));
            f3 += (this.f9536sg / 2.0f) * 3.0f;
        }
        fxn();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.kg;
        int r1 = this.f9536sg;
        canvas.drawRoundRect(rectF, r1, r1, this.rb);
        RectF rectF2 = this.gff;
        int r2 = this.f9536sg;
        canvas.drawRoundRect(rectF2, r2, r2, this.bh);
        int r0 = canvas.save();
        canvas.translate(this.gff.right - this.jq, 0.0f);
        for (fxn fxnVar : this.hm) {
            canvas.drawCircle(fxnVar.gff, fxnVar.hm, fxnVar.kg, fxnVar.fxn);
        }
        canvas.restoreToCount(r0);
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
