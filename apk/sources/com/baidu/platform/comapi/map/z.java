package com.baidu.platform.comapi.map;

/* JADX INFO: compiled from: Style.java */
/* JADX INFO: loaded from: classes15.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f8660a;
    private int b;
    private int c;
    private int d;

    static int c(int r2) {
        return ((r2 & 16711680) >> 16) | ((-16777216) & r2) | ((r2 & 255) << 16) | (65280 & r2);
    }

    public z a(int r1) {
        this.f8660a = r1;
        return this;
    }

    public z b(int r1) {
        this.b = r1;
        return this;
    }

    public int c() {
        return this.d;
    }

    public int d() {
        return this.b;
    }

    public String toString() {
        return "Style: color:" + Integer.toHexString(this.f8660a) + " width:" + this.b + " fillcolor:" + Integer.toHexString(this.c);
    }

    public int a() {
        return this.f8660a;
    }

    public int b() {
        return this.c;
    }
}
