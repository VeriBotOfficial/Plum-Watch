package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.Locale;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum EnumC3045fP {
    A03(A01(35, 4, 16)),
    A04(A01(39, 4, 41));

    public static byte[] A01;
    public String A00;

    public static String A01(int r2, int r3, int r4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, r2, r2 + r3);
        for (int r1 = 0; r1 < bArrCopyOfRange.length; r1++) {
            bArrCopyOfRange[r1] = (byte) ((bArrCopyOfRange[r1] ^ r4) ^ 24);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{BuiltinOptions.BitwiseXorOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.FillOptions, BuiltinOptions.IfOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.AbsOptions, 10, BuiltinOptions.QuantizeOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.IfOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.MatrixDiagOptions, 10, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.FillOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.SplitVOptions, 16, 10, 15, BuiltinOptions.QuantizeOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.TileOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.CosOptions, BuiltinOptions.CosOptions, BuiltinOptions.FloorDivOptions};
    }

    static {
        A02();
    }

    EnumC3045fP(String str) {
        this.A00 = str;
    }

    public static EnumC3045fP A00(String str) {
        for (EnumC3045fP enumC3045fP : values()) {
            if (enumC3045fP.A00.equals(str)) {
                return enumC3045fP;
            }
        }
        throw new IllegalArgumentException(String.format(Locale.US, A01(4, 27, 50), str));
    }
}
