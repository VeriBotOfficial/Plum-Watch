package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.Locale;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum EnumC3032fC {
    A03(A01(37, 3, 126)),
    A04(A01(40, 7, 55));

    public static byte[] A01;
    public String A00;

    public static String A01(int r2, int r3, int r4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, r2, r2 + r3);
        for (int r1 = 0; r1 < bArrCopyOfRange.length; r1++) {
            bArrCopyOfRange[r1] = (byte) ((bArrCopyOfRange[r1] ^ r4) ^ 117);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{BuiltinOptions.SliceOptions, BuiltinOptions.SparseToDenseOptions, 58, BuiltinOptions.HashtableFindOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.FillOptions, BuiltinOptions.RangeOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.FloorDivOptions, 5, BuiltinOptions.RankOptions, 64, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.GatherNdOptions, 64, BuiltinOptions.ReverseSequenceOptions, 5, BuiltinOptions.ReverseSequenceOptions, 64, BuiltinOptions.RankOptions, BuiltinOptions.WhereOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.RankOptions, 64, 31, 5, 0, BuiltinOptions.RankOptions, BuiltinOptions.TileOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.LessOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.ShapeOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.LessOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.EqualOptions, BuiltinOptions.GreaterOptions};
    }

    static {
        A02();
    }

    EnumC3032fC(String str) {
        this.A00 = str;
    }

    public static EnumC3032fC A00(String str) {
        for (EnumC3032fC enumC3032fC : values()) {
            if (enumC3032fC.A00.equals(str)) {
                return enumC3032fC;
            }
        }
        throw new IllegalArgumentException(String.format(Locale.US, A01(3, 27, 80), str));
    }
}
