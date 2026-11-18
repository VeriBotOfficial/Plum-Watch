package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Locale;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: assets/audience_network.dex */
public enum MJ {
    A03,
    A02,
    A04;

    public static byte[] A00;

    public static String A01(int r2, int r3, int r4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, r2, r2 + r3);
        for (int r1 = 0; r1 < bArrCopyOfRange.length; r1++) {
            bArrCopyOfRange[r1] = (byte) ((bArrCopyOfRange[r1] ^ r4) ^ 36);
        }
        return new String(bArrCopyOfRange);
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
