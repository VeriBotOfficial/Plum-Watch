package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.ll, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2717ll {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 87);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{BuiltinOptions.NonMaxSuppressionV5Options, 35, BuiltinOptions.ExpOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.SelectOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.NonMaxSuppressionV5Options, 34, BuiltinOptions.CastOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.LessEqualOptions, BuiltinOptions.CastOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.ExpOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.LessOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.CastOptions, BuiltinOptions.NonMaxSuppressionV5Options, 34, BuiltinOptions.EqualOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.ShapeOptions, BuiltinOptions.ExpOptions, BuiltinOptions.TileOptions, BuiltinOptions.ATan2Options, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.PadV2Options, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.ATan2Options, BuiltinOptions.ATan2Options, 0, 1, BuiltinOptions.AbsOptions, 13, 15, 2, 2, 29, BuiltinOptions.AbsOptions, 26, 1, BuiltinOptions.AbsOptions, 0, 11, 22, 26, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.AbsOptions, 29, 7, 0, 13, 11, BuiltinOptions.AbsOptions, 26, 6, 11, BuiltinOptions.AbsOptions, 2, 15, 29, 26, BuiltinOptions.AbsOptions, 13, 15, 2, 2, BuiltinOptions.AbsOptions, 26, 1, BuiltinOptions.AbsOptions, 28, 11, 3, 1, 24, 11, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, 10, 17, 8, 8, BuiltinOptions.FillOptions, 15, 1, 29, BuiltinOptions.FillOptions, 13, 10, BuiltinOptions.FillOptions, 1, 10, 16, 22, 29, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.FillOptions, 10, 17, 8, 8, BuiltinOptions.QuantizeOptions, 31, 4, 29, 29, BuiltinOptions.ReverseV2Options, 7, 16, 29, 4, 20, BuiltinOptions.ReverseV2Options, 24, 31, BuiltinOptions.ReverseV2Options, 20, 31, 5, 3, 8, BuiltinOptions.LeakyReluOptions, BuiltinOptions.ReverseV2Options};
    }

    public static int A00(int value, String name) {
        if (value >= 0) {
            return value;
        }
        throw new IllegalArgumentException(name + A01(0, 29, 23) + value);
    }

    public static void A03(Object key, Object value) {
        if (key != null) {
            if (value != null) {
                return;
            } else {
                throw new NullPointerException(A01(108, 21, 38) + key + A01(29, 5, 65));
            }
        }
        throw new NullPointerException(A01(84, 24, 51) + value);
    }

    public static void A04(boolean canRemove) {
        AbstractC2570jA.A0F(canRemove, A01(34, 50, 57));
    }
}
