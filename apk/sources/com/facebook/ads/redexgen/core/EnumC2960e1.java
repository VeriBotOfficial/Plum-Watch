package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.e1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum EnumC2960e1 {
    A03,
    A02,
    A05,
    A04;

    public static byte[] A00;

    public static String A00(int r2, int r3, int r4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, r2, r2 + r3);
        for (int r1 = 0; r1 < bArrCopyOfRange.length; r1++) {
            bArrCopyOfRange[r1] = (byte) ((bArrCopyOfRange[r1] ^ r4) ^ 120);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{28, 19, 20, 16, 28, 9, 24, 25, BuiltinOptions.HashtableOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.GeluOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.RankOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, 64, BuiltinOptions.FillOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.WhileOptions, 64, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.AbsOptions};
    }

    static {
        A01();
    }
}
