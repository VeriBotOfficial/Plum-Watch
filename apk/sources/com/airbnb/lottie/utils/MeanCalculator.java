package com.airbnb.lottie.utils;

/* JADX INFO: loaded from: classes7.dex */
public class MeanCalculator {
    private int n;
    private float sum;

    public void add(float f) {
        float f2 = this.sum + f;
        this.sum = f2;
        int r3 = this.n + 1;
        this.n = r3;
        if (r3 == Integer.MAX_VALUE) {
            this.sum = f2 / 2.0f;
            this.n = r3 / 2;
        }
    }

    public float getMean() {
        int r0 = this.n;
        if (r0 == 0) {
            return 0.0f;
        }
        return this.sum / r0;
    }
}
