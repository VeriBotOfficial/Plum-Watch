package com.facebook.ads.redexgen.core;

import java.io.Serializable;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public enum V4 implements Serializable {
    A05(320, 50),
    A08(0, 0),
    A06(-1, 50),
    A07(-1, 90),
    A09(-1, 250);

    public static byte[] A02 = null;
    public static String[] A03 = {"Tf0gzpE1z0DOygMknAScYVGYgxUCN6If", "OJWxv0TW5miQ3Kn", "GlLNElMoCA8", "Xgk0OdYHTIXe2Q1HA3YZKPRbdeS7oU4D", "PHyDcqcelsxe2C8hrB0OPMJ92C1p28xb", "tjympuwDZEvmjp4dt80fu9pzZi", "KXSmHfhq6DtFyO2I4KCsZ7pXn2h8CepA", "nIUh7sEtDWkIx81Fpy5uA9wFEXEhOC2B"};
    public static final long serialVersionUID = 42;
    public final int A00;
    public final int A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A03[4].charAt(1) == 'S') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[0] = "VIfYmPrZv6LGyPijtMThbF852HrrLBlI";
            strArr[6] = "4hX5Bu6XJriXyO1ylOVNaDjvP68bIemq";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 68);
            i4++;
        }
    }

    public static void A01() {
        A02 = new byte[]{15, 12, 3, 3, 8, 31, 18, BuiltinOptions.RightShiftOptions, Byte.MAX_VALUE, BuiltinOptions.BitwiseXorOptions, 18, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SparseToDenseOptions, 61, 61, BuiltinOptions.NotEqualOptions, BuiltinOptions.ExpOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.PackOptions, BuiltinOptions.NotEqualOptions, 58, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.PackOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.ZerosLikeOptions, 61, BuiltinOptions.LogicalAndOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.TransposeConvOptions, 58, BuiltinOptions.GreaterEqualOptions, 32, BuiltinOptions.ShapeOptions, 58, BuiltinOptions.NotEqualOptions, BuiltinOptions.PowOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PadV2Options, 32, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.ATan2Options, BuiltinOptions.SignOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.TileOptions, BuiltinOptions.EqualOptions, 34, BuiltinOptions.ShapeOptions, BuiltinOptions.PowOptions, BuiltinOptions.TransposeConvOptions, 58, BuiltinOptions.TileOptions, BuiltinOptions.LessOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.TileOptions, 63, BuiltinOptions.TransposeConvOptions, BuiltinOptions.LogicalAndOptions, 34, BuiltinOptions.LessOptions, BuiltinOptions.FillOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.BidirectionalSequenceRNNOptions};
    }

    static {
        A01();
    }

    V4(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public final int A03() {
        return this.A00;
    }

    public final int A04() {
        return this.A01;
    }
}
