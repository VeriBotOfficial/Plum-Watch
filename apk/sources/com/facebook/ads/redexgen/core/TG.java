package com.facebook.ads.redexgen.core;

import com.bluetrum.fota.manager.OtaCommandGenerator;
import java.util.Arrays;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: assets/audience_network.dex */
public enum TG {
    A04,
    A03,
    A02;

    public static byte[] A00;

    public static String A00(int r2, int r3, int r4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, r2, r2 + r3);
        for (int r1 = 0; r1 < bArrCopyOfRange.length; r1++) {
            bArrCopyOfRange[r1] = (byte) ((bArrCopyOfRange[r1] - r4) - 12);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{BuiltinOptions.SelectV2Options, BuiltinOptions.HashtableOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.Conv3DOptions, -108, -104, -101, -99, OtaCommandGenerator.CMD_NOTIFY_STATUS, -98, -98, -108, -102, -103, -69, -82, -70, -66, -82, PSSSigner.TRAILER_IMPLICIT, -67};
    }

    static {
        A01();
    }
}
