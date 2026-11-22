package com.bytedance.adsdk.ugeno.fxn;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;

/* loaded from: classes13.dex */
public class tw implements sg {
    private float bh;
    private View fxn;
    private float gff;
    private float hm;
    private float kg;
    private float rb;

    public tw(View view) {
        this.fxn = view;
    }

    public void fxn(float f) {
        View view = this.fxn;
        if (view == null) {
            return;
        }
        this.kg = f;
        Drawable background = view.getBackground();
        if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setCornerRadius(f);
        }
    }

    public float fxn() {
        return this.kg;
    }

    public void kg(float f) {
        View view = this.fxn;
        if (view == null) {
            return;
        }
        this.gff = f;
        view.postInvalidate();
    }

    @Override // com.bytedance.adsdk.ugeno.fxn.sg
    public float getRipple() {
        return this.gff;
    }

    public void gff(float f) {
        View view = this.fxn;
        if (view == null) {
            return;
        }
        this.hm = f;
        view.postInvalidate();
    }

    @Override // com.bytedance.adsdk.ugeno.fxn.sg
    public float getShine() {
        return this.hm;
    }

    public void hm(float f) {
        this.rb = f;
        this.fxn.postInvalidate();
    }

    @Override // com.bytedance.adsdk.ugeno.fxn.sg
    public float getStretch() {
        return this.rb;
    }

    public void rb(float f) {
        this.bh = f;
        this.fxn.postInvalidate();
    }

    @Override // com.bytedance.adsdk.ugeno.fxn.sg
    public float getRubIn() {
        return this.bh;
    }

    public void fxn(int i) {
        View view = this.fxn;
        if (view == null) {
            return;
        }
        Drawable background = view.getBackground();
        if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setColor(i);
        } else if (background instanceof ColorDrawable) {
            ((ColorDrawable) background.mutate()).setColor(i);
        }
    }
}
