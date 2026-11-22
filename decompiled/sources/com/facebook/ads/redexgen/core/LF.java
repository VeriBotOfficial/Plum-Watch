package com.facebook.ads.redexgen.core;

import com.bluetrum.fota.manager.OtaCommandGenerator;
import com.hispark.crashdump.protocol.ProtocolBytes;
import java.util.Arrays;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public enum LF {
    A0L(0),
    A0I(1),
    A07(2),
    A0G(3),
    A0H(4),
    A06(5),
    A0F(6),
    A0A(7),
    A08(8),
    A0C(9),
    A0D(10),
    A0B(11),
    A0K(12),
    A03(13),
    A0E(14),
    A09(15),
    A04(16),
    A05(17),
    A0J(18),
    A0M(19);

    public static byte[] A01;
    public final int A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 23);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{BuiltinOptions.Conv3DOptions, BuiltinOptions.HashtableImportOptions, -120, BuiltinOptions.RandomOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.RandomOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.RandomOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.BitwiseXorOptions, -120, Byte.MAX_VALUE, BuiltinOptions.RandomOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.RandomOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.HashtableSizeOptions, -120, BuiltinOptions.Conv3DOptions, BuiltinOptions.SignOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.WhileOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.CallOnceOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.IfOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.IfOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.CallOnceOptions, -44, -41, -14, -36, -26, -14, -31, -30, -25, -14, -36, -31, -14, -44, -42, -25, -36, -23, -36, -25, -20, -85, -82, -55, -77, -67, -55, -72, -71, -66, -55, -64, -77, -67, -77, -84, -74, ProtocolBytes.SOF, -47, -44, -17, -39, -29, -17, -34, -27, -36, -36, -65, -62, -35, -57, -47, -35, -51, -64, -47, -46, -48, -45, -63, -46, -61, -62, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.Conv3DOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.IfOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.IfOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.Rfft2dOptions, -124, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.UnsortedSegmentMinOptions, -124, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.UnsortedSegmentSumOptions, PSSSigner.TRAILER_IMPLICIT, -65, -38, -54, -63, -63, -50, -66, -51, -64, -64, -55, -38, -67, -54, -49, -49, -54, -56, -80, -77, -50, -66, -75, -75, -62, -78, -63, -76, -76, -67, -50, -73, -66, -63, -72, -55, -66, -67, -61, -80, -69, -69, -56, -78, -75, -48, -64, -73, -73, -60, -76, -61, -74, -74, -65, -48, -59, -64, -63, -88, -85, -58, -67, -80, -84, -66, -88, -87, -80, -77, -80, -69, -64, -58, -69, -80, -86, -78, -58, -85, PSSSigner.TRAILER_IMPLICIT, -71, -88, -69, -80, -74, -75, BuiltinOptions.VarHandleOptions, BuiltinOptions.GeluOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.RandomOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.Conv3DOptions, -123, BuiltinOptions.Conv3DOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.GeluOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.GeluOptions, BuiltinOptions.UnsortedSegmentSumOptions, -53, -48, -40, -61, -50, -53, -58, -31, -46, -61, -44, -57, -48, -42, -102, -97, -89, OtaCommandGenerator.CMD_GET_INFO_TLV, -99, -102, -107, -80, -88, -102, -97, -107, OtaCommandGenerator.CMD_OTA_INFO, -88, BuiltinOptions.CumsumOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.GeluOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.Rfft2dOptions, BuiltinOptions.SelectV2Options, -116, BuiltinOptions.BitwiseXorOptions, -114, -127, -118, OtaCommandGenerator.CMD_NOTIFY_STATUS, -101, -123, -113, -101, -118, OtaCommandGenerator.CMD_GET_INFO, -120, -120, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.RandomOptions, -125, BuiltinOptions.RandomOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.UnsortedSegmentMinOptions, -125, BuiltinOptions.HashtableImportOptions, BuiltinOptions.RandomOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.ATan2Options, BuiltinOptions.Rfft2dOptions, -48, -55, -58, -55, -54, -46, -55, -45, -58, -62, -44, -36, -53, -52, -47, -36, -48, -59, -52, -44, -53};
    }

    static {
        A01();
    }

    LF(int i) {
        this.A00 = i;
    }

    public final int A03() {
        return this.A00;
    }
}
