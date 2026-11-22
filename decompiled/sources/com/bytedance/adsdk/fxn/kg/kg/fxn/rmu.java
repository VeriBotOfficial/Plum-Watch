package com.bytedance.adsdk.fxn.kg.kg.fxn;

/* loaded from: classes13.dex */
public abstract class rmu implements com.bytedance.adsdk.fxn.kg.kg.fxn {
    protected com.bytedance.adsdk.fxn.kg.kg.fxn fxn;
    protected com.bytedance.adsdk.fxn.kg.hm.gff gff;
    protected com.bytedance.adsdk.fxn.kg.kg.fxn kg;

    protected rmu(com.bytedance.adsdk.fxn.kg.hm.gff gffVar) {
        this.gff = gffVar;
    }

    public void fxn(com.bytedance.adsdk.fxn.kg.kg.fxn fxnVar) {
        this.fxn = fxnVar;
    }

    public void kg(com.bytedance.adsdk.fxn.kg.kg.fxn fxnVar) {
        this.kg = fxnVar;
    }

    @Override // com.bytedance.adsdk.fxn.kg.kg.fxn
    public com.bytedance.adsdk.fxn.kg.hm.rb fxn() {
        return com.bytedance.adsdk.fxn.kg.hm.bh.OPERATOR_RESULT;
    }

    @Override // com.bytedance.adsdk.fxn.kg.kg.fxn
    public String kg() {
        return this.fxn.kg() + this.gff.fxn() + this.kg.kg();
    }

    public String toString() {
        return kg();
    }
}
