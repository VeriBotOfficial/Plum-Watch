package com.facebook.ads.redexgen.core;

import com.wakeup.common.DeviceFeatures;
import io.agora.rtc2.Constants;
import java.io.Serializable;
import java.util.Arrays;
import org.json.JSONObject;
import org.opencv.videoio.Videoio;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.Mp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1682Mp implements Serializable {
    public static byte[] A0C = null;
    public static final long serialVersionUID = 85021702336014823L;
    public C1684Mr A00;
    public long A01;
    public C1685Ms A02;
    public C1689Mw A03;
    public C1692Mz A04;
    public N0 A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;

    static {
        A04();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 17 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static C1682Mp A00(JSONObject jSONObject) {
        C1682Mp c1682Mp = new C1682Mp();
        JSONObject optJSONObject = jSONObject.optJSONObject(A01(374, 12, 28));
        c1682Mp.A08(new C1688Mv().A0X(jSONObject.optString(A01(760, 5, 83))).A0W(jSONObject.optString(A01(752, 8, 21))).A0L(jSONObject.optString(A01(136, 4, 53))).A0V(jSONObject.optString(A01(738, 14, 29))).A0T(jSONObject.optString(A01(Videoio.CAP_PROP_XI_TEST_PATTERN, 12, 41))).A0Q(jSONObject.optString(A01(548, 12, 11))).A0I(jSONObject.optString(A01(128, 8, 59))).A0N(jSONObject.optString(A01(219, 14, 8))).A0H(jSONObject.optString(A01(93, 16, 119))).A0J(jSONObject.optString(A01(165, 8, 12))).A0M(jSONObject.optString(A01(202, 17, 56))).A0S(A03(optJSONObject, A01(577, 11, 23), A01(76, 6, 46))).A0O(A03(optJSONObject, A01(233, 19, 111), A01(8, 9, 99))).A0U(A03(optJSONObject, A01(692, 9, 10), A01(89, 4, 30))).A0K(A03(optJSONObject, A01(DeviceFeatures.E_BOOK, 13, 28), A01(0, 8, 55))).A0R(A03(optJSONObject, A01(Videoio.CAP_PROP_XI_HDR_KNEEPOINT_COUNT, 17, 54), A01(82, 7, 30))).A0P(A03(optJSONObject, A01(347, 27, 29), A01(17, 22, 63))).A0Y());
        c1682Mp.A0B(jSONObject.optString(A01(Videoio.CAP_PROP_XI_LUT_EN, 7, 75)));
        c1682Mp.A09(new C1692Mz(jSONObject.optString(A01(335, 12, 95)), jSONObject.optString(A01(151, 14, 95)), jSONObject.optJSONObject(A01(140, 11, 25)), jSONObject.optString(A02(jSONObject))));
        String A01 = A01(765, 19, 26);
        C1684Mr A0K = new C1684Mr().A0L(jSONObject.optString(A01(851, 9, 107))).A0J(jSONObject.optLong(A01(827, 24, 105), -1L)).A0F(jSONObject.optInt(A01, -1) == -1 ? jSONObject.optInt(A01(Constants.AUDIO_MIXING_REASON_ONE_LOOP_COMPLETED, 17, 61), -1) : jSONObject.optInt(A01, -1)).A0E(jSONObject.optInt(A01(620, 18, 101), Integer.MAX_VALUE)).A0D(jSONObject.optInt(A01(600, 20, 106), -1)).A0K(NB.A01(jSONObject));
        JSONObject optJSONObject2 = jSONObject.optJSONObject(A01(392, 5, 82));
        if (optJSONObject2 != null) {
            A0K.A0M(optJSONObject2.optString(A01(784, 3, 94))).A0I(optJSONObject2.optInt(A01(860, 5, 121))).A0H(optJSONObject2.optInt(A01(386, 6, 11)));
        }
        c1682Mp.A06(A0K);
        c1682Mp.A0F(jSONObject.optBoolean(A01(671, 21, 31)));
        c1682Mp.A0A(new N0(AbstractC1937Wr.A04(jSONObject.optJSONArray(A01(320, 15, 66))), jSONObject.optLong(A01(252, 24, 44), 0L), jSONObject.optLong(A01(276, 44, 57), 0L), jSONObject.optBoolean(A01(Videoio.CAP_PROP_XI_GAMMAY, 26, 46)), jSONObject.optBoolean(A01(397, 31, 29), false), jSONObject.optBoolean(A01(Videoio.CAP_PROP_XI_BINNING_VERTICAL, 34, 46), false)));
        c1682Mp.A0C(jSONObject.optBoolean(A01(522, 19, 27)));
        c1682Mp.A05(jSONObject.optLong(A01(109, 19, 72), 0L));
        return c1682Mp;
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 25);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0C = new byte[]{BuiltinOptions.HashtableImportOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.RangeOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.IfOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.LogicalAndOptions, 21, 13, 20, 22, 21, 27, 30, 9, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.CosOptions, BuiltinOptions.RangeOptions, BuiltinOptions.LeakyReluOptions, 6, BuiltinOptions.ScatterNdOptions, BuiltinOptions.RangeOptions, BuiltinOptions.RangeOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.ZerosLikeOptions, 6, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.NonMaxSuppressionV4Options, 6, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.AddNOptions, BuiltinOptions.RangeOptions, BuiltinOptions.CosOptions, BuiltinOptions.ZerosLikeOptions, 19, BuiltinOptions.LessEqualOptions, BuiltinOptions.ATan2Options, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.TileOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ATan2Options, BuiltinOptions.PackOptions, BuiltinOptions.SelectOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.EqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PackOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.TileOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.PackOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.NotEqualOptions, 35, BuiltinOptions.ATan2Options, BuiltinOptions.EqualOptions, BuiltinOptions.NegOptions, 63, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.ATan2Options, BuiltinOptions.TileOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.ATan2Options, 1, BuiltinOptions.LessOptions, 63, BuiltinOptions.ArgMinOptions, BuiltinOptions.LessOptions, 7, BuiltinOptions.LessOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.RankOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.WhereOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.AssignVariableOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.ReadVariableOptions, BuiltinOptions.GeluOptions, BuiltinOptions.CosOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.SelectV2Options, 15, 10, BuiltinOptions.TransposeConvOptions, 13, 28, 11, 15, 26, 7, 24, 11, BuiltinOptions.TransposeConvOptions, 26, 23, 30, 11, BuiltinOptions.SliceOptions, BuiltinOptions.EqualOptions, 14, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.PowOptions, BuiltinOptions.EqualOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.LogicalAndOptions, 14, 61, BuiltinOptions.LogicalAndOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.ExpOptions, 14, BuiltinOptions.CastOptions, BuiltinOptions.PowOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.ExpandDimsOptions, 34, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.AddNOptions, BuiltinOptions.AddNOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.LeakyReluOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.AbsOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.WhereOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.GeluOptions, BuiltinOptions.GeluOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.Rfft2dOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.CastOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.NegOptions, BuiltinOptions.NegOptions, 25, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.LessOptions, 25, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.CastOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.SelectOptions, BuiltinOptions.LessOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.GeluOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.RandomOptions, BuiltinOptions.ATan2Options, BuiltinOptions.CallOnceOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.SelectV2Options, BuiltinOptions.Conv3DOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.AssignVariableOptions, 30, 31, 22, 27, 3, BuiltinOptions.CastOptions, 25, 22, 19, 25, 17, BuiltinOptions.CastOptions, 14, 31, 2, 14, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.FillOptions, BuiltinOptions.AddNOptions, BuiltinOptions.WhereOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.SplitVOptions, 64, BuiltinOptions.WhereOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.AbsOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.WhereOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.WhereOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.FillOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.CumsumOptions, Byte.MAX_VALUE, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.AbsOptions, BuiltinOptions.RandomOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.SegmentSumOptions, Byte.MAX_VALUE, BuiltinOptions.BatchMatMulOptions, 18, 25, 1, 24, 26, 25, 23, 18, BuiltinOptions.LessOptions, 21, 25, 3, 24, 2, BuiltinOptions.LessOptions, 2, 19, 14, 2, BuiltinOptions.UniqueOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.Conv3DOptions, BuiltinOptions.RankOptions, BuiltinOptions.CosOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.Conv3DOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.RankOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.IfOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.SquareOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.IfOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.AbsOptions, BuiltinOptions.FillOptions, Byte.MAX_VALUE, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.AddNOptions, BuiltinOptions.FillOptions, Byte.MAX_VALUE, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.AddNOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, Byte.MAX_VALUE, BuiltinOptions.RankOptions, BuiltinOptions.RangeOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.ReverseSequenceOptions, Byte.MAX_VALUE, BuiltinOptions.CosOptions, BuiltinOptions.RangeOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, Byte.MAX_VALUE, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.AddNOptions, Byte.MAX_VALUE, BuiltinOptions.GatherNdOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.AbsOptions, BuiltinOptions.FillOptions, Byte.MAX_VALUE, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.AbsOptions, BuiltinOptions.FillOptions, Byte.MAX_VALUE, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.AddNOptions, BuiltinOptions.FillOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.EqualOptions, 63, 4, BuiltinOptions.PowOptions, 58, BuiltinOptions.LessOptions, 63, 4, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.NotEqualOptions, 58, BuiltinOptions.LogicalOrOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.ArgMaxOptions, 32, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.MaximumMinimumOptions, 34, 25, BuiltinOptions.CastOptions, BuiltinOptions.LessOptions, BuiltinOptions.PadV2Options, BuiltinOptions.PadV2Options, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.ArgMaxOptions, 34, BuiltinOptions.SelectV2Options, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.GeluOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.HashtableOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.ATan2Options, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.SignOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.ATan2Options, BuiltinOptions.CumsumOptions, 34, BuiltinOptions.DequantizeOptions, BuiltinOptions.NegOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.HardSwishOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.HardSwishOptions, BuiltinOptions.RandomOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.ScatterNdOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.FillOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.CosOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.AddNOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.CosOptions, BuiltinOptions.RankOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.FloorDivOptions, 5, BuiltinOptions.BroadcastToOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.AddNOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.AddNOptions, BuiltinOptions.FillOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.AddNOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.RankOptions, BuiltinOptions.WhereOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.AddNOptions, BuiltinOptions.GatherNdOptions, 63, BuiltinOptions.CastOptions, 9, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.TileOptions, BuiltinOptions.ExpOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, BuiltinOptions.SparseToDenseOptions, 9, BuiltinOptions.ShapeOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.FillOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.FillOptions, BuiltinOptions.AddNOptions, BuiltinOptions.CosOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.AddNOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.CosOptions, BuiltinOptions.RankOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.AddNOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.RankOptions, BuiltinOptions.WhereOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.AddNOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.PackOptions, BuiltinOptions.ExpOptions, 13, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.PackOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ShapeOptions, 61, 13, BuiltinOptions.TileOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.PackOptions, 61, 13, 63, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.WhileOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.WhileOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.WhileOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.ReadVariableOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.CallOnceOptions, 34, BuiltinOptions.TileOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.TileOptions, BuiltinOptions.EqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.BucketizeOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.SignOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.WhileOptions, BuiltinOptions.AbsOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.SquaredDifferenceOptions, 64, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.ATan2Options, BuiltinOptions.CallOnceOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.Rfft2dOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.ATan2Options, BuiltinOptions.HashtableOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.ATan2Options, BuiltinOptions.SquareOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.FillOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.IfOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.WhereOptions, 0, 22, 16, 28, 29, 23, 0, BuiltinOptions.GreaterOptions, 21, 28, 1, BuiltinOptions.GreaterOptions, 29, 22, 11, 7, BuiltinOptions.GreaterOptions, 16, 7, 18, 15, 25, 31, 19, 18, 24, 15, 35, 26, 19, 14, 35, 14, 25, 11, 29, 14, 24, 6, 29, 26, 2, BuiltinOptions.NegOptions, 16, 27, 17, BuiltinOptions.NegOptions, 22, 20, 7, 17, 34, BuiltinOptions.ArgMinOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.DequantizeOptions, 14, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.LessOptions, BuiltinOptions.PowOptions, BuiltinOptions.CastOptions, 14, BuiltinOptions.CastOptions, 35, BuiltinOptions.SliceOptions, 63, 34, BuiltinOptions.PowOptions, BuiltinOptions.CastOptions, BuiltinOptions.PowOptions, BuiltinOptions.LogicalAndOptions, 63, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.RandomOptions, BuiltinOptions.GeluOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.RandomOptions, BuiltinOptions.GeluOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.RandomOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.ATan2Options, BuiltinOptions.Rfft2dOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.CallOnceOptions, 20, 12, 14, 23, BuiltinOptions.PowOptions, 6, 9, 3, BuiltinOptions.PowOptions, 11, 8, 20, 2, BuiltinOptions.PowOptions, 21, 2, 16, 6, 21, 3, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.CosOptions, BuiltinOptions.CosOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.SignOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.ResizeNearestNeighborOptions, 64, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.ReadVariableOptions, Byte.MAX_VALUE, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.Rfft2dOptions, BuiltinOptions.LogicalAndOptions, 35, BuiltinOptions.LogicalAndOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.SelectOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.ScatterNdOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.IfOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.HashtableFindOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.EqualOptions, BuiltinOptions.PadV2Options, BuiltinOptions.SelectOptions, BuiltinOptions.SliceOptions, 61, BuiltinOptions.LogicalOrOptions, BuiltinOptions.NotEqualOptions, 6, BuiltinOptions.PowOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.LessOptions, BuiltinOptions.EqualOptions, BuiltinOptions.PowOptions, 32, 6, BuiltinOptions.LogicalOrOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PowOptions, BuiltinOptions.PackOptions, BuiltinOptions.EqualOptions, BuiltinOptions.LogicalOrOptions, 61, 13, 18, 31, 30, 20, BuiltinOptions.LogSoftmaxOptions, 31, 14, 9, 26, 15, 18, 20, 21, BuiltinOptions.LogSoftmaxOptions, 8, 30, 24, 6, 25, 20, 21, 31, BuiltinOptions.SelectOptions, 0, 2, 21, 28, 31, 17, 20, BuiltinOptions.SelectOptions, 3, 25, 10, 21, BuiltinOptions.SelectOptions, 18, 9, 4, 21, 3, 4, 27, 22, 23, 29, BuiltinOptions.GreaterEqualOptions, 7, 0, 30, 23, 9, 4, 20, 8};
    }

    public static String A02(JSONObject jSONObject) {
        String A01 = A01(DeviceFeatures.CONFIG_SLEEP, 16, 99);
        String A012 = A01(39, 37, 67);
        String optString = jSONObject.optString(A01, A012);
        if (optString.equals(A012)) {
            JSONObject optJSONObject = jSONObject.optJSONObject(A01(374, 12, 28));
            if (optJSONObject != null) {
                A012 = optJSONObject.optString(A01, A012);
            }
            return A012;
        }
        return optString;
    }

    public static String A03(JSONObject jSONObject, String str, String str2) {
        return jSONObject != null ? jSONObject.optString(str, str2) : str2;
    }

    private final void A05(long j) {
        this.A01 = Math.max(0L, j);
    }

    private void A06(C1684Mr c1684Mr) {
        this.A00 = c1684Mr;
    }

    private final void A07(C1685Ms c1685Ms) {
        this.A02 = c1685Ms;
    }

    private final void A08(C1689Mw c1689Mw) {
        this.A03 = c1689Mw;
    }

    private final void A09(C1692Mz c1692Mz) {
        this.A04 = c1692Mz;
    }

    private final void A0A(N0 n0) {
        this.A05 = n0;
    }

    private final void A0B(String str) {
        this.A06 = str;
    }

    private final void A0C(boolean z) {
        this.A08 = z;
    }

    private final void A0D(boolean z) {
        this.A09 = z;
    }

    private final void A0E(boolean z) {
        this.A0A = z;
    }

    private final void A0F(boolean z) {
        this.A0B = z;
    }

    public final long A0G() {
        return this.A01;
    }

    public final C1685Ms A0H() {
        return this.A02;
    }

    public final C1689Mw A0I() {
        return this.A03;
    }

    public final C1692Mz A0J() {
        return this.A04;
    }

    public final N0 A0K() {
        return this.A05;
    }

    public final String A0L() {
        return this.A06;
    }

    public final void A0M(int i) {
        this.A00.A0D(i);
        A07(this.A00.A0Q());
    }

    public final void A0N(JSONObject jSONObject) {
        A07(this.A00.A0Q());
    }

    public final void A0O(JSONObject jSONObject) {
        this.A00.A0O(jSONObject.optBoolean(A01(787, 22, 64)));
        this.A00.A0N(jSONObject.optBoolean(A01(502, 20, 75), true));
        A07(this.A00.A0Q());
        A0R(jSONObject.optBoolean(A01(Videoio.CAP_PROP_XI_IMAGE_DATA_BIT_DEPTH, 14, 79)));
        A0D(jSONObject.optBoolean(A01(638, 13, 108)));
        A0E(jSONObject.optBoolean(A01(651, 20, 72)));
    }

    public final void A0P(JSONObject jSONObject) {
        this.A00.A0N(jSONObject.optBoolean(A01(502, 20, 75), true));
        A07(this.A00.A0Q());
    }

    public final void A0Q(JSONObject jSONObject) {
        this.A00.A0G(jSONObject.optInt(A01(809, 18, 98)));
        this.A00.A0N(jSONObject.optBoolean(A01(502, 20, 75), true));
        this.A00.A0P(jSONObject.optBoolean(A01(701, 20, 126), false));
        A07(this.A00.A0Q());
        A0D(jSONObject.optBoolean(A01(638, 13, 108)));
    }

    public final void A0R(boolean z) {
        this.A07 = z;
    }

    public final boolean A0S() {
        return this.A07;
    }

    public final boolean A0T() {
        return this.A08;
    }

    public final boolean A0U() {
        return this.A01 > 0;
    }

    public final boolean A0V() {
        return this.A09;
    }

    public final boolean A0W() {
        return this.A0B;
    }
}
