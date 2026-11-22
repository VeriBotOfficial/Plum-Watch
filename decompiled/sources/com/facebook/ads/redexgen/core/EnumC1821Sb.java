package com.facebook.ads.redexgen.core;

import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import com.bluetrum.fota.manager.OtaCommandGenerator;
import java.util.Arrays;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.Sb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC1821Sb {
    A08(9000, A00(0, 30, 12)),
    A06(3001, A00(160, 29, 104)),
    A05(3002, A00(125, 35, 75)),
    A07(3003, A00(189, 33, 88)),
    A04(3004, A00(90, 35, 54));

    public static byte[] A02;
    public final int A00;
    public final String A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 15);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{BuiltinOptions.IfOptions, -119, BuiltinOptions.PackOptions, OtaCommandGenerator.CMD_NOTIFY_STATUS, -119, -122, -119, -118, OtaCommandGenerator.CMD_GET_INFO_TLV, -119, BuiltinOptions.PackOptions, Byte.MIN_VALUE, -115, -115, -118, -115, BuiltinOptions.PackOptions, -125, BuiltinOptions.BitcastOptions, -114, BuiltinOptions.PackOptions, -118, BuiltinOptions.RightShiftOptions, BuiltinOptions.RightShiftOptions, OtaCommandGenerator.CMD_NOTIFY_STATUS, -115, -115, Byte.MIN_VALUE, Byte.MAX_VALUE, BuiltinOptions.RangeOptions, -66, -69, -50, -69, PSSSigner.TRAILER_IMPLICIT, -69, -51, -65, -39, -66, -65, -58, -65, -50, -65, -105, -108, -89, -108, -107, -108, -90, -104, -78, -100, -95, -90, -104, -91, -89, BuiltinOptions.RightShiftOptions, BuiltinOptions.SignOptions, -114, BuiltinOptions.SignOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.SignOptions, -115, Byte.MAX_VALUE, -103, -115, Byte.MAX_VALUE, -122, Byte.MAX_VALUE, BuiltinOptions.BitwiseXorOptions, -114, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.DensifyOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.GeluOptions, BuiltinOptions.CumsumOptions, Byte.MIN_VALUE, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.CumsumOptions, -117, -90, -82, -79, -86, -87, BuiltinOptions.BatchMatMulOptions, -71, -76, BuiltinOptions.BatchMatMulOptions, -87, -86, -79, -86, -71, -86, BuiltinOptions.BatchMatMulOptions, -73, -76, PSSSigner.TRAILER_IMPLICIT, BuiltinOptions.BatchMatMulOptions, -85, -73, -76, -78, BuiltinOptions.BatchMatMulOptions, -87, -90, -71, -90, -89, -90, -72, -86, BuiltinOptions.BucketizeOptions, OtaCommandGenerator.CMD_OTA_INFO, -69, -61, -58, -65, -66, BuiltinOptions.ATan2Options, -50, -55, BuiltinOptions.ATan2Options, -61, -56, -51, -65, -52, -50, BuiltinOptions.ATan2Options, -52, -55, -47, BuiltinOptions.ATan2Options, -61, -56, -50, -55, BuiltinOptions.ATan2Options, -66, -69, -50, -69, PSSSigner.TRAILER_IMPLICIT, -69, -51, -65, -120, -67, -40, -32, -29, -36, -37, -105, -21, -26, -105, -23, -36, -40, -37, -105, -35, -23, -26, -28, -105, -37, -40, -21, -40, -39, -40, -22, -36, -91, -83, -56, -48, -45, -52, -53, -121, -37, -42, -121, -36, -41, -53, -56, -37, -52, -121, -39, -42, -34, -121, -48, TransmissionUnpacked.HD_VAL_MAGIC_LB, -121, -53, -56, -37, -56, -55, -56, -38, -52, -107, BuiltinOptions.HashtableOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.SegmentSumOptions};
    }

    static {
        A01();
    }

    EnumC1821Sb(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }

    public final int A03() {
        return this.A00;
    }

    public final String A04() {
        return this.A01;
    }
}
