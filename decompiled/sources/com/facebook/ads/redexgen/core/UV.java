package com.facebook.ads.redexgen.core;

import com.anythink.core.common.m.a;
import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import com.bluetrum.fota.manager.OtaCommandGenerator;
import com.hispark.crashdump.protocol.ProtocolBytes;
import io.agora.rtc2.Constants;
import java.util.Arrays;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.opencv.videoio.Videoio;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public enum UV {
    A0S(A01(Constants.AUDIO_MIXING_STATE_PLAYING, 4, 89)),
    A06(A01(431, 15, 41)),
    A08(A01(457, 5, 49)),
    A0P(A01(680, 14, 3)),
    A0D(A01(Videoio.CAP_PROP_XI_CC_MATRIX_23, 10, 95)),
    A0N(A01(635, 25, 123)),
    A0O(A01(660, 20, 91)),
    A0F(A01(512, 37, 117)),
    A0E(A01(500, 12, 55)),
    A0Q(A01(694, 5, 72)),
    A0J(A01(576, 16, 115)),
    A0K(A01(592, 9, 124)),
    A0G(A01(Videoio.CAP_PROP_XI_ACQ_BUFFER_SIZE_UNIT, 11, 25)),
    A0W(A01(764, 5, 98)),
    A0V(A01(744, 11, 107)),
    A04(A01(790, 5, 62)),
    A0M(A01(617, 18, 99)),
    A05(A01(401, 12, 68)),
    A07(A01(446, 11, 51)),
    A0T(A01(729, 15, 39)),
    A0U(A01(Constants.AUDIO_MIXING_STATE_FAILED, 15, 48)),
    A0R(A01(a.m, 11, 46)),
    A09(A01(413, 18, 57)),
    A0X(A01(769, 21, 8)),
    A0C(A01(755, 9, 120)),
    A0L(A01(601, 16, 41)),
    A0B(A01(Videoio.CAP_PROP_XI_TARGET_TEMP, 23, 39)),
    A0I(A01(570, 6, 22)),
    A0A(A01(Videoio.CAP_PROP_XI_IMAGE_DATA_BIT_DEPTH, 5, 40)),
    A0H(A01(Videoio.CAP_PROP_XI_HDR_KNEEPOINT_COUNT, 10, 109));

    public static byte[] A01;
    public static String[] A02 = {"4vfpnedVtrPjMpyfZxR38kPmdhuY8", "BBj2A5KIY3fbXxZGsv419mNXSY2NstKD", "cdxeXD5RiaMI9e6AO1Q2OUWCJZ0p5AOK", "fVp61xrtGVfNJN2h16kMoqgv4Y2mYwir", "rOIFowwmIZSh4FQ2v3HALfnRojh", "deo3piwOBIkL6NX7TCyeXAL5pXVTlHho", "zZ2K2ZPCRMNEr6MS88VYjWdhzDoMY1p3", "ifuTDDYRX8RiR1LaeJllAM8iDsCBUyOz"};
    public String A00;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 16);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-114, OtaCommandGenerator.CMD_GET_INFO, -84, -97, OtaCommandGenerator.CMD_GET_INFO_TLV, -99, -100, -97, -95, -106, -101, -108, -62, -59, -32, -44, -58, -51, -58, -60, TransmissionUnpacked.HD_VAL_MAGIC_LB, -54, -48, -49, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.GeluOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.DensifyOptions, -63, -54, -57, -63, -55, -35, -59, -45, -65, -48, -62, -52, TransmissionUnpacked.HD_VAL_MAGIC_LB, -40, -36, -50, -60, -51, -48, -44, -58, -32, -61, -45, -48, -40, -44, -58, -32, -41, -54, -58, -40, -51, -50, -53, -34, -48, -56, -35, -46, -59, -47, -51, -57, -29, -41, -56, -49, -29, -48, -59, -35, -55, -42, -29, -55, -38, -55, -46, -40, -52, -37, -44, -44, -53, -46, -27, -46, TransmissionUnpacked.HD_VAL_MAGIC_LB, -51, -51, -49, -44, -51, BuiltinOptions.Conv3DOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.GeluOptions, BuiltinOptions.GeluOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.VarHandleOptions, -70, -65, -57, -78, -67, -70, -75, -78, -59, -70, -64, -65, -93, -100, -86, -86, -74, -86, -85, -87, OtaCommandGenerator.CMD_OTA_INFO, -102, -85, -74, -86, -100, -102, -90, -91, -101, -74, -102, -97, -104, -91, -91, -100, -93, -74, OtaCommandGenerator.CMD_OTA_INFO, -92, -89, -87, -100, -86, -86, OtaCommandGenerator.CMD_OTA_INFO, -90, -91, -113, -126, -107, -118, -105, -122, OtaCommandGenerator.CMD_OTA_INFO, -105, -118, -122, -104, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.SignOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.WhileOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.ReadVariableOptions, -119, BuiltinOptions.RightShiftOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.RightShiftOptions, -119, BuiltinOptions.HashtableImportOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.DynamicUpdateSliceOptions, -126, -125, BuiltinOptions.UnsortedSegmentMinOptions, -127, OtaCommandGenerator.CMD_GET_INFO_TLV, Byte.MAX_VALUE, BuiltinOptions.BitcastOptions, -127, BuiltinOptions.RightShiftOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.Rfft2dOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.BitcastOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.AssignVariableOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.ReadVariableOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.UnsortedSegmentMinOptions, Byte.MIN_VALUE, BuiltinOptions.Conv3DOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.GeluOptions, BuiltinOptions.GeluOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.SignOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.HashtableFindOptions, -121, BuiltinOptions.HashtableOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.GeluOptions, -121, BuiltinOptions.AssignVariableOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.ATan2Options, BuiltinOptions.HashtableImportOptions, BuiltinOptions.SignOptions, BuiltinOptions.SignOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.UnsortedSegmentProdOptions, -61, -75, -77, -65, -66, -76, -49, -77, -72, -79, -66, -66, -75, PSSSigner.TRAILER_IMPLICIT, -49, -58, -71, -76, -75, -65, BuiltinOptions.RightShiftOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.ATan2Options, -126, -118, BuiltinOptions.HashtableFindOptions, BuiltinOptions.VarHandleOptions, -118, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.VarHandleOptions, -125, -124, Byte.MAX_VALUE, -126, BuiltinOptions.DynamicUpdateSliceOptions, -46, -42, -56, -49, -60, -34, -45, -50, -34, -62, -53, -56, -62, -54, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.HashtableImportOptions, BuiltinOptions.HashtableSizeOptions, -123, -120, Byte.MIN_VALUE, OtaCommandGenerator.CMD_NOTIFY_STATUS, -124, -123, BuiltinOptions.UnsortedSegmentProdOptions, -127, -97, -94, -102, -86, -98, -97, OtaCommandGenerator.CMD_NOTIFY_STATUS, -101, -86, -114, -116, -103, -114, OtaCommandGenerator.CMD_NOTIFY_STATUS, -105, -60, -62, -76, -63, -50, -63, -76, -61, -60, -63, -67, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.RandomOptions, -124, BuiltinOptions.HashtableSizeOptions, -127, BuiltinOptions.ReadVariableOptions, BuiltinOptions.DynamicUpdateSliceOptions, -116, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.SignOptions, BuiltinOptions.AssignVariableOptions, -116, -123, -116, BuiltinOptions.ATan2Options, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.SignOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.ATan2Options, BuiltinOptions.UnsortedSegmentProdOptions, -121, BuiltinOptions.RandomOptions, BuiltinOptions.AssignVariableOptions, -75, -72, -77, -57, -71, -64, -71, -73, -56, -67, -61, -62, -85, -69, -72, -64, PSSSigner.TRAILER_IMPLICIT, -82, -88, -65, -78, -82, -64, -88, -84, -75, -72, PSSSigner.TRAILER_IMPLICIT, -82, -83, -101, -85, -88, -80, -84, -98, -85, -104, -84, -98, -84, -84, -94, -88, -89, -90, ProtocolBytes.SOF, -84, -90, -82, -94, -86, -72, -92, -75, -89, -92, -83, -80, -76, -90, -100, -99, -102, -83, -97, -101, -80, -91, -104, -92, OtaCommandGenerator.CMD_OTA_INFO, -102, -106, -86, -101, -94, -106, -93, -104, -80, -100, -87, -106, -100, -83, -100, -91, -85, -40, -36, -33, -31, -44, -30, -30, -40, -34, -35, -80, -75, -67, -88, -77, -80, -85, -88, -69, -80, -74, -75, -15, -22, -8, -8, -28, -8, -7, -9, -18, -24, -7, -28, -8, -22, -24, -12, -13, -23, -28, -24, -19, -26, -13, -13, -22, -15, -28, -18, -14, -11, -9, -22, -8, -8, -18, -12, -13, -105, -118, -99, OtaCommandGenerator.CMD_GET_INFO_TLV, -97, -114, -120, -97, OtaCommandGenerator.CMD_GET_INFO_TLV, -114, OtaCommandGenerator.CMD_OTA_INFO, -21, -34, -13, -26, -28, -34, -15, -26, -20, -21, -107, -119, -101, OtaCommandGenerator.CMD_GET_INFO_TLV, -101, -103, -14, -23, -23, -30, -9, -28, -11, -22, -24, -9, -30, -26, -17, -20, -26, -18, -5, -4, -15, -6, -21, -8, -11, -6, -9, -87, -91, -102, -78, -102, -101, -91, -98, -104, -90, -98, -83, -85, -94, -100, -84, -29, -27, -40, -23, -36, -40, -22, -46, -36, -32, -29, -27, -40, -26, -26, -36, -30, -31, -2, TransmissionUnpacked.HD_VAL_MAGIC_HB, -18, -6, -7, -17, -22, -18, -13, -20, -7, -7, TransmissionUnpacked.HD_VAL_MAGIC_HB, -9, -22, -12, -8, -5, -3, TransmissionUnpacked.HD_VAL_MAGIC_HB, -2, -2, -12, -6, -7, -34, -48, -50, -38, -39, -49, -54, -50, -45, -52, -39, -39, -48, -41, -54, -31, -44, -49, -48, -38, -122, BuiltinOptions.SignOptions, -126, -118, BuiltinOptions.RandomOptions, BuiltinOptions.GeluOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.RandomOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.GeluOptions, Byte.MAX_VALUE, Byte.MAX_VALUE, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.UnsortedSegmentMaxOptions, -53, -52, -57, -54, -67, -79, -75, -89, -82, -93, -99, -95, -86, -89, -95, -87, -35, -50, -36, -35, -76, -73, ProtocolBytes.SOF, -97, -77, -76, -91, -80, -97, -93, -95, -82, -93, -91, -84, -85, -82, -90, -106, -86, -85, -100, -89, -106, -101, OtaCommandGenerator.CMD_OTA_INFO, -104, -93, -90, -98, TransmissionUnpacked.HD_VAL_MAGIC_HB, -18, -32, -19, -38, -19, -32, -17, TransmissionUnpacked.HD_VAL_MAGIC_HB, -19, -23, -3, 0, -25, -18, -3, -10, -10, -19, -12, -24, -37, -42, -41, -31, -113, BuiltinOptions.UnsortedSegmentSumOptions, -116, BuiltinOptions.SignOptions, Byte.MIN_VALUE, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.UnsortedSegmentSumOptions, -122, BuiltinOptions.BitcastOptions, BuiltinOptions.UnsortedSegmentMaxOptions, OtaCommandGenerator.CMD_NOTIFY_STATUS, BuiltinOptions.UnsortedSegmentMaxOptions, -123, -127, -122, -127, -123, -127, OtaCommandGenerator.CMD_GET_INFO_TLV, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.BitcastOptions, -58, -83, -67, -61, -62};
    }

    static {
        A02();
    }

    UV(String str) {
        this.A00 = str;
    }

    public static UV A00(String str) {
        for (UV uv : values()) {
            boolean equalsIgnoreCase = uv.A00.equalsIgnoreCase(str);
            if (A02[3].charAt(10) == 'X') {
                throw new RuntimeException();
            }
            A02[5] = "egbXgGoH9YjwozG9OeqzlAo47BIpQrUt";
            if (equalsIgnoreCase) {
                return uv;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }
}
