package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Lh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2354Lh {
    public static final C2354Lh A02 = new C2354Lh();
    public byte A00 = 3;
    public boolean A01 = true;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C2354Lh)) {
            return false;
        }
        C2354Lh c2354Lh = (C2354Lh) obj;
        return this.A00 == c2354Lh.A00 && this.A01 == c2354Lh.A01;
    }

    public final int hashCode() {
        return new Byte(this.A00).hashCode() + new Boolean(this.A01).hashCode();
    }
}
