package com.facebook.ads.redexgen.core;

import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import java.util.Arrays;
import org.bouncycastle.crypto.signers.PSSSigner;

/* JADX INFO: loaded from: assets/audience_network.dex */
public enum UU {
    A05(0),
    A04(1);

    public static byte[] A01;
    public static String[] A02 = {"uhTzHy3ANqMm9pT5Vj0y58oueHh5X8x0", "T1n0km6AB0RWROiTt90mCanTjxu0eU9v", "guj8u", "qED7e7UX90QQgnHDR4FxiOt7ONkFhw8M", "ckG7PMHxRgjSmMurQ73wQaofIHipTcek", "kxqjIStyOeZmlNn9xMd3jjfND4aGb7YZ", "8IQX3zoxYaZjanbr90SETWyiMVFv66cT", "UjafbnL"};
    public final int A00;

    public static String A00(int r4, int r5, int r6) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, r4, r4 + r5);
        int r7 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A02;
            if (strArr[7].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[7] = "s0XGUsh";
            strArr2[2] = "eznYh";
            if (r7 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[r7] = (byte) ((bArrCopyOfRange[r7] - r6) - 35);
            r7++;
        }
    }

    public static void A01() {
        A01 = new byte[]{TransmissionUnpacked.HD_VAL_MAGIC_LB, -42, -41, -42, -29, -29, -42, TransmissionUnpacked.HD_VAL_MAGIC_LB, -72, PSSSigner.TRAILER_IMPLICIT, PSSSigner.TRAILER_IMPLICIT, -76, -77, -72, -80, -61, -76};
    }

    static {
        A01();
    }

    UU(int r3) {
        this.A00 = r3;
    }
}
