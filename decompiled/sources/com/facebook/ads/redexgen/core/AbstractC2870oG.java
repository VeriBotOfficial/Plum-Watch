package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import java.util.Arrays;
import java.util.Comparator;
import org.tensorflow.lite.schema.BuiltinOptions;

@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.oG, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2870oG<K0, V0> {
    public static byte[] A00;

    static {
        A04();
    }

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 127);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{BuiltinOptions.ScatterNdOptions, BuiltinOptions.GeluOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.ReadVariableOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.VarHandleOptions};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oG != com.google.common.collect.MultimapBuilder<K0, V0> */
    public AbstractC2870oG() {
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oG != com.google.common.collect.MultimapBuilder<K0, V0> */
    public /* synthetic */ AbstractC2870oG(C1361Ab c1361Ab) {
        this();
    }

    public static AbstractC2869oF<Object> A00(int expectedKeys) {
        AbstractC2717ll.A00(expectedKeys, A03(0, 12, 125));
        return new C1361Ab(expectedKeys);
    }

    public static <K0> AbstractC2869oF<K0> A01(Comparator<K0> comparator) {
        AbstractC2570jA.A04(comparator);
        return new AZ(comparator);
    }

    public static AbstractC2869oF<Comparable> A02() {
        return A01(AbstractC2884oV.A03());
    }
}
