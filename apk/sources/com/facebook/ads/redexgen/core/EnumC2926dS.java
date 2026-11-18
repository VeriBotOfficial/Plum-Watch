package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum EnumC2926dS {
    A06(0),
    A08(1),
    A09(2),
    A03(3),
    A05(4),
    A07(5),
    A04(6),
    A0A(7),
    A0B(10);

    public static byte[] A01;
    public final int A00;

    public static String A00(int r2, int r3, int r4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, r2, r2 + r3);
        for (int r1 = 0; r1 < bArrCopyOfRange.length; r1++) {
            bArrCopyOfRange[r1] = (byte) ((bArrCopyOfRange[r1] - r4) - 68);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-40, -35, -50, -48, -40, -41, -56, -90, -105, -85, -87, -101, -67, -71, -82, -58, -24, -37, -23, -21, -29, -37, -36, -44, -46, -39, -31, -42, -38, -46, -24, -31, -32, -24, -25, -40, -5, -18, -22, -4, -26, -25, -15, -22, 4, -18, -14, -11, -9, -22, -8, -8, -18, -12, -13};
    }

    static {
        A01();
    }

    EnumC2926dS(int r3) {
        this.A00 = r3;
    }
}
