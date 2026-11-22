package com.facebook.ads.redexgen.core;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import com.alibaba.fastjson.asm.Opcodes;
import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import com.luck.picture.lib.config.PictureConfig;
import com.phancy.mini.core.app.AppStartParams;
import com.unity3d.services.UnityAdsConstants;
import com.wakeup.common.DeviceFeatures;
import com.wakeup.commponent.module.sport.SportTypeConstant;
import io.agora.rtc2.Constants;
import io.agora.rtc2.internal.RtcEngineEvent;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.commons.net.telnet.TelnetCommand;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.opencv.videoio.Videoio;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.3V, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C3V {
    public static byte[] A00;
    public static final Map<String, Integer> A01;
    public static final Pattern A02;
    public static final Pattern A03;
    public static final Pattern A04;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 121);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-29, -13, 7, -4, -9, -15, -67, -67, -15, -7, 16, -58, -63, -56, 18, -66, -63, -67, -15, -7, 16, -58, -63, -56, 18, -66, -63, -67, -15, -7, 16, -58, -63, -56, 18, -66, -15, -66, -71, 19, BuiltinOptions.MaximumMinimumOptions, 28, 23, 22, 17, -35, -35, 17, 25, BuiltinOptions.SliceOptions, -26, -31, -24, BuiltinOptions.SparseToDenseOptions, -34, -31, -35, 17, 25, BuiltinOptions.SliceOptions, -26, -31, -24, BuiltinOptions.SparseToDenseOptions, -34, -31, -35, 17, 25, BuiltinOptions.SliceOptions, -26, -31, -24, BuiltinOptions.SparseToDenseOptions, -34, -31, -35, 17, 25, -33, 17, -29, -12, 17, 25, -33, -12, -34, 17, -34, -39, -10, 10, -1, -6, -7, -12, -64, -64, -12, -4, 19, -55, -60, -53, 21, -63, -60, -64, -12, -4, 19, -55, -60, -53, 21, -63, -60, -64, -12, -4, 19, -55, -60, -53, 21, -63, -60, -64, -12, -4, 19, -55, -60, -53, 21, -63, -12, -63, PSSSigner.TRAILER_IMPLICIT, 15, 26, 23, 17, 19, 16, 26, 35, 19, BuiltinOptions.SelectOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.SquareOptions, BuiltinOptions.ShapeOptions, 63, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.TileOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.SquareOptions, BuiltinOptions.TileOptions, -27, -11, -7, -27, BuiltinOptions.ShapeOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.FloorModOptions, 63, BuiltinOptions.FillOptions, BuiltinOptions.PackOptions, -30, -5, -10, -13, -26, -7, -4, 0, -2, -4, BuiltinOptions.ShapeOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.ResizeNearestNeighborOptions, 58, -36, -26, -37, -35, -27, 22, 32, 21, 34, 23, 28, 25, 24, 21, 32, BuiltinOptions.ExpOptions, 35, 34, 24, -11, -1, 8, -8, -1, 9, 18, 2, 19, 6, 12, 9, 2, 17, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.CumsumOptions, -6, 13, 10, 4, 17, 15, 7, 7, -4, BuiltinOptions.UniqueOptions, BuiltinOptions.AbsOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.AddNOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.AddNOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.WhileOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.AbsOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.IfOptions, BuiltinOptions.AbsOptions, 16, 21, 28, 16, 28, 25, 14, BuiltinOptions.ExpOptions, 18, BuiltinOptions.SelectOptions, BuiltinOptions.PackOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.PowOptions, -20, -8, -5, -9, -17, -11, -8, 0, -18, -5, -21, -11, -2, -18, -25, -13, -10, -14, -9, -19, TransmissionUnpacked.HD_VAL_MAGIC_HB, -17, -13, 2, -7, -3, 3, -1, -2, BuiltinOptions.MaximumMinimumOptions, 61, BuiltinOptions.CastOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.ZerosLikeOptions, 58, BuiltinOptions.FillOptions, BuiltinOptions.MirrorPadOptions, 61, BuiltinOptions.NotEqualOptions, BuiltinOptions.TileOptions, BuiltinOptions.FillOptions, 61, BuiltinOptions.EqualOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.TileOptions, 64, 12, 9, 26, 19, 15, 23, 20, 12, 13, 22, 26, 23, 12, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.SelectOptions, 64, BuiltinOptions.ArgMinOptions, BuiltinOptions.EqualOptions, 64, BuiltinOptions.SelectOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.RangeOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.GatherNdOptions, -8, -11, 6, -1, -5, 6, -7, 13, 13, 10, 27, 20, 20, 17, 10, 20, 18, -32, -35, -18, -25, -23, -35, -29, -31, -22, TransmissionUnpacked.HD_VAL_MAGIC_HB, -35, -35, -38, -21, -28, -24, -27, -30, -17, -34, -32, -21, -34, -34, -25, 61, 58, BuiltinOptions.LeakyReluOptions, BuiltinOptions.FillOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.LeakyReluOptions, 58, BuiltinOptions.UnidirectionalSequenceLSTMOptions, 64, BuiltinOptions.LogicalAndOptions, -32, -35, -18, -25, -21, -18, -33, -28, -27, -32, -11, -14, 3, -4, 3, -10, -11, BuiltinOptions.IfOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.CumsumOptions, 35, 32, BuiltinOptions.TransposeConvOptions, BuiltinOptions.NegOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.LogSoftmaxOptions, 32, BuiltinOptions.DequantizeOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.GreaterEqualOptions, 34, 31, BuiltinOptions.SliceOptions, BuiltinOptions.LessOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.NegOptions, 31, BuiltinOptions.SparseToDenseOptions, 35, 32, BuiltinOptions.NegOptions, BuiltinOptions.TileOptions, 35, -9, -12, 5, -2, 6, -1, -12, 7, -8, -6, 5, -12, 12, -2, -5, 12, 5, 13, 6, -5, 14, -1, 1, 12, -1, 19, BuiltinOptions.SelectOptions, BuiltinOptions.GreaterOptions, 61, BuiltinOptions.NotEqualOptions, 63, 64, 61, BuiltinOptions.LogicalOrOptions, 64, 58, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.SliceOptions, 61, 58, BuiltinOptions.LeakyReluOptions, BuiltinOptions.FillOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.SquareOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.IfOptions, BuiltinOptions.WhileOptions, BuiltinOptions.WhileOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.DensifyOptions, 20, 21, 21, 32, 35, 27, BuiltinOptions.LessOptions, 18, 28, BuiltinOptions.CastOptions, 21, 12, 17, 21, 15, 26, 9, BuiltinOptions.ExpOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.FillOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.SquareOptions, BuiltinOptions.RankOptions, -8, 3, -8, -5, -7, 6, -10, 0, 9, -7, 25, 28, BuiltinOptions.CastOptions, 24, 21, BuiltinOptions.CastOptions, 28, 22, 30, -11, -5, -2, 1, TransmissionUnpacked.HD_VAL_MAGIC_HB, -5, 6, -9, -8, 3, -12, 28, BuiltinOptions.CastOptions, BuiltinOptions.ArgMaxOptions, 27, BuiltinOptions.LessOptions, BuiltinOptions.NegOptions, 29, BuiltinOptions.ArgMaxOptions, 27, 27, BuiltinOptions.LogSoftmaxOptions, -28, -13, -31, -26, -15, -25, -33, TransmissionUnpacked.HD_VAL_MAGIC_HB, -22, -14, -9, -4, -21, -8, -5, -8, -9, -8, -1, 3, 4, 7, -8, -7, 4, -11, 9, 17, 14, 6, 14, 22, 19, 11, 12, 21, 25, 22, 11, 34, BuiltinOptions.GreaterEqualOptions, 28, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.SquaredDifferenceOptions, -28, -17, -30, -30, -21, -10, -30, -23, -23, -20, -12, -13, -2, -15, 5, 26, BuiltinOptions.ExpOptions, 32, 23, BuiltinOptions.PadV2Options, 22, 23, BuiltinOptions.LessOptions, 34, BuiltinOptions.LessOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.NegOptions, 35, BuiltinOptions.ArgMaxOptions, BuiltinOptions.CastOptions, 10, 15, 5, 10, 2, 15, 19, 6, 5, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.ResizeNearestNeighborOptions, 64, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.LeakyReluOptions, 1, 14, 7, 10, 17, 31, 28, 21, 31, 29, -7, -18, 3, -14, -5, -15, -14, -1, 0, -11, 10, -7, 2, -8, -7, 6, -10, 0, 9, 7, -4, BuiltinOptions.SelectOptions, BuiltinOptions.LogSoftmaxOptions, 58, BuiltinOptions.TransposeConvOptions, BuiltinOptions.NegOptions, BuiltinOptions.EqualOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.RankOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.AddNOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.LogicalOrOptions, 61, BuiltinOptions.RangeOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.ResizeNearestNeighborOptions, 58, -5, -8, -10, -9, 3, -14, -2, 1, TransmissionUnpacked.HD_VAL_MAGIC_HB, -5, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.WhereOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.NegOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.CastOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.CastOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.NegOptions, 34, 35, BuiltinOptions.GreaterOptions, BuiltinOptions.SliceOptions, BuiltinOptions.GreaterEqualOptions, 34, BuiltinOptions.ShapeOptions, 35, BuiltinOptions.NegOptions, BuiltinOptions.NegOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.EqualOptions, 29, 26, 24, 25, BuiltinOptions.CastOptions, 24, 35, 18, BuiltinOptions.NegOptions, -13, TransmissionUnpacked.HD_VAL_MAGIC_HB, -18, -17, -5, -18, -7, -20, -20, -11, BuiltinOptions.TileOptions, BuiltinOptions.SliceOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.SelectOptions, BuiltinOptions.PackOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.GreaterOptions, 64, -24, -27, -29, -28, TransmissionUnpacked.HD_VAL_MAGIC_HB, -20, -27, -22, -25, BuiltinOptions.DensifyOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.HashtableOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.BatchMatMulOptions, -6, -9, -11, -10, 2, 1, -13, -17, -11, 0, -13, -13, -4, BuiltinOptions.AddNOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.AbsOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.FloorModOptions, BuiltinOptions.AddNOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.RankOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.HardSwishOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.CosOptions, BuiltinOptions.RankOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.BroadcastToOptions, 29, 26, 24, 25, BuiltinOptions.CastOptions, BuiltinOptions.LogSoftmaxOptions, 29, 18, BuiltinOptions.CastOptions, 22, 24, 35, 22, BuiltinOptions.NegOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.RankOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.FloorModOptions, -24, -27, -29, -28, TransmissionUnpacked.HD_VAL_MAGIC_HB, -11, -31, -24, -24, -21, -13, 34, 31, 35, 27, BuiltinOptions.AbsOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.RangeOptions, BuiltinOptions.CosOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.UniqueOptions, -12, -15, -10, -19, -10, BuiltinOptions.DensifyOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.WhileOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.AbsOptions, BuiltinOptions.SquareOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.SelectOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.TileOptions, 63, BuiltinOptions.ShapeOptions, BuiltinOptions.PadV2Options, BuiltinOptions.PackOptions, 63, BuiltinOptions.PadV2Options, BuiltinOptions.ShapeOptions, BuiltinOptions.PadV2Options, BuiltinOptions.LogicalOrOptions, BuiltinOptions.TileOptions, BuiltinOptions.PowOptions, BuiltinOptions.SelectOptions, BuiltinOptions.SquareOptions, 58, BuiltinOptions.ArgMinOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.SquareOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.ResizeNearestNeighborOptions, 58, -12, -20, -21, TransmissionUnpacked.HD_VAL_MAGIC_HB, -4, -12, -10, -7, -22, -17, TransmissionUnpacked.HD_VAL_MAGIC_HB, -21, BuiltinOptions.ArgMinOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SliceOptions, BuiltinOptions.EqualOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.PowOptions, BuiltinOptions.TransposeConvOptions, 19, 11, 10, 15, 27, 19, 25, 11, 7, 13, 24, 11, 11, 20, -22, -30, -31, -26, -14, -22, TransmissionUnpacked.HD_VAL_MAGIC_HB, -23, -34, 
        -15, -30, -33, -23, -14, -30, BuiltinOptions.PowOptions, BuiltinOptions.SliceOptions, BuiltinOptions.SelectOptions, BuiltinOptions.ExpandDimsOptions, 64, BuiltinOptions.PowOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.PackOptions, 61, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.SparseToDenseOptions, 61, BuiltinOptions.SliceOptions, BuiltinOptions.SliceOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.PackOptions, BuiltinOptions.TileOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.PackOptions, BuiltinOptions.SquareOptions, BuiltinOptions.ZerosLikeOptions, 64, 63, BuiltinOptions.ZerosLikeOptions, 61, BuiltinOptions.ShapeOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.TileOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, 63, BuiltinOptions.LogicalAndOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.RangeOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, 63, BuiltinOptions.AbsOptions, BuiltinOptions.SquaredDifferenceOptions, 63, BuiltinOptions.LogicalAndOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.WhereOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.WhileOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.RankOptions, BuiltinOptions.PowOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.ArgMinOptions, 63, BuiltinOptions.LessEqualOptions, 61, BuiltinOptions.SliceOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.PowOptions, BuiltinOptions.LogSoftmaxOptions, 32, BuiltinOptions.NegOptions, BuiltinOptions.PadV2Options, BuiltinOptions.SliceOptions, BuiltinOptions.LessOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.NegOptions, 28, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.DequantizeOptions, 26, 26, 24, BuiltinOptions.NegOptions, 32, BuiltinOptions.CastOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.QuantizeOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.RankOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.CastOptions, 58, 61, -14, -17, -25, -17, -28, -26, -24, 20, 17, 14, 27, 10, -14, -17, -20, -7, -24, -25, -11, -28, -27, 27, 30, 13, 26, 19, 17, 8, 11, -6, 7, 0, -2, 11, -2, -3, 5, 8, -7, -2, -1, -6, BuiltinOptions.TransposeConvOptions, 34, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.SliceOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.CastOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.SelectOptions, BuiltinOptions.TileOptions, BuiltinOptions.SliceOptions, BuiltinOptions.CastOptions, 12, -3, 8, 1, 3, 14, 1, 1, 10, -1, TransmissionUnpacked.HD_VAL_MAGIC_HB, -5, -12, 3, 4, 1, 0, 4, -2, -8, 2, -12, 24, 9, 20, 13, 30, 17, 23, 20, 13, 28, 26, 13, 12, 21, 6, 21, 6, 30, 6, 28, 13, 14, 21, 6, -5, -9, -7, -2, 6, 11, -4, -4, -9, -20, -7, -4, BuiltinOptions.TileOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.Rfft2dOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.LessOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.SliceOptions, 29, 30, BuiltinOptions.PadV2Options, 27, BuiltinOptions.CastOptions, BuiltinOptions.LessEqualOptions, 30, -6, -1, -4, -6, -10, -17, BuiltinOptions.UnidirectionalSequenceLSTMOptions, 58, BuiltinOptions.ShapeOptions, 58, BuiltinOptions.PowOptions, BuiltinOptions.PowOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.FloorDivOptions, 58, 17, 4, 3, BuiltinOptions.FloorDivOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.TransposeConvOptions, 0, -11, TransmissionUnpacked.HD_VAL_MAGIC_HB, -17, BuiltinOptions.PackOptions, BuiltinOptions.PowOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.SquareOptions, BuiltinOptions.PadV2Options, BuiltinOptions.PackOptions, BuiltinOptions.PowOptions, 64, BuiltinOptions.ShapeOptions, 32, 29, BuiltinOptions.MaximumMinimumOptions, 15, 26, 16, 26, 35, 19, 27, 9, 12, 12, 20, 13, 10, 26, 23, 31, 22, 30, 12, 23, 24, 26, 25, 20, 2, 15, 5, 26, 3, 19, 16, 24, 15, 0, -14, -18, -12, -1, -14, -14, -5, 28, 14, 10, 28, 17, 14, 21, 21, 13, 3, -1, 8, 8, -5, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.RangeOptions, BuiltinOptions.RankOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.HashtableOptions, BuiltinOptions.HardSwishOptions, 58, BuiltinOptions.TileOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.PackOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.LessOptions, BuiltinOptions.TileOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.GreaterOptions, -3, -10, -21, -2, -17, -15, -4, -21, 3, BuiltinOptions.FloorDivOptions, 58, BuiltinOptions.SelectOptions, BuiltinOptions.SquareOptions, BuiltinOptions.TileOptions, BuiltinOptions.EqualOptions, 64, BuiltinOptions.TileOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.CosOptions, BuiltinOptions.WhereOptions, BuiltinOptions.WhileOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.SquaredDifferenceOptions, 63, 63, BuiltinOptions.FloorModOptions, -6, -5, -20, -20, -13, -23, -13, -4, -20, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.IfOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.RangeOptions, BuiltinOptions.CosOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.LogicalOrOptions, 61, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.FloorModOptions, 64, BuiltinOptions.ArgMinOptions, 32, 27, 25, 13, 32, 27, 24, 22, 5, 18, 23, 20, 5, 22, 9, 18, 24, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.PadV2Options, BuiltinOptions.NegOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.ArgMaxOptions, 34, BuiltinOptions.GreaterOptions, 30, 9, -4, 2, -1, -8, 7, BuiltinOptions.TileOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.ExpOptions, 29, BuiltinOptions.SliceOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.WhereOptions, 24, 9, 10, 21, 6, 20, 14, 16, 12, 6, BuiltinOptions.NotEqualOptions, 34, BuiltinOptions.LessOptions, BuiltinOptions.LessOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.GreaterEqualOptions, 25, 32, 32, 35, BuiltinOptions.PadV2Options, 27, BuiltinOptions.DequantizeOptions, 25, 25, 34};
    }

    static {
        A04();
        A04 = Pattern.compile(A03(1, 38, 28));
        A03 = Pattern.compile(A03(91, 49, 31));
        A02 = Pattern.compile(A03(39, 52, 60));
        A01 = new HashMap();
        A01.put(A03(140, 9, 53), -984833);
        A01.put(A03(149, 12, 85), -332841);
        A01.put(A03(161, 4, 11), -16711681);
        A01.put(A03(165, 10, 93), -8388652);
        A01.put(A03(DeviceFeatures.AUDIO_MEMORANDUM, 5, 8), -983041);
        A01.put(A03(180, 5, 30), -657956);
        A01.put(A03(Opcodes.INVOKEINTERFACE, 6, 92), -6972);
        A01.put(A03(DeviceFeatures.DIAL_THUMB, 5, 1), -16777216);
        A01.put(A03(DeviceFeatures.DEVICE_SOUND_NEW, 14, 59), -5171);
        A01.put(A03(210, 4, 26), -16776961);
        A01.put(A03(214, 10, 36), -7722014);
        A01.put(A03(224, 5, 127), -5952982);
        A01.put(A03(229, 9, 31), -2180985);
        A01.put(A03(TelnetCommand.ABORT, 9, 116), -10510688);
        A01.put(A03(247, 10, 112), -8388864);
        A01.put(A03(257, 9, 52), -2987746);
        A01.put(A03(266, 5, 83), -32944);
        A01.put(A03(SportTypeConstant.Course_leg_advanced, 14, 16), -10185235);
        A01.put(A03(SportTypeConstant.Course_24, 8, 11), -1828);
        A01.put(A03(SportTypeConstant.Course_32, 7, 23), -2354116);
        A01.put(A03(300, 4, 75), -16711681);
        A01.put(A03(304, 8, 95), -16777077);
        A01.put(A03(312, 8, 89), -16741493);
        A01.put(A03(320, 13, 47), -4684277);
        A01.put(A03(333, 8, 85), -5658199);
        A01.put(A03(341, 9, 108), -16751616);
        A01.put(A03(FTPReply.FILE_ACTION_PENDING, 8, 27), -5658199);
        A01.put(A03(358, 9, 48), -4343957);
        A01.put(A03(367, 11, 3), -7667573);
        A01.put(A03(378, 14, 0), -11179217);
        A01.put(A03(392, 10, 96), -29696);
        A01.put(A03(402, 10, 3), -6737204);
        A01.put(A03(412, 7, 24), -7667712);
        A01.put(A03(Videoio.CAP_PROP_XI_AEAG_LEVEL, 10, 127), -1468806);
        A01.put(A03(Videoio.CAP_PROP_XI_BINNING_HORIZONTAL, 12, 70), -7357297);
        A01.put(A03(441, 13, 69), -12042869);
        A01.put(A03(454, 13, 26), -13676721);
        A01.put(A03(Videoio.CAP_PROP_XI_TARGET_TEMP, 13, 33), -13676721);
        A01.put(A03(480, 13, 82), -16724271);
        A01.put(A03(493, 10, 96), -7077677);
        A01.put(A03(503, 8, 127), -60269);
        A01.put(A03(511, 11, 55), -16728065);
        A01.put(A03(522, 7, 47), -9868951);
        A01.put(A03(Videoio.CAP_PROP_XI_IMAGE_DATA_FORMAT_RGB32_ALPHA, 7, 100), -9868951);
        A01.put(A03(536, 10, 27), -14774017);
        A01.put(A03(Videoio.CAP_PROP_XI_TS_RST_SOURCE, 9, 58), -5103070);
        A01.put(A03(Videoio.CAP_PROP_XI_COLUMN_FPN_CORRECTION, 11, 22), -1296);
        A01.put(A03(566, 11, 61), -14513374);
        A01.put(A03(577, 7, 5), -65281);
        A01.put(A03(584, 9, 16), -2302756);
        A01.put(A03(593, 10, 23), -460545);
        A01.put(A03(603, 4, 41), -10496);
        A01.put(A03(TypedValues.MotionType.TYPE_PATHMOTION_ARC, 9, 46), -2448096);
        A01.put(A03(616, 4, 66), -8355712);
        A01.put(A03(620, 5, 101), -16744448);
        A01.put(A03(625, 11, 4), -5374161);
        A01.put(A03(636, 4, 19), -8355712);
        A01.put(A03(640, 8, 57), -983056);
        A01.put(A03(648, 7, 65), -38476);
        A01.put(A03(655, 9, 40), -3318692);
        A01.put(A03(664, 6, 99), -11861886);
        A01.put(A03(670, 5, 31), -16);
        A01.put(A03(675, 5, 59), -989556);
        A01.put(A03(680, 8, 20), -1644806);
        A01.put(A03(688, 13, 27), -3851);
        A01.put(A03(701, 9, 74), -8586240);
        A01.put(A03(Constants.AUDIO_MIXING_STATE_PLAYING, 12, 113), -1331);
        A01.put(A03(722, 9, 92), -5383962);
        A01.put(A03(731, 10, 22), -1015680);
        A01.put(A03(741, 9, 121), -2031617);
        A01.put(A03(UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS, 20, 69), -329006);
        A01.put(A03(770, 9, 56), -2894893);
        A01.put(A03(779, 10, 14), -7278960);
        A01.put(A03(789, 9, 78), -2894893);
        A01.put(A03(798, 9, 3), -18751);
        A01.put(A03(807, 11, 126), -24454);
        A01.put(A03(818, 13, 21), -14634326);
        A01.put(A03(831, 12, 109), -7876870);
        A01.put(A03(843, 14, 118), -8943463);
        A01.put(A03(857, 14, 56), -8943463);
        A01.put(A03(871, 14, 106), -5192482);
        A01.put(A03(885, 11, 3), -32);
        A01.put(A03(896, 4, 61), -16711936);
        A01.put(A03(900, 9, 105), -13447886);
        A01.put(A03(PictureConfig.REQUEST_CAMERA, 5, 15), -331546);
        A01.put(A03(914, 7, 125), -65281);
        A01.put(A03(921, 6, 104), -8388608);
        A01.put(A03(927, 16, 81), -10039894);
        A01.put(A03(943, 10, 92), -16777011);
        A01.put(A03(953, 12, 14), -4565549);
        A01.put(A03(965, 12, 83), -7114533);
        A01.put(A03(977, 14, 45), -12799119);
        A01.put(A03(991, 15, 4), -8689426);
        A01.put(A03(1006, 17, 82), -16713062);
        A01.put(A03(1023, 15, 85), -12004916);
        A01.put(A03(AppStartParams.SCENE_NAVIGATE_BACK, 15, 97), -3730043);
        A01.put(A03(1053, 12, 120), -15132304);
        A01.put(A03(1065, 9, 82), -655366);
        A01.put(A03(1074, 9, 62), -6943);
        A01.put(A03(1083, 8, 62), -6987);
        A01.put(A03(1091, 11, 105), -8531);
        A01.put(A03(1102, 4, 75), -16777088);
        A01.put(A03(1106, 7, 10), -133658);
        A01.put(A03(RtcEngineEvent.EvtType.EVT_JOIN_PUBLISHER, 5, 44), -8355840);
        A01.put(A03(RtcEngineEvent.EvtType.EVT_LOCAL_VIDEO_STATE_CHANGED, 9, 10), -9728477);
        A01.put(A03(1127, 6, 51), -23296);
        A01.put(A03(1133, 9, 32), -47872);
        A01.put(A03(1142, 6, 29), -2461482);
        A01.put(A03(1148, 13, 72), -1120086);
        A01.put(A03(1161, 9, 35), -6751336);
        A01.put(A03(1170, 13, 22), -5247250);
        A01.put(A03(1183, 13, 47), -2396013);
        A01.put(A03(1196, 10, 44), -4139);
        A01.put(A03(1206, 9, 29), -9543);
        A01.put(A03(1215, 4, 14), -3308225);
        A01.put(A03(1219, 4, 74), -16181);
        A01.put(A03(1223, 4, 123), -2252579);
        A01.put(A03(1227, 10, 64), -5185306);
        A01.put(A03(1237, 6, 17), -8388480);
        A01.put(A03(1243, 13, 92), -10079335);
        A01.put(A03(1256, 3, 38), Integer.valueOf(SupportMenu.CATEGORY_MASK));
        A01.put(A03(1266, 9, 80), -4419697);
        A01.put(A03(1275, 9, 53), -12490271);
        A01.put(A03(1284, 11, 47), -7650029);
        A01.put(A03(1295, 6, 50), -360334);
        A01.put(A03(1301, 10, 40), -744352);
        A01.put(A03(1311, 8, 20), -13726889);
        A01.put(A03(1319, 8, 48), -2578);
        A01.put(A03(1327, 6, 33), -6270419);
        A01.put(A03(1333, 6, 107), -4144960);
        A01.put(A03(1339, 7, 125), -7876885);
        A01.put(A03(1346, 9, 78), -9807155);
        A01.put(A03(1355, 9, 17), -9404272);
        A01.put(A03(1364, 9, 85), -9404272);
        A01.put(A03(1373, 4, 109), -1286);
        A01.put(A03(1377, 11, 97), -16711809);
        A01.put(A03(1388, 9, 14), -12156236);
        A01.put(A03(1397, 3, 90), -2968436);
        A01.put(A03(1400, 4, 111), -16744320);
        A01.put(A03(1404, 7, 91), -2572328);
        A01.put(A03(1411, 6, 51), -40121);
        A01.put(A03(1417, 11, 43), 0);
        A01.put(A03(1428, 9, 64), -12525360);
        A01.put(A03(1437, 6, 26), -1146130);
        A01.put(A03(1443, 5, 67), -663885);
        A01.put(A03(1448, 5, 119), -1);
        A01.put(A03(1453, 10, 40), -657931);
        A01.put(A03(1463, 6, 68), Integer.valueOf(InputDeviceCompat.SOURCE_ANY));
        A01.put(A03(1469, 11, 59), -6632142);
    }

    public static int A00(String str) {
        return A02(str, true);
    }

    public static int A01(String str) {
        return A02(str, false);
    }

    public static int A02(String str, boolean z) {
        int parseInt;
        C3M.A07(!TextUtils.isEmpty(str));
        String replace = str.replace(A03(0, 1, 74), A03(0, 0, 45));
        if (replace.charAt(0) == '#') {
            int parseLong = (int) Long.parseLong(replace.substring(1), 16);
            if (replace.length() == 7) {
                return (-16777216) | parseLong;
            }
            if (replace.length() == 9) {
                return ((parseLong & 255) << 24) | (parseLong >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (replace.startsWith(A03(SportTypeConstant.Course_1001, 4, 21))) {
            Matcher matcher = (z ? A02 : A03).matcher(replace);
            if (matcher.matches()) {
                if (z) {
                    parseInt = (int) (Float.parseFloat((String) C3M.A01(matcher.group(4))) * 255.0f);
                } else {
                    parseInt = Integer.parseInt((String) C3M.A01(matcher.group(4)), 10);
                }
                return Color.argb(parseInt, Integer.parseInt((String) C3M.A01(matcher.group(1)), 10), Integer.parseInt((String) C3M.A01(matcher.group(2)), 10), Integer.parseInt((String) C3M.A01(matcher.group(3)), 10));
            }
        } else if (replace.startsWith(A03(1259, 3, 86))) {
            Matcher matcher2 = A04.matcher(replace);
            if (matcher2.matches()) {
                return Color.rgb(Integer.parseInt((String) C3M.A01(matcher2.group(1)), 10), Integer.parseInt((String) C3M.A01(matcher2.group(2)), 10), Integer.parseInt((String) C3M.A01(matcher2.group(3)), 10));
            }
        } else {
            Integer color = A01.get(AbstractC2535iY.A01(replace));
            if (color != null) {
                return color.intValue();
            }
        }
        throw new IllegalArgumentException();
    }
}
