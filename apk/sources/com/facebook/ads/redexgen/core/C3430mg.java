package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3430mg {
    public static byte[] A03;
    public final Object A00;
    public final Object A01;
    public final Object A02;

    static {
        A01();
    }

    public static String A00(int r2, int r3, int r4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, r2, r2 + r3);
        for (int r1 = 0; r1 < bArrCopyOfRange.length; r1++) {
            bArrCopyOfRange[r1] = (byte) ((bArrCopyOfRange[r1] ^ r4) ^ 78);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{25, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.WhileOptions, 25, BuiltinOptions.WhereOptions, BuiltinOptions.RangeOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.GeluOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.LogSoftmaxOptions};
    }

    public C3430mg(Object key, Object value1, Object value2) {
        this.A00 = key;
        this.A01 = value1;
        this.A02 = value2;
    }

    public final IllegalArgumentException A02() {
        StringBuilder sbAppend = new StringBuilder().append(A00(6, 32, 74)).append(this.A00);
        String strA00 = A00(5, 1, 38);
        return new IllegalArgumentException(sbAppend.append(strA00).append(this.A01).append(A00(0, 5, 119)).append(this.A00).append(strA00).append(this.A02).toString());
    }
}
