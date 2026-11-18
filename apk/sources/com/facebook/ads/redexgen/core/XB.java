package com.facebook.ads.redexgen.core;

import com.anythink.basead.ui.f.d;
import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public enum XB {
    A02,
    A03;

    public static byte[] A00;

    public static String A00(int r2, int r3, int r4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, r2, r2 + r3);
        for (int r1 = 0; r1 < bArrCopyOfRange.length; r1++) {
            bArrCopyOfRange[r1] = (byte) ((bArrCopyOfRange[r1] - r4) + d.b);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-79, -78, -77, -82, -62, -71, -63, -22, -7, TransmissionUnpacked.HD_VAL_MAGIC_HB, TransmissionUnpacked.HD_VAL_MAGIC_HB, 3, -9, -25, -10, -23, -23, -14};
    }

    static {
        A01();
    }
}
