package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public enum Z5 {
    A03,
    A02,
    A05,
    A04;

    public static byte[] A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 1);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{35, BuiltinOptions.ArgMaxOptions, 34, BuiltinOptions.ArgMinOptions, BuiltinOptions.CastOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.ExpandDimsOptions, 34, 2, 13, 22, 23, 16, 27, 7, 5, 22, 0, BuiltinOptions.PowOptions, 58, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.ShapeOptions, 58, BuiltinOptions.GreaterEqualOptions, 63, BuiltinOptions.LessOptions, 58, BuiltinOptions.GreaterOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PackOptions, BuiltinOptions.PadV2Options, 58, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.AddNOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.AddNOptions, BuiltinOptions.FillOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.GatherNdOptions, BuiltinOptions.WhereOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.GatherNdOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.AddNOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.AbsOptions};
    }

    static {
        A01();
    }
}
