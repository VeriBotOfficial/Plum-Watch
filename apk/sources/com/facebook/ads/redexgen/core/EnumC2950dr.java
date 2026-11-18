package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum EnumC2950dr {
    A04,
    A03,
    A02;

    public static byte[] A00;

    public static String A00(int r2, int r3, int r4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, r2, r2 + r3);
        for (int r1 = 0; r1 < bArrCopyOfRange.length; r1++) {
            bArrCopyOfRange[r1] = (byte) ((bArrCopyOfRange[r1] - r4) - 52);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{BuiltinOptions.SignOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.ATan2Options, -108, -124, -118, -119, -108, -124, -125, -108, -123, -127, BuiltinOptions.UnsortedSegmentProdOptions, -114, -73, PSSSigner.TRAILER_IMPLICIT, -60, -63, -73, -80, -70, -77, -117, BuiltinOptions.RightShiftOptions, -120, BuiltinOptions.RightShiftOptions, BuiltinOptions.UnsortedSegmentMaxOptions, -127, BuiltinOptions.ATan2Options};
    }

    static {
        A01();
    }
}
