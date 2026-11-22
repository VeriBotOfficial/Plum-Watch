package com.huawei.hms.scankit.p;

/* compiled from: FinderPattern.java */
/* loaded from: classes14.dex */
public final class Qa extends com.huawei.hms.scankit.aiscan.common.z {
    private final float e;
    private final int f;
    private final boolean g;

    Qa(float f, float f2, float f3, boolean z) {
        this(f, f2, f3, z, 1);
    }

    boolean a(float f, float f2, float f3) {
        if (Math.abs(f2 - c()) > f || Math.abs(f3 - b()) > f) {
            return false;
        }
        float abs = Math.abs(f - this.e);
        return abs <= 1.0f || abs <= this.e;
    }

    @Override // com.huawei.hms.scankit.aiscan.common.z
    public boolean d() {
        return this.g;
    }

    public float e() {
        return this.e;
    }

    public Qa(float f, float f2, float f3, boolean z, int i) {
        super(f, f2, i);
        this.e = f3;
        this.f = i;
        this.g = z;
    }

    Qa a(float f, float f2, float f3, boolean z) {
        int i = this.f;
        int i2 = i + 1;
        float b = (i * b()) + f2;
        float f4 = i2;
        float f5 = b / f4;
        float c = ((this.f * c()) + f) / f4;
        float f6 = ((this.f * this.e) + f3) / f4;
        boolean z2 = this.g;
        return new Qa(f5, c, f6, z2 ? z : z2, i2);
    }
}
