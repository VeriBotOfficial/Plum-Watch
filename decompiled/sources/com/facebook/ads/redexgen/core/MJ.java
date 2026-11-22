package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Locale;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public enum MJ {
    A03,
    A02,
    A04;

    public static byte[] A00;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 36);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{BuiltinOptions.FillOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.RangeOptions, 31, 30, 31, 20, BuiltinOptions.RandomOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.RandomOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.UnsortedSegmentMinOptions};
    }

    static {
        A02();
    }

    public static MJ A00(String str) {
        if (TextUtils.isEmpty(str)) {
            return A03;
        }
        try {
            return valueOf(str.toUpperCase(Locale.US));
        } catch (IllegalArgumentException unused) {
            return A03;
        }
    }
}
