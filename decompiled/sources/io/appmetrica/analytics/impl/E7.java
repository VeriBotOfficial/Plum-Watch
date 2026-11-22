package io.appmetrica.analytics.impl;

/* loaded from: classes6.dex */
public final class E7 {

    /* renamed from: a, reason: collision with root package name */
    public final long f17827a;
    public final int b;

    public E7(int i, long j) {
        this.f17827a = j;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E7)) {
            return false;
        }
        E7 e7 = (E7) obj;
        return this.f17827a == e7.f17827a && this.b == e7.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Long.hashCode(this.f17827a) * 31);
    }

    public final String toString() {
        return "DecimalProtoModel(mantissa=" + this.f17827a + ", exponent=" + this.b + ')';
    }
}
