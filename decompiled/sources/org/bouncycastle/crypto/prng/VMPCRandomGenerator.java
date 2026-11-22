package org.bouncycastle.crypto.prng;

import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import com.bluetrum.fota.manager.OtaCommandGenerator;
import com.hispark.crashdump.protocol.ProtocolBytes;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.util.Pack;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: classes8.dex */
public class VMPCRandomGenerator implements RandomGenerator {
    private byte n = 0;
    private byte[] P = {-69, BuiltinOptions.GreaterOptions, BuiltinOptions.SelectV2Options, Byte.MAX_VALUE, -75, -86, -44, 13, -127, -2, -78, -126, -53, OtaCommandGenerator.CMD_OTA_INFO, -95, 8, 24, BuiltinOptions.AssignVariableOptions, BuiltinOptions.RankOptions, -24, BuiltinOptions.RangeOptions, 2, 16, -60, -34, BuiltinOptions.EqualOptions, -91, -20, Byte.MIN_VALUE, 18, -72, BuiltinOptions.Rfft2dOptions, -38, BuiltinOptions.SelectOptions, BuiltinOptions.DynamicUpdateSliceOptions, -52, -94, 9, BuiltinOptions.NotEqualOptions, 3, BuiltinOptions.ScatterNdOptions, BuiltinOptions.GreaterEqualOptions, -3, -32, -35, 5, BuiltinOptions.ZerosLikeOptions, OtaCommandGenerator.CMD_NOTIFY_STATUS, -83, -56, -31, ProtocolBytes.SOF, BuiltinOptions.ReverseSequenceOptions, -101, BuiltinOptions.SquaredDifferenceOptions, -40, BuiltinOptions.ReverseV2Options, -82, BuiltinOptions.UniqueOptions, -123, BuiltinOptions.LogicalOrOptions, 10, -28, -13, -100, BuiltinOptions.DequantizeOptions, 35, BuiltinOptions.GatherNdOptions, -55, -125, -105, BuiltinOptions.BidirectionalSequenceRNNOptions, -79, -103, BuiltinOptions.SegmentSumOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.UnsortedSegmentMaxOptions, TransmissionUnpacked.HD_VAL_MAGIC_LB, 29, -42, BuiltinOptions.UnsortedSegmentMinOptions, -67, BuiltinOptions.DepthToSpaceOptions, -80, -118, 34, BuiltinOptions.PowOptions, -8, BuiltinOptions.BroadcastToOptions, BuiltinOptions.PadV2Options, BuiltinOptions.NegOptions, -59, -45, -9, PSSSigner.TRAILER_IMPLICIT, BuiltinOptions.VarHandleOptions, -33, 4, -27, -107, BuiltinOptions.LogicalAndOptions, BuiltinOptions.CastOptions, -122, -90, 11, -113, -15, BuiltinOptions.LogSoftmaxOptions, 14, -41, 64, -77, -49, BuiltinOptions.RightShiftOptions, 6, 21, -102, BuiltinOptions.MirrorPadOptions, 28, -93, -37, BuiltinOptions.SparseToDenseOptions, OtaCommandGenerator.CMD_GET_INFO_TLV, BuiltinOptions.MatrixDiagOptions, 17, BuiltinOptions.MaximumMinimumOptions, -12, BuiltinOptions.QuantizeOptions, -48, BuiltinOptions.AbsOptions, BuiltinOptions.Conv3DOptions, 23, BuiltinOptions.HardSwishOptions, -84, -1, 7, -64, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.UnsortedSegmentSumOptions, -4, -57, -51, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.SquareOptions, BuiltinOptions.WhileOptions, -25, 58, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.ATan2Options, BuiltinOptions.SliceOptions, BuiltinOptions.ArgMaxOptions, 15, BuiltinOptions.BucketizeOptions, 1, -7, -47, -46, 25, -23, OtaCommandGenerator.CMD_GET_INFO, -71, BuiltinOptions.MatrixSetDiagOptions, -19, BuiltinOptions.FloorDivOptions, BuiltinOptions.HashtableImportOptions, -76, -61, -98, -65, BuiltinOptions.DensifyOptions, -6, 31, BuiltinOptions.TileOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.UnidirectionalSequenceLSTMOptions, -119, TransmissionUnpacked.HD_VAL_MAGIC_HB, -106, 26, BuiltinOptions.NonMaxSuppressionV4Options, -109, 61, BuiltinOptions.ShapeOptions, BuiltinOptions.LeakyReluOptions, -39, -88, -63, 27, -10, BuiltinOptions.ArgMinOptions, -117, -73, 12, 32, -50, -120, BuiltinOptions.HashtableSizeOptions, -74, BuiltinOptions.GeluOptions, -114, -115, 22, BuiltinOptions.LessOptions, -14, -121, -11, -21, BuiltinOptions.ReadVariableOptions, -29, -5, BuiltinOptions.WhereOptions, -97, -58, BuiltinOptions.FillOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.BitwiseXorOptions, -30, BuiltinOptions.HashtableOptions, BuiltinOptions.IfOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.CumsumOptions, -87, -116, -18, -124, 19, -89, 30, -99, -36, BuiltinOptions.CallOnceOptions, BuiltinOptions.FloorModOptions, -70, BuiltinOptions.LessEqualOptions, -26, -92, -85, BuiltinOptions.BitcastOptions, -108, 0, BuiltinOptions.ExpOptions, -17, -22, -66, -54, BuiltinOptions.RandomOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.AddNOptions, -104, 63, -62, 20, BuiltinOptions.SignOptions, BuiltinOptions.PackOptions, BuiltinOptions.CosOptions};
    private byte s = -66;

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void addSeedMaterial(long j) {
        addSeedMaterial(Pack.longToBigEndian(j));
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void addSeedMaterial(byte[] bArr) {
        for (byte b : bArr) {
            byte[] bArr2 = this.P;
            byte b2 = this.s;
            byte b3 = this.n;
            byte b4 = bArr2[(b2 + bArr2[b3 & 255] + b) & 255];
            this.s = b4;
            byte b5 = bArr2[b3 & 255];
            bArr2[b3 & 255] = bArr2[b4 & 255];
            bArr2[b4 & 255] = b5;
            this.n = (byte) ((b3 + 1) & 255);
        }
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void nextBytes(byte[] bArr) {
        nextBytes(bArr, 0, bArr.length);
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void nextBytes(byte[] bArr, int i, int i2) {
        synchronized (this.P) {
            int i3 = i2 + i;
            while (i != i3) {
                byte[] bArr2 = this.P;
                byte b = this.s;
                byte b2 = this.n;
                byte b3 = bArr2[(b + bArr2[b2 & 255]) & 255];
                this.s = b3;
                bArr[i] = bArr2[(bArr2[bArr2[b3 & 255] & 255] + 1) & 255];
                byte b4 = bArr2[b2 & 255];
                bArr2[b2 & 255] = bArr2[b3 & 255];
                bArr2[b3 & 255] = b4;
                this.n = (byte) ((b2 + 1) & 255);
                i++;
            }
        }
    }
}
