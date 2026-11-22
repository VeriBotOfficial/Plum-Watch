package com.bytedance.adsdk.kg.gff.fxn;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes13.dex */
public class jq implements rlu<PointF, PointF> {
    private final kg fxn;
    private final kg kg;

    public jq(kg kgVar, kg kgVar2) {
        this.fxn = kgVar;
        this.kg = kgVar2;
    }

    @Override // com.bytedance.adsdk.kg.gff.fxn.rlu
    public List<com.bytedance.adsdk.kg.sg.fxn<PointF>> gff() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // com.bytedance.adsdk.kg.gff.fxn.rlu
    public boolean kg() {
        return this.fxn.kg() && this.kg.kg();
    }

    @Override // com.bytedance.adsdk.kg.gff.fxn.rlu
    public com.bytedance.adsdk.kg.fxn.kg.fxn<PointF, PointF> fxn() {
        return new com.bytedance.adsdk.kg.fxn.kg.zu(this.fxn.fxn(), this.kg.fxn());
    }
}
