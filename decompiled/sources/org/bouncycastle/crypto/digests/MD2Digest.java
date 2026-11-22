package org.bouncycastle.crypto.digests;

import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import com.bluetrum.fota.manager.OtaCommandGenerator;
import com.hispark.crashdump.protocol.ProtocolBytes;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.util.Memoable;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: classes8.dex */
public class MD2Digest implements ExtendedDigest, Memoable {
    private static final int DIGEST_LENGTH = 16;
    private static final byte[] S = {BuiltinOptions.LessOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.ZerosLikeOptions, -55, -94, -40, BuiltinOptions.BitcastOptions, 1, 61, BuiltinOptions.NotEqualOptions, BuiltinOptions.CosOptions, -95, -20, TransmissionUnpacked.HD_VAL_MAGIC_HB, 6, 19, BuiltinOptions.SelectV2Options, -89, 5, -13, -64, -57, BuiltinOptions.BucketizeOptions, -116, -104, -109, BuiltinOptions.PadV2Options, -39, PSSSigner.TRAILER_IMPLICIT, BuiltinOptions.SquaredDifferenceOptions, -126, -54, 30, -101, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.LogicalOrOptions, -3, -44, -32, 22, BuiltinOptions.CallOnceOptions, BuiltinOptions.SquareOptions, BuiltinOptions.VarHandleOptions, 24, -118, 23, -27, 18, -66, BuiltinOptions.AbsOptions, -60, -42, -38, -98, -34, BuiltinOptions.RangeOptions, OtaCommandGenerator.CMD_OTA_INFO, -5, -11, -114, -69, BuiltinOptions.SelectOptions, -18, BuiltinOptions.ATan2Options, -87, BuiltinOptions.BroadcastToOptions, BuiltinOptions.UnsortedSegmentSumOptions, OtaCommandGenerator.CMD_GET_INFO, 21, -78, 7, 63, -108, -62, 16, -119, 11, 34, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.ExpOptions, Byte.MIN_VALUE, Byte.MAX_VALUE, BuiltinOptions.WhileOptions, -102, BuiltinOptions.MatrixSetDiagOptions, OtaCommandGenerator.CMD_NOTIFY_STATUS, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.EqualOptions, BuiltinOptions.LogicalAndOptions, -52, -25, -65, -9, -105, 3, -1, 25, BuiltinOptions.SliceOptions, -77, BuiltinOptions.FloorModOptions, -91, -75, -47, -41, BuiltinOptions.DepthToSpaceOptions, OtaCommandGenerator.CMD_GET_INFO_TLV, BuiltinOptions.NegOptions, -84, BuiltinOptions.RankOptions, -86, -58, BuiltinOptions.SplitVOptions, -72, BuiltinOptions.PowOptions, -46, -106, -92, BuiltinOptions.BitwiseXorOptions, -74, BuiltinOptions.UnsortedSegmentProdOptions, -4, BuiltinOptions.HashtableOptions, -30, -100, BuiltinOptions.GeluOptions, 4, -15, BuiltinOptions.BidirectionalSequenceLSTMOptions, -99, BuiltinOptions.ReadVariableOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.AssignVariableOptions, -121, 32, -122, BuiltinOptions.HardSwishOptions, -49, BuiltinOptions.BatchMatMulOptions, -26, BuiltinOptions.GreaterEqualOptions, -88, 2, 27, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.CastOptions, -83, -82, -80, -71, -10, 28, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.ExpandDimsOptions, 64, BuiltinOptions.RightShiftOptions, 15, BuiltinOptions.WhereOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, -93, 35, -35, BuiltinOptions.ReverseV2Options, ProtocolBytes.SOF, 58, -61, BuiltinOptions.IfOptions, -7, -50, -70, -59, -22, BuiltinOptions.DequantizeOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.GatherNdOptions, 13, BuiltinOptions.HashtableSizeOptions, -123, BuiltinOptions.ArgMaxOptions, -124, 9, -45, -33, -51, -12, BuiltinOptions.FloorDivOptions, -127, BuiltinOptions.MirrorPadOptions, BuiltinOptions.AddNOptions, BuiltinOptions.Conv3DOptions, -36, BuiltinOptions.ShapeOptions, -56, BuiltinOptions.HashtableFindOptions, -63, -85, -6, BuiltinOptions.LogSoftmaxOptions, -31, BuiltinOptions.SignOptions, 8, 12, -67, -79, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.UnsortedSegmentMinOptions, -120, -107, -117, -29, BuiltinOptions.DensifyOptions, -24, BuiltinOptions.HashtableImportOptions, -23, -53, TransmissionUnpacked.HD_VAL_MAGIC_LB, -2, BuiltinOptions.PackOptions, 0, 29, BuiltinOptions.ArgMinOptions, -14, -17, -73, 14, BuiltinOptions.CumsumOptions, BuiltinOptions.MatrixDiagOptions, -48, -28, -90, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.RandomOptions, -8, -21, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.LeakyReluOptions, 10, BuiltinOptions.TransposeConvOptions, BuiltinOptions.FillOptions, BuiltinOptions.UniqueOptions, -76, -113, -19, 31, 26, -37, -103, -115, BuiltinOptions.TileOptions, -97, 17, -125, 20};
    private byte[] C;
    private int COff;
    private byte[] M;
    private byte[] X;
    private int mOff;
    private int xOff;

    public MD2Digest() {
        this.X = new byte[48];
        this.M = new byte[16];
        this.C = new byte[16];
        reset();
    }

    public MD2Digest(MD2Digest mD2Digest) {
        this.X = new byte[48];
        this.M = new byte[16];
        this.C = new byte[16];
        copyIn(mD2Digest);
    }

    private void copyIn(MD2Digest mD2Digest) {
        byte[] bArr = mD2Digest.X;
        System.arraycopy(bArr, 0, this.X, 0, bArr.length);
        this.xOff = mD2Digest.xOff;
        byte[] bArr2 = mD2Digest.M;
        System.arraycopy(bArr2, 0, this.M, 0, bArr2.length);
        this.mOff = mD2Digest.mOff;
        byte[] bArr3 = mD2Digest.C;
        System.arraycopy(bArr3, 0, this.C, 0, bArr3.length);
        this.COff = mD2Digest.COff;
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new MD2Digest(this);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        int length = this.M.length;
        int i2 = this.mOff;
        byte b = (byte) (length - i2);
        while (true) {
            byte[] bArr2 = this.M;
            if (i2 >= bArr2.length) {
                processCheckSum(bArr2);
                processBlock(this.M);
                processBlock(this.C);
                System.arraycopy(this.X, this.xOff, bArr, i, 16);
                reset();
                return 16;
            }
            bArr2[i2] = b;
            i2++;
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "MD2";
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 16;
    }

    protected void processBlock(byte[] bArr) {
        for (int i = 0; i < 16; i++) {
            byte[] bArr2 = this.X;
            bArr2[i + 16] = bArr[i];
            bArr2[i + 32] = (byte) (bArr[i] ^ bArr2[i]);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 18; i3++) {
            for (int i4 = 0; i4 < 48; i4++) {
                byte[] bArr3 = this.X;
                byte b = (byte) (S[i2] ^ bArr3[i4]);
                bArr3[i4] = b;
                i2 = b & 255;
            }
            i2 = (i2 + i3) % 256;
        }
    }

    protected void processCheckSum(byte[] bArr) {
        byte b = this.C[15];
        for (int i = 0; i < 16; i++) {
            byte[] bArr2 = this.C;
            b = (byte) (S[(b ^ bArr[i]) & 255] ^ bArr2[i]);
            bArr2[i] = b;
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.xOff = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.X;
            if (i == bArr.length) {
                break;
            }
            bArr[i] = 0;
            i++;
        }
        this.mOff = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr2 = this.M;
            if (i2 == bArr2.length) {
                break;
            }
            bArr2[i2] = 0;
            i2++;
        }
        this.COff = 0;
        int i3 = 0;
        while (true) {
            byte[] bArr3 = this.C;
            if (i3 == bArr3.length) {
                return;
            }
            bArr3[i3] = 0;
            i3++;
        }
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        copyIn((MD2Digest) memoable);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b) {
        byte[] bArr = this.M;
        int i = this.mOff;
        int i2 = i + 1;
        this.mOff = i2;
        bArr[i] = b;
        if (i2 == 16) {
            processCheckSum(bArr);
            processBlock(this.M);
            this.mOff = 0;
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i, int i2) {
        while (this.mOff != 0 && i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
        while (i2 > 16) {
            System.arraycopy(bArr, i, this.M, 0, 16);
            processCheckSum(this.M);
            processBlock(this.M);
            i2 -= 16;
            i += 16;
        }
        while (i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
    }
}
