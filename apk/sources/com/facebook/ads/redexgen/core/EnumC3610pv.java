package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum EnumC3610pv {
    A02,
    A03,
    A04;

    public static byte[] A00;

    public static String A00(int r2, int r3, int r4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, r2, r2 + r3);
        for (int r1 = 0; r1 < bArrCopyOfRange.length; r1++) {
            bArrCopyOfRange[r1] = (byte) ((bArrCopyOfRange[r1] ^ r4) ^ 98);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{BuiltinOptions.SplitVOptions, BuiltinOptions.FillOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.FillOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.FillOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.AddNOptions, BuiltinOptions.WhereOptions, BuiltinOptions.FillOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.FillOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.RandomOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.BatchMatMulOptions, 14, 21, 9, 30, 28, 18, 8, 15, 30, 9, 30, 31};
    }

    static {
        A01();
    }
}
