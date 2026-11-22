package com.bytedance.sdk.component.adexpress.bh;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.zn;

/* loaded from: classes13.dex */
public class gff extends FrameLayout {
    private AnimatorSet bh;
    private Context fxn;
    private ImageView gff;
    private TextView hm;
    private ImageView kg;
    private rmu rb;

    public gff(Context context) {
        super(context);
        this.bh = new AnimatorSet();
        this.fxn = context;
        rb();
        bh();
    }

    private void rb() {
        FrameLayout frameLayout = new FrameLayout(this.fxn);
        this.rb = new rmu(this.fxn);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.hm.sg.fxn(this.fxn, 95.0f), (int) com.bytedance.sdk.component.adexpress.hm.sg.fxn(this.fxn, 95.0f));
        layoutParams.gravity = 17;
        frameLayout.addView(this.rb, layoutParams);
        this.kg = new ImageView(this.fxn);
        int fxn = zn.fxn(this.fxn, 60.0f);
        this.kg.setImageDrawable(com.bytedance.sdk.component.adexpress.hm.tw.fxn(1, null, null, new int[]{fxn, fxn}, Integer.valueOf(zn.fxn(this.fxn, 1.0f)), Integer.valueOf(Color.parseColor("#80FFFFFF"))));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.hm.sg.fxn(this.fxn, 75.0f), (int) com.bytedance.sdk.component.adexpress.hm.sg.fxn(this.fxn, 75.0f));
        layoutParams2.gravity = 17;
        frameLayout.addView(this.kg, layoutParams2);
        this.gff = new ImageView(this.fxn);
        int fxn2 = zn.fxn(this.fxn, 50.0f);
        this.gff.setImageDrawable(com.bytedance.sdk.component.adexpress.hm.tw.fxn(1, Integer.valueOf(Color.parseColor("#80FFFFFF")), null, new int[]{fxn2, fxn2}, null, null));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.hm.sg.fxn(this.fxn, 63.0f), (int) com.bytedance.sdk.component.adexpress.hm.sg.fxn(this.fxn, 63.0f));
        layoutParams3.gravity = 17;
        frameLayout.addView(this.gff, layoutParams3);
        addView(frameLayout);
        TextView textView = new TextView(this.fxn);
        this.hm = textView;
        textView.setTextColor(-1);
        this.hm.setMaxLines(1);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 81;
        addView(this.hm, layoutParams4);
    }

    private void bh() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.gff, "scaleX", 1.0f, 0.9f);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.setRepeatMode(2);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.gff, "scaleY", 1.0f, 0.9f);
        ofFloat2.setRepeatCount(-1);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.bh.setDuration(800L);
        this.bh.playTogether(ofFloat, ofFloat2);
    }

    public void setGuideText(String str) {
        this.hm.setText(str);
    }

    public void fxn() {
        this.bh.start();
    }

    public void kg() {
        this.bh.cancel();
    }

    public void gff() {
        this.rb.fxn();
    }

    public void hm() {
        this.rb.kg();
        this.rb.gff();
    }
}
