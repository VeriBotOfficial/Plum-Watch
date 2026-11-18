package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: assets/audience_network.dex */
public enum Z5 {
    A03,
    A02,
    A05,
    A04;

    public static byte[] A00;

    public static String A00(int r2, int r3, int r4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, r2, r2 + r3);
        for (int r1 = 0; r1 < bArrCopyOfRange.length; r1++) {
            bArrCopyOfRange[r1] = (byte) ((bArrCopyOfRange[r1] ^ r4) ^ 1);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{35, BuiltinOptions.ArgMaxOptions, 34, BuiltinOptions.ArgMinOptions, BuiltinOptions.CastOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.ExpandDimsOptions, 34, 2, 13, 22, 23, 16, 27, 7, 5, 22, 0, BuiltinOptions.PowOptions, 58, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.ShapeOptions, 58, BuiltinOptions.GreaterEqualOptions, 63, BuiltinOptions.LessOptions, 58, BuiltinOptions.GreaterOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PackOptions, BuiltinOptions.PadV2Options, 58, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.AddNOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.AddNOptions, BuiltinOptions.FillOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.GatherNdOptions, BuiltinOptions.WhereOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.GatherNdOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.AddNOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.AbsOptions};
    }

    static {
        A01();
    }
}
