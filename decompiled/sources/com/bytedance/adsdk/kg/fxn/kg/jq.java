package com.bytedance.adsdk.kg.fxn.kg;

import android.graphics.Path;
import android.graphics.PointF;

/* loaded from: classes13.dex */
public class jq extends com.bytedance.adsdk.kg.sg.fxn<PointF> {
    private final com.bytedance.adsdk.kg.sg.fxn<PointF> dgx;
    private Path hie;

    public jq(com.bytedance.adsdk.kg.sg sgVar, com.bytedance.adsdk.kg.sg.fxn<PointF> fxnVar) {
        super(sgVar, fxnVar.fxn, fxnVar.kg, fxnVar.gff, fxnVar.hm, fxnVar.rb, fxnVar.bh, fxnVar.f9267sg);
        this.dgx = fxnVar;
        fxn();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void fxn() {
        boolean z = (this.kg == 0 || this.fxn == 0 || !((PointF) this.fxn).equals(((PointF) this.kg).x, ((PointF) this.kg).y)) ? false : true;
        if (this.fxn == 0 || this.kg == 0 || z) {
            return;
        }
        this.hie = com.bytedance.adsdk.kg.bh.bh.fxn((PointF) this.fxn, (PointF) this.kg, this.dgx.tw, this.dgx.jq);
    }

    Path kg() {
        return this.hie;
    }
}
