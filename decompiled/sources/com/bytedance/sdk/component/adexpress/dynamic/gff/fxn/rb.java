package com.bytedance.sdk.component.adexpress.dynamic.gff.fxn;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes13.dex */
public class rb implements View.OnTouchListener {
    private float fxn;
    private boolean gff;
    private com.bytedance.sdk.component.adexpress.dynamic.gff.tw hm;
    private float kg;
    private int rb;

    public rb(com.bytedance.sdk.component.adexpress.dynamic.gff.tw twVar, int i) {
        this.hm = twVar;
        this.rb = i;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.gff.tw twVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.fxn = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float y = motionEvent.getY();
                this.kg = y;
                if (Math.abs(y - this.fxn) > 10.0f) {
                    this.gff = true;
                }
            }
        } else {
            if (!this.gff) {
                return false;
            }
            int kg = com.bytedance.sdk.component.adexpress.hm.sg.kg(com.bytedance.sdk.component.adexpress.hm.fxn(), Math.abs(this.kg - this.fxn));
            if (this.kg - this.fxn < 0.0f && kg > this.rb && (twVar = this.hm) != null) {
                twVar.fxn();
                this.fxn = 0.0f;
                this.kg = 0.0f;
                this.gff = false;
            }
        }
        return true;
    }
}
