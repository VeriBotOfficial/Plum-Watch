package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.p6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3576p6 {
    public static byte[] A00;
    public static String[] A01 = {"wGfW8ZiAX", "98TYLpDb5H7FHIAHZpq8", "wurshRpA61WdSnRC2QEiiDdyeizCic8s", "6EmvqyT0A8GUtNQWPCztICrBXhcLnLDE", "uA", "uieozUeELQJ7BnvT2m7zVxZQuFK6e7wq", "WTc20BWixPig5ctZiuBGmbv8oTuxO5Xh", "dqopJSQqvI22NiiNvBghv0z0kBPWpT4p"};

    public static String A00(int r4, int r5, int r6) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, r4, r4 + r5);
        for (int r7 = 0; r7 < bArrCopyOfRange.length; r7++) {
            int r3 = (bArrCopyOfRange[r7] ^ r6) ^ 28;
            if (A01[6].charAt(9) == 'Q') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[2] = "97APORAguQeQpweI2T85fGR4lID0xZM2";
            strArr[5] = "RVlAHF7VxslCalKX2MZme1MZcTv0vxDz";
            bArrCopyOfRange[r7] = (byte) r3;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{20, BuiltinOptions.QuantizeOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, 64, 20, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.HardSwishOptions, 64, 20, BuiltinOptions.RankOptions, BuiltinOptions.ReverseV2Options, 20, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.MatrixDiagOptions, 31, 19, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.AddNOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.AddNOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.RankOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.RankOptions, BuiltinOptions.FloorDivOptions, 19, BuiltinOptions.TransposeConvOptions, BuiltinOptions.DequantizeOptions, 23, 4, 23, 27, 19, 2, 19, 4, BuiltinOptions.RankOptions, 5, 6, 19, 21, 31, 16, 31, 19, 18, BuiltinOptions.RankOptions, 23, 5, BuiltinOptions.RankOptions, 24, 25, 24, BuiltinOptions.HardSwishOptions, 24, 3, 26, 26, BuiltinOptions.RankOptions, 31, 5, BuiltinOptions.RankOptions, 24, 3, 26, 26, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.RankOptions, 27, 19, 2, 30, 25, 18, BuiltinOptions.RankOptions};
    }

    static {
        A04();
    }

    public static String A01(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = C3576p6.class.getName();
        int r1 = 0;
        while (!stackTrace[r1].getClassName().equals(name)) {
            r1++;
        }
        while (stackTrace[r1].getClassName().equals(name)) {
            r1++;
        }
        StackTraceElement stackTraceElement = stackTrace[r1];
        String methodName = stackTraceElement.getClassName();
        String className = stackTraceElement.getMethodName();
        return A00(30, 48, 106) + methodName + A00(29, 1, 3) + className + A00(17, 12, 47) + str;
    }

    public static <T extends Throwable> T A02(T t) {
        return (T) A03(t, C3576p6.class.getName());
    }

    public static <T extends Throwable> T A03(T throwable, String str) {
        StackTraceElement[] stackTrace = throwable.getStackTrace();
        int i = stackTrace.length;
        int lastIntrinsic = -1;
        for (int size = 0; size < i; size++) {
            if (str.equals(stackTrace[size].getClassName())) {
                lastIntrinsic = size;
            }
        }
        StackTraceElement[] stackTrace2 = (StackTraceElement[]) Arrays.copyOfRange(stackTrace, lastIntrinsic + 1, i);
        throwable.setStackTrace(stackTrace2);
        int size2 = A01[6].charAt(9);
        if (size2 == 81) {
            throw new RuntimeException();
        }
        A01[7] = "7EM55IZD6WJUcGDkvpLhGBZC82NS7r4s";
        return throwable;
    }

    public static void A05() {
        throw ((NullPointerException) A02(new NullPointerException()));
    }

    public static void A06(Object obj) {
        if (obj == null) {
            A05();
            throw null;
        }
    }

    public static void A07(Object obj, String str) {
        if (obj == null) {
            A0A(str);
            throw null;
        }
    }

    public static void A08(Object obj, String str) {
        if (obj != null) {
        } else {
            throw ((NullPointerException) A02(new NullPointerException(str + A00(0, 17, 40))));
        }
    }

    public static void A09(Object obj, String str) {
        if (obj == null) {
            A0B(str);
            throw null;
        }
    }

    public static void A0A(String str) {
        throw ((NullPointerException) A02(new NullPointerException(str)));
    }

    public static void A0B(String str) {
        throw ((NullPointerException) A02(new NullPointerException(A01(str))));
    }

    public static boolean A0C(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }
}
