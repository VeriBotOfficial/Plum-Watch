package com.facebook.ads.redexgen.core;

import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import com.bluetrum.fota.manager.OtaCommandGenerator;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: assets/audience_network.dex */
public enum iW {
    A05,
    A04,
    A02,
    A03;

    public static byte[] A00;

    public static String A00(int r2, int r3, int r4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, r2, r2 + r3);
        for (int r1 = 0; r1 < bArrCopyOfRange.length; r1++) {
            bArrCopyOfRange[r1] = (byte) ((bArrCopyOfRange[r1] - r4) - 30);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-121, OtaCommandGenerator.CMD_GET_INFO_TLV, OtaCommandGenerator.CMD_GET_INFO, -120, 127, BuiltinOptions.ATan2Options, -126, -123, BuiltinOptions.RightShiftOptions, BuiltinOptions.BitwiseXorOptions, -109, -108, -103, -92, -105, -118, -122, -119, -98, TransmissionUnpacked.HD_VAL_MAGIC_LB, -56, -60, -57, -36};
    }

    static {
        A01();
    }
}
