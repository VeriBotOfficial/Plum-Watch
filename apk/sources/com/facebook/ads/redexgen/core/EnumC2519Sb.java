package com.facebook.ads.redexgen.core;

import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import com.bluetrum.fota.manager.OtaCommandGenerator;
import java.util.Arrays;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum EnumC2519Sb {
    A08(9000, A00(0, 30, 12)),
    A06(3001, A00(160, 29, 104)),
    A05(3002, A00(125, 35, 75)),
    A07(3003, A00(189, 33, 88)),
    A04(3004, A00(90, 35, 54));

    public static byte[] A02;
    public final int A00;
    public final String A01;

    public static String A00(int r2, int r3, int r4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, r2, r2 + r3);
        for (int r1 = 0; r1 < bArrCopyOfRange.length; r1++) {
            bArrCopyOfRange[r1] = (byte) ((bArrCopyOfRange[r1] - r4) - 15);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{BuiltinOptions.IfOptions, -119, BuiltinOptions.PackOptions, OtaCommandGenerator.CMD_NOTIFY_STATUS, -119, -122, -119, -118, OtaCommandGenerator.CMD_GET_INFO_TLV, -119, BuiltinOptions.PackOptions, -128, -115, -115, -118, -115, BuiltinOptions.PackOptions, -125, BuiltinOptions.BitcastOptions, -114, BuiltinOptions.PackOptions, -118, BuiltinOptions.RightShiftOptions, BuiltinOptions.RightShiftOptions, OtaCommandGenerator.CMD_NOTIFY_STATUS, -115, -115, -128, 127, BuiltinOptions.RangeOptions, -66, -69, -50, -69, PSSSigner.TRAILER_IMPLICIT, -69, -51, -65, -39, -66, -65, -58, -65, -50, -65, -105, -108, -89, -108, -107, -108, -90, -104, -78, -100, -95, -90, -104, -91, -89, BuiltinOptions.RightShiftOptions, BuiltinOptions.SignOptions, -114, BuiltinOptions.SignOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.SignOptions, -115, 127, -103, -115, 127, -122, 127, BuiltinOptions.BitwiseXorOptions, -114, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.DensifyOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.GeluOptions, BuiltinOptions.CumsumOptions, -128, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.CumsumOptions, -117, -90, -82, -79, -86, -87, BuiltinOptions.BatchMatMulOptions, -71, -76, BuiltinOptions.BatchMatMulOptions, -87, -86, -79, -86, -71, -86, BuiltinOptions.BatchMatMulOptions, -73, -76, PSSSigner.TRAILER_IMPLICIT, BuiltinOptions.BatchMatMulOptions, -85, -73, -76, -78, BuiltinOptions.BatchMatMulOptions, -87, -90, -71, -90, -89, -90, -72, -86, BuiltinOptions.BucketizeOptions, OtaCommandGenerator.CMD_OTA_INFO, -69, -61, -58, -65, -66, BuiltinOptions.ATan2Options, -50, -55, BuiltinOptions.ATan2Options, -61, -56, -51, -65, -52, -50, BuiltinOptions.ATan2Options, -52, -55, -47, BuiltinOptions.ATan2Options, -61, -56, -50, -55, BuiltinOptions.ATan2Options, -66, -69, -50, -69, PSSSigner.TRAILER_IMPLICIT, -69, -51, -65, -120, -67, -40, -32, -29, -36, -37, -105, -21, -26, -105, -23, -36, -40, -37, -105, -35, -23, -26, -28, -105, -37, -40, -21, -40, -39, -40, -22, -36, -91, -83, -56, -48, -45, -52, -53, -121, -37, -42, -121, -36, -41, -53, -56, -37, -52, -121, -39, -42, -34, -121, -48, TransmissionUnpacked.HD_VAL_MAGIC_LB, -121, -53, -56, -37, -56, -55, -56, -38, -52, -107, BuiltinOptions.HashtableOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.SegmentSumOptions};
    }

    static {
        A01();
    }

    EnumC2519Sb(int r3, String str) {
        this.A00 = r3;
        this.A01 = str;
    }

    public final int A03() {
        return this.A00;
    }

    public final String A04() {
        return this.A01;
    }
}
