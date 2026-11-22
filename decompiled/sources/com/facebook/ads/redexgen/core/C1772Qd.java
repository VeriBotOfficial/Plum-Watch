package com.facebook.ads.redexgen.core;

import android.util.SparseArray;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.Qd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1772Qd {
    public static byte[] A0H;
    public int A01;
    public int A02;
    public int A06;
    public int A07;
    public long A08;
    public SparseArray<Object> A0G;
    public int A0F = -1;
    public int A05 = 0;
    public int A00 = 0;
    public int A04 = 1;
    public int A03 = 0;
    public boolean A0D = false;
    public boolean A09 = false;
    public boolean A0E = false;
    public boolean A0A = false;
    public boolean A0C = false;
    public boolean A0B = false;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0H, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 24);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0H = new byte[]{BuiltinOptions.LeakyReluOptions, 9, 30, 31, BuiltinOptions.LeakyReluOptions, 2, 31, BuiltinOptions.LeakyReluOptions, 2, 24, BuiltinOptions.LeakyReluOptions, 22, 26, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.AbsOptions, BuiltinOptions.HardSwishOptions, 7, BuiltinOptions.AbsOptions, BuiltinOptions.SquareOptions, 15, BuiltinOptions.DequantizeOptions, 7, 14, 7, 22, 7, 6, BuiltinOptions.PadV2Options, 12, 20, 11, 17, 11, 0, 14, 7, BuiltinOptions.PadV2Options, 22, 7, 15, BuiltinOptions.ExpOptions, 13, 23, 12, 22, BuiltinOptions.TransposeConvOptions, 11, 12, 1, 7, BuiltinOptions.SparseToDenseOptions, 16, 7, 20, 11, 13, 23, 17, BuiltinOptions.LessEqualOptions, 3, 27, 13, 23, 22, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.ExpOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.FillOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.WhileOptions, Byte.MAX_VALUE, BuiltinOptions.BroadcastToOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.GeluOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.SliceOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.SliceOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.GatherNdOptions, Byte.MAX_VALUE, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.GreaterEqualOptions, 3, 15, BuiltinOptions.SquareOptions, Byte.MAX_VALUE, BuiltinOptions.WhileOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, 64, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.IfOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.AbsOptions, BuiltinOptions.RankOptions, 64, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.SquareOptions, BuiltinOptions.HashtableFindOptions, 64, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.HardSwishOptions, 18, BuiltinOptions.RankOptions, BuiltinOptions.MatrixSetDiagOptions, 23, BuiltinOptions.ArgMaxOptions, 15, 20, BuiltinOptions.NegOptions, 8, 31, 30, 19, 25, 14, 19, 12, 31, BuiltinOptions.PackOptions, 20, 19, 23, 27, 14, 19, 21, 20, 9, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.LessOptions, BuiltinOptions.CastOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.RankOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.FillOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.PowOptions, 17, 29, BuiltinOptions.UniqueOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.RangeOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.RangeOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.WhereOptions, BuiltinOptions.IfOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.QuantizeOptions, 0, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.WhereOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.FloorDivOptions, 64, 20, BuiltinOptions.UnidirectionalSequenceLSTMOptions, 64, BuiltinOptions.WhereOptions, 64, BuiltinOptions.ReverseV2Options, 20, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.IfOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.UniqueOptions, 20, BuiltinOptions.RankOptions, BuiltinOptions.ReverseV2Options, 20, BuiltinOptions.HardSwishOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.ReverseV2Options, 20, BuiltinOptions.HardSwishOptions, BuiltinOptions.AddNOptions, 20, BuiltinOptions.HashtableOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.WhileOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.WhereOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.WhileOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.RankOptions, 5};
    }

    public final int A03() {
        if (this.A09) {
            return this.A05 - this.A00;
        }
        return this.A03;
    }

    public final void A04(int i) {
        if ((this.A04 & i) != 0) {
        } else {
            throw new IllegalStateException(A01(192, 30, 44) + Integer.toBinaryString(i) + A01(0, 11, 115) + Integer.toBinaryString(this.A04));
        }
    }

    public final void A05(QC qc) {
        this.A04 = 1;
        this.A03 = qc.A0B();
        this.A09 = false;
        this.A0E = false;
        this.A0A = false;
    }

    public final boolean A06() {
        return this.A0F != -1;
    }

    public final boolean A07() {
        return this.A09;
    }

    public final boolean A08() {
        return this.A0B;
    }

    public final String toString() {
        return A01(222, 22, 32) + this.A0F + A01(11, 8, 34) + this.A0G + A01(82, 13, 8) + this.A03 + A01(95, 27, 55) + this.A05 + A01(19, 48, 122) + this.A00 + A01(172, 20, 37) + this.A0D + A01(67, 15, 21) + this.A09 + A01(149, 23, 29) + this.A0C + A01(122, 27, 98) + this.A0B + AbstractJsonLexerKt.END_OBJ;
    }
}
