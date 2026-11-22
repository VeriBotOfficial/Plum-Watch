package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Arrays;
import java.util.Locale;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.Zk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2008Zk {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 82);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{11, 8, 5, 31, 30, BuiltinOptions.UniqueOptions, 8, 6, 11, 4, 1, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.CastOptions, BuiltinOptions.SliceOptions, BuiltinOptions.SliceOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.TransposeConvOptions, 58, BuiltinOptions.HashtableFindOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.ATan2Options, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.GeluOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.RandomOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.LessOptions, BuiltinOptions.NegOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.UnsortedSegmentMaxOptions, 63, BuiltinOptions.PowOptions, 58, BuiltinOptions.LogicalOrOptions, BuiltinOptions.PackOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.UnsortedSegmentMaxOptions, 58, BuiltinOptions.NotEqualOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.UnsortedSegmentProdOptions};
    }

    public static String A01(String str) {
        return TextUtils.isEmpty(str) ? A00(38, 25, 11) : String.format(Locale.US, A00(11, 27, 77), str);
    }

    public static void A03(WebView webView) {
        webView.loadUrl(A00(0, 11, 56));
        webView.clearCache(true);
    }

    public static void A04(WebView webView) {
        webView.getSettings().setMixedContentMode(0);
    }
}
