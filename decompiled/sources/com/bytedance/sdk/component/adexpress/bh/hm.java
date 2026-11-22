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

/* loaded from: classes13.dex */
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

    /* renamed from: sg, reason: collision with root package name */
    private boolean f9310sg;
    private List<Integer> tw;
    private int zu;

    public hm(Context context) {
        this(context, null);
    }

    public hm(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public hm(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
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
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = i / 2.0f;
        this.mvp = f;
        this.rlu = i2 / 2.0f;
        float f2 = f - (this.zu / 2.0f);
        this.rb = f2;
        this.gff = f2 / 4.0f;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(Math.min(size, size2), Math.min(size, size2));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.hie.setShader(new LinearGradient(this.mvp, 0.0f, this.rlu, getMeasuredHeight(), -1, 16777215, Shader.TileMode.CLAMP));
        int i = 0;
        while (true) {
            if (i >= this.tw.size()) {
                break;
            }
            Integer num = this.tw.get(i);
            this.hie.setAlpha(num.intValue());
            Integer num2 = this.jq.get(i);
            if (this.gff + num2.intValue() < this.rb) {
                canvas.drawCircle(this.mvp, this.rlu, this.gff + num2.intValue(), this.hie);
            }
            if (num.intValue() > 0 && num2.intValue() < this.rb) {
                this.tw.set(i, Integer.valueOf(num.intValue() - this.bh > 0 ? num.intValue() - (this.bh * 3) : 1));
                this.jq.set(i, Integer.valueOf(num2.intValue() + this.bh));
            }
            i++;
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

    public void setColor(int i) {
        this.fxn = i;
    }

    public void setCoreColor(int i) {
        this.kg = i;
    }

    public void setCoreRadius(int i) {
        this.gff = i;
    }

    public void setDiffuseWidth(int i) {
        this.hm = i;
    }

    public void setMaxWidth(int i) {
        this.rb = i;
    }

    public void setDiffuseSpeed(int i) {
        this.bh = i;
    }
}
