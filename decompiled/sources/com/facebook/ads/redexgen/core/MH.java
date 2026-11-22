package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public abstract class MH {
    public static byte[] A04;
    public MF A00;
    public final C2228dL A01;
    public final US A02;
    public final String A03;

    static {
        A0D();
    }

    public static String A0B(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 122);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A04 = new byte[]{BuiltinOptions.CosOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.CosOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.HashtableFindOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.DensifyOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.GeluOptions, BuiltinOptions.SelectV2Options};
    }

    public abstract ME A0G(String str);

    public MH(C2228dL c2228dL, US us, String str) {
        this.A01 = c2228dL;
        this.A02 = us;
        this.A03 = str;
    }

    public static String A0A() {
        return A0B(16, 16, 125);
    }

    public static String A0C(MH mh) {
        if (mh instanceof C7O) {
            return A0B(6, 10, 122);
        }
        return A0B(0, 6, 79);
    }

    public final MF A0E() {
        return this.A00;
    }

    public final void A0F(MF mf) {
        this.A00 = mf;
    }
}
