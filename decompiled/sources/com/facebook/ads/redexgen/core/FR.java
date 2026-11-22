package com.facebook.ads.redexgen.core;

import android.view.Surface;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public final class FR {
    public static byte[] A00;
    public static String[] A01 = {"C9RGb7NCXIcFkq487TbtOiV6wJyl5V", "dIw4BKlzmuU3zMuMzRjmW2qgnJuCAgWy", "9uTfiPT", "rJUClzDzuXOVG7xlKmzeqZnP5Peloa5p", "Z", "9S6veErjLDkLbxAihnisBS", "TmmUyGbb1uzRJUdaHSZi2e0nreAYvBIE", "B53ji15DIU9T3sUrLFCN0rmnX0Pwja5D"};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = (copyOfRange[i4] ^ i3) ^ 94;
            if (A01[0].length() != 30) {
                throw new RuntimeException();
            }
            A01[0] = "TD1mTFY2qo3QaoZPZEPw0mbH2R8uHE";
            copyOfRange[i4] = (byte) i5;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {20, BuiltinOptions.TileOptions, BuiltinOptions.PackOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.RandomOptions, BuiltinOptions.DequantizeOptions, 61, BuiltinOptions.RandomOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.TileOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.RandomOptions, 1, BuiltinOptions.MaximumMinimumOptions, 32, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.TileOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.ExpOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.DequantizeOptions, 20, 32, BuiltinOptions.TileOptions, 63, BuiltinOptions.ShapeOptions, 0, BuiltinOptions.TileOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.RandomOptions, Byte.MAX_VALUE, BuiltinOptions.RightShiftOptions, BuiltinOptions.GeluOptions, BuiltinOptions.WhileOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.ATan2Options, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.RangeOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.ATan2Options, BuiltinOptions.BroadcastToOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.Rfft2dOptions};
        if (A01[2].length() != 7) {
            throw new RuntimeException();
        }
        A01[5] = "Lq9CeCJTygMtbBn2m02oyI";
        A00 = bArr;
    }

    static {
        A01();
    }

    public static void A02(Surface surface, float f) {
        int compatibility;
        if (f == 0.0f) {
            compatibility = 0;
        } else {
            compatibility = 1;
        }
        try {
            surface.setFrameRate(f, compatibility);
        } catch (IllegalStateException e) {
            AnonymousClass44.A08(A00(35, 23, 69), A00(0, 35, 12), e);
        }
    }
}
