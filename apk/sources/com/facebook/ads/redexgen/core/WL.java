package com.facebook.ads.redexgen.core;

import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class WL extends Exception {
    public static byte[] A00;
    public static String[] A01 = {"bPO0ugaeXfa7uXjMXKhS1KHZA7oolnDS", "5VEkiBesq0S", "quO3r7P4ln5WJUQ", "zM7ZelbUg22KKOGLl25t", "99uhMkddPMJJPnRd4C", "JBAQo527ZYtZr4L", "", "64LnU3lhwQRNyBCw5dlHSHpXej53Kco6"};

    public static String A00(int r4, int r5, int r6) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, r4, r4 + r5);
        int r7 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A01[2].length() == 20) {
                throw new RuntimeException();
            }
            A01[3] = "NtF9HtTTwBqLhjE3yqSm";
            if (r7 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[r7] = (byte) ((bArrCopyOfRange[r7] - r6) - 12);
            r7++;
        }
    }

    public static void A01() {
        A00 = new byte[]{-69, -29, -29, -37, -32, -39, -108, -60, -32, TransmissionUnpacked.HD_VAL_MAGIC_LB, -19, -108, -35, -25, -108, -30, -29, -24, -108, -35, -30, -25, -24, TransmissionUnpacked.HD_VAL_MAGIC_LB, -32, -32, -39, -40};
    }

    static {
        A01();
    }

    public WL() {
        super(A00(0, 28, 104));
    }
}
