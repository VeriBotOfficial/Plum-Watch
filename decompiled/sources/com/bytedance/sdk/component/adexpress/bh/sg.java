package com.bytedance.sdk.component.adexpress.bh;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.CycleInterpolator;
import android.widget.TextView;

/* loaded from: classes13.dex */
public class sg extends iwp {
    private TextView fxn;
    private AnimatorSet gff;
    private View kg;

    @Override // com.bytedance.sdk.component.adexpress.bh.iwp
    protected void fxn(Context context) {
    }

    public sg(Context context) {
        super(context);
        this.gff = new AnimatorSet();
        kg(context);
    }

    private void kg(Context context) {
        View fxn = com.bytedance.sdk.component.adexpress.gff.fxn.fxn(context);
        this.kg = fxn;
        addView(fxn);
        setClipChildren(false);
        this.fxn = (TextView) findViewById(2097610748);
    }

    public void setButtonText(String str) {
        if (this.fxn == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.fxn.setText(str);
    }

    private void hm() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.kg, "translationY", 0.0f, com.bytedance.sdk.component.adexpress.hm.sg.fxn(getContext(), -3.0f));
        ofFloat.setInterpolator(new CycleInterpolator(1.0f));
        ofFloat.setDuration(1000L);
        ofFloat.setRepeatCount(-1);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.kg, "alpha", 1.0f, 0.8f);
        ofFloat2.setDuration(1000L);
        ofFloat2.setInterpolator(new CycleInterpolator(1.0f));
        ofFloat2.setRepeatCount(-1);
        this.gff.playTogether(ofFloat, ofFloat2);
        this.gff.setDuration(1000L);
        this.gff.start();
    }

    @Override // com.bytedance.sdk.component.adexpress.bh.iwp
    public void fxn() {
        hm();
    }

    @Override // com.bytedance.sdk.component.adexpress.bh.iwp
    public void kg() {
        this.gff.cancel();
    }
}
