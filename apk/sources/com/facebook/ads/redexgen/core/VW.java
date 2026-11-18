package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: assets/audience_network.dex */
public enum VW {
    A04,
    A03,
    A02;

    public static byte[] A00;

    public static String A00(int r2, int r3, int r4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, r2, r2 + r3);
        for (int r1 = 0; r1 < bArrCopyOfRange.length; r1++) {
            bArrCopyOfRange[r1] = (byte) ((bArrCopyOfRange[r1] ^ r4) ^ 115);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{BuiltinOptions.NegOptions, BuiltinOptions.SelectOptions, BuiltinOptions.PowOptions, BuiltinOptions.ATan2Options, BuiltinOptions.HashtableImportOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.HashtableImportOptions, 6, 29, 24, 29, 28, 4, 29};
    }

    static {
        A01();
    }
}
