package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.59, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract /* synthetic */ class AnonymousClass59 {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 104);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{BuiltinOptions.ExpandDimsOptions, 64, BuiltinOptions.ArgMinOptions, BuiltinOptions.PowOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.RangeOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.PadV2Options, 28, BuiltinOptions.SelectOptions, BuiltinOptions.PadV2Options, -26, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.PadV2Options, BuiltinOptions.PadV2Options, 32, 21, 20};
    }

    public static /* synthetic */ boolean A02(String str) {
        if (str == null) {
            return false;
        }
        String A01 = AbstractC2535iY.A01(str);
        if (TextUtils.isEmpty(A01)) {
            return false;
        }
        return ((A01.contains(A00(4, 4, 105)) && !A01.contains(A00(8, 8, 79))) || A01.contains(A00(0, 4, 100)) || A01.contains(A00(16, 3, 64))) ? false : true;
    }
}
