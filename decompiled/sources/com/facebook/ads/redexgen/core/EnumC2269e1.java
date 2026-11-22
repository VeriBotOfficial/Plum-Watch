package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.e1, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC2269e1 {
    A03,
    A02,
    A05,
    A04;

    public static byte[] A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 120);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{28, 19, 20, 16, 28, 9, 24, 25, BuiltinOptions.HashtableOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.GeluOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.RankOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, 64, BuiltinOptions.FillOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.WhileOptions, 64, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.AbsOptions};
    }

    static {
        A01();
    }
}
