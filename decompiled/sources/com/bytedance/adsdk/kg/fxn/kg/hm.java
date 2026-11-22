package com.bytedance.adsdk.kg.fxn.kg;

import java.util.List;

/* loaded from: classes13.dex */
public class hm extends sg<Float> {
    public hm(List<com.bytedance.adsdk.kg.sg.fxn<Float>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bytedance.adsdk.kg.fxn.kg.fxn
    /* renamed from: kg, reason: merged with bridge method [inline-methods] */
    public Float fxn(com.bytedance.adsdk.kg.sg.fxn<Float> fxnVar, float f) {
        return Float.valueOf(gff(fxnVar, f));
    }

    float gff(com.bytedance.adsdk.kg.sg.fxn<Float> fxnVar, float f) {
        if (fxnVar.fxn == null || fxnVar.kg == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.gff != null) {
            fxnVar.f9267sg.floatValue();
            hm();
            tw();
            throw null;
        }
        return com.bytedance.adsdk.kg.bh.rb.fxn(fxnVar.bh(), fxnVar.sg(), f);
    }

    public float jq() {
        return gff(gff(), rb());
    }
}
