package com.bytedance.sdk.component.adexpress.bh;

import android.content.Context;
import android.text.TextUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes13.dex */
public class dgx extends FrameLayout {
    private final TextView fxn;
    private final mvp gff;
    private final RotateAnimation hm;
    private final ImageView kg;

    public dgx(Context context) {
        super(context);
        addView(com.bytedance.sdk.component.adexpress.gff.fxn.hm(context));
        this.fxn = (TextView) findViewById(2097610742);
        this.kg = (ImageView) findViewById(2097610745);
        this.gff = (mvp) findViewById(2097610744);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 30.0f, 1, 0.65f, 1, 0.9f);
        this.hm = rotateAnimation;
        rotateAnimation.setDuration(300L);
        rotateAnimation.setRepeatMode(2);
        rotateAnimation.setRepeatCount(1);
        rotateAnimation.setInterpolator(new LinearInterpolator());
    }

    public void setText(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "Slide or click to jump to the details page or third-party application";
        }
        TextView textView = this.fxn;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void fxn() {
        postDelayed(getHaloAnimation(), 300L);
    }

    public void kg() {
        this.hm.cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Runnable getHaloAnimation() {
        return new Runnable() { // from class: com.bytedance.sdk.component.adexpress.bh.dgx.1
            @Override // java.lang.Runnable
            public void run() {
                dgx.this.kg.startAnimation(dgx.this.hm);
                dgx.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.bh.dgx.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        dgx.this.gff.fxn(4);
                    }
                }, 100L);
                dgx.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.bh.dgx.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        dgx.this.gff.fxn(4);
                    }
                }, 300L);
                dgx dgxVar = dgx.this;
                dgxVar.postDelayed(dgxVar.getHaloAnimation(), 1200L);
            }
        };
    }
}
