package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.Md, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC1671Md {
    A03(A00(37, 9, 98)),
    A05(A00(65, 9, 87)),
    A04(A00(46, 19, 70));

    public static byte[] A01;
    public final String A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 66);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{BuiltinOptions.SquareOptions, BuiltinOptions.WhereOptions, BuiltinOptions.SquareOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.SquareOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.AbsOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.UniqueOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.CosOptions, BuiltinOptions.AbsOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.WhereOptions, BuiltinOptions.AbsOptions, BuiltinOptions.WhileOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.FillOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, 8, 19, 19, 3, 15, 17, 29, 16, 16, BuiltinOptions.FloorDivOptions, BuiltinOptions.RankOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.RangeOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.SquareOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.RandomOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.HardSwishOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.ATan2Options, BuiltinOptions.ATan2Options, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.GeluOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.UnsortedSegmentSumOptions};
    }

    static {
        A01();
    }

    EnumC1671Md(String str) {
        this.A00 = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }
}
