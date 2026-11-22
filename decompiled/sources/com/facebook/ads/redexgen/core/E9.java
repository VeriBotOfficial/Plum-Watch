package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public final class E9 {
    public static byte[] A03;
    public final int A00;
    public final C2871oH A01;
    public final int[] A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 82);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-11, 4, 3, -12, 21, 22, 25, 30, 25, BuiltinOptions.LogSoftmaxOptions, 25, 31, 30, 3, BuiltinOptions.PadV2Options, BuiltinOptions.LessEqualOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.ShapeOptions, -34, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.SliceOptions, 31, BuiltinOptions.ExpOptions, BuiltinOptions.LessOptions, BuiltinOptions.TransposeConvOptions, -34, 31, BuiltinOptions.SliceOptions, 35, -34, BuiltinOptions.GreaterOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.SparseToDenseOptions, -34, 31, BuiltinOptions.NegOptions, BuiltinOptions.NegOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.EqualOptions, 35, 34};
    }

    public E9(C2871oH c2871oH, int... iArr) {
        this(c2871oH, iArr, 0);
    }

    public E9(C2871oH c2871oH, int[] iArr, int i) {
        if (iArr.length == 0) {
            AnonymousClass44.A08(A00(0, 13, 94), A00(13, 28, 108), new IllegalArgumentException());
        }
        this.A01 = c2871oH;
        this.A02 = iArr;
        this.A00 = i;
    }
}
