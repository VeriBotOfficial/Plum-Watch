package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public abstract class T0 {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 112);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{23, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.EqualOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.SignOptions, 21, BuiltinOptions.LogicalAndOptions, BuiltinOptions.SelectOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.LessOptions, BuiltinOptions.SliceOptions, BuiltinOptions.SignOptions, 30, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.EqualOptions, BuiltinOptions.SelectOptions, 34, BuiltinOptions.TileOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.SelectOptions, BuiltinOptions.LessOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.UnsortedSegmentMaxOptions, 32, BuiltinOptions.LogicalOrOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.PowOptions, 23, BuiltinOptions.PackOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.LessOptions, BuiltinOptions.LogicalOrOptions, 61, BuiltinOptions.PackOptions, 23, BuiltinOptions.PadV2Options, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.Rfft2dOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.SignOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.LessOptions, BuiltinOptions.PowOptions, 32, BuiltinOptions.EqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.PowOptions, 61, 6, BuiltinOptions.NegOptions, BuiltinOptions.SliceOptions, 35, BuiltinOptions.LogicalOrOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.SliceOptions, BuiltinOptions.CastOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.SliceOptions, 27, BuiltinOptions.SliceOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.LessOptions, BuiltinOptions.ExpOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.ArgMinOptions, 2, BuiltinOptions.LessEqualOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.PowOptions};
    }

    public static JSONObject A01(SQ sq, long j, long j2, long j3, long j4, int i, Exception exc) {
        JSONObject jSONObject = new JSONObject();
        try {
            try {
                jSONObject.put(A00(69, 10, 52), j);
                try {
                    jSONObject.put(A00(21, 8, 54), j2 / 1000.0d);
                    try {
                        jSONObject.put(A00(57, 12, 41), j3);
                        try {
                            jSONObject.put(A00(79, 11, 45), j4);
                        } catch (JSONException e) {
                            e = e;
                        }
                    } catch (JSONException e2) {
                        e = e2;
                    }
                } catch (JSONException e3) {
                    e = e3;
                }
            } catch (JSONException e4) {
                e = e4;
            }
        } catch (JSONException e5) {
            e = e5;
        }
        try {
            jSONObject.put(A00(34, 16, 56), i);
            if (exc != null) {
                jSONObject.put(A00(29, 5, 117), exc.getMessage());
            }
        } catch (JSONException e6) {
            e = e6;
            sq.A08().A4A(e);
            return jSONObject;
        }
        return jSONObject;
    }

    public static void A03(SQ sq, long j, long j2, long j3, long j4, int i, Exception exc) {
        C1842Sw c1842Sw = new C1842Sw(A00(0, 21, 43));
        c1842Sw.A05(1);
        c1842Sw.A07(A01(sq, j, j2, j3, j4, i, exc));
        sq.A08().ABZ(A00(50, 7, 124), AbstractC1841Sv.A20, c1842Sw);
    }
}
