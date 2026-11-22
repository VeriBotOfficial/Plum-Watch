package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.Av, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1381Av extends Exception {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 81);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{BuiltinOptions.ExpandDimsOptions, 19, 27, 30, 23, 22, BuiltinOptions.AddNOptions, 6, 29, BuiltinOptions.AddNOptions, 3, 7, 23, 0, 11, BuiltinOptions.AddNOptions, 7, 28, 22, 23, 0, 30, 11, 27, 28, 21, BuiltinOptions.AddNOptions, 31, 23, 22, 27, 19, BuiltinOptions.AddNOptions, 17, 29, 22, 23, 17, 1};
    }

    public C1381Av(Throwable th) {
        super(A00(0, 39, 35), th);
    }
}
