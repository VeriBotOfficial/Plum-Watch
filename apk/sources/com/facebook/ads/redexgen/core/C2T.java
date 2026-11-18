package com.facebook.ads.redexgen.core;

import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import java.util.HashSet;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2T, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2T {
    public static boolean A00;
    public static String A01;
    public static byte[] A02;
    public static String[] A03 = {"xIpC", "lOutcBeb", "y6lcWPY0M5vgnnr832pPoLFOGrBEwJN", "eNaaWw40USiw6vcri4oIxijcBQWus6T9", ExifInterface.LONGITUDE_WEST, "oHSXRLDm", "pbRsDBVUOoB3mv", "LvjaTOAqlauNDNt2xP6XrUFLIm1SBtnY"};
    public static final HashSet<String> A04;

    public static String A01(int r2, int r3, int r4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, r2, r2 + r3);
        for (int r1 = 0; r1 < bArrCopyOfRange.length; r1++) {
            bArrCopyOfRange[r1] = (byte) ((bArrCopyOfRange[r1] - r4) - 95);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        if (A03[0].length() == 28) {
            throw new RuntimeException();
        }
        A03[6] = "8";
        A02 = new byte[]{-61, -73, BuiltinOptions.TransposeConvOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.TransposeConvOptions, -8, BuiltinOptions.SelectOptions, BuiltinOptions.SquareOptions, BuiltinOptions.ArgMinOptions, -8, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.SelectOptions};
    }

    static {
        A02();
        A00 = true;
        A04 = new HashSet<>();
        A01 = A01(2, 13, 107);
    }

    public static synchronized String A00() {
        return A01;
    }

    public static synchronized void A03(String str) {
        if (A04.add(str)) {
            A01 += A01(0, 2, 56) + str;
        }
    }
}
