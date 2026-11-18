package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Md, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum EnumC2375Md {
    A03(A00(37, 9, 98)),
    A05(A00(65, 9, 87)),
    A04(A00(46, 19, 70));

    public static byte[] A01;
    public final String A00;

    public static String A00(int r2, int r3, int r4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, r2, r2 + r3);
        for (int r1 = 0; r1 < bArrCopyOfRange.length; r1++) {
            bArrCopyOfRange[r1] = (byte) ((bArrCopyOfRange[r1] ^ r4) ^ 66);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{BuiltinOptions.SquareOptions, BuiltinOptions.WhereOptions, BuiltinOptions.SquareOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.SquareOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.AbsOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.UniqueOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.CosOptions, BuiltinOptions.AbsOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.WhereOptions, BuiltinOptions.AbsOptions, BuiltinOptions.WhileOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.FillOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, 8, 19, 19, 3, 15, 17, 29, 16, 16, BuiltinOptions.FloorDivOptions, BuiltinOptions.RankOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.RangeOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.SquareOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.RandomOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.HardSwishOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.ATan2Options, BuiltinOptions.ATan2Options, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.GeluOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.UnsortedSegmentSumOptions};
    }

    static {
        A01();
    }

    EnumC2375Md(String str) {
        this.A00 = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }
}
