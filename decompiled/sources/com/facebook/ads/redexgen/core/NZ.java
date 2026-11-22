package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public enum NZ {
    A02,
    A06,
    A05,
    A07,
    A08,
    A03,
    A04;

    public static byte[] A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 98);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{5, 20, 3, 7, 18, 3, 2, 24, 25, 15, 8, 14, 19, 5, 25, 24, 10, 29, 29, 0, 29, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.EqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.PowOptions, 61, BuiltinOptions.SliceOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.EqualOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.NegOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.TileOptions, 58, 28, 7, 0, 24, 1};
    }

    static {
        A01();
    }
}
