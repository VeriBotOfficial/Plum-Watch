package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.p5, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2918p5 {
    public static byte[] A00;
    public static final C2917p4 A01;
    public static final InterfaceC13539t[] A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 12);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{BuiltinOptions.SplitVOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.ResizeNearestNeighborOptions, 10, BuiltinOptions.RankOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.SquareOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.UniqueOptions, 10, BuiltinOptions.AbsOptions, BuiltinOptions.AddNOptions, BuiltinOptions.RangeOptions, 10, BuiltinOptions.MirrorPadOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.RankOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.FloorModOptions, 10, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.SquareOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.RankOptions, BuiltinOptions.WhileOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.RangeOptions, BuiltinOptions.CosOptions, BuiltinOptions.FloorModOptions};
    }

    static {
        C2917p4 impl;
        try {
            A02();
            Class<?> implClass = Class.forName(A00(0, 49, 40));
            impl = (C2917p4) implClass.newInstance();
        } catch (ClassCastException unused) {
            impl = null;
        } catch (ClassNotFoundException unused2) {
            impl = null;
        } catch (IllegalAccessException unused3) {
            impl = null;
        } catch (InstantiationException unused4) {
            impl = null;
        }
        if (impl == null) {
            impl = new C2917p4();
        }
        A01 = impl;
        A02 = new InterfaceC13539t[0];
    }

    public static String A01(C1C c1c) {
        return A01.A03(c1c);
    }
}
