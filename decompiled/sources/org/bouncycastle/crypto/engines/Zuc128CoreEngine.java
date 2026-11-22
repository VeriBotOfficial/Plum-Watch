package org.bouncycastle.crypto.engines;

import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import com.bluetrum.fota.manager.OtaCommandGenerator;
import com.hispark.crashdump.protocol.ProtocolBytes;
import kotlin.UShort;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.util.Memoable;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: classes8.dex */
public class Zuc128CoreEngine implements StreamCipher, Memoable {
    private final int[] BRC;
    private final int[] F;
    private final int[] LFSR;
    private final byte[] keyStream;
    private int theIndex;
    private int theIterations;
    private Zuc128CoreEngine theResetState;
    private static final byte[] S0 = {BuiltinOptions.LogicalAndOptions, BuiltinOptions.RandomOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, -54, -32, 0, BuiltinOptions.TileOptions, 4, -47, BuiltinOptions.CosOptions, -104, 9, -71, BuiltinOptions.HashtableImportOptions, -53, BuiltinOptions.SignOptions, 27, -7, BuiltinOptions.SparseToDenseOptions, ProtocolBytes.SOF, -99, BuiltinOptions.Conv3DOptions, -91, -72, BuiltinOptions.GreaterEqualOptions, -4, 29, 8, BuiltinOptions.GatherNdOptions, 3, OtaCommandGenerator.CMD_NOTIFY_STATUS, BuiltinOptions.MirrorPadOptions, BuiltinOptions.AbsOptions, -124, -103, -28, -50, -39, OtaCommandGenerator.CMD_GET_INFO, -35, -74, -123, BuiltinOptions.FloorModOptions, -117, BuiltinOptions.LessOptions, BuiltinOptions.HashtableSizeOptions, -84, -51, -63, -8, 30, BuiltinOptions.BucketizeOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.Rfft2dOptions, -58, -75, -67, -3, BuiltinOptions.ArgMinOptions, BuiltinOptions.DensifyOptions, 32, -44, BuiltinOptions.PowOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.BitwiseXorOptions, -78, -89, -49, -19, BuiltinOptions.ReverseSequenceOptions, -59, -13, BuiltinOptions.GreaterOptions, -69, 20, BuiltinOptions.ExpOptions, 6, BuiltinOptions.WhereOptions, -101, -29, -17, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SplitVOptions, Byte.MAX_VALUE, BuiltinOptions.MatrixSetDiagOptions, -92, 13, -126, BuiltinOptions.ReverseV2Options, BuiltinOptions.RangeOptions, BuiltinOptions.NonMaxSuppressionV4Options, -70, BuiltinOptions.MatrixDiagOptions, 28, BuiltinOptions.ResizeNearestNeighborOptions, 22, TransmissionUnpacked.HD_VAL_MAGIC_LB, 23, -88, OtaCommandGenerator.CMD_GET_INFO_TLV, BuiltinOptions.LogSoftmaxOptions, 31, -116, -1, -40, -82, BuiltinOptions.LessEqualOptions, 1, -45, -83, BuiltinOptions.PackOptions, BuiltinOptions.LeakyReluOptions, -38, BuiltinOptions.BidirectionalSequenceRNNOptions, -21, -55, -34, -102, -113, -121, -41, 58, Byte.MIN_VALUE, BuiltinOptions.VarHandleOptions, BuiltinOptions.SelectOptions, -56, -79, -76, BuiltinOptions.ShapeOptions, -9, 10, 34, 19, BuiltinOptions.ArgMaxOptions, BuiltinOptions.BitcastOptions, -52, BuiltinOptions.LogicalOrOptions, -119, -57, -61, -106, BuiltinOptions.RankOptions, 7, -65, BuiltinOptions.RightShiftOptions, TransmissionUnpacked.HD_VAL_MAGIC_HB, 11, BuiltinOptions.PadV2Options, -105, BuiltinOptions.AddNOptions, BuiltinOptions.EqualOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.ScatterNdOptions, -90, BuiltinOptions.SquaredDifferenceOptions, 16, -2, PSSSigner.TRAILER_IMPLICIT, BuiltinOptions.DequantizeOptions, -107, -120, -118, -80, -93, -5, -64, 24, -108, -14, -31, -27, -23, BuiltinOptions.WhileOptions, -48, -36, 17, BuiltinOptions.CumsumOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.IfOptions, -20, BuiltinOptions.QuantizeOptions, BuiltinOptions.SquareOptions, BuiltinOptions.DynamicUpdateSliceOptions, 18, -11, BuiltinOptions.GeluOptions, -100, -86, 35, 14, -122, -85, -66, BuiltinOptions.NegOptions, 2, -25, BuiltinOptions.CallOnceOptions, -26, BuiltinOptions.FillOptions, -94, BuiltinOptions.HashtableFindOptions, -62, -109, -97, -15, -10, -6, BuiltinOptions.NotEqualOptions, -46, BuiltinOptions.UniqueOptions, BuiltinOptions.BroadcastToOptions, -98, BuiltinOptions.SelectV2Options, BuiltinOptions.AssignVariableOptions, 21, 61, -42, 64, -60, -30, 15, -114, -125, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.CastOptions, 5, 63, 12, BuiltinOptions.SliceOptions, -22, BuiltinOptions.ReadVariableOptions, -73, -95, -24, -87, BuiltinOptions.BatchMatMulOptions, -115, BuiltinOptions.MaximumMinimumOptions, 26, -37, -127, -77, OtaCommandGenerator.CMD_OTA_INFO, -12, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.ATan2Options, 25, -33, -18, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.NonMaxSuppressionV5Options};
    private static final byte[] S1 = {BuiltinOptions.WhereOptions, -62, BuiltinOptions.DensifyOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.PackOptions, -56, BuiltinOptions.UnidirectionalSequenceLSTMOptions, -122, -97, BuiltinOptions.LogicalOrOptions, -38, BuiltinOptions.HardSwishOptions, BuiltinOptions.LessOptions, -86, -3, BuiltinOptions.UnsortedSegmentMaxOptions, -116, -59, -108, 12, -90, 26, 19, 0, -29, -88, 22, BuiltinOptions.RandomOptions, 64, -7, -8, BuiltinOptions.SquareOptions, BuiltinOptions.FillOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.BroadcastToOptions, -106, -127, -39, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.LogicalAndOptions, 16, BuiltinOptions.UnsortedSegmentProdOptions, -58, -89, -117, BuiltinOptions.ArgMinOptions, BuiltinOptions.ZerosLikeOptions, -31, 58, -75, BuiltinOptions.RankOptions, BuiltinOptions.NegOptions, -64, BuiltinOptions.HashtableImportOptions, -77, 5, 34, BuiltinOptions.CumsumOptions, -65, -36, 11, -6, BuiltinOptions.SelectV2Options, BuiltinOptions.FloorModOptions, -35, 32, 17, 6, BuiltinOptions.NotEqualOptions, -55, -63, -49, -10, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.AddNOptions, -69, BuiltinOptions.Rfft2dOptions, -11, -44, -121, Byte.MAX_VALUE, -124, BuiltinOptions.SquaredDifferenceOptions, -46, -100, BuiltinOptions.ReverseSequenceOptions, -92, PSSSigner.TRAILER_IMPLICIT, BuiltinOptions.SplitVOptions, -102, -33, -2, -42, -115, BuiltinOptions.ATan2Options, -21, BuiltinOptions.PadV2Options, BuiltinOptions.GatherNdOptions, -40, BuiltinOptions.IfOptions, -95, 20, 23, -5, 35, TransmissionUnpacked.HD_VAL_MAGIC_LB, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.SliceOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.BucketizeOptions, 8, 9, -18, -73, BuiltinOptions.ReadVariableOptions, 63, BuiltinOptions.ScatterNdOptions, -78, 25, -114, BuiltinOptions.AbsOptions, -27, BuiltinOptions.LeakyReluOptions, -109, -113, BuiltinOptions.WhileOptions, -37, -87, -83, -15, -82, BuiltinOptions.LessEqualOptions, -53, 13, -4, -12, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.HashtableSizeOptions, 29, -105, -24, -47, -23, BuiltinOptions.MirrorPadOptions, BuiltinOptions.ShapeOptions, -91, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.DepthToSpaceOptions, -125, -98, -85, -126, -99, -71, 28, -32, -51, BuiltinOptions.RangeOptions, -119, 1, -74, -67, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.LogSoftmaxOptions, -94, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.PowOptions, BuiltinOptions.UnsortedSegmentMinOptions, -103, 21, OtaCommandGenerator.CMD_NOTIFY_STATUS, BuiltinOptions.UniqueOptions, -72, -107, -28, -48, OtaCommandGenerator.CMD_GET_INFO, -57, -50, -19, 15, -76, BuiltinOptions.VarHandleOptions, OtaCommandGenerator.CMD_OTA_INFO, -52, TransmissionUnpacked.HD_VAL_MAGIC_HB, 2, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.UnsortedSegmentSumOptions, -61, -34, -93, -17, -22, BuiltinOptions.ReverseV2Options, -26, BuiltinOptions.HashtableOptions, 24, -20, 27, BuiltinOptions.GreaterOptions, Byte.MIN_VALUE, -9, BuiltinOptions.GeluOptions, -25, -1, BuiltinOptions.ExpOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.CosOptions, 30, BuiltinOptions.FloorDivOptions, BuiltinOptions.TransposeConvOptions, OtaCommandGenerator.CMD_GET_INFO_TLV, BuiltinOptions.EqualOptions, -60, BuiltinOptions.TileOptions, 7, 10, -70, BuiltinOptions.RightShiftOptions, 14, BuiltinOptions.ExpandDimsOptions, -120, -79, -104, BuiltinOptions.BitcastOptions, -13, 61, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.HashtableFindOptions, BuiltinOptions.SignOptions, -54, -45, 31, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.BatchMatMulOptions, 4, BuiltinOptions.ArgMaxOptions, BuiltinOptions.SegmentSumOptions, -66, -123, -101, BuiltinOptions.SelectOptions, BuiltinOptions.QuantizeOptions, -118, -41, -80, BuiltinOptions.CastOptions, -84, ProtocolBytes.SOF, 18, 3, -30, -14};
    private static final short[] EK_d = {17623, 9916, 25195, 4958, 22409, 13794, 28981, 2479, 19832, 12051, 27588, 6897, 24102, 15437, 30874, 18348};

    protected Zuc128CoreEngine() {
        this.LFSR = new int[16];
        this.F = new int[2];
        this.BRC = new int[4];
        this.keyStream = new byte[4];
    }

    protected Zuc128CoreEngine(Zuc128CoreEngine zuc128CoreEngine) {
        this.LFSR = new int[16];
        this.F = new int[2];
        this.BRC = new int[4];
        this.keyStream = new byte[4];
        reset(zuc128CoreEngine);
    }

    private int AddM(int i, int i2) {
        int i3 = i + i2;
        return (Integer.MAX_VALUE & i3) + (i3 >>> 31);
    }

    private void BitReorganization() {
        int[] iArr = this.BRC;
        int[] iArr2 = this.LFSR;
        iArr[0] = ((iArr2[15] & 2147450880) << 1) | (iArr2[14] & 65535);
        iArr[1] = ((iArr2[11] & 65535) << 16) | (iArr2[9] >>> 15);
        iArr[2] = ((iArr2[7] & 65535) << 16) | (iArr2[5] >>> 15);
        iArr[3] = (iArr2[0] >>> 15) | ((iArr2[2] & 65535) << 16);
    }

    private static int L1(int i) {
        return ROT(i, 24) ^ (((ROT(i, 2) ^ i) ^ ROT(i, 10)) ^ ROT(i, 18));
    }

    private static int L2(int i) {
        return ROT(i, 30) ^ (((ROT(i, 8) ^ i) ^ ROT(i, 14)) ^ ROT(i, 22));
    }

    private void LFSRWithInitialisationMode(int i) {
        int i2 = this.LFSR[0];
        int AddM = AddM(AddM(AddM(AddM(AddM(AddM(i2, MulByPow2(i2, 8)), MulByPow2(this.LFSR[4], 20)), MulByPow2(this.LFSR[10], 21)), MulByPow2(this.LFSR[13], 17)), MulByPow2(this.LFSR[15], 15)), i);
        int[] iArr = this.LFSR;
        iArr[0] = iArr[1];
        iArr[1] = iArr[2];
        iArr[2] = iArr[3];
        iArr[3] = iArr[4];
        iArr[4] = iArr[5];
        iArr[5] = iArr[6];
        iArr[6] = iArr[7];
        iArr[7] = iArr[8];
        iArr[8] = iArr[9];
        iArr[9] = iArr[10];
        iArr[10] = iArr[11];
        iArr[11] = iArr[12];
        iArr[12] = iArr[13];
        iArr[13] = iArr[14];
        iArr[14] = iArr[15];
        iArr[15] = AddM;
    }

    private void LFSRWithWorkMode() {
        int i = this.LFSR[0];
        int AddM = AddM(AddM(AddM(AddM(AddM(i, MulByPow2(i, 8)), MulByPow2(this.LFSR[4], 20)), MulByPow2(this.LFSR[10], 21)), MulByPow2(this.LFSR[13], 17)), MulByPow2(this.LFSR[15], 15));
        int[] iArr = this.LFSR;
        iArr[0] = iArr[1];
        iArr[1] = iArr[2];
        iArr[2] = iArr[3];
        iArr[3] = iArr[4];
        iArr[4] = iArr[5];
        iArr[5] = iArr[6];
        iArr[6] = iArr[7];
        iArr[7] = iArr[8];
        iArr[8] = iArr[9];
        iArr[9] = iArr[10];
        iArr[10] = iArr[11];
        iArr[11] = iArr[12];
        iArr[12] = iArr[13];
        iArr[13] = iArr[14];
        iArr[14] = iArr[15];
        iArr[15] = AddM;
    }

    private static int MAKEU31(byte b, short s, byte b2) {
        return ((b & 255) << 23) | ((s & UShort.MAX_VALUE) << 8) | (b2 & 255);
    }

    private static int MAKEU32(byte b, byte b2, byte b3, byte b4) {
        return ((b & 255) << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    private static int MulByPow2(int i, int i2) {
        return ((i >>> (31 - i2)) | (i << i2)) & Integer.MAX_VALUE;
    }

    static int ROT(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    public static void encode32be(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >> 24);
        bArr[i2 + 1] = (byte) (i >> 16);
        bArr[i2 + 2] = (byte) (i >> 8);
        bArr[i2 + 3] = (byte) i;
    }

    private void makeKeyStream() {
        encode32be(makeKeyStreamWord(), this.keyStream, 0);
    }

    private void setKeyAndIV(byte[] bArr, byte[] bArr2) {
        setKeyAndIV(this.LFSR, bArr, bArr2);
        int[] iArr = this.F;
        iArr[0] = 0;
        iArr[1] = 0;
        int i = 32;
        while (true) {
            BitReorganization();
            if (i <= 0) {
                F();
                LFSRWithWorkMode();
                return;
            } else {
                LFSRWithInitialisationMode(F() >>> 1);
                i--;
            }
        }
    }

    int F() {
        int[] iArr = this.BRC;
        int i = iArr[0];
        int[] iArr2 = this.F;
        int i2 = iArr2[0];
        int i3 = iArr2[1];
        int i4 = (i ^ i2) + i3;
        int i5 = i2 + iArr[1];
        int i6 = iArr[2] ^ i3;
        int L1 = L1((i5 << 16) | (i6 >>> 16));
        int L2 = L2((i6 << 16) | (i5 >>> 16));
        int[] iArr3 = this.F;
        byte[] bArr = S0;
        byte b = bArr[L1 >>> 24];
        byte[] bArr2 = S1;
        iArr3[0] = MAKEU32(b, bArr2[(L1 >>> 16) & 255], bArr[(L1 >>> 8) & 255], bArr2[L1 & 255]);
        this.F[1] = MAKEU32(bArr[L2 >>> 24], bArr2[(L2 >>> 16) & 255], bArr[(L2 >>> 8) & 255], bArr2[L2 & 255]);
        return i4;
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new Zuc128CoreEngine(this);
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "Zuc-128";
    }

    protected int getMaxIterations() {
        return 2047;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        byte[] bArr;
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            bArr = parametersWithIV.getIV();
            cipherParameters = parametersWithIV.getParameters();
        } else {
            bArr = null;
        }
        byte[] key = cipherParameters instanceof KeyParameter ? ((KeyParameter) cipherParameters).getKey() : null;
        this.theIndex = 0;
        this.theIterations = 0;
        setKeyAndIV(key, bArr);
        this.theResetState = (Zuc128CoreEngine) copy();
    }

    protected int makeKeyStreamWord() {
        int i = this.theIterations;
        this.theIterations = i + 1;
        if (i >= getMaxIterations()) {
            throw new IllegalStateException("Too much data processed by singleKey/IV");
        }
        BitReorganization();
        int F = F() ^ this.BRC[3];
        LFSRWithWorkMode();
        return F;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (this.theResetState == null) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }
        if (i + i2 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i3 + i2 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        for (int i4 = 0; i4 < i2; i4++) {
            bArr2[i4 + i3] = returnByte(bArr[i4 + i]);
        }
        return i2;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void reset() {
        Zuc128CoreEngine zuc128CoreEngine = this.theResetState;
        if (zuc128CoreEngine != null) {
            reset(zuc128CoreEngine);
        }
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        Zuc128CoreEngine zuc128CoreEngine = (Zuc128CoreEngine) memoable;
        int[] iArr = zuc128CoreEngine.LFSR;
        int[] iArr2 = this.LFSR;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
        int[] iArr3 = zuc128CoreEngine.F;
        int[] iArr4 = this.F;
        System.arraycopy(iArr3, 0, iArr4, 0, iArr4.length);
        int[] iArr5 = zuc128CoreEngine.BRC;
        int[] iArr6 = this.BRC;
        System.arraycopy(iArr5, 0, iArr6, 0, iArr6.length);
        byte[] bArr = zuc128CoreEngine.keyStream;
        byte[] bArr2 = this.keyStream;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this.theIndex = zuc128CoreEngine.theIndex;
        this.theIterations = zuc128CoreEngine.theIterations;
        this.theResetState = zuc128CoreEngine;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b) {
        if (this.theIndex == 0) {
            makeKeyStream();
        }
        byte[] bArr = this.keyStream;
        int i = this.theIndex;
        byte b2 = (byte) (b ^ bArr[i]);
        this.theIndex = (i + 1) % 4;
        return b2;
    }

    protected void setKeyAndIV(int[] iArr, byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length != 16) {
            throw new IllegalArgumentException("A key of 16 bytes is needed");
        }
        if (bArr2 == null || bArr2.length != 16) {
            throw new IllegalArgumentException("An IV of 16 bytes is needed");
        }
        int[] iArr2 = this.LFSR;
        byte b = bArr[0];
        short[] sArr = EK_d;
        iArr2[0] = MAKEU31(b, sArr[0], bArr2[0]);
        this.LFSR[1] = MAKEU31(bArr[1], sArr[1], bArr2[1]);
        this.LFSR[2] = MAKEU31(bArr[2], sArr[2], bArr2[2]);
        this.LFSR[3] = MAKEU31(bArr[3], sArr[3], bArr2[3]);
        this.LFSR[4] = MAKEU31(bArr[4], sArr[4], bArr2[4]);
        this.LFSR[5] = MAKEU31(bArr[5], sArr[5], bArr2[5]);
        this.LFSR[6] = MAKEU31(bArr[6], sArr[6], bArr2[6]);
        this.LFSR[7] = MAKEU31(bArr[7], sArr[7], bArr2[7]);
        this.LFSR[8] = MAKEU31(bArr[8], sArr[8], bArr2[8]);
        this.LFSR[9] = MAKEU31(bArr[9], sArr[9], bArr2[9]);
        this.LFSR[10] = MAKEU31(bArr[10], sArr[10], bArr2[10]);
        this.LFSR[11] = MAKEU31(bArr[11], sArr[11], bArr2[11]);
        this.LFSR[12] = MAKEU31(bArr[12], sArr[12], bArr2[12]);
        this.LFSR[13] = MAKEU31(bArr[13], sArr[13], bArr2[13]);
        this.LFSR[14] = MAKEU31(bArr[14], sArr[14], bArr2[14]);
        this.LFSR[15] = MAKEU31(bArr[15], sArr[15], bArr2[15]);
    }
}
