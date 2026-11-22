package com.bytedance.adsdk.ugeno.yoga;

/* loaded from: classes13.dex */
public enum gff {
    INHERIT(0),
    LTR(1),
    RTL(2);

    private final int hm;

    gff(int i) {
        this.hm = i;
    }

    public int fxn() {
        return this.hm;
    }
}
