package com.bytedance.adsdk.kg.gff;

import android.graphics.PointF;

/* loaded from: classes13.dex */
public class kg {
    public float bh;
    public boolean dgx;
    public String fxn;
    public float gff;
    public float hie;
    public fxn hm;
    public int jq;
    public String kg;
    public PointF mvp;
    public int rb;
    public PointF rlu;

    /* renamed from: sg, reason: collision with root package name */
    public float f9257sg;
    public int tw;

    public enum fxn {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public kg(String str, String str2, float f, fxn fxnVar, int i, float f2, float f3, int i2, int i3, float f4, boolean z, PointF pointF, PointF pointF2) {
        fxn(str, str2, f, fxnVar, i, f2, f3, i2, i3, f4, z, pointF, pointF2);
    }

    public kg() {
    }

    public void fxn(String str, String str2, float f, fxn fxnVar, int i, float f2, float f3, int i2, int i3, float f4, boolean z, PointF pointF, PointF pointF2) {
        this.fxn = str;
        this.kg = str2;
        this.gff = f;
        this.hm = fxnVar;
        this.rb = i;
        this.bh = f2;
        this.f9257sg = f3;
        this.tw = i2;
        this.jq = i3;
        this.hie = f4;
        this.dgx = z;
        this.mvp = pointF;
        this.rlu = pointF2;
    }

    public int hashCode() {
        int hashCode = (((((int) ((((this.fxn.hashCode() * 31) + this.kg.hashCode()) * 31) + this.gff)) * 31) + this.hm.ordinal()) * 31) + this.rb;
        long floatToRawIntBits = Float.floatToRawIntBits(this.bh);
        return (((hashCode * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.tw;
    }
}
