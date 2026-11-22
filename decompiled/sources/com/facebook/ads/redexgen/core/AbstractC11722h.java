package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.alibaba.fastjson.asm.Opcodes;
import com.wakeup.common.DeviceFeatures;
import io.agora.rtc2.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.net.ftp.FTPSClient;
import org.opencv.videoio.Videoio;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.2h, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC11722h {
    public static byte[] A00;
    public static String[] A01 = {"GVeqRr88eErbsFWt7Zyfruf5", "wxj6GMJJHrqzMl1sJI6PipHFTxOXGRz7", "RvxQI1Pfb9FvcjGIis5Xa2IsZ1O1jyWN", "aqZmlWCmiVFzo11RZMz1pcuKr30pTZ7V", "9PLW7Gxq7uBTsV", "7C", "H", "2Y1axbTDI7FTMPtf96QBUHvxuVSMJwkx"};
    public static final ArrayList<C11702f> A02;
    public static final Pattern A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static C11712g A04(String str) {
        Matcher matcher = A03.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String str2 = (String) C3M.A01(matcher.group(1));
        String group = matcher.group(2);
        try {
            return new C11712g(Integer.parseInt(str2, 16), group != null ? Integer.parseInt(group) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 37);
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A00 = new byte[]{BuiltinOptions.MatrixDiagOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.WhileOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.PadV2Options, BuiltinOptions.BitcastOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.PadV2Options, BuiltinOptions.IfOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.PadV2Options, 63, BuiltinOptions.HardSwishOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.SignOptions, BuiltinOptions.SelectOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.WhileOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.PadV2Options, 63, BuiltinOptions.HardSwishOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.NegOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.SignOptions, BuiltinOptions.SelectOptions, BuiltinOptions.SelectOptions, BuiltinOptions.ArgMinOptions, 34, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.CastOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.RangeOptions, 7, 30, 17, 0, 0, 28, 25, 19, 17, 4, 25, 31, 30, BuiltinOptions.NonMaxSuppressionV4Options, 19, 21, 17, BuiltinOptions.WhileOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, 64, BuiltinOptions.FloorModOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.RankOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.AbsOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.WhereOptions, BuiltinOptions.CosOptions, 21, BuiltinOptions.QuantizeOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.HardSwishOptions, 23, 13, 10, 2, BuiltinOptions.DequantizeOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PadV2Options, BuiltinOptions.LessEqualOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.TileOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.LessOptions, BuiltinOptions.BroadcastToOptions, 35, BuiltinOptions.TransposeConvOptions, BuiltinOptions.CastOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.CastOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.CallOnceOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.ATan2Options, BuiltinOptions.CallOnceOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.ExpOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.Conv3DOptions, 61, BuiltinOptions.SignOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.SignOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.GeluOptions, BuiltinOptions.EqualOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.GreaterOptions, Byte.MAX_VALUE, BuiltinOptions.Conv3DOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.IfOptions, BuiltinOptions.IfOptions, 64, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.SquareOptions, 3, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.AbsOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.QuantizeOptions, BuiltinOptions.AbsOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.SquareOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.SquareOptions, BuiltinOptions.FillOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, 4, BuiltinOptions.GatherNdOptions, 6, BuiltinOptions.FloorModOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.AbsOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.ResizeNearestNeighborOptions, 6, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.FillOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.SquareOptions, BuiltinOptions.FillOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.RandomOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.RightShiftOptions, Byte.MAX_VALUE, BuiltinOptions.LogicalAndOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.GeluOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.UnsortedSegmentProdOptions, 61, BuiltinOptions.GreaterOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.SliceOptions, BuiltinOptions.EqualOptions, 63, 61, BuiltinOptions.ArgMaxOptions, BuiltinOptions.EqualOptions, BuiltinOptions.TileOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.EqualOptions, BuiltinOptions.TransposeConvOptions, 61, BuiltinOptions.PackOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.LessOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.EqualOptions, BuiltinOptions.PadV2Options, 58, 58, BuiltinOptions.DequantizeOptions, 35, BuiltinOptions.LessOptions, BuiltinOptions.PadV2Options, BuiltinOptions.LogicalAndOptions, 35, BuiltinOptions.CastOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.MaximumMinimumOptions, 58, BuiltinOptions.RightShiftOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.LessOptions, BuiltinOptions.SelectOptions, BuiltinOptions.PadV2Options, BuiltinOptions.CallOnceOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.ATan2Options, BuiltinOptions.RandomOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.CosOptions, BuiltinOptions.CosOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.ResizeNearestNeighborOptions, 11, BuiltinOptions.IfOptions, 9, BuiltinOptions.RangeOptions, BuiltinOptions.CosOptions, 16, 9, BuiltinOptions.AddNOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.UniqueOptions, 61, BuiltinOptions.GreaterOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.SliceOptions, BuiltinOptions.EqualOptions, 63, 61, BuiltinOptions.ArgMaxOptions, BuiltinOptions.EqualOptions, BuiltinOptions.TileOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.LessOptions, BuiltinOptions.EqualOptions, 63, BuiltinOptions.ShapeOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.EqualOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.PackOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.ArgMaxOptions, Byte.MAX_VALUE, BuiltinOptions.NegOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.CallOnceOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.ATan2Options, BuiltinOptions.CallOnceOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.ExpOptions, BuiltinOptions.UnsortedSegmentProdOptions, 35, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.ATan2Options, BuiltinOptions.HashtableOptions, 61, BuiltinOptions.PackOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.PackOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.UnsortedSegmentMaxOptions, 32, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.PadV2Options, BuiltinOptions.GreaterEqualOptions, 58, BuiltinOptions.NegOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.LeakyReluOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.ReverseV2Options, 17, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.WhileOptions, 13, BuiltinOptions.BitcastOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.GeluOptions, BuiltinOptions.RandomOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.LessOptions, 58, BuiltinOptions.LessEqualOptions, 63, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.GeluOptions, BuiltinOptions.LogicalAndOptions, 58, BuiltinOptions.PowOptions, BuiltinOptions.BroadcastToOptions, 8, 28, 13, 0, 6, BuiltinOptions.BidirectionalSequenceRNNOptions, 12, 8, 10, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.FillOptions, 3, 6, 10, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.AddNOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.AbsOptions, BuiltinOptions.FloorModOptions, 8, BuiltinOptions.FloorDivOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.FillOptions, 23, 3, 18, 31, 25, BuiltinOptions.QuantizeOptions, 17, BuiltinOptions.FloorDivOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.HardSwishOptions, 23, 26, 23, 1, 25, 13, 28, 17, 23, BuiltinOptions.ReverseSequenceOptions, 31, BuiltinOptions.SplitVOptions, BuiltinOptions.RangeOptions, BuiltinOptions.RangeOptions, BuiltinOptions.WhereOptions, 21, 20, 25, 15, BuiltinOptions.IfOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.CosOptions, BuiltinOptions.AddNOptions, 18, BuiltinOptions.UniqueOptions, BuiltinOptions.WhereOptions, BuiltinOptions.IfOptions, 12, 58, BuiltinOptions.LessEqualOptions, 63, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.GeluOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.TileOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.DensifyOptions, 35, BuiltinOptions.ScatterNdOptions, BuiltinOptions.BitcastOptions, 63, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.RandomOptions, Byte.MAX_VALUE, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.SignOptions, BuiltinOptions.CumsumOptions, 34, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.PackOptions, BuiltinOptions.ATan2Options, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.SignOptions, BuiltinOptions.EqualOptions, BuiltinOptions.ExpOptions, BuiltinOptions.SliceOptions, 61, BuiltinOptions.PackOptions, BuiltinOptions.SignOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.TileOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.TileOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.SignOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.SquareOptions, BuiltinOptions.FillOptions, 4, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.AbsOptions, BuiltinOptions.SquaredDifferenceOptions, 6, BuiltinOptions.CallOnceOptions, 25, 21, 1, 16, 29, 27, BuiltinOptions.HardSwishOptions, 27, 4, 1, 7, 32, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.CastOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.TileOptions, 32, BuiltinOptions.NotEqualOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.GeluOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.VarHandleOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.LessOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.ArgMaxOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.RandomOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.GeluOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.AssignVariableOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.ATan2Options, 58, BuiltinOptions.DensifyOptions, BuiltinOptions.SignOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.PackOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.PackOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.PadV2Options, 63, BuiltinOptions.LessEqualOptions, 35, BuiltinOptions.CastOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.SegmentSumOptions, 34, BuiltinOptions.LessEqualOptions, BuiltinOptions.AssignVariableOptions, 58, BuiltinOptions.PowOptions, BuiltinOptions.CastOptions, BuiltinOptions.GreaterOptions, 35, BuiltinOptions.DequantizeOptions, BuiltinOptions.SelectOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.PowOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.NegOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.PadV2Options, BuiltinOptions.ScatterNdOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.PadV2Options, BuiltinOptions.ReadVariableOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.PowOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.ShapeOptions, 8, 28, 13, 0, 6, BuiltinOptions.BidirectionalSequenceRNNOptions, 31, 6, 27, 11, 0, 26, BuiltinOptions.ExpandDimsOptions, 32, BuiltinOptions.TransposeConvOptions, BuiltinOptions.LogicalOrOptions, 58, BuiltinOptions.ATan2Options, 34, BuiltinOptions.ExpandDimsOptions, 35, BuiltinOptions.BroadcastToOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.CumsumOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.Conv3DOptions, 27, 15, 30, 19, 21, BuiltinOptions.WhereOptions, 2, BuiltinOptions.ReverseSequenceOptions, 13, 27, 12, 11, 28, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.CosOptions, BuiltinOptions.FloorDivOptions, 19, BuiltinOptions.NotEqualOptions, BuiltinOptions.ExpOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.SegmentSumOptions, 7, 1, 5, BuiltinOptions.AddNOptions, BuiltinOptions.CosOptions, BuiltinOptions.IfOptions, 7, 1, 5, BuiltinOptions.GatherNdOptions, BuiltinOptions.CosOptions, BuiltinOptions.IfOptions, BuiltinOptions.WhileOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.WhileOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, 34, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.CastOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.AddNOptions, BuiltinOptions.UniqueOptions, 7, BuiltinOptions.BitcastOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.SignOptions, BuiltinOptions.PadV2Options, 64, BuiltinOptions.UniqueOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.RandomOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.SliceOptions, BuiltinOptions.PadV2Options, BuiltinOptions.ArgMinOptions, BuiltinOptions.LessOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.WhereOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.SquareOptions, BuiltinOptions.RangeOptions, BuiltinOptions.GeluOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.ExpOptions, 2, 16, 7, 16, 1, 19, 13, BuiltinOptions.CosOptions, BuiltinOptions.RandomOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.RightShiftOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.WhileOptions, BuiltinOptions.HardSwishOptions, 19, 11, 35, BuiltinOptions.CastOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.ZerosLikeOptions, 20, 18, 26, 28, 22, 27, 25, BuiltinOptions.ShapeOptions, 58, BuiltinOptions.LessOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ArgMaxOptions, 61, BuiltinOptions.VarHandleOptions, BuiltinOptions.ExpOptions, BuiltinOptions.CastOptions, BuiltinOptions.LessOptions, BuiltinOptions.SelectOptions, BuiltinOptions.GreaterEqualOptions, 10, 14, 2, 4, 6, BuiltinOptions.SquaredDifferenceOptions, 9, 19, 6, 4, 24, 29, 20, BuiltinOptions.FillOptions, 30, 27, 30, BuiltinOptions.SquareOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.HardSwishOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.SplitVOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, 2, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.FillOptions, 0, BuiltinOptions.WhereOptions, 26, 63, 32, BuiltinOptions.CastOptions, 35, 34, BuiltinOptions.CastOptions, BuiltinOptions.ExpOptions, BuiltinOptions.ExpOptions, 35, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.SelectOptions, 35, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.RankOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, 28, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.BatchMatMulOptions, 18, 13, 0, 1, 11, BuiltinOptions.LeakyReluOptions, 5, 18, BuiltinOptions.CosOptions, BuiltinOptions.WhereOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.ATan2Options, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.RandomOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.ReadVariableOptions, 64, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.AddNOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.QuantizeOptions, 25, BuiltinOptions.AddNOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.CosOptions, BuiltinOptions.SplitVOptions, 27, 64, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.QuantizeOptions, BuiltinOptions.MatrixDiagOptions, 1, 30, 19, 18, 24, BuiltinOptions.MatrixDiagOptions, 31, 18, 1, 20, 21, 10, 7, 6, 12, BuiltinOptions.SquaredDifferenceOptions, 14, 19, BuiltinOptions.ReverseSequenceOptions, 21, BuiltinOptions.AbsOptions, 6, 16, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.WhereOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.GatherNdOptions, 19, BuiltinOptions.ReverseV2Options, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.HardSwishOptions, Byte.MAX_VALUE, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.HashtableImportOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.PackOptions, BuiltinOptions.NonMaxSuppressionV5Options, Byte.MAX_VALUE, BuiltinOptions.RandomOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.SquareOptions, BuiltinOptions.WhileOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.HardSwishOptions, 27, BuiltinOptions.SquaredDifferenceOptions, 25, BuiltinOptions.SquareOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.UniqueOptions, 26, BuiltinOptions.HardSwishOptions, BuiltinOptions.MatrixSetDiagOptions, 6, 26, BuiltinOptions.SquareOptions, BuiltinOptions.FillOptions, 12, BuiltinOptions.GreaterOptions, BuiltinOptions.TileOptions, BuiltinOptions.LogicalAndOptions, 63, BuiltinOptions.EqualOptions, BuiltinOptions.DynamicUpdateSliceOptions, 34, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.LogicalAndOptions, 
        BuiltinOptions.GeluOptions, BuiltinOptions.EqualOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.GeluOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.NegOptions, BuiltinOptions.DensifyOptions, 28, 5, 24, 8, 3, 25, BuiltinOptions.HashtableFindOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.NegOptions, 34, BuiltinOptions.AbsOptions, BuiltinOptions.FloorModOptions, 8, 1, BuiltinOptions.ArgMaxOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.CumsumOptions, 11, 13, BuiltinOptions.FillOptions, BuiltinOptions.TileOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.SliceOptions, BuiltinOptions.SliceOptions};
    }

    static {
        A0B();
        A02 = new ArrayList<>();
        A03 = Pattern.compile(A06(0, 43, 35));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int A00(String str) {
        char c;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals(A06(410, 14, 76))) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1095064472:
                if (str.equals(A06(576, 13, 35))) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 187078296:
                if (str.equals(A06(382, 9, 27))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 187078297:
                if (str.equals(A06(391, 9, 56))) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1504578661:
                if (str.equals(A06(400, 10, 126))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1505942594:
                if (str.equals(A06(Videoio.CAP_PROP_XI_REGION_SELECTOR, 16, 48))) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1556697186:
                if (str.equals(A06(Videoio.CAP_PROP_XI_KNEEPOINT1, 13, 52))) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return 5;
            case 1:
                return 6;
            case 2:
                return 18;
            case 3:
                return 17;
            case 4:
                return 7;
            case 5:
                return 8;
            case 6:
                return 14;
            default:
                return 0;
        }
    }

    public static int A01(String str) {
        if (TextUtils.isEmpty(str)) {
            if (A01[5].length() != 2) {
                throw new RuntimeException();
            }
            A01[6] = "z";
            return -1;
        }
        if (A0C(str)) {
            return 1;
        }
        if (A0F(str)) {
            return 2;
        }
        if (A0E(str)) {
            return 3;
        }
        if (A0D(str)) {
            return 4;
        }
        if (!A06(108, 15, 43).equals(str)) {
            String[] strArr = A01;
            if (strArr[3].charAt(11) != strArr[1].charAt(11)) {
                A01[6] = "P";
                if (A06(203, 18, 4).equals(str)) {
                    return 5;
                }
            } else {
                String[] strArr2 = A01;
                strArr2[3] = "VYI9fOSlD70zieq9X0UMxroKft4rwUnu";
                strArr2[1] = "fzGTPsiWQenzPklSlTFREKemGkoOHbxS";
                if (A06(203, 18, 52).equals(str)) {
                    return 5;
                }
            }
            if (A06(337, 20, 43).equals(str)) {
                return 5;
            }
            if (!A06(176, 27, 14).equals(str)) {
                return A02(str);
            }
            if (A01[5].length() != 2) {
                String[] strArr3 = A01;
                strArr3[3] = "Wos1JoeCppSzgMBE4aaDrMH9ty47uNW2";
                strArr3[1] = "garXensuyOOz0HbXKDJZL2oQiQLFCkBX";
                return 6;
            }
            A01[5] = "Xl";
            return 6;
        }
        return 5;
    }

    public static int A02(String str) {
        int customMimeTypeCount = A02.size();
        if (0 < customMimeTypeCount) {
            A02.get(0);
            throw new NullPointerException(A06(837, 8, 19));
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00e2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00e3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0011 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00db A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A03(java.lang.String r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.AbstractC11722h.A03(java.lang.String, java.lang.String):int");
    }

    public static String A05(int i) {
        switch (i) {
            case 32:
                return A06(926, 13, 70);
            case 33:
                return A06(889, 9, 54);
            case 35:
                if (A01[5].length() != 2) {
                    return A06(916, 10, 82);
                }
                String[] strArr = A01;
                strArr[7] = "sU0jfjATw0ctdBiFmHYtQPiFW02EkiCX";
                strArr[2] = "guUIg4Lmsq3I11Gl64ANQL7INWldoWo0";
                return A06(916, 10, 82);
            case 64:
            case 102:
            case 103:
            case 104:
                return A06(493, 15, 51);
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return A06(949, 11, 44);
            case 105:
            case 107:
                String A06 = A06(508, 10, 113);
                String[] strArr2 = A01;
                if (strArr2[0].length() != strArr2[4].length()) {
                    String[] strArr3 = A01;
                    strArr3[3] = "3EgQ9ZCWIlOzJdI5B9z9UgtNSs58n98m";
                    strArr3[1] = "jjFHQ5Ntty1zFGyuhEkahCZpCi1GWUO2";
                    return A06;
                }
                break;
            case 106:
                String A062 = A06(939, 10, 25);
                String[] strArr4 = A01;
                if (strArr4[0].length() != strArr4[4].length()) {
                    String[] strArr5 = A01;
                    strArr5[7] = "Q0G2Js2SP22VhhoMfC9OjreCCdB2eOqG";
                    strArr5[2] = "Q6nirM5b9Ts832tqRdA4gMIZJm5lUFYy";
                    return A062;
                }
                break;
            case 108:
                String[] strArr6 = A01;
                if (strArr6[7].charAt(24) != strArr6[2].charAt(24)) {
                    String[] strArr7 = A01;
                    strArr7[0] = "3q9GG3wULEgsyS1YbN3nnd24";
                    strArr7[4] = "ha3UTLVvbbrTPN";
                    return A06(819, 10, 70);
                }
                return A06(819, 10, 70);
            case 163:
                return A06(960, 10, 51);
            case 165:
                return A06(382, 9, 27);
            case Opcodes.IF_ACMPNE /* 166 */:
                return A06(400, 10, 126);
            case 169:
            case 172:
                String A063 = A06(576, 13, 35);
                if (A01[5].length() != 2) {
                    String[] strArr8 = A01;
                    strArr8[7] = "SeyAy4vUnEUmatfpO54gBZBxkf1tAmXN";
                    strArr8[2] = "HK24g8A7blS5zcU5SJrZp7eHVCJ7RCNu";
                    return A063;
                }
                String[] strArr9 = A01;
                strArr9[0] = "QXfUpXWFkEqQPG6LX9fSFPLZ";
                strArr9[4] = "Nb6RgsH4bduG1M";
                return A063;
            case 170:
            case DeviceFeatures.AI_AUDIO_SEARCH /* 171 */:
                return A06(Videoio.CAP_PROP_XI_REGION_SELECTOR, 16, 48);
            case DeviceFeatures.E_BOOK /* 173 */:
                return A06(Videoio.CAP_PROP_XI_TRG_DELAY, 10, 81);
            case 174:
                String A064 = A06(391, 9, 56);
                if (A01[5].length() == 2) {
                    String[] strArr10 = A01;
                    strArr10[0] = "XbJnvZsINxENz3xQ1kbTvdGI";
                    strArr10[4] = "tLEzDvxw28XrgL";
                    return A064;
                }
                break;
            case 177:
                return A06(FTPSClient.DEFAULT_FTPS_DATA_PORT, 19, 127);
            default:
                return null;
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0379, code lost:
    
        return A06(633, 28, 32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x037a, code lost:
    
        r2 = com.facebook.ads.redexgen.core.AbstractC11722h.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x038e, code lost:
    
        if (r2[7].charAt(24) == r2[2].charAt(24)) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0390, code lost:
    
        com.facebook.ads.redexgen.core.AbstractC11722h.A01[6] = "S";
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x03a2, code lost:
    
        if (r3.startsWith(A06(854, 4, 117)) == false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x03ae, code lost:
    
        return A06(org.opencv.videoio.Videoio.CAP_PROP_XI_TRG_DELAY, 10, 81);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x03d6, code lost:
    
        if (r3.startsWith(A06(1008, 6, 79)) == false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x03e2, code lost:
    
        return A06(661, 12, 76);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x03f0, code lost:
    
        if (r3.startsWith(A06(802, 4, 95)) == false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x03fb, code lost:
    
        return A06(424, 10, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0409, code lost:
    
        if (r3.startsWith(A06(858, 4, 116)) == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0415, code lost:
    
        return A06(138, 20, 34);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0423, code lost:
    
        if (r3.startsWith(A06(1028, 4, 97)) == false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x042f, code lost:
    
        return A06(866, 8, 22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x043d, code lost:
    
        if (r3.contains(A06(io.agora.rtc2.Constants.AUDIO_MIXING_REASON_ALL_LOOPS_COMPLETED, 6, 65)) == false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0449, code lost:
    
        return A06(70, 19, 31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0456, code lost:
    
        if (r3.contains(A06(796, 6, 7)) != false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0465, code lost:
    
        if (r3.contains(A06(717, 6, 65)) == false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0476, code lost:
    
        return A09(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0471, code lost:
    
        return A06(51, 19, 85);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x03af, code lost:
    
        r2 = com.facebook.ads.redexgen.core.AbstractC11722h.A01;
        r2[0] = "Jkd2X7VsrwTzscknsDYl89LH";
        r2[4] = "Ot0kU0Dq4n3kXQ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x03c6, code lost:
    
        if (r3.startsWith(A06(854, 0, 67)) == false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x035f, code lost:
    
        return A06(org.opencv.videoio.Videoio.CAP_PROP_XI_REGION_SELECTOR, 16, 48);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x030f, code lost:
    
        com.facebook.ads.redexgen.core.AbstractC11722h.A01[5] = "Cp";
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x031a, code lost:
    
        if (r3.startsWith(r4) == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02bd, code lost:
    
        r2 = com.facebook.ads.redexgen.core.AbstractC11722h.A01;
        r2[3] = "Hu8TImITUClzOpUW7nYqBBb98KuBEnkB";
        r2[1] = "WY5RgWx36bezmxj9o8LdwExpmHYl5ckj";
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02d3, code lost:
    
        if (r3.startsWith(A06(744, 2, 2)) == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02bc, code lost:
    
        return A06(391, 9, 56);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x025e, code lost:
    
        return A06(400, 10, 126);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0235, code lost:
    
        return A06(382, 9, 27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0185, code lost:
    
        return A06(970, 19, 17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x015c, code lost:
    
        return A06(org.apache.commons.net.ftp.FTPSClient.DEFAULT_FTPS_DATA_PORT, 19, 127);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x00f9, code lost:
    
        if (r3.startsWith(A06(780, 4, 14)) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00db, code lost:
    
        if (r3.startsWith(A06(780, 4, 64)) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0109, code lost:
    
        if (r3.startsWith(A06(androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_INTERPOLATOR, 4, 79)) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0115, code lost:
    
        return A06(879, 10, 65);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0125, code lost:
    
        if (com.facebook.ads.redexgen.core.AbstractC11722h.A01[5].length() == 2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x012c, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x012d, code lost:
    
        r2 = com.facebook.ads.redexgen.core.AbstractC11722h.A01;
        r2[7] = "LIs8es7LDxkf9lR87RnCT0Q6IgA77Jet";
        r2[2] = "MyiayBE8EONbf9RMcxAbsuNI3CAOFfaC";
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0141, code lost:
    
        if (r3.startsWith(A06(1025, 3, 88)) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0150, code lost:
    
        if (r3.startsWith(A06(1018, 4, 29)) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x016a, code lost:
    
        if (r3.startsWith(A06(1022, 3, 123)) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0179, code lost:
    
        if (r3.startsWith(A06(1014, 4, 63)) == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0193, code lost:
    
        if (r3.startsWith(A06(845, 4, 19)) == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0195, code lost:
    
        r4 = null;
        r0 = A06(849, 5, 17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01a3, code lost:
    
        if (r3.startsWith(r0) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01a5, code lost:
    
        r0 = A04(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01a9, code lost:
    
        if (r0 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01ab, code lost:
    
        r4 = A05(r0.A01);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01b1, code lost:
    
        if (r4 != null) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01bd, code lost:
    
        return A06(493, 15, 51);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01cb, code lost:
    
        if (r3.startsWith(A06(829, 4, 80)) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01d7, code lost:
    
        return A06(org.opencv.videoio.Videoio.CAP_PROP_XI_OUTPUT_DATA_PACKING_TYPE, 10, 24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01e5, code lost:
    
        if (r3.startsWith(A06(833, 4, 86)) == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01e7, code lost:
    
        r3 = A06(org.opencv.videoio.Videoio.CAP_PROP_XI_IMAGE_IS_COLOR, 10, 126);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01fb, code lost:
    
        if (com.facebook.ads.redexgen.core.AbstractC11722h.A01[5].length() == 2) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01fd, code lost:
    
        com.facebook.ads.redexgen.core.AbstractC11722h.A01[5] = "D6";
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0204, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0205, code lost:
    
        com.facebook.ads.redexgen.core.AbstractC11722h.A01[6] = "g";
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x020c, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x021a, code lost:
    
        if (r3.startsWith(A06(43, 4, 99)) != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0229, code lost:
    
        if (r3.startsWith(A06(740, 4, 99)) == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0243, code lost:
    
        if (r3.startsWith(A06(792, 4, 99)) != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0252, code lost:
    
        if (r3.startsWith(A06(748, 4, 61)) == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x026c, code lost:
    
        if (r3.startsWith(A06(788, 4, 29)) == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0278, code lost:
    
        return A06(410, 14, 76);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0286, code lost:
    
        if (r3.startsWith(A06(47, 4, 15)) != false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0288, code lost:
    
        r2 = com.facebook.ads.redexgen.core.AbstractC11722h.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x029c, code lost:
    
        if (r2[7].charAt(24) == r2[2].charAt(24)) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x029e, code lost:
    
        com.facebook.ads.redexgen.core.AbstractC11722h.A01[5] = "nW";
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02b0, code lost:
    
        if (r3.startsWith(A06(744, 4, 22)) == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02d6, code lost:
    
        r4 = A06(752, 4, 1);
        r2 = com.facebook.ads.redexgen.core.AbstractC11722h.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02f0, code lost:
    
        if (r2[7].charAt(24) == r2[2].charAt(24)) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02f2, code lost:
    
        r2 = com.facebook.ads.redexgen.core.AbstractC11722h.A01;
        r2[0] = "M91Alhi5VnxALE4ukQ4PKVvL";
        r2[4] = "SMSBdxcTP4jmFg";
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0302, code lost:
    
        if (r3.startsWith(r4) == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x030e, code lost:
    
        return A06(576, 13, 35);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x032a, code lost:
    
        if (r3.startsWith(A06(756, 4, 51)) == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0336, code lost:
    
        return A06(androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_ANIMATE_RELATIVE_TO, 28, 111);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0344, code lost:
    
        if (r3.startsWith(A06(760, 4, 102)) != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0353, code lost:
    
        if (r3.startsWith(A06(764, 4, 120)) == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x036d, code lost:
    
        if (r3.startsWith(A06(768, 4, 20)) == false) goto L128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String A07(java.lang.String r6) {
        /*
            Method dump skipped, instructions count: 1143
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.AbstractC11722h.A07(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String A08(String str) {
        char c;
        switch (str.hashCode()) {
            case -1007807498:
                if (str.equals(A06(682, 12, 44))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -586683234:
                if (str.equals(A06(694, 11, 95))) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 187090231:
                if (str.equals(A06(484, 9, 41))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return A06(424, 10, 2);
            case 1:
                return A06(508, 10, 113);
            case 2:
                return A06(673, 9, 112);
            default:
                return str;
        }
    }

    public static String A09(String str) {
        int customMimeTypeCount = A02.size();
        if (0 < customMimeTypeCount) {
            A02.get(0);
            throw new NullPointerException(A06(729, 11, 27));
        }
        return null;
    }

    public static String A0A(String str) {
        int indexOfSlash;
        if (str == null || (indexOfSlash = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOfSlash);
    }

    public static boolean A0C(String str) {
        return A06(377, 5, 11).equals(A0A(str));
    }

    public static boolean A0D(String str) {
        return A06(Constants.RHYTHM_PLAYER_STATE_FAILED, 5, 109).equals(A0A(str)) || A06(221, 23, 121).equals(str);
    }

    public static boolean A0E(String str) {
        if (!A06(862, 4, 114).equals(A0A(str)) && !A06(51, 19, 85).equals(str) && !A06(70, 19, 31).equals(str) && !A06(244, 25, 111).equals(str) && !A06(357, 20, 125).equals(str)) {
            String[] strArr = A01;
            if (strArr[7].charAt(24) == strArr[2].charAt(24)) {
                throw new RuntimeException();
            }
            A01[5] = "uN";
            if (!A06(138, 20, 34).equals(str) && !A06(290, 28, 121).equals(str) && !A06(269, 21, 1).equals(str) && !A06(TypedValues.AttributesType.TYPE_PIVOT_TARGET, 19, 34).equals(str) && !A06(158, 18, 9).equals(str) && !A06(123, 15, 63).equals(str) && !A06(89, 19, 98).equals(str)) {
                return false;
            }
        }
        return true;
    }

    public static boolean A0F(String str) {
        return A06(874, 5, 47).equals(A0A(str));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0112 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0010 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0G(java.lang.String r6, java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.AbstractC11722h.A0G(java.lang.String, java.lang.String):boolean");
    }
}
