package com.bytedance.adsdk.kg.gff.kg;

import android.gov.nist.core.Separators;
import java.util.Arrays;

/* loaded from: classes13.dex */
public class hm {
    private final float[] fxn;
    private final int[] kg;

    public hm(float[] fArr, int[] iArr) {
        this.fxn = fArr;
        this.kg = iArr;
    }

    public float[] fxn() {
        return this.fxn;
    }

    public int[] kg() {
        return this.kg;
    }

    public int gff() {
        return this.kg.length;
    }

    public void fxn(hm hmVar, hm hmVar2, float f) {
        if (hmVar.kg.length != hmVar2.kg.length) {
            throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + hmVar.kg.length + " vs " + hmVar2.kg.length + Separators.RPAREN);
        }
        for (int i = 0; i < hmVar.kg.length; i++) {
            this.fxn[i] = com.bytedance.adsdk.kg.bh.rb.fxn(hmVar.fxn[i], hmVar2.fxn[i], f);
            this.kg[i] = com.bytedance.adsdk.kg.bh.kg.fxn(f, hmVar.kg[i], hmVar2.kg[i]);
        }
    }

    public hm fxn(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            iArr[i] = fxn(fArr[i]);
        }
        return new hm(fArr, iArr);
    }

    private int fxn(float f) {
        int binarySearch = Arrays.binarySearch(this.fxn, f);
        if (binarySearch >= 0) {
            return this.kg[binarySearch];
        }
        int i = -(binarySearch + 1);
        if (i == 0) {
            return this.kg[0];
        }
        int[] iArr = this.kg;
        if (i == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.fxn;
        int i2 = i - 1;
        float f2 = fArr[i2];
        return com.bytedance.adsdk.kg.bh.kg.fxn((f - f2) / (fArr[i] - f2), iArr[i2], iArr[i]);
    }
}
