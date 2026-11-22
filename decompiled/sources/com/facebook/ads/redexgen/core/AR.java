package com.facebook.ads.redexgen.core;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.ads.androidx.media3.common.ColorInfo;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.wakeup.common.DeviceFeatures;
import com.wakeup.commponent.module.sport.SportTypeConstant;
import io.agora.rtc2.Constants;
import java.util.Arrays;
import org.apache.commons.net.ftp.FTPReply;
import org.opencv.videoio.Videoio;
import org.tensorflow.lite.schema.BuiltinOptions;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* loaded from: assets/audience_network.dex */
public final class AR {
    public static byte[] A0B;
    public static String[] A0C = {"I9JaO4heFf5nDgSUvVeAxAeOAdbY1nhs", "PVSEhsxK0zpzpXeziFZITHKDYbLYMlXw", "qlK6yxEC", "9zKWhcki2UyQZLYGzaAyWcMw08QqvpbN", "JlMwKIWIzkUyHhMRK", "e8OveLjqyhc2hkEtyY01o7K", "DY1oAH7PrQgT6IVPSHYZAZf9F8l8uJ13", "bCAM9BCoFLqZyqtmC8leb"};
    public final MediaCodecInfo.CodecCapabilities A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 26);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0B = new byte[]{BuiltinOptions.RangeOptions, 29, 6, BuiltinOptions.RangeOptions, 29, 17, BuiltinOptions.FloorDivOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.SliceOptions, 2, 2, 4, 28, 20, 21, BuiltinOptions.LogicalOrOptions, 16, 9, BuiltinOptions.SparseToDenseOptions, 25, 16, 31, 31, 20, 29, BuiltinOptions.SliceOptions, 21, 27, 4, 2, 5, 28, 20, 31, 5, BuiltinOptions.LeakyReluOptions, BuiltinOptions.ReverseV2Options, 14, BuiltinOptions.LogicalOrOptions, BuiltinOptions.LogicalOrOptions, 58, 34, BuiltinOptions.NegOptions, BuiltinOptions.PadV2Options, 28, 58, 63, 63, 32, 61, BuiltinOptions.PackOptions, BuiltinOptions.VarHandleOptions, 20, 19, 58, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SliceOptions, BuiltinOptions.LessOptions, BuiltinOptions.SliceOptions, Byte.MAX_VALUE, 11, 29, BuiltinOptions.RandomOptions, 7, BuiltinOptions.Rfft2dOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.LeakyReluOptions, 64, BuiltinOptions.FloorDivOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.FloorDivOptions, 14, BuiltinOptions.ATan2Options, BuiltinOptions.HashtableFindOptions, 3, BuiltinOptions.UnsortedSegmentProdOptions, 24, 30, 24, BuiltinOptions.RankOptions, Byte.MAX_VALUE, BuiltinOptions.GeluOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.DynamicUpdateSliceOptions, 58, BuiltinOptions.AbsOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.SquareOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.PadV2Options, BuiltinOptions.GreaterOptions, BuiltinOptions.ExpandDimsOptions, 28, 29, 16, 24, 58, 22, 29, 28, 26, BuiltinOptions.SliceOptions, 23, 31, 22, 28, BuiltinOptions.ShapeOptions, BuiltinOptions.NegOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.ExpOptions, BuiltinOptions.RandomOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.RightShiftOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.DensifyOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, 64, 64, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.SquareOptions, BuiltinOptions.FillOptions, 16, BuiltinOptions.HashtableOptions, 11, 0, 22, 11, 13, 0, BuiltinOptions.Rfft2dOptions, 28, 17, BuiltinOptions.UnsortedSegmentMaxOptions, 32, 34, BuiltinOptions.ShapeOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.NegOptions, 23, 22, 1, 0, 28, BuiltinOptions.FloorDivOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.PadV2Options, 10, 12, 0, 11, 10, 29, 31, 29, 8, BuiltinOptions.RightShiftOptions, 21, BuiltinOptions.ArgMaxOptions, BuiltinOptions.LessOptions, BuiltinOptions.LogicalAndOptions, 63, 35, BuiltinOptions.RightShiftOptions, 17, 6, 19, BuiltinOptions.RightShiftOptions, 20, BuiltinOptions.EqualOptions, BuiltinOptions.TileOptions, 63, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.EqualOptions, 34, BuiltinOptions.RightShiftOptions, 35, BuiltinOptions.EqualOptions, BuiltinOptions.TileOptions, BuiltinOptions.CastOptions, 34, BuiltinOptions.EqualOptions, BuiltinOptions.CosOptions, BuiltinOptions.RankOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.EqualOptions, BuiltinOptions.RankOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.RangeOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.EqualOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.AddNOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.CosOptions, BuiltinOptions.EqualOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.EqualOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.CosOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.SelectOptions, BuiltinOptions.LessOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.CosOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.RangeOptions, 11, 9, 28, BuiltinOptions.Conv3DOptions, 9, 16, 15, BuiltinOptions.Conv3DOptions, 18, 13, 0, 1, 11, BuiltinOptions.Conv3DOptions, 0, 1, 7, 11, 0, 1, 22, BuiltinOptions.Conv3DOptions, 12, 1, 18, 7, 16, 14, BuiltinOptions.HashtableSizeOptions, 23, BuiltinOptions.AssignVariableOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.BucketizeOptions, 15, BuiltinOptions.CumsumOptions, 27, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.AddNOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.DepthToSpaceOptions, 22, BuiltinOptions.LeakyReluOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.SquareOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.UniqueOptions, 29, 9, 24, 21, 19, BuiltinOptions.GatherNdOptions, BuiltinOptions.SplitVOptions, 27, 12, 12, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.SquareOptions, BuiltinOptions.FillOptions, 4, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.FloorModOptions, 24, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.ATan2Options, BuiltinOptions.HashtableOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.NonMaxSuppressionV5Options, 32, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.BitwiseXorOptions, 34, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.PowOptions, BuiltinOptions.LessOptions, BuiltinOptions.LogSoftmaxOptions, 34, BuiltinOptions.SelectV2Options, BuiltinOptions.ArgMaxOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.RightShiftOptions, 7, 19, 2, 15, 9, BuiltinOptions.RangeOptions, 0, 10, 7, 5, Byte.MAX_VALUE, BuiltinOptions.HashtableOptions, BuiltinOptions.ATan2Options, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.LessOptions, BuiltinOptions.SelectOptions, BuiltinOptions.SelectOptions, BuiltinOptions.TileOptions, Byte.MAX_VALUE, BuiltinOptions.RandomOptions, Byte.MAX_VALUE, BuiltinOptions.Rfft2dOptions, BuiltinOptions.NegOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.SelectOptions, 34, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.ATan2Options, BuiltinOptions.ATan2Options, BuiltinOptions.CumsumOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.NegOptions, BuiltinOptions.LogicalOrOptions, 24, 12, 29, 16, 22, BuiltinOptions.RankOptions, 30, 10, 20, BuiltinOptions.AbsOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, 64, 0, BuiltinOptions.SquareOptions, BuiltinOptions.NonMaxSuppressionV4Options, 27, BuiltinOptions.AbsOptions, 2, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.AbsOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.SquareOptions, BuiltinOptions.WhereOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.WhileOptions, BuiltinOptions.HardSwishOptions, 27, BuiltinOptions.QuantizeOptions, BuiltinOptions.FillOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.GatherNdOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.FloorDivOptions, 1, BuiltinOptions.FloorDivOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.WhileOptions, BuiltinOptions.CosOptions, 64, BuiltinOptions.ReverseV2Options, BuiltinOptions.IfOptions, BuiltinOptions.MatrixSetDiagOptions, 26, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.CosOptions, BuiltinOptions.SquareOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.SignOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.ExpOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.ReadVariableOptions, 5, 14, 7, 8, 8, 3, 10, BuiltinOptions.CastOptions, 9, 19, 8, 18, BuiltinOptions.FloorModOptions, 7, BuiltinOptions.CastOptions, 7, 22, 21, BuiltinOptions.SquareOptions, BuiltinOptions.RangeOptions, 64, BuiltinOptions.SplitVOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.FillOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.AbsOptions, BuiltinOptions.CosOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.WhereOptions, 15, BuiltinOptions.SquareOptions, 64, BuiltinOptions.ReverseV2Options, BuiltinOptions.AddNOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.EqualOptions, 58, 58, BuiltinOptions.TransposeConvOptions, BuiltinOptions.PowOptions, 23, BuiltinOptions.PackOptions, BuiltinOptions.ExpOptions, 58, 32, BuiltinOptions.ATan2Options, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.ExpOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.PackOptions, BuiltinOptions.DequantizeOptions, 32, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.GeluOptions, BuiltinOptions.EqualOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, BuiltinOptions.EqualOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.PackOptions, 63, BuiltinOptions.PackOptions, BuiltinOptions.TileOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.ATan2Options, BuiltinOptions.CallOnceOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.FillOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.RandomOptions, BuiltinOptions.ScatterNdOptions, Byte.MAX_VALUE, BuiltinOptions.ATan2Options, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.NegOptions, 63, BuiltinOptions.BitcastOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.RankOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.AddNOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.RankOptions, BuiltinOptions.TransposeConvOptions, 35, BuiltinOptions.SelectOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.MaximumMinimumOptions, 16, 35, BuiltinOptions.NotEqualOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.HashtableFindOptions, 35, 1, 35, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.HashtableImportOptions, Byte.MAX_VALUE, BuiltinOptions.BucketizeOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.RandomOptions, BuiltinOptions.SignOptions, BuiltinOptions.SquaredDifferenceOptions, Byte.MAX_VALUE, BuiltinOptions.Conv3DOptions, BuiltinOptions.SignOptions, BuiltinOptions.SliceOptions, BuiltinOptions.BitwiseXorOptions, Byte.MAX_VALUE, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.HashtableImportOptions, 2, 16, 28, 1, 29, 20, 35, 16, 5, 20, BuiltinOptions.NonMaxSuppressionV4Options, 2, 4, 1, 1, 30, 3, 5, BuiltinOptions.WhileOptions, BuiltinOptions.ReverseV2Options, 1, 23, 17, 7, 0, 23, BuiltinOptions.NonMaxSuppressionV4Options, 2, 30, 19, 11, 16, 19, 17, 25, BuiltinOptions.CumsumOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.CosOptions, BuiltinOptions.SignOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.GeluOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.PackOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.GeluOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.CumsumOptions, 64, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.RangeOptions, BuiltinOptions.RankOptions, BuiltinOptions.RandomOptions, BuiltinOptions.WhileOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.AddNOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.RankOptions, 29, BuiltinOptions.UniqueOptions, BuiltinOptions.IfOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.RankOptions, BuiltinOptions.FloorDivOptions, 31, 19, BuiltinOptions.HashtableFindOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.ATan2Options, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.SignOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.ATan2Options, BuiltinOptions.TransposeConvOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.ATan2Options, BuiltinOptions.SignOptions, BuiltinOptions.TileOptions, 63, 24, 2, 17, 14, BuiltinOptions.NegOptions, 5, 15, BuiltinOptions.ArgMinOptions, 10, 31, 14, BuiltinOptions.BidirectionalSequenceLSTMOptions, 24, 30, 27, 27, 4, 25, 31, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.RandomOptions, BuiltinOptions.RankOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.RandomOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.CosOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.SegmentSumOptions, 4, 5, 30, 30, 21, 28, 21, 20, BuiltinOptions.WhileOptions, 0, 28, 17, 9, 18, 17, 19, 27, BuiltinOptions.SliceOptions, BuiltinOptions.SelectOptions, 34, 35, BuiltinOptions.LessOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.SliceOptions, BuiltinOptions.CastOptions, BuiltinOptions.RandomOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.ScatterNdOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.PadV2Options, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.HashtableOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.LessOptions, BuiltinOptions.RandomOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.Conv3DOptions, 21, 10, 7, 6, 12, BuiltinOptions.SquaredDifferenceOptions, 11, 6, 21, 0, BuiltinOptions.AddNOptions, BuiltinOptions.MirrorPadOptions, 64, BuiltinOptions.FloorDivOptions, BuiltinOptions.LeakyReluOptions, 11, BuiltinOptions.IfOptions, 9, BuiltinOptions.AddNOptions, BuiltinOptions.ResizeNearestNeighborOptions, 64, 10, BuiltinOptions.LeakyReluOptions, BuiltinOptions.ResizeNearestNeighborOptions, 22, 10, BuiltinOptions.AddNOptions, BuiltinOptions.CosOptions, 29, BuiltinOptions.IfOptions};
    }

    static {
        A04();
    }

    public AR(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A03 = (String) C3M.A01(str);
        this.A02 = str2;
        this.A01 = str3;
        this.A00 = codecCapabilities;
        this.A05 = z;
        this.A07 = z2;
        this.A09 = z3;
        this.A04 = z4;
        this.A08 = z5;
        this.A06 = z6;
        this.A0A = AbstractC11722h.A0F(str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ce, code lost:
    
        if (A03(org.apache.commons.net.ftp.FTPReply.NEED_ACCOUNT, 15, 4).equals(r6) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00de, code lost:
    
        if (A03(347, 15, 81).equals(r6) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ee, code lost:
    
        if (A03(362, 9, 99).equals(r6) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0119, code lost:
    
        if (A03(291, 9, 49).equals(r6) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x011b, code lost:
    
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x011c, code lost:
    
        com.facebook.ads.redexgen.core.AnonymousClass44.A07(A03(97, 14, 99), A03(10, 29, 107) + r5 + A03(6, 3, 119) + r7 + A03(0, 4, 115) + r4 + A03(260, 1, 72));
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0171, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0180, code lost:
    
        if (A03(312, 10, 87).equals(r6) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0182, code lost:
    
        r4 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0185, code lost:
    
        r4 = 30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0108, code lost:
    
        if (A03(org.apache.commons.net.ftp.FTPReply.NEED_ACCOUNT, 15, 4).equals(r6) == false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A00(java.lang.String r5, java.lang.String r6, int r7) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.AR.A00(java.lang.String, java.lang.String, int):int");
    }

    public static Point A01(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int heightAlignment = videoCapabilities.getWidthAlignment();
        int widthAlignment = videoCapabilities.getHeightAlignment();
        return new Point(AbstractC12174a.A05(i, heightAlignment) * heightAlignment, AbstractC12174a.A05(i2, widthAlignment) * widthAlignment);
    }

    public static AR A02(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        if (!z4 && codecCapabilities != null) {
            boolean A09 = A09(codecCapabilities);
            if (A0C[2].length() != 8) {
                throw new RuntimeException();
            }
            A0C[2] = "xqlBNWNY";
            if (A09 && !A0J(str)) {
                z6 = true;
                return new AR(str, str2, str3, codecCapabilities, z, z2, z3, z6, codecCapabilities == null && A0D(codecCapabilities), !z5 || (codecCapabilities != null && A0B(codecCapabilities)));
            }
        }
        z6 = false;
        return new AR(str, str2, str3, codecCapabilities, z, z2, z3, z6, codecCapabilities == null && A0D(codecCapabilities), !z5 || (codecCapabilities != null && A0B(codecCapabilities)));
    }

    private void A05(String str) {
        StringBuilder append = new StringBuilder().append(A03(39, 16, 85)).append(str);
        String A03 = A03(261, 3, 33);
        AnonymousClass44.A04(A03(97, 14, 99), append.append(A03).append(this.A03).append(A03(4, 2, 43)).append(this.A02).append(A03).append(AbstractC12174a.A04).append(A03(260, 1, 72)).toString());
    }

    private void A06(String str) {
        StringBuilder append = new StringBuilder().append(A03(119, 11, 42)).append(str);
        String A03 = A03(261, 3, 33);
        AnonymousClass44.A04(A03(97, 14, 99), append.append(A03).append(this.A03).append(A03(4, 2, 43)).append(this.A02).append(A03).append(AbstractC12174a.A04).append(A03(260, 1, 72)).toString());
    }

    public static boolean A07() {
        return AbstractC12174a.A03.equals(A03(532, 7, 62)) || AbstractC12174a.A03.equals(A03(Videoio.CAP_PROP_XI_BINNING_SELECTOR, 6, 6)) || AbstractC12174a.A06.startsWith(A03(55, 14, 69)) || AbstractC12174a.A06.startsWith(A03(69, 14, 52)) || AbstractC12174a.A06.startsWith(A03(83, 14, 0));
    }

    public static boolean A09(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return AbstractC12174a.A02 >= 19 && A0A(codecCapabilities);
    }

    public static boolean A0A(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(A03(SportTypeConstant.Course_chest_intermediate, 17, 33));
    }

    public static boolean A0B(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return AbstractC12174a.A02 >= 21 && A0C(codecCapabilities);
    }

    public static boolean A0C(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(A03(598, 15, 104));
    }

    public static boolean A0D(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return AbstractC12174a.A02 >= 21 && A0E(codecCapabilities);
    }

    public static boolean A0E(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(A03(TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, 17, 106));
    }

    public static boolean A0F(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point alignedSize = A01(videoCapabilities, i, i2);
        int i3 = alignedSize.x;
        int i4 = alignedSize.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        return videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D46258033: [FBLite][Video] Solve tasks T154141530 T154151746 gating the call for SDK >=21")
    private boolean A0G(C2905or c2905or, boolean z) {
        Pair<Integer, Integer> A0B2 = C1384Ay.A0B(c2905or);
        if (A0B2 == null) {
            return true;
        }
        Integer num = (Integer) A0B2.first;
        String[] strArr = A0C;
        if (strArr[6].charAt(25) == strArr[3].charAt(25)) {
            A0C[2] = "XFIr8RM8";
            int intValue = num.intValue();
            int level = ((Integer) A0B2.second).intValue();
            if (A03(733, 18, 30).equals(c2905or.A0W)) {
                if (A03(Constants.AUDIO_MIXING_REASON_STOPPED_BY_USER, 9, 92).equals(this.A02)) {
                    intValue = 8;
                    level = 0;
                } else if (A03(751, 10, 121).equals(this.A02)) {
                    intValue = 2;
                    level = 0;
                }
            }
            if (!this.A0A) {
                if (A0C[2].length() == 8) {
                    A0C[4] = "U7uwaC6XnAT7ItuO5";
                    if (intValue != 42) {
                        return true;
                    }
                }
            }
            if (A0V().length <= 0) {
                return true;
            }
            MediaCodecInfo.CodecProfileLevel[] A0V = A0V();
            if (AbstractC12174a.A02 >= 21 && AbstractC12174a.A02 <= 23) {
                if (A03(761, 19, 62).equals(this.A02) && A0V.length == 0) {
                    A0V = A0M(this.A00);
                }
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : A0V) {
                if (codecProfileLevel.profile == intValue) {
                    int i = codecProfileLevel.level;
                    if (A0C[0].charAt(21) == 'A') {
                        A0C[1] = "Tk1KZqXmKjuSsbjIU3mgahSyAhYoMHEk";
                        if (i >= level || !z) {
                            boolean A0L = A0L(this.A02, intValue);
                            if (A0C[1].charAt(21) != 'k') {
                                A0C[0] = "B6qJQnb2cEtex6AQnXMJ6AJyRiBsPuck";
                                if (!A0L) {
                                    return true;
                                }
                            } else if (!A0L) {
                                return true;
                            }
                        }
                    }
                }
            }
            A06(A03(501, 20, 18) + c2905or.A0R + A03(4, 2, 43) + this.A01);
            return false;
        }
        throw new RuntimeException();
    }

    public static boolean A0H(String str) {
        return A03(396, 10, 52).equals(str);
    }

    public static boolean A0I(String str) {
        return AbstractC12174a.A06.startsWith(A03(253, 7, 89)) && A03(DeviceFeatures.DIAL_THUMB, 36, 1).equals(str);
    }

    public static boolean A0J(String str) {
        if (AbstractC12174a.A02 <= 22) {
            if ((A03(130, 10, 94).equals(AbstractC12174a.A06) || A03(111, 8, 72).equals(AbstractC12174a.A06)) && (A03(140, 22, 117).equals(str) || A03(162, 29, 74).equals(str))) {
                return true;
            }
        }
        return false;
    }

    public static boolean A0K(String str) {
        if (A03(FTPReply.ENTERING_PASSIVE_MODE, 26, 94).equals(str) && A03(527, 5, 83).equals(AbstractC12174a.A03)) {
            return false;
        }
        return true;
    }

    public static boolean A0L(String str, int i) {
        if (A03(751, 10, 121).equals(str) && 2 == i) {
            if (A03(539, 8, 36).equals(AbstractC12174a.A03) || A03(521, 6, 9).equals(AbstractC12174a.A03)) {
                return true;
            }
        }
        return false;
    }

    public static MediaCodecInfo.CodecProfileLevel[] A0M(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        int level;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i = 0;
        if (codecCapabilities != null && (videoCapabilities = codecCapabilities.getVideoCapabilities()) != null) {
            Integer upper = videoCapabilities.getBitrateRange().getUpper();
            if (A0C[0].charAt(21) != 'A') {
                throw new RuntimeException();
            }
            A0C[0] = "QcEMGW7v0Yxqh7XLcQ4xIAQDDerowqhX";
            i = upper.intValue();
        }
        if (i >= 180000000) {
            level = 1024;
        } else if (i >= 120000000) {
            level = 512;
        } else if (i >= 60000000) {
            level = 256;
        } else if (i >= 30000000) {
            level = 128;
        } else if (i >= 18000000) {
            level = 64;
        } else {
            if (A0C[0].charAt(21) != 'A') {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[7] = "cnj1P9QIvdvvlmM3jq4NJ";
            strArr[5] = "0LKKsHUxH9Ew65kXLPhVQ5r";
            if (i >= 12000000) {
                level = 32;
            } else if (i >= 7200000) {
                level = 16;
            } else if (i >= 3600000) {
                level = 8;
            } else if (i >= 1800000) {
                level = 4;
            } else if (i >= 800000) {
                level = 2;
            } else {
                level = 1;
            }
        }
        MediaCodecInfo.CodecProfileLevel profileLevel = new MediaCodecInfo.CodecProfileLevel();
        profileLevel.profile = 1;
        profileLevel.level = level;
        return new MediaCodecInfo.CodecProfileLevel[]{profileLevel};
    }

    public final Point A0N(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        if (this.A00 == null || (videoCapabilities = this.A00.getVideoCapabilities()) == null) {
            return null;
        }
        return A01(videoCapabilities, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (r1 != r14.A0A) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.ads.redexgen.core.C12525j A0O(com.facebook.ads.redexgen.core.C2905or r13, com.facebook.ads.redexgen.core.C2905or r14) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.AR.A0O(com.facebook.ads.redexgen.X.or, com.facebook.ads.redexgen.X.or):com.facebook.ads.redexgen.X.5j");
    }

    public final boolean A0P(int i) {
        if (this.A00 == null) {
            A06(A03(451, 17, 59));
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = this.A00.getAudioCapabilities();
        if (audioCapabilities == null) {
            A06(A03(Videoio.CAP_PROP_XI_DECIMATION_HORIZONTAL, 18, 124));
            return false;
        }
        if (A00(this.A03, this.A02, audioCapabilities.getMaxInputChannelCount()) < i) {
            A06(A03(Videoio.CAP_PROP_XI_CHIP_TEMP, 22, 78) + i);
            return false;
        }
        return true;
    }

    public final boolean A0Q(int i) {
        if (this.A00 == null) {
            A06(A03(Videoio.CAP_PROP_XI_KNEEPOINT1, 15, 4));
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = this.A00.getAudioCapabilities();
        if (audioCapabilities == null) {
            A06(A03(Videoio.CAP_PROP_XI_IS_DEVICE_EXIST, 16, 88));
            return false;
        }
        if (!audioCapabilities.isSampleRateSupported(i)) {
            A06(A03(IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED_BASELINE, 20, 107) + i);
            return false;
        }
        return true;
    }

    public final boolean A0R(int i, int i2, double d) {
        if (this.A00 == null) {
            if (A0C[4].length() != 17) {
                throw new RuntimeException();
            }
            A0C[1] = "VtsIfpRARdWM2RcSD8UT7BsOJP98i2Mb";
            A06(A03(613, 16, 15));
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = this.A00.getVideoCapabilities();
        if (videoCapabilities == null) {
            A06(A03(690, 17, 13));
            return false;
        }
        int i3 = AbstractC12174a.A02;
        String A03 = A03(9, 1, 116);
        String A032 = A03(780, 1, 62);
        if (i3 >= 29) {
            int A00 = AP.A00(videoCapabilities, i, i2, d);
            if (A00 == 2) {
                return true;
            }
            if (A00 == 1) {
                A06(A03(629, 19, 41) + i + A032 + i2 + A03 + d);
                return false;
            }
        }
        if (!A0F(videoCapabilities, i, i2, d)) {
            if (i >= i2 || !A0K(this.A03) || !A0F(videoCapabilities, i2, i, d)) {
                A06(A03(669, 21, 113) + i + A032 + i2 + A03 + d);
                return false;
            }
            A05(A03(648, 21, 5) + i + A032 + i2 + A03 + d);
        }
        return true;
    }

    @MetaExoPlayerCustomization(type = {"DEPRECATED_LOGIC"}, value = "D51676338: Control Renderer Support behavior")
    public final boolean A0S(C2905or c2905or) {
        String A07;
        if (c2905or.A0R == null || this.A02 == null || (A07 = AbstractC11722h.A07(c2905or.A0R)) == null) {
            return true;
        }
        String codecMimeType = this.A02;
        if (!codecMimeType.equals(A07)) {
            StringBuilder sb = new StringBuilder();
            String codecMimeType2 = A03(Videoio.CAP_PROP_XI_CC_MATRIX_23, 11, 76);
            StringBuilder append = sb.append(codecMimeType2);
            String codecMimeType3 = c2905or.A0R;
            StringBuilder append2 = append.append(codecMimeType3);
            String codecMimeType4 = A03(4, 2, 43);
            A06(append2.append(codecMimeType4).append(A07).toString());
            return false;
        }
        return A0G(c2905or, true);
    }

    public final boolean A0T(C2905or c2905or) {
        if (this.A0A) {
            boolean z = this.A04;
            if (A0C[1].charAt(21) == 'k') {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[7] = "p6ujkjtFWGTlktsjRzxuv";
            strArr[5] = "iao6hIdGkkUEjHJmkTON0Ul";
            return z;
        }
        Pair<Integer, Integer> profileLevel = C1384Ay.A0B(c2905or);
        return profileLevel != null && ((Integer) profileLevel.first).intValue() == 42;
    }

    @Deprecated
    public final boolean A0U(C2905or c2905or, C2905or c2905or2, boolean z) {
        if (!z && c2905or.A0N != null) {
            ColorInfo colorInfo = c2905or2.A0N;
            String[] strArr = A0C;
            if (strArr[7].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A0C[2] = "CiueF8sE";
            if (colorInfo == null) {
                c2905or2 = c2905or2.A07().A0t(c2905or.A0N).A14();
            }
        }
        int i = A0O(c2905or, c2905or2).A01;
        return i == 2 || i == 3;
    }

    public final MediaCodecInfo.CodecProfileLevel[] A0V() {
        if (this.A00 == null || this.A00.profileLevels == null) {
            return new MediaCodecInfo.CodecProfileLevel[0];
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.A00;
        if (A0C[2].length() != 8) {
            throw new RuntimeException();
        }
        String[] strArr = A0C;
        strArr[7] = "wYBsKMorArWFj72U1vIrO";
        strArr[5] = "2GYgXVRgmEsc3DaR9LQ86J2";
        return codecCapabilities.profileLevels;
    }

    public final String toString() {
        return this.A03;
    }
}
