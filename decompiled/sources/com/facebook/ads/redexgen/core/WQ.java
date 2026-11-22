package com.facebook.ads.redexgen.core;

import android.net.Uri;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.Locale;
import org.apache.commons.net.telnet.TelnetCommand;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public abstract class WQ {
    public static byte[] A00;
    public static String[] A01 = {"h7TbtU4Y3aavuK2RNDrR490o97xA3UQR", "nWlFT6gMh83RN55hOK2s7jkd0", "m7AJmaDY7", "gyeYb9LWXFqsSrKIVSRt0Co29LGYuhaR", "EW8hQNBuni4zfziLp651zBZrhIaSPPe", "twQOenmklhEl", "GklYvNYuNnGVP8xhiRThcatIgfshVE", "s31M0lMjYrtgq4OJcDKBiGgiocxpngd"};

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 121);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A00 = new byte[]{12, Byte.MAX_VALUE, BuiltinOptions.BidirectionalSequenceLSTMOptions, 9, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.BatchMatMulOptions, 9, BuiltinOptions.RightShiftOptions, BuiltinOptions.UnsortedSegmentSumOptions, Byte.MAX_VALUE, BuiltinOptions.BidirectionalSequenceLSTMOptions, 9, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.BatchMatMulOptions, 9, BuiltinOptions.RightShiftOptions, 20, 9, 29, 15, 10, 9, BuiltinOptions.UnsortedSegmentSumOptions, 14, 13, 27, BuiltinOptions.ReadVariableOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.AddNOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.RangeOptions, BuiltinOptions.AbsOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, 0, BuiltinOptions.WhereOptions, BuiltinOptions.AddNOptions, BuiltinOptions.SquaredDifferenceOptions, 0, 5, BuiltinOptions.GatherNdOptions, 0, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.WhereOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.FillOptions, 0, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.CosOptions, BuiltinOptions.RangeOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.AbsOptions, 26, 0, 5, BuiltinOptions.GatherNdOptions, 14, BuiltinOptions.ShapeOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.CosOptions, BuiltinOptions.ZerosLikeOptions, 2, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.LeakyReluOptions, 2, 0, 7, BuiltinOptions.ReverseV2Options, 0, 2, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.RankOptions, 2, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.AbsOptions, 2, BuiltinOptions.RankOptions, BuiltinOptions.MirrorPadOptions, 2, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, 2, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.LeakyReluOptions, 2, 0, 7, BuiltinOptions.ReverseV2Options, 0, 12, 2, BuiltinOptions.CumsumOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, 64, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, 2, BuiltinOptions.LeakyReluOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.FillOptions, BuiltinOptions.MirrorPadOptions, 24, 2, 7, BuiltinOptions.ReverseV2Options, 12, 2, BuiltinOptions.HashtableImportOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.AbsOptions, 2, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.LeakyReluOptions, 24, 2, 7, BuiltinOptions.ReverseV2Options, BuiltinOptions.GeluOptions, Byte.MAX_VALUE, BuiltinOptions.BroadcastToOptions, Byte.MAX_VALUE, BuiltinOptions.LeakyReluOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.LogicalAndOptions, Byte.MAX_VALUE, BuiltinOptions.HashtableOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.PackOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.SliceOptions, BuiltinOptions.LogicalAndOptions, Byte.MAX_VALUE, BuiltinOptions.ReadVariableOptions, BuiltinOptions.ATan2Options, BuiltinOptions.HashtableFindOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.ATan2Options, BuiltinOptions.LeakyReluOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.LogicalAndOptions, Byte.MAX_VALUE, BuiltinOptions.HashtableOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.PackOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.SliceOptions, BuiltinOptions.TileOptions, BuiltinOptions.PowOptions, BuiltinOptions.SelectOptions, BuiltinOptions.PowOptions, 12, BuiltinOptions.PadV2Options, BuiltinOptions.SliceOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.LessOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.LessOptions, BuiltinOptions.PowOptions, BuiltinOptions.PadV2Options, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.SignOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.NegOptions, BuiltinOptions.SignOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.PowOptions, BuiltinOptions.ShapeOptions, 61, BuiltinOptions.PadV2Options, BuiltinOptions.NotEqualOptions, BuiltinOptions.SliceOptions, 61, 12, BuiltinOptions.PadV2Options, BuiltinOptions.SliceOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.LessOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.LessOptions, BuiltinOptions.PowOptions, BuiltinOptions.PadV2Options, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.SignOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.NegOptions, BuiltinOptions.SignOptions, BuiltinOptions.UnsortedSegmentMaxOptions, 35, BuiltinOptions.ArgMaxOptions, 63, BuiltinOptions.ArgMaxOptions, 28, BuiltinOptions.PackOptions, 32, BuiltinOptions.Rfft2dOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.ArgMaxOptions, 61, BuiltinOptions.ExpOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.HashtableFindOptions, 58, BuiltinOptions.HashtableOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.PackOptions, BuiltinOptions.DequantizeOptions, 32, BuiltinOptions.GreaterEqualOptions, 28, BuiltinOptions.PackOptions, 32, BuiltinOptions.Rfft2dOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.ArgMaxOptions, 61, BuiltinOptions.ExpOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.HashtableFindOptions, 58, BuiltinOptions.HashtableOptions, BuiltinOptions.CallOnceOptions, 5, 14, 25, 14, 58, 29, 6, BuiltinOptions.SplitVOptions, 28, 12, 7, 10, 2, 10, BuiltinOptions.WhereOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.ResizeNearestNeighborOptions, 28, BuiltinOptions.MirrorPadOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.SplitVOptions, 14, 1, 11, 29, 0, 6, 11, 58, 29, 6, BuiltinOptions.SplitVOptions, 28, 12, 7, 10, 2, 10, BuiltinOptions.WhereOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.ResizeNearestNeighborOptions, 28, BuiltinOptions.MirrorPadOptions, BuiltinOptions.FloorDivOptions};
    }

    static {
        A09();
    }

    public static Uri A00(String str) {
        Uri parse = Uri.parse(str);
        C2202cu A002 = SP.A00();
        if (A002 != null && !U7.A2p(A002)) {
            return parse;
        }
        if (!A0D(parse)) {
            Uri androidUri = A01(str);
            return androidUri;
        }
        A0A(str, parse);
        return parse;
    }

    public static Uri A01(String str) {
        try {
            URI uri = new URI(str);
            if (uri.isOpaque()) {
                Uri androidUri = A03(uri);
                A0B(str, uri, androidUri);
                return androidUri;
            }
            Uri androidUri2 = A02(uri);
            A0C(str, uri, androidUri2, false);
            return androidUri2;
        } catch (URISyntaxException e) {
            throw A04(str, e);
        }
    }

    public static Uri A02(URI uri) {
        return new Uri.Builder().scheme(uri.getScheme()).encodedAuthority(uri.getRawAuthority()).encodedPath(uri.getRawPath()).encodedQuery(uri.getRawQuery()).encodedFragment(uri.getRawFragment()).build();
    }

    public static Uri A03(URI uri) {
        return new Uri.Builder().scheme(uri.getScheme()).encodedOpaquePart(uri.getRawSchemeSpecificPart()).encodedFragment(uri.getRawFragment()).build();
    }

    public static SecurityException A04(String str, URISyntaxException uRISyntaxException) {
        return new SecurityException(String.format(Locale.US, A05(26, 36, 89), str, uRISyntaxException.getMessage()));
    }

    public static URI A06(Uri uri) {
        try {
            URI javaUri = new URI(uri.toString());
            if (A0F(javaUri, uri)) {
                return javaUri;
            }
            return null;
        } catch (URISyntaxException unused) {
            return null;
        }
    }

    public static URI A07(String str, Uri uri) {
        try {
            return new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), uri.getPort(), uri.getPath(), uri.getQuery(), uri.getFragment());
        } catch (URISyntaxException e) {
            URI A06 = A06(uri);
            if (A06 != null) {
                return A06;
            }
            throw A04(str, e);
        }
    }

    public static URI A08(String str, Uri uri) {
        try {
            return new URI(uri.getScheme(), uri.getSchemeSpecificPart(), uri.getFragment());
        } catch (URISyntaxException e) {
            throw A04(str, e);
        }
    }

    public static void A0A(String str, Uri uri) throws SecurityException {
        if (uri.isOpaque()) {
            URI A08 = A08(str, uri);
            if (A01[6].length() != 30) {
                throw new RuntimeException();
            }
            A01[2] = "XZATJK5ui";
            A0B(str, A08, uri);
            return;
        }
        URI A07 = A07(str, uri);
        A0C(str, A07, uri, A0F(A07, uri));
    }

    public static void A0B(String str, URI uri, Uri uri2) {
        boolean A0E = A0E(uri.getScheme(), uri2.getScheme());
        boolean A0E2 = A0E(uri.getSchemeSpecificPart(), uri2.getSchemeSpecificPart());
        if (A0E && A0E2) {
            return;
        }
        String A05 = A05(0, 0, 3);
        if (!A0E) {
            A05 = A05 + String.format(Locale.US, A05(290, 46, 22), uri.getScheme(), uri2.getScheme());
        }
        if (!A0E2) {
            A05 = A05 + String.format(Locale.US, A05(192, 56, 32), uri.getSchemeSpecificPart(), uri2.getSchemeSpecificPart());
        }
        Locale locale = Locale.US;
        String debugInfo = uri.toString();
        throw new SecurityException(String.format(locale, A05(63, 77, 91), debugInfo, uri2.toString(), A05, str));
    }

    public static void A0C(String str, URI uri, Uri uri2, boolean z) {
        boolean A0E = A0E(uri.getScheme(), uri2.getScheme());
        boolean A0E2 = A0E(uri.getAuthority(), uri2.getAuthority());
        boolean A0E3 = A0E(uri.getPath(), uri2.getPath());
        String A05 = A05(0, 0, 3);
        if (!A0E) {
            A05 = A05 + String.format(Locale.US, A05(290, 46, 22), uri.getScheme(), uri2.getScheme());
        }
        if (!z && !A0E2) {
            A05 = A05 + String.format(Locale.US, A05(140, 52, 103), uri.getAuthority(), uri2.getAuthority());
        }
        if (!A0E3) {
            A05 = A05 + String.format(Locale.US, A05(TelnetCommand.EL, 42, 48), uri.getPath(), uri2.getPath());
        }
        if (A0E && A0E2 && A0E3) {
        } else {
            throw new SecurityException(String.format(Locale.US, A05(63, 77, 91), uri.toString(), uri2.toString(), A05, str));
        }
    }

    public static boolean A0D(Uri uri) {
        if (uri.getScheme() == null) {
            return true;
        }
        return uri.getScheme().matches(A05(0, 26, 93));
    }

    public static boolean A0E(String str, String str2) {
        String A05 = A05(0, 0, 3);
        if (str == null || str.equals(A05)) {
            return str2 == null || str2.equals(A05);
        }
        return str.equals(str2);
    }

    public static boolean A0F(URI uri, Uri uri2) {
        String host = uri2.getHost();
        String androidHost = uri.getHost();
        if (androidHost == null && host != null) {
            String androidHost2 = A05(62, 1, 17);
            if (host.contains(androidHost2)) {
                return true;
            }
        }
        return false;
    }
}
