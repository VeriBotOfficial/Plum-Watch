package com.facebook.ads.redexgen.core;

import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import com.bluetrum.fota.manager.OtaCommandGenerator;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.iW, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC2533iW {
    A05,
    A04,
    A02,
    A03;

    public static byte[] A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 30);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-121, OtaCommandGenerator.CMD_GET_INFO_TLV, OtaCommandGenerator.CMD_GET_INFO, -120, Byte.MAX_VALUE, BuiltinOptions.ATan2Options, -126, -123, BuiltinOptions.RightShiftOptions, BuiltinOptions.BitwiseXorOptions, -109, -108, -103, -92, -105, -118, -122, -119, -98, TransmissionUnpacked.HD_VAL_MAGIC_LB, -56, -60, -57, -36};
    }

    static {
        A01();
    }
}
