package com.baidu.ar;

import com.baidu.ar.algo.FrameType;
import com.baidu.ar.marker.TrackerStatus;
import com.baidu.ar.marker.model.TranslationPrior;

/* loaded from: classes12.dex */
public class cd {

    /* renamed from: a, reason: collision with root package name */
    public int f6858a;
    public int b;
    public float[] c;
    public float[] d;
    public double e;
    public float[] f;
    public float[] g;
    public double[] h;
    public TrackerStatus i;
    public int j = 2;
    public float[] k;
    public FrameType l;
    public byte[] m;
    public TranslationPrior n;

    public void a() {
        if (this.m != null) {
            this.m = null;
        }
    }

    public void a(double d) {
        this.e = d;
    }

    public void a(int i) {
        this.b = i;
    }

    public void a(FrameType frameType) {
        this.l = frameType;
    }

    public void a(TrackerStatus trackerStatus) {
        this.i = trackerStatus;
    }

    public void a(TranslationPrior translationPrior) {
        this.n = translationPrior;
    }

    public void a(byte[] bArr) {
        this.m = bArr;
    }

    public void a(double[] dArr) {
        this.h = dArr;
    }

    public void a(float[] fArr) {
        this.d = fArr;
    }

    public void b(int i) {
        this.j = i;
    }

    public void b(float[] fArr) {
        this.f = fArr;
    }

    public float[] b() {
        return this.d;
    }

    public FrameType c() {
        return this.l;
    }

    public void c(int i) {
        this.f6858a = i;
    }

    public void c(float[] fArr) {
        this.c = fArr;
    }

    public int d() {
        return this.b;
    }

    public void d(float[] fArr) {
        this.k = fArr;
    }

    public void e(float[] fArr) {
        this.g = fArr;
    }

    public byte[] e() {
        return this.m;
    }

    public float[] f() {
        return this.f;
    }

    public float[] g() {
        return this.c;
    }

    public double[] h() {
        return this.h;
    }

    public float[] i() {
        return this.k;
    }

    public float[] j() {
        return this.g;
    }

    public int k() {
        return this.j;
    }

    public double l() {
        return this.e;
    }

    public TrackerStatus m() {
        return this.i;
    }

    public TranslationPrior n() {
        return this.n;
    }

    public int o() {
        return this.f6858a;
    }
}
