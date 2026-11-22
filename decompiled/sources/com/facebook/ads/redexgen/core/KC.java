package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.regex.Pattern;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public abstract class KC {
    public static byte[] A00;
    public static String[] A01 = {"rzG5nsHyiLOWX8UOWspYPJE0qk8", "zzN7h9kZ1110Ms84Vk8TxNIxLbkfn1bs", "Ea1csqz6uGTsOrOcIglVsCF", "HzbrV2YdC0QyP2mr3Tf3UtzOp", "wDtYJLWcmo8biPQhT7PXhiXa0nvGQfME", "EfdNeKI6mNZbvmHLu3zFEqD29", "z9B2Nu2EMki8SlMmHuJ5tm0bMARcwAxE", "Vyy1RSqHmZDwxzuj6K"};
    public static final Pattern A02;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 7);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{BuiltinOptions.BucketizeOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.SliceOptions, 13, 5, 16, 22, 1, 16, 17, BuiltinOptions.WhereOptions, 34, BuiltinOptions.SliceOptions, BuiltinOptions.ShapeOptions, 35, BuiltinOptions.ExpOptions, BuiltinOptions.ExpOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.WhereOptions, BuiltinOptions.SparseToDenseOptions, 26, 1, BuiltinOptions.WhereOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.HashtableSizeOptions, Byte.MAX_VALUE, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.RandomOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.SignOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.RandomOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.GeluOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.SquareOptions, BuiltinOptions.RankOptions, BuiltinOptions.CosOptions, BuiltinOptions.CosOptions, BuiltinOptions.UnsortedSegmentSumOptions, 11, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.HardSwishOptions, 64, BuiltinOptions.ReverseV2Options, BuiltinOptions.LogicalOrOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.ExpandDimsOptions, 29, BuiltinOptions.RangeOptions, 58, BuiltinOptions.LogicalAndOptions, 61, BuiltinOptions.PadV2Options, BuiltinOptions.SliceOptions};
    }

    static {
        A03();
        A02 = Pattern.compile(A02(58, 15, 19));
    }

    public static float A00(String str) throws NumberFormatException {
        if (str.endsWith(A02(0, 1, 81))) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException(A02(23, 27, 27));
    }

    public static long A01(String str) throws NumberFormatException {
        long j = 0;
        String[] subparts = AbstractC12174a.A1P(str, A02(56, 2, 34));
        for (String str2 : AbstractC12174a.A1O(subparts[0], A02(1, 1, 81))) {
            long j2 = 60 * j;
            if (A01[0].length() != 27) {
                throw new RuntimeException();
            }
            String[] parts = A01;
            parts[2] = "6AHxBA9eqgTuoeEClHZkEfjq11VkmmF";
            long value = Long.parseLong(str2);
            j = j2 + value;
        }
        long j3 = j * 1000;
        if (subparts.length == 2) {
            long value2 = Long.parseLong(subparts[1]);
            j3 += value2;
        }
        return 1000 * j3;
    }

    public static void A04(C4J c4j) throws C11732i {
        int A09 = c4j.A09();
        if (A05(c4j)) {
            return;
        }
        c4j.A0f(A09);
        throw C11732i.A01(A02(2, 21, 114) + c4j.A0T(), null);
    }

    public static boolean A05(C4J c4j) {
        String A0T = c4j.A0T();
        if (A0T != null) {
            String line = A02(50, 6, 7);
            if (A0T.startsWith(line)) {
                return true;
            }
        }
        return false;
    }
}
