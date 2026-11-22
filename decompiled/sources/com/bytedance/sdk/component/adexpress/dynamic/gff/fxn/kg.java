package com.bytedance.sdk.component.adexpress.dynamic.gff.fxn;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.gff.jq;

/* loaded from: classes13.dex */
public class kg implements View.OnTouchListener {
    private com.bytedance.sdk.component.adexpress.dynamic.gff.tw bh;
    private float fxn;
    private long gff;
    private boolean hm;
    private float kg;
    private jq rb;

    public kg(jq jqVar, com.bytedance.sdk.component.adexpress.dynamic.gff.tw twVar) {
        this.rb = jqVar;
        this.bh = twVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.gff = System.currentTimeMillis();
            this.fxn = motionEvent.getX();
            this.kg = motionEvent.getY();
            this.rb.rb();
        } else if (action != 1) {
            if (action == 2) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (Math.abs(x - this.fxn) >= com.bytedance.sdk.component.adexpress.hm.sg.fxn(com.bytedance.sdk.component.adexpress.hm.fxn(), 10.0f) || Math.abs(y - this.kg) >= com.bytedance.sdk.component.adexpress.hm.sg.fxn(com.bytedance.sdk.component.adexpress.hm.fxn(), 10.0f)) {
                    this.hm = true;
                    this.rb.bh();
                }
            }
        } else {
            if (this.hm) {
                return false;
            }
            if (System.currentTimeMillis() - this.gff >= 1500) {
                com.bytedance.sdk.component.adexpress.dynamic.gff.tw twVar = this.bh;
                if (twVar != null) {
                    twVar.fxn();
                }
            }
            this.rb.bh();
        }
        return true;
    }
}
