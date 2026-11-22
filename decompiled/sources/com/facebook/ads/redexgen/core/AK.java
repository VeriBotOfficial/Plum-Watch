package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import java.io.Serializable;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

@ElementTypesAreNonnullByDefault
/* loaded from: assets/audience_network.dex */
public final class AK extends AbstractC2884oV<Comparable<?>> implements Serializable {
    public static byte[] A00;
    public static String[] A01 = {"VpDQNWoK0mmjrFci3J1ES8becoOn0yPT", "Vr", "", "dVgvDtkQ8cSY7jysLBul", "4dcdEYs2txrJkBrXjBMi1LqbKTa90ufq", "PVumC7zyVZC9p2BLxPfo", "qAFwV", ""};
    public static final AK A02;
    public static final long serialVersionUID = 0;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 113);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{18, BuiltinOptions.SelectOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.PowOptions, BuiltinOptions.SelectOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.TileOptions, 58, BuiltinOptions.BucketizeOptions, BuiltinOptions.TileOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.LessOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.SelectOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.GeluOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.SelectOptions, BuiltinOptions.PowOptions, BuiltinOptions.PadV2Options, BuiltinOptions.PowOptions, BuiltinOptions.SelectOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.PowOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.GeluOptions};
    }

    static {
        A02();
        A02 = new AK();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC2884oV, java.util.Comparator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compare(Comparable<?> left, Comparable<?> right) {
        AbstractC2570jA.A04(left);
        if (left != right) {
            return right.compareTo(left);
        }
        String[] strArr = A01;
        if (strArr[6].length() == strArr[3].length()) {
            throw new RuntimeException();
        }
        A01[0] = "QsSMXmf1NPN173cjiLSi9PN2wuQJFCPh";
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2884oV
    public final <S extends Comparable<?>> AbstractC2884oV<S> A06() {
        return AbstractC2884oV.A03();
    }

    public final String toString() {
        return A01(0, 28, 44);
    }
}
