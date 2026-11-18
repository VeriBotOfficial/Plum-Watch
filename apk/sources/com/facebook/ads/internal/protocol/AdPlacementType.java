package com.facebook.ads.internal.protocol;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Locale;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: assets/audience_network.dex */
public enum AdPlacementType {
    BANNER(A00(74, 6, 36)),
    MEDIUM_RECTANGLE(A00(92, 16, 88)),
    INTERSTITIAL(A00(80, 12, 40)),
    NATIVE(A00(108, 6, 13)),
    NATIVE_BANNER(A00(114, 13, 119)),
    REWARDED_VIDEO(A00(127, 14, 85)),
    UNKNOWN(A00(141, 7, 17));

    public static byte[] A01;
    public static String[] A02 = {"CWC1iyAzuHCyWu1B0SYAHTA3miIxyRDu", "FO468KlqU7YYiE83Le7T5pQKY2foYhCa", "4lSmmc8pBcjbV0on62ZikVJFYVLsdMQp", "9H0k66zkYNaHG7pLFG5T73JVLywfdj", "IkTzUK68woTPnHHBk", "q5XpLTEZbHtnyzZXCKIvrGbFL2My8Wb0", "rdQ7fJEKRbVHtvxpiCxMwn5qtJ9qGM1n", "xGvuYGSPJhOX4"};
    public String A00;

    public static String A00(int r4, int r5, int r6) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, r4, r4 + r5);
        int r7 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A02[6].charAt(3) != '7') {
                throw new RuntimeException();
            }
            A02[7] = "CTk8rnXs6cBCh";
            if (r7 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[r7] = (byte) ((bArrCopyOfRange[r7] - r6) - 127);
            r7++;
        }
    }

    public static void A01() {
        A01 = new byte[]{-35, -36, -23, -23, -32, -19, -49, -44, -38, -53, -40, -39, -38, -49, -38, -49, -57, -46, 23, 15, 14, 19, 31, 23, BuiltinOptions.LessOptions, 28, 15, 13, 30, 11, 24, 17, 22, 15, -33, -46, -27, -38, -25, -42, -13, -26, -7, -18, -5, -22, 4, -25, -26, -13, -13, -22, -9, BuiltinOptions.GreaterOptions, 31, BuiltinOptions.TransposeConvOptions, 27, BuiltinOptions.GreaterOptions, 30, 31, 30, BuiltinOptions.ArgMinOptions, BuiltinOptions.SliceOptions, 35, 30, 31, BuiltinOptions.LessOptions, 16, 9, 6, 9, 10, 18, 9, 5, 4, 17, 17, 8, 21, 16, 21, 27, 12, 25, 26, 27, 16, 27, 16, 8, 19, BuiltinOptions.FillOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.PackOptions, 64, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.FillOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.RangeOptions, BuiltinOptions.LogicalOrOptions, 58, BuiltinOptions.LeakyReluOptions, BuiltinOptions.PowOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.LogicalOrOptions, -6, -19, 0, -11, 2, -15, BuiltinOptions.SegmentSumOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.HashtableFindOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.WhereOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.EqualOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.PowOptions, BuiltinOptions.TileOptions, BuiltinOptions.ResizeNearestNeighborOptions, 61, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.ZerosLikeOptions, 5, -2, -5, -2, -1, 7, -2};
    }

    static {
        A01();
    }

    AdPlacementType(String str) {
        this.A00 = str;
    }

    public static AdPlacementType fromString(String str) {
        if (TextUtils.isEmpty(str)) {
            return UNKNOWN;
        }
        try {
            return valueOf(str.toUpperCase(Locale.US));
        } catch (Exception unused) {
            return UNKNOWN;
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.A00;
    }
}
