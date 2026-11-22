package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.p4, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2917p4 {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 86);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{BuiltinOptions.TransposeConvOptions, BuiltinOptions.EqualOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.TileOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.GeluOptions, BuiltinOptions.SliceOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.GeluOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.SelectOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.TileOptions, BuiltinOptions.EqualOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.LessOptions, BuiltinOptions.GeluOptions};
    }

    public final String A02(InterfaceC13549u interfaceC13549u) {
        String obj = interfaceC13549u.getClass().getGenericInterfaces()[0].toString();
        String A002 = A00(0, 21, 12);
        return obj.startsWith(A002) ? obj.substring(A002.length()) : obj;
    }

    public final String A03(C1C c1c) {
        return A02(c1c);
    }
}
