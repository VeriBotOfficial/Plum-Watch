package io.appmetrica.analytics.impl;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public final class C4 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f17791a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final Boolean f;

    public C4(A4 a4) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Boolean bool;
        z = a4.f17760a;
        this.f17791a = z;
        z2 = a4.b;
        this.b = z2;
        z3 = a4.c;
        this.c = z3;
        z4 = a4.d;
        this.d = z4;
        z5 = a4.e;
        this.e = z5;
        bool = a4.f;
        this.f = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4.class == obj.getClass()) {
            C4 c4 = (C4) obj;
            if (this.f17791a != c4.f17791a || this.b != c4.b || this.c != c4.c || this.d != c4.d || this.e != c4.e) {
                return false;
            }
            Boolean bool = this.f;
            Boolean bool2 = c4.f;
            if (bool != null) {
                return bool.equals(bool2);
            }
            if (bool2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((((((((this.f17791a ? 1 : 0) * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31;
        Boolean bool = this.f;
        return i + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "CollectingFlags{permissionsCollectingEnabled=" + this.f17791a + ", featuresCollectingEnabled=" + this.b + ", googleAid=" + this.c + ", simInfo=" + this.d + ", huaweiOaid=" + this.e + ", sslPinning=" + this.f + AbstractJsonLexerKt.END_OBJ;
    }
}
