package com.bytedance.sdk.component.adexpress.dynamic.gff.fxn;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes13.dex */
public class gff implements View.OnTouchListener {
    private com.bytedance.sdk.component.adexpress.dynamic.gff.tw bh;
    private float fxn;
    private float gff;
    private float hm;
    private boolean jq;
    private float kg;
    private boolean rb;

    /* renamed from: sg, reason: collision with root package name */
    private int f9326sg;
    private boolean tw;

    public gff(com.bytedance.sdk.component.adexpress.dynamic.gff.tw twVar) {
        this(twVar, 5);
    }

    public gff(com.bytedance.sdk.component.adexpress.dynamic.gff.tw twVar, int i) {
        this.f9326sg = 5;
        this.tw = true;
        this.bh = twVar;
        if (i > 0) {
            this.f9326sg = i;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.gff.tw twVar;
        com.bytedance.sdk.component.adexpress.dynamic.gff.tw twVar2;
        com.bytedance.sdk.component.adexpress.dynamic.gff.tw twVar3;
        if (this.jq) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.fxn = motionEvent.getX();
            this.kg = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                this.hm = motionEvent.getX();
                this.gff = motionEvent.getY();
                if (Math.abs(this.hm - this.fxn) > 10.0f) {
                    this.rb = true;
                }
                if (Math.abs(this.hm - this.fxn) > 8.0f || Math.abs(this.gff - this.kg) > 8.0f) {
                    this.tw = false;
                }
                int kg = com.bytedance.sdk.component.adexpress.hm.sg.kg(com.bytedance.sdk.component.adexpress.hm.fxn(), Math.abs(this.hm - this.fxn));
                if (this.hm > this.fxn && kg > this.f9326sg && (twVar3 = this.bh) != null) {
                    twVar3.fxn();
                    this.jq = true;
                }
            }
        } else {
            if (!this.rb && !this.tw) {
                return false;
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int kg2 = com.bytedance.sdk.component.adexpress.hm.sg.kg(com.bytedance.sdk.component.adexpress.hm.fxn(), Math.abs(this.hm - this.fxn));
            if (this.hm > this.fxn && kg2 > this.f9326sg && (twVar2 = this.bh) != null) {
                twVar2.fxn();
                this.jq = true;
            }
            float abs = Math.abs(x - this.fxn);
            float abs2 = Math.abs(y - this.kg);
            if ((abs < 8.0f || abs2 < 8.0f) && (twVar = this.bh) != null) {
                twVar.kg();
                this.jq = true;
            }
        }
        return true;
    }
}
