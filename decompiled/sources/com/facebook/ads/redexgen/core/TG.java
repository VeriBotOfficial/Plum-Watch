package com.facebook.ads.redexgen.core;

import com.bluetrum.fota.manager.OtaCommandGenerator;
import java.util.Arrays;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public enum TG {
    A04,
    A03,
    A02;

    public static byte[] A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 12);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{BuiltinOptions.SelectV2Options, BuiltinOptions.HashtableOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.Conv3DOptions, -108, -104, -101, -99, OtaCommandGenerator.CMD_NOTIFY_STATUS, -98, -98, -108, -102, -103, -69, -82, -70, -66, -82, PSSSigner.TRAILER_IMPLICIT, -67};
    }

    static {
        A01();
    }
}
