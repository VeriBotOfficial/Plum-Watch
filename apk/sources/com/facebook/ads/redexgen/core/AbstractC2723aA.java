package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract /* synthetic */ class AbstractC2723aA {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A00(int r2, int r3, int r4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, r2, r2 + r3);
        for (int r1 = 0; r1 < bArrCopyOfRange.length; r1++) {
            bArrCopyOfRange[r1] = (byte) ((bArrCopyOfRange[r1] - r4) - 117);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{BuiltinOptions.TileOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.PackOptions, BuiltinOptions.PowOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.PowOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.FloorDivOptions};
    }

    public static /* synthetic */ String A01(CharSequence charSequence, CharSequence[] charSequenceArr) {
        if (charSequence == null) {
            throw new NullPointerException(A00(0, 9, 90));
        }
        StringBuilder sb = new StringBuilder();
        if (charSequenceArr.length > 0) {
            sb.append(charSequenceArr[0]);
            for (int r1 = 1; r1 < charSequenceArr.length; r1++) {
                sb.append(charSequence);
                sb.append(charSequenceArr[r1]);
            }
        }
        return sb.toString();
    }
}
