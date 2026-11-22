package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Rp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1810Rp {
    public final long A00;
    public final EnumC1809Ro A01;
    public final String A02;
    public final boolean A03;

    public C1810Rp(String str, boolean z, EnumC1809Ro enumC1809Ro) {
        this(str, z, enumC1809Ro, System.currentTimeMillis());
    }

    public C1810Rp(String str, boolean z, EnumC1809Ro enumC1809Ro, long j) {
        this.A02 = str;
        this.A03 = z;
        this.A01 = enumC1809Ro;
        this.A00 = j;
    }

    public static C1810Rp A00() {
        return new C1810Rp("", true, EnumC1809Ro.A05, -1L);
    }

    public final long A01() {
        return this.A00;
    }

    public final EnumC1809Ro A02() {
        return this.A01;
    }

    public final String A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A03;
    }
}
