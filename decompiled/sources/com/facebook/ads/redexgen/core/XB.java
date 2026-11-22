package com.facebook.ads.redexgen.core;

import com.anythink.basead.ui.f.d;
import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public enum XB {
    A02,
    A03;

    public static byte[] A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) + d.b);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-79, -78, -77, -82, -62, -71, -63, -22, -7, TransmissionUnpacked.HD_VAL_MAGIC_HB, TransmissionUnpacked.HD_VAL_MAGIC_HB, 3, -9, -25, -10, -23, -23, -14};
    }

    static {
        A01();
    }
}
