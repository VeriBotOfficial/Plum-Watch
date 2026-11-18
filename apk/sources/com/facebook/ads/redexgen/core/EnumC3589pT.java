package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum EnumC3589pT {
    A02,
    A05,
    A03,
    A04;

    public static byte[] A00;

    public static String A00(int r2, int r3, int r4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, r2, r2 + r3);
        for (int r1 = 0; r1 < bArrCopyOfRange.length; r1++) {
            bArrCopyOfRange[r1] = (byte) ((bArrCopyOfRange[r1] ^ r4) ^ 89);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{14, 3, 24, 14, 22, 28, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.CosOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.PackOptions, BuiltinOptions.SliceOptions, 35, BuiltinOptions.SliceOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.UnsortedSegmentProdOptions};
    }

    static {
        A01();
    }
}
