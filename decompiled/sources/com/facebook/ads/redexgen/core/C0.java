package com.facebook.ads.redexgen.core;

import com.google.common.math.ElementTypesAreNonnullByDefault;
import com.yandex.div2.PhoneMasks;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

@ElementTypesAreNonnullByDefault
/* loaded from: assets/audience_network.dex */
public abstract class C0 {
    public static byte[] A00;
    public static String[] A01 = {"AE3RQ6SjoFsrAp99H6Zd4spKw", "3Pq1cGGFUNEEXAchrVP3Xf", "yX", "SQjo6b3iOf0URtZXiBRUVHbWf8EnkAui", PhoneMasks.EXTRA_NUMBERS, "u726MkM70Dw3XEWQiRy0H2gvugSd8Tre", "3sVZHBX6ZyruD1ikbvJFjqJz5AcrXt3h", "iwn02HMEBncjK0hVIYdCKaY5g2oqtZ"};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = copyOfRange[i4];
            if (A01[7].length() == 5) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[1] = "H9pmIUr4yhuwQEnoSmBFmn";
            strArr[0] = "tMM9GmlwKAk4hf8HM9GRHGRZ0";
            copyOfRange[i4] = (byte) ((b - i3) - 100);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{BuiltinOptions.GreaterEqualOptions, BuiltinOptions.SelectOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.CastOptions, -32, BuiltinOptions.ShapeOptions, BuiltinOptions.ExpOptions, BuiltinOptions.TileOptions, -32, 21, 14, 14, 5, 3, 5, 19, 19, 1, 18, 25, -20, -32, 34, BuiltinOptions.EqualOptions, BuiltinOptions.ExpandDimsOptions, -32, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.SelectOptions, BuiltinOptions.EqualOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.LessOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.MaximumMinimumOptions, -32, BuiltinOptions.ShapeOptions, BuiltinOptions.ExpOptions, BuiltinOptions.TileOptions, -32, BuiltinOptions.LessEqualOptions, BuiltinOptions.CastOptions, 35, BuiltinOptions.CastOptions, BuiltinOptions.TileOptions, BuiltinOptions.TileOptions, BuiltinOptions.ExpOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.ArgMinOptions};
    }

    static {
        A01();
    }

    public static void A02(boolean condition) {
        if (condition) {
        } else {
            throw new ArithmeticException(A00(0, 48, 92));
        }
    }
}
