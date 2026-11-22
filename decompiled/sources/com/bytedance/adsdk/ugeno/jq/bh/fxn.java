package com.bytedance.adsdk.ugeno.jq.bh;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Log;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.fxn.sg;
import com.bytedance.adsdk.ugeno.fxn.tw;
import com.bytedance.adsdk.ugeno.hm;

/* loaded from: classes13.dex */
public class fxn extends TextView implements IAnimation, sg {
    private float bh;
    private hm fxn;
    private tw gff;
    private float hm;
    private float kg;
    private float rb;

    /* renamed from: sg, reason: collision with root package name */
    private float f9291sg;

    public fxn(Context context) {
        super(context);
        this.hm = -1.0f;
        this.bh = 1.0f;
        this.f9291sg = 0.0f;
        this.gff = new tw(this);
    }

    public void fxn(hm hmVar) {
        this.fxn = hmVar;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        hm hmVar = this.fxn;
        if (hmVar != null) {
            int[] fxn = hmVar.fxn(i, i2);
            super.onMeasure(fxn[0], fxn[1]);
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        hm hmVar = this.fxn;
        if (hmVar != null) {
            hmVar.fxn(i, i2, i3, i4);
        }
        if (z && this.hm > 0.0f) {
            fxn(((i3 - i) - getCompoundPaddingLeft()) - getCompoundPaddingRight(), ((i4 - i2) - getCompoundPaddingBottom()) - getCompoundPaddingTop());
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation, com.bytedance.adsdk.ugeno.fxn.sg
    public float getRipple() {
        return this.kg;
    }

    public void setShine(float f) {
        tw twVar = this.gff;
        if (twVar != null) {
            twVar.gff(f);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.fxn.sg
    public float getShine() {
        return this.gff.getShine();
    }

    public void setStretch(float f) {
        tw twVar = this.gff;
        if (twVar != null) {
            twVar.hm(f);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.fxn.sg
    public float getStretch() {
        return this.gff.getStretch();
    }

    public void setRubIn(float f) {
        tw twVar = this.gff;
        if (twVar != null) {
            twVar.rb(f);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.fxn.sg
    public float getRubIn() {
        return this.gff.getRubIn();
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public void setRipple(float f) {
        this.kg = f;
        tw twVar = this.gff;
        if (twVar != null) {
            twVar.kg(f);
        }
        postInvalidate();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        hm hmVar = this.fxn;
        if (hmVar != null) {
            hmVar.fxn(canvas, this);
            this.fxn.fxn(canvas);
        }
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        hm hmVar = this.fxn;
        if (hmVar != null) {
            hmVar.kg(canvas);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        hm hmVar = this.fxn;
        if (hmVar != null) {
            hmVar.kg(i, i2, i3, i3);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        hm hmVar = this.fxn;
        if (hmVar != null) {
            hmVar.sg();
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hm hmVar = this.fxn;
        if (hmVar != null) {
            hmVar.tw();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    public void setBorderRadius(float f) {
        tw twVar = this.gff;
        if (twVar != null) {
            twVar.fxn(f);
        }
    }

    public float getBorderRadius() {
        return this.gff.fxn();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.gff.fxn(i);
    }

    @Override // android.widget.TextView
    public void setTextSize(float f) {
        super.setTextSize(f);
        this.rb = getTextSize();
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        this.rb = getTextSize();
    }

    public void setMinTextSize(float f) {
        this.hm = f;
    }

    private void fxn(int i, int i2) {
        CharSequence text = getText();
        if (text == null || text.length() == 0 || i2 <= 0 || i <= 0 || this.rb == 0.0f) {
            return;
        }
        TextPaint paint = getPaint();
        float f = this.rb;
        int fxn = fxn(text, paint, i, f);
        while (fxn > i2 && f > this.hm) {
            Log.d("UGTextView", "resizeText: targetSize=" + f + "; mMinTextSize=" + this.hm);
            f = Math.max(f - 1.0f, this.hm);
            fxn = fxn(text, paint, i, f);
        }
        Log.d("UGTextView", "resizeText: targetSize: ".concat(String.valueOf(f)));
        setTextSize(0, f);
        setLineSpacing(this.f9291sg, this.bh);
    }

    private int fxn(CharSequence charSequence, TextPaint textPaint, int i, float f) {
        TextPaint textPaint2 = new TextPaint(textPaint);
        textPaint2.setTextSize(f);
        return new StaticLayout(charSequence, textPaint2, i, Layout.Alignment.ALIGN_NORMAL, this.bh, this.f9291sg, true).getHeight();
    }

    @Override // android.widget.TextView
    public void setLineSpacing(float f, float f2) {
        super.setLineSpacing(f, f2);
        this.bh = f2;
        this.f9291sg = f;
    }
}
