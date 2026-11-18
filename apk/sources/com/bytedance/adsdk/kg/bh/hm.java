package com.bytedance.adsdk.kg.bh;

/* JADX INFO: loaded from: classes15.dex */
public class hm {
    private float fxn;
    private int kg;

    public void fxn(float f) {
        float f2 = this.fxn + f;
        this.fxn = f2;
        int r3 = this.kg + 1;
        this.kg = r3;
        if (r3 == Integer.MAX_VALUE) {
            this.fxn = f2 / 2.0f;
            this.kg = r3 / 2;
        }
    }
}
