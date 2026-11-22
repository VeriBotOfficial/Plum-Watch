package io.appmetrica.analytics.impl;

/* loaded from: classes6.dex */
public final class H2 {

    /* renamed from: a, reason: collision with root package name */
    public final G2 f17881a;
    public final Boolean b;

    public H2(G2 g2, Boolean bool) {
        this.f17881a = g2;
        this.b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && H2.class == obj.getClass()) {
            H2 h2 = (H2) obj;
            if (this.f17881a != h2.f17881a) {
                return false;
            }
            Boolean bool = this.b;
            if (bool != null) {
                return bool.equals(h2.b);
            }
            if (h2.b == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        G2 g2 = this.f17881a;
        int hashCode = (g2 != null ? g2.hashCode() : 0) * 31;
        Boolean bool = this.b;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }
}
