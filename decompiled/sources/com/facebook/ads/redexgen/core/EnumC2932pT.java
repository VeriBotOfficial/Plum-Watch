package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.pT, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC2932pT {
    A02,
    A05,
    A03,
    A04;

    public static byte[] A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 89);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{14, 3, 24, 14, 22, 28, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.CosOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.PackOptions, BuiltinOptions.SliceOptions, 35, BuiltinOptions.SliceOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.UnsortedSegmentProdOptions};
    }

    static {
        A01();
    }
}
