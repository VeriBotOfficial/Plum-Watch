package com.bytedance.sdk.component.adexpress.dynamic.gff.fxn;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes13.dex */
public class hm implements View.OnTouchListener {
    private float bh;
    private boolean dgx;
    private float fxn;
    private float gff;
    private int hie;
    private float hm;
    private com.bytedance.sdk.component.adexpress.dynamic.gff.tw jq;
    private float kg;
    private boolean rb = true;

    /* renamed from: sg, reason: collision with root package name */
    private float f9327sg;
    private boolean tw;

    public hm(com.bytedance.sdk.component.adexpress.dynamic.gff.tw twVar, int i, boolean z) {
        this.jq = twVar;
        this.hie = i;
        this.dgx = z;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.gff.tw twVar;
        com.bytedance.sdk.component.adexpress.dynamic.gff.tw twVar2;
        com.bytedance.sdk.component.adexpress.dynamic.gff.tw twVar3;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.fxn = motionEvent.getX();
            this.kg = motionEvent.getY();
            this.bh = motionEvent.getY();
            this.rb = true;
        } else if (action != 1) {
            if (action == 2) {
                float y = motionEvent.getY();
                this.f9327sg = y;
                if (Math.abs(y - this.bh) > 10.0f) {
                    this.tw = true;
                }
                this.hm = motionEvent.getX();
                this.gff = motionEvent.getY();
                if (Math.abs(this.hm - this.fxn) > 8.0f || Math.abs(this.gff - this.kg) > 8.0f) {
                    this.rb = false;
                }
            }
        } else {
            if (!this.tw && !this.rb) {
                return false;
            }
            if (!this.dgx && (twVar3 = this.jq) != null) {
                twVar3.fxn();
            } else {
                int kg = com.bytedance.sdk.component.adexpress.hm.sg.kg(com.bytedance.sdk.component.adexpress.hm.fxn(), Math.abs(this.f9327sg - this.bh));
                if (this.f9327sg - this.bh < 0.0f && kg > this.hie && (twVar2 = this.jq) != null) {
                    twVar2.fxn();
                } else if (this.rb && (twVar = this.jq) != null) {
                    twVar.fxn();
                }
            }
        }
        return true;
    }
}
