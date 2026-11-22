package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.d3, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC2211d3 {
    A03,
    A02;

    public static byte[] A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 55);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{BuiltinOptions.TransposeConvOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.IfOptions, BuiltinOptions.IfOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.RankOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.ResizeNearestNeighborOptions};
    }

    static {
        A01();
    }
}
