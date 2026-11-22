package org.bouncycastle.crypto.engines;

import com.alibaba.fastjson.asm.Opcodes;
import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import com.bluetrum.fota.manager.OtaCommandGenerator;
import com.hispark.crashdump.protocol.ProtocolBytes;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: classes8.dex */
public final class TwofishEngine implements BlockCipher {
    private static final int BLOCK_SIZE = 16;
    private static final int GF256_FDBK = 361;
    private static final int GF256_FDBK_2 = 180;
    private static final int GF256_FDBK_4 = 90;
    private static final int INPUT_WHITEN = 0;
    private static final int MAX_KEY_BITS = 256;
    private static final int MAX_ROUNDS = 16;
    private static final int OUTPUT_WHITEN = 4;
    private static final byte[][] P = {new byte[]{-87, BuiltinOptions.CallOnceOptions, -77, -24, 4, -3, -93, BuiltinOptions.UnsortedSegmentProdOptions, -102, OtaCommandGenerator.CMD_GET_INFO_TLV, Byte.MIN_VALUE, BuiltinOptions.UnsortedSegmentMinOptions, -28, -35, -47, BuiltinOptions.PowOptions, 13, -58, BuiltinOptions.EqualOptions, -104, 24, -9, -20, BuiltinOptions.HashtableFindOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.DequantizeOptions, -6, 19, -108, BuiltinOptions.FloorModOptions, -14, -48, -117, BuiltinOptions.SliceOptions, -124, BuiltinOptions.CosOptions, -33, 35, 25, BuiltinOptions.HardSwishOptions, 61, BuiltinOptions.QuantizeOptions, -13, -82, -94, -126, BuiltinOptions.DensifyOptions, 1, -125, BuiltinOptions.LessEqualOptions, -39, BuiltinOptions.ReverseV2Options, -101, BuiltinOptions.BitcastOptions, -90, -21, -91, -66, 22, 12, -29, BuiltinOptions.ScatterNdOptions, -64, -116, 58, -11, BuiltinOptions.BucketizeOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.CastOptions, 11, -69, BuiltinOptions.AbsOptions, -119, BuiltinOptions.HashtableOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.Conv3DOptions, -76, -15, -31, -26, -67, BuiltinOptions.BidirectionalSequenceLSTMOptions, -30, -12, -74, BuiltinOptions.CumsumOptions, -52, -107, 3, BuiltinOptions.RankOptions, -44, 28, 30, -41, -5, -61, -114, -75, -23, -49, -65, -70, -22, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.ArgMinOptions, ProtocolBytes.SOF, BuiltinOptions.TileOptions, -55, BuiltinOptions.SelectV2Options, BuiltinOptions.AssignVariableOptions, -127, BuiltinOptions.UnsortedSegmentSumOptions, 9, -83, BuiltinOptions.LogSoftmaxOptions, -51, -7, -40, -27, -59, -71, BuiltinOptions.MirrorPadOptions, BuiltinOptions.FillOptions, 8, -122, -25, -95, 29, -86, -19, 6, BuiltinOptions.ReadVariableOptions, -78, -46, BuiltinOptions.FloorDivOptions, BuiltinOptions.SignOptions, OtaCommandGenerator.CMD_OTA_INFO, 17, BuiltinOptions.TransposeConvOptions, -62, BuiltinOptions.MaximumMinimumOptions, OtaCommandGenerator.CMD_NOTIFY_STATUS, 32, -10, BuiltinOptions.NonMaxSuppressionV5Options, -1, -106, BuiltinOptions.IfOptions, -79, -85, -98, -100, BuiltinOptions.AddNOptions, 27, BuiltinOptions.NonMaxSuppressionV4Options, -109, 10, -17, OtaCommandGenerator.CMD_GET_INFO, -123, BuiltinOptions.RangeOptions, -18, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.SplitVOptions, -113, BuiltinOptions.PackOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, -121, BuiltinOptions.HashtableImportOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, -42, BuiltinOptions.LogicalAndOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.NegOptions, -50, -53, BuiltinOptions.SelectOptions, -4, -105, 5, BuiltinOptions.ATan2Options, -84, Byte.MAX_VALUE, TransmissionUnpacked.HD_VAL_MAGIC_LB, 26, BuiltinOptions.LeakyReluOptions, 14, -89, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.ArgMaxOptions, 20, 63, BuiltinOptions.LessOptions, -120, BuiltinOptions.LogicalOrOptions, BuiltinOptions.SquaredDifferenceOptions, 2, -72, -38, -80, 23, BuiltinOptions.WhereOptions, 31, -118, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.ReverseSequenceOptions, -57, -115, BuiltinOptions.GeluOptions, -73, -60, -97, BuiltinOptions.RandomOptions, BuiltinOptions.RightShiftOptions, 21, 34, 18, BuiltinOptions.MatrixDiagOptions, 7, -103, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.UniqueOptions, -34, BuiltinOptions.BroadcastToOptions, BuiltinOptions.BatchMatMulOptions, PSSSigner.TRAILER_IMPLICIT, -37, -8, -56, -88, BuiltinOptions.PadV2Options, 64, -36, -2, BuiltinOptions.SparseToDenseOptions, -92, -54, 16, BuiltinOptions.ExpOptions, TransmissionUnpacked.HD_VAL_MAGIC_HB, -45, BuiltinOptions.WhileOptions, 15, 0, BuiltinOptions.VarHandleOptions, -99, BuiltinOptions.NotEqualOptions, BuiltinOptions.SquareOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.DepthToSpaceOptions, -63, -32}, new byte[]{BuiltinOptions.DynamicUpdateSliceOptions, -13, -58, -12, -37, BuiltinOptions.SignOptions, -5, -56, BuiltinOptions.ResizeNearestNeighborOptions, -45, -26, BuiltinOptions.HashtableOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.BitwiseXorOptions, -24, BuiltinOptions.LeakyReluOptions, -42, BuiltinOptions.SparseToDenseOptions, -40, -3, BuiltinOptions.ShapeOptions, BuiltinOptions.AssignVariableOptions, -15, -31, BuiltinOptions.SliceOptions, 15, -8, 27, -121, -6, 6, 63, BuiltinOptions.DepthToSpaceOptions, -70, -82, BuiltinOptions.HardSwishOptions, -118, 0, PSSSigner.TRAILER_IMPLICIT, -99, BuiltinOptions.HashtableImportOptions, -63, -79, 14, Byte.MIN_VALUE, BuiltinOptions.WhileOptions, -46, TransmissionUnpacked.HD_VAL_MAGIC_LB, OtaCommandGenerator.CMD_OTA_INFO, -124, 7, 20, -75, OtaCommandGenerator.CMD_NOTIFY_STATUS, BuiltinOptions.GreaterOptions, -93, -78, BuiltinOptions.BucketizeOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.CosOptions, OtaCommandGenerator.CMD_GET_INFO_TLV, BuiltinOptions.GeluOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.PowOptions, -80, -67, BuiltinOptions.MatrixSetDiagOptions, -4, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.SelectV2Options, -106, BuiltinOptions.HashtableFindOptions, BuiltinOptions.SquareOptions, -9, 16, BuiltinOptions.BitcastOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.MaximumMinimumOptions, -116, 19, -107, -100, -57, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.PackOptions, BuiltinOptions.ReadVariableOptions, -54, -29, -123, -53, 17, -48, -109, -72, -90, -125, 32, -1, -97, BuiltinOptions.UnsortedSegmentMaxOptions, -61, -52, 3, BuiltinOptions.VarHandleOptions, 8, -65, 64, -25, BuiltinOptions.PadV2Options, -30, BuiltinOptions.UnsortedSegmentSumOptions, 12, -86, -126, BuiltinOptions.FloorDivOptions, 58, -22, -71, -28, -102, -92, -105, BuiltinOptions.RightShiftOptions, -38, BuiltinOptions.ATan2Options, 23, BuiltinOptions.CumsumOptions, -108, -95, 29, 61, TransmissionUnpacked.HD_VAL_MAGIC_HB, -34, -77, 11, BuiltinOptions.RandomOptions, -89, 28, -17, -47, BuiltinOptions.GatherNdOptions, BuiltinOptions.LogicalAndOptions, -113, BuiltinOptions.TileOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.NonMaxSuppressionV4Options, -20, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.NegOptions, BuiltinOptions.RangeOptions, -127, -120, -18, BuiltinOptions.ExpOptions, -60, 26, -21, -39, -59, BuiltinOptions.ArgMinOptions, -103, -51, -83, BuiltinOptions.TransposeConvOptions, -117, 1, 24, 35, -35, 31, BuiltinOptions.AbsOptions, BuiltinOptions.GreaterEqualOptions, -7, BuiltinOptions.FloorModOptions, BuiltinOptions.SplitVOptions, -14, BuiltinOptions.BatchMatMulOptions, -114, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.IfOptions, BuiltinOptions.MatrixDiagOptions, 25, -115, -27, -104, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.CallOnceOptions, Byte.MAX_VALUE, 5, BuiltinOptions.SegmentSumOptions, ProtocolBytes.SOF, BuiltinOptions.DensifyOptions, -74, -2, -11, -73, BuiltinOptions.LogicalOrOptions, -91, -50, -23, BuiltinOptions.BroadcastToOptions, BuiltinOptions.FillOptions, -32, BuiltinOptions.MirrorPadOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.LessOptions, BuiltinOptions.LessEqualOptions, -84, 21, BuiltinOptions.QuantizeOptions, -88, 10, -98, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, -33, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.EqualOptions, BuiltinOptions.Conv3DOptions, -49, -36, 34, -55, -64, -101, -119, -44, -19, -85, 18, -94, 13, BuiltinOptions.AddNOptions, -69, 2, BuiltinOptions.SelectOptions, -87, -41, BuiltinOptions.ScatterNdOptions, 30, -76, BuiltinOptions.UniqueOptions, 4, -10, -62, 22, BuiltinOptions.CastOptions, -122, BuiltinOptions.RankOptions, BuiltinOptions.WhereOptions, 9, -66, OtaCommandGenerator.CMD_GET_INFO}};
    private static final int P_00 = 1;
    private static final int P_01 = 0;
    private static final int P_02 = 0;
    private static final int P_03 = 1;
    private static final int P_04 = 1;
    private static final int P_10 = 0;
    private static final int P_11 = 0;
    private static final int P_12 = 1;
    private static final int P_13 = 1;
    private static final int P_14 = 0;
    private static final int P_20 = 1;
    private static final int P_21 = 1;
    private static final int P_22 = 0;
    private static final int P_23 = 0;
    private static final int P_24 = 0;
    private static final int P_30 = 0;
    private static final int P_31 = 1;
    private static final int P_32 = 1;
    private static final int P_33 = 0;
    private static final int P_34 = 1;
    private static final int ROUNDS = 16;
    private static final int ROUND_SUBKEYS = 8;
    private static final int RS_GF_FDBK = 333;
    private static final int SK_BUMP = 16843009;
    private static final int SK_ROTL = 9;
    private static final int SK_STEP = 33686018;
    private static final int TOTAL_SUBKEYS = 40;
    private int[] gSBox;
    private int[] gSubKeys;
    private boolean encrypting = false;
    private int[] gMDS0 = new int[256];
    private int[] gMDS1 = new int[256];
    private int[] gMDS2 = new int[256];
    private int[] gMDS3 = new int[256];
    private int k64Cnt = 0;
    private byte[] workingKey = null;

    public TwofishEngine() {
        for (int i = 0; i < 256; i++) {
            byte[][] bArr = P;
            int i2 = bArr[0][i] & 255;
            int Mx_X = Mx_X(i2) & 255;
            int Mx_Y = Mx_Y(i2) & 255;
            int i3 = bArr[1][i] & 255;
            int[] iArr = {i2, i3};
            int[] iArr2 = {Mx_X, Mx_X(i3) & 255};
            int[] iArr3 = {Mx_Y, Mx_Y(i3) & 255};
            int[] iArr4 = this.gMDS0;
            int i4 = iArr[1] | (iArr2[1] << 8);
            int i5 = iArr3[1];
            iArr4[i] = i4 | (i5 << 16) | (i5 << 24);
            int[] iArr5 = this.gMDS1;
            int i6 = iArr3[0];
            iArr5[i] = i6 | (i6 << 8) | (iArr2[0] << 16) | (iArr[0] << 24);
            int[] iArr6 = this.gMDS2;
            int i7 = iArr2[1];
            int i8 = iArr3[1];
            iArr6[i] = (iArr[1] << 16) | i7 | (i8 << 8) | (i8 << 24);
            int[] iArr7 = this.gMDS3;
            int i9 = iArr2[0];
            iArr7[i] = (iArr3[0] << 16) | (iArr[0] << 8) | i9 | (i9 << 24);
        }
    }

    private void Bits32ToBytes(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
    }

    private int BytesTo32Bits(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private int F32(int i, int[] iArr) {
        int i2;
        int i3;
        int b0 = b0(i);
        int b1 = b1(i);
        int b2 = b2(i);
        int b3 = b3(i);
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        int i8 = this.k64Cnt & 3;
        if (i8 != 0) {
            if (i8 == 1) {
                int[] iArr2 = this.gMDS0;
                byte[][] bArr = P;
                i2 = (iArr2[(bArr[0][b0] & 255) ^ b0(i4)] ^ this.gMDS1[(bArr[0][b1] & 255) ^ b1(i4)]) ^ this.gMDS2[(bArr[1][b2] & 255) ^ b2(i4)];
                i3 = this.gMDS3[(bArr[1][b3] & 255) ^ b3(i4)];
                return i3 ^ i2;
            }
            if (i8 != 2) {
                if (i8 != 3) {
                    return 0;
                }
            }
            int[] iArr3 = this.gMDS0;
            byte[][] bArr2 = P;
            byte[] bArr3 = bArr2[0];
            i2 = (iArr3[(bArr3[(bArr3[b0] & 255) ^ b0(i5)] & 255) ^ b0(i4)] ^ this.gMDS1[(bArr2[0][(bArr2[1][b1] & 255) ^ b1(i5)] & 255) ^ b1(i4)]) ^ this.gMDS2[(bArr2[1][(bArr2[0][b2] & 255) ^ b2(i5)] & 255) ^ b2(i4)];
            int[] iArr4 = this.gMDS3;
            byte[] bArr4 = bArr2[1];
            i3 = iArr4[(bArr4[(bArr4[b3] & 255) ^ b3(i5)] & 255) ^ b3(i4)];
            return i3 ^ i2;
        }
        byte[][] bArr5 = P;
        b0 = (bArr5[1][b0] & 255) ^ b0(i7);
        b1 = (bArr5[0][b1] & 255) ^ b1(i7);
        b2 = (bArr5[0][b2] & 255) ^ b2(i7);
        b3 = (bArr5[1][b3] & 255) ^ b3(i7);
        byte[][] bArr6 = P;
        b0 = (bArr6[1][b0] & 255) ^ b0(i6);
        b1 = (bArr6[1][b1] & 255) ^ b1(i6);
        b2 = (bArr6[0][b2] & 255) ^ b2(i6);
        b3 = (bArr6[0][b3] & 255) ^ b3(i6);
        int[] iArr32 = this.gMDS0;
        byte[][] bArr22 = P;
        byte[] bArr32 = bArr22[0];
        i2 = (iArr32[(bArr32[(bArr32[b0] & 255) ^ b0(i5)] & 255) ^ b0(i4)] ^ this.gMDS1[(bArr22[0][(bArr22[1][b1] & 255) ^ b1(i5)] & 255) ^ b1(i4)]) ^ this.gMDS2[(bArr22[1][(bArr22[0][b2] & 255) ^ b2(i5)] & 255) ^ b2(i4)];
        int[] iArr42 = this.gMDS3;
        byte[] bArr42 = bArr22[1];
        i3 = iArr42[(bArr42[(bArr42[b3] & 255) ^ b3(i5)] & 255) ^ b3(i4)];
        return i3 ^ i2;
    }

    private int Fe32_0(int i) {
        int[] iArr = this.gSBox;
        return iArr[(((i >>> 24) & 255) * 2) + 513] ^ ((iArr[(i & 255) * 2] ^ iArr[(((i >>> 8) & 255) * 2) + 1]) ^ iArr[(((i >>> 16) & 255) * 2) + 512]);
    }

    private int Fe32_3(int i) {
        int[] iArr = this.gSBox;
        return iArr[(((i >>> 16) & 255) * 2) + 513] ^ ((iArr[((i >>> 24) & 255) * 2] ^ iArr[((i & 255) * 2) + 1]) ^ iArr[(((i >>> 8) & 255) * 2) + 512]);
    }

    private int LFSR1(int i) {
        return ((i & 1) != 0 ? 180 : 0) ^ (i >> 1);
    }

    private int LFSR2(int i) {
        return ((i >> 2) ^ ((i & 2) != 0 ? 180 : 0)) ^ ((i & 1) != 0 ? 90 : 0);
    }

    private int Mx_X(int i) {
        return i ^ LFSR2(i);
    }

    private int Mx_Y(int i) {
        return LFSR2(i) ^ (LFSR1(i) ^ i);
    }

    private int RS_MDS_Encode(int i, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            i2 = RS_rem(i2);
        }
        int i4 = i ^ i2;
        for (int i5 = 0; i5 < 4; i5++) {
            i4 = RS_rem(i4);
        }
        return i4;
    }

    private int RS_rem(int i) {
        int i2 = i >>> 24;
        int i3 = i2 & 255;
        int i4 = ((i3 << 1) ^ ((i2 & 128) != 0 ? 333 : 0)) & 255;
        int i5 = ((i3 >>> 1) ^ ((i2 & 1) != 0 ? Opcodes.IF_ACMPNE : 0)) ^ i4;
        return ((((i << 8) ^ (i5 << 24)) ^ (i4 << 16)) ^ (i5 << 8)) ^ i3;
    }

    private int b0(int i) {
        return i & 255;
    }

    private int b1(int i) {
        return (i >>> 8) & 255;
    }

    private int b2(int i) {
        return (i >>> 16) & 255;
    }

    private int b3(int i) {
        return (i >>> 24) & 255;
    }

    private void decryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int BytesTo32Bits = BytesTo32Bits(bArr, i) ^ this.gSubKeys[4];
        int BytesTo32Bits2 = BytesTo32Bits(bArr, i + 4) ^ this.gSubKeys[5];
        int BytesTo32Bits3 = BytesTo32Bits(bArr, i + 8) ^ this.gSubKeys[6];
        int BytesTo32Bits4 = BytesTo32Bits(bArr, i + 12) ^ this.gSubKeys[7];
        int i3 = 39;
        for (int i4 = 0; i4 < 16; i4 += 2) {
            int Fe32_0 = Fe32_0(BytesTo32Bits);
            int Fe32_3 = Fe32_3(BytesTo32Bits2);
            int[] iArr = this.gSubKeys;
            int i5 = BytesTo32Bits4 ^ (((Fe32_3 * 2) + Fe32_0) + iArr[i3]);
            BytesTo32Bits3 = ((BytesTo32Bits3 >>> 31) | (BytesTo32Bits3 << 1)) ^ ((Fe32_0 + Fe32_3) + iArr[i3 - 1]);
            BytesTo32Bits4 = (i5 << 31) | (i5 >>> 1);
            int Fe32_02 = Fe32_0(BytesTo32Bits3);
            int Fe32_32 = Fe32_3(BytesTo32Bits4);
            int[] iArr2 = this.gSubKeys;
            int i6 = i3 - 3;
            int i7 = BytesTo32Bits2 ^ (((Fe32_32 * 2) + Fe32_02) + iArr2[i3 - 2]);
            i3 -= 4;
            BytesTo32Bits = ((BytesTo32Bits >>> 31) | (BytesTo32Bits << 1)) ^ ((Fe32_02 + Fe32_32) + iArr2[i6]);
            BytesTo32Bits2 = (i7 << 31) | (i7 >>> 1);
        }
        Bits32ToBytes(this.gSubKeys[0] ^ BytesTo32Bits3, bArr2, i2);
        Bits32ToBytes(BytesTo32Bits4 ^ this.gSubKeys[1], bArr2, i2 + 4);
        Bits32ToBytes(this.gSubKeys[2] ^ BytesTo32Bits, bArr2, i2 + 8);
        Bits32ToBytes(this.gSubKeys[3] ^ BytesTo32Bits2, bArr2, i2 + 12);
    }

    private void encryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int BytesTo32Bits = BytesTo32Bits(bArr, i) ^ this.gSubKeys[0];
        int BytesTo32Bits2 = BytesTo32Bits(bArr, i + 4) ^ this.gSubKeys[1];
        int BytesTo32Bits3 = BytesTo32Bits(bArr, i + 8) ^ this.gSubKeys[2];
        int BytesTo32Bits4 = BytesTo32Bits(bArr, i + 12) ^ this.gSubKeys[3];
        int i3 = 8;
        for (int i4 = 0; i4 < 16; i4 += 2) {
            int Fe32_0 = Fe32_0(BytesTo32Bits);
            int Fe32_3 = Fe32_3(BytesTo32Bits2);
            int[] iArr = this.gSubKeys;
            int i5 = BytesTo32Bits3 ^ ((Fe32_0 + Fe32_3) + iArr[i3]);
            BytesTo32Bits3 = (i5 << 31) | (i5 >>> 1);
            BytesTo32Bits4 = ((BytesTo32Bits4 >>> 31) | (BytesTo32Bits4 << 1)) ^ ((Fe32_0 + (Fe32_3 * 2)) + iArr[i3 + 1]);
            int Fe32_02 = Fe32_0(BytesTo32Bits3);
            int Fe32_32 = Fe32_3(BytesTo32Bits4);
            int[] iArr2 = this.gSubKeys;
            int i6 = i3 + 3;
            int i7 = BytesTo32Bits ^ ((Fe32_02 + Fe32_32) + iArr2[i3 + 2]);
            BytesTo32Bits = (i7 << 31) | (i7 >>> 1);
            i3 += 4;
            BytesTo32Bits2 = ((BytesTo32Bits2 >>> 31) | (BytesTo32Bits2 << 1)) ^ ((Fe32_02 + (Fe32_32 * 2)) + iArr2[i6]);
        }
        Bits32ToBytes(this.gSubKeys[4] ^ BytesTo32Bits3, bArr2, i2);
        Bits32ToBytes(BytesTo32Bits4 ^ this.gSubKeys[5], bArr2, i2 + 4);
        Bits32ToBytes(this.gSubKeys[6] ^ BytesTo32Bits, bArr2, i2 + 8);
        Bits32ToBytes(this.gSubKeys[7] ^ BytesTo32Bits2, bArr2, i2 + 12);
    }

    private void setKey(byte[] bArr) {
        int b0;
        int b1;
        int b2;
        int b3;
        int i;
        int i2;
        int i3;
        int i4;
        int[] iArr = new int[4];
        int[] iArr2 = new int[4];
        int[] iArr3 = new int[4];
        this.gSubKeys = new int[40];
        int i5 = this.k64Cnt;
        if (i5 < 1) {
            throw new IllegalArgumentException("Key size less than 64 bits");
        }
        if (i5 > 4) {
            throw new IllegalArgumentException("Key size larger than 256 bits");
        }
        for (int i6 = 0; i6 < this.k64Cnt; i6++) {
            int i7 = i6 * 8;
            iArr[i6] = BytesTo32Bits(bArr, i7);
            int BytesTo32Bits = BytesTo32Bits(bArr, i7 + 4);
            iArr2[i6] = BytesTo32Bits;
            iArr3[(this.k64Cnt - 1) - i6] = RS_MDS_Encode(iArr[i6], BytesTo32Bits);
        }
        for (int i8 = 0; i8 < 20; i8++) {
            int i9 = SK_STEP * i8;
            int F32 = F32(i9, iArr);
            int F322 = F32(i9 + 16843009, iArr2);
            int i10 = (F322 >>> 24) | (F322 << 8);
            int i11 = F32 + i10;
            int[] iArr4 = this.gSubKeys;
            int i12 = i8 * 2;
            iArr4[i12] = i11;
            int i13 = i11 + i10;
            iArr4[i12 + 1] = (i13 << 9) | (i13 >>> 23);
        }
        int i14 = iArr3[0];
        int i15 = iArr3[1];
        int i16 = 2;
        int i17 = iArr3[2];
        int i18 = iArr3[3];
        this.gSBox = new int[1024];
        int i19 = 0;
        while (i19 < 256) {
            int i20 = this.k64Cnt & 3;
            if (i20 != 0) {
                if (i20 == 1) {
                    int[] iArr5 = this.gSBox;
                    int i21 = i19 * 2;
                    int[] iArr6 = this.gMDS0;
                    byte[][] bArr2 = P;
                    iArr5[i21] = iArr6[(bArr2[0][i19] & 255) ^ b0(i14)];
                    this.gSBox[i21 + 1] = this.gMDS1[(bArr2[0][i19] & 255) ^ b1(i14)];
                    this.gSBox[i21 + 512] = this.gMDS2[(bArr2[1][i19] & 255) ^ b2(i14)];
                    this.gSBox[i21 + 513] = this.gMDS3[(bArr2[1][i19] & 255) ^ b3(i14)];
                } else if (i20 == i16) {
                    i4 = i19;
                    i3 = i4;
                    i2 = i3;
                    i = i2;
                    int[] iArr7 = this.gSBox;
                    int i22 = i19 * 2;
                    int[] iArr8 = this.gMDS0;
                    byte[][] bArr3 = P;
                    byte[] bArr4 = bArr3[0];
                    iArr7[i22] = iArr8[(bArr4[(bArr4[i3] & 255) ^ b0(i15)] & 255) ^ b0(i14)];
                    this.gSBox[i22 + 1] = this.gMDS1[(bArr3[0][(bArr3[1][i2] & 255) ^ b1(i15)] & 255) ^ b1(i14)];
                    this.gSBox[i22 + 512] = this.gMDS2[(bArr3[1][(bArr3[0][i] & 255) ^ b2(i15)] & 255) ^ b2(i14)];
                    int[] iArr9 = this.gMDS3;
                    byte[] bArr5 = bArr3[1];
                    this.gSBox[i22 + 513] = iArr9[(bArr5[(bArr5[i4] & 255) ^ b3(i15)] & 255) ^ b3(i14)];
                } else if (i20 == 3) {
                    b3 = i19;
                    b0 = b3;
                    b1 = b0;
                    b2 = b1;
                }
                i19++;
                i16 = 2;
            } else {
                byte[][] bArr6 = P;
                b0 = (bArr6[1][i19] & 255) ^ b0(i18);
                b1 = (bArr6[0][i19] & 255) ^ b1(i18);
                b2 = (bArr6[0][i19] & 255) ^ b2(i18);
                b3 = (bArr6[1][i19] & 255) ^ b3(i18);
            }
            byte[][] bArr7 = P;
            i3 = (bArr7[1][b0] & 255) ^ b0(i17);
            i2 = (bArr7[1][b1] & 255) ^ b1(i17);
            i = (bArr7[0][b2] & 255) ^ b2(i17);
            i4 = (bArr7[0][b3] & 255) ^ b3(i17);
            int[] iArr72 = this.gSBox;
            int i222 = i19 * 2;
            int[] iArr82 = this.gMDS0;
            byte[][] bArr32 = P;
            byte[] bArr42 = bArr32[0];
            iArr72[i222] = iArr82[(bArr42[(bArr42[i3] & 255) ^ b0(i15)] & 255) ^ b0(i14)];
            this.gSBox[i222 + 1] = this.gMDS1[(bArr32[0][(bArr32[1][i2] & 255) ^ b1(i15)] & 255) ^ b1(i14)];
            this.gSBox[i222 + 512] = this.gMDS2[(bArr32[1][(bArr32[0][i] & 255) ^ b2(i15)] & 255) ^ b2(i14)];
            int[] iArr92 = this.gMDS3;
            byte[] bArr52 = bArr32[1];
            this.gSBox[i222 + 513] = iArr92[(bArr52[(bArr52[i4] & 255) ^ b3(i15)] & 255) ^ b3(i14)];
            i19++;
            i16 = 2;
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "Twofish";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("invalid parameter passed to Twofish init - " + cipherParameters.getClass().getName());
        }
        this.encrypting = z;
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        this.workingKey = key;
        this.k64Cnt = key.length / 8;
        setKey(key);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.workingKey == null) {
            throw new IllegalStateException("Twofish not initialised");
        }
        if (i + 16 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i2 + 16 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        if (this.encrypting) {
            encryptBlock(bArr, i, bArr2, i2);
            return 16;
        }
        decryptBlock(bArr, i, bArr2, i2);
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        byte[] bArr = this.workingKey;
        if (bArr != null) {
            setKey(bArr);
        }
    }
}
