package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.8H, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C8H extends Exception {
    public static byte[] A03;
    public final int A00;
    public final C2905or A01;
    public final boolean A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 65);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{BuiltinOptions.LogicalOrOptions, Byte.MAX_VALUE, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.GreaterEqualOptions, 58, BuiltinOptions.LogicalOrOptions, BuiltinOptions.SliceOptions, BuiltinOptions.LessOptions, 58, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.LogicalAndOptions, 61, BuiltinOptions.TileOptions, 58, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.SignOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.RandomOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.MaximumMinimumOptions, 63, 29, BuiltinOptions.ExpandDimsOptions, 19, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.PackOptions, 61, 6, 32, BuiltinOptions.TileOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.ArgMinOptions, 19, BuiltinOptions.LogicalAndOptions, BuiltinOptions.LogicalAndOptions, 61, BuiltinOptions.TransposeConvOptions, BuiltinOptions.TileOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.NegOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.RankOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.BucketizeOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.GeluOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.SignOptions, BuiltinOptions.RandomOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.GreaterOptions, 0, 1, 9, 6, 8, BuiltinOptions.UnidirectionalSequenceLSTMOptions};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"NEW_CLASS"}, value = "D23918943: Monitor the audio track usage")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C8H(int r6, int r7, int r8, int r9, com.facebook.ads.redexgen.core.C2905or r10, boolean r11, java.lang.Exception r12, int r13) {
        /*
            r5 = this;
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r2 = 45
            r1 = 23
            r0 = 86
            java.lang.String r0 = A00(r2, r1, r0)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.StringBuilder r4 = r0.append(r6)
            r2 = 0
            r1 = 1
            r0 = 93
            java.lang.String r3 = A00(r2, r1, r0)
            java.lang.StringBuilder r4 = r4.append(r3)
            r2 = 68
            r1 = 7
            r0 = 46
            java.lang.String r0 = A00(r2, r1, r0)
            java.lang.StringBuilder r0 = r4.append(r0)
            java.lang.StringBuilder r4 = r0.append(r7)
            r2 = 43
            r1 = 2
            r0 = 71
            java.lang.String r1 = A00(r2, r1, r0)
            java.lang.StringBuilder r0 = r4.append(r1)
            java.lang.StringBuilder r0 = r0.append(r8)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r4 = r0.append(r9)
            r2 = 15
            r1 = 28
            r0 = 19
            java.lang.String r0 = A00(r2, r1, r0)
            java.lang.StringBuilder r0 = r4.append(r0)
            java.lang.StringBuilder r0 = r0.append(r13)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r3 = r0.append(r10)
            if (r11 == 0) goto L84
            r2 = 1
            r1 = 14
            r0 = 30
            java.lang.String r0 = A00(r2, r1, r0)
        L72:
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0, r12)
            r5.A00 = r6
            r5.A02 = r11
            r5.A01 = r10
            return
        L84:
            r2 = 0
            r1 = 0
            r0 = 74
            java.lang.String r0 = A00(r2, r1, r0)
            goto L72
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C8H.<init>(int, int, int, int, com.facebook.ads.redexgen.X.or, boolean, java.lang.Exception, int):void");
    }
}
