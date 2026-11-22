package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Lh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1649Lh {
    public static final C1649Lh A02 = new C1649Lh();
    public byte A00 = 3;
    public boolean A01 = true;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C1649Lh)) {
            return false;
        }
        C1649Lh c1649Lh = (C1649Lh) obj;
        return this.A00 == c1649Lh.A00 && this.A01 == c1649Lh.A01;
    }

    public final int hashCode() {
        return new Byte(this.A00).hashCode() + new Boolean(this.A01).hashCode();
    }
}
