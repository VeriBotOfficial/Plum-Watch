package com.facebook.ads.redexgen.core;

import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.Wm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1932Wm {
    public static byte[] A00;
    public static String[] A01 = {"fKOq3CLbRisV2HCvxbP8DswDC3h61WtS", "qQcG8iivYcbnleQXnFNfPBjKpUSTKwt1", "90Y8NMpYXvys60lz4Y4AY7bkcR6rkmkz", "C2raqoqRf1xXuaxgLg", "Co6wMAKL4SYYucOnnpwSDFFGSy", "pPL6tu27HuVGqH4ILm", "ywYYaeUt5bOEJr09A3", "jMc4mNTDFQmf2DaMzWYBnxz0IZlySjfz"};
    public static final String A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 23);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{27, BuiltinOptions.ArgMinOptions, BuiltinOptions.NotEqualOptions, Byte.MAX_VALUE, BuiltinOptions.GreaterOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.LogicalOrOptions, 61, BuiltinOptions.GreaterOptions, 61, BuiltinOptions.NegOptions, BuiltinOptions.EqualOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.NotEqualOptions, 61, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.PadV2Options, BuiltinOptions.UnsortedSegmentMinOptions, 13, BuiltinOptions.NotEqualOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.ExpOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.ShapeOptions, 13, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.PadV2Options, 16, 23, 10, 7, BuiltinOptions.DepthToSpaceOptions, 31, 14, 14, BuiltinOptions.FillOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.CosOptions, BuiltinOptions.RankOptions, 21, BuiltinOptions.WhileOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.CosOptions, BuiltinOptions.CosOptions, BuiltinOptions.UniqueOptions, 21, BuiltinOptions.RangeOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.SplitVOptions, 21, BuiltinOptions.Rfft2dOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.ATan2Options, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.AddNOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.AddNOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.SquareOptions, 18, 30, 28, BuiltinOptions.NonMaxSuppressionV4Options, 4, 31, 24, 5, 8, BuiltinOptions.SquareOptions, 21, BuiltinOptions.NonMaxSuppressionV4Options, 1, 29, 16, 8, 20, 3, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.LogSoftmaxOptions, 31, 24, 5, 8, BuiltinOptions.ExpOptions, 29, 16, 8, 20, 3, BuiltinOptions.SliceOptions, 18, 5, 24, 7, 24, 5, 8};
    }

    static {
        A01();
        A02 = C1932Wm.class.getSimpleName();
    }

    public static boolean A02() {
        try {
            Class.forName(A00(46, 32, 44));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean A03() {
        try {
            Class.forName(A00(78, 38, 102));
            if (A01[2].charAt(21) != '7') {
                throw new RuntimeException();
            }
            A01[2] = "fqSGPLRwldKX66WDmKKlg7YQ1V3cstss";
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean A04(int i, int i2) {
        return i >= 640 && i2 >= 640;
    }

    public static boolean A05(SQ sq) {
        boolean z = false;
        try {
            PackageManager packageManager = sq.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            boolean isUnity = true;
            ActivityInfo[] activityInfoArr = packageManager.getPackageInfo(sq.getPackageName(), 1).activities;
            if (activityInfoArr != null) {
                int length = activityInfoArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    boolean activityDeclared = A00(78, 38, 102).equals(activityInfoArr[i].name);
                    if (!activityDeclared) {
                        i++;
                    } else {
                        z = true;
                        break;
                    }
                }
            }
            if (!z) {
                boolean activityDeclared2 = A03();
                if (!activityDeclared2) {
                    isUnity = false;
                }
            }
            boolean activityDeclared3 = sq.A05().AAF();
            if (activityDeclared3) {
                String str = A00(32, 14, 105) + isUnity;
            }
            return isUnity;
        } catch (Throwable th) {
            if (sq.A05().AAF()) {
                Log.e(A02, A00(0, 32, 79), th);
            }
            return false;
        }
    }
}
