package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.Locale;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.fP, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC2354fP {
    A03(A01(35, 4, 16)),
    A04(A01(39, 4, 41));

    public static byte[] A01;
    public String A00;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 24);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{BuiltinOptions.BitwiseXorOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.FillOptions, BuiltinOptions.IfOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.AbsOptions, 10, BuiltinOptions.QuantizeOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.IfOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.MatrixDiagOptions, 10, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.FillOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.SplitVOptions, 16, 10, 15, BuiltinOptions.QuantizeOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.TileOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.CosOptions, BuiltinOptions.CosOptions, BuiltinOptions.FloorDivOptions};
    }

    static {
        A02();
    }

    EnumC2354fP(String str) {
        this.A00 = str;
    }

    public static EnumC2354fP A00(String str) {
        for (EnumC2354fP enumC2354fP : values()) {
            if (enumC2354fP.A00.equals(str)) {
                return enumC2354fP;
            }
        }
        throw new IllegalArgumentException(String.format(Locale.US, A01(4, 27, 50), str));
    }
}
