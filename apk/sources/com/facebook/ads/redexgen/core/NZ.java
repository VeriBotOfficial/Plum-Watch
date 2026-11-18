package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: assets/audience_network.dex */
public enum NZ {
    A02,
    A06,
    A05,
    A07,
    A08,
    A03,
    A04;

    public static byte[] A00;

    public static String A00(int r2, int r3, int r4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, r2, r2 + r3);
        for (int r1 = 0; r1 < bArrCopyOfRange.length; r1++) {
            bArrCopyOfRange[r1] = (byte) ((bArrCopyOfRange[r1] ^ r4) ^ 98);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{5, 20, 3, 7, 18, 3, 2, 24, 25, 15, 8, 14, 19, 5, 25, 24, 10, 29, 29, 0, 29, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.EqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.PowOptions, 61, BuiltinOptions.SliceOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.EqualOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.NegOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.TileOptions, 58, 28, 7, 0, 24, 1};
    }

    static {
        A01();
    }
}
