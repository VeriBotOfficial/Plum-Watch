package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.pv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC2953pv {
    A02,
    A03,
    A04;

    public static byte[] A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 98);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{BuiltinOptions.SplitVOptions, BuiltinOptions.FillOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.FillOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.FillOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.AddNOptions, BuiltinOptions.WhereOptions, BuiltinOptions.FillOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.FillOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.RandomOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.BatchMatMulOptions, 14, 21, 9, 30, 28, 18, 8, 15, 30, 9, 30, 31};
    }

    static {
        A01();
    }
}
