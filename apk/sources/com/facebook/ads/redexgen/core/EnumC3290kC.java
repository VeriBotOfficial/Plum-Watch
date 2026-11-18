package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum EnumC3290kC {
    A05,
    A04,
    A02,
    A03;

    public static byte[] A00;

    public static String A00(int r2, int r3, int r4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, r2, r2 + r3);
        for (int r1 = 0; r1 < bArrCopyOfRange.length; r1++) {
            bArrCopyOfRange[r1] = (byte) ((bArrCopyOfRange[r1] ^ r4) ^ 74);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{BuiltinOptions.SliceOptions, BuiltinOptions.PackOptions, 58, BuiltinOptions.TransposeConvOptions, BuiltinOptions.LessOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.DequantizeOptions, 35, BuiltinOptions.NegOptions, BuiltinOptions.PadV2Options, BuiltinOptions.ShapeOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.PadV2Options, BuiltinOptions.LogicalOrOptions, BuiltinOptions.PowOptions, 61, 32, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.RandomOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.HashtableSizeOptions};
    }

    static {
        A01();
    }
}
