package com.facebook.ads.redexgen.core;

import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import com.facebook.imageutils.JfifUtil;
import java.util.Arrays;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.dg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC2249dg {
    A04(A00(147, 33, 22)),
    A05(A00(180, 36, 110)),
    A06(A00(JfifUtil.MARKER_SOI, 29, 107)),
    A03(A00(78, 32, 92)),
    A07(A00(110, 37, 90));

    public static byte[] A01;
    public String A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 106);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{20, 7, 26, 15, 28, 11, BuiltinOptions.CastOptions, 7, 10, BuiltinOptions.CastOptions, 9, 18, 15, 9, 17, -63, -76, -57, PSSSigner.TRAILER_IMPLICIT, -55, -72, -46, -74, -62, -64, -61, -65, -72, -57, -72, -35, -48, -29, -40, -27, -44, -18, -44, -35, -45, -18, -48, -46, -29, -40, -27, -40, -29, -24, -35, -48, -29, -40, -27, -44, -18, -44, -31, -31, -34, -31, -39, -52, -33, -44, -31, -48, -22, -44, -40, -37, -35, -48, -34, -34, -44, -38, -39, BuiltinOptions.LessOptions, BuiltinOptions.EqualOptions, BuiltinOptions.TileOptions, -12, BuiltinOptions.GreaterOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.LessOptions, BuiltinOptions.PadV2Options, BuiltinOptions.ArgMaxOptions, BuiltinOptions.EqualOptions, BuiltinOptions.EqualOptions, BuiltinOptions.TransposeConvOptions, -12, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.NegOptions, BuiltinOptions.ArgMinOptions, -12, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.MaximumMinimumOptions, 58, BuiltinOptions.SelectOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.PadV2Options, -12, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.NegOptions, BuiltinOptions.CastOptions, BuiltinOptions.LessOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.SelectOptions, BuiltinOptions.LessOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.TileOptions, BuiltinOptions.TransposeConvOptions, -14, BuiltinOptions.NegOptions, BuiltinOptions.CastOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.LessOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.TileOptions, BuiltinOptions.TileOptions, BuiltinOptions.SelectOptions, -14, BuiltinOptions.CastOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.ShapeOptions, -14, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.CastOptions, BuiltinOptions.PowOptions, BuiltinOptions.GreaterEqualOptions, 58, BuiltinOptions.LessOptions, -14, BuiltinOptions.CastOptions, BuiltinOptions.ArgMaxOptions, 35, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.LessOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.TileOptions, BuiltinOptions.SparseToDenseOptions, -29, -17, -19, -82, -26, -31, -29, -27, -30, -17, -17, -21, -82, -31, -28, -13, -82, -18, -31, -12, -23, -10, -27, -82, -29, -17, -19, TransmissionUnpacked.HD_VAL_MAGIC_HB, -20, -27, -12, -27, -28, BuiltinOptions.PackOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, 6, BuiltinOptions.LogicalAndOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.PackOptions, 61, 58, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.ZerosLikeOptions, 6, BuiltinOptions.ArgMinOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.LeakyReluOptions, 6, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.AbsOptions, 61, 6, 61, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.PackOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.AbsOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.PowOptions, BuiltinOptions.FillOptions, BuiltinOptions.SquareOptions, 3, BuiltinOptions.PackOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.PowOptions, 58, BuiltinOptions.ShapeOptions, BuiltinOptions.FillOptions, BuiltinOptions.FillOptions, 64, 3, BuiltinOptions.NotEqualOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.FloorModOptions, 3, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.RangeOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.LeakyReluOptions, 58, 3, 58, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.FillOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions};
    }

    static {
        A01();
    }

    EnumC2249dg(String str) {
        this.A00 = str;
    }

    public final String A03() {
        return this.A00;
    }
}
