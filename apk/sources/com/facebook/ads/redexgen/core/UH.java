package com.facebook.ads.redexgen.core;

import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public enum UH {
    A06,
    A07,
    A04,
    A05,
    A03,
    A02;

    public static byte[] A00;

    public static String A00(int r2, int r3, int r4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, r2, r2 + r3);
        for (int r1 = 0; r1 < bArrCopyOfRange.length; r1++) {
            bArrCopyOfRange[r1] = (byte) ((bArrCopyOfRange[r1] - r4) - 95);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{10, 5, 13, 16, 9, 8, -3, 0, -8, -8, -10, -11, -11, -8, TransmissionUnpacked.HD_VAL_MAGIC_HB, TransmissionUnpacked.HD_VAL_MAGIC_HB, -14, -9, TransmissionUnpacked.HD_VAL_MAGIC_HB, -27, -24, -32, -32, -30, -25, -32, -8, -27, -34, -20, -20, -8, -20, -19, -21, -30, -36, -19, -37, -36, -31, -20, -39, -36, -44, -44, -46, -47, -73, -84, -75, -85, -80, -75, -82};
    }

    static {
        A01();
    }
}
