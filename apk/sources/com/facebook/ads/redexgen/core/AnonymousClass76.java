package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.76, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract /* synthetic */ class AnonymousClass76 {
    public static int A00(int r1) {
        return A06(r1, 0, 0);
    }

    public static int A01(int r0) {
        return r0 & 24;
    }

    public static int A02(int r0) {
        return r0 & 384;
    }

    public static int A03(int r0) {
        return r0 & 7;
    }

    public static int A04(int r0) {
        return r0 & 64;
    }

    public static int A05(int r0) {
        return r0 & 32;
    }

    public static int A06(int r2, int r3, int r4) {
        return A07(r2, r3, r4, 0, 128);
    }

    public static int A07(int r0, int r1, int r2, int r3, int r4) {
        return r0 | r1 | r2 | r3 | r4;
    }
}
