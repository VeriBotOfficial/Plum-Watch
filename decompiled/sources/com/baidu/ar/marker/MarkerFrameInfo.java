package com.baidu.ar.marker;

/* loaded from: classes12.dex */
public class MarkerFrameInfo {

    /* renamed from: a, reason: collision with root package name */
    public int f7086a;
    public int b;
    public double[] c;
    public float[] d;
    public float[] e;
    public int f;
    public int g;
    public byte[] h;
    public float[] i;
    public float j;
    public float[] k;

    public float[] getDistort() {
        return this.e;
    }

    public int getFps() {
        return this.g;
    }

    public byte[] getImage() {
        return this.h;
    }

    public int getInputHeight() {
        return this.b;
    }

    public int getInputWidth() {
        return this.f7086a;
    }

    public float[] getIntrinsics() {
        return this.d;
    }

    public double[] getMagnet() {
        return this.c;
    }

    public float[] getOrignalTransform() {
        return this.k;
    }

    public float[] getPoseMat() {
        return this.i;
    }

    public float getScaleY() {
        return this.j;
    }

    public int getTrackingState() {
        return this.f;
    }

    public void setDistort(float[] fArr) {
        this.e = fArr;
    }

    public void setFps(int i) {
        this.g = i;
    }

    public void setImage(byte[] bArr) {
        this.h = bArr;
    }

    public void setInputHeight(int i) {
        this.b = i;
    }

    public void setInputWidth(int i) {
        this.f7086a = i;
    }

    public void setIntrinsics(float[] fArr) {
        this.d = fArr;
    }

    public void setMagnet(double[] dArr) {
        this.c = dArr;
    }

    public void setOrignalTransform(float[] fArr) {
        this.k = fArr;
    }

    public void setPoseMat(float[] fArr) {
        this.i = fArr;
    }

    public void setScaleY(float f) {
        this.j = f;
    }

    public void setTrackingState(int i) {
        this.f = i;
    }
}
