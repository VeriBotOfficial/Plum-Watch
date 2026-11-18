package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: assets/audience_network.dex */
public enum WY {
    A04,
    A03,
    A02;

    public static byte[] A00;

    public static String A00(int r2, int r3, int r4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, r2, r2 + r3);
        for (int r1 = 0; r1 < bArrCopyOfRange.length; r1++) {
            bArrCopyOfRange[r1] = (byte) ((bArrCopyOfRange[r1] ^ r4) ^ 44);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{BuiltinOptions.DensifyOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.HashtableSizeOptions, 18, 21, 18, 15, 18, 26, 23, 18, 1, 18, 21, 28, 24, 25, 2, 9, 31, 24, 31, 2, 31, 23, 26, 31, 12, 19, 18};
    }

    static {
        A01();
    }
}
