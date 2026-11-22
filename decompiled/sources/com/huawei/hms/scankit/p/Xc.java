package com.huawei.hms.scankit.p;

/* compiled from: ParticleScale.java */
/* loaded from: classes14.dex */
public class Xc implements Vc {

    /* renamed from: a, reason: collision with root package name */
    private final float f10616a;
    private final float b;

    public Xc(float f, float f2) {
        this.b = f;
        this.f10616a = f2;
    }

    @Override // com.huawei.hms.scankit.p.Vc
    public void a(Pc pc) {
        float f = this.f10616a;
        float f2 = this.b;
        if (f != f2) {
            f = Yc.a(f - f2) + this.b;
        }
        pc.b(f);
        pc.a(f);
    }
}
