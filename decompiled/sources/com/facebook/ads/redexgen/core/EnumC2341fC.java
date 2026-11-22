package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.Locale;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.fC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC2341fC {
    A03(A01(37, 3, 126)),
    A04(A01(40, 7, 55));

    public static byte[] A01;
    public String A00;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 117);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{BuiltinOptions.SliceOptions, BuiltinOptions.SparseToDenseOptions, 58, BuiltinOptions.HashtableFindOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.FillOptions, BuiltinOptions.RangeOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.FloorDivOptions, 5, BuiltinOptions.RankOptions, 64, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.GatherNdOptions, 64, BuiltinOptions.ReverseSequenceOptions, 5, BuiltinOptions.ReverseSequenceOptions, 64, BuiltinOptions.RankOptions, BuiltinOptions.WhereOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.RankOptions, 64, 31, 5, 0, BuiltinOptions.RankOptions, BuiltinOptions.TileOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.LessOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.ShapeOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.LessOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.EqualOptions, BuiltinOptions.GreaterOptions};
    }

    static {
        A02();
    }

    EnumC2341fC(String str) {
        this.A00 = str;
    }

    public static EnumC2341fC A00(String str) {
        for (EnumC2341fC enumC2341fC : values()) {
            if (enumC2341fC.A00.equals(str)) {
                return enumC2341fC;
            }
        }
        throw new IllegalArgumentException(String.format(Locale.US, A01(3, 27, 80), str));
    }
}
