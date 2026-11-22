package com.huawei.hms.scankit.p;

import android.graphics.Bitmap;

/* compiled from: Particle.java */
/* loaded from: classes14.dex */
public class Pc {
    private float b;
    private float c;
    private long h;
    private float i;
    private float j;
    private float l;
    private float m;
    private int n;
    private int o;
    private long p;
    private Sc r;

    /* renamed from: a, reason: collision with root package name */
    private float f10590a = 1.0f;
    private int d = 255;
    private float e = 0.0f;
    private float f = 0.0f;

    /* renamed from: q, reason: collision with root package name */
    private int f10591q = 0;
    private float k = 1.0f;
    private int g = 255;

    public Pc(Bitmap bitmap) {
        if (bitmap != null) {
            this.n = bitmap.getWidth() / 2;
            this.o = bitmap.getHeight() / 2;
        }
    }

    public void a(long j, float f, float f2, long j2, Sc sc) {
        float f3 = f - this.n;
        this.l = f3;
        float f4 = f2 - this.o;
        this.m = f4;
        this.i = f3;
        this.j = f4;
        this.p = j;
        this.h = j2;
        this.r = sc;
    }

    public void b(float f) {
        this.k = f;
    }

    public float c() {
        return this.i;
    }

    public float d() {
        return this.j;
    }

    public int e() {
        return this.d;
    }

    public float f() {
        return this.k;
    }

    public int b() {
        return this.f10591q;
    }

    public void b(int i) {
        this.f10591q = i;
    }

    public boolean a(long j) {
        long j2 = j - this.h;
        if (j2 > this.p) {
            return false;
        }
        float f = j2;
        float f2 = j2 * j2;
        this.i = this.l + (this.e * f) + (this.b * f2);
        this.j = this.m + (this.f * f) + (this.c * f2);
        this.r.a(this, j2);
        return true;
    }

    public int a() {
        return this.g;
    }

    public void a(int i) {
        this.g = i;
    }

    public void a(float f) {
        this.f10590a = f;
    }
}
