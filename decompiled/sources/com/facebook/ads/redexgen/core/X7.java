package com.facebook.ads.redexgen.core;

import android.content.Context;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public abstract class X7 {
    public static byte[] A00;
    public static String[] A01 = {"LplfTEYRnODnDpz21EneRZRsMargZTNK", "2NrlLG7hqMfWnzI4aYc74QPIxJ4DJ1XR", "L7pmDhfbtl8pdMobHzydLQ1D6YOazgIb", "V9Kuj32Ww6lLhCXMI4XEd9rHt60G9lJq", "k0plFnx6zt0D5xnpu3Hlko5", "WGZsYEfxfTD4T7Cqe3yCHw86dz09xOKF", "rh2k8IOHNldhKVbVonTuZ6bN28ke0n", "kkjOWDxiYS6HSpJcTpvH6ub4oru0qlUQ"};
    public static final Pattern A02;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 44);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{13, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.RankOptions, 14, BuiltinOptions.FillOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.RankOptions, 14, BuiltinOptions.RightShiftOptions, BuiltinOptions.FillOptions, 8, BuiltinOptions.NonMaxSuppressionV4Options, 11, BuiltinOptions.UnsortedSegmentMinOptions, 14, 12, BuiltinOptions.RightShiftOptions, BuiltinOptions.SegmentSumOptions, 8, Byte.MAX_VALUE, BuiltinOptions.UnsortedSegmentMinOptions, 11, 15, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.ResizeNearestNeighborOptions, 30, BuiltinOptions.MirrorPadOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.WhileOptions, BuiltinOptions.WhereOptions, 30, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.WhileOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.ZerosLikeOptions, 0, BuiltinOptions.FloorModOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, 0, BuiltinOptions.SplitVOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.WhileOptions};
    }

    static {
        A07();
        A02 = Pattern.compile(A02(0, 24, 9));
    }

    public static String A00() {
        return A06(new Exception(A02(24, 19, 18)), -1, -1, false);
    }

    public static String A01(int i) {
        if (i <= 0) {
            return null;
        }
        float rate = new Random().nextFloat();
        if (rate >= 1.0f / i) {
            return null;
        }
        return A00();
    }

    public static String A03(Context context, Throwable th) {
        int A0M = U7.A0M(context);
        int maxStacktraceLines = U7.A03(context);
        return A06(th, A0M, maxStacktraceLines, U7.A1c(context));
    }

    public static String A04(String str) {
        Matcher matcher = A02.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return str;
    }

    public static String A06(Throwable th, int i, int i2, boolean z) {
        String A022 = A02(0, 0, 105);
        if (th == null) {
            return A022;
        }
        try {
            C1740Ox c1740Ox = new C1740Ox();
            X5 x5 = c1740Ox;
            String[] strArr = A01;
            if (strArr[4].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "oxxlcYcFfaMihpA7yH6yiqF";
            strArr2[6] = "gkLsRpbpRAovdKGTxU7IYJzRyz6pLt";
            if (i2 >= 0) {
                x5 = new C1738Ov(x5, i2);
            }
            if (i >= 0) {
                x5 = new C1737Ou(x5, i, i);
            }
            if (z) {
                x5 = new C1739Ow(x5);
            }
            C1741Oy c1741Oy = new C1741Oy(c1740Ox, 1, x5);
            th.printStackTrace(new PrintWriter(new X6(c1741Oy)));
            c1741Oy.flush();
            return c1740Ox.toString();
        } catch (Exception unused) {
            return A022;
        }
    }

    public static boolean A08(X4 x4) {
        String middle = x4.A02();
        if (middle == null) {
            return false;
        }
        boolean A0A = A0A(middle);
        if (A01[7].charAt(20) == 'o') {
            throw new RuntimeException();
        }
        A01[2] = "GqDFUg33w18rdOydcZHrPduzmWx6ZxUu";
        if (A0A) {
            return true;
        }
        for (String str : x4.A01()) {
            if (A01[2].charAt(10) != '8') {
                if (A0A(str)) {
                    return true;
                }
            } else {
                String[] strArr = A01;
                strArr[5] = "ZCUrIEQiGOY9U2nVCEFSNgqRdbKvDffQ";
                strArr[0] = "2Hs1eEyuwWDgIwWONAgBlK6IqUqjA257";
                if (A0A(str)) {
                    return true;
                }
            }
        }
        Iterator<String> it = x4.A00().iterator();
        while (it.hasNext()) {
            if (A0A(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean A0A(String str) {
        return str.contains(A02(43, 16, 2));
    }
}
