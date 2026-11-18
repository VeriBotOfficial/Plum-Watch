package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.d3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum EnumC2902d3 {
    A03,
    A02;

    public static byte[] A00;

    public static String A00(int r2, int r3, int r4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, r2, r2 + r3);
        for (int r1 = 0; r1 < bArrCopyOfRange.length; r1++) {
            bArrCopyOfRange[r1] = (byte) ((bArrCopyOfRange[r1] ^ r4) ^ 55);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{BuiltinOptions.TransposeConvOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.IfOptions, BuiltinOptions.IfOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.RankOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.ResizeNearestNeighborOptions};
    }

    static {
        A01();
    }
}
