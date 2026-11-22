package com.facebook.ads.redexgen.core;

import com.wakeup.common.DeviceFeatures;
import java.io.Serializable;
import java.util.Arrays;
import java.util.UUID;
import org.json.JSONObject;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public final class NB implements Serializable {
    public static byte[] A0J = null;
    public static final NC A0K;
    public static final EnumC2017Zt A0L;
    public static final long serialVersionUID = -5352540123250859603L;
    public int A00;
    public String A01;
    public String A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final int A07;
    public final int A08;
    public final NC A09;
    public final EnumC2017Zt A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0J, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 55);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A0J = new byte[]{BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.DensifyOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.SelectOptions, BuiltinOptions.IfOptions, BuiltinOptions.SignOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.SelectOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.SelectOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.ATan2Options, BuiltinOptions.SignOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.SelectV2Options, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.SignOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.SelectOptions, BuiltinOptions.NonMaxSuppressionV5Options, Byte.MAX_VALUE, BuiltinOptions.Conv3DOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.SelectOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.SelectOptions, BuiltinOptions.CosOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.AddNOptions, BuiltinOptions.BitcastOptions, 34, 30, 19, 11, 19, 16, 30, 23, BuiltinOptions.AddNOptions, 19, 22, BuiltinOptions.QuantizeOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.PadV2Options, BuiltinOptions.HardSwishOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.RandomOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.PackOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.DequantizeOptions, 13, BuiltinOptions.DequantizeOptions, 61, BuiltinOptions.ArgMinOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.LogicalOrOptions, 28, 11, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.AddNOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.WhileOptions, BuiltinOptions.AddNOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.WhileOptions, BuiltinOptions.WhereOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.SignOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.ATan2Options, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.BitwiseXorOptions, 20, 31, 16, 19, 29, 20, BuiltinOptions.LessEqualOptions, 24, 31, 5, 3, 30, BuiltinOptions.LessEqualOptions, 18, 16, 3, 21, BuiltinOptions.PowOptions, 58, BuiltinOptions.TransposeConvOptions, 58, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.LogicalOrOptions, 0, BuiltinOptions.PadV2Options, 58, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.PadV2Options, 4, 3, 30, 25, 12, 3, 14, 8, BuiltinOptions.SparseToDenseOptions, 4, 9, 23, 16, 10, 12, 17, BuiltinOptions.ExpOptions, 29, 31, 12, 26, BuiltinOptions.ExpOptions, 23, 29, 17, 16, BuiltinOptions.ExpOptions, 11, 12, 18, BuiltinOptions.SquareOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.GeluOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.AddNOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.RangeOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.AbsOptions, BuiltinOptions.GeluOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.AbsOptions, BuiltinOptions.GeluOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.FillOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.SquareOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.GeluOptions, BuiltinOptions.AbsOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.RangeOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.AbsOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.WhileOptions, BuiltinOptions.RandomOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.SignOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.WhileOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.WhileOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.ATan2Options, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.RandomOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.ATan2Options, BuiltinOptions.BitcastOptions, BuiltinOptions.BitwiseXorOptions, 14, 18, 31, 7, BuiltinOptions.UniqueOptions, 25, 17, 17, 25, 18, 27, BuiltinOptions.UniqueOptions, 29, 17, 19, BuiltinOptions.WhileOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.CosOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.RandomOptions, BuiltinOptions.RangeOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.SignOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.ATan2Options, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.ATan2Options, BuiltinOptions.IfOptions, 64, BuiltinOptions.MirrorPadOptions, BuiltinOptions.WhereOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.AbsOptions, 64, BuiltinOptions.RangeOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.SquareOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.RangeOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.SplitVOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.SquareOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.SquareOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.FillOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.SquareOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.SignOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.CallOnceOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.RankOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.HashtableImportOptions, 21, 2, 16, 6, 21, 3, 2, 3, BuiltinOptions.PowOptions, 23, 11, 6, 30, BuiltinOptions.PowOptions, 19, 2, 31, 19, BuiltinOptions.SliceOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.NegOptions, BuiltinOptions.TileOptions, BuiltinOptions.TileOptions, 34, BuiltinOptions.ExpOptions, BuiltinOptions.SelectOptions, BuiltinOptions.DequantizeOptions, 28, BuiltinOptions.SliceOptions, BuiltinOptions.DequantizeOptions, 32, BuiltinOptions.GreaterOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.SliceOptions, BuiltinOptions.SelectOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.LessOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.TileOptions, BuiltinOptions.NegOptions, BuiltinOptions.NegOptions, BuiltinOptions.PackOptions, BuiltinOptions.PowOptions, BuiltinOptions.NotEqualOptions, 63, 5, BuiltinOptions.LessOptions, 63, BuiltinOptions.ArgMinOptions, BuiltinOptions.EqualOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.LessOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.EqualOptions, BuiltinOptions.LessEqualOptions, 32, 63, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, BuiltinOptions.ArgMinOptions, 9, 58, BuiltinOptions.TileOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.SparseToDenseOptions, 63, BuiltinOptions.PowOptions, BuiltinOptions.TransposeConvOptions, 9, BuiltinOptions.DequantizeOptions, 58, BuiltinOptions.ShapeOptions, BuiltinOptions.SelectOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.ExpandDimsOptions, 58, BuiltinOptions.TileOptions, 9, BuiltinOptions.TileOptions, BuiltinOptions.PowOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.ExpandDimsOptions, 58, BuiltinOptions.TileOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.WhereOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.SquareOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.FillOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.SquareOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.SquareOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.RankOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.SquareOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.AbsOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.SquareOptions, BuiltinOptions.ResizeNearestNeighborOptions, 64, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.SquareOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.IfOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.SquaredDifferenceOptions, 64, BuiltinOptions.FloorDivOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.IfOptions};
    }

    static {
        A06();
        A0L = EnumC2017Zt.A04;
        A0K = NC.A03;
    }

    public NB(String str, String str2, int i, String str3, String str4, EnumC2017Zt enumC2017Zt, int i2, boolean z, boolean z2, NC nc, boolean z3, String str5, boolean z4, boolean z5, int i3, String str6, String str7, boolean z6) {
        if (z3) {
            this.A0E = UUID.randomUUID().toString();
            this.A0D = WQ.A00(str).buildUpon().appendQueryParameter(A03(143, 11, 90), this.A0E).appendQueryParameter(A03(69, 12, 101), str5).build().toString();
        } else {
            this.A0D = str;
            this.A0E = null;
        }
        this.A0C = str2;
        this.A07 = i;
        this.A0F = str3;
        this.A0B = str4;
        this.A0A = enumC2017Zt;
        this.A08 = i2;
        this.A0H = z;
        this.A0G = z2;
        this.A09 = nc;
        this.A0I = z3;
        this.A06 = z4;
        this.A05 = z5;
        this.A00 = i3;
        this.A03 = str6;
        this.A02 = str7;
        this.A04 = z6;
    }

    public static int A00(JSONObject jSONObject) {
        String A03 = A03(374, 17, 116);
        if (jSONObject.has(A03)) {
            return jSONObject.optInt(A03);
        }
        return jSONObject.optInt(A03(391, 19, 109), 0);
    }

    public static NB A01(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A03(255, 13, 26));
        if (optJSONObject == null) {
            return null;
        }
        NC A00 = NC.A00(optJSONObject.optString(A03(339, 17, 62), A0K.name()));
        String precachingMethodStr = A03(413, 30, 97);
        boolean optBoolean = optJSONObject.optBoolean(precachingMethodStr, false);
        String precachingMethodStr2 = A03(410, 3, 112);
        String optString = optJSONObject.optString(precachingMethodStr2);
        String precachingMethodStr3 = A03(154, 19, 73);
        String optString2 = optJSONObject.optString(precachingMethodStr3);
        int A002 = A00(jSONObject);
        String A05 = A05(optJSONObject);
        String A04 = A04(optJSONObject);
        EnumC2017Zt A02 = A02(optJSONObject);
        int optInt = optJSONObject.optInt(A03(482, 32, 24), 5000);
        boolean z = !optBoolean && optJSONObject.optBoolean(A03(114, 17, 70), true);
        String precachingMethodStr4 = A03(99, 15, 46);
        boolean optBoolean2 = optJSONObject.optBoolean(precachingMethodStr4);
        String precachingMethodStr5 = A03(204, 25, 53);
        boolean optBoolean3 = optJSONObject.optBoolean(precachingMethodStr5);
        String precachingMethodStr6 = A03(81, 2, 72);
        String optString3 = jSONObject.optString(precachingMethodStr6);
        String precachingMethodStr7 = A03(314, 25, 20);
        boolean optBoolean4 = optJSONObject.optBoolean(precachingMethodStr7, false);
        String precachingMethodStr8 = A03(443, 39, 20);
        int optInt2 = optJSONObject.optInt(precachingMethodStr8, 5);
        String optString4 = jSONObject.optString(A03(290, 24, 27), A03(45, 11, 69));
        String optString5 = jSONObject.optString(A03(268, 22, 46), A03(240, 15, 73));
        String precachingMethodStr9 = A03(DeviceFeatures.E_BOOK, 31, 28);
        return new NB(optString, optString2, A002, A05, A04, A02, optInt, z, optBoolean2, A00, optBoolean3, optString3, optBoolean, optBoolean4, optInt2, optString4, optString5, optJSONObject.optBoolean(precachingMethodStr9, false));
    }

    public static EnumC2017Zt A02(JSONObject jSONObject) {
        int orientation = jSONObject.optInt(A03(229, 11, 36), A0L.A04());
        return EnumC2017Zt.A00(orientation);
    }

    public static String A04(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A03(131, 12, 104));
        String A03 = A03(0, 45, 56);
        return optJSONObject == null ? A03 : optJSONObject.optString(A03(83, 16, 9), A03);
    }

    public static String A05(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A03(131, 12, 104));
        String A03 = A03(56, 13, 60);
        return optJSONObject == null ? A03 : optJSONObject.optString(A03(356, 18, 80), A03);
    }

    public final int A07() {
        return this.A07;
    }

    public final int A08() {
        return this.A00;
    }

    public final int A09() {
        return this.A08;
    }

    public final NC A0A() {
        return this.A09;
    }

    public final EnumC2017Zt A0B() {
        return this.A0A;
    }

    public final String A0C() {
        return this.A01;
    }

    public final String A0D() {
        return this.A0B;
    }

    public final String A0E() {
        return this.A0C;
    }

    public final String A0F() {
        return this.A0D;
    }

    public final String A0G() {
        return this.A02;
    }

    public final String A0H() {
        return this.A03;
    }

    public final String A0I() {
        return this.A0E;
    }

    public final String A0J() {
        return this.A0F;
    }

    public final void A0K(String str) {
        this.A01 = str;
    }

    public final boolean A0L() {
        return this.A0H;
    }

    public final boolean A0M() {
        return this.A04;
    }

    public final boolean A0N() {
        return this.A05;
    }

    public final boolean A0O() {
        return this.A0I;
    }

    public final boolean A0P() {
        return this.A06;
    }
}
