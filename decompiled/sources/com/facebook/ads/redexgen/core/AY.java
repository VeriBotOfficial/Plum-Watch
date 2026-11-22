package com.facebook.ads.redexgen.core;

import android.media.MediaCodec;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public class AY extends Exception {
    public static byte[] A05;
    public final AR A00;
    public final AY A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    static {
        A05();
    }

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 113);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A05 = new byte[]{0, 12, BuiltinOptions.TransposeConvOptions, 16, 22, 26, 17, 16, 7, BuiltinOptions.WhereOptions, 28, 27, 28, 1, BuiltinOptions.WhereOptions, 19, 20, 28, 25, 16, 17, BuiltinOptions.SplitVOptions, BuiltinOptions.WhereOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.FillOptions, BuiltinOptions.SquareOptions, BuiltinOptions.AbsOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.FillOptions, BuiltinOptions.GatherNdOptions, 1, BuiltinOptions.FloorModOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.WhereOptions, 1, BuiltinOptions.UnidirectionalSequenceLSTMOptions, 64, BuiltinOptions.FloorModOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.FillOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, 27, 1, BuiltinOptions.ATan2Options, 63, BuiltinOptions.AbsOptions, BuiltinOptions.SquareOptions, 29, 17, 19, BuiltinOptions.UniqueOptions, 24, 31, 29, 27, 28, 17, 17, 21, BuiltinOptions.UniqueOptions, 31, 26, 13, BuiltinOptions.UniqueOptions, 31, 16, 26, 12, 17, 23, 26, 6, BuiltinOptions.UniqueOptions, 19, 27, 26, 23, 31, BuiltinOptions.MirrorPadOptions, BuiltinOptions.UniqueOptions, 27, 6, 17, 14, 18, 31, 7, 27, 12, BuiltinOptions.UniqueOptions, 19, 27, 26, 23, 31, 29, 17, 26, 27, 29, BuiltinOptions.UniqueOptions, BuiltinOptions.TileOptions, 27, 26, 23, 31, 61, 17, 26, 27, 29, BuiltinOptions.GreaterOptions, 27, 16, 26, 27, 12, 27, 12, BuiltinOptions.ExpOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.SelectOptions, BuiltinOptions.GreaterEqualOptions, 21};
    }

    public AY(C2905or c2905or, Throwable th, boolean z, int i) {
        this(A03(23, 22, 80) + i + A03(45, 3, 19) + c2905or, th, c2905or.A0W, z, null, A02(i), null);
    }

    public AY(C2905or c2905or, Throwable th, boolean z, AR ar) {
        this(A03(2, 21, 4) + ar.A03 + A03(0, 2, 93) + c2905or, th, c2905or.A0W, z, ar, AbstractC12174a.A02 >= 21 ? A04(th) : null, null);
    }

    public AY(String str, Throwable th, String str2, boolean z, AR ar, String str3, AY ay) {
        super(str, th);
        this.A03 = str2;
        this.A04 = z;
        this.A00 = ar;
        this.A02 = str3;
        this.A01 = ay;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AY A00(AY ay) {
        return new AY(getMessage(), getCause(), this.A03, this.A04, this.A00, this.A02, ay);
    }

    public static String A02(int i) {
        String A03 = i < 0 ? A03(121, 4, 59) : A03(0, 0, 98);
        StringBuilder sb = new StringBuilder();
        String sign = A03(48, 73, 15);
        return sb.append(sign).append(A03).append(Math.abs(i)).toString();
    }

    public static String A04(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        return null;
    }
}
