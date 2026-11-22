package com.amap.api.col.p0003sl;

/* compiled from: Bounds.java */
/* loaded from: classes11.dex */
public class d4 {

    /* renamed from: a, reason: collision with root package name */
    public final double f1599a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;

    public d4(double d, double d2, double d3, double d4) {
        this.f1599a = d;
        this.b = d3;
        this.c = d2;
        this.d = d4;
        this.e = (d + d2) / 2.0d;
        this.f = (d3 + d4) / 2.0d;
    }

    public boolean a(double d, double d2) {
        return this.f1599a <= d && d <= this.c && this.b <= d2 && d2 <= this.d;
    }

    public boolean a(d4 d4Var) {
        return d4Var.f1599a < this.c && this.f1599a < d4Var.c && d4Var.b < this.d && this.b < d4Var.d;
    }
}
