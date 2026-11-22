package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.kC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC2633kC {
    A05,
    A04,
    A02,
    A03;

    public static byte[] A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 74);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{BuiltinOptions.SliceOptions, BuiltinOptions.PackOptions, 58, BuiltinOptions.TransposeConvOptions, BuiltinOptions.LessOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.DequantizeOptions, 35, BuiltinOptions.NegOptions, BuiltinOptions.PadV2Options, BuiltinOptions.ShapeOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.PadV2Options, BuiltinOptions.LogicalOrOptions, BuiltinOptions.PowOptions, 61, 32, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.RandomOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.HashtableSizeOptions};
    }

    static {
        A01();
    }
}
