package com.bytedance.sdk.component.bh.fxn.hm.kg;

/* loaded from: classes13.dex */
public class fxn {
    private int fxn;
    private int kg;

    public int fxn() {
        return this.fxn;
    }

    public int kg() {
        return this.kg;
    }

    fxn(int i, int i2, long j) {
        if (i2 < i) {
            throw new IllegalStateException("atMostBatchSendCount should meet a condition (atMostBatchSendCount >= maxCacheCount)");
        }
        this.fxn = i;
        this.kg = i2;
    }

    public static fxn gff() {
        return new fxn(1, 100, 172800000L);
    }

    public static fxn hm() {
        return new fxn(1, 100, -1L);
    }

    public static fxn rb() {
        return new fxn(3, 100, 172800000L);
    }
}
