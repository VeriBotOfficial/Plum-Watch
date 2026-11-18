package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: assets/audience_network.dex */
public enum VA {
    A03,
    A04;

    public static byte[] A00;
    public static String[] A01 = {"muyYqE", "E9PpaFAJE9Hnt4d", "ghgofcX6zvMHlgudfTaqS8Nc5lCgt2E9", "YIYOJOVvACGtG0gL9GV7SlNTtBEERz", "JgOQfSPAOiHiw6Rg9nCac4dnqR1hKwEe", "B0OWkxWZ1EYllgtprLWqObgHiHWKfwuG", "4mHTrr1U8XEd9q", "nBr2KfKPMHO8Xb5ORNsKNBZ88yN02YcX"};

    public static String A00(int r4, int r5, int r6) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, r4, r4 + r5);
        int r7 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A01;
            if (strArr[4].charAt(4) != strArr[2].charAt(4)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "ButKfEyieReZO2wb3N14oIodeWUfkj1h";
            strArr2[2] = "KKvBf6HmkOg9UJ27XgqfLe6TaNBCJiNp";
            if (r7 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[r7] = (byte) ((bArrCopyOfRange[r7] ^ r6) ^ 22);
            r7++;
        }
    }

    public static void A01() {
        A00 = new byte[]{BuiltinOptions.MatrixDiagOptions, BuiltinOptions.WhereOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.SegmentSumOptions};
    }

    static {
        A01();
    }
}
