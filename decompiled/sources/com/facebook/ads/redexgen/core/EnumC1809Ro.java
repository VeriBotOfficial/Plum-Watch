package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.Ro, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC1809Ro {
    A08,
    A04,
    A02,
    A06,
    A07,
    A05,
    A03,
    A09;

    public static byte[] A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 122);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{10, 15, 24, 11, 9, 26, -32, -51, -32, -6, -17, -32, -18, -17, BuiltinOptions.ArgMinOptions, BuiltinOptions.EqualOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.ExpandDimsOptions, -54, -53, -37, -61, -55, -49, BuiltinOptions.LessOptions, 28, 29, 35, 28, 26, BuiltinOptions.PadV2Options, 32, BuiltinOptions.DequantizeOptions, BuiltinOptions.CastOptions, BuiltinOptions.MaximumMinimumOptions, 25, BuiltinOptions.DequantizeOptions, BuiltinOptions.NegOptions, 29, 23, 25, 28, 17, 10, 27, 14, 13, BuiltinOptions.ArgMaxOptions, 25, 27, 14, 15, 28, 31, 16, 30, 31};
    }

    static {
        A01();
    }
}
