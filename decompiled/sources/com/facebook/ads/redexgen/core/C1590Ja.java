package com.facebook.ads.redexgen.core;

import android.graphics.Color;
import android.text.TextUtils;
import java.util.Arrays;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.Ja, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1590Ja {
    public static byte[] A0A;
    public static String[] A0B = {"6HehIsk5UTdQ8YwGLZ8u", "HAdSfToap9UtbNGqUYR7rfHJagkNK6YB", "nRaQRY6nAt4CmU7uet6FlSe17FvhWZYJ", "8IXD4Lb5", "pveGGnyGJyzGs1AN", "NjeHfVTmziUN3gQJJf", "25ItPJi0PU1GUlSkVtogtpFEj7NyufcW", "xHU94vBDrMO8JpAh"};
    public final float A00;
    public final int A01;
    public final int A02;
    public final Integer A03;
    public final Integer A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 89);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0A = new byte[]{BuiltinOptions.SelectOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.ShapeOptions, 18, BuiltinOptions.EqualOptions, 61, BuiltinOptions.PowOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SliceOptions, BuiltinOptions.GeluOptions, 32, BuiltinOptions.PackOptions, BuiltinOptions.GeluOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.EqualOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.GeluOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.PackOptions, BuiltinOptions.PackOptions, BuiltinOptions.PowOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.EqualOptions, 58, BuiltinOptions.GeluOptions, 34, BuiltinOptions.EqualOptions, BuiltinOptions.PowOptions, BuiltinOptions.ExpOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.GeluOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.DequantizeOptions, 1, 9, 12, 5, 4, 64, 20, 15, 64, 16, 1, 18, 19, 5, 64, 3, 15, 12, 15, 18, 64, 5, 24, 16, 18, 5, 19, 19, 9, 15, 14, BuiltinOptions.MatrixSetDiagOptions, 64, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.SquareOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, 3, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.SquaredDifferenceOptions, 3, BuiltinOptions.GatherNdOptions, BuiltinOptions.SquareOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.UniqueOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, 3, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.ReverseSequenceOptions, 3, BuiltinOptions.UniqueOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, 25, 3, 4, BuiltinOptions.MirrorPadOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.ScatterNdOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.SquareOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.FillOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.ResizeNearestNeighborOptions, 13, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.SquareOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.ZerosLikeOptions, 13, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.FillOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.ZerosLikeOptions, 64, BuiltinOptions.FloorModOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.QuantizeOptions, 23, 13, BuiltinOptions.UnsortedSegmentMinOptions, 64, BuiltinOptions.SquareOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.SquareOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.SquaredDifferenceOptions, 11, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.FillOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.AbsOptions, BuiltinOptions.SplitVOptions, 11, 12, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.AddNOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.AbsOptions, 17, 12, 11, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.SquareOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.AbsOptions, 11, 3, BuiltinOptions.AbsOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.AbsOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.AbsOptions, BuiltinOptions.SplitVOptions, 11, 14, BuiltinOptions.MatrixDiagOptions, 11, BuiltinOptions.WhileOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.AbsOptions, BuiltinOptions.MatrixDiagOptions, 7, 11, BuiltinOptions.MirrorPadOptions, BuiltinOptions.FillOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.SplitVOptions, 11, 14, BuiltinOptions.MatrixDiagOptions, 2, 17, 11, 12, 14, BuiltinOptions.MatrixDiagOptions, 12, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.CallOnceOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.LessOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.SignOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.LessOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.TileOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.LessOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.CallOnceOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.TileOptions, BuiltinOptions.LessOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.ATan2Options, BuiltinOptions.BroadcastToOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.PowOptions, 31, 18, 7, 14, BuiltinOptions.ReverseV2Options};
    }

    static {
        A07();
    }

    public C1590Ja(String str, int i, Integer num, Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.A05 = str;
        this.A01 = i;
        this.A04 = num;
        this.A03 = num2;
        this.A00 = f;
        this.A06 = z;
        this.A07 = z2;
        this.A09 = z3;
        this.A08 = z4;
        this.A02 = i2;
    }

    public static float A00(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e) {
            AnonymousClass44.A0A(A06(261, 8, 80), A06(71, 28, 122) + str + A06(2, 1, 8), e);
            return -3.4028235E38f;
        }
    }

    public static int A01(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (A08(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        AnonymousClass44.A07(A06(261, 8, 80), A06(129, 28, 116) + str);
        return -1;
    }

    public static int A02(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (A09(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        AnonymousClass44.A07(A06(261, 8, 80), A06(99, 30, 93) + str);
        return -1;
    }

    public static C1590Ja A04(String str, JW jw) {
        int i;
        Integer num;
        Integer num2;
        float f;
        String A06 = A06(269, 6, 50);
        C3M.A07(str.startsWith(A06));
        String[] split = TextUtils.split(str.substring(A06.length()), A06(3, 1, 66));
        int length = split.length;
        int i2 = jw.A05;
        String A062 = A06(261, 8, 80);
        if (length != i2) {
            AnonymousClass44.A07(A062, AbstractC12174a.A0n(A06(157, 69, 114), Integer.valueOf(jw.A05), Integer.valueOf(split.length), str));
            return null;
        }
        try {
            String trim = split[jw.A06].trim();
            if (jw.A00 != -1) {
                i = A01(split[jw.A00].trim());
            } else {
                i = -1;
            }
            if (jw.A08 != -1) {
                num = A05(split[jw.A08].trim());
            } else {
                num = null;
            }
            if (jw.A07 != -1) {
                num2 = A05(split[jw.A07].trim());
            } else {
                num2 = null;
            }
            if (jw.A03 != -1) {
                f = A00(split[jw.A03].trim());
            } else {
                f = -3.4028235E38f;
            }
            return new C1590Ja(trim, i, num, num2, f, jw.A01 != -1 && A0A(split[jw.A01].trim()), jw.A04 != -1 && A0A(split[jw.A04].trim()), jw.A0A != -1 && A0A(split[jw.A0A].trim()), jw.A09 != -1 && A0A(split[jw.A09].trim()), jw.A02 != -1 ? A02(split[jw.A02].trim()) : -1);
        } catch (RuntimeException e) {
            AnonymousClass44.A0A(A062, A06(226, 35, 80) + str + A06(2, 1, 8), e);
            return null;
        }
    }

    public static Integer A05(String str) {
        long parseLong;
        try {
            if (str.startsWith(A06(0, 2, 80))) {
                parseLong = Long.parseLong(str.substring(2), 16);
            } else {
                parseLong = Long.parseLong(str);
            }
            C3M.A07(parseLong <= BodyPartID.bodyIdMax);
            int A03 = AD.A03(((parseLong >> 24) & 255) ^ 255);
            int A032 = AD.A03((parseLong >> 16) & 255);
            int b = AD.A03((parseLong >> 8) & 255);
            int a2 = AD.A03(parseLong & 255);
            return Integer.valueOf(Color.argb(A03, a2, b, A032));
        } catch (IllegalArgumentException e) {
            AnonymousClass44.A0A(A06(261, 8, 80), A06(36, 35, 57) + str + A06(2, 1, 8), e);
            return null;
        }
    }

    public static boolean A08(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    public static boolean A09(int i) {
        switch (i) {
            case 1:
            case 3:
                return true;
            case 2:
            default:
                String[] strArr = A0B;
                if (strArr[7].length() != strArr[4].length()) {
                    throw new RuntimeException();
                }
                A0B[6] = "OxYydzu443viAUiIiorbVSFSlAhvbuco";
                return false;
        }
    }

    public static boolean A0A(String str) {
        try {
            int value = Integer.parseInt(str);
            return value == 1 || value == -1;
        } catch (NumberFormatException e) {
            AnonymousClass44.A0A(A06(261, 8, 80), A06(4, 32, 13) + str + A06(2, 1, 8), e);
            return false;
        }
    }
}
