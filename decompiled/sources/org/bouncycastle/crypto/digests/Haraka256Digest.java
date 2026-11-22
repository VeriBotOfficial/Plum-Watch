package org.bouncycastle.crypto.digests;

import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import com.bluetrum.fota.manager.OtaCommandGenerator;
import com.hispark.crashdump.protocol.ProtocolBytes;
import java.lang.reflect.Array;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: classes8.dex */
public class Haraka256Digest extends HarakaBase {
    private static final byte[][] RC = {new byte[]{6, -124, BuiltinOptions.ReadVariableOptions, BuiltinOptions.SquaredDifferenceOptions, -26, 32, -64, 10, -78, -59, -2, TransmissionUnpacked.HD_VAL_MAGIC_HB, BuiltinOptions.DynamicUpdateSliceOptions, -127, BuiltinOptions.SignOptions, -99}, new byte[]{-117, BuiltinOptions.CumsumOptions, -76, -31, -120, -13, OtaCommandGenerator.CMD_OTA_INFO, BuiltinOptions.HashtableOptions, BuiltinOptions.SegmentSumOptions, 15, BuiltinOptions.HashtableOptions, -92, BuiltinOptions.SelectOptions, 8, -9, 23}, new byte[]{BuiltinOptions.ExpandDimsOptions, 2, -34, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.GatherNdOptions, -14, -124, -104, -49, 2, -99, BuiltinOptions.NonMaxSuppressionV5Options, -97, 2, OtaCommandGenerator.CMD_GET_INFO, 20}, new byte[]{14, -42, -22, -26, BuiltinOptions.LessEqualOptions, BuiltinOptions.SignOptions, BuiltinOptions.SplitVOptions, 8, -69, -13, PSSSigner.TRAILER_IMPLICIT, ProtocolBytes.SOF, -3, BuiltinOptions.HardSwishOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.UnsortedSegmentSumOptions}, new byte[]{-53, -49, -80, -53, BuiltinOptions.FloorModOptions, BuiltinOptions.RandomOptions, BuiltinOptions.FillOptions, -117, BuiltinOptions.UnsortedSegmentSumOptions, -18, -51, 28, -66, BuiltinOptions.ArgMinOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.FillOptions}, new byte[]{BuiltinOptions.RightShiftOptions, -22, -51, -18, BuiltinOptions.HashtableSizeOptions, OtaCommandGenerator.CMD_NOTIFY_STATUS, BuiltinOptions.SparseToDenseOptions, -73, -115, BuiltinOptions.GatherNdOptions, BuiltinOptions.EqualOptions, -19, BuiltinOptions.PadV2Options, -118, 5, BuiltinOptions.SignOptions}, new byte[]{BuiltinOptions.CallOnceOptions, -62, -113, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.BitcastOptions, -48, -30, BuiltinOptions.FloorDivOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.ScatterNdOptions, -38, BuiltinOptions.SplitVOptions, -17, 27}, new byte[]{BuiltinOptions.LessOptions, BuiltinOptions.LogSoftmaxOptions, -39, -80, ProtocolBytes.SOF, -54, -52, 7, BuiltinOptions.CallOnceOptions, BuiltinOptions.NonMaxSuppressionV4Options, -3, -30, 31, -57, 11, BuiltinOptions.PackOptions}, new byte[]{-85, BuiltinOptions.MirrorPadOptions, BuiltinOptions.DensifyOptions, -15, -26, -122, Byte.MAX_VALUE, -23, -20, -37, -113, -54, -71, -44, BuiltinOptions.BatchMatMulOptions, -18}, new byte[]{28, BuiltinOptions.SliceOptions, -65, -124, -44, -73, -51, BuiltinOptions.SegmentSumOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.NegOptions, 64, BuiltinOptions.SplitVOptions, -83, 3, BuiltinOptions.RightShiftOptions, BuiltinOptions.TileOptions}, new byte[]{-78, -52, 11, -71, -108, 23, 35, -65, BuiltinOptions.Rfft2dOptions, 2, -117, BuiltinOptions.LessEqualOptions, -115, -10, -104, 0}, new byte[]{-6, 4, BuiltinOptions.UnsortedSegmentMinOptions, -90, -34, BuiltinOptions.VarHandleOptions, BuiltinOptions.WhereOptions, BuiltinOptions.RandomOptions, BuiltinOptions.ResizeNearestNeighborOptions, -86, -98, -56, BuiltinOptions.IfOptions, -99, BuiltinOptions.GreaterEqualOptions, -118}, new byte[]{-33, -76, -97, BuiltinOptions.PadV2Options, BuiltinOptions.HashtableOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.NegOptions, 18, 14, -6, BuiltinOptions.SplitVOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.LessOptions, 18, -97, -44}, new byte[]{30, -95, 3, BuiltinOptions.FillOptions, -12, BuiltinOptions.RangeOptions, -94, BuiltinOptions.NotEqualOptions, BuiltinOptions.SparseToDenseOptions, -42, 17, -82, -69, BuiltinOptions.Conv3DOptions, 18, -18}, new byte[]{ProtocolBytes.SOF, 4, BuiltinOptions.RangeOptions, -120, BuiltinOptions.LeakyReluOptions, 5, 0, -124, BuiltinOptions.NonMaxSuppressionV4Options, -106, 0, -55, -100, -88, -20, -90}, new byte[]{BuiltinOptions.ExpOptions, 2, BuiltinOptions.DepthToSpaceOptions, -40, -99, 25, -100, BuiltinOptions.SplitVOptions, BuiltinOptions.UnsortedSegmentMinOptions, -94, -57, -29, BuiltinOptions.MaximumMinimumOptions, -27, -109, -20}, new byte[]{-65, 58, -86, -8, -89, BuiltinOptions.QuantizeOptions, -55, -73, -71, BuiltinOptions.ArgMaxOptions, BuiltinOptions.LessEqualOptions, -51, -126, -44, 1, BuiltinOptions.BucketizeOptions}, new byte[]{BuiltinOptions.SelectV2Options, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.ReadVariableOptions, 13, BuiltinOptions.ScatterNdOptions, -122, -80, 23, BuiltinOptions.ShapeOptions, -14, -17, -39, 16, BuiltinOptions.SliceOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.HashtableOptions}, new byte[]{BuiltinOptions.MatrixSetDiagOptions, -54, BuiltinOptions.BidirectionalSequenceLSTMOptions, -62, BuiltinOptions.ExpOptions, BuiltinOptions.SliceOptions, 4, BuiltinOptions.ZerosLikeOptions, -127, -62, OtaCommandGenerator.CMD_GET_INFO, BuiltinOptions.GatherNdOptions, -10, -4, -102, -58}, new byte[]{OtaCommandGenerator.CMD_GET_INFO_TLV, 35, -105, BuiltinOptions.LogicalOrOptions, 34, BuiltinOptions.HashtableOptions, BuiltinOptions.BroadcastToOptions, -69, BuiltinOptions.GreaterOptions, ProtocolBytes.SOF, OtaCommandGenerator.CMD_GET_INFO_TLV, -24, BuiltinOptions.NotEqualOptions, -47, -108, 58}};
    private final byte[] buffer;
    private int off;

    public Haraka256Digest() {
        this.buffer = new byte[32];
    }

    public Haraka256Digest(Haraka256Digest haraka256Digest) {
        this.buffer = Arrays.clone(haraka256Digest.buffer);
        this.off = haraka256Digest.off;
    }

    private int haraka256256(byte[] bArr, byte[] bArr2, int i) {
        byte[][] bArr3 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 2, 16);
        byte[][] bArr4 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 2, 16);
        System.arraycopy(bArr, 0, bArr3[0], 0, 16);
        System.arraycopy(bArr, 16, bArr3[1], 0, 16);
        byte[] bArr5 = bArr3[0];
        byte[][] bArr6 = RC;
        bArr3[0] = aesEnc(bArr5, bArr6[0]);
        bArr3[1] = aesEnc(bArr3[1], bArr6[1]);
        bArr3[0] = aesEnc(bArr3[0], bArr6[2]);
        bArr3[1] = aesEnc(bArr3[1], bArr6[3]);
        mix256(bArr3, bArr4);
        bArr3[0] = aesEnc(bArr4[0], bArr6[4]);
        bArr3[1] = aesEnc(bArr4[1], bArr6[5]);
        bArr3[0] = aesEnc(bArr3[0], bArr6[6]);
        bArr3[1] = aesEnc(bArr3[1], bArr6[7]);
        mix256(bArr3, bArr4);
        bArr3[0] = aesEnc(bArr4[0], bArr6[8]);
        bArr3[1] = aesEnc(bArr4[1], bArr6[9]);
        bArr3[0] = aesEnc(bArr3[0], bArr6[10]);
        bArr3[1] = aesEnc(bArr3[1], bArr6[11]);
        mix256(bArr3, bArr4);
        bArr3[0] = aesEnc(bArr4[0], bArr6[12]);
        bArr3[1] = aesEnc(bArr4[1], bArr6[13]);
        bArr3[0] = aesEnc(bArr3[0], bArr6[14]);
        bArr3[1] = aesEnc(bArr3[1], bArr6[15]);
        mix256(bArr3, bArr4);
        bArr3[0] = aesEnc(bArr4[0], bArr6[16]);
        bArr3[1] = aesEnc(bArr4[1], bArr6[17]);
        bArr3[0] = aesEnc(bArr3[0], bArr6[18]);
        bArr3[1] = aesEnc(bArr3[1], bArr6[19]);
        mix256(bArr3, bArr4);
        bArr3[0] = xor(bArr4[0], bArr, 0);
        bArr3[1] = xor(bArr4[1], bArr, 16);
        System.arraycopy(bArr3[0], 0, bArr2, i, 16);
        System.arraycopy(bArr3[1], 0, bArr2, i + 16, 16);
        return 32;
    }

    private void mix256(byte[][] bArr, byte[][] bArr2) {
        System.arraycopy(bArr[0], 0, bArr2[0], 0, 4);
        System.arraycopy(bArr[1], 0, bArr2[0], 4, 4);
        System.arraycopy(bArr[0], 4, bArr2[0], 8, 4);
        System.arraycopy(bArr[1], 4, bArr2[0], 12, 4);
        System.arraycopy(bArr[0], 8, bArr2[1], 0, 4);
        System.arraycopy(bArr[1], 8, bArr2[1], 4, 4);
        System.arraycopy(bArr[0], 12, bArr2[1], 8, 4);
        System.arraycopy(bArr[1], 12, bArr2[1], 12, 4);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        if (this.off != 32) {
            throw new IllegalStateException("input must be exactly 32 bytes");
        }
        if (bArr.length - i < 32) {
            throw new IllegalArgumentException("output too short to receive digest");
        }
        int haraka256256 = haraka256256(this.buffer, bArr, i);
        reset();
        return haraka256256;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "Haraka-256";
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.off = 0;
        Arrays.clear(this.buffer);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b) {
        int i = this.off;
        if (i + 1 > 32) {
            throw new IllegalArgumentException("total input cannot be more than 32 bytes");
        }
        byte[] bArr = this.buffer;
        this.off = i + 1;
        bArr[i] = b;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i, int i2) {
        int i3 = this.off;
        if (i3 + i2 > 32) {
            throw new IllegalArgumentException("total input cannot be more than 32 bytes");
        }
        System.arraycopy(bArr, i, this.buffer, i3, i2);
        this.off += i2;
    }
}
