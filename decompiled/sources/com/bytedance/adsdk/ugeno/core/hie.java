package com.bytedance.adsdk.ugeno.core;

import android.animation.AnimatorSet;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes13.dex */
public class hie {
    private int bh;
    Paint fxn;
    private AnimatorSet gff = new AnimatorSet();
    private View hm;
    private fxn kg;
    private int rb;

    /* renamed from: sg, reason: collision with root package name */
    private String f9274sg;

    public hie(View view, fxn fxnVar) {
        this.hm = view;
        this.kg = fxnVar;
        Paint paint = new Paint();
        this.fxn = paint;
        paint.setAntiAlias(true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0187, code lost:
    
        if (r2.equals("accelerate") == false) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void fxn() {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.core.hie.fxn():void");
    }

    public void kg() {
        AnimatorSet animatorSet = this.gff;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public void fxn(Canvas canvas, IAnimation iAnimation) {
        try {
            if (iAnimation.getRipple() == 0.0f || TextUtils.isEmpty(this.f9274sg)) {
                return;
            }
            this.fxn.setColor(com.bytedance.adsdk.ugeno.sg.fxn.fxn(this.f9274sg));
            this.fxn.setAlpha(90);
            ((ViewGroup) this.hm.getParent()).setClipChildren(true);
            canvas.drawCircle(this.rb, this.bh, Math.min(r0, r2) * 2 * iAnimation.getRipple(), this.fxn);
        } catch (Throwable th) {
            Log.d("UGenAnimation", "ripple animation error " + th.getMessage());
        }
    }

    public void fxn(int i, int i2) {
        this.rb = i / 2;
        this.bh = i2 / 2;
    }
}
