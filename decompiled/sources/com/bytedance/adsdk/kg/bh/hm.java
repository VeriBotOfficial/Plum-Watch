package com.bytedance.adsdk.kg.bh;

/* loaded from: classes13.dex */
public class hm {
    private float fxn;
    private int kg;

    public void fxn(float f) {
        float f2 = this.fxn + f;
        this.fxn = f2;
        int i = this.kg + 1;
        this.kg = i;
        if (i == Integer.MAX_VALUE) {
            this.fxn = f2 / 2.0f;
            this.kg = i / 2;
        }
    }
}
