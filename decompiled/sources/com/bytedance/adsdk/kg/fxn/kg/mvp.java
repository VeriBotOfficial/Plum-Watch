package com.bytedance.adsdk.kg.fxn.kg;

import java.util.List;

/* loaded from: classes13.dex */
public class mvp extends sg<com.bytedance.adsdk.kg.sg.gff> {
    private final com.bytedance.adsdk.kg.sg.gff hm;

    public mvp(List<com.bytedance.adsdk.kg.sg.fxn<com.bytedance.adsdk.kg.sg.gff>> list) {
        super(list);
        this.hm = new com.bytedance.adsdk.kg.sg.gff();
    }

    @Override // com.bytedance.adsdk.kg.fxn.kg.fxn
    /* renamed from: kg, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.kg.sg.gff fxn(com.bytedance.adsdk.kg.sg.fxn<com.bytedance.adsdk.kg.sg.gff> fxnVar, float f) {
        if (fxnVar.fxn == null || fxnVar.kg == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        com.bytedance.adsdk.kg.sg.gff gffVar = fxnVar.fxn;
        com.bytedance.adsdk.kg.sg.gff gffVar2 = fxnVar.kg;
        if (this.gff != null) {
            fxnVar.f9267sg.floatValue();
            hm();
            tw();
            throw null;
        }
        this.hm.fxn(com.bytedance.adsdk.kg.bh.rb.fxn(gffVar.fxn(), gffVar2.fxn(), f), com.bytedance.adsdk.kg.bh.rb.fxn(gffVar.kg(), gffVar2.kg(), f));
        return this.hm;
    }
}
