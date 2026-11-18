package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: assets/audience_network.dex */
public enum UI {
    A03,
    A02;

    public static byte[] A00;

    public static String A00(int r2, int r3, int r4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, r2, r2 + r3);
        for (int r1 = 0; r1 < bArrCopyOfRange.length; r1++) {
            bArrCopyOfRange[r1] = (byte) ((bArrCopyOfRange[r1] ^ r4) ^ 71);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{BuiltinOptions.BroadcastToOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.RandomOptions, 127, BuiltinOptions.CallOnceOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.UnsortedSegmentSumOptions};
    }

    static {
        A01();
    }
}
