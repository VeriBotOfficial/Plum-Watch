package com.bytedance.adsdk.kg.gff.kg;

/* loaded from: classes13.dex */
public class tw {
    private final fxn fxn;
    private final com.bytedance.adsdk.kg.gff.fxn.hm gff;
    private final boolean hm;
    private final com.bytedance.adsdk.kg.gff.fxn.tw kg;

    public enum fxn {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public tw(fxn fxnVar, com.bytedance.adsdk.kg.gff.fxn.tw twVar, com.bytedance.adsdk.kg.gff.fxn.hm hmVar, boolean z) {
        this.fxn = fxnVar;
        this.kg = twVar;
        this.gff = hmVar;
        this.hm = z;
    }

    public fxn fxn() {
        return this.fxn;
    }

    public com.bytedance.adsdk.kg.gff.fxn.tw kg() {
        return this.kg;
    }

    public com.bytedance.adsdk.kg.gff.fxn.hm gff() {
        return this.gff;
    }

    public boolean hm() {
        return this.hm;
    }
}
