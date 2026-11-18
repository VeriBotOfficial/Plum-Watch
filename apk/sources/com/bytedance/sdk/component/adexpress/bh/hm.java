package com.bytedance.sdk.component.adexpress.bh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.internal.view.SupportMenu;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class hm extends View {
    private int bh;
    private Paint dgx;
    private int fxn;
    private float gff;
    private Paint hie;
    private int hm;
    private List<Integer> jq;
    private int kg;
    private float mvp;
    private float rb;
    private float rlu;

    /* JADX INFO: renamed from: sg, reason: collision with root package name */
    private boolean f9310sg;
    private List<Integer> tw;
    private int zu;

    public hm(Context context) {
        this(context, null);
    }

    public hm(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public hm(Context context, AttributeSet attributeSet, int r3) {
        super(context, attributeSet, r3);
        this.fxn = -1;
        this.kg = SupportMenu.CATEGORY_MASK;
        this.gff = 18.0f;
        this.hm = 3;
        this.rb = 50.0f;
        this.bh = 2;
        this.f9310sg = false;
        this.tw = new ArrayList();
        this.jq = new ArrayList();
        this.zu = 24;
        gff();
    }

    private void gff() {
        Paint paint = new Paint();
        this.hie = paint;
        paint.setAntiAlias(true);
        this.hie.setStrokeWidth(this.zu);
        this.tw.add(255);
        this.jq.add(0);
        Paint paint2 = new Paint();
        this.dgx = paint2;
        paint2.setAntiAlias(true);
        this.dgx.setColor(Color.parseColor("#0FFFFFFF"));
        this.dgx.setStyle(Paint.Style.FILL);
    }

    @Override // android.view.View
    public void invalidate() {
        if (hasWindowFocus()) {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            invalidate();
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int r1, int r2, int r3, int r4) {
        super.onSizeChanged(r1, r2, r3, r4);
        float f = r1 / 2.0f;
        this.mvp = f;
        this.rlu = r2 / 2.0f;
        float f2 = f - (this.zu / 2.0f);
        this.rb = f2;
        this.gff = f2 / 4.0f;
    }

    @Override // android.view.View
    protected void onMeasure(int r2, int r3) {
        super.onMeasure(r2, r3);
        int size = View.MeasureSpec.getSize(r2);
        int size2 = View.MeasureSpec.getSize(r3);
        setMeasuredDimension(Math.min(size, size2), Math.min(size, size2));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.hie.setShader(new LinearGradient(this.mvp, 0.0f, this.rlu, getMeasuredHeight(), -1, 16777215, Shader.TileMode.CLAMP));
        int r1 = 0;
        while (true) {
            if (r1 >= this.tw.size()) {
                break;
            }
            Integer num = this.tw.get(r1);
            this.hie.setAlpha(num.intValue());
            Integer num2 = this.jq.get(r1);
            if (this.gff + num2.intValue() < this.rb) {
                canvas.drawCircle(this.mvp, this.rlu, this.gff + num2.intValue(), this.hie);
            }
            if (num.intValue() > 0 && num2.intValue() < this.rb) {
                this.tw.set(r1, Integer.valueOf(num.intValue() - this.bh > 0 ? num.intValue() - (this.bh * 3) : 1));
                this.jq.set(r1, Integer.valueOf(num2.intValue() + this.bh));
            }
            r1++;
        }
        List<Integer> list = this.jq;
        if (list.get(list.size() - 1).intValue() >= this.rb / this.hm) {
            this.tw.add(255);
            this.jq.add(0);
        }
        if (this.jq.size() >= 3) {
            this.jq.remove(0);
            this.tw.remove(0);
        }
        this.hie.setAlpha(255);
        this.hie.setColor(this.kg);
        canvas.drawCircle(this.mvp, this.rlu, this.gff, this.dgx);
        if (this.f9310sg) {
            invalidate();
        }
    }

    public void fxn() {
        this.f9310sg = true;
        invalidate();
    }

    public void kg() {
        this.f9310sg = false;
        this.jq.clear();
        this.tw.clear();
        this.tw.add(255);
        this.jq.add(0);
        invalidate();
    }

    public void setColor(int r1) {
        this.fxn = r1;
    }

    public void setCoreColor(int r1) {
        this.kg = r1;
    }

    public void setCoreRadius(int r1) {
        this.gff = r1;
    }

    public void setDiffuseWidth(int r1) {
        this.hm = r1;
    }

    public void setMaxWidth(int r1) {
        this.rb = r1;
    }

    public void setDiffuseSpeed(int r1) {
        this.bh = r1;
    }
}
