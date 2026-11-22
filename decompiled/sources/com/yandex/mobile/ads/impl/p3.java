package com.yandex.mobile.ads.impl;

/* loaded from: classes5.dex */
public final class p3 {

    /* renamed from: a, reason: collision with root package name */
    private final vn2 f16517a;

    private p3(vn2 vn2Var) {
        this.f16517a = vn2Var;
    }

    public static p3 a(vn2 vn2Var) {
        if (vn2Var.j().c() != null) {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        }
        if (vn2Var.k()) {
            throw new IllegalStateException("AdSession is finished");
        }
        p3 p3Var = new p3(vn2Var);
        vn2Var.j().a(p3Var);
        return p3Var;
    }

    public final void a() {
        if (!this.f16517a.k()) {
            if (this.f16517a.l()) {
                if (!this.f16517a.g()) {
                    try {
                        this.f16517a.b();
                    } catch (Exception unused) {
                    }
                }
                if (this.f16517a.g()) {
                    this.f16517a.e();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
        throw new IllegalStateException("AdSession is finished");
    }

    public final void a(ga2 ga2Var) {
        xo2.a(this.f16517a);
        if (this.f16517a.l()) {
            this.f16517a.a(ga2Var.a());
            return;
        }
        throw new IllegalStateException("Impression event is not expected from the Native AdSession");
    }
}
