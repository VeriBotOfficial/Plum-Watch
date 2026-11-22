package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.bx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC2143bx implements Runnable {
    public static byte[] A02;
    public final /* synthetic */ C2147c1 A00;
    public final /* synthetic */ String A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 97);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{13, BuiltinOptions.ExpOptions, BuiltinOptions.PackOptions, 34, BuiltinOptions.NegOptions, BuiltinOptions.HashtableSizeOptions, 32, BuiltinOptions.ExpOptions, 58, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.SelectOptions, BuiltinOptions.LogicalOrOptions, 61, BuiltinOptions.PadV2Options, BuiltinOptions.HashtableSizeOptions, 61, BuiltinOptions.PadV2Options, BuiltinOptions.LogicalOrOptions, BuiltinOptions.PowOptions, BuiltinOptions.PadV2Options, BuiltinOptions.LogicalOrOptions, BuiltinOptions.HashtableSizeOptions, 35, BuiltinOptions.PadV2Options, 61, 61, BuiltinOptions.SelectOptions, BuiltinOptions.LessOptions, BuiltinOptions.PadV2Options, BuiltinOptions.FloorModOptions, Byte.MAX_VALUE, Byte.MAX_VALUE, BuiltinOptions.SelectV2Options, Byte.MAX_VALUE, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.HashtableFindOptions, Byte.MAX_VALUE, BuiltinOptions.RightShiftOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.SquareOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.RightShiftOptions, BuiltinOptions.UnsortedSegmentSumOptions, 64, BuiltinOptions.BroadcastToOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.SquareOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.EqualOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.LogSoftmaxOptions, 34, BuiltinOptions.TransposeConvOptions, 15, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.TransposeConvOptions, 14, 3, 10, 31, 58, BuiltinOptions.LogicalOrOptions};
    }

    public RunnableC2143bx(C2147c1 c2147c1, String str) {
        this.A00 = c2147c1;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2126bg c2126bg;
        String str;
        C2126bg c2126bg2;
        if (AbstractC1907Vl.A02(this)) {
            return;
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(this.A01);
                str = this.A00.A05;
                if (str.equals(jSONObject.optString(A00(64, 7, 87)))) {
                    this.A00.A0C(EnumC2145bz.A00(jSONObject.optString(A00(81, 4, 27))), jSONObject.optString(A00(71, 10, 49), A00(85, 2, 32)));
                } else {
                    c2126bg2 = this.A00.A04;
                    c2126bg2.A04(AbstractC1841Sv.A11, A00(0, 30, 47));
                }
            } catch (JSONException e) {
                c2126bg = this.A00.A04;
                c2126bg.A04(AbstractC1841Sv.A15, A00(30, 34, 108) + e.getMessage());
            }
        } catch (Throwable th) {
            AbstractC1907Vl.A00(th, this);
        }
    }
}
