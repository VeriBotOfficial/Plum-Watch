package com.facebook.ads.redexgen.core;

import com.hispark.crashdump.protocol.ProtocolBytes;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.db, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum EnumC2935db {
    A03,
    A04,
    A02;

    public static byte[] A00;

    public static String A00(int r2, int r3, int r4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, r2, r2 + r3);
        for (int r1 = 0; r1 < bArrCopyOfRange.length; r1++) {
            bArrCopyOfRange[r1] = (byte) ((bArrCopyOfRange[r1] - r4) - 39);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-75, -55, -56, -61, -45, -57, -56, -75, -58, -56, -71, -72, -27, -26, -21, -10, -22, -21, -40, -23, -21, -36, -37, -61, -63, -77, -64, -51, -63, -62, ProtocolBytes.SOF, -64, -62, -77, -78};
    }

    static {
        A01();
    }
}
