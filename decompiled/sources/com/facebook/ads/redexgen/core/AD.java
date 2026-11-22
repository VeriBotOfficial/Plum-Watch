package com.facebook.ads.redexgen.core;

import com.google.common.primitives.ElementTypesAreNonnullByDefault;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.tensorflow.lite.schema.BuiltinOptions;

@ElementTypesAreNonnullByDefault
/* loaded from: assets/audience_network.dex */
public abstract class AD extends AbstractC2962q8 {
    public static byte[] A00;
    public static String[] A01 = {"siq85GDJwTeYE", "hCeAcOWL38esGxpCGhAcOByVvpt4rkG9", "m2sukptzj10OlAU9Tp5GtC3mJBPhtf8e", "xjjTaPx7kc7NMEZNqBPsTeRSC2dGu2kw", "w", "lzhISLab9GK0zTqogctfE75BYP1X9oPw", "tkIGufAtpO8Bl63czpB", ""};

    public static String A09(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = copyOfRange[i4] ^ i3;
            if (A01[7].length() != 0) {
                throw new RuntimeException();
            }
            A01[7] = "";
            copyOfRange[i4] = (byte) (i5 ^ 72);
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A00 = new byte[]{BuiltinOptions.GreaterOptions, 22, 23, BuiltinOptions.ZerosLikeOptions, 12, 5, BuiltinOptions.ZerosLikeOptions, 17, 2, 13, 4, 6, BuiltinOptions.QuantizeOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, 16, BuiltinOptions.RightShiftOptions, BuiltinOptions.ATan2Options, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.TileOptions, BuiltinOptions.PackOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.NonMaxSuppressionV5Options, 58, BuiltinOptions.TileOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.CallOnceOptions, BuiltinOptions.TileOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.TileOptions, Byte.MAX_VALUE, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.TileOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.SignOptions, BuiltinOptions.RandomOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.TileOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.TileOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.CumsumOptions, BuiltinOptions.RandomOptions, Byte.MAX_VALUE, BuiltinOptions.TileOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.TileOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.RandomOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.TileOptions, BuiltinOptions.PackOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.NonMaxSuppressionV5Options, 58};
    }

    static {
        A0B();
    }

    public static int A00(int value) {
        return value;
    }

    public static int A01(int a2, int b) {
        if (a2 < b) {
            return -1;
        }
        return a2 > b ? 1 : 0;
    }

    public static int A02(int value, int min, int max) {
        AbstractC2570jA.A0G(min <= max, A09(16, 47, 91), min, max);
        return Math.min(Math.max(value, min), max);
    }

    public static int A03(long value) {
        int i = (int) value;
        AbstractC2570jA.A0H(((long) i) == value, A09(0, 16, 43), value);
        return i;
    }

    public static int A04(long value) {
        if (value <= 2147483647L) {
            if (value < -2147483648L) {
                return Integer.MIN_VALUE;
            }
            return (int) value;
        }
        if (A01[7].length() != 0) {
            throw new RuntimeException();
        }
        A01[1] = "nVSCb9uBdS4Z5srNqmAxsZ9hxFd1bctQ";
        return Integer.MAX_VALUE;
    }

    public static int A05(int[] array, int target, int start, int end) {
        while (start < end) {
            int i = array[start];
            if (i == target) {
                return start;
            }
            start++;
        }
        return -1;
    }

    public static int A06(int[] array, int target, int start, int end) {
        for (int i = end - 1; i >= start; i--) {
            int i2 = array[i];
            if (i2 == target) {
                return i;
            }
        }
        return -1;
    }

    public static List<Integer> A0A(int... backingArray) {
        if (backingArray.length == 0) {
            return Collections.emptyList();
        }
        return new C2963q9(backingArray);
    }

    public static int[] A0C(Collection<? extends Number> collection) {
        if (collection instanceof C2963q9) {
            return ((C2963q9) collection).A04();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        int len = A01[1].charAt(22);
        if (len == 108) {
            throw new RuntimeException();
        }
        A01[1] = "hGECTcBTlZrQNB5F5BgF8ddu5i2bV8V4";
        for (int i = 0; i < length; i++) {
            int len2 = ((Number) AbstractC2570jA.A04(array[i])).intValue();
            iArr[i] = len2;
        }
        return iArr;
    }
}
