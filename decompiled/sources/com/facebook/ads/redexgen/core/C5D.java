package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.5D, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C5D {
    public static byte[] A00;
    public static String[] A01 = {"G8ArwIe2VOAE4nt8xzvdLml4UmjpJECF", "hTc5Tda99b5K7ktAOz7Sk2ePkoxu5mJv", "uXzWM43WnlFlNXm1DUXcodvE16nJuXl6", "iRkaMP8lpeEdZIVhMcVD", "lMyhq9DthkfLW6CwBUqq2OEeTBOLdcXD", "OKiPy9zk89rZ6EyhyRbLHpsFwU1qXXE1", "FmDgVX5KrdTAXflr9ckY", "OW8d6LiXJNMD0YcnlVVA282INy85kiu1"};
    public static final Pattern A02;
    public static final Pattern A03;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 89);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{BuiltinOptions.BatchMatMulOptions, BuiltinOptions.MaximumMinimumOptions, 27, 27, 31, 58, 27, 6, 3, BuiltinOptions.CallOnceOptions, 64, BuiltinOptions.MirrorPadOptions, BuiltinOptions.FloorDivOptions, 64, BuiltinOptions.WhileOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.WhileOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.LeakyReluOptions, 64, BuiltinOptions.MatrixSetDiagOptions, 14, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.IfOptions, BuiltinOptions.WhileOptions, 14, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.CosOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.ExpOptions, BuiltinOptions.SquareOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.ExpOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.AbsOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.CosOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.FillOptions, 0, BuiltinOptions.DensifyOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.AbsOptions, BuiltinOptions.CosOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.AbsOptions, BuiltinOptions.CosOptions, 13, BuiltinOptions.RandomOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.AbsOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, 0, BuiltinOptions.SignOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.HashtableOptions, 22, BuiltinOptions.HashtableImportOptions, 5, 30, 19, 2, 20, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.WhileOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.WhileOptions, BuiltinOptions.PackOptions, 3, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.PackOptions, 3, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.AbsOptions, 27, BuiltinOptions.PackOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.AbsOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.PackOptions, 3, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.AbsOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.GeluOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.TransposeConvOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.DynamicUpdateSliceOptions, 58, BuiltinOptions.PowOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.DynamicUpdateSliceOptions, 58, BuiltinOptions.PowOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.PadV2Options, BuiltinOptions.MirrorPadOptions, BuiltinOptions.DynamicUpdateSliceOptions, 58, BuiltinOptions.HashtableImportOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.PackOptions, BuiltinOptions.PowOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.ShapeOptions};
    }

    static {
        A04();
        A03 = Pattern.compile(A02(118, 28, 72));
        A02 = Pattern.compile(A02(88, 30, 62));
    }

    public static long A00(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = A02.matcher(str);
        if (matcher.matches()) {
            return Long.parseLong((String) C3M.A01(matcher.group(1)));
        }
        return -1L;
    }

    public static long A01(String str, String str2) {
        long j = -1;
        boolean isEmpty = TextUtils.isEmpty(str);
        String A022 = A02(84, 1, 53);
        String A023 = A02(1, 8, 54);
        if (!isEmpty) {
            try {
                j = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                AnonymousClass44.A05(A023, A02(31, 27, 88) + str + A022);
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            Matcher matcher = A03.matcher(str2);
            if (matcher.matches()) {
                try {
                    long parseLong = (Long.parseLong((String) C3M.A01(matcher.group(2))) - Long.parseLong((String) C3M.A01(matcher.group(1)))) + 1;
                    if (j < 0) {
                        return parseLong;
                    }
                    if (j != parseLong) {
                        AnonymousClass44.A07(A023, A02(9, 22, 119) + str + A02(85, 3, 111) + str2 + A022);
                        j = Math.max(j, parseLong);
                        return j;
                    }
                    return j;
                } catch (NumberFormatException unused2) {
                    AnonymousClass44.A05(A023, A02(58, 26, 121) + str2 + A022);
                    return j;
                }
            }
            return j;
        }
        return j;
    }

    public static String A03(long j, long j2) {
        if (j == 0) {
            String[] strArr = A01;
            if (strArr[7].charAt(0) == strArr[5].charAt(0)) {
                String[] strArr2 = A01;
                strArr2[3] = "BG6bsnZi4wlgFYmXUZNM";
                strArr2[6] = "Qc01l7LnjPCXX6IxAAkq";
                if (j2 == -1) {
                    return null;
                }
            }
            throw new RuntimeException();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(A02(146, 6, 83));
        sb.append(j);
        sb.append(A02(0, 1, 17));
        if (j2 != -1) {
            sb.append((j + j2) - 1);
        }
        String sb2 = sb.toString();
        String[] strArr3 = A01;
        if (strArr3[3].length() == strArr3[6].length()) {
            A01[0] = "BYD36Vzxv8JTZl7GEmQPPJy8vzWoDg2F";
            return sb2;
        }
        throw new RuntimeException();
    }
}
