package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public abstract class VZ {
    public static byte[] A00;
    public static final AtomicReference<String> A01;
    public static final AtomicReference<String> A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 54);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A00 = new byte[]{31, 34, BuiltinOptions.PackOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.PowOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.ArgMinOptions, 61, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.ExpandDimsOptions, 58, BuiltinOptions.ExpandDimsOptions, 61, BuiltinOptions.LogicalOrOptions, 34, BuiltinOptions.VarHandleOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.RightShiftOptions, 11, BuiltinOptions.BidirectionalSequenceLSTMOptions, 64, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.SignOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.ZerosLikeOptions, 11, BuiltinOptions.RandomOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.TileOptions, BuiltinOptions.NegOptions, 2, BuiltinOptions.LessEqualOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.TileOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.GeluOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.IfOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.CallOnceOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.IfOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.HashtableFindOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.CastOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.ArgMinOptions, 61, BuiltinOptions.LogicalAndOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.SelectV2Options, BuiltinOptions.NegOptions, 63, BuiltinOptions.GreaterOptions, 61, BuiltinOptions.CastOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.PadV2Options, BuiltinOptions.GreaterOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.SelectOptions, 34, 34, BuiltinOptions.DequantizeOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.LessEqualOptions, 34, 32, BuiltinOptions.ReverseV2Options, BuiltinOptions.MirrorPadOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.RangeOptions, BuiltinOptions.ResizeNearestNeighborOptions, 3, 22, 22, BuiltinOptions.AbsOptions, BuiltinOptions.AbsOptions, BuiltinOptions.AbsOptions, 28, BuiltinOptions.ResizeNearestNeighborOptions, 23, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.IfOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.RankOptions, BuiltinOptions.RankOptions, BuiltinOptions.AddNOptions, 23, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.RankOptions, BuiltinOptions.CosOptions, 14, 14, 14};
    }

    static {
        A09();
        A01 = new AtomicReference<>();
        A02 = new AtomicReference<>();
    }

    public static String A01(SQ sq) {
        return A05(sq) + A00(47, 19, 53);
    }

    public static String A02(SQ sq) {
        String loggingEndpointPrefix = U7.A0X(sq);
        StringBuilder append = new StringBuilder().append(A07(sq, loggingEndpointPrefix));
        String loggingEndpointPrefix2 = A00(22, 14, 18);
        return append.append(loggingEndpointPrefix2).toString();
    }

    public static String A03(SQ sq) {
        return A05(sq) + A00(1, 21, 59);
    }

    public static String A04(SQ sq) {
        String syncEndpointPrefix = U7.A0Y(sq);
        StringBuilder append = new StringBuilder().append(A07(sq, syncEndpointPrefix));
        String syncEndpointPrefix2 = A00(36, 11, 107);
        return append.append(syncEndpointPrefix2).toString();
    }

    public static String A05(SQ sq) {
        String str = A01.get();
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String urlOverride = A00(66, 28, 123);
        return A06(sq, urlOverride);
    }

    public static String A06(SQ sq, String str) {
        String sb;
        String A9I = sq.A05().A9I();
        Locale locale = Locale.US;
        if (TextUtils.isEmpty(A9I)) {
            sb = A00(0, 0, 61);
        } else {
            StringBuilder sb2 = new StringBuilder();
            String prefix = A00(0, 1, 7);
            sb = sb2.append(prefix).append(A9I).toString();
        }
        String prefix2 = String.format(locale, str, sb);
        return prefix2;
    }

    public static String A07(SQ sq, String str) {
        String str2 = A02.get();
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        String urlOverride = A00(94, 26, 15);
        return A08(A06(sq, urlOverride), str);
    }

    public static String A08(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        return str.replace(A00(120, 3, 79), str2);
    }
}
