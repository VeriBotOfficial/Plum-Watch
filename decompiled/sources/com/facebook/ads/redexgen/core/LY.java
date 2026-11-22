package com.facebook.ads.redexgen.core;

import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.wakeup.common.DeviceFeatures;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public final class LY implements YY {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 99);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-35, -23, -25, -88, -32, -37, -35, -33, -36, -23, -23, -27, -88, -37, -34, -19, -88, -29, -24, -18, -33, -20, -19, -18, -29, -18, -29, -37, -26, -88, -35, -26, -29, -35, -27, -33, -34, BuiltinOptions.ArgMaxOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.SparseToDenseOptions, -13, BuiltinOptions.PadV2Options, BuiltinOptions.DequantizeOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.NegOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.SliceOptions, -13, BuiltinOptions.DequantizeOptions, BuiltinOptions.LessOptions, BuiltinOptions.PowOptions, -13, BuiltinOptions.LessEqualOptions, BuiltinOptions.TileOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.NegOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.TransposeConvOptions, -13, BuiltinOptions.NegOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.ShapeOptions, -21, -9, -11, -74, -18, -23, -21, -19, -22, -9, -9, -13, -74, -23, -20, -5, -74, -15, -10, -4, -19, -6, -5, -4, -15, -4, -15, -23, -12, -74, -18, -15, -10, -15, -5, TransmissionUnpacked.HD_VAL_MAGIC_HB, -25, -23, -21, -4, -15, -2, -15, -4, 1, BuiltinOptions.NegOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ExpandDimsOptions, -11, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.NegOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.LessOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.SparseToDenseOptions, -11, BuiltinOptions.ArgMaxOptions, BuiltinOptions.PadV2Options, 58, -11, BuiltinOptions.SliceOptions, BuiltinOptions.EqualOptions, BuiltinOptions.PackOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.ArgMinOptions, 58, BuiltinOptions.PackOptions, BuiltinOptions.SliceOptions, BuiltinOptions.PackOptions, BuiltinOptions.SliceOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.TileOptions, -11, BuiltinOptions.SliceOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.GreaterOptions, 58, 58, BuiltinOptions.SliceOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.EqualOptions, -11, BuiltinOptions.TileOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.PadV2Options, -31, -19, -21, -84, -28, -33, -31, -29, -32, -19, -19, -23, -84, -33, -30, -15, -84, -25, -20, -14, -29, TransmissionUnpacked.HD_VAL_MAGIC_HB, -15, -14, -25, -14, -25, -33, -22, -84, TransmissionUnpacked.HD_VAL_MAGIC_HB, -29, -11, -33, TransmissionUnpacked.HD_VAL_MAGIC_HB, -30, BuiltinOptions.LessEqualOptions, 58, BuiltinOptions.PowOptions, -7, BuiltinOptions.TransposeConvOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.SliceOptions, BuiltinOptions.GreaterEqualOptions, 58, 58, BuiltinOptions.NotEqualOptions, -7, BuiltinOptions.GreaterOptions, BuiltinOptions.SelectOptions, BuiltinOptions.LogicalAndOptions, -7, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.ArgMinOptions, 63, BuiltinOptions.SliceOptions, 61, BuiltinOptions.LogicalAndOptions, 63, BuiltinOptions.ExpandDimsOptions, 63, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.ShapeOptions, -7, 61, BuiltinOptions.SliceOptions, BuiltinOptions.SquareOptions, BuiltinOptions.GreaterOptions, 61, BuiltinOptions.SelectOptions, BuiltinOptions.NegOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.SliceOptions, 61, BuiltinOptions.FloorDivOptions, BuiltinOptions.SliceOptions, 61, BuiltinOptions.NegOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.ShapeOptions, 64, 61, BuiltinOptions.SliceOptions, -44, -32, -34, -97, -41, -46, -44, -42, -45, -32, -32, -36, -97, -46, TransmissionUnpacked.HD_VAL_MAGIC_LB, -28, -97, -38, -33, -27, -42, -29, -28, -27, -38, -27, -38, -46, -35, -97, -29, -42, -24, -46, -29, TransmissionUnpacked.HD_VAL_MAGIC_LB, -48, -28, -42, -29, -25, -42, -29, -48, -28, -26, -44, -44, -42, -28, -28};
    }

    @Override // com.facebook.ads.redexgen.core.YY
    public final String A6d() {
        return A00(DeviceFeatures.CAMERA_PREVIEW, 36, 27);
    }

    @Override // com.facebook.ads.redexgen.core.YY
    public final String A7E() {
        return A00(0, 37, 23);
    }

    @Override // com.facebook.ads.redexgen.core.YY
    public final String A7o() {
        return A00(72, 45, 37);
    }

    @Override // com.facebook.ads.redexgen.core.YY
    public final String A7t() {
        return A00(37, 35, 98);
    }

    @Override // com.facebook.ads.redexgen.core.YY
    public final String A88() {
        return A00(117, 47, 100);
    }

    @Override // com.facebook.ads.redexgen.core.YY
    public final String A8d() {
        return AdPlacementType.INTERSTITIAL.toString();
    }

    @Override // com.facebook.ads.redexgen.core.YY
    public final String A8w() {
        return A00(200, 51, 104);
    }

    @Override // com.facebook.ads.redexgen.core.YY
    public final String A8x() {
        return A00(251, 51, 14);
    }
}
