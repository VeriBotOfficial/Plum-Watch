package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.Zt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC2017Zt {
    A05(0),
    A04(1),
    A03(2);

    public static byte[] A01;
    public int A00;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 120);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{BuiltinOptions.AbsOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.FloorDivOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.AddNOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.PowOptions, BuiltinOptions.MaximumMinimumOptions, 58, BuiltinOptions.LogicalOrOptions, 58, BuiltinOptions.LessOptions, BuiltinOptions.ExpOptions, BuiltinOptions.LogicalOrOptions, 22, 13, 16, 19, 6, 0, 10, 5, 10, 6, 7};
    }

    static {
        A02();
    }

    EnumC2017Zt(int i) {
        this.A00 = i;
    }

    public static EnumC2017Zt A00(int i) {
        for (EnumC2017Zt enumC2017Zt : values()) {
            if (enumC2017Zt.A00 == i) {
                return enumC2017Zt;
            }
        }
        return A04;
    }

    public final int A04() {
        return this.A00;
    }
}
