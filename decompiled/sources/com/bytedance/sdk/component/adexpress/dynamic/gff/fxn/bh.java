package com.bytedance.sdk.component.adexpress.dynamic.gff.fxn;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes13.dex */
public class bh implements View.OnTouchListener {
    private static int gff = 10;
    private float fxn;
    private boolean hm;
    private float kg;
    private com.bytedance.sdk.component.adexpress.dynamic.gff.tw rb;

    public bh(com.bytedance.sdk.component.adexpress.dynamic.gff.tw twVar) {
        this.rb = twVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.fxn = motionEvent.getX();
            this.kg = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (Math.abs(x - this.fxn) >= gff || Math.abs(y - this.kg) >= gff) {
                    this.hm = true;
                }
            } else if (action == 3) {
                this.hm = false;
            }
        } else {
            if (this.hm) {
                this.hm = false;
                return false;
            }
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (Math.abs(x2 - this.fxn) >= gff || Math.abs(y2 - this.kg) >= gff) {
                this.hm = false;
            } else {
                com.bytedance.sdk.component.adexpress.dynamic.gff.tw twVar = this.rb;
                if (twVar != null) {
                    twVar.fxn();
                }
            }
        }
        return true;
    }
}
