package org.bouncycastle.crypto.engines;

import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import com.bluetrum.fota.manager.OtaCommandGenerator;
import com.hispark.crashdump.protocol.ProtocolBytes;
import java.lang.reflect.Array;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.util.encoders.Hex;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: classes8.dex */
public class ARIAEngine implements BlockCipher {
    protected static final int BLOCK_SIZE = 16;
    private static final byte[][] C = {Hex.decodeStrict("517cc1b727220a94fe13abe8fa9a6ee0"), Hex.decodeStrict("6db14acc9e21c820ff28b1d5ef5de2b0"), Hex.decodeStrict("db92371d2126e9700324977504e8c90e")};
    private static final byte[] SB1_sbox = {BuiltinOptions.DensifyOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.SignOptions, -14, BuiltinOptions.HashtableOptions, BuiltinOptions.VarHandleOptions, -59, BuiltinOptions.SliceOptions, 1, BuiltinOptions.CallOnceOptions, BuiltinOptions.PadV2Options, -2, -41, -85, BuiltinOptions.UnsortedSegmentProdOptions, -54, -126, -55, BuiltinOptions.BitwiseXorOptions, -6, BuiltinOptions.QuantizeOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, TransmissionUnpacked.HD_VAL_MAGIC_HB, -83, -44, -94, ProtocolBytes.SOF, -100, -92, BuiltinOptions.RandomOptions, -64, -73, -3, -109, BuiltinOptions.DequantizeOptions, BuiltinOptions.NotEqualOptions, 63, -9, -52, BuiltinOptions.ExpandDimsOptions, -91, -27, -15, BuiltinOptions.AssignVariableOptions, -40, BuiltinOptions.TransposeConvOptions, 21, 4, -57, 35, -61, 24, -106, 5, -102, 7, 18, Byte.MIN_VALUE, -30, -21, BuiltinOptions.MaximumMinimumOptions, -78, BuiltinOptions.DynamicUpdateSliceOptions, 9, -125, BuiltinOptions.GreaterOptions, 26, 27, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.MatrixSetDiagOptions, OtaCommandGenerator.CMD_OTA_INFO, BuiltinOptions.AddNOptions, BuiltinOptions.PackOptions, -42, -77, BuiltinOptions.LessOptions, -29, BuiltinOptions.SelectOptions, -124, BuiltinOptions.GatherNdOptions, -47, 0, -19, 32, -4, -79, BuiltinOptions.HardSwishOptions, BuiltinOptions.Conv3DOptions, -53, -66, BuiltinOptions.ArgMinOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.MatrixDiagOptions, -49, -48, -17, -86, -5, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.TileOptions, -123, BuiltinOptions.BidirectionalSequenceLSTMOptions, -7, 2, Byte.MAX_VALUE, BuiltinOptions.UniqueOptions, BuiltinOptions.LogicalOrOptions, -97, -88, BuiltinOptions.ReverseV2Options, -93, 64, -113, OtaCommandGenerator.CMD_GET_INFO_TLV, -99, BuiltinOptions.PowOptions, -11, PSSSigner.TRAILER_IMPLICIT, -74, -38, BuiltinOptions.ExpOptions, 16, -1, -13, -46, -51, 12, 19, -20, BuiltinOptions.NonMaxSuppressionV4Options, -105, BuiltinOptions.FillOptions, 23, -60, -89, BuiltinOptions.RightShiftOptions, 61, BuiltinOptions.SegmentSumOptions, BuiltinOptions.WhileOptions, 25, BuiltinOptions.BucketizeOptions, BuiltinOptions.NonMaxSuppressionV5Options, -127, BuiltinOptions.SplitVOptions, -36, 34, BuiltinOptions.NegOptions, OtaCommandGenerator.CMD_NOTIFY_STATUS, -120, BuiltinOptions.BidirectionalSequenceRNNOptions, -18, -72, 20, -34, BuiltinOptions.DepthToSpaceOptions, 11, -37, -32, BuiltinOptions.SparseToDenseOptions, 58, 10, BuiltinOptions.RangeOptions, 6, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.IfOptions, -62, -45, -84, BuiltinOptions.SelectV2Options, OtaCommandGenerator.CMD_GET_INFO, -107, -28, BuiltinOptions.UnsortedSegmentSumOptions, -25, -56, BuiltinOptions.ShapeOptions, BuiltinOptions.HashtableImportOptions, -115, TransmissionUnpacked.HD_VAL_MAGIC_LB, BuiltinOptions.AbsOptions, -87, BuiltinOptions.HashtableFindOptions, BuiltinOptions.RankOptions, -12, -22, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.ATan2Options, -82, 8, -70, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.CastOptions, BuiltinOptions.LessEqualOptions, 28, -90, -76, -58, -24, -35, BuiltinOptions.GeluOptions, 31, BuiltinOptions.LeakyReluOptions, -67, -117, -118, BuiltinOptions.ReadVariableOptions, BuiltinOptions.LogicalAndOptions, -75, BuiltinOptions.CumsumOptions, BuiltinOptions.FloorModOptions, 3, -10, 14, BuiltinOptions.ScatterNdOptions, BuiltinOptions.EqualOptions, BuiltinOptions.ReverseSequenceOptions, -71, -122, -63, 29, -98, -31, -8, -104, 17, BuiltinOptions.Rfft2dOptions, -39, -114, -108, -101, 30, -121, -23, -50, BuiltinOptions.WhereOptions, BuiltinOptions.ArgMaxOptions, -33, -116, -95, -119, 13, -65, -26, BuiltinOptions.SquareOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.FloorDivOptions, -103, BuiltinOptions.GreaterEqualOptions, 15, -80, BuiltinOptions.CosOptions, -69, 22};
    private static final byte[] SB2_sbox = {-30, BuiltinOptions.AbsOptions, BuiltinOptions.CosOptions, -4, -108, -62, BuiltinOptions.ResizeNearestNeighborOptions, -52, BuiltinOptions.SelectV2Options, 13, BuiltinOptions.Conv3DOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.MirrorPadOptions, -117, -47, BuiltinOptions.DepthToSpaceOptions, -6, BuiltinOptions.SegmentSumOptions, -53, -76, -105, -66, BuiltinOptions.PadV2Options, PSSSigner.TRAILER_IMPLICIT, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.LessEqualOptions, 3, -45, 25, BuiltinOptions.QuantizeOptions, -63, 29, 6, BuiltinOptions.FloorDivOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.WhereOptions, TransmissionUnpacked.HD_VAL_MAGIC_HB, -103, BuiltinOptions.Rfft2dOptions, -22, -100, 24, -82, BuiltinOptions.DensifyOptions, -33, -25, -69, 0, BuiltinOptions.BucketizeOptions, BuiltinOptions.CumsumOptions, -5, -106, BuiltinOptions.SquaredDifferenceOptions, -123, -28, 58, 9, BuiltinOptions.BidirectionalSequenceLSTMOptions, -86, 15, -18, 16, -21, BuiltinOptions.GreaterEqualOptions, Byte.MAX_VALUE, -12, BuiltinOptions.LessOptions, -84, -49, -83, OtaCommandGenerator.CMD_GET_INFO, -115, BuiltinOptions.UnsortedSegmentMinOptions, -56, -107, -7, BuiltinOptions.SelectOptions, -50, -51, 8, BuiltinOptions.ATan2Options, -120, BuiltinOptions.PowOptions, BuiltinOptions.IfOptions, -125, BuiltinOptions.NegOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, -37, -72, -57, -109, -92, 18, BuiltinOptions.GatherNdOptions, -1, -121, 14, BuiltinOptions.TransposeConvOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ExpOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.FloorModOptions, 1, -114, BuiltinOptions.ShapeOptions, BuiltinOptions.GeluOptions, BuiltinOptions.SparseToDenseOptions, -54, -23, -79, -73, -85, 12, -41, -60, BuiltinOptions.RankOptions, BuiltinOptions.SquareOptions, BuiltinOptions.DequantizeOptions, 7, -104, BuiltinOptions.NonMaxSuppressionV5Options, -39, -74, -71, 17, 64, -20, 32, -116, -67, OtaCommandGenerator.CMD_OTA_INFO, -55, -124, 4, BuiltinOptions.RangeOptions, 35, -15, BuiltinOptions.SplitVOptions, BuiltinOptions.UniqueOptions, 31, 19, -36, -40, -64, -98, BuiltinOptions.ReverseSequenceOptions, -29, -61, BuiltinOptions.SignOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.PackOptions, 2, -113, BuiltinOptions.LogicalAndOptions, -24, BuiltinOptions.CastOptions, OtaCommandGenerator.CMD_GET_INFO_TLV, -27, 21, -35, -3, 23, -87, -65, -44, -102, BuiltinOptions.RightShiftOptions, -59, BuiltinOptions.ArgMinOptions, BuiltinOptions.CallOnceOptions, -2, BuiltinOptions.UnsortedSegmentProdOptions, -99, BuiltinOptions.ZerosLikeOptions, -89, -31, -48, -11, BuiltinOptions.BroadcastToOptions, -14, 27, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.ReadVariableOptions, 5, -93, -118, TransmissionUnpacked.HD_VAL_MAGIC_LB, BuiltinOptions.UnsortedSegmentSumOptions, -122, -88, BuiltinOptions.SliceOptions, -58, BuiltinOptions.ReverseV2Options, BuiltinOptions.LeakyReluOptions, 30, -90, BuiltinOptions.MaximumMinimumOptions, -10, BuiltinOptions.EqualOptions, -46, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.LogSoftmaxOptions, 22, -126, BuiltinOptions.NonMaxSuppressionV4Options, -38, -26, BuiltinOptions.DynamicUpdateSliceOptions, -94, -17, BuiltinOptions.GreaterOptions, -78, 28, -97, BuiltinOptions.WhileOptions, BuiltinOptions.VarHandleOptions, Byte.MIN_VALUE, 10, BuiltinOptions.RandomOptions, BuiltinOptions.FillOptions, -101, BuiltinOptions.HashtableFindOptions, OtaCommandGenerator.CMD_NOTIFY_STATUS, 11, BuiltinOptions.HardSwishOptions, BuiltinOptions.TileOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.AddNOptions, -13, BuiltinOptions.ScatterNdOptions, -95, -9, -80, -42, 63, BuiltinOptions.BitcastOptions, BuiltinOptions.HashtableImportOptions, -19, 20, -32, -91, 61, 34, -77, -8, -119, -34, BuiltinOptions.AssignVariableOptions, 26, ProtocolBytes.SOF, -70, -75, -127};
    private static final byte[] SB3_sbox = {BuiltinOptions.AddNOptions, 9, BuiltinOptions.Conv3DOptions, TransmissionUnpacked.HD_VAL_MAGIC_LB, BuiltinOptions.SliceOptions, BuiltinOptions.NotEqualOptions, -91, BuiltinOptions.PowOptions, -65, 64, -93, -98, -127, -13, -41, -5, BuiltinOptions.BitcastOptions, -29, BuiltinOptions.ArgMinOptions, -126, -101, BuiltinOptions.SelectOptions, -1, -121, BuiltinOptions.ExpandDimsOptions, -114, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.FillOptions, -60, -34, -23, -53, BuiltinOptions.CosOptions, BuiltinOptions.SignOptions, -108, BuiltinOptions.SparseToDenseOptions, -90, -62, 35, 61, -18, BuiltinOptions.SquaredDifferenceOptions, -107, 11, BuiltinOptions.SquareOptions, -6, -61, BuiltinOptions.AbsOptions, 8, BuiltinOptions.LessEqualOptions, -95, BuiltinOptions.CumsumOptions, BuiltinOptions.ArgMaxOptions, -39, BuiltinOptions.LogSoftmaxOptions, -78, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.HardSwishOptions, -94, BuiltinOptions.RangeOptions, BuiltinOptions.HashtableImportOptions, -117, -47, BuiltinOptions.CastOptions, BuiltinOptions.RandomOptions, -8, -10, BuiltinOptions.SegmentSumOptions, -122, BuiltinOptions.BroadcastToOptions, -104, 22, -44, -92, BuiltinOptions.IfOptions, -52, BuiltinOptions.WhileOptions, BuiltinOptions.BatchMatMulOptions, -74, OtaCommandGenerator.CMD_GET_INFO_TLV, BuiltinOptions.HashtableFindOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.UniqueOptions, -3, -19, -71, -38, BuiltinOptions.DepthToSpaceOptions, 21, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.ReverseSequenceOptions, -89, -115, -99, -124, OtaCommandGenerator.CMD_NOTIFY_STATUS, -40, -85, 0, -116, PSSSigner.TRAILER_IMPLICIT, -45, 10, -9, -28, BuiltinOptions.MatrixDiagOptions, 5, -72, -77, BuiltinOptions.BidirectionalSequenceLSTMOptions, 6, -48, BuiltinOptions.GreaterOptions, 30, -113, -54, 63, 15, 2, -63, ProtocolBytes.SOF, -67, 3, 1, 19, -118, BuiltinOptions.HashtableOptions, 58, OtaCommandGenerator.CMD_GET_INFO, 17, BuiltinOptions.FloorDivOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.CallOnceOptions, -36, -22, -105, -14, -49, -50, TransmissionUnpacked.HD_VAL_MAGIC_HB, -76, -26, BuiltinOptions.BucketizeOptions, -106, -84, BuiltinOptions.GeluOptions, 34, -25, -83, BuiltinOptions.EqualOptions, -123, -30, -7, BuiltinOptions.ShapeOptions, -24, 28, BuiltinOptions.DynamicUpdateSliceOptions, -33, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, -15, 26, BuiltinOptions.AssignVariableOptions, 29, BuiltinOptions.LessOptions, -59, -119, BuiltinOptions.VarHandleOptions, -73, BuiltinOptions.SelectV2Options, 14, -86, 24, -66, 27, -4, BuiltinOptions.RankOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.LeakyReluOptions, -58, -46, BuiltinOptions.UnsortedSegmentSumOptions, 32, -102, -37, -64, -2, BuiltinOptions.UnsortedSegmentMinOptions, -51, BuiltinOptions.MatrixSetDiagOptions, -12, 31, -35, -88, BuiltinOptions.TileOptions, -120, 7, -57, BuiltinOptions.TransposeConvOptions, -79, 18, 16, BuiltinOptions.QuantizeOptions, BuiltinOptions.MaximumMinimumOptions, Byte.MIN_VALUE, -20, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.ReverseV2Options, Byte.MAX_VALUE, -87, 25, -75, BuiltinOptions.ResizeNearestNeighborOptions, 13, BuiltinOptions.GreaterEqualOptions, -27, BuiltinOptions.ATan2Options, -97, -109, -55, -100, -17, OtaCommandGenerator.CMD_OTA_INFO, -32, BuiltinOptions.PackOptions, BuiltinOptions.MirrorPadOptions, -82, BuiltinOptions.NegOptions, -11, -80, -56, -21, -69, BuiltinOptions.LogicalOrOptions, -125, BuiltinOptions.GatherNdOptions, -103, BuiltinOptions.ScatterNdOptions, 23, BuiltinOptions.PadV2Options, 4, BuiltinOptions.RightShiftOptions, -70, BuiltinOptions.UnsortedSegmentMaxOptions, -42, BuiltinOptions.DequantizeOptions, -31, BuiltinOptions.Rfft2dOptions, 20, BuiltinOptions.DensifyOptions, BuiltinOptions.WhereOptions, BuiltinOptions.ExpOptions, 12, BuiltinOptions.BitwiseXorOptions};
    private static final byte[] SB4_sbox = {BuiltinOptions.SliceOptions, BuiltinOptions.BroadcastToOptions, -103, 27, -121, -71, BuiltinOptions.ExpOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.ArgMinOptions, -37, -31, BuiltinOptions.RandomOptions, 9, BuiltinOptions.SelectV2Options, BuiltinOptions.LogicalOrOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.DepthToSpaceOptions, -114, -15, OtaCommandGenerator.CMD_OTA_INFO, -52, -93, BuiltinOptions.NegOptions, 29, -5, -74, -42, 32, -60, -115, -127, BuiltinOptions.BatchMatMulOptions, -11, -119, -53, -99, BuiltinOptions.UnsortedSegmentMaxOptions, -58, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.RankOptions, 23, -44, 64, 26, BuiltinOptions.MirrorPadOptions, -64, BuiltinOptions.DensifyOptions, BuiltinOptions.HashtableFindOptions, -29, -73, -56, BuiltinOptions.SegmentSumOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.GatherNdOptions, -86, BuiltinOptions.PowOptions, -104, 12, -12, -101, -19, Byte.MAX_VALUE, 34, BuiltinOptions.UnsortedSegmentProdOptions, ProtocolBytes.SOF, -35, 58, 11, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.CallOnceOptions, -120, 6, -61, BuiltinOptions.EqualOptions, 13, 1, -117, -116, -62, -26, BuiltinOptions.NonMaxSuppressionV4Options, 2, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.DynamicUpdateSliceOptions, -109, BuiltinOptions.CumsumOptions, 30, -27, -30, BuiltinOptions.CosOptions, -40, 16, -50, BuiltinOptions.ATan2Options, -24, 8, BuiltinOptions.GreaterOptions, 18, -105, BuiltinOptions.SparseToDenseOptions, -85, -76, BuiltinOptions.MaximumMinimumOptions, 10, 35, -33, -17, -54, -39, -72, -6, -36, BuiltinOptions.TransposeConvOptions, BuiltinOptions.HashtableOptions, -47, -83, 25, BuiltinOptions.RangeOptions, -67, BuiltinOptions.ReverseV2Options, -106, -18, -28, -88, BuiltinOptions.FloorDivOptions, -38, -1, -51, BuiltinOptions.WhereOptions, -122, BuiltinOptions.NotEqualOptions, -66, BuiltinOptions.ScatterNdOptions, BuiltinOptions.AddNOptions, -8, -69, 14, -126, BuiltinOptions.FloorModOptions, BuiltinOptions.Rfft2dOptions, -102, -32, BuiltinOptions.UnidirectionalSequenceLSTMOptions, -98, BuiltinOptions.IfOptions, 4, BuiltinOptions.LeakyReluOptions, BuiltinOptions.ExpandDimsOptions, 21, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.DequantizeOptions, -89, -34, BuiltinOptions.LessOptions, -82, OtaCommandGenerator.CMD_GET_INFO_TLV, -41, -124, -23, -46, -70, BuiltinOptions.WhileOptions, -13, -59, -80, -65, -92, BuiltinOptions.PackOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.FillOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.PadV2Options, -4, -21, BuiltinOptions.VarHandleOptions, TransmissionUnpacked.HD_VAL_MAGIC_LB, -10, 20, -2, BuiltinOptions.BitcastOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.BitwiseXorOptions, -3, BuiltinOptions.SelectOptions, 24, -125, 22, -91, OtaCommandGenerator.CMD_GET_INFO, 31, 5, -107, BuiltinOptions.GeluOptions, -87, -63, BuiltinOptions.HardSwishOptions, BuiltinOptions.ResizeNearestNeighborOptions, -123, BuiltinOptions.HashtableImportOptions, 19, 7, BuiltinOptions.SplitVOptions, BuiltinOptions.AbsOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, -78, 15, -55, 28, -90, PSSSigner.TRAILER_IMPLICIT, -20, BuiltinOptions.BucketizeOptions, OtaCommandGenerator.CMD_NOTIFY_STATUS, BuiltinOptions.SignOptions, -49, BuiltinOptions.QuantizeOptions, -113, -95, -7, BuiltinOptions.GreaterEqualOptions, -14, -79, 0, -108, BuiltinOptions.ShapeOptions, -97, -48, BuiltinOptions.LessEqualOptions, -100, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.ArgMaxOptions, 63, Byte.MIN_VALUE, TransmissionUnpacked.HD_VAL_MAGIC_HB, 61, -45, BuiltinOptions.CastOptions, -118, -75, -25, BuiltinOptions.SquareOptions, -77, -57, -22, -9, BuiltinOptions.SquaredDifferenceOptions, 17, BuiltinOptions.TileOptions, 3, -94, -84, BuiltinOptions.NonMaxSuppressionV5Options};
    private byte[][] roundKeys;

    protected static void A(byte[] bArr) {
        byte b = bArr[0];
        byte b2 = bArr[1];
        byte b3 = bArr[2];
        byte b4 = bArr[3];
        byte b5 = bArr[4];
        byte b6 = bArr[5];
        byte b7 = bArr[6];
        byte b8 = bArr[7];
        byte b9 = bArr[8];
        byte b10 = bArr[9];
        byte b11 = bArr[10];
        byte b12 = bArr[11];
        byte b13 = bArr[12];
        byte b14 = bArr[13];
        byte b15 = bArr[14];
        byte b16 = bArr[15];
        bArr[0] = (byte) ((((((b4 ^ b5) ^ b7) ^ b9) ^ b10) ^ b14) ^ b15);
        bArr[1] = (byte) ((((((b3 ^ b6) ^ b8) ^ b9) ^ b10) ^ b13) ^ b16);
        bArr[2] = (byte) ((((((b2 ^ b5) ^ b7) ^ b11) ^ b12) ^ b13) ^ b16);
        bArr[3] = (byte) ((((((b ^ b6) ^ b8) ^ b11) ^ b12) ^ b14) ^ b15);
        int i = b ^ b3;
        bArr[4] = (byte) (((((i ^ b6) ^ b9) ^ b12) ^ b15) ^ b16);
        int i2 = b2 ^ b4;
        bArr[5] = (byte) (((((i2 ^ b5) ^ b10) ^ b11) ^ b15) ^ b16);
        bArr[6] = (byte) (((((i ^ b8) ^ b10) ^ b11) ^ b13) ^ b14);
        bArr[7] = (byte) (((((i2 ^ b7) ^ b9) ^ b12) ^ b13) ^ b14);
        int i3 = b ^ b2;
        bArr[8] = (byte) (((((i3 ^ b5) ^ b8) ^ b11) ^ b14) ^ b16);
        bArr[9] = (byte) (((((i3 ^ b6) ^ b7) ^ b12) ^ b13) ^ b15);
        int i4 = b3 ^ b4;
        bArr[10] = (byte) (((((i4 ^ b6) ^ b7) ^ b9) ^ b14) ^ b16);
        bArr[11] = (byte) (((((i4 ^ b5) ^ b8) ^ b10) ^ b13) ^ b15);
        int i5 = b2 ^ b3;
        bArr[12] = (byte) (((((i5 ^ b7) ^ b8) ^ b10) ^ b12) ^ b13);
        int i6 = b ^ b4;
        bArr[13] = (byte) (((((i6 ^ b7) ^ b8) ^ b9) ^ b11) ^ b14);
        bArr[14] = (byte) (((((i6 ^ b5) ^ b6) ^ b10) ^ b12) ^ b15);
        bArr[15] = (byte) (((((i5 ^ b5) ^ b6) ^ b9) ^ b11) ^ b16);
    }

    protected static void FE(byte[] bArr, byte[] bArr2) {
        xor(bArr, bArr2);
        SL2(bArr);
        A(bArr);
    }

    protected static void FO(byte[] bArr, byte[] bArr2) {
        xor(bArr, bArr2);
        SL1(bArr);
        A(bArr);
    }

    protected static byte SB1(byte b) {
        return SB1_sbox[b & 255];
    }

    protected static byte SB2(byte b) {
        return SB2_sbox[b & 255];
    }

    protected static byte SB3(byte b) {
        return SB3_sbox[b & 255];
    }

    protected static byte SB4(byte b) {
        return SB4_sbox[b & 255];
    }

    protected static void SL1(byte[] bArr) {
        bArr[0] = SB1(bArr[0]);
        bArr[1] = SB2(bArr[1]);
        bArr[2] = SB3(bArr[2]);
        bArr[3] = SB4(bArr[3]);
        bArr[4] = SB1(bArr[4]);
        bArr[5] = SB2(bArr[5]);
        bArr[6] = SB3(bArr[6]);
        bArr[7] = SB4(bArr[7]);
        bArr[8] = SB1(bArr[8]);
        bArr[9] = SB2(bArr[9]);
        bArr[10] = SB3(bArr[10]);
        bArr[11] = SB4(bArr[11]);
        bArr[12] = SB1(bArr[12]);
        bArr[13] = SB2(bArr[13]);
        bArr[14] = SB3(bArr[14]);
        bArr[15] = SB4(bArr[15]);
    }

    protected static void SL2(byte[] bArr) {
        bArr[0] = SB3(bArr[0]);
        bArr[1] = SB4(bArr[1]);
        bArr[2] = SB1(bArr[2]);
        bArr[3] = SB2(bArr[3]);
        bArr[4] = SB3(bArr[4]);
        bArr[5] = SB4(bArr[5]);
        bArr[6] = SB1(bArr[6]);
        bArr[7] = SB2(bArr[7]);
        bArr[8] = SB3(bArr[8]);
        bArr[9] = SB4(bArr[9]);
        bArr[10] = SB1(bArr[10]);
        bArr[11] = SB2(bArr[11]);
        bArr[12] = SB3(bArr[12]);
        bArr[13] = SB4(bArr[13]);
        bArr[14] = SB1(bArr[14]);
        bArr[15] = SB2(bArr[15]);
    }

    protected static byte[][] keySchedule(boolean z, byte[] bArr) {
        int length = bArr.length;
        if (length < 16 || length > 32 || (length & 7) != 0) {
            throw new IllegalArgumentException("Key length not 128/192/256 bits.");
        }
        int i = length >>> 3;
        int i2 = i - 2;
        byte[][] bArr2 = C;
        byte[] bArr3 = bArr2[i2];
        byte[] bArr4 = bArr2[(i - 1) % 3];
        byte[] bArr5 = bArr2[i % 3];
        byte[] bArr6 = new byte[16];
        byte[] bArr7 = new byte[16];
        System.arraycopy(bArr, 0, bArr6, 0, 16);
        System.arraycopy(bArr, 16, bArr7, 0, length - 16);
        byte[] bArr8 = new byte[16];
        byte[] bArr9 = new byte[16];
        byte[] bArr10 = new byte[16];
        byte[] bArr11 = new byte[16];
        System.arraycopy(bArr6, 0, bArr8, 0, 16);
        System.arraycopy(bArr8, 0, bArr9, 0, 16);
        FO(bArr9, bArr3);
        xor(bArr9, bArr7);
        System.arraycopy(bArr9, 0, bArr10, 0, 16);
        FE(bArr10, bArr4);
        xor(bArr10, bArr8);
        System.arraycopy(bArr10, 0, bArr11, 0, 16);
        FO(bArr11, bArr5);
        xor(bArr11, bArr9);
        int i3 = i2 * 2;
        int i4 = i3 + 12;
        byte[][] bArr12 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i3 + 13, 16);
        keyScheduleRound(bArr12[0], bArr8, bArr9, 19);
        keyScheduleRound(bArr12[1], bArr9, bArr10, 19);
        keyScheduleRound(bArr12[2], bArr10, bArr11, 19);
        keyScheduleRound(bArr12[3], bArr11, bArr8, 19);
        keyScheduleRound(bArr12[4], bArr8, bArr9, 31);
        keyScheduleRound(bArr12[5], bArr9, bArr10, 31);
        keyScheduleRound(bArr12[6], bArr10, bArr11, 31);
        keyScheduleRound(bArr12[7], bArr11, bArr8, 31);
        keyScheduleRound(bArr12[8], bArr8, bArr9, 67);
        keyScheduleRound(bArr12[9], bArr9, bArr10, 67);
        keyScheduleRound(bArr12[10], bArr10, bArr11, 67);
        keyScheduleRound(bArr12[11], bArr11, bArr8, 67);
        keyScheduleRound(bArr12[12], bArr8, bArr9, 97);
        if (i4 > 12) {
            keyScheduleRound(bArr12[13], bArr9, bArr10, 97);
            keyScheduleRound(bArr12[14], bArr10, bArr11, 97);
            if (i4 > 14) {
                keyScheduleRound(bArr12[15], bArr11, bArr8, 97);
                keyScheduleRound(bArr12[16], bArr8, bArr9, 109);
            }
        }
        if (!z) {
            reverseKeys(bArr12);
            for (int i5 = 1; i5 < i4; i5++) {
                A(bArr12[i5]);
            }
        }
        return bArr12;
    }

    protected static void keyScheduleRound(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        int i2 = i >>> 3;
        int i3 = i & 7;
        int i4 = 8 - i3;
        int i5 = bArr3[15 - i2] & 255;
        int i6 = 0;
        while (i6 < 16) {
            int i7 = bArr3[(i6 - i2) & 15] & 255;
            bArr[i6] = (byte) (((i5 << i4) | (i7 >>> i3)) ^ (bArr2[i6] & 255));
            i6++;
            i5 = i7;
        }
    }

    protected static void reverseKeys(byte[][] bArr) {
        int length = bArr.length;
        int i = length / 2;
        int i2 = length - 1;
        for (int i3 = 0; i3 < i; i3++) {
            byte[] bArr2 = bArr[i3];
            int i4 = i2 - i3;
            bArr[i3] = bArr[i4];
            bArr[i4] = bArr2;
        }
    }

    protected static void xor(byte[] bArr, byte[] bArr2) {
        for (int i = 0; i < 16; i++) {
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "ARIA";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("invalid parameter passed to ARIA init - " + cipherParameters.getClass().getName());
        }
        this.roundKeys = keySchedule(z, ((KeyParameter) cipherParameters).getKey());
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        if (this.roundKeys == null) {
            throw new IllegalStateException("ARIA engine not initialised");
        }
        if (i > bArr.length - 16) {
            throw new DataLengthException("input buffer too short");
        }
        if (i2 > bArr2.length - 16) {
            throw new OutputLengthException("output buffer too short");
        }
        byte[] bArr3 = new byte[16];
        System.arraycopy(bArr, i, bArr3, 0, 16);
        int length = this.roundKeys.length - 3;
        int i3 = 0;
        while (i3 < length) {
            int i4 = i3 + 1;
            FO(bArr3, this.roundKeys[i3]);
            i3 += 2;
            FE(bArr3, this.roundKeys[i4]);
        }
        FO(bArr3, this.roundKeys[i3]);
        xor(bArr3, this.roundKeys[i3 + 1]);
        SL2(bArr3);
        xor(bArr3, this.roundKeys[i3 + 2]);
        System.arraycopy(bArr3, 0, bArr2, i2, 16);
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
