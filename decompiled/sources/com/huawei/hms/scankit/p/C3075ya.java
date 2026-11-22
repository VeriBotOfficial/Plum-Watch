package com.huawei.hms.scankit.p;

/* compiled from: AlignmentPattern.java */
/* renamed from: com.huawei.hms.scankit.p.ya, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C3075ya extends com.huawei.hms.scankit.aiscan.common.z {
    private final float e;

    C3075ya(float f, float f2, float f3) {
        super(f, f2);
        this.e = f3;
    }

    boolean a(float f, float f2, float f3) {
        if (Math.abs(f2 - c()) > f || Math.abs(f3 - b()) > f) {
            return false;
        }
        float abs = Math.abs(f - this.e);
        return abs <= 1.0f || abs <= this.e;
    }

    C3075ya b(float f, float f2, float f3) {
        return new C3075ya((b() + f2) / 2.0f, (c() + f) / 2.0f, (this.e + f3) / 2.0f);
    }
}
