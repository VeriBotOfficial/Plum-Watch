package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class O4 {
    public static byte[] A01;
    public static String[] A02 = {"VujXzvSFrlMAu4R1I5vUAWLnq57AsPWM", "eCB4AeZNNUxNJOW0xCQdVSKErAFKyRUE", "SxM7TzuiGj5mLkDPau1usW4gOWoxs80M", "JPSotx28OKEE72Qpgvn7eDCIGwp5uNVo", "DEnf6Zvbz7peiDJpz513nqQn8JHSiM1H", "gOyBV6cEPVg9ZlKZ082v3gM", "JzQKQqAcA3MWJuXBOCM1CdL45YEfwdQ5", "kFuiftK6CrUjCipoQAB5otHUPyyIQR1T"};
    public static final /* synthetic */ O4[] A03;
    public static final O4 A04;
    public static final O4 A05;
    public static final O4 A06;
    public final String A00;

    public static String A00(int r2, int r3, int r4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, r2, r2 + r3);
        for (int r1 = 0; r1 < bArrCopyOfRange.length; r1++) {
            bArrCopyOfRange[r1] = (byte) ((bArrCopyOfRange[r1] ^ r4) ^ 62);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{BuiltinOptions.BitcastOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.AddNOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.AddNOptions, BuiltinOptions.CosOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.PackOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.NegOptions};
    }

    static {
        A01();
        A06 = new O4(A00(8, 6, 62), 0, A00(22, 6, 96));
        A04 = new O4(A00(0, 4, 10), 1, A00(14, 4, 28));
        A05 = new O4(A00(4, 4, 54), 2, A00(18, 4, 53));
        A03 = A02();
    }

    public O4(String str, int r2, String str2) {
        super(str, r2);
        this.A00 = str2;
    }

    public static /* synthetic */ O4[] A02() {
        O4[] o4Arr = new O4[3];
        o4Arr[0] = A06;
        O4 o4 = A04;
        String[] strArr = A02;
        if (strArr[0].charAt(31) != strArr[2].charAt(31)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[4] = "cigJDFmR8APB9TZFazKvkLU6eV5xdG1z";
        strArr2[7] = "bxChofFJf2xaRn9PIbRGfpqcGnLInP10";
        o4Arr[1] = o4;
        o4Arr[2] = A05;
        return o4Arr;
    }

    public final String A03() {
        return this.A00;
    }

    public static O4 valueOf(String str) {
        return (O4) Enum.valueOf(O4.class, str);
    }

    public static O4[] values() {
        return (O4[]) A03.clone();
    }
}
