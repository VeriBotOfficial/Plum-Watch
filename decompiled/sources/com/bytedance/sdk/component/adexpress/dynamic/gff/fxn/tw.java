package com.bytedance.sdk.component.adexpress.dynamic.gff.fxn;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes13.dex */
public class tw implements View.OnTouchListener {
    private float bh;
    private final com.bytedance.sdk.component.adexpress.dynamic.gff.tw fxn;
    private final int gff = 10;
    private float hm;
    private final boolean kg;
    private float rb;

    /* renamed from: sg, reason: collision with root package name */
    private float f9329sg;

    public tw(com.bytedance.sdk.component.adexpress.dynamic.gff.tw twVar, boolean z) {
        this.fxn = twVar;
        this.kg = z;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.gff.tw twVar;
        com.bytedance.sdk.component.adexpress.dynamic.gff.tw twVar2;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.hm = motionEvent.getX();
            this.rb = motionEvent.getY();
            new Object[]{"mStartX: ", Float.valueOf(this.hm), ", mStartY: " + this.rb};
        } else if (action == 1) {
            this.bh = motionEvent.getX();
            this.f9329sg = motionEvent.getY();
            new Object[]{"mEndX: ", Float.valueOf(this.bh), ", mEndY: " + this.f9329sg};
            if (!this.kg && (twVar2 = this.fxn) != null) {
                twVar2.fxn();
            } else {
                float f = this.bh - this.hm;
                float f2 = this.f9329sg - this.rb;
                float sqrt = (float) Math.sqrt((f * f) + (f2 * f2));
                new Object[]{"slideDistancePx: ", Float.valueOf(sqrt)};
                float kg = com.bytedance.sdk.component.adexpress.hm.sg.kg(com.bytedance.sdk.component.adexpress.hm.fxn(), Math.abs(sqrt));
                new Object[]{"slideDistanceDp:", Float.valueOf(kg), " and ", "mSlideThreshold:", 10};
                if (kg > 10.0f && (twVar = this.fxn) != null) {
                    twVar.fxn();
                }
            }
        }
        return true;
    }
}
