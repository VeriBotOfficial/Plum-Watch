package com.bytedance.sdk.component.adexpress.bh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.GravityCompat;

/* loaded from: classes13.dex */
public class bx extends FrameLayout {
    private Drawable bh;
    LinearLayout fxn;
    private float gff;
    private float hm;
    LinearLayout kg;
    private Drawable rb;

    /* renamed from: sg, reason: collision with root package name */
    private double f9308sg;
    private float tw;
    private static final int jq = (com.bytedance.sdk.component.adexpress.dynamic.rb.dgx.kg("", 0.0f, true)[1] / 2) + 1;
    private static final int hie = (com.bytedance.sdk.component.adexpress.dynamic.rb.dgx.kg("", 0.0f, true)[1] / 2) + 3;

    public bx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.fxn = new LinearLayout(getContext());
        this.kg = new LinearLayout(getContext());
        this.fxn.setOrientation(0);
        this.fxn.setGravity(GravityCompat.START);
        this.kg.setOrientation(0);
        this.kg.setGravity(GravityCompat.START);
        this.rb = com.bytedance.sdk.component.utils.jz.gff(context, "tt_star_thick");
        this.bh = com.bytedance.sdk.component.utils.jz.gff(context, "tt_star");
    }

    public Drawable getStarEmptyDrawable() {
        return this.rb;
    }

    public Drawable getStarFillDrawable() {
        return this.bh;
    }

    public void fxn(double d, int i, int i2, int i3) {
        float f = i2;
        this.gff = (int) com.bytedance.sdk.component.adexpress.hm.sg.gff(getContext(), f);
        this.hm = (int) com.bytedance.sdk.component.adexpress.hm.sg.gff(getContext(), f);
        this.f9308sg = d;
        this.tw = i3;
        removeAllViews();
        for (int i4 = 0; i4 < 5; i4++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setColorFilter(i, PorterDuff.Mode.SRC_IN);
            starImageView.setImageDrawable(getStarFillDrawable());
            this.kg.addView(starImageView);
        }
        for (int i5 = 0; i5 < 5; i5++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView2.setImageDrawable(getStarEmptyDrawable());
            this.fxn.addView(starImageView2);
        }
        addView(this.fxn);
        addView(this.kg);
        requestLayout();
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new ViewGroup.LayoutParams((int) this.gff, (int) this.hm));
        imageView.setPadding(1, jq, 1, hie);
        return imageView;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.fxn.measure(i, i2);
        double d = this.f9308sg;
        float f = this.gff;
        this.kg.measure(View.MeasureSpec.makeMeasureSpec((int) ((((int) d) * f) + 1.0f + ((f - 2.0f) * (d - ((int) d)))), 1073741824), View.MeasureSpec.makeMeasureSpec(this.fxn.getMeasuredHeight(), 1073741824));
        if (this.tw > 0.0f) {
            this.fxn.setPadding(0, ((int) (r7.getMeasuredHeight() - this.tw)) / 2, 0, 0);
            this.kg.setPadding(0, ((int) (this.fxn.getMeasuredHeight() - this.tw)) / 2, 0, 0);
        }
    }
}
