package com.bytedance.adsdk.ugeno.jq.rb;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.GravityCompat;
import com.bytedance.adsdk.ugeno.hm;
import com.bytedance.adsdk.ugeno.sg.tw;

/* loaded from: classes13.dex */
public class fxn extends FrameLayout {
    private LinearLayout bh;
    private float fxn;
    private double gff;
    private float hm;
    private float kg;
    private LinearLayout rb;

    /* renamed from: sg, reason: collision with root package name */
    private Context f9294sg;
    private hm tw;

    public fxn(Context context) {
        super(context);
        this.f9294sg = context;
        this.rb = new LinearLayout(context);
        this.bh = new LinearLayout(context);
        this.rb.setOrientation(0);
        this.rb.setGravity(GravityCompat.START);
        this.bh.setOrientation(0);
        this.bh.setGravity(GravityCompat.START);
    }

    public void fxn(double d, int i, int i2, float f, int i3) {
        removeAllViews();
        this.rb.removeAllViews();
        this.bh.removeAllViews();
        this.fxn = (int) tw.fxn(this.f9294sg, f);
        this.kg = (int) tw.fxn(this.f9294sg, f);
        this.gff = d;
        this.hm = i3;
        for (int i4 = 0; i4 < 5; i4++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setImageResource(com.bytedance.adsdk.ugeno.sg.hm.kg(this.f9294sg, "tt_ugen_rating_star"));
            starImageView.setColorFilter(i, PorterDuff.Mode.SRC_IN);
            this.bh.addView(starImageView);
        }
        for (int i5 = 0; i5 < 5; i5++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView2.setImageResource(com.bytedance.adsdk.ugeno.sg.hm.kg(this.f9294sg, "tt_ugen_rating_star"));
            starImageView2.setColorFilter(i2);
            this.rb.addView(starImageView2);
        }
        addView(this.rb);
        addView(this.bh);
        requestLayout();
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) this.fxn, (int) this.kg);
        layoutParams.leftMargin = (int) this.hm;
        layoutParams.topMargin = 0;
        layoutParams.rightMargin = (int) this.hm;
        layoutParams.bottomMargin = 1;
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        hm hmVar = this.tw;
        if (hmVar != null) {
            hmVar.fxn(i, i2);
        }
        super.onMeasure(i, i2);
        this.rb.measure(i, i2);
        double floor = Math.floor(this.gff);
        this.bh.measure(View.MeasureSpec.makeMeasureSpec((int) (((r0 + r0 + r2) * floor) + this.hm + ((this.gff - floor) * this.fxn)), 1073741824), View.MeasureSpec.makeMeasureSpec(this.rb.getMeasuredHeight(), 1073741824));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        hm hmVar = this.tw;
        if (hmVar != null) {
            hmVar.fxn(i, i2, i3, i4);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        hm hmVar = this.tw;
        if (hmVar != null) {
            hmVar.sg();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hm hmVar = this.tw;
        if (hmVar != null) {
            hmVar.tw();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        hm hmVar = this.tw;
        if (hmVar != null) {
            hmVar.kg(i, i2, i3, i4);
        }
    }

    public void fxn(hm hmVar) {
        this.tw = hmVar;
    }
}
