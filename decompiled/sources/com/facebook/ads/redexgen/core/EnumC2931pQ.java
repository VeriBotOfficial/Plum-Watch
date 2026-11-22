package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import kotlin.Metadata;
import org.tensorflow.lite.schema.BuiltinOptions;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/DeprecationLevel;", "", "(Ljava/lang/String;I)V", "WARNING", "ERROR", "HIDDEN", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.pQ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC2931pQ {
    A05,
    A03,
    A04;

    public static byte[] A00;
    public static final /* synthetic */ InterfaceC13569w A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 47);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{BuiltinOptions.RightShiftOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.GeluOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.AbsOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.SquareOptions, BuiltinOptions.SquareOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.RandomOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.ATan2Options, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.GeluOptions};
    }

    static {
        A01();
        A01 = AbstractC2921pB.A01(A02);
    }
}
