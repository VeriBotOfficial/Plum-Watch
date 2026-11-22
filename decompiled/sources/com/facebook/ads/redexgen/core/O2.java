package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.text.TextUtils;
import com.luck.picture.lib.config.Crop;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.commons.net.telnet.TelnetCommand;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.videoio.Videoio;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public final class O2 {
    public static byte[] A01;
    public static String[] A02 = {"pVDJwwImNDAzAU7MVHYB7KJyYkXB8ng6", "xCCCN", "WmAvu667o4AOfXv58a4lhsk2v5Ms6Skb", "l5AJTkPNjTtBLXifXwK6kFeEJ0fMsOcr", "3rlSEGUZnv4yJ13AM8B6pi", "FEUqx4", "USh9ikhtS0UWG5H8nhVral6z3PYi0bQO", "dZN"};
    public static final String[] A03;
    public final O8 A00;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 58);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A01 = new byte[]{BuiltinOptions.Conv3DOptions, 7, BuiltinOptions.PadV2Options, BuiltinOptions.PowOptions, BuiltinOptions.ExpOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.PadV2Options, BuiltinOptions.LessEqualOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.PadV2Options, BuiltinOptions.ArgMinOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.CastOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.SelectOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.ArgMinOptions, 35, BuiltinOptions.LogicalOrOptions, BuiltinOptions.SelectOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.CastOptions, BuiltinOptions.PowOptions, BuiltinOptions.Conv3DOptions, 35, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.PadV2Options, 58, 58, BuiltinOptions.PowOptions, BuiltinOptions.CastOptions, 58, BuiltinOptions.PowOptions, 35, BuiltinOptions.PadV2Options, BuiltinOptions.LogicalAndOptions, BuiltinOptions.SelectOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.MirrorPadOptions, 9, BuiltinOptions.FloorDivOptions, 64, BuiltinOptions.MirrorPadOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, 7, BuiltinOptions.Conv3DOptions, BuiltinOptions.SplitVOptions, 11, BuiltinOptions.QuantizeOptions, BuiltinOptions.AbsOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.FillOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.AbsOptions, BuiltinOptions.SplitVOptions, 5, 18, 63, BuiltinOptions.NotEqualOptions, BuiltinOptions.NegOptions, BuiltinOptions.ATan2Options, BuiltinOptions.SelectOptions, BuiltinOptions.LessOptions, BuiltinOptions.ATan2Options, BuiltinOptions.SelectOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.LogicalAndOptions, 63, BuiltinOptions.ArgMaxOptions, BuiltinOptions.LessOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.PackOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.ATan2Options, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.PackOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.ATan2Options, BuiltinOptions.TileOptions, BuiltinOptions.LessOptions, BuiltinOptions.ATan2Options, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.PackOptions, BuiltinOptions.NegOptions, BuiltinOptions.NegOptions, 63, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.TileOptions, BuiltinOptions.ExpandDimsOptions, 61, BuiltinOptions.GeluOptions, BuiltinOptions.ATan2Options, 13, BuiltinOptions.SparseToDenseOptions, 35, BuiltinOptions.ATan2Options, BuiltinOptions.LogicalAndOptions, BuiltinOptions.EqualOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.ATan2Options, 35, BuiltinOptions.EqualOptions, BuiltinOptions.SelectOptions, BuiltinOptions.ATan2Options, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.PackOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.ATan2Options, BuiltinOptions.LessEqualOptions, BuiltinOptions.EqualOptions, BuiltinOptions.ATan2Options, BuiltinOptions.LessOptions, 63, 63, BuiltinOptions.ATan2Options, BuiltinOptions.LessEqualOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, BuiltinOptions.LessOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.MaximumMinimumOptions, 10, 3, 31, BuiltinOptions.SplitVOptions, 26, 28, BuiltinOptions.SplitVOptions, 26, 1, 11, 10, 29, 28, 27, 14, 1, 11, BuiltinOptions.SplitVOptions, 24, 7, 14, 27, BuiltinOptions.SplitVOptions, 6, 28, BuiltinOptions.SplitVOptions, 7, 14, 31, 31, 10, 1, 6, 1, 8, BuiltinOptions.FloorDivOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.PowOptions, 7, 22, BuiltinOptions.SplitVOptions, 6, 28, BuiltinOptions.SplitVOptions, 27, 7, 6, 28, BuiltinOptions.SplitVOptions, 6, 1, 14, 31, 31, 29, 0, 31, 29, 6, 14, 27, 10, BuiltinOptions.UniqueOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.CastOptions, BuiltinOptions.FillOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.WhereOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.IfOptions, BuiltinOptions.DepthToSpaceOptions, 27, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.NonMaxSuppressionV4Options, 27, BuiltinOptions.LeakyReluOptions, BuiltinOptions.RangeOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.WhileOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.RangeOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.WhereOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.ShapeOptions, Byte.MAX_VALUE, BuiltinOptions.RightShiftOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.RandomOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.SegmentSumOptions, 31, BuiltinOptions.LogicalAndOptions, BuiltinOptions.AssignVariableOptions, 35, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.ExpOptions, BuiltinOptions.LogicalAndOptions, 35, BuiltinOptions.CastOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.SliceOptions, BuiltinOptions.EqualOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.ExpOptions, BuiltinOptions.CastOptions, BuiltinOptions.PowOptions, BuiltinOptions.LogicalAndOptions, 63, 34, BuiltinOptions.MirrorPadOptions, BuiltinOptions.ATan2Options, BuiltinOptions.VarHandleOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.HashtableOptions, 63, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.SignOptions, BuiltinOptions.RangeOptions, Byte.MAX_VALUE, Byte.MAX_VALUE, 58, BuiltinOptions.BitcastOptions, Byte.MAX_VALUE, BuiltinOptions.HashtableImportOptions, Byte.MAX_VALUE, BuiltinOptions.BroadcastToOptions, 58, BuiltinOptions.SignOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.Rfft2dOptions, 58, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.AssignVariableOptions, Byte.MAX_VALUE, 58, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.RandomOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.ReverseV2Options, 64, 25, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.CosOptions, 25, BuiltinOptions.ReadVariableOptions, 25, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.IfOptions, BuiltinOptions.IfOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.DepthToSpaceOptions, 25, BuiltinOptions.MirrorPadOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.UniqueOptions, BuiltinOptions.ResizeNearestNeighborOptions, 6, BuiltinOptions.LogicalOrOptions, 10, 16, 23, BuiltinOptions.BidirectionalSequenceLSTMOptions, 22, 16, 7, 8, 12, 22, 22, 12, 10, 11, BuiltinOptions.BidirectionalSequenceLSTMOptions, 12, 22, BuiltinOptions.BidirectionalSequenceLSTMOptions, 11, 10, 18, BuiltinOptions.BidirectionalSequenceLSTMOptions, 7, 0, 12, 11, 2, BuiltinOptions.BidirectionalSequenceLSTMOptions, 23, 0, 19, 12, 0, 18, 0, 1, BuiltinOptions.LeakyReluOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.ZerosLikeOptions, Byte.MAX_VALUE, BuiltinOptions.GeluOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.DynamicUpdateSliceOptions, Byte.MAX_VALUE, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.HashtableOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.SegmentSumOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.DequantizeOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.LessOptions, BuiltinOptions.ExpOptions, BuiltinOptions.ShapeOptions, 32, BuiltinOptions.PadV2Options, 26, BuiltinOptions.NegOptions, BuiltinOptions.EqualOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.NegOptions, BuiltinOptions.PadV2Options, BuiltinOptions.NotEqualOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.ATan2Options, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.ATan2Options, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.SignOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.ReadVariableOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.ATan2Options, BuiltinOptions.DensifyOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.ATan2Options, BuiltinOptions.BitcastOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.SquareOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.FillOptions, BuiltinOptions.RangeOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.FillOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.RangeOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.WhereOptions, BuiltinOptions.AddNOptions, BuiltinOptions.WhereOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.CosOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.AbsOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.AbsOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.WhileOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.PackOptions, 58, BuiltinOptions.ShapeOptions, BuiltinOptions.NotEqualOptions, 12, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SliceOptions, 61, BuiltinOptions.LogicalOrOptions, 6, BuiltinOptions.PowOptions, 61, 6, 61, BuiltinOptions.LogicalOrOptions, BuiltinOptions.NegOptions, 58, BuiltinOptions.PadV2Options, BuiltinOptions.SliceOptions, BuiltinOptions.LessOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.SliceOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ShapeOptions, 61, BuiltinOptions.LogicalOrOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SliceOptions, 10, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.TransposeConvOptions, 10, BuiltinOptions.TileOptions, 58, BuiltinOptions.ArgMinOptions, BuiltinOptions.ArgMinOptions, 58, 34, 10, 32, BuiltinOptions.CastOptions, 10, 61, BuiltinOptions.SliceOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.PackOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.RankOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.RankOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.WhileOptions, BuiltinOptions.SquareOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.WhileOptions, BuiltinOptions.IfOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.CosOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.Conv3DOptions, 64, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.CosOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.Conv3DOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.IfOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.CosOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.PadV2Options, BuiltinOptions.LogSoftmaxOptions, 34, 32, 26, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.ExpOptions, 26, BuiltinOptions.EqualOptions, BuiltinOptions.ShapeOptions, 32, 35, 32, BuiltinOptions.ShapeOptions, 32, BuiltinOptions.PadV2Options, BuiltinOptions.DequantizeOptions, 32, BuiltinOptions.NotEqualOptions, BuiltinOptions.WhereOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.RankOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.WhileOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.IfOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.WhileOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.WhileOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.WhileOptions, BuiltinOptions.RankOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.WhileOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.DensifyOptions, BuiltinOptions.AddNOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.ExpOptions, BuiltinOptions.LogicalAndOptions, 58, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.ExpOptions, 32, 17, BuiltinOptions.PowOptions, BuiltinOptions.SelectOptions, 34, BuiltinOptions.PackOptions, BuiltinOptions.PadV2Options, 8, 31, 10, 21, 8, 14, BuiltinOptions.CastOptions, 27, 30, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.SliceOptions, BuiltinOptions.CastOptions, 58, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.ExpOptions, 10, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.TransposeConvOptions, 10, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SliceOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.CastOptions, BuiltinOptions.ExpOptions, BuiltinOptions.LogicalOrOptions, 58, BuiltinOptions.PackOptions, 13, 26, 15, 16, 13, 11, 32, 30, 27, 32, 25, 16, 19, 19, 16, 8, 32, 10, 15, 32, 23, 26, 30, 27, 22, 17, 24, BuiltinOptions.SquareOptions, BuiltinOptions.WhereOptions, 64, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.SquareOptions, BuiltinOptions.FillOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.CosOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.NonMaxSuppressionV4Options, 64, BuiltinOptions.FillOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.WhileOptions, 64, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.AbsOptions, 16, 15, 30, BuiltinOptions.PowOptions, 6, 10, BuiltinOptions.PowOptions, 14, BuiltinOptions.PowOptions, 20, 2, 2, 14, 9, 0, BuiltinOptions.PowOptions, 19, 15, 14, 20};
    }

    static {
        A06();
        A03 = new String[]{A02(452, 7, 105), A02(Videoio.CAP_PROP_XI_LIMIT_BANDWIDTH, 19, 99), A02(Videoio.CAP_PROP_XI_SHARPNESS, 25, 111), A02(503, 15, 8), A02(613, 9, 64), A02(622, 21, 111), A02(Imgcodecs.IMWRITE_JPEGXL_DECODING_SPEED, 27, 69), A02(670, 17, 10), A02(540, 21, 127), A02(Videoio.CAP_PROP_XI_AG_MAX_LIMIT, 16, 22), A02(Videoio.CAP_PROP_XI_DECIMATION_PATTERN, 18, 6), A02(398, 20, 41), A02(Crop.REQUEST_EDIT_CROP, 20, 93), A02(352, 14, 38), A02(Videoio.CAP_PROP_XI_HDR_T1, 25, 2)};
    }

    public O2(O8 o8) {
        this.A00 = o8;
    }

    private String A00() {
        return A03(A02(Videoio.CAP_PROP_XI_SHARPNESS, 25, 111), A02(60, 69, 96));
    }

    private String A01() {
        return A03(A02(Imgcodecs.IMWRITE_JPEGXL_DECODING_SPEED, 27, 69), A02(129, 64, 85));
    }

    private String A03(String str, String str2) {
        String A96 = this.A00.A96(str, str2);
        if (A96 == null) {
            return str2;
        }
        String value = A02(Videoio.CAP_PROP_XI_SENSOR_FEATURE_VALUE, 4, 33);
        return A96.equals(value) ? str2 : A96;
    }

    public static List<O6> A04(String str) throws JSONException {
        if (TextUtils.isEmpty(str) || str.equalsIgnoreCase(A02(Videoio.CAP_PROP_XI_SENSOR_FEATURE_VALUE, 4, 33))) {
            return new ArrayList();
        }
        JSONArray jSONArray = new JSONArray(str);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = (JSONObject) jSONArray.get(i);
            O6 o6 = new O6(jSONObject.getInt(A02(601, 12, 116)), jSONObject.getString(A02(Videoio.CAP_PROP_XI_HOUS_BACK_SIDE_TEMP, 11, 55)), jSONObject.optString(A02(366, 16, 63)));
            Iterator<O6> it = A04(jSONObject.optString(A02(382, 16, 127))).iterator();
            while (it.hasNext()) {
                o6.A06(it.next());
            }
            arrayList.add(o6);
        }
        return arrayList;
    }

    public static Map<String, String> A05(String str) {
        if (str != null && !str.isEmpty()) {
            if (A02[0].charAt(31) == '2') {
                throw new RuntimeException();
            }
            A02[0] = "A8tiJT5v19tpxSVqHJBkbDhH2RRDdRkC";
            if (!str.equals(A02(FTPReply.FILE_ACTION_PENDING, 2, 45))) {
                HashMap hashMap = new HashMap();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    for (String str2 : A03) {
                        if (!jSONObject.has(str2)) {
                            return null;
                        }
                        hashMap.put(str2, jSONObject.getString(str2));
                    }
                    if (A04(jSONObject.getString(A02(670, 17, 10))).size() == 0) {
                        A08(AbstractC1841Sv.A28, new C1842Sw(A02(TelnetCommand.EOR, 20, 107)));
                        return null;
                    }
                    if (A04(jSONObject.getString(A02(503, 15, 8))).size() == 0) {
                        A08(AbstractC1841Sv.A25, new C1842Sw(A02(221, 18, 45)));
                        return null;
                    }
                    return hashMap;
                } catch (JSONException e) {
                    A08(AbstractC1841Sv.A27, new C1842Sw(e));
                    return null;
                }
            }
        }
        return null;
    }

    private final void A07() {
        C2430gg A6A = this.A00.A6A();
        A6A.A00(A02(518, 22, 15), 0L);
        A6A.A02();
    }

    public static void A08(int i, C1842Sw c1842Sw) {
        C2202cu sdkContext = SP.A00();
        if (sdkContext != null) {
            sdkContext.A08().AAy(A02(687, 9, 19), i, c1842Sw);
        }
    }

    public final long A09() {
        return this.A00.A8I(A02(518, 22, 15), 0L);
    }

    public final O6 A0A() {
        O6 o6 = new O6(A00());
        try {
            for (O6 hideAdParent : A04(A03(A02(503, 15, 8), A02(0, 0, 48)))) {
                o6.A06(hideAdParent);
            }
        } catch (JSONException e) {
            A07();
            A08(AbstractC1841Sv.A26, new C1842Sw(e));
        }
        return o6;
    }

    public final O6 A0B() {
        O6 o6 = new O6(A01());
        try {
            for (O6 reportAdParent : A04(A03(A02(670, 17, 10), A02(0, 0, 48)))) {
                o6.A06(reportAdParent);
            }
        } catch (JSONException e) {
            A07();
            A08(AbstractC1841Sv.A29, new C1842Sw(e));
        }
        return o6;
    }

    public final String A0C() {
        return A03(A02(352, 14, 38), A02(0, 0, 48));
    }

    public final String A0D() {
        return A03(A02(398, 20, 41), A02(312, 38, 95));
    }

    public final String A0E() {
        return A03(A02(Videoio.CAP_PROP_XI_AG_MAX_LIMIT, 16, 22), A02(38, 10, 19));
    }

    public final String A0F() {
        return A03(A02(Videoio.CAP_PROP_XI_DECIMATION_PATTERN, 18, 6), A02(48, 12, 17));
    }

    public final String A0G() {
        return A03(A02(Videoio.CAP_PROP_XI_LIMIT_BANDWIDTH, 19, 99), A02(268, 23, 32));
    }

    public final String A0H() {
        return A03(A02(452, 7, 105), A02(193, 7, 63));
    }

    public final String A0I() {
        return A03(A02(Videoio.CAP_PROP_XI_HDR_T1, 25, 2), A02(0, 0, 48));
    }

    public final String A0J() {
        return A03(A02(540, 21, 127), A02(200, 21, 1));
    }

    public final String A0K() {
        return A03(A02(622, 21, 111), A02(0, 38, 112));
    }

    public final String A0L() {
        return A03(A02(613, 9, 64), A02(259, 9, 37));
    }

    public final String A0M() {
        return A03(A02(Crop.REQUEST_EDIT_CROP, 20, 93), A02(291, 21, 3));
    }

    public final void A0N(String str) {
        Map<String, String> A05 = A05(str);
        if (A05 == null || A05.size() != A03.length) {
            return;
        }
        C2430gg A6A = this.A00.A6A();
        for (String str2 : A03) {
            A6A.A01(str2, A05.get(str2));
        }
        if (A02[1].length() == 0) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[4] = "MCE7RaiUtGHbfQd9DpKX6Z";
        strArr[5] = "LB7njF";
        A6A.A00(A02(518, 22, 15), System.currentTimeMillis());
        A6A.A02();
    }

    public final boolean A0O(Context context, boolean z) {
        return (z || U7.A2Z(context)) && ((A09() > 0L ? 1 : (A09() == 0L ? 0 : -1)) > 0);
    }
}
