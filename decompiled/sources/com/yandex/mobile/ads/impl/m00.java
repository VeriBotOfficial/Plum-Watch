package com.yandex.mobile.ads.impl;

/* loaded from: classes5.dex */
public final class m00 implements nr1 {

    /* renamed from: a, reason: collision with root package name */
    private int f16191a;
    private int b;
    private final int c;
    private final float d;

    public m00() {
        this(1.0f, 2500, 1);
    }

    public m00(float f, int i, int i2) {
        this.f16191a = i;
        this.c = i2;
        this.d = f;
    }

    @Override // com.yandex.mobile.ads.impl.nr1
    public final int a() {
        return this.f16191a;
    }

    @Override // com.yandex.mobile.ads.impl.nr1
    public final int b() {
        return this.b;
    }

    @Override // com.yandex.mobile.ads.impl.nr1
    public final void a(si2 si2Var) throws si2 {
        int i = this.b + 1;
        this.b = i;
        int i2 = this.f16191a;
        this.f16191a = i2 + ((int) (i2 * this.d));
        if (i > this.c) {
            throw si2Var;
        }
    }
}
