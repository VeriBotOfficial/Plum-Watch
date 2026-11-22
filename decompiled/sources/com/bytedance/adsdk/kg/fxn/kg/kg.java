package com.bytedance.adsdk.kg.fxn.kg;

import java.util.List;

/* loaded from: classes13.dex */
public class kg extends sg<Integer> {
    public kg(List<com.bytedance.adsdk.kg.sg.fxn<Integer>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bytedance.adsdk.kg.fxn.kg.fxn
    /* renamed from: kg, reason: merged with bridge method [inline-methods] */
    public Integer fxn(com.bytedance.adsdk.kg.sg.fxn<Integer> fxnVar, float f) {
        return Integer.valueOf(gff(fxnVar, f));
    }

    public int gff(com.bytedance.adsdk.kg.sg.fxn<Integer> fxnVar, float f) {
        if (fxnVar.fxn == null || fxnVar.kg == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.gff != null) {
            fxnVar.f9267sg.floatValue();
            hm();
            tw();
            throw null;
        }
        return com.bytedance.adsdk.kg.bh.kg.fxn(com.bytedance.adsdk.kg.bh.rb.kg(f, 0.0f, 1.0f), fxnVar.fxn.intValue(), fxnVar.kg.intValue());
    }

    public int jq() {
        return gff(gff(), rb());
    }
}
