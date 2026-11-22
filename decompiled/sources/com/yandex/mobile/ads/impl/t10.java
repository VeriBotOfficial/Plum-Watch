package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;

/* loaded from: classes5.dex */
public final class t10 {
    private static final t10 e = new t10(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    private final float f16921a;
    private final float b;
    private final float c;
    private final float d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t10)) {
            return false;
        }
        t10 t10Var = (t10) obj;
        return Float.compare(this.f16921a, t10Var.f16921a) == 0 && Float.compare(this.b, t10Var.b) == 0 && Float.compare(this.c, t10Var.c) == 0 && Float.compare(this.d, t10Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + ((Float.hashCode(this.c) + ((Float.hashCode(this.b) + (Float.hashCode(this.f16921a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DisplayInsetsF(left=" + this.f16921a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + Separators.RPAREN;
    }

    public t10(float f, float f2, float f3, float f4) {
        this.f16921a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final float c() {
        return this.f16921a;
    }

    public final float e() {
        return this.b;
    }

    public final float d() {
        return this.c;
    }

    public final float b() {
        return this.d;
    }
}
