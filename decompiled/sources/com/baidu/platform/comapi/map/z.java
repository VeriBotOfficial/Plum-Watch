package com.baidu.platform.comapi.map;

/* compiled from: Style.java */
/* loaded from: classes13.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    private int f8660a;
    private int b;
    private int c;
    private int d;

    static int c(int i) {
        return ((i & 16711680) >> 16) | ((-16777216) & i) | ((i & 255) << 16) | (65280 & i);
    }

    public z a(int i) {
        this.f8660a = i;
        return this;
    }

    public z b(int i) {
        this.b = i;
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
