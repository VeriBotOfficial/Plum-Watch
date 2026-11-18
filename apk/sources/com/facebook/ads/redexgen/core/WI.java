package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: assets/audience_network.dex */
public enum Wi {
    A04(0),
    A05(1),
    A03(2);

    public static byte[] A01;
    public final int A00;

    public static String A00(int r2, int r3, int r4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, r2, r2 + r3);
        for (int r1 = 0; r1 < bArrCopyOfRange.length; r1++) {
            bArrCopyOfRange[r1] = (byte) ((bArrCopyOfRange[r1] ^ r4) ^ 127);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{BuiltinOptions.CastOptions, BuiltinOptions.PowOptions, BuiltinOptions.PowOptions, 35, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.SignOptions, BuiltinOptions.RightShiftOptions, 127, BuiltinOptions.CallOnceOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.RankOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions};
    }

    static {
        A01();
    }

    Wi(int r3) {
        this.A00 = r3;
    }
}
