package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public final class ZS {
    public static byte[] A08;
    public static String[] A09 = {"RCnn6pCzuGmx3q71pxhPkiVufEZFhrue", "mpaFRgKOI8I", "wGcy8NSqCuh8w4Qd8eleXwL5PKL6kLu0", "yBtS5H9nBGCF", "BJontwmfcei8Ydfnpbrw2OUV", "oZ3BMmDZvmusmOT443VgfsBrmXcMhGXT", "1c3rWqDgJYn0reBhn", "avQkykMwqnpIevrWTEzEvMtO"};
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final String A07;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 94);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A08 = new byte[]{BuiltinOptions.BroadcastToOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.DensifyOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.ScatterNdOptions, Byte.MAX_VALUE, BuiltinOptions.ReadVariableOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.GeluOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.LessOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.TileOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.PadV2Options, 24, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.EqualOptions, BuiltinOptions.PadV2Options, BuiltinOptions.ReverseV2Options, BuiltinOptions.AddNOptions, BuiltinOptions.IfOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.HardSwishOptions, BuiltinOptions.CosOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.CosOptions, BuiltinOptions.AbsOptions, BuiltinOptions.WhereOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.UniqueOptions, BuiltinOptions.AbsOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.CosOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.Conv3DOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.CosOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, 34, BuiltinOptions.EqualOptions, 35, 32, 63, BuiltinOptions.LogicalAndOptions, 35, BuiltinOptions.EqualOptions, 15, BuiltinOptions.EqualOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.ExpandDimsOptions, 15, 61, 35, BuiltinOptions.IfOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.WhileOptions, 64, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.WhileOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.AbsOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.RankOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.SquareOptions, BuiltinOptions.IfOptions, BuiltinOptions.FillOptions, BuiltinOptions.AddNOptions, BuiltinOptions.FillOptions, BuiltinOptions.FillOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.FillOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.BroadcastToOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.FillOptions};
        String[] strArr = A09;
        if (strArr[2].charAt(30) != strArr[0].charAt(30)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A09;
        strArr2[4] = "471Kmxz1Me6vVyXXwzQpeRmH";
        strArr2[7] = "yPKApIkQtN13Op8uOOE76YlC";
    }

    static {
        A01();
    }

    public ZS(String str, long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.A07 = str;
        this.A01 = j;
        this.A03 = j2;
        this.A04 = j3;
        this.A00 = j4;
        this.A05 = j5;
        this.A02 = j6;
        this.A06 = j7;
    }

    public final Map<String, String> A02() {
        HashMap hashMap = new HashMap(7);
        hashMap.put(A00(36, 11, 25), this.A07);
        hashMap.put(A00(21, 15, 70), String.valueOf(this.A01));
        hashMap.put(A00(61, 13, 107), String.valueOf(this.A03));
        hashMap.put(A00(74, 15, 14), String.valueOf(this.A04));
        hashMap.put(A00(0, 21, 82), String.valueOf(this.A00));
        hashMap.put(A00(89, 15, 113), String.valueOf(this.A05));
        hashMap.put(A00(47, 14, 99), String.valueOf(this.A02));
        hashMap.put(A00(104, 17, 105), String.valueOf(this.A06));
        return hashMap;
    }
}
