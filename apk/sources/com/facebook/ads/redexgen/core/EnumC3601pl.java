package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum EnumC3601pl {
    A02,
    A04,
    A03;

    public static byte[] A00;

    public static String A00(int r2, int r3, int r4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, r2, r2 + r3);
        for (int r1 = 0; r1 < bArrCopyOfRange.length; r1++) {
            bArrCopyOfRange[r1] = (byte) ((bArrCopyOfRange[r1] - r4) - 10);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{BuiltinOptions.RankOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.RankOptions, BuiltinOptions.DensifyOptions, -51, -32, -47, -36, -88, -93, -105, -108, -89, -104};
    }

    static {
        A01();
    }
}
