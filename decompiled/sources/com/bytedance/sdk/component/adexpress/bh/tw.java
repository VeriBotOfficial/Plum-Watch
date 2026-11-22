package com.bytedance.sdk.component.adexpress.bh;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes13.dex */
public class tw extends iwp {
    private AnimatorSet bh;
    private TextView fxn;
    private ImageView gff;
    private ImageView hm;
    private ImageView kg;
    private int rb;

    @Override // com.bytedance.sdk.component.adexpress.bh.iwp
    protected void fxn(Context context) {
    }

    public tw(Context context) {
        super(context);
        this.bh = new AnimatorSet();
        kg(context);
    }

    private void kg(Context context) {
        addView(com.bytedance.sdk.component.adexpress.gff.fxn.kg(context));
        this.kg = (ImageView) findViewById(2097610751);
        this.gff = (ImageView) findViewById(2097610750);
        this.hm = (ImageView) findViewById(2097610749);
        this.fxn = (TextView) findViewById(2097610748);
    }

    public void setButtonText(String str) {
        if (this.fxn == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.fxn.setText(str);
    }

    private void hm() {
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "alphaColor", 0, 60);
        ofInt.setInterpolator(new LinearInterpolator());
        ofInt.setDuration(2000L);
        ofInt.setRepeatCount(-1);
        ofInt.start();
    }

    public float getAlphaColor() {
        return this.rb;
    }

    public void setAlphaColor(int i) {
        if (i < 0 || i > 60) {
            return;
        }
        int i2 = i + 195;
        this.hm.setColorFilter(Color.rgb(i2, i2, i2), PorterDuff.Mode.SRC_IN);
        int i3 = ((i + 20) % 60) + 195;
        this.gff.setColorFilter(Color.rgb(i3, i3, i3), PorterDuff.Mode.SRC_IN);
        int i4 = ((i + 40) % 60) + 195;
        this.kg.setColorFilter(Color.rgb(i4, i4, i4), PorterDuff.Mode.SRC_IN);
    }

    @Override // com.bytedance.sdk.component.adexpress.bh.iwp
    public void fxn() {
        hm();
    }

    @Override // com.bytedance.sdk.component.adexpress.bh.iwp
    public void kg() {
        this.bh.cancel();
    }
}
