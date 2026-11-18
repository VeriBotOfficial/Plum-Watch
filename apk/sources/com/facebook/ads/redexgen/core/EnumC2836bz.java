package com.facebook.ads.redexgen.core;

import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import com.bluetrum.fota.manager.OtaCommandGenerator;
import com.hispark.crashdump.protocol.ProtocolBytes;
import com.wakeup.common.DeviceFeatures;
import com.wakeup.commponent.module.sport.SportTypeConstant;
import java.util.Arrays;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.opencv.videoio.Videoio;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class EnumC2836bz {
    public static byte[] A01;
    public static String[] A02 = {"7eCrAZGCjapRaLUbK9QRGJs0olrSOuKs", "ySZlw7xE2mJZGUobjeP0sD0O3cTwGa8X", "XGkq56ugg4rIrrrN3BI0SeRXJOu8cnXg", "EhbVD2npYjMN4Lpqgy2TDazDwa0P1ZFY", "GxzPigdu3bGRa23YdvFpU3mIsN0rCQhK", "nJ0CacvfsZFNuLFGVLMdvF7ct8TNyFNR", "5gEoeYtHKqdKxvGOrBFQEkCXLQc4JGvi", "KvAzUjsGuu6UHJoTOmt3i913MHVvWe2E"};
    public static final /* synthetic */ EnumC2836bz[] A03;
    public static final EnumC2836bz A04;
    public static final EnumC2836bz A05;
    public static final EnumC2836bz A06;
    public static final EnumC2836bz A07;
    public static final EnumC2836bz A08;
    public static final EnumC2836bz A09;
    public static final EnumC2836bz A0A;
    public static final EnumC2836bz A0B;
    public static final EnumC2836bz A0C;
    public static final EnumC2836bz A0D;
    public static final EnumC2836bz A0E;
    public static final EnumC2836bz A0F;
    public static final EnumC2836bz A0G;
    public static final EnumC2836bz A0H;
    public static final EnumC2836bz A0I;
    public static final EnumC2836bz A0J;
    public static final EnumC2836bz A0K;
    public static final EnumC2836bz A0L;
    public static final EnumC2836bz A0M;
    public static final EnumC2836bz A0N;
    public static final EnumC2836bz A0O;
    public static final EnumC2836bz A0P;
    public static final EnumC2836bz A0Q;
    public final String A00;

    public static String A01(int r2, int r3, int r4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, r2, r2 + r3);
        for (int r1 = 0; r1 < bArrCopyOfRange.length; r1++) {
            bArrCopyOfRange[r1] = (byte) ((bArrCopyOfRange[r1] - r4) - 4);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-78, -69, -66, -62, -76, -50, -79, -63, -66, -58, -62, -76, -63, BuiltinOptions.RightShiftOptions, 127, BuiltinOptions.BitcastOptions, -113, -127, -89, -84, -74, -92, -91, ProtocolBytes.SOF, -88, -62, -91, -92, -90, -82, -62, -91, -72, -73, -73, -78, -79, -77, PSSSigner.TRAILER_IMPLICIT, ProtocolBytes.SOF, -80, -70, -77, -51, -80, ProtocolBytes.SOF, -79, -71, -51, -80, -61, -62, -62, -67, PSSSigner.TRAILER_IMPLICIT, OtaCommandGenerator.CMD_NOTIFY_STATUS, -99, -99, -102, -99, -121, -106, -115, -115, -108, -124, -109, -122, -122, -113, -99, -84, -91, -91, -100, -93, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.SignOptions, BuiltinOptions.GeluOptions, -114, BuiltinOptions.RandomOptions, -125, BuiltinOptions.ReadVariableOptions, -106, -113, -100, OtaCommandGenerator.CMD_GET_INFO_TLV, -102, -109, -83, -108, OtaCommandGenerator.CMD_NOTIFY_STATUS, OtaCommandGenerator.CMD_OTA_INFO, -92, -72, -71, -76, -75, -49, -58, -71, -76, -75, -65, -79, -75, -72, -70, -83, -69, -69, -79, -73, -74, -56, -67, -47, -54, -65, -60, -37, -67, -64, -37, -50, -63, -52, -53, -50, -48, -59, -54, -61, -126, -123, BuiltinOptions.BitwiseXorOptions, -79, -71, -72, -87, -61, -70, -83, -88, -87, -77, -105, -114, OtaCommandGenerator.CMD_OTA_INFO, -88, -113, -98, -105, -105, -114, -107, -58, -57, PSSSigner.TRAILER_IMPLICIT, -59, -42, -61, -64, -59, -62, BuiltinOptions.HardSwishOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.CosOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.MatrixSetDiagOptions, -47, -51, -62, -38, -32, -41, -54, -59, -58, -48, -50, -63, -67, -64, -37, -49, -48, -50, -59, -54, -61, PSSSigner.TRAILER_IMPLICIT, ProtocolBytes.SOF, -63, -85, PSSSigner.TRAILER_IMPLICIT, -82, -55, -83, -71, -73, -70, -74, ProtocolBytes.SOF, -66, ProtocolBytes.SOF, -78, -86, -88, ProtocolBytes.SOF, -66, -75, -88, -93, -92, -82, -109, -116, -119, -116, -115, -107, -116, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.RandomOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.UnsortedSegmentSumOptions, -127, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.BitcastOptions, -77, -76, -79, -60, -74, -65, -60, -50, PSSSigner.TRAILER_IMPLICIT, -67, -57, -64, -70, -67, PSSSigner.TRAILER_IMPLICIT, -66, -58, -70, -67, -48, -49, -49, -54, -55, -80, -71, -84, -83, -73, -80, -86, -83, -84, -82, -74, -86, -83, -64, -65, -65, -70, -71, -47, -34, -34, -37, -34, BuiltinOptions.UnsortedSegmentProdOptions, -123, BuiltinOptions.RightShiftOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.BitcastOptions, -95, -102, -89, -99, -91, -98, -104, -100, -83, -102, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.RandomOptions, BuiltinOptions.ATan2Options, BuiltinOptions.BucketizeOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.GeluOptions, BuiltinOptions.ReadVariableOptions, -128, -124, -49, -48, -53, -52, -58, -35, -48, -53, -52, -42, -67, -63, -60, -58, -71, -57, -57, -67, -61, -62, PSSSigner.TRAILER_IMPLICIT, -79, -59, -66, -77, -72, ProtocolBytes.SOF, -79, -76, ProtocolBytes.SOF, -62, -75, -64, -65, -62, -60, -71, -66, -73, ProtocolBytes.SOF, -74, PSSSigner.TRAILER_IMPLICIT, -65, -57, -99, OtaCommandGenerator.CMD_OTA_INFO, -104, -17, -9, -10, -25, -31, -8, -21, -26, -25, -15, -42, -51, -33, -57, -50, -35, -42, -42, -51, -44, -26, -25, -36, -27, -42, -29, -32, -27, -30, -113, -128, -108, OtaCommandGenerator.CMD_GET_INFO_TLV, -124, BuiltinOptions.RightShiftOptions, -107, -120, -125, -124, -114, -55, -59, -70, -46, -72, -49, -62, -67, -66, -56, -55, -53, -66, -52, -66, -57, -51, -72, -65, -50, -59, -59, -52, PSSSigner.TRAILER_IMPLICIT, -53, -66, -66, -57, -44, -57, -61, -58, -63, TransmissionUnpacked.HD_VAL_MAGIC_LB, -42, -44, -53, -48, -55, -101, -114, OtaCommandGenerator.CMD_OTA_INFO, -118, -101, -115, -120, -116, -104, -106, -103, -107, -114, -99, -114, -53, -61, -63, -56, -73, -50, -63, PSSSigner.TRAILER_IMPLICIT, -67, -57, -124, 127, BuiltinOptions.UnsortedSegmentProdOptions, -127, BuiltinOptions.RandomOptions, BuiltinOptions.HashtableFindOptions, -128, -127, 127, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.SignOptions, BuiltinOptions.GeluOptions};
    }

    static {
        A02();
        A0B = new EnumC2836bz(A01(76, 10, 43), 0, A01(310, 10, 53));
        A0F = new EnumC2836bz(A01(117, 19, 120), 1, A01(351, 24, 76));
        A04 = new EnumC2836bz(A01(0, 13, 107), 2, A01(244, 13, 6));
        A07 = new EnumC2836bz(A01(37, 18, 106), 3, A01(281, 18, 71));
        A06 = new EnumC2836bz(A01(18, 19, 95), 4, A01(262, 19, 87));
        A0E = new EnumC2836bz(A01(107, 10, 100), 5, A01(341, 10, 80));
        A0G = new EnumC2836bz(A01(136, 3, 50), 6, A01(375, 3, 45));
        A05 = new EnumC2836bz(A01(13, 5, 54), 7, A01(257, 5, 75));
        A0A = new EnumC2836bz(A01(70, 6, 83), 8, A01(304, 6, 12));
        A0I = new EnumC2836bz(A01(149, 10, 69), 9, A01(388, 10, 100));
        A0N = new EnumC2836bz(A01(200, 15, 102), 10, A01(457, 15, 37));
        A08 = new EnumC2836bz(A01(55, 5, 71), 11, A01(SportTypeConstant.Course_38, 5, 104));
        A0H = new EnumC2836bz(A01(139, 10, 96), 12, A01(378, 10, 126));
        A0D = new EnumC2836bz(A01(97, 10, 108), 13, A01(331, 10, 99));
        A0O = new EnumC2836bz(A01(215, 10, 91), 14, A01(472, 10, 84));
        A0L = new EnumC2836bz(A01(DeviceFeatures.MAP_MODE, 10, 125), 15, A01(Videoio.CAP_PROP_XI_AG_MAX_LIMIT, 10, 85));
        A0K = new EnumC2836bz(A01(168, 11, 7), 16, A01(407, 11, 27));
        A0Q = new EnumC2836bz(A01(DeviceFeatures.HEADSET_KEY_CALL, 12, 27), 17, A01(482, 12, 9));
        A0M = new EnumC2836bz(A01(189, 11, 120), 18, A01(446, 11, 94));
        A0C = new EnumC2836bz(A01(86, 11, 74), 19, A01(320, 11, 10));
        A09 = new EnumC2836bz(A01(60, 10, 61), 20, A01(Videoio.CAP_PROP_XI_BINNING_VERTICAL, 18, 85));
        A0J = new EnumC2836bz(A01(159, 9, 115), 21, A01(398, 9, 115));
        A0P = new EnumC2836bz(A01(225, 7, 58), 22, A01(0, 0, 60));
        A03 = A03();
    }

    public EnumC2836bz(String str, int r2, String str2) {
        super(str, r2);
        this.A00 = str2;
    }

    public static EnumC2836bz A00(String str) {
        for (EnumC2836bz enumC2836bz : values()) {
            if (enumC2836bz.A00.equalsIgnoreCase(str)) {
                return enumC2836bz;
            }
        }
        EnumC2836bz enumC2836bz2 = A0P;
        String[] strArr = A02;
        if (strArr[5].charAt(11) != strArr[3].charAt(11)) {
            throw new RuntimeException();
        }
        A02[1] = "FXbZWXffVyaneTw3kEwIh8dxCOHwnV6P";
        return enumC2836bz2;
    }

    public static /* synthetic */ EnumC2836bz[] A03() {
        EnumC2836bz[] enumC2836bzArr = new EnumC2836bz[23];
        enumC2836bzArr[0] = A0B;
        String[] strArr = A02;
        if (strArr[0].charAt(12) != strArr[4].charAt(12)) {
            throw new RuntimeException();
        }
        A02[6] = "5YohDqwhZisgRi0et8gjdsLiIOixczu5";
        enumC2836bzArr[1] = A0F;
        enumC2836bzArr[2] = A04;
        enumC2836bzArr[3] = A07;
        enumC2836bzArr[4] = A06;
        enumC2836bzArr[5] = A0E;
        enumC2836bzArr[6] = A0G;
        enumC2836bzArr[7] = A05;
        enumC2836bzArr[8] = A0A;
        enumC2836bzArr[9] = A0I;
        enumC2836bzArr[10] = A0N;
        enumC2836bzArr[11] = A08;
        enumC2836bzArr[12] = A0H;
        enumC2836bzArr[13] = A0D;
        enumC2836bzArr[14] = A0O;
        enumC2836bzArr[15] = A0L;
        enumC2836bzArr[16] = A0K;
        enumC2836bzArr[17] = A0Q;
        enumC2836bzArr[18] = A0M;
        enumC2836bzArr[19] = A0C;
        enumC2836bzArr[20] = A09;
        enumC2836bzArr[21] = A0J;
        enumC2836bzArr[22] = A0P;
        return enumC2836bzArr;
    }

    public static EnumC2836bz valueOf(String str) {
        return (EnumC2836bz) Enum.valueOf(EnumC2836bz.class, str);
    }

    public static EnumC2836bz[] values() {
        return (EnumC2836bz[]) A03.clone();
    }
}
