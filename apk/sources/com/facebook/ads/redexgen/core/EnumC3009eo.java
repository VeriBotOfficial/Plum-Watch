package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum EnumC3009eo {
    A05(true, false),
    A06(true, true);

    public static byte[] A02;
    public static String[] A03 = {"2ontwM2arFslKncjF33kbqsw34bOv6le", "G9q7n4RrTr1", "g4gCsJajd0OYdOA8Ye5rYJWq4JgSICF", "NFoKf805ct", "mafT0Rfur7fS0CNoj1tBpTWo2FQFb5xI", "EiMXCOKYsXD", "uVuWHRjrR7UDLAS", "0Dp8HE0WixXMfpgDKF4PEgrQKOmjSnl7"};
    public boolean A00;
    public boolean A01;

    public static String A00(int r2, int r3, int r4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, r2, r2 + r3);
        for (int r1 = 0; r1 < bArrCopyOfRange.length; r1++) {
            bArrCopyOfRange[r1] = (byte) ((bArrCopyOfRange[r1] ^ r4) ^ 120);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.CastOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.RankOptions, BuiltinOptions.RangeOptions, BuiltinOptions.WhereOptions, BuiltinOptions.AddNOptions};
    }

    static {
        A01();
    }

    EnumC3009eo(boolean z, boolean z2) {
        this.A00 = z;
        this.A01 = z2;
    }

    public final String A03() {
        return toString();
    }

    public final boolean A04() {
        return this.A00;
    }

    public final boolean A05() {
        return this.A01;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC3009eo[] valuesCustom() {
        EnumC3009eo[] enumC3009eoArrValuesCustom = values();
        if (A03[7].charAt(2) != 'p') {
            throw new RuntimeException();
        }
        A03[7] = "eYpi2UA0ZlC7PiDY55aF0B4EyL2494ge";
        return (EnumC3009eo[]) enumC3009eoArrValuesCustom.clone();
    }
}
