package com.huawei.hms.scankit.p;

/* compiled from: Token.java */
/* loaded from: classes14.dex */
abstract class Xb {

    /* renamed from: a, reason: collision with root package name */
    static final Xb f10615a = new Vb(null, 0, 0);
    private final Xb b;

    Xb(Xb xb) {
        this.b = xb;
    }

    final Xb a() {
        return this.b;
    }

    abstract void a(C3070x c3070x, byte[] bArr);

    final Xb b(int i, int i2) {
        return new Sb(this, i, i2);
    }

    final Xb a(int i, int i2) {
        return new Vb(this, i, i2);
    }
}
