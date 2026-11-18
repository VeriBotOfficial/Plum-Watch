package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.f5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum EnumC3026f5 {
    A03,
    A04;

    public static byte[] A00;
    public static String[] A01 = {"xrpFqliwvTmrUeY9fA", "WQofXYOtPOfcZVcnLB6jDFevspEJYzJo", "xmcQ51qE3IL5CD3g", "vqfe6L9tI0UCZhHJZZILisyG0KCy4R", "fiUEN16u3MZCpDGCMqSf2x4N5Q5QlPxX", "5xn2ImkHS4ATQgLTDfLLcMPpUWGwzNh4", "NsPZM3725QIioQriGr2vh8z8GZ7DcYd3", "wIDfTgN4CVihAS6ZHyHagF8TJWsTJSVw"};

    public static String A00(int r4, int r5, int r6) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, r4, r4 + r5);
        int r7 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A01[1].length() == 22) {
                throw new RuntimeException();
            }
            A01[1] = "aO5t2";
            if (r7 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[r7] = (byte) ((bArrCopyOfRange[r7] ^ r6) ^ 98);
            String[] strArr = A01;
            if (strArr[0].length() != strArr[2].length()) {
                A01[3] = "tB3IEJBlHxhWtpYKuvAk87dclmwGEs";
                r7++;
            } else {
                r7++;
            }
        }
    }

    public static void A01() {
        A00 = new byte[]{58, BuiltinOptions.EqualOptions, BuiltinOptions.SliceOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.LogicalOrOptions, 61, BuiltinOptions.WhereOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.CosOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.CosOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.RangeOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.FloorModOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.SquareOptions};
    }

    static {
        A01();
    }
}
