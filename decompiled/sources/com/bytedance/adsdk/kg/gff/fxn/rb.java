package com.bytedance.adsdk.kg.gff.fxn;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes13.dex */
public class rb implements rlu<PointF, PointF> {
    private final List<com.bytedance.adsdk.kg.sg.fxn<PointF>> fxn;

    public rb(List<com.bytedance.adsdk.kg.sg.fxn<PointF>> list) {
        this.fxn = list;
    }

    @Override // com.bytedance.adsdk.kg.gff.fxn.rlu
    public List<com.bytedance.adsdk.kg.sg.fxn<PointF>> gff() {
        return this.fxn;
    }

    @Override // com.bytedance.adsdk.kg.gff.fxn.rlu
    public boolean kg() {
        return this.fxn.size() == 1 && this.fxn.get(0).rb();
    }

    @Override // com.bytedance.adsdk.kg.gff.fxn.rlu
    public com.bytedance.adsdk.kg.fxn.kg.fxn<PointF, PointF> fxn() {
        if (this.fxn.get(0).rb()) {
            return new com.bytedance.adsdk.kg.fxn.kg.dgx(this.fxn);
        }
        return new com.bytedance.adsdk.kg.fxn.kg.hie(this.fxn);
    }
}
