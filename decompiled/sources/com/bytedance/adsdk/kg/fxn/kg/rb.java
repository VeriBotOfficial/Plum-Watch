package com.bytedance.adsdk.kg.fxn.kg;

import java.util.List;

/* loaded from: classes13.dex */
public class rb extends sg<com.bytedance.adsdk.kg.gff.kg.hm> {
    private final com.bytedance.adsdk.kg.gff.kg.hm hm;

    public rb(List<com.bytedance.adsdk.kg.sg.fxn<com.bytedance.adsdk.kg.gff.kg.hm>> list) {
        super(list);
        com.bytedance.adsdk.kg.gff.kg.hm hmVar = list.get(0).fxn;
        int gff = hmVar != null ? hmVar.gff() : 0;
        this.hm = new com.bytedance.adsdk.kg.gff.kg.hm(new float[gff], new int[gff]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bytedance.adsdk.kg.fxn.kg.fxn
    /* renamed from: kg, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.kg.gff.kg.hm fxn(com.bytedance.adsdk.kg.sg.fxn<com.bytedance.adsdk.kg.gff.kg.hm> fxnVar, float f) {
        this.hm.fxn(fxnVar.fxn, fxnVar.kg, f);
        return this.hm;
    }
}
