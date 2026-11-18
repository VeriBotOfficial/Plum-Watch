package com.beken.iot.smartsdk.core.data;

import com.beken.iot.smartsdk.core.pack.TransmissionProfile;
import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import com.bluetrum.fota.manager.OtaCommandGenerator;
import com.hispark.crashdump.protocol.ProtocolBytes;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes15.dex */
public class BasicHead {
    public static final byte CRC8_INIT_VALUE = -1;
    public static final byte[] crc8Table = {0, -9, -71, BuiltinOptions.AbsOptions, BuiltinOptions.CastOptions, -46, -100, BuiltinOptions.HashtableOptions, BuiltinOptions.ResizeNearestNeighborOptions, -67, -13, 4, BuiltinOptions.VarHandleOptions, -104, -42, BuiltinOptions.ExpOptions, -108, BuiltinOptions.DensifyOptions, BuiltinOptions.GreaterEqualOptions, -38, -79, BuiltinOptions.BidirectionalSequenceRNNOptions, 8, -1, -34, BuiltinOptions.LessOptions, BuiltinOptions.CallOnceOptions, OtaCommandGenerator.CMD_NOTIFY_STATUS, -5, 12, BuiltinOptions.SquareOptions, -75, 127, -120, -58, BuiltinOptions.TransposeConvOptions, BuiltinOptions.MatrixSetDiagOptions, -83, -29, 20, BuiltinOptions.EqualOptions, -62, -116, BuiltinOptions.SignOptions, 16, -25, -87, BuiltinOptions.DepthToSpaceOptions, -21, 28, BuiltinOptions.AddNOptions, -91, -50, BuiltinOptions.ArgMinOptions, BuiltinOptions.UnsortedSegmentMaxOptions, -128, -95, BuiltinOptions.RankOptions, 24, -17, -124, BuiltinOptions.BucketizeOptions, 61, -54, -2, 9, BuiltinOptions.UnidirectionalSequenceLSTMOptions, -80, -37, BuiltinOptions.GreaterOptions, BuiltinOptions.SelectV2Options, -107, -76, BuiltinOptions.ZerosLikeOptions, 13, -6, OtaCommandGenerator.CMD_GET_INFO, BuiltinOptions.CumsumOptions, BuiltinOptions.ArgMaxOptions, -33, BuiltinOptions.Conv3DOptions, -99, -45, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.SplitVOptions, -72, -10, 1, 32, -41, -103, BuiltinOptions.HashtableSizeOptions, 5, -14, PSSSigner.TRAILER_IMPLICIT, BuiltinOptions.LeakyReluOptions, -127, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.PowOptions, -49, -92, BuiltinOptions.GatherNdOptions, 29, -22, -53, BuiltinOptions.LogicalOrOptions, BuiltinOptions.RandomOptions, -123, -18, 25, BuiltinOptions.ReverseSequenceOptions, OtaCommandGenerator.CMD_OTA_INFO, 21, -30, -84, BuiltinOptions.HardSwishOptions, BuiltinOptions.SliceOptions, -57, -119, BuiltinOptions.RightShiftOptions, BuiltinOptions.NonMaxSuppressionV4Options, -88, -26, 17, BuiltinOptions.ATan2Options, -115, -61, BuiltinOptions.ExpandDimsOptions, -85, BuiltinOptions.IfOptions, 18, -27, -114, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.ShapeOptions, -64, -31, 22, BuiltinOptions.MatrixDiagOptions, ProtocolBytes.SOF, -60, BuiltinOptions.TileOptions, BuiltinOptions.BitwiseXorOptions, -118, 63, -56, -122, BuiltinOptions.AssignVariableOptions, 26, -19, -93, BuiltinOptions.CosOptions, BuiltinOptions.DynamicUpdateSliceOptions, -126, -52, BuiltinOptions.PackOptions, BuiltinOptions.UniqueOptions, -89, -23, 30, -44, 35, BuiltinOptions.HashtableImportOptions, -102, -15, 6, BuiltinOptions.FloorModOptions, -65, -98, BuiltinOptions.Rfft2dOptions, BuiltinOptions.MaximumMinimumOptions, -48, -69, BuiltinOptions.SquaredDifferenceOptions, 2, -11, 64, -73, -7, 14, BuiltinOptions.BatchMatMulOptions, OtaCommandGenerator.CMD_GET_INFO_TLV, -36, BuiltinOptions.PadV2Options, 10, -3, -77, BuiltinOptions.FillOptions, BuiltinOptions.SelectOptions, -40, -106, BuiltinOptions.ScatterNdOptions, BuiltinOptions.WhereOptions, -94, -20, 27, BuiltinOptions.ReadVariableOptions, -121, -55, BuiltinOptions.LogicalAndOptions, 31, -24, -90, BuiltinOptions.ReverseV2Options, 58, -51, -125, BuiltinOptions.GeluOptions, -63, BuiltinOptions.NotEqualOptions, BuiltinOptions.UnsortedSegmentMinOptions, -113, -28, 19, BuiltinOptions.WhileOptions, -86, -117, BuiltinOptions.BitcastOptions, BuiltinOptions.SparseToDenseOptions, -59, -82, BuiltinOptions.QuantizeOptions, 23, -32, BuiltinOptions.NegOptions, -35, -109, BuiltinOptions.SegmentSumOptions, 15, -8, -74, BuiltinOptions.FloorDivOptions, BuiltinOptions.NonMaxSuppressionV5Options, -105, -39, BuiltinOptions.LessEqualOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, -78, -4, 11, -66, BuiltinOptions.RangeOptions, 7, TransmissionUnpacked.HD_VAL_MAGIC_HB, -101, BuiltinOptions.HashtableFindOptions, 34, TransmissionUnpacked.HD_VAL_MAGIC_LB, -12, 3, BuiltinOptions.MirrorPadOptions, -70, -47, BuiltinOptions.DequantizeOptions, BuiltinOptions.BroadcastToOptions, -97};
    public int flags;
    public int sequence;
    public int timestamp;
    public int magic = TransmissionProfile.HD_DEF_MAGIC_CODE;
    public int length = 0;
    public long createTime = 0;
    public byte crc = 0;
    public byte[] reserved = {0, 0, 0};
    protected byte[] head = new byte[16];

    public static byte hndCrc8(byte[] bArr, int r4, byte b) {
        for (int r0 = 0; r0 < r4; r0++) {
            b = crc8Table[(b ^ bArr[r0]) & 255];
        }
        return b;
    }

    public void buildMagicCode() {
        byte[] bArr = this.head;
        int r1 = this.magic;
        bArr[0] = (byte) (r1 & 255);
        bArr[1] = (byte) ((r1 >> 8) & 255);
    }

    public void buildFlags() {
        byte[] bArr = this.head;
        int r1 = this.flags;
        bArr[2] = (byte) (r1 & 255);
        bArr[3] = (byte) ((r1 >> 8) & 255);
    }

    public void buildTimestamp() {
        byte[] bArr = this.head;
        int r1 = this.timestamp;
        bArr[4] = (byte) (r1 & 255);
        bArr[5] = (byte) ((r1 >> 8) & 255);
        bArr[6] = (byte) ((r1 >> 8) & 255);
        bArr[7] = (byte) ((r1 >> 8) & 255);
    }

    public void buildSequence() {
        byte[] bArr = this.head;
        int r1 = this.sequence;
        bArr[8] = (byte) (r1 & 255);
        bArr[9] = (byte) ((r1 >> 8) & 255);
    }

    public void buildLength() {
        byte[] bArr = this.head;
        int r1 = this.length;
        bArr[10] = (byte) (r1 & 255);
        bArr[11] = (byte) ((r1 >> 8) & 255);
    }

    public void buildCrc(byte b) {
        this.head[12] = b;
    }

    public BasicHead(int r4, int r5, int r6) {
        this.flags = 1;
        this.timestamp = 0;
        this.sequence = 0;
        buildMagicCode();
        this.flags = r4;
        this.timestamp = r5;
        this.sequence = r6;
        buildFlags();
        buildTimestamp();
        buildSequence();
    }

    public int headLength() {
        return this.head.length;
    }

    public byte[] pack(byte[] bArr) {
        buildCrc((byte) 0);
        if (bArr == null || bArr.length == 0) {
            this.length = 0;
        } else {
            this.length = bArr.length;
            if ((this.flags & 1) == 1) {
                buildCrc(hndCrc8(bArr, bArr.length, (byte) -1));
            }
        }
        buildLength();
        return this.head;
    }
}
