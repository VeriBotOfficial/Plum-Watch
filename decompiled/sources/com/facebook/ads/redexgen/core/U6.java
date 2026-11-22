package com.facebook.ads.redexgen.core;

import android.content.Context;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public abstract class U6 {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 62);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{BuiltinOptions.LogicalAndOptions, BuiltinOptions.PackOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.ArgMaxOptions, 0, BuiltinOptions.LogicalOrOptions, BuiltinOptions.SliceOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.PowOptions, 0, BuiltinOptions.GreaterOptions, 58, BuiltinOptions.TransposeConvOptions, BuiltinOptions.PackOptions, 0, BuiltinOptions.ArgMinOptions, 61, BuiltinOptions.TileOptions, BuiltinOptions.SliceOptions, BuiltinOptions.PowOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.TransposeConvOptions, 0, BuiltinOptions.LogicalAndOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.PackOptions, Byte.MAX_VALUE, BuiltinOptions.ATan2Options, BuiltinOptions.ReadVariableOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.ATan2Options, BuiltinOptions.UnsortedSegmentMinOptions, Byte.MAX_VALUE, BuiltinOptions.FloorDivOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.SignOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.SignOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.SignOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.FloorModOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.HardSwishOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.RankOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.QuantizeOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.RankOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.LeakyReluOptions, 1, 4, 14, 23, 63, 21, 19, 5, 63, 6, 2, BuiltinOptions.CosOptions, 1, 63, 9, 4, BuiltinOptions.ATan2Options, Byte.MAX_VALUE, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.FillOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.FillOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.SelectOptions, BuiltinOptions.ATan2Options, BuiltinOptions.FillOptions, BuiltinOptions.RandomOptions, Byte.MAX_VALUE, BuiltinOptions.FillOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.RandomOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.VarHandleOptions, 64, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.RankOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.CosOptions, BuiltinOptions.AddNOptions, BuiltinOptions.FillOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.RightShiftOptions, 64, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.FillOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.WhereOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.FillOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.FillOptions, BuiltinOptions.AddNOptions, BuiltinOptions.RangeOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.WhereOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.FillOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.AddNOptions};
    }

    public static long A00(Context context) {
        return U7.A0V(context).A2v(A02(29, 25, 32), -1L);
    }

    public static long A01(Context context) {
        return U7.A0V(context).A2v(A02(131, 31, 31), -1L);
    }

    public static boolean A04(Context context) {
        return U7.A0V(context).A30(A02(54, 39, 1), true);
    }

    public static boolean A05(Context context) {
        return U7.A0V(context).A30(A02(0, 29, 97), false);
    }

    public static boolean A06(Context context) {
        return U7.A0V(context).A30(A02(93, 16, 94), false);
    }

    public static boolean A07(Context context) {
        return U7.A0V(context).A30(A02(109, 22, 37), false);
    }
}
