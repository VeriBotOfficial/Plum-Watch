package com.facebook.ads.redexgen.core;

import android.graphics.Color;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class OP {
    public static byte[] A00;
    public static String[] A01 = {"OxqqmxACKcMb9rgd4flgeoqO4FLkDXK8", "hO921EE08Z5YovLaOXzv", "4KPhJxryuqZouci8ltOnoaa6GepMOFR6", "Qaf3Cf9SMgDDqCFg3avrhgzCiMtnLJnE", "vZFktEahG3bWOXRkYAMaCi8nGdaO1v3Q", "tZHqmUfqpLYo8cwpqndw", "zlaA7TXYCJ", "adeIrckSIlUrZ7yW4ZooAIUWBthMSkAF"};
    public static final ThreadLocal<double[]> A02;

    public static String A07(int r2, int r3, int r4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, r2, r2 + r3);
        for (int r1 = 0; r1 < bArrCopyOfRange.length; r1++) {
            bArrCopyOfRange[r1] = (byte) ((bArrCopyOfRange[r1] ^ r4) ^ 56);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A00 = new byte[]{26, 23, 11, 19, 26, BuiltinOptions.HardSwishOptions, 22, 14, 8, 15, BuiltinOptions.HardSwishOptions, 25, 30, BuiltinOptions.HardSwishOptions, 25, 30, 15, 12, 30, 30, 21, BuiltinOptions.HardSwishOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.HardSwishOptions, 26, 21, 31, BuiltinOptions.HardSwishOptions, BuiltinOptions.RangeOptions, BuiltinOptions.AbsOptions, BuiltinOptions.AbsOptions, BuiltinOptions.WhereOptions, BuiltinOptions.PackOptions, BuiltinOptions.PowOptions, 58, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.PadV2Options, BuiltinOptions.NotEqualOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.ShapeOptions, 61, BuiltinOptions.UnsortedSegmentSumOptions, 58, BuiltinOptions.PowOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.PackOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.PadV2Options, BuiltinOptions.PowOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.NegOptions, BuiltinOptions.EqualOptions, BuiltinOptions.GreaterOptions, 58, BuiltinOptions.LogicalOrOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.ATan2Options, 63, BuiltinOptions.CastOptions, BuiltinOptions.LogSoftmaxOptions, 8, BuiltinOptions.LessOptions, BuiltinOptions.NegOptions, BuiltinOptions.ReadVariableOptions, 61, BuiltinOptions.CastOptions, 35, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.PowOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.EqualOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.EqualOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.PowOptions, BuiltinOptions.ReadVariableOptions, 63, BuiltinOptions.NotEqualOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.RightShiftOptions};
    }

    static {
        A08();
        A02 = new ThreadLocal<>();
    }

    public static double A00(int r3) {
        double[] dArrA0B = A0B();
        A0A(r3, dArrA0B);
        return dArrA0B[1] / 100.0d;
    }

    public static double A01(int r5, int r6) {
        if (Color.alpha(r6) == 255) {
            if (Color.alpha(r5) < 255) {
                r5 = A04(r5, r6);
            }
            double luminance2 = A00(r5) + 0.05d;
            double luminance1 = A00(r6) + 0.05d;
            return Math.max(luminance2, luminance1) / Math.min(luminance2, luminance1);
        }
        throw new IllegalArgumentException(A07(32, 36, 97) + Integer.toHexString(r6));
    }

    public static int A02(int r4, int r5) {
        if (r5 < 0 || r5 > 255) {
            throw new IllegalArgumentException(A07(0, 32, 67));
        }
        String[] strArr = A01;
        if (strArr[5].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        A01[0] = "DAqAm14HDJv7tSHiVIRuluRO44d0lStM";
        return (16777215 & r4) | (r5 << 24);
    }

    public static int A03(int r0, int r1) {
        return 255 - (((255 - r1) * (255 - r0)) / 255);
    }

    public static int A04(int r7, int r8) {
        int r6 = Color.alpha(r8);
        int r5 = Color.alpha(r7);
        int g = A03(r5, r6);
        int fgAlpha = Color.red(r7);
        int bgAlpha = Color.red(r8);
        int r = A06(fgAlpha, r5, bgAlpha, r6, g);
        int fgAlpha2 = Color.green(r7);
        int bgAlpha2 = Color.green(r8);
        int a2 = A06(fgAlpha2, r5, bgAlpha2, r6, g);
        int fgAlpha3 = Color.blue(r7);
        int bgAlpha3 = Color.blue(r8);
        return Color.argb(g, r, a2, A06(fgAlpha3, r5, bgAlpha3, r6, g));
    }

    public static int A05(int r6, int r7, float f) {
        float f2 = 1.0f - f;
        float fAlpha = Color.alpha(r6) * f2;
        float inverseRatio = Color.alpha(r7);
        float g = fAlpha + (inverseRatio * f);
        float fRed = Color.red(r6) * f2;
        float inverseRatio2 = Color.red(r7);
        float r = fRed + (inverseRatio2 * f);
        float a2 = Color.green(r6);
        float inverseRatio3 = Color.green(r7);
        float a3 = (a2 * f2) + (inverseRatio3 * f);
        float fBlue = Color.blue(r6) * f2;
        float inverseRatio4 = Color.blue(r7);
        float b = fBlue + (inverseRatio4 * f);
        return Color.argb((int) g, (int) r, (int) a3, (int) b);
    }

    public static int A06(int r1, int r2, int r3, int r4, int r5) {
        if (r5 == 0) {
            return 0;
        }
        return (((r1 * 255) * r2) + ((r3 * r4) * (255 - r2))) / (r5 * 255);
    }

    public static void A09(int r16, int r17, int r18, double[] dArr) {
        double sb;
        double sr;
        double sb2;
        if (dArr.length == 3) {
            double sb3 = ((double) r16) / 255.0d;
            if (sb3 < 0.04045d) {
                sb = sb3 / 12.92d;
            } else {
                sb = Math.pow((sb3 + 0.055d) / 1.055d, 2.4d);
            }
            double sr2 = ((double) r17) / 255.0d;
            if (sr2 < 0.04045d) {
                sr = sr2 / 12.92d;
            } else {
                double sr3 = sr2 + 0.055d;
                if (A01[2].charAt(0) != 'Y') {
                    String[] strArr = A01;
                    strArr[3] = "aAOO9yx7jRsDtZ33Oh1YUTlwgCOJU7qQ";
                    strArr[4] = "tiIjGPCneBcQleUKUeg5FNX5aBHKyIuK";
                    sr = Math.pow(sr3 / 1.055d, 2.4d);
                }
                throw new RuntimeException();
            }
            double sb4 = ((double) r18) / 255.0d;
            if (sb4 >= 0.04045d) {
                String[] strArr2 = A01;
                if (strArr2[5].length() == strArr2[1].length()) {
                    String[] strArr3 = A01;
                    strArr3[5] = "axgx58ekBr3JsKBSYEIr";
                    strArr3[1] = "AyWuGeE7FNinezs3svxh";
                    double sg2 = 0.055d + sb4;
                    sb2 = Math.pow(sg2 / 1.055d, 2.4d);
                }
                throw new RuntimeException();
            }
            sb2 = sb4 / 12.92d;
            double sg3 = 0.4124d * sb;
            dArr[0] = (sg3 + (0.3576d * sr) + (0.1805d * sb2)) * 100.0d;
            double sg4 = 0.2126d * sb;
            dArr[1] = (sg4 + (0.7152d * sr) + (0.0722d * sb2)) * 100.0d;
            double sg5 = 0.0193d * sb;
            dArr[2] = (sg5 + (0.1192d * sr) + (0.9505d * sb2)) * 100.0d;
            return;
        }
        throw new IllegalArgumentException(A07(68, 31, 104));
    }

    public static void A0A(int r3, double[] dArr) {
        A09(Color.red(r3), Color.green(r3), Color.blue(r3), dArr);
    }

    public static double[] A0B() {
        double[] dArr = A02.get();
        if (dArr == null) {
            double[] dArr2 = new double[3];
            A02.set(dArr2);
            return dArr2;
        }
        return dArr;
    }
}
