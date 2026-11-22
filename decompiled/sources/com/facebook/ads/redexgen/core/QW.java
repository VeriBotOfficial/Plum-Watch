package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.opencv.videoio.Videoio;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public final class QW {
    public static byte[] A09;
    public static String[] A0A = {"", "d6jyZ4YF4aAx6mY2oyMV8cMH3x1tTmGX", "6ShmsSFKDmdiSeaEbVJI0pMmhv", "Jy6CLSdjiTJVmxisrmhO9od6ZqYVQGpz", "aKDRqPZxmSwbRmY5O7VQCqOvGq0yRVmO", "vr6xx06LqTBYtEPA9ZzozSqPDwzkbNaY", "Y84hViIy7qYskGYmJ3QVEouknT", ""};
    public QV A01;
    public AbstractC1773Qe A04;
    public final /* synthetic */ C12756g A08;
    public final ArrayList<AbstractC1775Qg> A05 = new ArrayList<>();
    public ArrayList<AbstractC1775Qg> A02 = null;
    public final ArrayList<AbstractC1775Qg> A06 = new ArrayList<>();
    public final List<AbstractC1775Qg> A07 = Collections.unmodifiableList(this.A05);
    public int A03 = 2;
    public int A00 = 2;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 10);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A09 = new byte[]{BuiltinOptions.AssignVariableOptions, BuiltinOptions.PowOptions, 34, 16, BuiltinOptions.CastOptions, BuiltinOptions.CastOptions, BuiltinOptions.SliceOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.EqualOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.PowOptions, BuiltinOptions.RankOptions, 17, 24, 24, 13, 27, 10, BuiltinOptions.FillOptions, 32, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.LessOptions, 64, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.LessOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.TileOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.FloorModOptions, 21, 18, 7, 18, 3, BuiltinOptions.IfOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.RankOptions, BuiltinOptions.RankOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.DepthToSpaceOptions, 26, BuiltinOptions.RangeOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.ResizeNearestNeighborOptions, 26, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.MirrorPadOptions, 26, BuiltinOptions.MirrorPadOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.AbsOptions, BuiltinOptions.AddNOptions, 26, BuiltinOptions.HardSwishOptions, BuiltinOptions.CosOptions, 26, BuiltinOptions.GatherNdOptions, BuiltinOptions.CosOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.RankOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.DepthToSpaceOptions, 26, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.MirrorPadOptions, 20, 26, BuiltinOptions.BucketizeOptions, BuiltinOptions.CosOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.RankOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.DepthToSpaceOptions, 26, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.MirrorPadOptions, BuiltinOptions.RangeOptions, 26, BuiltinOptions.QuantizeOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.CosOptions, BuiltinOptions.CosOptions, BuiltinOptions.WhereOptions, BuiltinOptions.AbsOptions, 26, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.NonMaxSuppressionV4Options, 26, BuiltinOptions.FloorModOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.SplitVOptions, BuiltinOptions.RangeOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.DepthToSpaceOptions, 26, BuiltinOptions.IfOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.WhereOptions, BuiltinOptions.ReverseSequenceOptions, 26, BuiltinOptions.RangeOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.ResizeNearestNeighborOptions, 22, 26, BuiltinOptions.AbsOptions, BuiltinOptions.AddNOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.ZerosLikeOptions, 26, BuiltinOptions.RangeOptions, BuiltinOptions.AddNOptions, BuiltinOptions.WhereOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.RankOptions, BuiltinOptions.DepthToSpaceOptions, 26, BuiltinOptions.FloorModOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.WhereOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.CosOptions, BuiltinOptions.DepthToSpaceOptions, 26, BuiltinOptions.IfOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.WhereOptions, BuiltinOptions.ReverseSequenceOptions, 26, BuiltinOptions.FloorModOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.QuantizeOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.RankOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.FloorModOptions, 26, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.WhereOptions, BuiltinOptions.WhereOptions, BuiltinOptions.RankOptions, 20, BuiltinOptions.GeluOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.AddNOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.AbsOptions, BuiltinOptions.CosOptions, BuiltinOptions.AbsOptions, BuiltinOptions.RangeOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.FillOptions, 29, BuiltinOptions.QuantizeOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.RangeOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.RangeOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.QuantizeOptions, 19, 29, BuiltinOptions.GeluOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.IfOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.CosOptions, BuiltinOptions.QuantizeOptions, 29, BuiltinOptions.CosOptions, BuiltinOptions.RangeOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.UniqueOptions, 29, BuiltinOptions.MirrorPadOptions, BuiltinOptions.AddNOptions, BuiltinOptions.AbsOptions, BuiltinOptions.CosOptions, BuiltinOptions.RangeOptions, BuiltinOptions.CosOptions, BuiltinOptions.AddNOptions, BuiltinOptions.GatherNdOptions, 29, 31, BuiltinOptions.PowOptions, BuiltinOptions.EqualOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.PowOptions, BuiltinOptions.CastOptions, 63, BuiltinOptions.CastOptions, 34, BuiltinOptions.TileOptions, BuiltinOptions.PowOptions, BuiltinOptions.EqualOptions, BuiltinOptions.SelectOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, 34, BuiltinOptions.TileOptions, BuiltinOptions.EqualOptions, 34, BuiltinOptions.TileOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.UnsortedSegmentProdOptions, 31, BuiltinOptions.PowOptions, 32, BuiltinOptions.ShapeOptions, 58, 63, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.UnsortedSegmentProdOptions, 32, 63, BuiltinOptions.TileOptions, BuiltinOptions.ExpOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.ArgMinOptions, 58, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.DequantizeOptions, 34, BuiltinOptions.TileOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.CastOptions, 63, 34, 63, BuiltinOptions.ArgMinOptions, BuiltinOptions.PowOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.GeluOptions, BuiltinOptions.SliceOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.SliceOptions, BuiltinOptions.NonMaxSuppressionV5Options, Byte.MAX_VALUE, BuiltinOptions.DensifyOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.UnsortedSegmentSumOptions, Byte.MAX_VALUE, BuiltinOptions.RightShiftOptions, BuiltinOptions.SliceOptions, 18, 34, BuiltinOptions.TileOptions, 32, BuiltinOptions.TransposeConvOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.CastOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.TileOptions, BuiltinOptions.ScatterNdOptions, 32, BuiltinOptions.EqualOptions, BuiltinOptions.EqualOptions, 32, 34, BuiltinOptions.LessOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.CastOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.GreaterOptions, 32, BuiltinOptions.PowOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.SelectOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.EqualOptions, BuiltinOptions.ScatterNdOptions, 35, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.TileOptions, BuiltinOptions.LogSoftmaxOptions, 34, BuiltinOptions.PowOptions, 34, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.CastOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.SparseToDenseOptions, 18, 34, BuiltinOptions.TileOptions, 32, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SignOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.WhereOptions, BuiltinOptions.FloorModOptions, 24, BuiltinOptions.IfOptions, BuiltinOptions.WhileOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.WhileOptions, BuiltinOptions.IfOptions, 24, BuiltinOptions.AbsOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.WhileOptions, BuiltinOptions.SplitVOptions, 24, BuiltinOptions.LeakyReluOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.CosOptions, BuiltinOptions.IfOptions, 24, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.WhileOptions, 24, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.WhileOptions, BuiltinOptions.WhereOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.AbsOptions, BuiltinOptions.WhileOptions, BuiltinOptions.IfOptions, 24, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.WhereOptions, 24, BuiltinOptions.Conv3DOptions, BuiltinOptions.WhileOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.CosOptions, BuiltinOptions.WhileOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.WhileOptions, BuiltinOptions.SplitVOptions, 24, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.WhileOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.WhileOptions, 24, BuiltinOptions.ReverseV2Options, BuiltinOptions.SquaredDifferenceOptions, 24, BuiltinOptions.HardSwishOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.RankOptions, 24, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.WhileOptions, 24, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.WhileOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.CosOptions, BuiltinOptions.WhileOptions, BuiltinOptions.IfOptions, 2, 24, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.ATan2Options, BuiltinOptions.Conv3DOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.SegmentSumOptions, 35, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.HashtableFindOptions, 35, BuiltinOptions.AssignVariableOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.ATan2Options, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.VarHandleOptions, BuiltinOptions.CumsumOptions, 35, BuiltinOptions.SelectV2Options, BuiltinOptions.HashtableImportOptions, 35, BuiltinOptions.Conv3DOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.CallOnceOptions, 35, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.GeluOptions, 35, BuiltinOptions.HashtableOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.GreaterEqualOptions, 35, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.UnsortedSegmentProdOptions, 35, BuiltinOptions.ReadVariableOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.CallOnceOptions, 35, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.UnsortedSegmentMaxOptions, 35, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.SelectV2Options, BuiltinOptions.VarHandleOptions, BuiltinOptions.VarHandleOptions, 35, BuiltinOptions.ReadVariableOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.WhereOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.GeluOptions, BuiltinOptions.PadV2Options, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.GeluOptions, BuiltinOptions.NegOptions, 35, BuiltinOptions.ScatterNdOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.CumsumOptions, 35, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.SelectV2Options, BuiltinOptions.VarHandleOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.SegmentSumOptions, 35, BuiltinOptions.AssignVariableOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.ATan2Options, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.VarHandleOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.SliceOptions, BuiltinOptions.SparseToDenseOptions, 35, 1, BuiltinOptions.LogicalAndOptions, BuiltinOptions.SparseToDenseOptions, 32, 17, BuiltinOptions.PowOptions, BuiltinOptions.CastOptions, 7, BuiltinOptions.PowOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.LogicalAndOptions, 35, BuiltinOptions.LogicalAndOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, 22, BuiltinOptions.ArgMinOptions, BuiltinOptions.TileOptions, 3, BuiltinOptions.LessEqualOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.SparseToDenseOptions, 29, 16, 8, 30, 4, 5, BuiltinOptions.ReverseV2Options, 24, 31, 21, 20, 9, BuiltinOptions.ReverseV2Options, 2, 25, 30, 4, 29, 21, BuiltinOptions.ReverseV2Options, 31, 30, 5, BuiltinOptions.ReverseV2Options, 19, 20, BuiltinOptions.ReverseV2Options, BuiltinOptions.IfOptions, 64, BuiltinOptions.ReverseV2Options, 16, 23, 5, 20, 3, BuiltinOptions.ReverseV2Options, 4, 31, 25, 24, 21, 24, 31, 22, BuiltinOptions.ReverseV2Options, 16, BuiltinOptions.ReverseV2Options, 7, 24, 20, 6, BuiltinOptions.LeakyReluOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.FillOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.WhileOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.RangeOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.RangeOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.AbsOptions};
    }

    static {
        A05();
    }

    public QW(C12756g c12756g) {
        this.A08 = c12756g;
    }

    private final View A00(int i, boolean z) {
        return A0I(i, z, Long.MAX_VALUE).A0H;
    }

    private final AbstractC1775Qg A01(int i) {
        int size;
        int A04;
        if (this.A02 == null || (size = this.A02.size()) == 0) {
            return null;
        }
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC1775Qg abstractC1775Qg = this.A02.get(i2);
            if (!abstractC1775Qg.A0m()) {
                int i3 = abstractC1775Qg.A0O();
                if (i3 == i) {
                    abstractC1775Qg.A0Z(32);
                    return abstractC1775Qg;
                }
            }
        }
        if (this.A08.A04.A0M() && (A04 = this.A08.A00.A04(i)) > 0) {
            int offsetPosition = this.A08.A04.A0B();
            if (A04 < offsetPosition) {
                long A0D = this.A08.A04.A0D(A04);
                for (int i4 = 0; i4 < size; i4++) {
                    AbstractC1775Qg abstractC1775Qg2 = this.A02.get(i4);
                    if (!abstractC1775Qg2.A0m() && abstractC1775Qg2.A0Q() == A0D) {
                        abstractC1775Qg2.A0Z(32);
                        return abstractC1775Qg2;
                    }
                }
            }
        }
        return null;
    }

    private final AbstractC1775Qg A02(int i, boolean z) {
        View A08;
        int size = this.A05.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC1775Qg abstractC1775Qg = this.A05.get(i2);
            if (!abstractC1775Qg.A0m()) {
                int scrapCount = abstractC1775Qg.A0O();
                if (scrapCount == i && !abstractC1775Qg.A0f() && (this.A08.A0s.A09 || !abstractC1775Qg.A0g())) {
                    abstractC1775Qg.A0Z(32);
                    return abstractC1775Qg;
                }
            }
        }
        if (!z && (A08 = this.A08.A01.A08(i)) != null) {
            AbstractC1775Qg A0F = C12756g.A0F(A08);
            this.A08.A01.A0G(A08);
            int A07 = this.A08.A01.A07(A08);
            if (A07 != -1) {
                this.A08.A01.A0C(A07);
                A0S(A08);
                A0F.A0Z(8224);
                return A0F;
            }
            throw new IllegalStateException(A04(Videoio.CAP_PROP_XI_IMAGE_BLACK_LEVEL, 52, 123) + A0F + this.A08.A1J());
        }
        int size2 = this.A06.size();
        for (int i3 = 0; i3 < size2; i3++) {
            AbstractC1775Qg holder = this.A06.get(i3);
            String[] strArr = A0A;
            String str = strArr[7];
            String str2 = strArr[0];
            int cacheSize = str.length();
            int scrapCount2 = str2.length();
            if (cacheSize != scrapCount2) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[4] = "JIr6ryR6hWTh2WYmHdarh5TP4xAypylw";
            strArr2[1] = "npmC62BAQEqZygYceoAiNhkQGghR92x0";
            if (!holder.A0f()) {
                int scrapCount3 = holder.A0O();
                if (scrapCount3 == i) {
                    if (!z) {
                        this.A06.remove(i3);
                    }
                    return holder;
                }
            }
        }
        return null;
    }

    private final AbstractC1775Qg A03(long j, int i, boolean z) {
        int count = this.A05.size();
        for (int i2 = count - 1; i2 >= 0; i2--) {
            AbstractC1775Qg abstractC1775Qg = this.A05.get(i2);
            if (abstractC1775Qg.A0Q() == j && !abstractC1775Qg.A0m()) {
                int count2 = abstractC1775Qg.A0N();
                if (i == count2) {
                    abstractC1775Qg.A0Z(32);
                    boolean A0g = abstractC1775Qg.A0g();
                    String[] strArr = A0A;
                    String str = strArr[2];
                    String str2 = strArr[6];
                    int i3 = str.length();
                    int count3 = str2.length();
                    if (i3 == count3) {
                        String[] strArr2 = A0A;
                        strArr2[4] = "3Wf6vMFZ4V6K3VYEAeXlgILB3Kqn8tmj";
                        strArr2[1] = "2gRFj7AUivxslEY3Do0gPT185jjA6g6i";
                        if (A0g && !this.A08.A0s.A07()) {
                            abstractC1775Qg.A0a(2, 14);
                        }
                        return abstractC1775Qg;
                    }
                } else if (z) {
                    continue;
                } else {
                    this.A05.remove(i2);
                    C12756g c12756g = this.A08;
                    View view = abstractC1775Qg.A0H;
                    String[] strArr3 = A0A;
                    String str3 = strArr3[7];
                    String str4 = strArr3[0];
                    int i4 = str3.length();
                    int count4 = str4.length();
                    if (i4 == count4) {
                        String[] strArr4 = A0A;
                        strArr4[5] = "QSy8SYzj9TGZXONlvrRd2Hl7xNggaX2t";
                        strArr4[3] = "FStY7c67BTbAcWAeNWEJdNOuKPlMCdqH";
                        c12756g.removeDetachedView(view, false);
                        A0R(abstractC1775Qg.A0H);
                    }
                }
                throw new RuntimeException();
            }
        }
        int count5 = this.A06.size();
        for (int i5 = count5 - 1; i5 >= 0; i5--) {
            AbstractC1775Qg abstractC1775Qg2 = this.A06.get(i5);
            if (abstractC1775Qg2.A0Q() == j) {
                int count6 = abstractC1775Qg2.A0N();
                if (i == count6) {
                    if (!z) {
                        this.A06.remove(i5);
                    }
                    return abstractC1775Qg2;
                }
                if (!z) {
                    A07(i5);
                    String[] strArr5 = A0A;
                    String str5 = strArr5[7];
                    String str6 = strArr5[0];
                    int cacheSize = str5.length();
                    int count7 = str6.length();
                    if (cacheSize != count7) {
                        throw new RuntimeException();
                    }
                    String[] strArr6 = A0A;
                    strArr6[2] = "Px4MCeB3tpw5Kws4bgsL6OQ2tD";
                    strArr6[6] = "cZzmTfGm3PDqBsfSjCaAnG9aB7";
                    return null;
                }
            }
        }
        return null;
    }

    private final void A06() {
        boolean z;
        int count = this.A06.size();
        for (int count2 = count - 1; count2 >= 0; count2--) {
            A07(count2);
        }
        this.A06.clear();
        z = C12756g.A1E;
        if (z) {
            this.A08.A02.A02();
        }
    }

    private final void A07(int i) {
        A0Z(this.A06.get(i), true);
        this.A06.remove(i);
    }

    private void A08(ViewGroup viewGroup, boolean z) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                A08((ViewGroup) childAt, true);
            }
        }
        if (!z) {
            return;
        }
        if (viewGroup.getVisibility() == 4) {
            viewGroup.setVisibility(0);
            viewGroup.setVisibility(4);
        } else {
            int visibility = viewGroup.getVisibility();
            viewGroup.setVisibility(4);
            viewGroup.setVisibility(visibility);
        }
    }

    private void A09(AbstractC1775Qg abstractC1775Qg) {
        if (this.A08.A1q()) {
            View view = abstractC1775Qg.A0H;
            if (P3.A00(view) == 0) {
                P3.A09(view, 1);
            }
            if (P3.A0F(view)) {
                return;
            }
            String[] strArr = A0A;
            if (strArr[4].charAt(14) != strArr[1].charAt(14)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[5] = "r5izwM6EITTd8J0QgfTuliuK3Ylx6gnH";
            strArr2[3] = "CLm8SGIYJT8sX0J5oMrTiG0qZUHKeksn";
            abstractC1775Qg.A0Z(16384);
            P3.A0B(view, this.A08.A09.A0A());
        }
    }

    private void A0A(AbstractC1775Qg abstractC1775Qg) {
        if (abstractC1775Qg.A0H instanceof ViewGroup) {
            A08((ViewGroup) abstractC1775Qg.A0H, false);
        }
    }

    private final void A0B(AbstractC1775Qg abstractC1775Qg) {
        if (0 != 0) {
            throw new NullPointerException(A04(617, 14, 32));
        }
        if (this.A08.A0s != null) {
            this.A08.A0t.A0B(abstractC1775Qg);
        }
    }

    private final boolean A0C(AbstractC1775Qg abstractC1775Qg) {
        if (abstractC1775Qg.A0g()) {
            return this.A08.A0s.A07();
        }
        if (abstractC1775Qg.A03 >= 0 && abstractC1775Qg.A03 < this.A08.A04.A0B()) {
            if (!this.A08.A0s.A07()) {
                int A0C = this.A08.A04.A0C(abstractC1775Qg.A03);
                int type = abstractC1775Qg.A0N();
                if (A0C != type) {
                    return false;
                }
            }
            return !this.A08.A04.A0M() || abstractC1775Qg.A0Q() == this.A08.A04.A0D(abstractC1775Qg.A03);
        }
        throw new IndexOutOfBoundsException(A04(211, 60, 92) + abstractC1775Qg + this.A08.A1J());
    }

    private boolean A0D(AbstractC1775Qg abstractC1775Qg, int i, int i2, long j) {
        abstractC1775Qg.A08 = this.A08;
        int A0N = abstractC1775Qg.A0N();
        long nanoTime = this.A08.getNanoTime();
        if (j != Long.MAX_VALUE && !this.A01.A0A(A0N, nanoTime, j)) {
            return false;
        }
        this.A08.A04.A0J(abstractC1775Qg, i);
        this.A01.A05(abstractC1775Qg.A0N(), this.A08.getNanoTime() - nanoTime);
        A09(abstractC1775Qg);
        if (this.A08.A0s.A07()) {
            abstractC1775Qg.A04 = i2;
            return true;
        }
        return true;
    }

    public final int A0E() {
        return this.A05.size();
    }

    public final View A0F(int i) {
        return this.A05.get(i).A0H;
    }

    public final View A0G(int i) {
        return A00(i, false);
    }

    public final QV A0H() {
        if (this.A01 == null) {
            this.A01 = new QV();
        }
        return this.A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x0242, code lost:
    
        if (r6 == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0244, code lost:
    
        r5 = (com.facebook.ads.redexgen.core.QP) r22.A08.generateLayoutParams(r5);
        r11.A0H.setLayoutParams(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0261, code lost:
    
        r5 = (com.facebook.ads.redexgen.core.QP) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x025e, code lost:
    
        if (r6 == false) goto L98;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.ads.redexgen.core.AbstractC1775Qg A0I(int r23, boolean r24, long r25) {
        /*
            Method dump skipped, instructions count: 730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.QW.A0I(int, boolean, long):com.facebook.ads.redexgen.X.Qg");
    }

    public final List<AbstractC1775Qg> A0J() {
        return this.A07;
    }

    public final void A0K() {
        int size = this.A06.size();
        for (int i = 0; i < size; i++) {
            this.A06.get(i).A0S();
        }
        int i2 = this.A05.size();
        for (int scrapCount = 0; scrapCount < i2; scrapCount++) {
            this.A05.get(scrapCount).A0S();
        }
        if (this.A02 != null) {
            int changedScrapCount = this.A02.size();
            for (int scrapCount2 = 0; scrapCount2 < changedScrapCount; scrapCount2++) {
                this.A02.get(scrapCount2).A0S();
            }
        }
    }

    public final void A0L() {
        this.A05.clear();
        if (this.A02 != null) {
            this.A02.clear();
        }
    }

    public final void A0M() {
        int size = this.A06.size();
        for (int i = 0; i < size; i++) {
            QP qp = (QP) this.A06.get(i).A0H.getLayoutParams();
            if (qp != null) {
                qp.A01 = true;
            }
        }
    }

    public final void A0N() {
        if (this.A08.A04 != null && this.A08.A04.A0M()) {
            int size = this.A06.size();
            for (int i = 0; i < size; i++) {
                AbstractC1775Qg abstractC1775Qg = this.A06.get(i);
                if (abstractC1775Qg != null) {
                    abstractC1775Qg.A0Z(6);
                    abstractC1775Qg.A0c(null);
                }
            }
            return;
        }
        A06();
    }

    public final void A0O() {
        int i = this.A08.A06 != null ? this.A08.A06.A00 : 0;
        int extraCache = this.A03;
        this.A00 = extraCache + i;
        int extraCache2 = this.A06.size();
        for (int i2 = extraCache2 - 1; i2 >= 0; i2--) {
            int size = this.A06.size();
            int i3 = this.A00;
            String[] strArr = A0A;
            String str = strArr[5];
            String str2 = strArr[3];
            int i4 = str.charAt(9);
            int extraCache3 = str2.charAt(9);
            if (i4 != extraCache3) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[5] = "FM5srU9o6TBj8QlSYYqmaX9MZyJMPTMr";
            strArr2[3] = "mnADOFh1HT7Eu0tfTP5EsiAEmob0QgOc";
            if (size > i3) {
                A07(i2);
            } else {
                return;
            }
        }
    }

    public final void A0P() {
        this.A05.clear();
        A06();
    }

    public final void A0Q(int i) {
        this.A03 = i;
        A0O();
    }

    public final void A0R(View view) {
        AbstractC1775Qg A0F = C12756g.A0F(view);
        A0F.A0F = null;
        A0F.A0G = false;
        A0F.A0U();
        A0X(A0F);
    }

    public final void A0S(View view) {
        AbstractC1775Qg A0F = C12756g.A0F(view);
        if (A0F.A0o(12) || !A0F.A0j() || this.A08.A1y(A0F)) {
            if (!A0F.A0f() || A0F.A0g() || this.A08.A04.A0M()) {
                A0F.A0b(this, false);
                this.A05.add(A0F);
                return;
            }
            throw new IllegalArgumentException(A04(43, 122, 48) + this.A08.A1J());
        }
        if (this.A02 == null) {
            this.A02 = new ArrayList<>();
        }
        A0F.A0b(this, true);
        this.A02.add(A0F);
    }

    public final void A0T(View view) {
        AbstractC1775Qg A0F = C12756g.A0F(view);
        if (A0F.A0i()) {
            this.A08.removeDetachedView(view, false);
        }
        if (A0F.A0h()) {
            A0F.A0Y();
        } else if (A0F.A0m()) {
            A0F.A0U();
        }
        A0X(A0F);
    }

    public final void A0U(QC qc, QC qc2, boolean z) {
        A0P();
        A0H().A08(qc, qc2, z);
    }

    public final void A0V(QV qv) {
        if (this.A01 != null) {
            this.A01.A04();
        }
        this.A01 = qv;
        if (qv != null) {
            QV qv2 = this.A01;
            QC adapter = this.A08.getAdapter();
            String[] strArr = A0A;
            if (strArr[2].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[4] = "lsZK0accpgBQgJYjkQv5Abfcayw6pcR0";
            strArr2[1] = "Z7g3Rn3k4gV3vNYe90sCMa52PcoBzFf1";
            qv2.A07(adapter);
        }
    }

    public final void A0W(AbstractC1773Qe abstractC1773Qe) {
        this.A04 = abstractC1773Qe;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00aa, code lost:
    
        if (r0 != false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0X(com.facebook.ads.redexgen.core.AbstractC1775Qg r9) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.QW.A0X(com.facebook.ads.redexgen.X.Qg):void");
    }

    public final void A0Y(AbstractC1775Qg abstractC1775Qg) {
        boolean z;
        z = abstractC1775Qg.A0G;
        if (z) {
            ArrayList<AbstractC1775Qg> arrayList = this.A02;
            String[] strArr = A0A;
            if (strArr[7].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[2] = "g9dUUHlnr2dNWy2bvXbXpUnxFV";
            strArr2[6] = "1VljHDZyW4yQ7QRXruVc6WBcEp";
            arrayList.remove(abstractC1775Qg);
        } else {
            this.A05.remove(abstractC1775Qg);
        }
        abstractC1775Qg.A0F = null;
        abstractC1775Qg.A0G = false;
        abstractC1775Qg.A0U();
    }

    public final void A0Z(AbstractC1775Qg abstractC1775Qg, boolean z) {
        C12756g.A0s(abstractC1775Qg);
        if (abstractC1775Qg.A0o(16384)) {
            abstractC1775Qg.A0a(0, 16384);
            P3.A0B(abstractC1775Qg.A0H, null);
        }
        if (z) {
            A0B(abstractC1775Qg);
        }
        abstractC1775Qg.A08 = null;
        A0H().A09(abstractC1775Qg);
    }
}
