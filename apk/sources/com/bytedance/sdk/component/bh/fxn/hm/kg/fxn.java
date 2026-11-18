package com.bytedance.sdk.component.bh.fxn.hm.kg;

/* JADX INFO: loaded from: classes15.dex */
public class fxn {
    private int fxn;
    private int kg;

    public int fxn() {
        return this.fxn;
    }

    public int kg() {
        return this.kg;
    }

    fxn(int r1, int r2, long j) {
        if (r2 < r1) {
            throw new IllegalStateException("atMostBatchSendCount should meet a condition (atMostBatchSendCount >= maxCacheCount)");
        }
        this.fxn = r1;
        this.kg = r2;
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
