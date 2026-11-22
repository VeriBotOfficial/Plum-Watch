package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.dr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC2259dr {
    A04,
    A03,
    A02;

    public static byte[] A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 52);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{BuiltinOptions.SignOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.ATan2Options, -108, -124, -118, -119, -108, -124, -125, -108, -123, -127, BuiltinOptions.UnsortedSegmentProdOptions, -114, -73, PSSSigner.TRAILER_IMPLICIT, -60, -63, -73, -80, -70, -77, -117, BuiltinOptions.RightShiftOptions, -120, BuiltinOptions.RightShiftOptions, BuiltinOptions.UnsortedSegmentMaxOptions, -127, BuiltinOptions.ATan2Options};
    }

    static {
        A01();
    }
}
