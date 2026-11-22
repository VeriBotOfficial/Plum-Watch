package org.bouncycastle.crypto.engines;

import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import com.bluetrum.fota.manager.OtaCommandGenerator;
import com.facebook.imageutils.JfifUtil;
import com.hispark.crashdump.protocol.ProtocolBytes;
import com.wakeup.common.DeviceFeatures;
import java.lang.reflect.Array;
import org.apache.commons.net.telnet.TelnetCommand;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.util.Pack;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: classes8.dex */
public class AESLightEngine implements BlockCipher {
    private static final int BLOCK_SIZE = 16;
    private static final int m1 = -2139062144;
    private static final int m2 = 2139062143;
    private static final int m3 = 27;
    private static final int m4 = -1061109568;
    private static final int m5 = 1061109567;
    private int C0;
    private int C1;
    private int C2;
    private int C3;
    private int ROUNDS;
    private int[][] WorkingKey = null;
    private boolean forEncryption;
    private static final byte[] S = {BuiltinOptions.DensifyOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.SignOptions, -14, BuiltinOptions.HashtableOptions, BuiltinOptions.VarHandleOptions, -59, BuiltinOptions.SliceOptions, 1, BuiltinOptions.CallOnceOptions, BuiltinOptions.PadV2Options, -2, -41, -85, BuiltinOptions.UnsortedSegmentProdOptions, -54, -126, -55, BuiltinOptions.BitwiseXorOptions, -6, BuiltinOptions.QuantizeOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, TransmissionUnpacked.HD_VAL_MAGIC_HB, -83, -44, -94, ProtocolBytes.SOF, -100, -92, BuiltinOptions.RandomOptions, -64, -73, -3, -109, BuiltinOptions.DequantizeOptions, BuiltinOptions.NotEqualOptions, 63, -9, -52, BuiltinOptions.ExpandDimsOptions, -91, -27, -15, BuiltinOptions.AssignVariableOptions, -40, BuiltinOptions.TransposeConvOptions, 21, 4, -57, 35, -61, 24, -106, 5, -102, 7, 18, Byte.MIN_VALUE, -30, -21, BuiltinOptions.MaximumMinimumOptions, -78, BuiltinOptions.DynamicUpdateSliceOptions, 9, -125, BuiltinOptions.GreaterOptions, 26, 27, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.MatrixSetDiagOptions, OtaCommandGenerator.CMD_OTA_INFO, BuiltinOptions.AddNOptions, BuiltinOptions.PackOptions, -42, -77, BuiltinOptions.LessOptions, -29, BuiltinOptions.SelectOptions, -124, BuiltinOptions.GatherNdOptions, -47, 0, -19, 32, -4, -79, BuiltinOptions.HardSwishOptions, BuiltinOptions.Conv3DOptions, -53, -66, BuiltinOptions.ArgMinOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.MatrixDiagOptions, -49, -48, -17, -86, -5, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.TileOptions, -123, BuiltinOptions.BidirectionalSequenceLSTMOptions, -7, 2, Byte.MAX_VALUE, BuiltinOptions.UniqueOptions, BuiltinOptions.LogicalOrOptions, -97, -88, BuiltinOptions.ReverseV2Options, -93, 64, -113, OtaCommandGenerator.CMD_GET_INFO_TLV, -99, BuiltinOptions.PowOptions, -11, PSSSigner.TRAILER_IMPLICIT, -74, -38, BuiltinOptions.ExpOptions, 16, -1, -13, -46, -51, 12, 19, -20, BuiltinOptions.NonMaxSuppressionV4Options, -105, BuiltinOptions.FillOptions, 23, -60, -89, BuiltinOptions.RightShiftOptions, 61, BuiltinOptions.SegmentSumOptions, BuiltinOptions.WhileOptions, 25, BuiltinOptions.BucketizeOptions, BuiltinOptions.NonMaxSuppressionV5Options, -127, BuiltinOptions.SplitVOptions, -36, 34, BuiltinOptions.NegOptions, OtaCommandGenerator.CMD_NOTIFY_STATUS, -120, BuiltinOptions.BidirectionalSequenceRNNOptions, -18, -72, 20, -34, BuiltinOptions.DepthToSpaceOptions, 11, -37, -32, BuiltinOptions.SparseToDenseOptions, 58, 10, BuiltinOptions.RangeOptions, 6, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.IfOptions, -62, -45, -84, BuiltinOptions.SelectV2Options, OtaCommandGenerator.CMD_GET_INFO, -107, -28, BuiltinOptions.UnsortedSegmentSumOptions, -25, -56, BuiltinOptions.ShapeOptions, BuiltinOptions.HashtableImportOptions, -115, TransmissionUnpacked.HD_VAL_MAGIC_LB, BuiltinOptions.AbsOptions, -87, BuiltinOptions.HashtableFindOptions, BuiltinOptions.RankOptions, -12, -22, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.ATan2Options, -82, 8, -70, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.CastOptions, BuiltinOptions.LessEqualOptions, 28, -90, -76, -58, -24, -35, BuiltinOptions.GeluOptions, 31, BuiltinOptions.LeakyReluOptions, -67, -117, -118, BuiltinOptions.ReadVariableOptions, BuiltinOptions.LogicalAndOptions, -75, BuiltinOptions.CumsumOptions, BuiltinOptions.FloorModOptions, 3, -10, 14, BuiltinOptions.ScatterNdOptions, BuiltinOptions.EqualOptions, BuiltinOptions.ReverseSequenceOptions, -71, -122, -63, 29, -98, -31, -8, -104, 17, BuiltinOptions.Rfft2dOptions, -39, -114, -108, -101, 30, -121, -23, -50, BuiltinOptions.WhereOptions, BuiltinOptions.ArgMaxOptions, -33, -116, -95, -119, 13, -65, -26, BuiltinOptions.SquareOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.FloorDivOptions, -103, BuiltinOptions.GreaterEqualOptions, 15, -80, BuiltinOptions.CosOptions, -69, 22};
    private static final byte[] Si = {BuiltinOptions.AddNOptions, 9, BuiltinOptions.Conv3DOptions, TransmissionUnpacked.HD_VAL_MAGIC_LB, BuiltinOptions.SliceOptions, BuiltinOptions.NotEqualOptions, -91, BuiltinOptions.PowOptions, -65, 64, -93, -98, -127, -13, -41, -5, BuiltinOptions.BitcastOptions, -29, BuiltinOptions.ArgMinOptions, -126, -101, BuiltinOptions.SelectOptions, -1, -121, BuiltinOptions.ExpandDimsOptions, -114, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.FillOptions, -60, -34, -23, -53, BuiltinOptions.CosOptions, BuiltinOptions.SignOptions, -108, BuiltinOptions.SparseToDenseOptions, -90, -62, 35, 61, -18, BuiltinOptions.SquaredDifferenceOptions, -107, 11, BuiltinOptions.SquareOptions, -6, -61, BuiltinOptions.AbsOptions, 8, BuiltinOptions.LessEqualOptions, -95, BuiltinOptions.CumsumOptions, BuiltinOptions.ArgMaxOptions, -39, BuiltinOptions.LogSoftmaxOptions, -78, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.HardSwishOptions, -94, BuiltinOptions.RangeOptions, BuiltinOptions.HashtableImportOptions, -117, -47, BuiltinOptions.CastOptions, BuiltinOptions.RandomOptions, -8, -10, BuiltinOptions.SegmentSumOptions, -122, BuiltinOptions.BroadcastToOptions, -104, 22, -44, -92, BuiltinOptions.IfOptions, -52, BuiltinOptions.WhileOptions, BuiltinOptions.BatchMatMulOptions, -74, OtaCommandGenerator.CMD_GET_INFO_TLV, BuiltinOptions.HashtableFindOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.UniqueOptions, -3, -19, -71, -38, BuiltinOptions.DepthToSpaceOptions, 21, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.ReverseSequenceOptions, -89, -115, -99, -124, OtaCommandGenerator.CMD_NOTIFY_STATUS, -40, -85, 0, -116, PSSSigner.TRAILER_IMPLICIT, -45, 10, -9, -28, BuiltinOptions.MatrixDiagOptions, 5, -72, -77, BuiltinOptions.BidirectionalSequenceLSTMOptions, 6, -48, BuiltinOptions.GreaterOptions, 30, -113, -54, 63, 15, 2, -63, ProtocolBytes.SOF, -67, 3, 1, 19, -118, BuiltinOptions.HashtableOptions, 58, OtaCommandGenerator.CMD_GET_INFO, 17, BuiltinOptions.FloorDivOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.CallOnceOptions, -36, -22, -105, -14, -49, -50, TransmissionUnpacked.HD_VAL_MAGIC_HB, -76, -26, BuiltinOptions.BucketizeOptions, -106, -84, BuiltinOptions.GeluOptions, 34, -25, -83, BuiltinOptions.EqualOptions, -123, -30, -7, BuiltinOptions.ShapeOptions, -24, 28, BuiltinOptions.DynamicUpdateSliceOptions, -33, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, -15, 26, BuiltinOptions.AssignVariableOptions, 29, BuiltinOptions.LessOptions, -59, -119, BuiltinOptions.VarHandleOptions, -73, BuiltinOptions.SelectV2Options, 14, -86, 24, -66, 27, -4, BuiltinOptions.RankOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.LeakyReluOptions, -58, -46, BuiltinOptions.UnsortedSegmentSumOptions, 32, -102, -37, -64, -2, BuiltinOptions.UnsortedSegmentMinOptions, -51, BuiltinOptions.MatrixSetDiagOptions, -12, 31, -35, -88, BuiltinOptions.TileOptions, -120, 7, -57, BuiltinOptions.TransposeConvOptions, -79, 18, 16, BuiltinOptions.QuantizeOptions, BuiltinOptions.MaximumMinimumOptions, Byte.MIN_VALUE, -20, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.ReverseV2Options, Byte.MAX_VALUE, -87, 25, -75, BuiltinOptions.ResizeNearestNeighborOptions, 13, BuiltinOptions.GreaterEqualOptions, -27, BuiltinOptions.ATan2Options, -97, -109, -55, -100, -17, OtaCommandGenerator.CMD_OTA_INFO, -32, BuiltinOptions.PackOptions, BuiltinOptions.MirrorPadOptions, -82, BuiltinOptions.NegOptions, -11, -80, -56, -21, -69, BuiltinOptions.LogicalOrOptions, -125, BuiltinOptions.GatherNdOptions, -103, BuiltinOptions.ScatterNdOptions, 23, BuiltinOptions.PadV2Options, 4, BuiltinOptions.RightShiftOptions, -70, BuiltinOptions.UnsortedSegmentMaxOptions, -42, BuiltinOptions.DequantizeOptions, -31, BuiltinOptions.Rfft2dOptions, 20, BuiltinOptions.DensifyOptions, BuiltinOptions.WhereOptions, BuiltinOptions.ExpOptions, 12, BuiltinOptions.BitwiseXorOptions};
    private static final int[] rcon = {1, 2, 4, 8, 16, 32, 64, 128, 27, 54, 108, JfifUtil.MARKER_SOI, DeviceFeatures.AI_AUDIO_SEARCH, 77, 154, 47, 94, 188, 99, 198, 151, 53, 106, 212, DeviceFeatures.MAP_MODE, 125, 250, TelnetCommand.EOR, DeviceFeatures.NETWORK_SHARE, 145};

    public AESLightEngine() {
    }

    private static int FFmulX(int i) {
        return (((i & m1) >>> 7) * 27) ^ ((m2 & i) << 1);
    }

    private static int FFmulX2(int i) {
        int i2 = (m5 & i) << 2;
        int i3 = i & m4;
        int i4 = i3 ^ (i3 >>> 1);
        return (i4 >>> 5) ^ (i2 ^ (i4 >>> 2));
    }

    private void decryptBlock(int[][] iArr) {
        int i = this.C0;
        int i2 = this.ROUNDS;
        int[] iArr2 = iArr[i2];
        int i3 = i ^ iArr2[0];
        int i4 = this.C1 ^ iArr2[1];
        int i5 = this.C2 ^ iArr2[2];
        int i6 = i2 - 1;
        int i7 = iArr2[3] ^ this.C3;
        while (true) {
            byte[] bArr = Si;
            int i8 = i3 & 255;
            if (i6 <= 1) {
                int inv_mcol = inv_mcol((((bArr[i8] & 255) ^ ((bArr[(i7 >> 8) & 255] & 255) << 8)) ^ ((bArr[(i5 >> 16) & 255] & 255) << 16)) ^ (bArr[(i4 >> 24) & 255] << 24)) ^ iArr[i6][0];
                int inv_mcol2 = inv_mcol((((bArr[i4 & 255] & 255) ^ ((bArr[(i3 >> 8) & 255] & 255) << 8)) ^ ((bArr[(i7 >> 16) & 255] & 255) << 16)) ^ (bArr[(i5 >> 24) & 255] << 24)) ^ iArr[i6][1];
                int inv_mcol3 = inv_mcol((((bArr[i5 & 255] & 255) ^ ((bArr[(i4 >> 8) & 255] & 255) << 8)) ^ ((bArr[(i3 >> 16) & 255] & 255) << 16)) ^ (bArr[(i7 >> 24) & 255] << 24)) ^ iArr[i6][2];
                int inv_mcol4 = inv_mcol((bArr[(i3 >> 24) & 255] << 24) ^ (((bArr[i7 & 255] & 255) ^ ((bArr[(i5 >> 8) & 255] & 255) << 8)) ^ ((bArr[(i4 >> 16) & 255] & 255) << 16))) ^ iArr[i6][3];
                int i9 = (((bArr[inv_mcol & 255] & 255) ^ ((bArr[(inv_mcol4 >> 8) & 255] & 255) << 8)) ^ ((bArr[(inv_mcol3 >> 16) & 255] & 255) << 16)) ^ (bArr[(inv_mcol2 >> 24) & 255] << 24);
                int[] iArr3 = iArr[0];
                this.C0 = i9 ^ iArr3[0];
                this.C1 = ((((bArr[inv_mcol2 & 255] & 255) ^ ((bArr[(inv_mcol >> 8) & 255] & 255) << 8)) ^ ((bArr[(inv_mcol4 >> 16) & 255] & 255) << 16)) ^ (bArr[(inv_mcol3 >> 24) & 255] << 24)) ^ iArr3[1];
                this.C2 = ((((bArr[inv_mcol3 & 255] & 255) ^ ((bArr[(inv_mcol2 >> 8) & 255] & 255) << 8)) ^ ((bArr[(inv_mcol >> 16) & 255] & 255) << 16)) ^ (bArr[(inv_mcol4 >> 24) & 255] << 24)) ^ iArr3[2];
                this.C3 = ((((bArr[inv_mcol4 & 255] & 255) ^ ((bArr[(inv_mcol3 >> 8) & 255] & 255) << 8)) ^ ((bArr[(inv_mcol2 >> 16) & 255] & 255) << 16)) ^ (bArr[(inv_mcol >> 24) & 255] << 24)) ^ iArr3[3];
                return;
            }
            int inv_mcol5 = inv_mcol((((bArr[i8] & 255) ^ ((bArr[(i7 >> 8) & 255] & 255) << 8)) ^ ((bArr[(i5 >> 16) & 255] & 255) << 16)) ^ (bArr[(i4 >> 24) & 255] << 24)) ^ iArr[i6][0];
            int inv_mcol6 = inv_mcol((((bArr[i4 & 255] & 255) ^ ((bArr[(i3 >> 8) & 255] & 255) << 8)) ^ ((bArr[(i7 >> 16) & 255] & 255) << 16)) ^ (bArr[(i5 >> 24) & 255] << 24)) ^ iArr[i6][1];
            int inv_mcol7 = inv_mcol((((bArr[i5 & 255] & 255) ^ ((bArr[(i4 >> 8) & 255] & 255) << 8)) ^ ((bArr[(i3 >> 16) & 255] & 255) << 16)) ^ (bArr[(i7 >> 24) & 255] << 24)) ^ iArr[i6][2];
            int inv_mcol8 = inv_mcol((bArr[(i3 >> 24) & 255] << 24) ^ (((bArr[i7 & 255] & 255) ^ ((bArr[(i5 >> 8) & 255] & 255) << 8)) ^ ((bArr[(i4 >> 16) & 255] & 255) << 16)));
            int i10 = i6 - 1;
            int i11 = inv_mcol8 ^ iArr[i6][3];
            int inv_mcol9 = inv_mcol((((bArr[inv_mcol5 & 255] & 255) ^ ((bArr[(i11 >> 8) & 255] & 255) << 8)) ^ ((bArr[(inv_mcol7 >> 16) & 255] & 255) << 16)) ^ (bArr[(inv_mcol6 >> 24) & 255] << 24)) ^ iArr[i10][0];
            int inv_mcol10 = inv_mcol((((bArr[inv_mcol6 & 255] & 255) ^ ((bArr[(inv_mcol5 >> 8) & 255] & 255) << 8)) ^ ((bArr[(i11 >> 16) & 255] & 255) << 16)) ^ (bArr[(inv_mcol7 >> 24) & 255] << 24)) ^ iArr[i10][1];
            int inv_mcol11 = inv_mcol((((bArr[inv_mcol7 & 255] & 255) ^ ((bArr[(inv_mcol6 >> 8) & 255] & 255) << 8)) ^ ((bArr[(inv_mcol5 >> 16) & 255] & 255) << 16)) ^ (bArr[(i11 >> 24) & 255] << 24)) ^ iArr[i10][2];
            i6 -= 2;
            i7 = iArr[i10][3] ^ inv_mcol((((bArr[i11 & 255] & 255) ^ ((bArr[(inv_mcol7 >> 8) & 255] & 255) << 8)) ^ ((bArr[(inv_mcol6 >> 16) & 255] & 255) << 16)) ^ (bArr[(inv_mcol5 >> 24) & 255] << 24));
            i3 = inv_mcol9;
            i4 = inv_mcol10;
            i5 = inv_mcol11;
        }
    }

    private void encryptBlock(int[][] iArr) {
        int i = this.C0;
        int[] iArr2 = iArr[0];
        int i2 = i ^ iArr2[0];
        int i3 = this.C1 ^ iArr2[1];
        int i4 = this.C2 ^ iArr2[2];
        int i5 = iArr2[3] ^ this.C3;
        int i6 = 1;
        while (i6 < this.ROUNDS - 1) {
            byte[] bArr = S;
            int mcol = mcol((((bArr[i2 & 255] & 255) ^ ((bArr[(i3 >> 8) & 255] & 255) << 8)) ^ ((bArr[(i4 >> 16) & 255] & 255) << 16)) ^ (bArr[(i5 >> 24) & 255] << 24)) ^ iArr[i6][0];
            int mcol2 = mcol((((bArr[i3 & 255] & 255) ^ ((bArr[(i4 >> 8) & 255] & 255) << 8)) ^ ((bArr[(i5 >> 16) & 255] & 255) << 16)) ^ (bArr[(i2 >> 24) & 255] << 24)) ^ iArr[i6][1];
            int mcol3 = mcol((((bArr[i4 & 255] & 255) ^ ((bArr[(i5 >> 8) & 255] & 255) << 8)) ^ ((bArr[(i2 >> 16) & 255] & 255) << 16)) ^ (bArr[(i3 >> 24) & 255] << 24)) ^ iArr[i6][2];
            int mcol4 = mcol(((((bArr[(i2 >> 8) & 255] & 255) << 8) ^ (bArr[i5 & 255] & 255)) ^ ((bArr[(i3 >> 16) & 255] & 255) << 16)) ^ (bArr[(i4 >> 24) & 255] << 24));
            int i7 = i6 + 1;
            int i8 = mcol4 ^ iArr[i6][3];
            int mcol5 = mcol((((bArr[mcol & 255] & 255) ^ ((bArr[(mcol2 >> 8) & 255] & 255) << 8)) ^ ((bArr[(mcol3 >> 16) & 255] & 255) << 16)) ^ (bArr[(i8 >> 24) & 255] << 24)) ^ iArr[i7][0];
            int mcol6 = mcol((((bArr[mcol2 & 255] & 255) ^ ((bArr[(mcol3 >> 8) & 255] & 255) << 8)) ^ ((bArr[(i8 >> 16) & 255] & 255) << 16)) ^ (bArr[(mcol >> 24) & 255] << 24)) ^ iArr[i7][1];
            int mcol7 = mcol((((bArr[mcol3 & 255] & 255) ^ ((bArr[(i8 >> 8) & 255] & 255) << 8)) ^ ((bArr[(mcol >> 16) & 255] & 255) << 16)) ^ (bArr[(mcol2 >> 24) & 255] << 24)) ^ iArr[i7][2];
            i6 += 2;
            i5 = iArr[i7][3] ^ mcol((((bArr[i8 & 255] & 255) ^ ((bArr[(mcol >> 8) & 255] & 255) << 8)) ^ ((bArr[(mcol2 >> 16) & 255] & 255) << 16)) ^ (bArr[(mcol3 >> 24) & 255] << 24));
            i2 = mcol5;
            i3 = mcol6;
            i4 = mcol7;
        }
        byte[] bArr2 = S;
        int mcol8 = mcol((((bArr2[i2 & 255] & 255) ^ ((bArr2[(i3 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(i4 >> 16) & 255] & 255) << 16)) ^ (bArr2[(i5 >> 24) & 255] << 24)) ^ iArr[i6][0];
        int mcol9 = mcol((((bArr2[i3 & 255] & 255) ^ ((bArr2[(i4 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(i5 >> 16) & 255] & 255) << 16)) ^ (bArr2[(i2 >> 24) & 255] << 24)) ^ iArr[i6][1];
        int mcol10 = mcol((((bArr2[i4 & 255] & 255) ^ ((bArr2[(i5 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(i2 >> 16) & 255] & 255) << 16)) ^ (bArr2[(i3 >> 24) & 255] << 24)) ^ iArr[i6][2];
        int mcol11 = mcol(((((bArr2[(i2 >> 8) & 255] & 255) << 8) ^ (bArr2[i5 & 255] & 255)) ^ ((bArr2[(i3 >> 16) & 255] & 255) << 16)) ^ (bArr2[(i4 >> 24) & 255] << 24)) ^ iArr[i6][3];
        int i9 = (((bArr2[mcol8 & 255] & 255) ^ ((bArr2[(mcol9 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(mcol10 >> 16) & 255] & 255) << 16)) ^ (bArr2[(mcol11 >> 24) & 255] << 24);
        int[] iArr3 = iArr[i6 + 1];
        this.C0 = iArr3[0] ^ i9;
        this.C1 = ((((bArr2[mcol9 & 255] & 255) ^ ((bArr2[(mcol10 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(mcol11 >> 16) & 255] & 255) << 16)) ^ (bArr2[(mcol8 >> 24) & 255] << 24)) ^ iArr3[1];
        this.C2 = ((((bArr2[mcol10 & 255] & 255) ^ ((bArr2[(mcol11 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(mcol8 >> 16) & 255] & 255) << 16)) ^ (bArr2[(mcol9 >> 24) & 255] << 24)) ^ iArr3[2];
        this.C3 = ((((bArr2[mcol11 & 255] & 255) ^ ((bArr2[(mcol8 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(mcol9 >> 16) & 255] & 255) << 16)) ^ (bArr2[(mcol10 >> 24) & 255] << 24)) ^ iArr3[3];
    }

    private int[][] generateWorkingKey(byte[] bArr, boolean z) {
        int i;
        int length = bArr.length;
        if (length < 16 || length > 32 || (length & 7) != 0) {
            throw new IllegalArgumentException("Key length not 128/192/256 bits.");
        }
        int i2 = length >> 2;
        this.ROUNDS = i2 + 6;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i2 + 7, 4);
        if (i2 == 4) {
            i = 1;
            int littleEndianToInt = Pack.littleEndianToInt(bArr, 0);
            iArr[0][0] = littleEndianToInt;
            int littleEndianToInt2 = Pack.littleEndianToInt(bArr, 4);
            iArr[0][1] = littleEndianToInt2;
            int littleEndianToInt3 = Pack.littleEndianToInt(bArr, 8);
            iArr[0][2] = littleEndianToInt3;
            int littleEndianToInt4 = Pack.littleEndianToInt(bArr, 12);
            iArr[0][3] = littleEndianToInt4;
            for (int i3 = 1; i3 <= 10; i3++) {
                littleEndianToInt ^= subWord(shift(littleEndianToInt4, 8)) ^ rcon[i3 - 1];
                int[] iArr2 = iArr[i3];
                iArr2[0] = littleEndianToInt;
                littleEndianToInt2 ^= littleEndianToInt;
                iArr2[1] = littleEndianToInt2;
                littleEndianToInt3 ^= littleEndianToInt2;
                iArr2[2] = littleEndianToInt3;
                littleEndianToInt4 ^= littleEndianToInt3;
                iArr2[3] = littleEndianToInt4;
            }
        } else if (i2 == 6) {
            i = 1;
            int littleEndianToInt5 = Pack.littleEndianToInt(bArr, 0);
            iArr[0][0] = littleEndianToInt5;
            int littleEndianToInt6 = Pack.littleEndianToInt(bArr, 4);
            iArr[0][1] = littleEndianToInt6;
            int littleEndianToInt7 = Pack.littleEndianToInt(bArr, 8);
            iArr[0][2] = littleEndianToInt7;
            int littleEndianToInt8 = Pack.littleEndianToInt(bArr, 12);
            iArr[0][3] = littleEndianToInt8;
            int littleEndianToInt9 = Pack.littleEndianToInt(bArr, 16);
            iArr[1][0] = littleEndianToInt9;
            int littleEndianToInt10 = Pack.littleEndianToInt(bArr, 20);
            iArr[1][1] = littleEndianToInt10;
            int subWord = littleEndianToInt5 ^ (subWord(shift(littleEndianToInt10, 8)) ^ 1);
            int[] iArr3 = iArr[1];
            iArr3[2] = subWord;
            int i4 = littleEndianToInt6 ^ subWord;
            iArr3[3] = i4;
            int i5 = littleEndianToInt7 ^ i4;
            int[] iArr4 = iArr[2];
            iArr4[0] = i5;
            int i6 = littleEndianToInt8 ^ i5;
            iArr4[1] = i6;
            int i7 = littleEndianToInt9 ^ i6;
            iArr4[2] = i7;
            int i8 = littleEndianToInt10 ^ i7;
            iArr4[3] = i8;
            int i9 = 2;
            for (int i10 = 3; i10 < 12; i10 += 3) {
                int subWord2 = subWord ^ (subWord(shift(i8, 8)) ^ i9);
                int[] iArr5 = iArr[i10];
                iArr5[0] = subWord2;
                int i11 = i4 ^ subWord2;
                iArr5[1] = i11;
                int i12 = i5 ^ i11;
                iArr5[2] = i12;
                int i13 = i6 ^ i12;
                iArr5[3] = i13;
                int i14 = i7 ^ i13;
                int i15 = i10 + 1;
                int[] iArr6 = iArr[i15];
                iArr6[0] = i14;
                int i16 = i8 ^ i14;
                iArr6[1] = i16;
                int subWord3 = subWord(shift(i16, 8)) ^ (i9 << 1);
                i9 <<= 2;
                subWord = subWord2 ^ subWord3;
                int[] iArr7 = iArr[i15];
                iArr7[2] = subWord;
                i4 = i11 ^ subWord;
                iArr7[3] = i4;
                i5 = i12 ^ i4;
                int[] iArr8 = iArr[i10 + 2];
                iArr8[0] = i5;
                i6 = i13 ^ i5;
                iArr8[1] = i6;
                i7 = i14 ^ i6;
                iArr8[2] = i7;
                i8 = i16 ^ i7;
                iArr8[3] = i8;
            }
            int subWord4 = (subWord(shift(i8, 8)) ^ i9) ^ subWord;
            int[] iArr9 = iArr[12];
            iArr9[0] = subWord4;
            int i17 = subWord4 ^ i4;
            iArr9[1] = i17;
            int i18 = i17 ^ i5;
            iArr9[2] = i18;
            iArr9[3] = i18 ^ i6;
        } else {
            if (i2 != 8) {
                throw new IllegalStateException("Should never get here");
            }
            int littleEndianToInt11 = Pack.littleEndianToInt(bArr, 0);
            iArr[0][0] = littleEndianToInt11;
            int littleEndianToInt12 = Pack.littleEndianToInt(bArr, 4);
            iArr[0][1] = littleEndianToInt12;
            int littleEndianToInt13 = Pack.littleEndianToInt(bArr, 8);
            iArr[0][2] = littleEndianToInt13;
            int littleEndianToInt14 = Pack.littleEndianToInt(bArr, 12);
            iArr[0][3] = littleEndianToInt14;
            int littleEndianToInt15 = Pack.littleEndianToInt(bArr, 16);
            iArr[1][0] = littleEndianToInt15;
            int littleEndianToInt16 = Pack.littleEndianToInt(bArr, 20);
            iArr[1][1] = littleEndianToInt16;
            int littleEndianToInt17 = Pack.littleEndianToInt(bArr, 24);
            iArr[1][2] = littleEndianToInt17;
            int littleEndianToInt18 = Pack.littleEndianToInt(bArr, 28);
            iArr[1][3] = littleEndianToInt18;
            int i19 = 1;
            i = 1;
            for (int i20 = 2; i20 < 14; i20 += 2) {
                int subWord5 = subWord(shift(littleEndianToInt18, 8)) ^ i19;
                i19 <<= 1;
                littleEndianToInt11 ^= subWord5;
                int[] iArr10 = iArr[i20];
                iArr10[0] = littleEndianToInt11;
                littleEndianToInt12 ^= littleEndianToInt11;
                iArr10[1] = littleEndianToInt12;
                littleEndianToInt13 ^= littleEndianToInt12;
                iArr10[2] = littleEndianToInt13;
                littleEndianToInt14 ^= littleEndianToInt13;
                iArr10[3] = littleEndianToInt14;
                littleEndianToInt15 ^= subWord(littleEndianToInt14);
                int[] iArr11 = iArr[i20 + 1];
                iArr11[0] = littleEndianToInt15;
                littleEndianToInt16 ^= littleEndianToInt15;
                iArr11[1] = littleEndianToInt16;
                littleEndianToInt17 ^= littleEndianToInt16;
                iArr11[2] = littleEndianToInt17;
                littleEndianToInt18 ^= littleEndianToInt17;
                iArr11[3] = littleEndianToInt18;
            }
            int subWord6 = (subWord(shift(littleEndianToInt18, 8)) ^ i19) ^ littleEndianToInt11;
            int[] iArr12 = iArr[14];
            iArr12[0] = subWord6;
            int i21 = subWord6 ^ littleEndianToInt12;
            iArr12[1] = i21;
            int i22 = i21 ^ littleEndianToInt13;
            iArr12[2] = i22;
            iArr12[3] = i22 ^ littleEndianToInt14;
        }
        if (!z) {
            for (int i23 = i; i23 < this.ROUNDS; i23++) {
                for (int i24 = 0; i24 < 4; i24++) {
                    int[] iArr13 = iArr[i23];
                    iArr13[i24] = inv_mcol(iArr13[i24]);
                }
            }
        }
        return iArr;
    }

    private static int inv_mcol(int i) {
        int shift = shift(i, 8) ^ i;
        int FFmulX = i ^ FFmulX(shift);
        int FFmulX2 = shift ^ FFmulX2(FFmulX);
        return FFmulX ^ (FFmulX2 ^ shift(FFmulX2, 16));
    }

    private static int mcol(int i) {
        int shift = shift(i, 8);
        int i2 = i ^ shift;
        return FFmulX(i2) ^ (shift ^ shift(i2, 16));
    }

    private void packBlock(byte[] bArr, int i) {
        int i2 = this.C0;
        bArr[i] = (byte) i2;
        bArr[i + 1] = (byte) (i2 >> 8);
        bArr[i + 2] = (byte) (i2 >> 16);
        bArr[i + 3] = (byte) (i2 >> 24);
        int i3 = this.C1;
        bArr[i + 4] = (byte) i3;
        bArr[i + 5] = (byte) (i3 >> 8);
        bArr[i + 6] = (byte) (i3 >> 16);
        bArr[i + 7] = (byte) (i3 >> 24);
        int i4 = this.C2;
        bArr[i + 8] = (byte) i4;
        bArr[i + 9] = (byte) (i4 >> 8);
        bArr[i + 10] = (byte) (i4 >> 16);
        bArr[i + 11] = (byte) (i4 >> 24);
        int i5 = this.C3;
        bArr[i + 12] = (byte) i5;
        bArr[i + 13] = (byte) (i5 >> 8);
        bArr[i + 14] = (byte) (i5 >> 16);
        bArr[i + 15] = (byte) (i5 >> 24);
    }

    private static int shift(int i, int i2) {
        return (i << (-i2)) | (i >>> i2);
    }

    private static int subWord(int i) {
        byte[] bArr = S;
        return (bArr[(i >> 24) & 255] << 24) | (bArr[i & 255] & 255) | ((bArr[(i >> 8) & 255] & 255) << 8) | ((bArr[(i >> 16) & 255] & 255) << 16);
    }

    private void unpackBlock(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        this.C0 = i2;
        int i3 = ((bArr[i + 1] & 255) << 8) | i2;
        this.C0 = i3;
        int i4 = i3 | ((bArr[i + 2] & 255) << 16);
        this.C0 = i4;
        this.C0 = i4 | (bArr[i + 3] << 24);
        int i5 = bArr[i + 4] & 255;
        this.C1 = i5;
        int i6 = ((bArr[i + 5] & 255) << 8) | i5;
        this.C1 = i6;
        int i7 = i6 | ((bArr[i + 6] & 255) << 16);
        this.C1 = i7;
        this.C1 = i7 | (bArr[i + 7] << 24);
        int i8 = bArr[i + 8] & 255;
        this.C2 = i8;
        int i9 = ((bArr[i + 9] & 255) << 8) | i8;
        this.C2 = i9;
        int i10 = i9 | ((bArr[i + 10] & 255) << 16);
        this.C2 = i10;
        this.C2 = i10 | (bArr[i + 11] << 24);
        int i11 = bArr[i + 12] & 255;
        this.C3 = i11;
        int i12 = ((bArr[i + 13] & 255) << 8) | i11;
        this.C3 = i12;
        int i13 = i12 | ((bArr[i + 14] & 255) << 16);
        this.C3 = i13;
        this.C3 = (bArr[i + 15] << 24) | i13;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "AES";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("invalid parameter passed to AES init - " + cipherParameters.getClass().getName());
        }
        this.WorkingKey = generateWorkingKey(((KeyParameter) cipherParameters).getKey(), z);
        this.forEncryption = z;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.WorkingKey == null) {
            throw new IllegalStateException("AES engine not initialised");
        }
        if (i + 16 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i2 + 16 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        boolean z = this.forEncryption;
        unpackBlock(bArr, i);
        int[][] iArr = this.WorkingKey;
        if (z) {
            encryptBlock(iArr);
        } else {
            decryptBlock(iArr);
        }
        packBlock(bArr2, i2);
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
