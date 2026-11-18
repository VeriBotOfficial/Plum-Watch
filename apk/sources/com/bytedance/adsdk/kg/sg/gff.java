package com.bytedance.adsdk.kg.sg;

/* JADX INFO: loaded from: classes15.dex */
public class gff {
    private float fxn;
    private float kg;

    public gff(float f, float f2) {
        this.fxn = f;
        this.kg = f2;
    }

    public gff() {
        this(1.0f, 1.0f);
    }

    public float fxn() {
        return this.fxn;
    }

    public float kg() {
        return this.kg;
    }

    public void fxn(float f, float f2) {
        this.fxn = f;
        this.kg = f2;
    }

    public boolean kg(float f, float f2) {
        return this.fxn == f && this.kg == f2;
    }

    public String toString() {
        return fxn() + "x" + kg();
    }
}
