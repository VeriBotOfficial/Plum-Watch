package com.facebook.ads.redexgen.core;

import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import java.util.Arrays;
import org.json.JSONObject;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public abstract class NA {
    public static byte[] A00;

    static {
        A0C();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 121);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A00 = new byte[]{-8, BuiltinOptions.ExpOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.ArgMaxOptions, 26, TransmissionUnpacked.HD_VAL_MAGIC_LB, -10, 25, 15, BuiltinOptions.PackOptions, 58, 64, BuiltinOptions.EqualOptions, 58, BuiltinOptions.FloorDivOptions, BuiltinOptions.TransposeConvOptions, -20, 35, BuiltinOptions.GreaterEqualOptions, 64, BuiltinOptions.SelectOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.EqualOptions, 58, BuiltinOptions.TileOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.SegmentSumOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.HardSwishOptions, 22, BuiltinOptions.HashtableImportOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.SegmentSumOptions, BuiltinOptions.WhileOptions, 22, BuiltinOptions.Conv3DOptions, BuiltinOptions.BatchMatMulOptions, 22, BuiltinOptions.BroadcastToOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.HashtableFindOptions, BuiltinOptions.HardSwishOptions, 22, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.SegmentSumOptions, 22, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.SegmentSumOptions, 35, BuiltinOptions.WhileOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.HardSwishOptions, 22, BuiltinOptions.BroadcastToOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.MatrixSetDiagOptions, 1, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.TileOptions, 35, -34, BuiltinOptions.EqualOptions, 31, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.ExpOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.CastOptions, -34, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.GreaterEqualOptions, -34, BuiltinOptions.SliceOptions, 35, BuiltinOptions.ExpOptions, 35, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.ExpandDimsOptions, 35, -34, BuiltinOptions.ArgMinOptions, BuiltinOptions.SelectOptions, BuiltinOptions.TileOptions, 31, BuiltinOptions.GreaterOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PackOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.ExpOptions, BuiltinOptions.TileOptions, BuiltinOptions.SliceOptions, BuiltinOptions.SliceOptions, 35, BuiltinOptions.GreaterOptions, BuiltinOptions.ExpOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PackOptions, 12, BuiltinOptions.GreaterEqualOptions, 34, BuiltinOptions.PadV2Options, BuiltinOptions.DequantizeOptions, BuiltinOptions.PadV2Options, BuiltinOptions.LogSoftmaxOptions, -35, BuiltinOptions.DequantizeOptions, BuiltinOptions.PadV2Options, -35, 24, BuiltinOptions.SliceOptions, 34, 32, BuiltinOptions.SliceOptions, 26, BuiltinOptions.SliceOptions, -28, 5, -6, 3, -2, 3, -4, -75, -2, 3, -61, -61, -61, -50, -31, -13, -35, -18, -32, -100, -27, -22, -100, -41, -17, -31, -33, -17, -39, -17, -38, -14, TransmissionUnpacked.HD_VAL_MAGIC_HB, -9, BuiltinOptions.GreaterOptions, BuiltinOptions.RangeOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.LogicalAndOptions, 61, -9, 11, 10, 5, -7, 2, -1, -7, 1, -11, -1, 4, -11, 14, BuiltinOptions.ArgMaxOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.PackOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.NegOptions, BuiltinOptions.TileOptions, BuiltinOptions.SliceOptions, BuiltinOptions.NegOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.EqualOptions, BuiltinOptions.SliceOptions, BuiltinOptions.EqualOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.CosOptions, BuiltinOptions.WhileOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.SegmentSumOptions, BuiltinOptions.RankOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.AddNOptions, BuiltinOptions.WhereOptions, 31, BuiltinOptions.PadV2Options, BuiltinOptions.NegOptions, BuiltinOptions.SliceOptions, BuiltinOptions.CastOptions, BuiltinOptions.NegOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.ExpOptions, 27, BuiltinOptions.TileOptions, 29, BuiltinOptions.SliceOptions, 31, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.CastOptions, BuiltinOptions.NegOptions, 35, BuiltinOptions.ArgMinOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.FillOptions, BuiltinOptions.ResizeNearestNeighborOptions, 63, BuiltinOptions.FillOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.PackOptions, BuiltinOptions.EqualOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.LogicalAndOptions, 63, BuiltinOptions.FillOptions, 61, BuiltinOptions.EqualOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.EqualOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.PackOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.FloorModOptions, 58, BuiltinOptions.TileOptions, BuiltinOptions.TransposeConvOptions, 58, BuiltinOptions.TransposeConvOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.EqualOptions, BuiltinOptions.SelectOptions, BuiltinOptions.PadV2Options, BuiltinOptions.LogicalAndOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.SliceOptions, 10, 8, 17, 8, 21, 12, 6, 2, 23, 8, 27, 23, BuiltinOptions.UniqueOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.WhereOptions, 63, BuiltinOptions.UniqueOptions, BuiltinOptions.SquareOptions, 61, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.SquaredDifferenceOptions, 61, BuiltinOptions.RankOptions, -7, -15, -17, -10, -15, -18, -19, -20, -15, -19, TransmissionUnpacked.HD_VAL_MAGIC_HB, -29, -30};
    }

    public static N6 A00(JSONObject jSONObject) {
        return new N5().A06(A08(jSONObject)).A07(A07(jSONObject)).A05(A09(jSONObject)).A04(A06(jSONObject)).A08();
    }

    public static NF A01(JSONObject jSONObject) {
        return new NE().A06(A0A(jSONObject)).A07(A0B(jSONObject)).A05(A05(jSONObject)).A04(A04(jSONObject)).A08();
    }

    public static String A03(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A02(279, 12, 42));
        String A02 = A02(172, 9, 96);
        return optJSONObject == null ? A02 : optJSONObject.optString(A02(306, 9, 5), A02);
    }

    public static String A04(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A02(279, 12, 42));
        String A02 = A02(120, 18, 68);
        return optJSONObject == null ? A02 : optJSONObject.optString(A02(181, 14, 29), A02);
    }

    public static String A05(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A02(279, 12, 42));
        String A02 = A02(138, 13, 28);
        return optJSONObject == null ? A02 : optJSONObject.optString(A02(195, 17, 78), A02);
    }

    public static String A06(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A02(279, 12, 42));
        String A02 = A02(0, 8, 60);
        return optJSONObject == null ? A02 : optJSONObject.optString(A02(212, 8, 120), A02);
    }

    public static String A07(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A02(279, 12, 42));
        String A02 = A02(71, 49, 69);
        return optJSONObject == null ? A02 : optJSONObject.optString(A02(237, 28, 93), A02);
    }

    public static String A08(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A02(279, 12, 42));
        String A02 = A02(25, 46, 125);
        return optJSONObject == null ? A02 : optJSONObject.optString(A02(265, 14, 83), A02);
    }

    public static String A09(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A02(279, 12, 42));
        String A02 = A02(8, 17, 83);
        return optJSONObject == null ? A02 : optJSONObject.optString(A02(220, 17, 67), A02);
    }

    public static String A0A(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A02(279, 12, 42));
        String A02 = A02(151, 17, 3);
        return optJSONObject == null ? A02 : optJSONObject.optString(A02(291, 11, 101), A02);
    }

    public static String A0B(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A02(279, 12, 42));
        String A02 = A02(168, 4, 14);
        return optJSONObject == null ? A02 : optJSONObject.optString(A02(302, 4, 13), A02);
    }
}
