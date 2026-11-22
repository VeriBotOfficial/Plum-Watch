package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public abstract class VQ {
    public static Map<String, Long> A00;
    public static Map<String, Long> A01;
    public static Map<String, String> A02;
    public static boolean A03;
    public static byte[] A04;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 88);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A04 = new byte[]{BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.NotEqualOptions, Byte.MAX_VALUE, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.NotEqualOptions, Byte.MAX_VALUE, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.ExpOptions, Byte.MAX_VALUE, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.ExpOptions, Byte.MAX_VALUE, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.ExpOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.WhereOptions, 3, 1, BuiltinOptions.AddNOptions, BuiltinOptions.AddNOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.CosOptions, 11, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.SliceOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.SparseToDenseOptions, 63, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.NegOptions, BuiltinOptions.RightShiftOptions, 63, 58, BuiltinOptions.RightShiftOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.PackOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SliceOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.PackOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.AddNOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.WhereOptions, BuiltinOptions.AddNOptions, BuiltinOptions.GeluOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.WhereOptions, BuiltinOptions.RankOptions, BuiltinOptions.RangeOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.WhereOptions, BuiltinOptions.ZerosLikeOptions};
    }

    static {
        A04();
        A01 = new ConcurrentHashMap();
        A00 = new ConcurrentHashMap();
        A02 = new ConcurrentHashMap();
        A03 = false;
    }

    public static long A00(String str, V6 v6) {
        if (A01.containsKey(str)) {
            return A01.get(str).longValue();
        }
        switch (v6) {
            case A0E:
            case A0F:
            case A0G:
            case A0D:
                return 15000L;
            default:
                return -1000L;
        }
    }

    public static String A02(VR vr) {
        VF.A05(A01(44, 15, 126), A01(22, 22, 6), A01(14, 8, 61));
        return A02.get(A03(vr));
    }

    public static String A03(VR vr) {
        return String.format(Locale.US, A01(0, 14, 29), vr.A09(), vr.A07(), Integer.valueOf(vr.A08() == null ? 0 : vr.A08().A00()), Integer.valueOf(vr.A08() == null ? 0 : vr.A08().A01()), Integer.valueOf(vr.A04()));
    }

    public static void A05(long j, VR vr) {
        A01.put(A03(vr), Long.valueOf(j));
    }

    public static void A06(VR vr) {
        A00.put(A03(vr), Long.valueOf(System.currentTimeMillis()));
    }

    public static void A07(String str, VR vr) {
        A02.put(A03(vr), str);
    }

    public static boolean A08(VR vr) {
        if (A03) {
            return false;
        }
        String A032 = A03(vr);
        if (A00.containsKey(A032)) {
            return System.currentTimeMillis() - A00.get(A032).longValue() < A00(A032, vr.A07());
        }
        return false;
    }
}
