package com.bytedance.adsdk.kg.gff;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes15.dex */
public class fxn {
    private final PointF fxn;
    private final PointF gff;
    private final PointF kg;

    public fxn() {
        this.fxn = new PointF();
        this.kg = new PointF();
        this.gff = new PointF();
    }

    public fxn(PointF pointF, PointF pointF2, PointF pointF3) {
        this.fxn = pointF;
        this.kg = pointF2;
        this.gff = pointF3;
    }

    public void fxn(float f, float f2) {
        this.fxn.set(f, f2);
    }

    public PointF fxn() {
        return this.fxn;
    }

    public void kg(float f, float f2) {
        this.kg.set(f, f2);
    }

    public PointF kg() {
        return this.kg;
    }

    public void gff(float f, float f2) {
        this.gff.set(f, f2);
    }

    public PointF gff() {
        return this.gff;
    }

    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.gff.x), Float.valueOf(this.gff.y), Float.valueOf(this.fxn.x), Float.valueOf(this.fxn.y), Float.valueOf(this.kg.x), Float.valueOf(this.kg.y));
    }
}
