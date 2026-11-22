package org.bouncycastle.crypto.engines;

import com.baidu.bbalbscesium.i.j;
import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import com.bluetrum.fota.manager.OtaCommandGenerator;
import com.facebook.imageutils.JfifUtil;
import com.hispark.crashdump.protocol.ProtocolBytes;
import com.wakeup.common.DeviceFeatures;
import java.lang.reflect.Array;
import org.apache.commons.net.nntp.NNTPReply;
import org.apache.commons.net.telnet.TelnetCommand;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: classes8.dex */
public class RijndaelEngine implements BlockCipher {
    private static final int MAXKC = 64;
    private static final int MAXROUNDS = 14;
    private long A0;
    private long A1;
    private long A2;
    private long A3;
    private int BC;
    private long BC_MASK;
    private int ROUNDS;
    private int blockBits;
    private boolean forEncryption;
    private byte[] shifts0SC;
    private byte[] shifts1SC;
    private long[][] workingKey;
    private static final byte[] logtable = {0, 0, 25, 1, BuiltinOptions.SparseToDenseOptions, 2, 26, -58, BuiltinOptions.LeakyReluOptions, -57, 27, BuiltinOptions.BroadcastToOptions, BuiltinOptions.TileOptions, -18, -33, 3, BuiltinOptions.SegmentSumOptions, 4, -32, 14, BuiltinOptions.ExpandDimsOptions, -115, -127, -17, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.AssignVariableOptions, 8, -56, -8, BuiltinOptions.Rfft2dOptions, 28, -63, BuiltinOptions.BitwiseXorOptions, -62, 29, -75, -7, -71, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.MirrorPadOptions, -28, -90, BuiltinOptions.RandomOptions, -102, -55, 9, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.SelectOptions, -118, 5, BuiltinOptions.ExpOptions, 15, -31, BuiltinOptions.LogSoftmaxOptions, 18, TransmissionUnpacked.HD_VAL_MAGIC_HB, -126, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.EqualOptions, -109, -38, -114, -106, -113, -37, -67, BuiltinOptions.NotEqualOptions, -48, -50, -108, 19, BuiltinOptions.IfOptions, -46, -15, 64, BuiltinOptions.BidirectionalSequenceRNNOptions, -125, BuiltinOptions.PowOptions, BuiltinOptions.CumsumOptions, -35, -3, BuiltinOptions.SliceOptions, -65, 6, -117, BuiltinOptions.SelectV2Options, -77, BuiltinOptions.CastOptions, -30, -104, 34, -120, OtaCommandGenerator.CMD_GET_INFO, 16, BuiltinOptions.RightShiftOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.FloorModOptions, -61, -93, -74, 30, BuiltinOptions.SquareOptions, 58, BuiltinOptions.HashtableOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.CosOptions, -6, -123, 61, -70, BuiltinOptions.PadV2Options, BuiltinOptions.UnsortedSegmentSumOptions, 10, 21, -101, -97, BuiltinOptions.DepthToSpaceOptions, -54, BuiltinOptions.AbsOptions, -44, -84, -27, -13, BuiltinOptions.BucketizeOptions, -89, BuiltinOptions.ReverseSequenceOptions, ProtocolBytes.SOF, BuiltinOptions.MatrixDiagOptions, -88, BuiltinOptions.UniqueOptions, -12, -22, -42, BuiltinOptions.GeluOptions, BuiltinOptions.SplitVOptions, -82, -23, TransmissionUnpacked.HD_VAL_MAGIC_LB, -25, -26, -83, -24, BuiltinOptions.GreaterOptions, -41, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.ATan2Options, -21, 22, 11, -11, BuiltinOptions.QuantizeOptions, -53, BuiltinOptions.NonMaxSuppressionV4Options, -80, -100, -87, BuiltinOptions.ReverseV2Options, OtaCommandGenerator.CMD_OTA_INFO, Byte.MAX_VALUE, 12, -10, BuiltinOptions.VarHandleOptions, 23, -60, BuiltinOptions.RangeOptions, -20, -40, BuiltinOptions.ZerosLikeOptions, 31, BuiltinOptions.GreaterEqualOptions, -92, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.SignOptions, -73, -52, -69, BuiltinOptions.LogicalAndOptions, BuiltinOptions.MatrixSetDiagOptions, -5, BuiltinOptions.NonMaxSuppressionV5Options, -79, -122, BuiltinOptions.PackOptions, BuiltinOptions.AddNOptions, -95, BuiltinOptions.HashtableFindOptions, -86, BuiltinOptions.WhereOptions, BuiltinOptions.LessOptions, -99, -105, -78, -121, OtaCommandGenerator.CMD_NOTIFY_STATUS, BuiltinOptions.ScatterNdOptions, -66, -36, -4, PSSSigner.TRAILER_IMPLICIT, -107, -49, -51, BuiltinOptions.ShapeOptions, 63, BuiltinOptions.HardSwishOptions, -47, BuiltinOptions.GatherNdOptions, BuiltinOptions.ArgMinOptions, -124, BuiltinOptions.LogicalOrOptions, BuiltinOptions.FloorDivOptions, -94, BuiltinOptions.HashtableImportOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, 20, BuiltinOptions.NegOptions, -98, BuiltinOptions.WhileOptions, BuiltinOptions.RankOptions, -14, -45, -85, BuiltinOptions.FillOptions, 17, OtaCommandGenerator.CMD_GET_INFO_TLV, -39, 35, 32, BuiltinOptions.LessEqualOptions, -119, -76, BuiltinOptions.BitcastOptions, -72, BuiltinOptions.DequantizeOptions, BuiltinOptions.UnsortedSegmentMaxOptions, -103, -29, -91, BuiltinOptions.CallOnceOptions, BuiltinOptions.ResizeNearestNeighborOptions, -19, -34, -59, BuiltinOptions.TransposeConvOptions, -2, 24, 13, BuiltinOptions.DensifyOptions, -116, Byte.MIN_VALUE, -64, -9, BuiltinOptions.ReadVariableOptions, 7};
    private static final byte[] aLogtable = {0, 3, 5, 15, 17, BuiltinOptions.TileOptions, BuiltinOptions.WhereOptions, -1, 26, BuiltinOptions.LessEqualOptions, BuiltinOptions.RandomOptions, -106, -95, -8, 19, BuiltinOptions.EqualOptions, BuiltinOptions.NonMaxSuppressionV4Options, -31, BuiltinOptions.PowOptions, BuiltinOptions.FloorModOptions, -40, BuiltinOptions.BucketizeOptions, -107, -92, -9, 2, 6, 10, 30, 34, BuiltinOptions.CumsumOptions, -86, -27, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.IfOptions, -28, BuiltinOptions.ShapeOptions, BuiltinOptions.QuantizeOptions, -21, BuiltinOptions.DequantizeOptions, BuiltinOptions.Conv3DOptions, -66, -39, BuiltinOptions.ReadVariableOptions, OtaCommandGenerator.CMD_NOTIFY_STATUS, -85, -26, BuiltinOptions.TransposeConvOptions, BuiltinOptions.GatherNdOptions, -11, 4, 12, 20, BuiltinOptions.LogicalOrOptions, BuiltinOptions.FillOptions, -52, BuiltinOptions.SplitVOptions, -47, BuiltinOptions.BroadcastToOptions, -72, -45, BuiltinOptions.HashtableSizeOptions, -78, -51, BuiltinOptions.SquaredDifferenceOptions, -44, BuiltinOptions.CallOnceOptions, -87, -32, BuiltinOptions.PackOptions, BuiltinOptions.MirrorPadOptions, -41, BuiltinOptions.SelectV2Options, -90, -15, 8, 24, BuiltinOptions.ArgMaxOptions, BuiltinOptions.UnsortedSegmentMinOptions, -120, -125, -98, -71, -48, BuiltinOptions.HashtableOptions, -67, -36, Byte.MAX_VALUE, -127, -104, -77, -50, BuiltinOptions.RangeOptions, -37, BuiltinOptions.UnsortedSegmentProdOptions, -102, -75, -60, BuiltinOptions.ReverseSequenceOptions, -7, 16, BuiltinOptions.SliceOptions, BuiltinOptions.UniqueOptions, TransmissionUnpacked.HD_VAL_MAGIC_HB, 11, 29, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.Rfft2dOptions, -69, -42, BuiltinOptions.ScatterNdOptions, -93, -2, 25, BuiltinOptions.PadV2Options, BuiltinOptions.BitwiseXorOptions, -121, OtaCommandGenerator.CMD_GET_INFO_TLV, -83, -20, BuiltinOptions.SelectOptions, BuiltinOptions.AssignVariableOptions, -109, -82, -23, 32, BuiltinOptions.NonMaxSuppressionV5Options, OtaCommandGenerator.CMD_OTA_INFO, -5, 22, 58, BuiltinOptions.AbsOptions, -46, BuiltinOptions.HashtableImportOptions, -73, -62, BuiltinOptions.WhileOptions, -25, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.RankOptions, -6, 21, 63, BuiltinOptions.FloorDivOptions, -61, BuiltinOptions.DepthToSpaceOptions, -30, 61, BuiltinOptions.UnidirectionalSequenceLSTMOptions, -55, 64, -64, BuiltinOptions.HardSwishOptions, -19, BuiltinOptions.GreaterOptions, BuiltinOptions.GeluOptions, -100, -65, -38, BuiltinOptions.DynamicUpdateSliceOptions, -97, -70, TransmissionUnpacked.HD_VAL_MAGIC_LB, BuiltinOptions.SegmentSumOptions, -84, -17, BuiltinOptions.NegOptions, BuiltinOptions.RightShiftOptions, -126, -99, PSSSigner.TRAILER_IMPLICIT, -33, BuiltinOptions.ATan2Options, -114, -119, Byte.MIN_VALUE, -101, -74, -63, BuiltinOptions.MatrixDiagOptions, -24, 35, BuiltinOptions.BatchMatMulOptions, ProtocolBytes.SOF, -22, BuiltinOptions.CastOptions, BuiltinOptions.VarHandleOptions, -79, -56, BuiltinOptions.ZerosLikeOptions, -59, BuiltinOptions.CosOptions, -4, 31, BuiltinOptions.ExpOptions, BuiltinOptions.DensifyOptions, -91, -12, 7, 9, 27, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.UnsortedSegmentMaxOptions, -103, -80, -53, BuiltinOptions.BidirectionalSequenceRNNOptions, -54, BuiltinOptions.BidirectionalSequenceLSTMOptions, -49, BuiltinOptions.ResizeNearestNeighborOptions, -34, BuiltinOptions.UnsortedSegmentSumOptions, -117, -122, OtaCommandGenerator.CMD_GET_INFO, -88, -29, BuiltinOptions.LogicalAndOptions, BuiltinOptions.SquareOptions, -58, BuiltinOptions.ReverseV2Options, -13, 14, 18, BuiltinOptions.NotEqualOptions, BuiltinOptions.MatrixSetDiagOptions, -18, BuiltinOptions.LessOptions, BuiltinOptions.SignOptions, -115, -116, -113, -118, -123, -108, -89, -14, 13, 23, BuiltinOptions.ArgMinOptions, BuiltinOptions.LeakyReluOptions, -35, BuiltinOptions.BitcastOptions, -124, -105, -94, -3, 28, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.HashtableFindOptions, -76, -57, BuiltinOptions.AddNOptions, -10, 1, 3, 5, 15, 17, BuiltinOptions.TileOptions, BuiltinOptions.WhereOptions, -1, 26, BuiltinOptions.LessEqualOptions, BuiltinOptions.RandomOptions, -106, -95, -8, 19, BuiltinOptions.EqualOptions, BuiltinOptions.NonMaxSuppressionV4Options, -31, BuiltinOptions.PowOptions, BuiltinOptions.FloorModOptions, -40, BuiltinOptions.BucketizeOptions, -107, -92, -9, 2, 6, 10, 30, 34, BuiltinOptions.CumsumOptions, -86, -27, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.IfOptions, -28, BuiltinOptions.ShapeOptions, BuiltinOptions.QuantizeOptions, -21, BuiltinOptions.DequantizeOptions, BuiltinOptions.Conv3DOptions, -66, -39, BuiltinOptions.ReadVariableOptions, OtaCommandGenerator.CMD_NOTIFY_STATUS, -85, -26, BuiltinOptions.TransposeConvOptions, BuiltinOptions.GatherNdOptions, -11, 4, 12, 20, BuiltinOptions.LogicalOrOptions, BuiltinOptions.FillOptions, -52, BuiltinOptions.SplitVOptions, -47, BuiltinOptions.BroadcastToOptions, -72, -45, BuiltinOptions.HashtableSizeOptions, -78, -51, BuiltinOptions.SquaredDifferenceOptions, -44, BuiltinOptions.CallOnceOptions, -87, -32, BuiltinOptions.PackOptions, BuiltinOptions.MirrorPadOptions, -41, BuiltinOptions.SelectV2Options, -90, -15, 8, 24, BuiltinOptions.ArgMaxOptions, BuiltinOptions.UnsortedSegmentMinOptions, -120, -125, -98, -71, -48, BuiltinOptions.HashtableOptions, -67, -36, Byte.MAX_VALUE, -127, -104, -77, -50, BuiltinOptions.RangeOptions, -37, BuiltinOptions.UnsortedSegmentProdOptions, -102, -75, -60, BuiltinOptions.ReverseSequenceOptions, -7, 16, BuiltinOptions.SliceOptions, BuiltinOptions.UniqueOptions, TransmissionUnpacked.HD_VAL_MAGIC_HB, 11, 29, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.Rfft2dOptions, -69, -42, BuiltinOptions.ScatterNdOptions, -93, -2, 25, BuiltinOptions.PadV2Options, BuiltinOptions.BitwiseXorOptions, -121, OtaCommandGenerator.CMD_GET_INFO_TLV, -83, -20, BuiltinOptions.SelectOptions, BuiltinOptions.AssignVariableOptions, -109, -82, -23, 32, BuiltinOptions.NonMaxSuppressionV5Options, OtaCommandGenerator.CMD_OTA_INFO, -5, 22, 58, BuiltinOptions.AbsOptions, -46, BuiltinOptions.HashtableImportOptions, -73, -62, BuiltinOptions.WhileOptions, -25, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.RankOptions, -6, 21, 63, BuiltinOptions.FloorDivOptions, -61, BuiltinOptions.DepthToSpaceOptions, -30, 61, BuiltinOptions.UnidirectionalSequenceLSTMOptions, -55, 64, -64, BuiltinOptions.HardSwishOptions, -19, BuiltinOptions.GreaterOptions, BuiltinOptions.GeluOptions, -100, -65, -38, BuiltinOptions.DynamicUpdateSliceOptions, -97, -70, TransmissionUnpacked.HD_VAL_MAGIC_LB, BuiltinOptions.SegmentSumOptions, -84, -17, BuiltinOptions.NegOptions, BuiltinOptions.RightShiftOptions, -126, -99, PSSSigner.TRAILER_IMPLICIT, -33, BuiltinOptions.ATan2Options, -114, -119, Byte.MIN_VALUE, -101, -74, -63, BuiltinOptions.MatrixDiagOptions, -24, 35, BuiltinOptions.BatchMatMulOptions, ProtocolBytes.SOF, -22, BuiltinOptions.CastOptions, BuiltinOptions.VarHandleOptions, -79, -56, BuiltinOptions.ZerosLikeOptions, -59, BuiltinOptions.CosOptions, -4, 31, BuiltinOptions.ExpOptions, BuiltinOptions.DensifyOptions, -91, -12, 7, 9, 27, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.UnsortedSegmentMaxOptions, -103, -80, -53, BuiltinOptions.BidirectionalSequenceRNNOptions, -54, BuiltinOptions.BidirectionalSequenceLSTMOptions, -49, BuiltinOptions.ResizeNearestNeighborOptions, -34, BuiltinOptions.UnsortedSegmentSumOptions, -117, -122, OtaCommandGenerator.CMD_GET_INFO, -88, -29, BuiltinOptions.LogicalAndOptions, BuiltinOptions.SquareOptions, -58, BuiltinOptions.ReverseV2Options, -13, 14, 18, BuiltinOptions.NotEqualOptions, BuiltinOptions.MatrixSetDiagOptions, -18, BuiltinOptions.LessOptions, BuiltinOptions.SignOptions, -115, -116, -113, -118, -123, -108, -89, -14, 13, 23, BuiltinOptions.ArgMinOptions, BuiltinOptions.LeakyReluOptions, -35, BuiltinOptions.BitcastOptions, -124, -105, -94, -3, 28, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.HashtableFindOptions, -76, -57, BuiltinOptions.AddNOptions, -10, 1};
    private static final byte[] S = {BuiltinOptions.DensifyOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.SignOptions, -14, BuiltinOptions.HashtableOptions, BuiltinOptions.VarHandleOptions, -59, BuiltinOptions.SliceOptions, 1, BuiltinOptions.CallOnceOptions, BuiltinOptions.PadV2Options, -2, -41, -85, BuiltinOptions.UnsortedSegmentProdOptions, -54, -126, -55, BuiltinOptions.BitwiseXorOptions, -6, BuiltinOptions.QuantizeOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, TransmissionUnpacked.HD_VAL_MAGIC_HB, -83, -44, -94, ProtocolBytes.SOF, -100, -92, BuiltinOptions.RandomOptions, -64, -73, -3, -109, BuiltinOptions.DequantizeOptions, BuiltinOptions.NotEqualOptions, 63, -9, -52, BuiltinOptions.ExpandDimsOptions, -91, -27, -15, BuiltinOptions.AssignVariableOptions, -40, BuiltinOptions.TransposeConvOptions, 21, 4, -57, 35, -61, 24, -106, 5, -102, 7, 18, Byte.MIN_VALUE, -30, -21, BuiltinOptions.MaximumMinimumOptions, -78, BuiltinOptions.DynamicUpdateSliceOptions, 9, -125, BuiltinOptions.GreaterOptions, 26, 27, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.MatrixSetDiagOptions, OtaCommandGenerator.CMD_OTA_INFO, BuiltinOptions.AddNOptions, BuiltinOptions.PackOptions, -42, -77, BuiltinOptions.LessOptions, -29, BuiltinOptions.SelectOptions, -124, BuiltinOptions.GatherNdOptions, -47, 0, -19, 32, -4, -79, BuiltinOptions.HardSwishOptions, BuiltinOptions.Conv3DOptions, -53, -66, BuiltinOptions.ArgMinOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.MatrixDiagOptions, -49, -48, -17, -86, -5, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.TileOptions, -123, BuiltinOptions.BidirectionalSequenceLSTMOptions, -7, 2, Byte.MAX_VALUE, BuiltinOptions.UniqueOptions, BuiltinOptions.LogicalOrOptions, -97, -88, BuiltinOptions.ReverseV2Options, -93, 64, -113, OtaCommandGenerator.CMD_GET_INFO_TLV, -99, BuiltinOptions.PowOptions, -11, PSSSigner.TRAILER_IMPLICIT, -74, -38, BuiltinOptions.ExpOptions, 16, -1, -13, -46, -51, 12, 19, -20, BuiltinOptions.NonMaxSuppressionV4Options, -105, BuiltinOptions.FillOptions, 23, -60, -89, BuiltinOptions.RightShiftOptions, 61, BuiltinOptions.SegmentSumOptions, BuiltinOptions.WhileOptions, 25, BuiltinOptions.BucketizeOptions, BuiltinOptions.NonMaxSuppressionV5Options, -127, BuiltinOptions.SplitVOptions, -36, 34, BuiltinOptions.NegOptions, OtaCommandGenerator.CMD_NOTIFY_STATUS, -120, BuiltinOptions.BidirectionalSequenceRNNOptions, -18, -72, 20, -34, BuiltinOptions.DepthToSpaceOptions, 11, -37, -32, BuiltinOptions.SparseToDenseOptions, 58, 10, BuiltinOptions.RangeOptions, 6, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.IfOptions, -62, -45, -84, BuiltinOptions.SelectV2Options, OtaCommandGenerator.CMD_GET_INFO, -107, -28, BuiltinOptions.UnsortedSegmentSumOptions, -25, -56, BuiltinOptions.ShapeOptions, BuiltinOptions.HashtableImportOptions, -115, TransmissionUnpacked.HD_VAL_MAGIC_LB, BuiltinOptions.AbsOptions, -87, BuiltinOptions.HashtableFindOptions, BuiltinOptions.RankOptions, -12, -22, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.ATan2Options, -82, 8, -70, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.CastOptions, BuiltinOptions.LessEqualOptions, 28, -90, -76, -58, -24, -35, BuiltinOptions.GeluOptions, 31, BuiltinOptions.LeakyReluOptions, -67, -117, -118, BuiltinOptions.ReadVariableOptions, BuiltinOptions.LogicalAndOptions, -75, BuiltinOptions.CumsumOptions, BuiltinOptions.FloorModOptions, 3, -10, 14, BuiltinOptions.ScatterNdOptions, BuiltinOptions.EqualOptions, BuiltinOptions.ReverseSequenceOptions, -71, -122, -63, 29, -98, -31, -8, -104, 17, BuiltinOptions.Rfft2dOptions, -39, -114, -108, -101, 30, -121, -23, -50, BuiltinOptions.WhereOptions, BuiltinOptions.ArgMaxOptions, -33, -116, -95, -119, 13, -65, -26, BuiltinOptions.SquareOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.FloorDivOptions, -103, BuiltinOptions.GreaterEqualOptions, 15, -80, BuiltinOptions.CosOptions, -69, 22};
    private static final byte[] Si = {BuiltinOptions.AddNOptions, 9, BuiltinOptions.Conv3DOptions, TransmissionUnpacked.HD_VAL_MAGIC_LB, BuiltinOptions.SliceOptions, BuiltinOptions.NotEqualOptions, -91, BuiltinOptions.PowOptions, -65, 64, -93, -98, -127, -13, -41, -5, BuiltinOptions.BitcastOptions, -29, BuiltinOptions.ArgMinOptions, -126, -101, BuiltinOptions.SelectOptions, -1, -121, BuiltinOptions.ExpandDimsOptions, -114, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.FillOptions, -60, -34, -23, -53, BuiltinOptions.CosOptions, BuiltinOptions.SignOptions, -108, BuiltinOptions.SparseToDenseOptions, -90, -62, 35, 61, -18, BuiltinOptions.SquaredDifferenceOptions, -107, 11, BuiltinOptions.SquareOptions, -6, -61, BuiltinOptions.AbsOptions, 8, BuiltinOptions.LessEqualOptions, -95, BuiltinOptions.CumsumOptions, BuiltinOptions.ArgMaxOptions, -39, BuiltinOptions.LogSoftmaxOptions, -78, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.HardSwishOptions, -94, BuiltinOptions.RangeOptions, BuiltinOptions.HashtableImportOptions, -117, -47, BuiltinOptions.CastOptions, BuiltinOptions.RandomOptions, -8, -10, BuiltinOptions.SegmentSumOptions, -122, BuiltinOptions.BroadcastToOptions, -104, 22, -44, -92, BuiltinOptions.IfOptions, -52, BuiltinOptions.WhileOptions, BuiltinOptions.BatchMatMulOptions, -74, OtaCommandGenerator.CMD_GET_INFO_TLV, BuiltinOptions.HashtableFindOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.UniqueOptions, -3, -19, -71, -38, BuiltinOptions.DepthToSpaceOptions, 21, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.ReverseSequenceOptions, -89, -115, -99, -124, OtaCommandGenerator.CMD_NOTIFY_STATUS, -40, -85, 0, -116, PSSSigner.TRAILER_IMPLICIT, -45, 10, -9, -28, BuiltinOptions.MatrixDiagOptions, 5, -72, -77, BuiltinOptions.BidirectionalSequenceLSTMOptions, 6, -48, BuiltinOptions.GreaterOptions, 30, -113, -54, 63, 15, 2, -63, ProtocolBytes.SOF, -67, 3, 1, 19, -118, BuiltinOptions.HashtableOptions, 58, OtaCommandGenerator.CMD_GET_INFO, 17, BuiltinOptions.FloorDivOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.CallOnceOptions, -36, -22, -105, -14, -49, -50, TransmissionUnpacked.HD_VAL_MAGIC_HB, -76, -26, BuiltinOptions.BucketizeOptions, -106, -84, BuiltinOptions.GeluOptions, 34, -25, -83, BuiltinOptions.EqualOptions, -123, -30, -7, BuiltinOptions.ShapeOptions, -24, 28, BuiltinOptions.DynamicUpdateSliceOptions, -33, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, -15, 26, BuiltinOptions.AssignVariableOptions, 29, BuiltinOptions.LessOptions, -59, -119, BuiltinOptions.VarHandleOptions, -73, BuiltinOptions.SelectV2Options, 14, -86, 24, -66, 27, -4, BuiltinOptions.RankOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.LeakyReluOptions, -58, -46, BuiltinOptions.UnsortedSegmentSumOptions, 32, -102, -37, -64, -2, BuiltinOptions.UnsortedSegmentMinOptions, -51, BuiltinOptions.MatrixSetDiagOptions, -12, 31, -35, -88, BuiltinOptions.TileOptions, -120, 7, -57, BuiltinOptions.TransposeConvOptions, -79, 18, 16, BuiltinOptions.QuantizeOptions, BuiltinOptions.MaximumMinimumOptions, Byte.MIN_VALUE, -20, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.ReverseV2Options, Byte.MAX_VALUE, -87, 25, -75, BuiltinOptions.ResizeNearestNeighborOptions, 13, BuiltinOptions.GreaterEqualOptions, -27, BuiltinOptions.ATan2Options, -97, -109, -55, -100, -17, OtaCommandGenerator.CMD_OTA_INFO, -32, BuiltinOptions.PackOptions, BuiltinOptions.MirrorPadOptions, -82, BuiltinOptions.NegOptions, -11, -80, -56, -21, -69, BuiltinOptions.LogicalOrOptions, -125, BuiltinOptions.GatherNdOptions, -103, BuiltinOptions.ScatterNdOptions, 23, BuiltinOptions.PadV2Options, 4, BuiltinOptions.RightShiftOptions, -70, BuiltinOptions.UnsortedSegmentMaxOptions, -42, BuiltinOptions.DequantizeOptions, -31, BuiltinOptions.Rfft2dOptions, 20, BuiltinOptions.DensifyOptions, BuiltinOptions.WhereOptions, BuiltinOptions.ExpOptions, 12, BuiltinOptions.BitwiseXorOptions};
    private static final int[] rcon = {1, 2, 4, 8, 16, 32, 64, 128, 27, 54, 108, JfifUtil.MARKER_SOI, DeviceFeatures.AI_AUDIO_SEARCH, 77, 154, 47, 94, 188, 99, 198, 151, 53, 106, 212, DeviceFeatures.MAP_MODE, 125, 250, TelnetCommand.EOR, DeviceFeatures.NETWORK_SHARE, 145};
    static byte[][] shifts0 = {new byte[]{0, 8, 16, 24}, new byte[]{0, 8, 16, 24}, new byte[]{0, 8, 16, 24}, new byte[]{0, 8, 16, 32}, new byte[]{0, 8, 24, 32}};
    static byte[][] shifts1 = {new byte[]{0, 24, 16, 8}, new byte[]{0, 32, 24, 16}, new byte[]{0, BuiltinOptions.ArgMaxOptions, 32, 24}, new byte[]{0, BuiltinOptions.SliceOptions, BuiltinOptions.ArgMaxOptions, 24}, new byte[]{0, BuiltinOptions.PowOptions, BuiltinOptions.ArgMaxOptions, 32}};

    public RijndaelEngine() {
        this(128);
    }

    public RijndaelEngine(int i) {
        if (i == 128) {
            this.BC = 32;
            this.BC_MASK = BodyPartID.bodyIdMax;
            this.shifts0SC = shifts0[0];
            this.shifts1SC = shifts1[0];
        } else if (i == 160) {
            this.BC = 40;
            this.BC_MASK = j.d;
            this.shifts0SC = shifts0[1];
            this.shifts1SC = shifts1[1];
        } else if (i == 192) {
            this.BC = 48;
            this.BC_MASK = 281474976710655L;
            this.shifts0SC = shifts0[2];
            this.shifts1SC = shifts1[2];
        } else if (i == 224) {
            this.BC = 56;
            this.BC_MASK = 72057594037927935L;
            this.shifts0SC = shifts0[3];
            this.shifts1SC = shifts1[3];
        } else {
            if (i != 256) {
                throw new IllegalArgumentException("unknown blocksize to Rijndael");
            }
            this.BC = 64;
            this.BC_MASK = -1L;
            this.shifts0SC = shifts0[4];
            this.shifts1SC = shifts1[4];
        }
        this.blockBits = i;
    }

    private void InvMixColumn() {
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        for (int i = 0; i < this.BC; i += 8) {
            int i2 = (int) ((this.A0 >> i) & 255);
            int i3 = (int) ((this.A1 >> i) & 255);
            int i4 = (int) ((this.A2 >> i) & 255);
            int i5 = (int) ((this.A3 >> i) & 255);
            int i6 = -1;
            int i7 = i2 != 0 ? logtable[i2 & 255] & 255 : -1;
            int i8 = i3 != 0 ? logtable[i3 & 255] & 255 : -1;
            int i9 = i4 != 0 ? logtable[i4 & 255] & 255 : -1;
            if (i5 != 0) {
                i6 = logtable[i5 & 255] & 255;
            }
            j |= ((((mul0xe(i7) ^ mul0xb(i8)) ^ mul0xd(i9)) ^ mul0x9(i6)) & 255) << i;
            j4 |= ((((mul0xe(i8) ^ mul0xb(i9)) ^ mul0xd(i6)) ^ mul0x9(i7)) & 255) << i;
            j2 |= ((((mul0xe(i9) ^ mul0xb(i6)) ^ mul0xd(i7)) ^ mul0x9(i8)) & 255) << i;
            j3 = (((((mul0xe(i6) ^ mul0xb(i7)) ^ mul0xd(i8)) ^ mul0x9(i9)) & 255) << i) | j3;
        }
        this.A0 = j;
        this.A1 = j4;
        this.A2 = j2;
        this.A3 = j3;
    }

    private void KeyAddition(long[] jArr) {
        this.A0 ^= jArr[0];
        this.A1 ^= jArr[1];
        this.A2 ^= jArr[2];
        this.A3 ^= jArr[3];
    }

    private void MixColumn() {
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        for (int i = 0; i < this.BC; i += 8) {
            int i2 = (int) ((this.A0 >> i) & 255);
            int i3 = (int) ((this.A1 >> i) & 255);
            int i4 = (int) ((this.A2 >> i) & 255);
            int i5 = (int) ((this.A3 >> i) & 255);
            j |= ((((mul0x2(i2) ^ mul0x3(i3)) ^ i4) ^ i5) & 255) << i;
            j4 |= ((((mul0x2(i3) ^ mul0x3(i4)) ^ i5) ^ i2) & 255) << i;
            j2 |= ((((mul0x2(i4) ^ mul0x3(i5)) ^ i2) ^ i3) & 255) << i;
            j3 = (((((mul0x2(i5) ^ mul0x3(i2)) ^ i3) ^ i4) & 255) << i) | j3;
        }
        this.A0 = j;
        this.A1 = j4;
        this.A2 = j2;
        this.A3 = j3;
    }

    private void ShiftRow(byte[] bArr) {
        this.A1 = shift(this.A1, bArr[1]);
        this.A2 = shift(this.A2, bArr[2]);
        this.A3 = shift(this.A3, bArr[3]);
    }

    private void Substitution(byte[] bArr) {
        this.A0 = applyS(this.A0, bArr);
        this.A1 = applyS(this.A1, bArr);
        this.A2 = applyS(this.A2, bArr);
        this.A3 = applyS(this.A3, bArr);
    }

    private long applyS(long j, byte[] bArr) {
        long j2 = 0;
        for (int i = 0; i < this.BC; i += 8) {
            j2 |= (bArr[(int) ((j >> i) & 255)] & 255) << i;
        }
        return j2;
    }

    private void decryptBlock(long[][] jArr) {
        KeyAddition(jArr[this.ROUNDS]);
        Substitution(Si);
        ShiftRow(this.shifts1SC);
        for (int i = this.ROUNDS - 1; i > 0; i--) {
            KeyAddition(jArr[i]);
            InvMixColumn();
            Substitution(Si);
            ShiftRow(this.shifts1SC);
        }
        KeyAddition(jArr[0]);
    }

    private void encryptBlock(long[][] jArr) {
        KeyAddition(jArr[0]);
        for (int i = 1; i < this.ROUNDS; i++) {
            Substitution(S);
            ShiftRow(this.shifts0SC);
            MixColumn();
            KeyAddition(jArr[i]);
        }
        Substitution(S);
        ShiftRow(this.shifts0SC);
        KeyAddition(jArr[this.ROUNDS]);
    }

    private long[][] generateWorkingKey(byte[] bArr) {
        int i;
        int i2 = 8;
        int length = bArr.length * 8;
        int i3 = 1;
        int i4 = 0;
        int i5 = 4;
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 4, 64);
        long[][] jArr = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 15, 4);
        if (length == 128) {
            i = 4;
        } else if (length == 160) {
            i = 5;
        } else if (length == 192) {
            i = 6;
        } else if (length == 224) {
            i = 7;
        } else {
            if (length != 256) {
                throw new IllegalArgumentException("Key length not 128/160/192/224/256 bits.");
            }
            i = 8;
        }
        this.ROUNDS = length >= this.blockBits ? i + 6 : (this.BC / 8) + 6;
        int i6 = 0;
        int i7 = 0;
        while (i6 < bArr.length) {
            bArr2[i6 % 4][i6 / 4] = bArr[i7];
            i6++;
            i7++;
        }
        int i8 = 0;
        int i9 = 0;
        while (i8 < i && i9 < (this.ROUNDS + i3) * (this.BC / i2)) {
            int i10 = i4;
            while (i10 < 4) {
                int i11 = this.BC;
                long[] jArr2 = jArr[i9 / (i11 / 8)];
                jArr2[i10] = ((bArr2[i10][i8] & 255) << ((i9 * 8) % i11)) | jArr2[i10];
                i10++;
                i3 = i3;
                i2 = i2;
                i4 = i4;
            }
            i8++;
            i9++;
        }
        int i12 = i3;
        int i13 = i4;
        int i14 = i13;
        while (i9 < (this.ROUNDS + 1) * (this.BC / 8)) {
            int i15 = i13;
            while (i15 < i5) {
                byte[] bArr3 = bArr2[i15];
                i15++;
                bArr3[i13] = (byte) (bArr3[i13] ^ S[bArr2[i15 % 4][i - 1] & 255]);
            }
            byte[] bArr4 = bArr2[i13];
            int i16 = i14 + 1;
            bArr4[i13] = (byte) (rcon[i14] ^ bArr4[i13]);
            int i17 = i12;
            if (i <= 6) {
                while (i17 < i) {
                    for (int i18 = i13; i18 < i5; i18++) {
                        byte[] bArr5 = bArr2[i18];
                        bArr5[i17] = (byte) (bArr5[i17] ^ bArr5[i17 - 1]);
                    }
                    i17++;
                }
            } else {
                while (i17 < i5) {
                    for (int i19 = i13; i19 < i5; i19++) {
                        byte[] bArr6 = bArr2[i19];
                        bArr6[i17] = (byte) (bArr6[i17] ^ bArr6[i17 - 1]);
                    }
                    i17++;
                }
                for (int i20 = i13; i20 < i5; i20++) {
                    byte[] bArr7 = bArr2[i20];
                    bArr7[i5] = (byte) (bArr7[i5] ^ S[bArr7[3] & 255]);
                }
                for (int i21 = 5; i21 < i; i21++) {
                    for (int i22 = i13; i22 < i5; i22++) {
                        byte[] bArr8 = bArr2[i22];
                        bArr8[i21] = (byte) (bArr8[i21] ^ bArr8[i21 - 1]);
                    }
                }
            }
            int i23 = i13;
            while (i23 < i && i9 < (this.ROUNDS + 1) * (this.BC / 8)) {
                int i24 = i13;
                while (i24 < i5) {
                    int i25 = this.BC;
                    long[] jArr3 = jArr[i9 / (i25 / 8)];
                    jArr3[i24] = ((bArr2[i24][i23] & 255) << ((i9 * 8) % i25)) | jArr3[i24];
                    i24++;
                    i = i;
                    i5 = 4;
                }
                i23++;
                i9++;
                i5 = 4;
            }
            i14 = i16;
            i = i;
            i5 = 4;
        }
        return jArr;
    }

    private byte mul0x2(int i) {
        if (i != 0) {
            return aLogtable[(logtable[i] & 255) + 25];
        }
        return (byte) 0;
    }

    private byte mul0x3(int i) {
        if (i != 0) {
            return aLogtable[(logtable[i] & 255) + 1];
        }
        return (byte) 0;
    }

    private byte mul0x9(int i) {
        if (i >= 0) {
            return aLogtable[i + 199];
        }
        return (byte) 0;
    }

    private byte mul0xb(int i) {
        if (i >= 0) {
            return aLogtable[i + 104];
        }
        return (byte) 0;
    }

    private byte mul0xd(int i) {
        if (i >= 0) {
            return aLogtable[i + TelnetCommand.ABORT];
        }
        return (byte) 0;
    }

    private byte mul0xe(int i) {
        if (i >= 0) {
            return aLogtable[i + NNTPReply.ARTICLE_RETRIEVED_REQUEST_TEXT_SEPARATELY];
        }
        return (byte) 0;
    }

    private void packBlock(byte[] bArr, int i) {
        for (int i2 = 0; i2 != this.BC; i2 += 8) {
            bArr[i] = (byte) (this.A0 >> i2);
            bArr[i + 1] = (byte) (this.A1 >> i2);
            int i3 = i + 3;
            bArr[i + 2] = (byte) (this.A2 >> i2);
            i += 4;
            bArr[i3] = (byte) (this.A3 >> i2);
        }
    }

    private long shift(long j, int i) {
        return ((j << (this.BC - i)) | (j >>> i)) & this.BC_MASK;
    }

    private void unpackBlock(byte[] bArr, int i) {
        this.A0 = bArr[i] & 255;
        this.A1 = bArr[i + 1] & 255;
        int i2 = i + 3;
        this.A2 = bArr[i + 2] & 255;
        int i3 = i + 4;
        this.A3 = bArr[i2] & 255;
        for (int i4 = 8; i4 != this.BC; i4 += 8) {
            this.A0 |= (bArr[i3] & 255) << i4;
            this.A1 |= (bArr[i3 + 1] & 255) << i4;
            int i5 = i3 + 3;
            this.A2 |= (bArr[i3 + 2] & 255) << i4;
            i3 += 4;
            this.A3 |= (bArr[i5] & 255) << i4;
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "Rijndael";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.BC / 2;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("invalid parameter passed to Rijndael init - " + cipherParameters.getClass().getName());
        }
        this.workingKey = generateWorkingKey(((KeyParameter) cipherParameters).getKey());
        this.forEncryption = z;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.workingKey == null) {
            throw new IllegalStateException("Rijndael engine not initialised");
        }
        int i3 = this.BC;
        if ((i3 / 2) + i > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if ((i3 / 2) + i2 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        boolean z = this.forEncryption;
        unpackBlock(bArr, i);
        long[][] jArr = this.workingKey;
        if (z) {
            encryptBlock(jArr);
        } else {
            decryptBlock(jArr);
        }
        packBlock(bArr2, i2);
        return this.BC / 2;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
